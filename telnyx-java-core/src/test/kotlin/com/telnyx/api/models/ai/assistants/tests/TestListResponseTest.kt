// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants.tests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.ai.assistants.tests.testsuites.runs.Meta
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TestListResponseTest {

    @Test
    fun create() {
        val testListResponse =
            TestListResponse.builder()
                .addData(
                    AssistantTest.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("Customer Support Bot Test")
                        .addRubric(
                            AssistantTest.Rubric.builder().criteria("criteria").name("name").build()
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

        assertThat(testListResponse.data())
            .containsExactly(
                AssistantTest.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("Customer Support Bot Test")
                    .addRubric(
                        AssistantTest.Rubric.builder().criteria("criteria").name("name").build()
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
        assertThat(testListResponse.meta())
            .isEqualTo(
                Meta.builder().pageNumber(0L).pageSize(0L).totalPages(0L).totalResults(0L).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val testListResponse =
            TestListResponse.builder()
                .addData(
                    AssistantTest.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("Customer Support Bot Test")
                        .addRubric(
                            AssistantTest.Rubric.builder().criteria("criteria").name("name").build()
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

        val roundtrippedTestListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(testListResponse),
                jacksonTypeRef<TestListResponse>(),
            )

        assertThat(roundtrippedTestListResponse).isEqualTo(testListResponse)
    }
}
