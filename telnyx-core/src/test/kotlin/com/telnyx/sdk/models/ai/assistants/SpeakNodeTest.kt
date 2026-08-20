// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpeakNodeTest {

    @Test
    fun create() {
        val speakNode =
            SpeakNode.builder()
                .id("id")
                .message("message")
                .name("name")
                .position(NodePosition.builder().x(0.0).y(0.0).build())
                .type(SpeakNode.Type.SPEAK)
                .build()

        assertThat(speakNode.id()).isEqualTo("id")
        assertThat(speakNode.message()).isEqualTo("message")
        assertThat(speakNode.name()).contains("name")
        assertThat(speakNode.position()).contains(NodePosition.builder().x(0.0).y(0.0).build())
        assertThat(speakNode.type()).contains(SpeakNode.Type.SPEAK)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val speakNode =
            SpeakNode.builder()
                .id("id")
                .message("message")
                .name("name")
                .position(NodePosition.builder().x(0.0).y(0.0).build())
                .type(SpeakNode.Type.SPEAK)
                .build()

        val roundtrippedSpeakNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(speakNode),
                jacksonTypeRef<SpeakNode>(),
            )

        assertThat(roundtrippedSpeakNode).isEqualTo(speakNode)
    }
}
