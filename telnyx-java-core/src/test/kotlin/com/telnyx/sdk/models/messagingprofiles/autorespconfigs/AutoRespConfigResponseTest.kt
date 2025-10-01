// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingprofiles.autorespconfigs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutoRespConfigResponseTest {

    @Test
    fun create() {
        val autoRespConfigResponse =
            AutoRespConfigResponse.builder()
                .data(
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
                )
                .build()

        assertThat(autoRespConfigResponse.data())
            .isEqualTo(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val autoRespConfigResponse =
            AutoRespConfigResponse.builder()
                .data(
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
                )
                .build()

        val roundtrippedAutoRespConfigResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(autoRespConfigResponse),
                jacksonTypeRef<AutoRespConfigResponse>(),
            )

        assertThat(roundtrippedAutoRespConfigResponse).isEqualTo(autoRespConfigResponse)
    }
}
