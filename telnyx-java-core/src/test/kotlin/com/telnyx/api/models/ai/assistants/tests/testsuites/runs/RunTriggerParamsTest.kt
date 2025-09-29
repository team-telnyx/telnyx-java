// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants.tests.testsuites.runs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunTriggerParamsTest {

    @Test
    fun create() {
        RunTriggerParams.builder()
            .suiteName("suite_name")
            .destinationVersionId("123e4567-e89b-12d3-a456-426614174000")
            .build()
    }

    @Test
    fun pathParams() {
        val params = RunTriggerParams.builder().suiteName("suite_name").build()

        assertThat(params._pathParam(0)).isEqualTo("suite_name")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RunTriggerParams.builder()
                .suiteName("suite_name")
                .destinationVersionId("123e4567-e89b-12d3-a456-426614174000")
                .build()

        val body = params._body()

        assertThat(body.destinationVersionId()).contains("123e4567-e89b-12d3-a456-426614174000")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RunTriggerParams.builder().suiteName("suite_name").build()

        val body = params._body()
    }
}
