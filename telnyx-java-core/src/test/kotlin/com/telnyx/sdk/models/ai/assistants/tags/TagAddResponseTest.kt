// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.tags

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagAddResponseTest {

    @Test
    fun create() {
        val tagAddResponse = TagAddResponse.builder().addTag("string").build()

        assertThat(tagAddResponse.tags()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tagAddResponse = TagAddResponse.builder().addTag("string").build()

        val roundtrippedTagAddResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tagAddResponse),
                jacksonTypeRef<TagAddResponse>(),
            )

        assertThat(roundtrippedTagAddResponse).isEqualTo(tagAddResponse)
    }
}
