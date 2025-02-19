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

    /**
     * Retrieves a user by email and password.
     * @param email The user's email.
     * @param password The user's password.
     * @return The user.
     * @throws CineException if the user is not found.
     */
    fun login(email: String, password: String): User {
        return users.find { it.email == email && it.password == password } ?: throw CineException("User not found")
    }

    /**
      * Registers a new user.
      * @param name The user's name.
      * @param email The user's email.
      * @param password The user's password.
      * @return The new user.
      * @throws CineException if the user data is invalid or the user already exists.
    */
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

    /**
      * Retrieves a user by id.
      * @param userId The user's id.
      * @return The user.
      * @throws CineException if the user is not found.
    */
    fun getUser(userId: String): User {
        return users.find { it.id == userId } ?: throw CineException("User not found")
    }

    /**
      * Retrieves a movie by id.
      * @param movieId The movie's id.
      * @return The movie.
      * @throws CineException if the movie is not found.
    */
    fun getMovie(movieId: String): Movie {
        return movies.find { it.id == movieId } ?: throw CineException("Movie not found")
    }

    /**
      * Retrieves a movie room by id.
      * @param movieRoomId The movie room's id.
      * @return The movie room.
      * @throws CineException if the movie room is not found.
    */
    private fun getMovieRoom(movieRoomId: String): MovieRoom {
        return moviesRoom.find { it.id == movieRoomId } ?: throw CineException("Movie room not found")
    }

    /**
      * Create a movie room with the given name, row and column.
      * @param name The movie room's name.
      * @param row The movie room's row.
      * @param column The movie room's column.
      * @return The new movie room.
    */
    fun createMovieRoom(name: String, row: Int, column: Int): MovieRoom {
        val movieRoom = MovieRoom(idGenerator.nextMovieRoomId(), name, row, column)
        moviesRoom.add(movieRoom)
        return movieRoom
    }

    /**
      * Create a movie
      * @param title The movie's title.
      * @param description The movie's description.
      * @param poster The movie's poster.
      * @param releaseDate The movie's release date.
      * @param genre The movie's genre.
      * @return The new movie.
      * @throws CineException if the movie data is invalid or the genre is not found.
    */
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

    /**
      * Create a movie function
      * @param movieId The movie's id.
      * @param movieRoomId The movie room's id.
      * @param date The movie function's date.
      * @return The new movie function.
      * @throws CineException if the movie or movie room is not found.
    */
    fun createMovieFunction(movieId: String, movieRoomId: String, date: LocalDateTime): MovieFunction {
        val movie = getMovie(movieId)
        val movieRoom = getMovieRoom(movieRoomId)
        val movieFunction = MovieFunction(idGenerator.nextMovieFunctionId(), movie, movieRoom, date)
        movieFunctions.add(movieFunction)
        return movieFunction
    }

    /**
      * Retrieves a page of Movie function.
      * @param movieId The movie's id.
      * @param page The page number.
      * @return The page of movie functions.
     */
    fun getFunctionsByMovie(movieId: String, page: Int): Page<MovieFunction> {
        return getPage(movieFunctions.filter { it.movie.id == movieId }, page)
    }

    /**
      * Retrieves a page of Movies.
      * @param page The page number.
      * @return The page of movies.
     */
    fun getReleasedMovies(page: Int): Page<Movie> {
        return getPage(movies.filter { it.releaseDate.isBefore(LocalDate.now()) }, page)
    }

    /**
      * Retrieves a page of functions.
      * @param page The page number.
      * @return The page of functions.
     */
    fun getFunctions(page: Int): Page<MovieFunction> {
        return getPage(movieFunctions, page)
    }

    /**
      * Retrieves a Movie function.
      * @param movieId The movie's id.
      * @param functionId The function's id.
      * @return The movie function.
      * @throws CineException if the movie function is not found.
     */
    fun getFunctionByMovieAndId(movieId: String, functionId: String): MovieFunction {
        return movieFunctions.find { it.movie.id == movieId && it.id == functionId } ?: throw CineException("Movie function not found")
    }

    /**
      * Create a purchase
      * @param userId The user's id.
      * @param movieFunctionId The movie function's id.
      * @param seatId The seat's id.
      * @return The new purchase.
      * @throws CineException if the movie function is not found or the seat is already reserved.
    */
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

    /**
      * Create a genre
      * @param genre The genre.
      * @return The new genre.
    */
    fun addGenre(genre: String): String {
        genres.add(genre)
        return genre
    }
}