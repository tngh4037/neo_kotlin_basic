fun main(args: Array<String>) {
    // [산술 & 증감 연산]
    // 1) 복잡 대입 및 증감
    var x = 10
    x += 5

    val y = x++ // 15
    val z = ++x // 17

    // 2) 정수 vs 실수 나눗셈
    println(10 / 3) // 3 (Int / Int = Int)
    println(10.0 / 3) // 3.333... (Double / Int = Double)

    // 3) 나머지 연산
    println(10 % 3) // 1

    // [비교 & 논리 연산]
    // 1) 동등성 비교 (==, ===)
    val a = "hi"
    val b = "h" + "i"
    println(a == b) // true ( 값 비교 )
    println(a === b) // false 일 수 있음. ( 참조 비교 )

    // 2) 논리 연산
    val check = (5 > 3) && (2 > 1)
    println(!check) // false

    // 3) 범위 연산자 (in)
    val score = 85
    println(score in 0..100) // true

    val p1 = Point(3, 4)
    val p2 = Point(1, 2)

    val p3 = p1 + p2
    println(p3) // Point(x=4, y=6)

    val p4 = Point(3, 4)
    val p5 = Point(3, 4)
    println(p4 == p5) // true
    println(p4 === p5) // false
}

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point { // 재정의
        return Point(x + other.x, y + other.y)
    }
}