// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.conversations.insightgroups.insights

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightAssignResponseTest {

    @Test
    fun create() {
        val insightAssignResponse = InsightAssignResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val insightAssignResponse = InsightAssignResponse.builder().build()

        val roundtrippedInsightAssignResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(insightAssignResponse),
                jacksonTypeRef<InsightAssignResponse>(),
            )

        assertThat(roundtrippedInsightAssignResponse).isEqualTo(insightAssignResponse)
    }
}
