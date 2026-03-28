open class ShapeParent {
    open fun area(): Double = 0.0
}

class Circle(val r: Double) : ShapeParent() { // 참고) 상속이나 구현시 콜론(:)으로 표기
    override fun area(): Double {
        return 3.14 * r * r
    }
}

class Triangle(val w: Double, val h: Double) : ShapeParent() {
    override fun area(): Double {
        return (w * h) / 2
    }
    // 다음과 같이 한줄로 간략히 작성 가능
    // override fun area(): Double = (w * h) / 2
}

fun main() {
    val shapes: List<ShapeParent> = listOf(
        Circle(10.0),
        Triangle(10.0, 10.0)
    )

    shapes.forEach {
        println(it.area())
    }
}

/* 출력결과
314.0
50.0
*/