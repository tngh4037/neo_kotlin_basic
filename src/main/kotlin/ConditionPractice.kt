fun main(args: Array<String>) {
    println(gradeOf(95)) // A
    println(greet(14)) // Good Afternoon
}

fun gradeOf(score: Int): String {
    return when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "F"
    }
}

fun greet(hour: Int): String {
    return if (hour in 0..11) {
        "Good Morning"
    } else if (hour in 12..15) {
        "Good Afternoon"
    } else {
        "Good Night"
    }
}