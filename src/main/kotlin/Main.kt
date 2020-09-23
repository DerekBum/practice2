class Smh(
    var a: Int
)

fun main(args: Array<String>) {
    //val a = readLine()
    val ans = Smh::class.java.getResource("count_git.txt")?.readText()
    if (ans != null)
        println(ans)
    else println("null")
}