package com.github.eutkin

import io.micronaut.runtime.Micronaut.build
import org.junit.jupiter.api.Assertions.assertEquals

fun main(args: Array<String>) {
    build()
        .args(*args)
        .packages("com.github.eutkin")
        .start()
        .use { ctx ->
            val testBean = ctx.getBean(Test::class.java)
            assertEquals(setOf("one", "two"), testBean.untrimmed)

        }

}

