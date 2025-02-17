package model

import java.time.LocalDate
import java.time.LocalDateTime

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

private  fun createSeats(rows: Int, columns: Int): List<List<Seat>> {
    val seats = mutableListOf<List<Seat>>()
    for (i in 1..rows) {
        val row = mutableListOf<Seat>()
        for (j in 1..columns) {
            row.add(Seat("seat_$i-$j", i, j, false))
        }
        seats.add(row)
    }
    return seats
}

class MovieFunction(
    val id: String,
    val movie: Movie,
    movieRoom: MovieRoom,
    val date: LocalDateTime,
) {
    var seats = createSeats(movieRoom.rows, movieRoom.columns)
    var name = movieRoom.name
}