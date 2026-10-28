// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.browsersessions.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WaitForActionTest {

    @Test
    fun create() {
        val waitForAction =
            WaitForAction.builder()
                .condition(WaitForAction.Condition.UnionMember0.builder().pattern("x").build())
                .idempotencyKey("x")
                .includeObservation(true)
                .timeoutMs(100L)
                .build()

        assertThat(waitForAction.condition())
            .isEqualTo(
                WaitForAction.Condition.ofUnionMember0(
                    WaitForAction.Condition.UnionMember0.builder().pattern("x").build()
                )
            )
        assertThat(waitForAction.idempotencyKey()).contains("x")
        assertThat(waitForAction.includeObservation()).contains(true)
        assertThat(waitForAction.timeoutMs()).contains(100L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val waitForAction =
            WaitForAction.builder()
                .condition(WaitForAction.Condition.UnionMember0.builder().pattern("x").build())
                .idempotencyKey("x")
                .includeObservation(true)
                .timeoutMs(100L)
                .build()

        val roundtrippedWaitForAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(waitForAction),
                jacksonTypeRef<WaitForAction>(),
            )

        assertThat(roundtrippedWaitForAction).isEqualTo(waitForAction)
    }
}
