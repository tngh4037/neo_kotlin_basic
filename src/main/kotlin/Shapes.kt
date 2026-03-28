// 1. 부모 클래스 (상속시 open 필수)
open class Shape {
    // 재정의 허용 메서드
    open fun area(): Double = 0.0
}

// 2. 자식 클래스 (상속)
class Rect (
    val w: Double,
    val h: Double
) : Shape() {

    // 3. 메서드 재정의
    override fun area(): Double {
        return w * h
    }

    override fun toString(): String = "Rect($w, $h)"
}

fun main() {
    // 부모 타입으로 자식 객체 참조 (다형성)
    val s: Shape = Rect(3.0, 4.0)

    // 다형성 동작 (Rect 의 area 호출)
    println("Area: ${s.area()}") // Area: 12.0

    // Any의 toString() 재정의 확인
    println(s.toString()) // Rect(3.0, 4.0)
}