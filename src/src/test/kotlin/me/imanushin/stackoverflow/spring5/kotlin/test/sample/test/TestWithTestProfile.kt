package me.imanushin.stackoverflow.spring5.kotlin.test.sample.test

import io.kotlintest.shouldBe
import me.imanushin.stackoverflow.spring5.kotlin.test.sample.SampleSettings
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.junit.jupiter.SpringExtension

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension::class)
@ActiveProfiles("test")
class TestWithTestProfile {

    @Autowired
    private lateinit var settings: SampleSettings

    @Test
    fun checkSettings(){
        settings.first shouldBe 1
        settings.second shouldBe 2 // e.g. 1 was replaced by 2, because we asked application profile "test" (see above)
    }

}