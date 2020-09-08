package com.ixiongyu

import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

/**
 * @author  xiongyu
 * @version Create at ：2020/9/8 10:03 下午
 */


class TestKt {
    @get:Rule
    val folder=TemporaryFolder()

    @Test fun testUsingTemporaryFolder(){
        val newFile = folder.newFile("myFile.txt")
        println(newFile.absolutePath)
    }
}
