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
            .description("description")
            .destination("x")
            .instructions("x")
            .maxDurationSeconds(1L)
            .name("x")
            .addRubric(TestUpdateParams.Rubric.builder().criteria("criteria").name("name").build())
            .telnyxConversationChannel(TelnyxConversationChannel.PHONE_CALL)
            .testSuite("test_suite")
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
                .description("description")
                .destination("x")
                .instructions("x")
                .maxDurationSeconds(1L)
                .name("x")
                .addRubric(
                    TestUpdateParams.Rubric.builder().criteria("criteria").name("name").build()
                )
                .telnyxConversationChannel(TelnyxConversationChannel.PHONE_CALL)
                .testSuite("test_suite")
                .build()

        val body = params._body()

        assertThat(body.description()).contains("description")
        assertThat(body.destination()).contains("x")
        assertThat(body.instructions()).contains("x")
        assertThat(body.maxDurationSeconds()).contains(1L)
        assertThat(body.name()).contains("x")
        assertThat(body.rubric().getOrNull())
            .containsExactly(
                TestUpdateParams.Rubric.builder().criteria("criteria").name("name").build()
            )
        assertThat(body.telnyxConversationChannel()).contains(TelnyxConversationChannel.PHONE_CALL)
        assertThat(body.testSuite()).contains("test_suite")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TestUpdateParams.builder().testId("test_id").build()

        val body = params._body()
    }
}
