class User ( // 주 생성자
    val id: Int,
    val name: String
) {
    
    // 1. init 블록: 객체 생성 시 자동 실행
    init {
        println("Initializing User $name")
        require(name.isNotBlank())
    }
    
    // 2. 부 생성자 (보조)
    // 반드시 this()로 주 생성자를 호출해야 함.
    constructor(id: Int) : this(id, "Guest") {
        println("Secondary constructor")
    }
}

fun main() {
    // case1: 주 생성자 호출
    val u1 = User(1, "Kim") // "Initializing User Kim"

    // case2: 부 생성자 호출
    val u2 = User(2) // "Initializing User Guest" -> "Secondary constructor"

    println("${u2.name} (ID: ${u2.id})") // "Guest (ID:2)"
}