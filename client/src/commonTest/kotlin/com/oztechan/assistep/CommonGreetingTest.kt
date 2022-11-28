package com.oztechan.assistep

import kotlin.test.Test
import kotlin.test.assertTrue


class CommonGreetingTest {

    @Test
    fun testExample() {
        assertTrue(Greeting().greet().contains("Hello"), "Check 'Hello' is mentioned")
    }
}
