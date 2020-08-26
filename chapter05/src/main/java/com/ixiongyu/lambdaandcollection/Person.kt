package com.ixiongyu.lambdaandcollection

/**
 * @author  xiongyu
 * @version Create at ：2020/8/25 下午9:04
 */
data class Person(val name: String, val age: Int) {
}


fun main(args: Array<String>) {
//    base()
//    foreach()
//    other();

    collectionApi()
}

fun Person.isAdult() = age >= 21


fun foreach() {
    val personList = listOf(Person("雄霸", 55), Person("雄霸吧", 56), Person("雄霸儿", 12))
    personList.forEach { println("$it") }
}

fun base() {
    val personList = listOf(Person("雄霸", 55), Person("雄霸吧", 56), Person("雄霸儿", 12))
    val person = personList.maxByOrNull { person -> person.age }
    println(person)

    val joinToString = personList.joinToString(separator = "_", transform = { it.name })
    /*
    当lambda表达式是函数调用的最后一个实参，可以把lambda表达式放到括号的后面
     */
    personList.joinToString(separator = "_") { it.name }

    println(joinToString)
}

fun other() {
    val p = Person("阿巴巴", 1)
    println(p.isAdult())
    val message = "你好啊"
    val action = { person: Person, message: String -> sendMail(person, message) }
    val nextAction = ::sendMail
    action(p, message)
    nextAction(p, message)
}

fun sendMail(person: Person, message: String) {
    println("send $person message:$message")

}


fun collectionApi() {

    val personList = listOf(Person("雄霸", 55), Person("雄霸吧", 56), Person("雄霸儿", 12))

    println(personList.filter { it.age == personList.maxByOrNull(Person::age)!!.age })
    println(personList.findLast { person -> person.isAdult() })
    println(personList.groupBy { person: Person -> person.name.contains("儿") })

}


