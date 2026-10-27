// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.results

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResultDeleteResponseTest {

    @Test
    fun create() {
        val resultDeleteResponse = ResultDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val resultDeleteResponse = ResultDeleteResponse.builder().build()

        val roundtrippedResultDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(resultDeleteResponse),
                jacksonTypeRef<ResultDeleteResponse>(),
            )

        assertThat(roundtrippedResultDeleteResponse).isEqualTo(resultDeleteResponse)
    }
}
