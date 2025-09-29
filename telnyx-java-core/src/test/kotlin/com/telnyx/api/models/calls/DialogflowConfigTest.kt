// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DialogflowConfigTest {

    @Test
    fun create() {
        val dialogflowConfig =
            DialogflowConfig.builder()
                .analyzeSentiment(true)
                .partialAutomatedAgentReply(true)
                .build()

        assertThat(dialogflowConfig.analyzeSentiment()).contains(true)
        assertThat(dialogflowConfig.partialAutomatedAgentReply()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dialogflowConfig =
            DialogflowConfig.builder()
                .analyzeSentiment(true)
                .partialAutomatedAgentReply(true)
                .build()

        val roundtrippedDialogflowConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dialogflowConfig),
                jacksonTypeRef<DialogflowConfig>(),
            )

        assertThat(roundtrippedDialogflowConfig).isEqualTo(dialogflowConfig)
    }
}
