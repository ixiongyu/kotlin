package com.ixiongyu.serialization

import com.ixiongyu.ValueSerializer
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


/**
 * @author  xiongyu
 * @version Create at ：2020/9/22 10:40 下午
 */
object DateSerializer : ValueSerializer<LocalDateTime> {
    private var dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")

    override fun toJsonValue(value: LocalDateTime): Any? =
            dateFormat.format(value)

    override fun fromJsonValue(jsonValue: Any?) {
        dateFormat.parse(jsonValue as String)
    }

}
