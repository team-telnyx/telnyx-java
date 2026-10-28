// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.browsersessions.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObserveActionTest {

    @Test
    fun create() {
        val observeAction =
            ObserveAction.builder().idempotencyKey("x").includeObservation(true).build()

        assertThat(observeAction.idempotencyKey()).contains("x")
        assertThat(observeAction.includeObservation()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val observeAction =
            ObserveAction.builder().idempotencyKey("x").includeObservation(true).build()

        val roundtrippedObserveAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(observeAction),
                jacksonTypeRef<ObserveAction>(),
            )

        assertThat(roundtrippedObserveAction).isEqualTo(observeAction)
    }
}
