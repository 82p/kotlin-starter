/**
 * Created by HNYIns13 on 2017/06/21.
 */
class Helloworld(greeting: String) {
    //コンストラクタが色々かけるみたい

    val greeting = greeting

    init {
        println(greeting)
    }

    fun greet(name: String) {
        println(greeting + " " + name)
    }
}
fun main(args: Array<String>) {
    val hello = Helloworld("こんにちは")
    hello.greet("Kotlin")

    val javaclazz = MyJavaClass("hoge");

    //getメソッドは自動でメンバで呼び出せるようになるみたい
    println(javaclazz.hoge)
}
