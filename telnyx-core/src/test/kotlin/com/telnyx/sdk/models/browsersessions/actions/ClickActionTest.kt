// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.browsersessions.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClickActionTest {

    @Test
    fun create() {
        val clickAction =
            ClickAction.builder()
                .observationId("x")
                .ref("x")
                .idempotencyKey("x")
                .includeObservation(true)
                .timeoutMs(100L)
                .wait(ClickAction.Wait.NO_WAIT)
                .build()

        assertThat(clickAction.observationId()).isEqualTo("x")
        assertThat(clickAction.ref()).isEqualTo("x")
        assertThat(clickAction.idempotencyKey()).contains("x")
        assertThat(clickAction.includeObservation()).contains(true)
        assertThat(clickAction.timeoutMs()).contains(100L)
        assertThat(clickAction.wait()).contains(ClickAction.Wait.NO_WAIT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val clickAction =
            ClickAction.builder()
                .observationId("x")
                .ref("x")
                .idempotencyKey("x")
                .includeObservation(true)
                .timeoutMs(100L)
                .wait(ClickAction.Wait.NO_WAIT)
                .build()

        val roundtrippedClickAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(clickAction),
                jacksonTypeRef<ClickAction>(),
            )

        assertThat(roundtrippedClickAction).isEqualTo(clickAction)
    }
}
