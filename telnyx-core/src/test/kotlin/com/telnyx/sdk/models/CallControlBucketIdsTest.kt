// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallControlBucketIdsTest {

    @Test
    fun create() {
        val callControlBucketIds =
            CallControlBucketIds.builder().addBucketId("string").maxNumResults(0L).build()

        assertThat(callControlBucketIds.bucketIds()).containsExactly("string")
        assertThat(callControlBucketIds.maxNumResults()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callControlBucketIds =
            CallControlBucketIds.builder().addBucketId("string").maxNumResults(0L).build()

        val roundtrippedCallControlBucketIds =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callControlBucketIds),
                jacksonTypeRef<CallControlBucketIds>(),
            )

        assertThat(roundtrippedCallControlBucketIds).isEqualTo(callControlBucketIds)
    }
}
