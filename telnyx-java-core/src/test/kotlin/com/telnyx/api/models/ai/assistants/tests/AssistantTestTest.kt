// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants.tests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssistantTestTest {

    @Test
    fun create() {
        val assistantTest =
            AssistantTest.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("Customer Support Bot Test")
                .addRubric(AssistantTest.Rubric.builder().criteria("criteria").name("name").build())
                .telnyxConversationChannel(TelnyxConversationChannel.WEB_CHAT)
                .testId("123e4567-e89b-12d3-a456-426614174000")
                .description("description")
                .destination("destination")
                .instructions("instructions")
                .maxDurationSeconds(0L)
                .testSuite("test_suite")
                .build()

        assertThat(assistantTest.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(assistantTest.name()).isEqualTo("Customer Support Bot Test")
        assertThat(assistantTest.rubric())
            .containsExactly(
                AssistantTest.Rubric.builder().criteria("criteria").name("name").build()
            )
        assertThat(assistantTest.telnyxConversationChannel())
            .isEqualTo(TelnyxConversationChannel.WEB_CHAT)
        assertThat(assistantTest.testId()).isEqualTo("123e4567-e89b-12d3-a456-426614174000")
        assertThat(assistantTest.description()).contains("description")
        assertThat(assistantTest.destination()).contains("destination")
        assertThat(assistantTest.instructions()).contains("instructions")
        assertThat(assistantTest.maxDurationSeconds()).contains(0L)
        assertThat(assistantTest.testSuite()).contains("test_suite")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val assistantTest =
            AssistantTest.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("Customer Support Bot Test")
                .addRubric(AssistantTest.Rubric.builder().criteria("criteria").name("name").build())
                .telnyxConversationChannel(TelnyxConversationChannel.WEB_CHAT)
                .testId("123e4567-e89b-12d3-a456-426614174000")
                .description("description")
                .destination("destination")
                .instructions("instructions")
                .maxDurationSeconds(0L)
                .testSuite("test_suite")
                .build()

        val roundtrippedAssistantTest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assistantTest),
                jacksonTypeRef<AssistantTest>(),
            )

        assertThat(roundtrippedAssistantTest).isEqualTo(assistantTest)
    }
}
