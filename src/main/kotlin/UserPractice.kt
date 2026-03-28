class UserPractice(
    val id: Int,
    val name: String
) {
    init {
        println("User created | UserId: $id")
    }

    constructor(id: Int) : this(id, name = "Guest") {
        println("Sub User Constructor")
    }
}

fun main() {
    val u1 = UserPractice(1, "Dummy")
    val u2 = UserPractice(2)

    println("${u1.name}, ${u2.name}")
}

/*
// 실행결과
User created | UserId: 1
User created | UserId: 2
Sub User Constructor
Dummy, Guest
*/