package com.ixiongyu

import com.ixiongyu.main.Person
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import sun.text.normalizer.UTF16.append
import kotlin.text.StringBuilder

/**
 * @author  xiongyu
 * @version Create at ：2020/9/8 10:03 下午
 */


class TestKt {
    @get:Rule
    val folder = TemporaryFolder()

    @Test
    fun testUsingTemporaryFolder() {
        val newFile = folder.newFile("myFile.txt")
        println(newFile.absolutePath)
    }

    @Test
    fun testProperty() {
        val person = Person("xiongyu", 12)
        val property = Person::age
        println(property.get(person))
    }


    @Test
    fun testTuildString() {
        println(myBuildString("213"))
        println(alphabet())
    }

    fun myBuildString(string: String): String = buildString(fun(stringBuilder: StringBuilder) {
        stringBuilder.append(string)
    })

    fun alphabet() = buildString {
        for (letter in 'A'..'Z') {
            append(letter)
        }
    }
}
