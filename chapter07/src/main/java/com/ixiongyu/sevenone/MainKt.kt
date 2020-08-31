package com.ixiongyu.sevenone

import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime

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


}

operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
        object : Iterator<LocalDate> {
            var current = start;
            override fun hasNext(): Boolean {
                return current <= endInclusive
            }

//            override fun next(): LocalDate {
//               return current=current.plusDays(1)
//            }


            override fun next(): LocalDate {
                return current.apply {
                    current = plusDays(1)
                }
            }

        }
