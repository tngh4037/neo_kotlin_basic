// ===== [함수 선언] =====
// 1) 일반적인 함수 선언
fun add(a: Int, b: Int): Int {
    return a + b
}

// 2) 단일 표현식 함수 (간결함)
fun sub(a: Int, b: Int) = a - b

// 3) 람다 표현식
val mul = {x: Int, y: Int -> x * y}

// ===== [고급 활용 (Default & Named)] =====
// 1) 기본값 (Default Arguments)
fun log(msg: String, level: String = "INFO") {
    println("[$level] $msg")
}

fun main() {
    // [함수 호출]
    // 1) 일반 호출 (기본값 사용)
    log("Server started")

    // 2) 네임드 아규먼트 (Named Arguments)
    // 순서 무관, 가독성 향상
    log(
        level="WARN",
        msg="Disk almost full"
    )
}
