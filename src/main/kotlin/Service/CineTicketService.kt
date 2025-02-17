package Service

import model.*
import java.time.LocalDate
import java.time.LocalDateTime

class CineTicketService {
    private val idGenerator = IdGenerator()
    val genres = mutableListOf<String>()
    val movies = mutableListOf<Movie>()
    val moviesRoom = mutableListOf<MovieRoom>()
    val users = mutableListOf<User>()
    val movieFunctions = mutableListOf<MovieFunction>()

    fun login(email: String, password: String): User {
        return users.find { it.email == email && it.password == password } ?: throw CineException("User not found")
    }

    fun register(name: String, email: String, password: String): User {
        if (name.isBlank() || email.isBlank() || password.isBlank()) {
            throw CineException("Invalid user data")
        }
        if (users.any { it.email == email }) {
            throw CineException("User already exists")
        }
        val user = User(idGenerator.nextUserId(), name, email, password, if (users.isEmpty()) UserRole.Admin else UserRole.User)
        users.add(user)
        return user
    }

    fun getUser(userId: String): User {
        return users.find { it.id == userId } ?: throw CineException("User not found")
    }

    fun getMovie(movieId: String): Movie {
        return movies.find { it.id == movieId } ?: throw CineException("Movie not found")
    }

    private fun getMovieRoom(movieRoomId: String): MovieRoom {
        return moviesRoom.find { it.id == movieRoomId } ?: throw CineException("Movie room not found")
    }

    fun createMovieRoom(name: String, row: Int, column: Int): MovieRoom {
        val movieRoom = MovieRoom(idGenerator.nextMovieRoomId(), name, row, column)
        moviesRoom.add(movieRoom)
        return movieRoom
    }

    fun createMovie(title: String, description: String, poster: String, releaseDate: LocalDate, genre: List<String>): Movie {
        if (title.isBlank() || description.isBlank() || poster.isBlank() || genre.isEmpty()) {
            throw CineException("Invalid movie data")
        }
        val movie = Movie(idGenerator.nextMovieId(), title, description, poster, releaseDate, genre)
        if (genre.any { !genres.contains(it) }) {
            throw CineException("Genre not found")
        }
        movies.add(movie)
        return movie
    }

    fun createMovieFunction(movieId: String, movieRoomId: String, date: LocalDateTime): MovieFunction {
        val movie = getMovie(movieId)
        val movieRoom = getMovieRoom(movieRoomId)
        val movieFunction = MovieFunction(idGenerator.nextMovieFunctionId(), movie, movieRoom, date)
        movieFunctions.add(movieFunction)
        return movieFunction
    }

    fun getMovies(page: Int): Page<Movie> {
        return getPage(movies, page)
    }

    fun getFunctionsByMovie(movieId: String, page: Int): Page<MovieFunction> {
        return getPage(movieFunctions.filter { it.movie.id == movieId }, page)
    }

    fun getReleasedMovies(page: Int): Page<Movie> {
        return getPage(movies.filter { it.releaseDate.isBefore(LocalDate.now()) }, page)
    }

    fun getFunctions(page: Int): Page<MovieFunction> {
        return getPage(movieFunctions, page)
    }

    fun purchase(userId: String, movieFunctionId: String, seatId: List<String>): Purchase {
        val user = getUser(userId)
        val movieFunction = movieFunctions.find { it.id == movieFunctionId } ?: throw CineException("Movie function not found")
        val seats = movieFunction.seats.flatten().filter { seatId.contains(it.id) }
        if (seats.any { it.isReserved }){
            throw CineException("Seat is already reserved")
        }
        seats.forEach { it.isReserved = true }
        val purchase = Purchase(idGenerator.nextPurchaseId(), movieFunction.movie, movieFunction, user, seats, LocalDate.now())
        user.history.add(purchase)
        return purchase
    }

    fun addGenre(genre: String): String {
        genres.add(genre)
        return genre
    }
}