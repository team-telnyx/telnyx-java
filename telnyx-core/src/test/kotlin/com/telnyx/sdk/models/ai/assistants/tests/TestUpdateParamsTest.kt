// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.tests

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TestUpdateParamsTest {

    @Test
    fun create() {
        TestUpdateParams.builder()
            .testId("test_id")
            .description("Description")
            .destination("Destination")
            .instructions("Instructions")
            .maxDurationSeconds(30L)
            .name("Name")
            .addRubric(TestUpdateParams.Rubric.builder().criteria("string").name("string").build())
            .telnyxConversationChannel(TelnyxConversationChannel.PHONE_CALL)
            .testSuite("Test Suite")
            .build()
    }

    @Test
    fun pathParams() {
        val params = TestUpdateParams.builder().testId("test_id").build()

        assertThat(params._pathParam(0)).isEqualTo("test_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TestUpdateParams.builder()
                .testId("test_id")
                .description("Description")
                .destination("Destination")
                .instructions("Instructions")
                .maxDurationSeconds(30L)
                .name("Name")
                .addRubric(
                    TestUpdateParams.Rubric.builder().criteria("string").name("string").build()
                )
                .telnyxConversationChannel(TelnyxConversationChannel.PHONE_CALL)
                .testSuite("Test Suite")
                .build()

        val body = params._body()

        assertThat(body.description()).contains("Description")
        assertThat(body.destination()).contains("Destination")
        assertThat(body.instructions()).contains("Instructions")
        assertThat(body.maxDurationSeconds()).contains(30L)
        assertThat(body.name()).contains("Name")
        assertThat(body.rubric().getOrNull())
            .containsExactly(
                TestUpdateParams.Rubric.builder().criteria("string").name("string").build()
            )
        assertThat(body.telnyxConversationChannel()).contains(TelnyxConversationChannel.PHONE_CALL)
        assertThat(body.testSuite()).contains("Test Suite")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TestUpdateParams.builder().testId("test_id").build()

        val body = params._body()
    }
}
