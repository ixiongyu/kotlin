package com.ixiongyu.entity

import com.ixiongyu.JsonExclude
import com.ixiongyu.JsonName

/**
 * @author  xiongyu
 * @version Create at ：2020/9/18 9:10 下午
 */
data class Person(@JsonName(name="customName")val name: String, val age: Int, @JsonExclude val sex: Int) {
}
