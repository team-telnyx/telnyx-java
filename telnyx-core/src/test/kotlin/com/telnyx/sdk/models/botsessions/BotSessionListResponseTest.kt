// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.botsessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BotSessionListResponseTest {

    @Test
    fun create() {
        val botSessionListResponse =
            BotSessionListResponse.builder()
                .data(
                    BotSessionListResponse.Data.builder()
                        .apiV2Token("KEY0189A1B2C3D4E5F6071829AB3C4D5E_5FhZonmFvcw8Yq0dME27Bg")
                        .build()
                )
                .build()

        assertThat(botSessionListResponse.data())
            .isEqualTo(
                BotSessionListResponse.Data.builder()
                    .apiV2Token("KEY0189A1B2C3D4E5F6071829AB3C4D5E_5FhZonmFvcw8Yq0dME27Bg")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val botSessionListResponse =
            BotSessionListResponse.builder()
                .data(
                    BotSessionListResponse.Data.builder()
                        .apiV2Token("KEY0189A1B2C3D4E5F6071829AB3C4D5E_5FhZonmFvcw8Yq0dME27Bg")
                        .build()
                )
                .build()

        val roundtrippedBotSessionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(botSessionListResponse),
                jacksonTypeRef<BotSessionListResponse>(),
            )

        assertThat(roundtrippedBotSessionListResponse).isEqualTo(botSessionListResponse)
    }
}
