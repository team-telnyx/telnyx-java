// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.browsersessions.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScrollActionTest {

    @Test
    fun create() {
        val scrollAction =
            ScrollAction.builder()
                .deltaX(-5000L)
                .deltaY(-5000L)
                .idempotencyKey("x")
                .includeObservation(true)
                .build()

        assertThat(scrollAction.deltaX()).contains(-5000L)
        assertThat(scrollAction.deltaY()).contains(-5000L)
        assertThat(scrollAction.idempotencyKey()).contains("x")
        assertThat(scrollAction.includeObservation()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scrollAction =
            ScrollAction.builder()
                .deltaX(-5000L)
                .deltaY(-5000L)
                .idempotencyKey("x")
                .includeObservation(true)
                .build()

        val roundtrippedScrollAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scrollAction),
                jacksonTypeRef<ScrollAction>(),
            )

        assertThat(roundtrippedScrollAction).isEqualTo(scrollAction)
    }
}
