// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AiSummarizeResponseTest {

    @Test
    fun create() {
        val aiSummarizeResponse =
            AiSummarizeResponse.builder()
                .data(AiSummarizeResponse.Data.builder().summary("summary").build())
                .build()

        assertThat(aiSummarizeResponse.data())
            .isEqualTo(AiSummarizeResponse.Data.builder().summary("summary").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val aiSummarizeResponse =
            AiSummarizeResponse.builder()
                .data(AiSummarizeResponse.Data.builder().summary("summary").build())
                .build()

        val roundtrippedAiSummarizeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(aiSummarizeResponse),
                jacksonTypeRef<AiSummarizeResponse>(),
            )

        assertThat(roundtrippedAiSummarizeResponse).isEqualTo(aiSummarizeResponse)
    }
}
