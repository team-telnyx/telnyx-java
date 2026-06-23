// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostConversationSettingsReqTest {

    @Test
    fun create() {
        val postConversationSettingsReq =
            PostConversationSettingsReq.builder().enabled(true).build()

        assertThat(postConversationSettingsReq.enabled()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val postConversationSettingsReq =
            PostConversationSettingsReq.builder().enabled(true).build()

        val roundtrippedPostConversationSettingsReq =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(postConversationSettingsReq),
                jacksonTypeRef<PostConversationSettingsReq>(),
            )

        assertThat(roundtrippedPostConversationSettingsReq).isEqualTo(postConversationSettingsReq)
    }
}
