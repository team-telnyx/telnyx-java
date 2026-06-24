// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.tags

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagsResponseTest {

    @Test
    fun create() {
        val tagsResponse = TagsResponse.builder().addTag("string").build()

        assertThat(tagsResponse.tags()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tagsResponse = TagsResponse.builder().addTag("string").build()

        val roundtrippedTagsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tagsResponse),
                jacksonTypeRef<TagsResponse>(),
            )

        assertThat(roundtrippedTagsResponse).isEqualTo(tagsResponse)
    }
}
