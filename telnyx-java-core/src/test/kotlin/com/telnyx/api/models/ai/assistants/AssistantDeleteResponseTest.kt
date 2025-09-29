// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssistantDeleteResponseTest {

    @Test
    fun create() {
        val assistantDeleteResponse =
            AssistantDeleteResponse.builder().id("id").deleted(true).object_("object").build()

        assertThat(assistantDeleteResponse.id()).isEqualTo("id")
        assertThat(assistantDeleteResponse.deleted()).isEqualTo(true)
        assertThat(assistantDeleteResponse.object_()).isEqualTo("object")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val assistantDeleteResponse =
            AssistantDeleteResponse.builder().id("id").deleted(true).object_("object").build()

        val roundtrippedAssistantDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assistantDeleteResponse),
                jacksonTypeRef<AssistantDeleteResponse>(),
            )

        assertThat(roundtrippedAssistantDeleteResponse).isEqualTo(assistantDeleteResponse)
    }
}
