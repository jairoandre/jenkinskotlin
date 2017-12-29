package com.picpay

import org.junit.Test
import kotlin.test.assertEquals

class HelloTest {

    @Test
    fun testEnvVar() {
        val hello = Hello()
        hello.test()
    }

}
