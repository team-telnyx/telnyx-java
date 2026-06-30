// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingprofiles.autorespconfigs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutoRespConfigTest {

    @Test
    fun create() {
        val autoRespConfig =
            AutoRespConfig.builder()
                .id("b8f9c1c0-5b5a-4b1e-8c1c-0b5a4b1e8c1c")
                .countryCode("*")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addKeyword("START")
                .addKeyword("BEGIN")
                .op(AutoRespConfig.Op.START)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .respText("Thank you for subscribing to our service.")
                .build()

        assertThat(autoRespConfig.id()).isEqualTo("b8f9c1c0-5b5a-4b1e-8c1c-0b5a4b1e8c1c")
        assertThat(autoRespConfig.countryCode()).isEqualTo("*")
        assertThat(autoRespConfig.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(autoRespConfig.keywords()).containsExactly("START", "BEGIN")
        assertThat(autoRespConfig.op()).isEqualTo(AutoRespConfig.Op.START)
        assertThat(autoRespConfig.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(autoRespConfig.respText()).contains("Thank you for subscribing to our service.")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val autoRespConfig =
            AutoRespConfig.builder()
                .id("b8f9c1c0-5b5a-4b1e-8c1c-0b5a4b1e8c1c")
                .countryCode("*")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addKeyword("START")
                .addKeyword("BEGIN")
                .op(AutoRespConfig.Op.START)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .respText("Thank you for subscribing to our service.")
                .build()

        val roundtrippedAutoRespConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(autoRespConfig),
                jacksonTypeRef<AutoRespConfig>(),
            )

        assertThat(roundtrippedAutoRespConfig).isEqualTo(autoRespConfig)
    }
}
