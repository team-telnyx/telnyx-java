// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ttsintegrations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TtsIntegrationRetrieveVoicesResponseTest {

    @Test
    fun create() {
        val ttsIntegrationRetrieveVoicesResponse =
            TtsIntegrationRetrieveVoicesResponse.builder()
                .addVoice(
                    TtsIntegrationRetrieveVoicesResponse.Voice.builder()
                        .voiceId("voice_id")
                        .gender("gender")
                        .language("language")
                        .name("name")
                        .provider("provider")
                        .build()
                )
                .build()

        assertThat(ttsIntegrationRetrieveVoicesResponse.voices())
            .containsExactly(
                TtsIntegrationRetrieveVoicesResponse.Voice.builder()
                    .voiceId("voice_id")
                    .gender("gender")
                    .language("language")
                    .name("name")
                    .provider("provider")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ttsIntegrationRetrieveVoicesResponse =
            TtsIntegrationRetrieveVoicesResponse.builder()
                .addVoice(
                    TtsIntegrationRetrieveVoicesResponse.Voice.builder()
                        .voiceId("voice_id")
                        .gender("gender")
                        .language("language")
                        .name("name")
                        .provider("provider")
                        .build()
                )
                .build()

        val roundtrippedTtsIntegrationRetrieveVoicesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ttsIntegrationRetrieveVoicesResponse),
                jacksonTypeRef<TtsIntegrationRetrieveVoicesResponse>(),
            )

        assertThat(roundtrippedTtsIntegrationRetrieveVoicesResponse)
            .isEqualTo(ttsIntegrationRetrieveVoicesResponse)
    }
}
