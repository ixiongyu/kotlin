package com.ixiongyu.nulls

/**
 * @author  xiongyu
 * @version Create at ：2020/8/27 下午10:17
 */
fun main(args: Array<String>) {
    printShipLabel(Person("xiongyu", Company("samsung", Address("streetAddress", 5201314, "city", "China"))))

    printShipLabel(Person("xiongyu", null))
}

class Address(val streetAddress: String, val zipCode: Int, val city: String, val Country: String) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as Address


        //as? 如果是相同类型 则返回转转换成这个类型的实例，否则返回null。?:，当?:前面为不为空的时候返回前面的，否则执行后面的
        val address = other as? Address ?: return false
        println(address)

        if (streetAddress != other.streetAddress) return false
        if (zipCode != other.zipCode) return false
        if (city != other.city) return false
        if (Country != other.Country) return false

        return true
    }

    override fun hashCode(): Int {
        var result = streetAddress.hashCode()
        result = 31 * result + zipCode
        result = 31 * result + city.hashCode()
        result = 31 * result + Country.hashCode()
        return result
    }
}


class Company(val name: String, val address: Address?)

class Person(var name: String, val company: Company?) {}

fun printShipLabel(person: Person) {
    val address = person.company?.address ?: throw IllegalArgumentException("No address")
    //注意这里address的用法
    with(address) {
        println(streetAddress)
        println("$zipCode $city $Country")
    }
}
