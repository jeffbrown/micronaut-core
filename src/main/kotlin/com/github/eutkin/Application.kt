package com.github.eutkin

import io.micronaut.core.type.Argument
import io.micronaut.runtime.Micronaut.build

fun main(args: Array<String>) {
    build()
        .args(*args)
        .packages("com.github.eutkin")
        .start()
        .use { ctx ->
            val property: Collection<String> =
                ctx.getProperty("untrimmed", Argument.listOf(String::class.java)).get()
            assert(property.toSet() == setOf("one", "two"))
        }

}

