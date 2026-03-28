fun main(args: Array<String>) {
    // 1. 값을 반환하는 if (삼항연산자 대체)
    val a: Int = 5;
    val b = 10;
    val max = if (a > b) a else b
    println(max) // 10

    // 2. 블록 사용시 마지막 줄이 반환값이 된다.
    val result = if (a >= 5) {
        println("pass")
        "P"
    } else {
        println("fail")
        "F"
    }
    println(result) // P

    // 3. switch 대체, 더 강력한 기능
    val score: Int = 80
    val grade = when (score) {
        100 -> "Perfect"
        in 90..99 -> "A"
        in 80 .. 89 -> "B"
        else -> "C"
    }
    println(grade) // B

    // 타입 검사 (Smart Cast)
    fun check(x: Any) = when(x) {
        is String -> "Text length: ${x.length}"
        is Int -> "Number: $x"
        else -> "Unknown"
    }
    println(check(50)) // Number: 50

    val fruits = listOf("banana", "avocado", "apple", "orange")
    for (fruit in fruits) {
        print(fruit)
    }
}