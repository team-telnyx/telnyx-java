// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.tests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.Meta
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TestListPageResponseTest {

    @Test
    fun create() {
        val testListPageResponse =
            TestListPageResponse.builder()
                .addData(
                    AssistantTest.builder()
                        .createdAt(OffsetDateTime.parse("2024-01-15T09:00:00Z"))
                        .name("Customer Support Bot Test")
                        .addRubric(
                            AssistantTest.Rubric.builder()
                                .criteria("Responds within 30 seconds")
                                .name("Response Time")
                                .build()
                        )
                        .telnyxConversationChannel(TelnyxConversationChannel.WEB_CHAT)
                        .testId("123e4567-e89b-12d3-a456-426614174000")
                        .description("description")
                        .destination("destination")
                        .instructions("instructions")
                        .maxDurationSeconds(0L)
                        .testSuite("test_suite")
                        .build()
                )
                .meta(
                    Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        assertThat(testListPageResponse.data())
            .containsExactly(
                AssistantTest.builder()
                    .createdAt(OffsetDateTime.parse("2024-01-15T09:00:00Z"))
                    .name("Customer Support Bot Test")
                    .addRubric(
                        AssistantTest.Rubric.builder()
                            .criteria("Responds within 30 seconds")
                            .name("Response Time")
                            .build()
                    )
                    .telnyxConversationChannel(TelnyxConversationChannel.WEB_CHAT)
                    .testId("123e4567-e89b-12d3-a456-426614174000")
                    .description("description")
                    .destination("destination")
                    .instructions("instructions")
                    .maxDurationSeconds(0L)
                    .testSuite("test_suite")
                    .build()
            )
        assertThat(testListPageResponse.meta())
            .isEqualTo(
                Meta.builder().pageNumber(0L).pageSize(0L).totalPages(0L).totalResults(0L).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val testListPageResponse =
            TestListPageResponse.builder()
                .addData(
                    AssistantTest.builder()
                        .createdAt(OffsetDateTime.parse("2024-01-15T09:00:00Z"))
                        .name("Customer Support Bot Test")
                        .addRubric(
                            AssistantTest.Rubric.builder()
                                .criteria("Responds within 30 seconds")
                                .name("Response Time")
                                .build()
                        )
                        .telnyxConversationChannel(TelnyxConversationChannel.WEB_CHAT)
                        .testId("123e4567-e89b-12d3-a456-426614174000")
                        .description("description")
                        .destination("destination")
                        .instructions("instructions")
                        .maxDurationSeconds(0L)
                        .testSuite("test_suite")
                        .build()
                )
                .meta(
                    Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        val roundtrippedTestListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(testListPageResponse),
                jacksonTypeRef<TestListPageResponse>(),
            )

        assertThat(roundtrippedTestListPageResponse).isEqualTo(testListPageResponse)
    }
}
