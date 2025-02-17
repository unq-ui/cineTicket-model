package model


class IdGenerator {
    private var currentUserId = 0
    private var currentMovieId = 0
    private var currentPurchaseId = 0
    private var currentMovieRoomId = 0
    private var currentMovieFunctionId = 0

    fun nextUserId(): String = "u_${++currentUserId}"
    fun nextMovieId(): String = "m_${++currentMovieId}"
    fun nextPurchaseId(): String = "p_${++currentPurchaseId}"
    fun nextMovieRoomId(): String = "mr_${++currentMovieRoomId}"
    fun nextMovieFunctionId(): String = "mf_${++currentMovieFunctionId}"
}