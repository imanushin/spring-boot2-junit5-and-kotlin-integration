package me.imanushin.stackoverflow.spring5.kotlin.test.sample

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
//@Import(SomeOtherConfiguration::class)
open class StackoverflowQuestionConfiguration

//@JvmStatic
fun main(vararg args: String) {
    SpringApplication.run(StackoverflowQuestionConfiguration::class.java, *args)
}