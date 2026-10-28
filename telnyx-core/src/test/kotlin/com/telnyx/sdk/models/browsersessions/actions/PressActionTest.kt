// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.browsersessions.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PressActionTest {

    @Test
    fun create() {
        val pressAction =
            PressAction.builder()
                .key(PressAction.Key.ENTER)
                .idempotencyKey("x")
                .includeObservation(true)
                .build()

        assertThat(pressAction.key()).isEqualTo(PressAction.Key.ENTER)
        assertThat(pressAction.idempotencyKey()).contains("x")
        assertThat(pressAction.includeObservation()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pressAction =
            PressAction.builder()
                .key(PressAction.Key.ENTER)
                .idempotencyKey("x")
                .includeObservation(true)
                .build()

        val roundtrippedPressAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pressAction),
                jacksonTypeRef<PressAction>(),
            )

        assertThat(roundtrippedPressAction).isEqualTo(pressAction)
    }
}
