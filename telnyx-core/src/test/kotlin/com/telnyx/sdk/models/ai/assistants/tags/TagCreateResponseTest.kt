// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.tags

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagCreateResponseTest {

    @Test
    fun create() {
        val tagCreateResponse = TagCreateResponse.builder().addTag("string").build()

        assertThat(tagCreateResponse.tags()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tagCreateResponse = TagCreateResponse.builder().addTag("string").build()

        val roundtrippedTagCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tagCreateResponse),
                jacksonTypeRef<TagCreateResponse>(),
            )

        assertThat(roundtrippedTagCreateResponse).isEqualTo(tagCreateResponse)
    }
}
