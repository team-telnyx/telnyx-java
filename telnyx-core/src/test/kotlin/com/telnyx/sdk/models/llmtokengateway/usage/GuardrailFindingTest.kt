// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.usage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GuardrailFindingTest {

    @Test
    fun create() {
        val guardrailFinding =
            GuardrailFinding.builder()
                .action(GuardrailFinding.Action.FLAG)
                .code("code")
                .count(0L)
                .detector(GuardrailFinding.Detector.SECRETS)
                .build()

        assertThat(guardrailFinding.action()).isEqualTo(GuardrailFinding.Action.FLAG)
        assertThat(guardrailFinding.code()).isEqualTo("code")
        assertThat(guardrailFinding.count()).isEqualTo(0L)
        assertThat(guardrailFinding.detector()).isEqualTo(GuardrailFinding.Detector.SECRETS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val guardrailFinding =
            GuardrailFinding.builder()
                .action(GuardrailFinding.Action.FLAG)
                .code("code")
                .count(0L)
                .detector(GuardrailFinding.Detector.SECRETS)
                .build()

        val roundtrippedGuardrailFinding =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(guardrailFinding),
                jacksonTypeRef<GuardrailFinding>(),
            )

        assertThat(roundtrippedGuardrailFinding).isEqualTo(guardrailFinding)
    }
}
