package me.imanushin.stackoverflow.spring5.kotlin.test.sample

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

/**
 * This class has getters and setters public, e.g. please avoid using it directly
 * Create separate immutable class (without setters), create separate Spring service, which will have SampleSettings
 * and immutable SampleSettings on output
 */
@Component
@ConfigurationProperties("me.imanushin.stackoverflow.spring5.kotlin.test.sample")
open class SampleSettings {
    open var first: Int? = null

    open var second: Int? = null
}