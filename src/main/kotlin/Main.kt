fun main(args: Array<String>) {
    val name: String = "Kotlin Student"
    val heightCm: Double = 175.5
    val weightKg = 72.0

    val heightM = heightCm / 100
    val bmi = weightKg * (heightM * heightM)

    println("내 bmi: $bmi")
    println("내 bmi: ${bmi}입니다.")

    val name2: String? = null
    print(name2?:"나는 익명") // null인 경우, "나는 익명" 출력
    print(name2?.length ?: 0) // null 인 경우 0, null 이 아닌 경우 length
}