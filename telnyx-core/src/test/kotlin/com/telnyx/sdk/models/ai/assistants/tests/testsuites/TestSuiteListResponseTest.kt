// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.tests.testsuites

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TestSuiteListResponseTest {

    @Test
    fun create() {
        val testSuiteListResponse = TestSuiteListResponse.builder().addData("string").build()

        assertThat(testSuiteListResponse.data()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val testSuiteListResponse = TestSuiteListResponse.builder().addData("string").build()

        val roundtrippedTestSuiteListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(testSuiteListResponse),
                jacksonTypeRef<TestSuiteListResponse>(),
            )

        assertThat(roundtrippedTestSuiteListResponse).isEqualTo(testSuiteListResponse)
    }
}
