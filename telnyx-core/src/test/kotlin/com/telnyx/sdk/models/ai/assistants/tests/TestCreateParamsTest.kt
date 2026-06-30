// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.tests

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TestCreateParamsTest {

    @Test
    fun create() {
        TestCreateParams.builder()
            .destination("+15551234567")
            .instructions(
                "Act as a frustrated customer who received a damaged product. Ask for a refund and escalate if not satisfied with the initial response."
            )
            .name("Customer Support Bot Test")
            .addRubric(
                TestCreateParams.Rubric.builder()
                    .criteria("Assistant responds within 30 seconds")
                    .name("Response Time")
                    .build()
            )
            .addRubric(
                TestCreateParams.Rubric.builder()
                    .criteria("Provides correct product information")
                    .name("Accuracy")
                    .build()
            )
            .description("description")
            .maxDurationSeconds(1L)
            .telnyxConversationChannel(TelnyxConversationChannel.WEB_CHAT)
            .testSuite("test_suite")
            .build()
    }

    @Test
    fun body() {
        val params =
            TestCreateParams.builder()
                .destination("+15551234567")
                .instructions(
                    "Act as a frustrated customer who received a damaged product. Ask for a refund and escalate if not satisfied with the initial response."
                )
                .name("Customer Support Bot Test")
                .addRubric(
                    TestCreateParams.Rubric.builder()
                        .criteria("Assistant responds within 30 seconds")
                        .name("Response Time")
                        .build()
                )
                .addRubric(
                    TestCreateParams.Rubric.builder()
                        .criteria("Provides correct product information")
                        .name("Accuracy")
                        .build()
                )
                .description("description")
                .maxDurationSeconds(1L)
                .telnyxConversationChannel(TelnyxConversationChannel.WEB_CHAT)
                .testSuite("test_suite")
                .build()

        val body = params._body()

        assertThat(body.destination()).isEqualTo("+15551234567")
        assertThat(body.instructions())
            .isEqualTo(
                "Act as a frustrated customer who received a damaged product. Ask for a refund and escalate if not satisfied with the initial response."
            )
        assertThat(body.name()).isEqualTo("Customer Support Bot Test")
        assertThat(body.rubric())
            .containsExactly(
                TestCreateParams.Rubric.builder()
                    .criteria("Assistant responds within 30 seconds")
                    .name("Response Time")
                    .build(),
                TestCreateParams.Rubric.builder()
                    .criteria("Provides correct product information")
                    .name("Accuracy")
                    .build(),
            )
        assertThat(body.description()).contains("description")
        assertThat(body.maxDurationSeconds()).contains(1L)
        assertThat(body.telnyxConversationChannel()).contains(TelnyxConversationChannel.WEB_CHAT)
        assertThat(body.testSuite()).contains("test_suite")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TestCreateParams.builder()
                .destination("+15551234567")
                .instructions(
                    "Act as a frustrated customer who received a damaged product. Ask for a refund and escalate if not satisfied with the initial response."
                )
                .name("Customer Support Bot Test")
                .addRubric(
                    TestCreateParams.Rubric.builder()
                        .criteria("Assistant responds within 30 seconds")
                        .name("Response Time")
                        .build()
                )
                .addRubric(
                    TestCreateParams.Rubric.builder()
                        .criteria("Provides correct product information")
                        .name("Accuracy")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.destination()).isEqualTo("+15551234567")
        assertThat(body.instructions())
            .isEqualTo(
                "Act as a frustrated customer who received a damaged product. Ask for a refund and escalate if not satisfied with the initial response."
            )
        assertThat(body.name()).isEqualTo("Customer Support Bot Test")
        assertThat(body.rubric())
            .containsExactly(
                TestCreateParams.Rubric.builder()
                    .criteria("Assistant responds within 30 seconds")
                    .name("Response Time")
                    .build(),
                TestCreateParams.Rubric.builder()
                    .criteria("Provides correct product information")
                    .name("Accuracy")
                    .build(),
            )
    }
}
