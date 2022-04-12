package cinemaRoomManager

data class Seats(
    var row: Int,
    var numberSeats: Int,
    var ticket: Char,
    var price: Int,
    var status: Boolean
) {
    operator fun invoke(k: Int, i: Int, ch: Char, p: Int, b: Boolean) {
        row = k
        numberSeats = i
        ticket = ch
        price = p
        status = b
    }
}
