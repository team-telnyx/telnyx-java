// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.tags

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagRemoveResponseTest {

    @Test
    fun create() {
        val tagRemoveResponse = TagRemoveResponse.builder().addTag("string").build()

        assertThat(tagRemoveResponse.tags()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tagRemoveResponse = TagRemoveResponse.builder().addTag("string").build()

        val roundtrippedTagRemoveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tagRemoveResponse),
                jacksonTypeRef<TagRemoveResponse>(),
            )

        assertThat(roundtrippedTagRemoveResponse).isEqualTo(tagRemoveResponse)
    }
}
