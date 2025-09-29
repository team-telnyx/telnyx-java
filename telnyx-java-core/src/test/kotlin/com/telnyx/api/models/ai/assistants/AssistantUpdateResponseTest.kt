// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssistantUpdateResponseTest {

    @Test
    fun create() {
        val assistantUpdateResponse = AssistantUpdateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val assistantUpdateResponse = AssistantUpdateResponse.builder().build()

        val roundtrippedAssistantUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assistantUpdateResponse),
                jacksonTypeRef<AssistantUpdateResponse>(),
            )

        assertThat(roundtrippedAssistantUpdateResponse).isEqualTo(assistantUpdateResponse)
    }
}
