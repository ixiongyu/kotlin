package com.ixiongyu.constructor

/**
 * @author xiongyu
 * @version Create at ：2020/8/24 下午8:18
 */
class PornhubUser(val pNickName: String, override val head: String) : BaseUser {
    override var emailName: String = ""
        get() = super.emailName + "super"
        set(value: String) {
            println("emailName updated")
            field = value
        }

    override fun toString(): String = "PornhubUser(pNickName='$pNickName', head='$head')"
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PornhubUser

        if (pNickName != other.pNickName) return false
        if (head != other.head) return false

        return true
    }

    override fun hashCode(): Int {
        var result = pNickName.hashCode()
        result = 31 * result + head.hashCode()
        return result
    }


}
