// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.speechtotext

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpeechToTextListProvidersResponseTest {

    @Test
    fun create() {
        val speechToTextListProvidersResponse =
            SpeechToTextListProvidersResponse.builder()
                .addData(
                    SpeechToTextListProvidersResponse.Data.builder()
                        .model("deepgram/nova-3")
                        .provider("deepgram")
                        .addServiceType(
                            SpeechToTextListProvidersResponse.Data.ServiceType.builder()
                                .languages(listOf("en", "es", "fr"))
                                .type(SttServiceType.STREAMING)
                                .build()
                        )
                        .build()
                )
                .meta(SpeechToTextListProvidersResponse.Meta.builder().total(12L).build())
                .build()

        assertThat(speechToTextListProvidersResponse.data())
            .containsExactly(
                SpeechToTextListProvidersResponse.Data.builder()
                    .model("deepgram/nova-3")
                    .provider("deepgram")
                    .addServiceType(
                        SpeechToTextListProvidersResponse.Data.ServiceType.builder()
                            .languages(listOf("en", "es", "fr"))
                            .type(SttServiceType.STREAMING)
                            .build()
                    )
                    .build()
            )
        assertThat(speechToTextListProvidersResponse.meta())
            .isEqualTo(SpeechToTextListProvidersResponse.Meta.builder().total(12L).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val speechToTextListProvidersResponse =
            SpeechToTextListProvidersResponse.builder()
                .addData(
                    SpeechToTextListProvidersResponse.Data.builder()
                        .model("deepgram/nova-3")
                        .provider("deepgram")
                        .addServiceType(
                            SpeechToTextListProvidersResponse.Data.ServiceType.builder()
                                .languages(listOf("en", "es", "fr"))
                                .type(SttServiceType.STREAMING)
                                .build()
                        )
                        .build()
                )
                .meta(SpeechToTextListProvidersResponse.Meta.builder().total(12L).build())
                .build()

        val roundtrippedSpeechToTextListProvidersResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(speechToTextListProvidersResponse),
                jacksonTypeRef<SpeechToTextListProvidersResponse>(),
            )

        assertThat(roundtrippedSpeechToTextListProvidersResponse)
            .isEqualTo(speechToTextListProvidersResponse)
    }
}
