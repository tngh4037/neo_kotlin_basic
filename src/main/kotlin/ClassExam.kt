data class Human(
    val id: Int,
    val name: String
)

enum class HumanLevel {
    LOW, MEDIUM, HIGH
}

fun advise(l: HumanLevel): String = when(l) {
    HumanLevel.LOW -> "Low"
    HumanLevel.MEDIUM -> "Medium"
    HumanLevel.HIGH -> "High"
}

fun main() {
    val p1 = Human(1, "Kim")
    println(p1) // Human(id=1, name=Kim)

    val p2 = p1.copy()
    println(p2) // Human(id=1, name=Kim)

    println(p1 == p2) // true
    println(p1 === p2) // false

    val (id, name) = p2
    println("$id, $name") // 1, Kim

    val level = HumanLevel.HIGH
    println(advise(level)) // High
}