package cinemaRoomManager

fun main() {

    println("Enter the number of rows:")
    val rows = readLine()!!.toInt()
    println("Enter the number of seats in each row:")
    val numberSeatsInEachRow = readLine()!!.toInt()
    val myCinema = CinemaRoom(rows, numberSeatsInEachRow)
    myCinema.mainMenu()
}