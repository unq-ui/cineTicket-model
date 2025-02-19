# UNQ » UIs » Dominio » Cine tickets
[![](https://jitpack.io/v/unq-ui/cineTicket-model.svg)](https://jitpack.io/#unq-ui/cineTicket-model)

Construcción de Interfaces de Usuario, Universidad Nacional de Quilmes.

### Dependencia

Agregar el repositorio:

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

Agregar la dependencia:

```xml
<dependency>
    <groupId>com.github.unq-ui</groupId>
    <artifactId>cineTicket-model</artifactId>
    <version>v1.2.1</version>
</dependency>
```

### Interfaz de uso

```kotlin
class CineTicketService {
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
    fun login(email: String, password: String): User

    /**
      * Registers a new user.
      * @param name The user's name.
      * @param email The user's email.
      * @param password The user's password.
      * @return The new user.
      * @throws CineException if the user data is invalid or the user already exists.
    */
    fun register(name: String, email: String, password: String): User

    /**
      * Retrieves a user by id.
      * @param userId The user's id.
      * @return The user.
      * @throws CineException if the user is not found.
    */
    fun getUser(userId: String): User

    /**
      * Retrieves a movie by id.
      * @param movieId The movie's id.
      * @return The movie.
      * @throws CineException if the movie is not found.
    */
    fun getMovie(movieId: String): Movie

    /**
      * Retrieves a movie room by id.
      * @param movieRoomId The movie room's id.
      * @return The movie room.
      * @throws CineException if the movie room is not found.
    */
    private fun getMovieRoom(movieRoomId: String): MovieRoom

    /**
      * Create a movie room with the given name, row and column.
      * @param name The movie room's name.
      * @param row The movie room's row.
      * @param column The movie room's column.
      * @return The new movie room.
    */
    fun createMovieRoom(name: String, row: Int, column: Int): MovieRoom

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
    fun createMovie(title: String, description: String, poster: String, releaseDate: LocalDate, genre: List<String>): Movie

    /**
      * Create a movie function
      * @param movieId The movie's id.
      * @param movieRoomId The movie room's id.
      * @param date The movie function's date.
      * @return The new movie function.
      * @throws CineException if the movie or movie room is not found.
    */
    fun createMovieFunction(movieId: String, movieRoomId: String, date: LocalDateTime): MovieFunction

    /**
      * Retrieves a page of Movie function.
      * @param movieId The movie's id.
      * @param page The page number.
      * @return The page of movie functions.
     */
    fun getFunctionsByMovie(movieId: String, page: Int): Page<MovieFunction>

    /**
      * Retrieves a page of Movies.
      * @param page The page number.
      * @return The page of movies.
     */
    fun getReleasedMovies(page: Int): Page<Movie>

    /**
      * Retrieves a page of functions.
      * @param page The page number.
      * @return The page of functions.
     */
    fun getFunctions(page: Int): Page<MovieFunction>

    /**
      * Retrieves a Movie function.
      * @param movieId The movie's id.
      * @param functionId The function's id.
      * @return The movie function.
      * @throws CineException if the movie function is not found.
     */
    fun getFunctionByMovieAndId(movieId: String, functionId: String): MovieFunction

    /**
      * Create a purchase
      * @param userId The user's id.
      * @param movieFunctionId The movie function's id.
      * @param seatId The seat's id.
      * @return The new purchase.
      * @throws CineException if the movie function is not found or the seat is already reserved.
    */
    fun purchase(userId: String, movieFunctionId: String, seatId: List<String>): Purchase

    /**
      * Create a genre
      * @param genre The genre.
      * @return The new genre.
    */
    fun addGenre(genre: String): String
}
```

### Iniciar el sistema con datos

```kotlin
val service = data.initSystem()
```

[Ver usuarios del sistema](https://github.com/unq-ui/cineTicket-model/blob/main/src/main/kotlin/data/Users.kt)

### Modelo

```kotlin
class Movie(
    val id: String,
    val title: String,
    val description: String,
    val poster: String,
    val releaseDate: LocalDate,
    val genre: List<String>
)

class MovieRoom(
    val id: String,
    val name: String,
    val rows: Int,
    val columns: Int,
)

class Seat(
    val id: String,
    val row: Int,
    val column: Int,
    var isReserved: Boolean
)

enum class UserRole {
    Admin,
    User,
}

class User(
    val id: String,
    val name: String,
    val email: String,
    var password: String,
    val role: UserRole,
    val history: MutableList<Purchase> = mutableListOf()
)

class Purchase(
    val id: String,
    val movie: Movie,
    val movieFunction: MovieFunction,
    val user: User,
    val seats: List<Seat>,
    val date: LocalDate
)

class MovieFunction(
    val id: String,
    val movie: Movie,
    movieRoom: MovieRoom,
    val date: LocalDateTime,
) {
    var seats = createSeats(movieRoom.rows, movieRoom.columns)
    var name = movieRoom.name
}
```

* El CineTicketService es el encargado de setear los ids de cada elemento que se agrega el sistema.
