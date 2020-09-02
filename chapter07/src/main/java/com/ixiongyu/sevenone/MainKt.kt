package com.ixiongyu.sevenone

import java.math.BigDecimal
import java.time.LocalDate
import kotlin.properties.Delegates

/**
 * === 检查是否是同一个对象的引用 和Java中的==相同
 * == 检查值是否相等 类型Java中的equals类似
 * @author xiongyu
 * @version Create at ：2020/8/31 下午9:19
 */
fun main() {
    val plus = Point(1, 2).plus(Point(2, 3))
    println(plus)
    var point = Point(3, 4)
    point += Point(4, 5)
    println(plus + point)
    val arrayList = ArrayList<Int>()
    arrayList += 1;
    arrayList += 2;
    println(arrayList.toString())
    arrayList -= 1
    println(arrayList.toString())
    arrayList -= -1
    println(arrayList.toString())
    var zero = BigDecimal.ZERO
    zero.inc()
    println(zero++);
    println(++zero)

    val(x,y)=plus;
    println(x)
    println(y)

    val newYear = LocalDate.ofYearDay(2020, 1)
    val daysOff = newYear.minusDays(1)..newYear
    for (localDate in daysOff) {
        println(localDate)
    }

}

operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
        object : Iterator<LocalDate> {
            var current = start
            override fun hasNext(): Boolean {
                return current <= endInclusive
            }

//            override fun next(): LocalDate {
//                return current.plusDays(1)
//            }


            override fun next(): LocalDate {
                return current.apply(fun LocalDate.() {
                    current = plusDays(1)
                })
            }

        }
