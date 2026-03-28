fun main() {
    println(calc(a = 1, op = "+", b = 2)) // 3
    println(calc(op = "*", a = 2, b = 2)) // 4
}

fun calc(op: String, a: Int, b: Int): Int {
    return when(op) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        "%" -> a % b
        else -> 0
    }
}