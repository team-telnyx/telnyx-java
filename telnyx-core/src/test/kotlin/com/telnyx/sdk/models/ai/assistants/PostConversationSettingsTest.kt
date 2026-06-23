// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostConversationSettingsTest {

    @Test
    fun create() {
        val postConversationSettings = PostConversationSettings.builder().enabled(true).build()

        assertThat(postConversationSettings.enabled()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val postConversationSettings = PostConversationSettings.builder().enabled(true).build()

        val roundtrippedPostConversationSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(postConversationSettings),
                jacksonTypeRef<PostConversationSettings>(),
            )

        assertThat(roundtrippedPostConversationSettings).isEqualTo(postConversationSettings)
    }
}
