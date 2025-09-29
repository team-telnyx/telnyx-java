// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.conversations.insightgroups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightGroupDeleteResponseTest {

    @Test
    fun create() {
        val insightGroupDeleteResponse = InsightGroupDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val insightGroupDeleteResponse = InsightGroupDeleteResponse.builder().build()

        val roundtrippedInsightGroupDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(insightGroupDeleteResponse),
                jacksonTypeRef<InsightGroupDeleteResponse>(),
            )

        assertThat(roundtrippedInsightGroupDeleteResponse).isEqualTo(insightGroupDeleteResponse)
    }
}
