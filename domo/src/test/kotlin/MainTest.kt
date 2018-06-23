package test

import org.junit.Test
import kotlin.test.assertEquals

class HelloTest{

    @Test
    fun helloWorldTest() {
        val string = main.helloWorld()
        assertEquals("Hello World!!!", string)
    }

    @Test
    fun helloWorldExTest() {
        val string = main.helloWorldExpression()
        assertEquals("Hello World", string)
    }
}