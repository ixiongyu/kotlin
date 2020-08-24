package com.ixiongyu.constructor

/**
 * @author  xiongyu
 * @version Create at ：2020/8/24 下午8:10
 */
fun main(args: Array<String>) {
    User("nickname");
    val twitterUser = TwitterUser();
    println(twitterUser.emailName)
    println(twitterUser.head)

    val pornhubUser = PornhubUser("xx", "head");
    println(pornhubUser.emailName)
    println(pornhubUser.head)
    pornhubUser.emailName = "12121"


    val client = Client("xiongyu", "code")
    println(client)
    val copy = client.copy(code = "new code")
    println(client)
    println(copy)
}
