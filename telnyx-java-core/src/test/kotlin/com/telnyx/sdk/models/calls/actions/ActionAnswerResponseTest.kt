// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionAnswerResponseTest {

    @Test
    fun create() {
        val actionAnswerResponse =
            ActionAnswerResponse.builder()
                .data(
                    ActionAnswerResponse.Data.builder()
                        .recordingId("d7e9c1d4-8b2a-4b8f-b3a7-9a671c9e9b0a")
                        .result("ok")
                        .build()
                )
                .build()

        assertThat(actionAnswerResponse.data())
            .contains(
                ActionAnswerResponse.Data.builder()
                    .recordingId("d7e9c1d4-8b2a-4b8f-b3a7-9a671c9e9b0a")
                    .result("ok")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionAnswerResponse =
            ActionAnswerResponse.builder()
                .data(
                    ActionAnswerResponse.Data.builder()
                        .recordingId("d7e9c1d4-8b2a-4b8f-b3a7-9a671c9e9b0a")
                        .result("ok")
                        .build()
                )
                .build()

        val roundtrippedActionAnswerResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionAnswerResponse),
                jacksonTypeRef<ActionAnswerResponse>(),
            )

        assertThat(roundtrippedActionAnswerResponse).isEqualTo(actionAnswerResponse)
    }
}
