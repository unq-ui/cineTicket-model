package data

import Service.CineTicketService
import model.Seat
import java.time.LocalDate
import kotlin.random.Random

val random = Random(100);

fun getHour(): Int {
    return random.nextInt(0, 24)
}



private fun createRooms(service: CineTicketService) {
    service.createMovieRoom("Room 1", 6, 8)
    service.createMovieRoom("Room 2", 7, 8)
    service.createMovieRoom("Room 3", 7, 8)
    service.createMovieRoom("Room 4", 7, 8)
    service.createMovieRoom("BigRoom 1", 10, 10)
    service.createMovieRoom("BigRoom 2", 10, 10)
}

private fun createDate(date: String): LocalDate {
    val parts = date.split("-")
    return LocalDate.of(parts[0].toInt(), parts[1].toInt(), parts[2].toInt())
}

private fun createMovies(service: CineTicketService) {
    movies.forEach { movie ->
        service.createMovie(movie.title, movie.description, movie.poster, createDate(movie.releaseDate), movie.genre)
    }
}

private fun createFunctions(service: CineTicketService) {
    service.movies.forEach { movie ->
        service.moviesRoom.shuffled(random).take(4).forEach { room ->
            service.createMovieFunction(movie.id, room.id, LocalDate.now().atTime(getHour(), 0))
        }
        service.moviesRoom.shuffled(random).take(4).forEach { room ->
            service.createMovieFunction(movie.id, room.id, LocalDate.now().plusDays(1).atTime(getHour(), 0))
        }
        service.moviesRoom.shuffled(random).take(4).forEach { room ->
            service.createMovieFunction(movie.id, room.id, LocalDate.now().plusDays(2).atTime(getHour(), 0))
        }
    }
}

private fun createUsers(service: CineTicketService) {
    allUsers.forEach {
        service.register(it.firstName, it.email, it.password)
    }
}

private fun addPurchases(service: CineTicketService) {
    service.users.forEach { user ->
        service.movieFunctions.shuffled(random).take(3).forEach { function ->
            val seats = function.seats.flatten().filter { !it.isReserved }.shuffled(random).take(3).map { it.id }
            service.purchase(user.id, function.id, seats)
        }
    }
}

private fun addGenres(service: CineTicketService) {
    movies.map { it.genre }.flatten().distinct().forEach {
        service.addGenre(it)
    }
}

fun initSystem(): CineTicketService{
    val service = CineTicketService()
    service.register("admin", "admin@gmail.com", "admin");
    createRooms(service)
    addGenres(service)
    createMovies(service)
    createFunctions(service)
    createUsers(service)
    addPurchases(service)
    return service
}

fun main() {
    initSystem()
}