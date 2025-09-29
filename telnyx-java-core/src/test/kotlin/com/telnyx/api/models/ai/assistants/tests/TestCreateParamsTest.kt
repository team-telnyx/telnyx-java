// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants.tests

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TestCreateParamsTest {

    @Test
    fun create() {
        TestCreateParams.builder()
            .destination("x")
            .instructions("x")
            .name("x")
            .addRubric(TestCreateParams.Rubric.builder().criteria("criteria").name("name").build())
            .description("description")
            .maxDurationSeconds(1L)
            .telnyxConversationChannel(TelnyxConversationChannel.PHONE_CALL)
            .testSuite("test_suite")
            .build()
    }

    @Test
    fun body() {
        val params =
            TestCreateParams.builder()
                .destination("x")
                .instructions("x")
                .name("x")
                .addRubric(
                    TestCreateParams.Rubric.builder().criteria("criteria").name("name").build()
                )
                .description("description")
                .maxDurationSeconds(1L)
                .telnyxConversationChannel(TelnyxConversationChannel.PHONE_CALL)
                .testSuite("test_suite")
                .build()

        val body = params._body()

        assertThat(body.destination()).isEqualTo("x")
        assertThat(body.instructions()).isEqualTo("x")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.rubric())
            .containsExactly(
                TestCreateParams.Rubric.builder().criteria("criteria").name("name").build()
            )
        assertThat(body.description()).contains("description")
        assertThat(body.maxDurationSeconds()).contains(1L)
        assertThat(body.telnyxConversationChannel()).contains(TelnyxConversationChannel.PHONE_CALL)
        assertThat(body.testSuite()).contains("test_suite")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TestCreateParams.builder()
                .destination("x")
                .instructions("x")
                .name("x")
                .addRubric(
                    TestCreateParams.Rubric.builder().criteria("criteria").name("name").build()
                )
                .build()

        val body = params._body()

        assertThat(body.destination()).isEqualTo("x")
        assertThat(body.instructions()).isEqualTo("x")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.rubric())
            .containsExactly(
                TestCreateParams.Rubric.builder().criteria("criteria").name("name").build()
            )
    }
}
