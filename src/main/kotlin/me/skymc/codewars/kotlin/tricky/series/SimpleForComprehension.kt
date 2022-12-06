package me.skymc.codewars.kotlin.tricky.series

import java.util.*

object SimpleForComprehension {

    fun <T> `for`(func: suspend SequenceScope<Optional<T>>.() -> Unit): Optional<T> {
        return sequence { func() }.first()
    }

    @Suppress("NULLABLE_TYPE_PARAMETER_AGAINST_NOT_NULL_TYPE_PARAMETER")
    suspend fun <T> SequenceScope<Optional<T>>.yield(value: T) {
        yield(Optional.of(value))
    }

    @Suppress("NULLABLE_TYPE_PARAMETER_AGAINST_NOT_NULL_TYPE_PARAMETER")
    suspend fun <T, F> SequenceScope<Optional<T>>.bind(value: Optional<F>): F {
        if (value.isEmpty) {
            yield(Optional.empty())
        }
        return value.get()
    }
}