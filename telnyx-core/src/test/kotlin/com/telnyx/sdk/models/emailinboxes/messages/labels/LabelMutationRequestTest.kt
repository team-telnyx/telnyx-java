// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.messages.labels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LabelMutationRequestTest {

    @Test
    fun create() {
        val labelMutationRequest = LabelMutationRequest.builder().addLabel("x").build()

        assertThat(labelMutationRequest.labels()).containsExactly("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val labelMutationRequest = LabelMutationRequest.builder().addLabel("x").build()

        val roundtrippedLabelMutationRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(labelMutationRequest),
                jacksonTypeRef<LabelMutationRequest>(),
            )

        assertThat(roundtrippedLabelMutationRequest).isEqualTo(labelMutationRequest)
    }
}
