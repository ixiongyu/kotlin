package com.ixiongyu.lambdaandcollection

import java.io.File

/**
 * @author  xiongyu
 * @version Create at ：2020/8/26 下午8:32
 */
data class Book(val title: String, val authors: List<String>) {
    var page: Int = 0
    override fun toString(): String {
        return "Book(title='$title', authors=$authors, page=$page)"
    }

}

fun main(args: Array<String>) {
    /**
     * 注意这个地方 我最开始写的时候用{}把Book()包起来了。这样的话，这就不是一个Book对象，而是一个没有方法名称返回值是book的方法
     */
    val books = listOf(Book("书1", listOf("书1作者1", "书1作者2")),
            Book("书2", listOf("书2作者1", "书2作者2")),
            Book("书3", listOf("书3作者1", "书3作者2")))
    println(books.flatMap { book: Book -> book.authors }.toSet())


    val listOf = listOf(1, 2, 3, 4, 5)
    val find1 = listOf.map { i -> i * i }.find { i -> i > 3 }
    val find2 = listOf.asSequence().map { i -> i * i }.find { i -> i > 3 }

    /**
     * 序列的操作是惰性操作。非序列的时候map的操作已经把把所有的平方求出来了。序列的时候是算一个平方，后面的find执行一次。
     * 先因公filter可以减少变换的总次数
     */
    println(find1)
    println(find2)
    sequence()
    val file = File("/Users/xiongyu/Documents/Study/Java/kotlin/state.txt");

    println(file.checkFile())
}


fun sequence() {
    val generateSequence = generateSequence(Book("1", listOf("1")), fun(it: Book): Book? {
        val copy = it.copy();
        copy.page = it.page + 1
        return copy
    })
    val takeWhile = generateSequence.takeWhile { it -> it.page < 100 }
    for (book in takeWhile) {
        println(book)
    }
}


fun File.checkFile() = generateSequence(this) { it.parentFile }.any { it.isHidden }
