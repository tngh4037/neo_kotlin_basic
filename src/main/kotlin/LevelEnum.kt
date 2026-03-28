// 1. Enum Class 선언
enum class Level {LOW, MEDIUM, HIGH}

// 2. Enum 과 When 조합 (강력한 타입 체크)
fun advise(l: Level) = when(l) {
    Level.LOW -> "Everything OK"
    Level.MEDIUM -> "Watch closely"
    Level.HIGH -> "Alert!"
    // 모든 케이스를 위에서 전부 다룬 경우라면, else 불필요
}