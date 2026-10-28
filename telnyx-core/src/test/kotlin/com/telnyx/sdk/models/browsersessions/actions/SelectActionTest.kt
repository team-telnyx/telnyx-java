// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.browsersessions.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SelectActionTest {

    @Test
    fun create() {
        val selectAction =
            SelectAction.builder()
                .observationId("x")
                .ref("x")
                .value("value")
                .idempotencyKey("x")
                .includeObservation(true)
                .build()

        assertThat(selectAction.observationId()).isEqualTo("x")
        assertThat(selectAction.ref()).isEqualTo("x")
        assertThat(selectAction.value()).isEqualTo("value")
        assertThat(selectAction.idempotencyKey()).contains("x")
        assertThat(selectAction.includeObservation()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val selectAction =
            SelectAction.builder()
                .observationId("x")
                .ref("x")
                .value("value")
                .idempotencyKey("x")
                .includeObservation(true)
                .build()

        val roundtrippedSelectAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(selectAction),
                jacksonTypeRef<SelectAction>(),
            )

        assertThat(roundtrippedSelectAction).isEqualTo(selectAction)
    }
}
