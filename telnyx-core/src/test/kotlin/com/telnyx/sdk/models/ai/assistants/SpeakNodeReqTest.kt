// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpeakNodeReqTest {

    @Test
    fun create() {
        val speakNodeReq =
            SpeakNodeReq.builder()
                .id("n_greeting")
                .message("Thanks for calling, {{caller_name}}. Connecting you now.")
                .name("Greeting")
                .position(NodePosition.builder().x(60.0).y(80.0).build())
                .type(SpeakNodeReq.Type.SPEAK)
                .build()

        assertThat(speakNodeReq.id()).isEqualTo("n_greeting")
        assertThat(speakNodeReq.message())
            .isEqualTo("Thanks for calling, {{caller_name}}. Connecting you now.")
        assertThat(speakNodeReq.name()).contains("Greeting")
        assertThat(speakNodeReq.position()).contains(NodePosition.builder().x(60.0).y(80.0).build())
        assertThat(speakNodeReq.type()).contains(SpeakNodeReq.Type.SPEAK)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val speakNodeReq =
            SpeakNodeReq.builder()
                .id("n_greeting")
                .message("Thanks for calling, {{caller_name}}. Connecting you now.")
                .name("Greeting")
                .position(NodePosition.builder().x(60.0).y(80.0).build())
                .type(SpeakNodeReq.Type.SPEAK)
                .build()

        val roundtrippedSpeakNodeReq =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(speakNodeReq),
                jacksonTypeRef<SpeakNodeReq>(),
            )

        assertThat(roundtrippedSpeakNodeReq).isEqualTo(speakNodeReq)
    }
}
