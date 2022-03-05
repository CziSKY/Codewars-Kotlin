package me.skymc.codewars.kotlin.sixkyu

object InvokeAString {

    // That's fascinating...
    // At first, i only concerned about String type, But it throws exception to types.
    // so changed some codes, it works now!
    operator fun <A> String.invoke(s: A) = s
}