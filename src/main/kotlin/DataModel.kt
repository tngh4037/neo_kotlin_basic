// 1. Data Class 선언 (DTO 역할)
data class Person(val id: Int, val name: String)

fun main() {
    // 2. 객체 생성 및 Copy
    val p1 = Person(1, "Kim")
    // id는 유지하고, name만 변경하여 복사
    val p2 = p1.copy(name = "Lee")
    println(p1 === p2) // false

    // 3. 구조 분해 선언 (Destructuring)
    val (id, nm) = p2
    println("ID: $id, Name: $nm") // ID: 1, Name: Lee
}