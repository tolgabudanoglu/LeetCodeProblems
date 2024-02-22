package LeetCode.kotlin

// string yazıdaki G -> G
//() -> o
//(al) -> al değiştirip tekrar yazacak.
fun main() {

}

fun interpret(command: String): String {

    return command.replace("()", "o")
        .replace("(al)", "al")

}