// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.tests.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TestRunDetailResultTest {

    @Test
    fun create() {
        val testRunDetailResult =
            TestRunDetailResult.builder().name("name").status(TestStatus.PENDING).build()

        assertThat(testRunDetailResult.name()).isEqualTo("name")
        assertThat(testRunDetailResult.status()).isEqualTo(TestStatus.PENDING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val testRunDetailResult =
            TestRunDetailResult.builder().name("name").status(TestStatus.PENDING).build()

        val roundtrippedTestRunDetailResult =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(testRunDetailResult),
                jacksonTypeRef<TestRunDetailResult>(),
            )

        assertThat(roundtrippedTestRunDetailResult).isEqualTo(testRunDetailResult)
    }
}
