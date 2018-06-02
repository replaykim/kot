package main



//함수 정의
fun helloWorld() : String {
    return "Hello World!!!"
}

//함수 표현식
fun helloWorldExpression() = "Hello World"

fun main(args : Array<String>) : Unit {
    println(helloWorld())
    println(helloWorldExpression())
}