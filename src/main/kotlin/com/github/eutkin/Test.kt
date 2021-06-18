package com.github.eutkin

import io.micronaut.context.annotation.Value
import javax.inject.Singleton

@Singleton
class Test(@Value("\${untrimmed}") val untrimmed : Set<String>)