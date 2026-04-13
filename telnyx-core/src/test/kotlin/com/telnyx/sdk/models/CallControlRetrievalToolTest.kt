// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallControlRetrievalToolTest {

    @Test
    fun create() {
        val callControlRetrievalTool =
            CallControlRetrievalTool.builder()
                .retrieval(
                    CallControlBucketIds.builder().addBucketId("string").maxNumResults(0L).build()
                )
                .type(CallControlRetrievalTool.Type.RETRIEVAL)
                .build()

        assertThat(callControlRetrievalTool.retrieval())
            .isEqualTo(
                CallControlBucketIds.builder().addBucketId("string").maxNumResults(0L).build()
            )
        assertThat(callControlRetrievalTool.type())
            .isEqualTo(CallControlRetrievalTool.Type.RETRIEVAL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callControlRetrievalTool =
            CallControlRetrievalTool.builder()
                .retrieval(
                    CallControlBucketIds.builder().addBucketId("string").maxNumResults(0L).build()
                )
                .type(CallControlRetrievalTool.Type.RETRIEVAL)
                .build()

        val roundtrippedCallControlRetrievalTool =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callControlRetrievalTool),
                jacksonTypeRef<CallControlRetrievalTool>(),
            )

        assertThat(roundtrippedCallControlRetrievalTool).isEqualTo(callControlRetrievalTool)
    }
}
