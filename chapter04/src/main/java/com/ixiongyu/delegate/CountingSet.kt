package com.ixiongyu.delegate

/**
 * @author  xiongyu
 * @version Create at ：2020/8/24 下午9:45
 */


class CountingSet<T>(val innerSet: MutableCollection<T> = HashSet<T>()
) : MutableCollection<T> by innerSet {
    override fun add(element: T): Boolean {
        TODO("Not yet implemented")
    }

    override fun addAll(elements: Collection<T>): Boolean {
        TODO("Not yet implemented")
    }
}
