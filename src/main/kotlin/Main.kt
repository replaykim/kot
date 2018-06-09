package main



//함수 정의
fun helloWorld() : String {
//    val cantnull :String = null;  // 컴파일 에러!
    val elvis :String? = null;

    val  size = elvis?.length;  //elvis 연산자를 붙여야함
//    elvis.equals()

    val hello : String = "Hello World!!!"
    var helloVar = "hello World!!!"

//    hello = "Hello" //컴파일 에러!
    helloVar = "Hello"

    println("${hello} JH!")

    return "Hello World!!!"
}

//함수 표현식
fun helloWorldExpression() = "Hello World"

fun autoCasting(obj : Any) : Int {
    if (obj is String) {
        return obj.length;
    }
    return 0;
}

//itetrator
fun forEach() {
    val numbers = listOf(1,2,3,4,5,6)

    for (number in numbers) {
        println(number + 100)
        println("$number")
    }

    for (i in numbers.indices) {
        println(i)
        println("${numbers[i]}")
    }
}

fun main(args : Array<String>) : Unit {
    forEach();

//    println(autoCasting("Hello"))
//    println(autoCasting(123))

//    println(helloWorld())
//    println(helloWorldExpression())
}