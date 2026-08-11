// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections.sources

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SourceRequestTest {

    @Test
    fun create() {
        val sourceRequest =
            SourceRequest.builder().sourceType(SourceType.VOICE).bucketId("policy-docs").build()

        assertThat(sourceRequest.sourceType()).isEqualTo(SourceType.VOICE)
        assertThat(sourceRequest.bucketId()).contains("policy-docs")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sourceRequest =
            SourceRequest.builder().sourceType(SourceType.VOICE).bucketId("policy-docs").build()

        val roundtrippedSourceRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sourceRequest),
                jacksonTypeRef<SourceRequest>(),
            )

        assertThat(roundtrippedSourceRequest).isEqualTo(sourceRequest)
    }
}
