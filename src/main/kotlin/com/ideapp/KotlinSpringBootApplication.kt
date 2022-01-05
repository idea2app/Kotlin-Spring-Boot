package com.ideapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class KotlinSpringBootApplication

fun main(args: Array<String>) {
	runApplication<KotlinSpringBootApplication>(*args)
}
