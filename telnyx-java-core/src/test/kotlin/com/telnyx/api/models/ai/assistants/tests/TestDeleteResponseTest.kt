// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants.tests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TestDeleteResponseTest {

    @Test
    fun create() {
        val testDeleteResponse = TestDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val testDeleteResponse = TestDeleteResponse.builder().build()

        val roundtrippedTestDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(testDeleteResponse),
                jacksonTypeRef<TestDeleteResponse>(),
            )

        assertThat(roundtrippedTestDeleteResponse).isEqualTo(testDeleteResponse)
    }
}
