package me.imanushin.stackoverflow.spring5.kotlin.test.sample

import mu.KLogging
import org.springframework.core.env.Environment
import org.springframework.stereotype.Service

@Service
class BeanWhichNeedsSettings(settings: SampleSettings, springEnvironment: Environment){
    private companion object : KLogging()

    init {
        logger.info {
            val profiles = springEnvironment.activeProfiles.joinToString()

            "Profiles: $profiles; first: ${settings.first}; second: ${settings.second}"
        }
    }
}