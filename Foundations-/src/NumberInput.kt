fun main() {
    eval()
}

fun eval() {
    print("Enter a number: ")
    val input = readln().toIntOrNull()
    if (input != null) {
        when {
            input > 0 -> println("$input is positive.")
            input < 0 -> println("$input is negative.")
            true -> println("$input is 0")
        }

        when {
            input % 2 == 0 -> println("$input is even.")
            input % 2 != 0 -> println("$input is odd.")
        }
        when {
            input in 1..100 -> println("$input is between 1 and 100")
            input !in 1..100 -> println("$input is not between 1 and 100")
        }
    }else{println("Input is null. try again")}
}