// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.conversations.insights

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightDeleteResponseTest {

    @Test
    fun create() {
        val insightDeleteResponse = InsightDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val insightDeleteResponse = InsightDeleteResponse.builder().build()

        val roundtrippedInsightDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(insightDeleteResponse),
                jacksonTypeRef<InsightDeleteResponse>(),
            )

        assertThat(roundtrippedInsightDeleteResponse).isEqualTo(insightDeleteResponse)
    }
}
