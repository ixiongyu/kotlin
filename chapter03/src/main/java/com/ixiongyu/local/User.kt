package com.ixiongyu.local

/**
 * @author  xiongyu
 * @version Create at ：2020/8/23 下午8:01
 */
class User(val name: String, var address: String, val id: Int)

fun User.saveUser() {
    fun validate(value: String, filedName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("保存用户失败，用户id:${this.id},参数${filedName}为空")
        }
    }
    validate(this.name, "name")
    validate(this.address, "address")
    println("save success")
}

fun main() {
    val user = User("熊禹", "四川", 1)
    user.saveUser();
    val userNullAddress = User(name = "熊禹", id = 1, address = "")
    userNullAddress.saveUser()


}
