// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.tests.runs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunTriggerParamsTest {

    @Test
    fun create() {
        RunTriggerParams.builder()
            .testId("test_id")
            .destinationVersionId("123e4567-e89b-12d3-a456-426614174000")
            .build()
    }

    @Test
    fun pathParams() {
        val params = RunTriggerParams.builder().testId("test_id").build()

        assertThat(params._pathParam(0)).isEqualTo("test_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RunTriggerParams.builder()
                .testId("test_id")
                .destinationVersionId("123e4567-e89b-12d3-a456-426614174000")
                .build()

        val body = params._body()

        assertThat(body.destinationVersionId()).contains("123e4567-e89b-12d3-a456-426614174000")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RunTriggerParams.builder().testId("test_id").build()

        val body = params._body()
    }
}
