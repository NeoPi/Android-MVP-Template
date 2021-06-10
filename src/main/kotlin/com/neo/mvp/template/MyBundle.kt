package com.neo.mvp.template

import com.intellij.AbstractBundle
import org.jetbrains.annotations.NonNls
import org.jetbrains.annotations.PropertyKey


/**
 *  @Author Neo
 *  @Date   2021/6/7
 *  @Env    Viicare-Neo
 *  @Description  MyBundle
 */

@NonNls
private const val BUNDLE = "messages.MyBundle"
object MyBundle : AbstractBundle(BUNDLE) {

    @Suppress("SpreadOperator")
    @JvmStatic
    fun message(@PropertyKey(resourceBundle = BUNDLE) key: String, vararg params: Any) =
            getMessage(key, *params)

    @Suppress("SpreadOperator")
    @JvmStatic
    fun messagePointer(@PropertyKey(resourceBundle = BUNDLE) key: String, vararg params: Any) =
            getLazyMessage(key, *params)
}