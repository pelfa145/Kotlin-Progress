fun main() {
    start()
}

fun start() {

    //initializing variables
    var math: Int
    var science: Int
    var english: Int
    var status: String
    var remarks: String
    println("==Grade Evaluator==")
    print("Input your name: ")
    val name = readln()
    while (true) {
        print("Input your Math grade: ")
        try {
            math = readln().toInt()
        } catch (e: NumberFormatException) {
            println("Null"); continue
        }
        print("Input your Science grade: ")
        try {
            science = readln().toInt()
        } catch (e: NumberFormatException) {
            println("Null"); continue
        }
        print("Input your English grade: ")
        try {
            english = readln().toInt()
        } catch (e: NumberFormatException) {
            println("Null"); continue
        }
        if (math !in 0..100|| science !in 0..100 || english !in 0..100){
            println("Grades must be between 0 and 100.")
            return
        }
        break
    }

    val average = (math.toDouble() + science.toDouble() + english.toDouble()) / 3.0
    when {
        average >= 75 -> status = "Passed"
        else -> status = "Failed"
    }
    when {
        average >= 95 -> remarks = "Outstanding"
        average >= 90 -> remarks = "Very Good"
        average >= 80 -> remarks = "Good"
        average >= 75 -> remarks = "Fair"
        else -> remarks = "Bad"
    }
    println("==Grade Evaluator==\n\nName: $name\nMath: $math\nScience: $science\nEnglish: $english\n\nAverage: $average\nStatus: $status\nRemarks: $remarks.")


}