fun main(){
    eval()
    }
fun eval(){
    print("Enter a number: ")
    val input = readln().toInt()

    when {
        input > 0 -> println("$input is positive")
        input % 2 == 0 -> println("$input is even")
        input >= 1 && input <= 100 -> println("$input is between 1 and 100.")
    }
}