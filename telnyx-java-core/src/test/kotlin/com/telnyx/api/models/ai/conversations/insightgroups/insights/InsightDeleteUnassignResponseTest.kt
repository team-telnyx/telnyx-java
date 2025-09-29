// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.conversations.insightgroups.insights

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightDeleteUnassignResponseTest {

    @Test
    fun create() {
        val insightDeleteUnassignResponse = InsightDeleteUnassignResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val insightDeleteUnassignResponse = InsightDeleteUnassignResponse.builder().build()

        val roundtrippedInsightDeleteUnassignResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(insightDeleteUnassignResponse),
                jacksonTypeRef<InsightDeleteUnassignResponse>(),
            )

        assertThat(roundtrippedInsightDeleteUnassignResponse)
            .isEqualTo(insightDeleteUnassignResponse)
    }
}
