// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.remediation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RemediationPerNumberResultsTest {

    @Test
    fun create() {
        val remediationPerNumberResults =
            RemediationPerNumberResults.builder()
                .addIneligible("string")
                .addNotFlagged("string")
                .addRefused("string")
                .addRemediated("+19493253498")
                .addRequiresReview("string")
                .build()

        assertThat(remediationPerNumberResults.ineligible().getOrNull()).containsExactly("string")
        assertThat(remediationPerNumberResults.notFlagged().getOrNull()).containsExactly("string")
        assertThat(remediationPerNumberResults.refused().getOrNull()).containsExactly("string")
        assertThat(remediationPerNumberResults.remediated().getOrNull())
            .containsExactly("+19493253498")
        assertThat(remediationPerNumberResults.requiresReview().getOrNull())
            .containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val remediationPerNumberResults =
            RemediationPerNumberResults.builder()
                .addIneligible("string")
                .addNotFlagged("string")
                .addRefused("string")
                .addRemediated("+19493253498")
                .addRequiresReview("string")
                .build()

        val roundtrippedRemediationPerNumberResults =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(remediationPerNumberResults),
                jacksonTypeRef<RemediationPerNumberResults>(),
            )

        assertThat(roundtrippedRemediationPerNumberResults).isEqualTo(remediationPerNumberResults)
    }
}
