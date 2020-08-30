package com.ixiongyu.nulls

/**
 * @author  xiongyu
 * @version Create at ：2020/8/30 下午8:24
 */
fun main() {

    val email: String? = "ixiongyu@gamil.com"
    //    Type mismatch.Required:String  Found:String?
//    sendMail(email)

    email?.let { email -> sendMail(email) }
}

fun sendMail(emailAddress: String) {

    println("send mail to $emailAddress")
}
