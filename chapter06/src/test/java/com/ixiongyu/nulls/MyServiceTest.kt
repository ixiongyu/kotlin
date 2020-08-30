package com.ixiongyu.nulls


import org.testng.annotations.BeforeTest
import org.testng.annotations.Test
import kotlin.test.assertEquals


/**
 * @author  xiongyu
 * @version Create at ：2020/8/30 下午8:37
 */
open class MyServiceTest {

    private var myService: MyService? = null
    private lateinit var myServiceLateInit: MyService

    @BeforeTest
    fun setUp() {
        myService = MyService()
        myServiceLateInit = MyService()
    }

    @Test
    open fun testAction() {
        assertEquals("foo", myService!!.performAction())
        assertEquals("foo", myServiceLateInit.performAction())


    }
}
