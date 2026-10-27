// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.browsersessions.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FillActionTest {

    @Test
    fun create() {
        val fillAction =
            FillAction.builder()
                .observationId("x")
                .ref("x")
                .value("value")
                .idempotencyKey("x")
                .includeObservation(true)
                .build()

        assertThat(fillAction.observationId()).isEqualTo("x")
        assertThat(fillAction.ref()).isEqualTo("x")
        assertThat(fillAction.value()).isEqualTo("value")
        assertThat(fillAction.idempotencyKey()).contains("x")
        assertThat(fillAction.includeObservation()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fillAction =
            FillAction.builder()
                .observationId("x")
                .ref("x")
                .value("value")
                .idempotencyKey("x")
                .includeObservation(true)
                .build()

        val roundtrippedFillAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fillAction),
                jacksonTypeRef<FillAction>(),
            )

        assertThat(roundtrippedFillAction).isEqualTo(fillAction)
    }
}
