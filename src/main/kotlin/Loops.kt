fun main(args: Array<String>) {
    // [기본 반복문]
    // 1. 범위 반복 (Range)
    for (i in 1..5) {
        print("$i") // 1 2 3 4 5
    }

    // 2. 역순 및 간격 제어
    for (i in 10 downTo 0 step 2) {
        print("$i") // 10 8 6 4 2 0
    }

    // 3. While & Do-While
    var n = 3
    while (n > 0) { n-- }

    do {
        println("최소 1번은 본문 실행")
    } while (false)

    // [흐름 제어]
    // 4. 중첩 루프와 라벨(Label)
    outer@ for (i in 1..3) {
        for (j in 1..3) {
            // 조건 만족 시 외부 루프까지 탈출
            if (i * j == 6) break@outer

            println("i:$i, j:$j")
        }
    }

    // 5. continue
    for (k in 1..5) {
        if (k % 2 == 0) continue

        print(k) // 1 3 5
    }
}
