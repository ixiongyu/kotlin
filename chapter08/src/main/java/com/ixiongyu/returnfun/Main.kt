package com.ixiongyu.returnfun

/**
 * @author xiongyu
 * @version Create at ：2020/9/3 下午10:08
 */
fun main() {
    val order = Order(2);
    val shippingCostCalculator = getShippingCostCalculator(Delivery.EXPEDITED)
    println(shippingCostCalculator(order))

}


fun getShippingCostCalculator(delivery: Delivery): (Order) -> Double {
    if (delivery == Delivery.EXPEDITED) {
        return { order -> order.itemCount * 2.1 + 6 }
    }
    return { order -> order.itemCount * 2.1 }

}
