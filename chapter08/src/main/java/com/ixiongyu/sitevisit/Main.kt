package com.ixiongyu.sitevisit

import sun.rmi.runtime.Log
import java.util.function.BiPredicate

/**
 * @author  xiongyu
 * @version Create at ：2020/9/3 下午10:24
 */

fun main() {
    val listOf = listOf(
            SiteVisit("/", Os.ANDROID, 12.0),
            SiteVisit("/index", Os.WIN, 11.0),
            SiteVisit("/login", Os.MAC, 2.0),
            SiteVisit("/", Os.LINUX, 1.0),
            SiteVisit("/index", Os.ANDROID, 123.0),
            SiteVisit("/", Os.ANDROID, 42.0),
            SiteVisit("/", Os.IOS, 1.0),
    )
    val averageDuration = listOf.averageDuration { siteVisit -> siteVisit.os in listOf(Os.ANDROID, Os.IOS) }
    println(averageDuration)
}

fun List<SiteVisit>.averageDuration(predicate: (SiteVisit) -> Boolean) = filter(predicate)
        .map(SiteVisit::duration).average()
