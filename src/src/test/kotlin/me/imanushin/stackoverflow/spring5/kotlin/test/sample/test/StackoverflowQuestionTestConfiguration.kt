package me.imanushin.stackoverflow.spring5.kotlin.test.sample.test

import me.imanushin.stackoverflow.spring5.kotlin.test.sample.StackoverflowQuestionConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import


@ComponentScan
@Configuration
@Import(StackoverflowQuestionConfiguration::class)
open class StackoverflowQuestionTestConfiguration
