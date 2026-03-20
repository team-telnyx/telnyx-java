// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.tags

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagDeleteResponseTest {

    @Test
    fun create() {
        val tagDeleteResponse = TagDeleteResponse.builder().addTag("string").build()

        assertThat(tagDeleteResponse.tags()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tagDeleteResponse = TagDeleteResponse.builder().addTag("string").build()

        val roundtrippedTagDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tagDeleteResponse),
                jacksonTypeRef<TagDeleteResponse>(),
            )

        assertThat(roundtrippedTagDeleteResponse).isEqualTo(tagDeleteResponse)
    }
}
