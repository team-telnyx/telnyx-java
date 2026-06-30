// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ai.chat.BucketIds
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RetrievalToolTest {

    @Test
    fun create() {
        val retrievalTool =
            RetrievalTool.builder()
                .retrieval(BucketIds.builder().addBucketId("string").maxNumResults(0L).build())
                .type(RetrievalTool.Type.RETRIEVAL)
                .build()

        assertThat(retrievalTool.retrieval())
            .isEqualTo(BucketIds.builder().addBucketId("string").maxNumResults(0L).build())
        assertThat(retrievalTool.type()).isEqualTo(RetrievalTool.Type.RETRIEVAL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val retrievalTool =
            RetrievalTool.builder()
                .retrieval(BucketIds.builder().addBucketId("string").maxNumResults(0L).build())
                .type(RetrievalTool.Type.RETRIEVAL)
                .build()

        val roundtrippedRetrievalTool =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(retrievalTool),
                jacksonTypeRef<RetrievalTool>(),
            )

        assertThat(roundtrippedRetrievalTool).isEqualTo(retrievalTool)
    }
}
