// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.browsersessions.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NavigateActionTest {

    @Test
    fun create() {
        val navigateAction =
            NavigateAction.builder()
                .url("https://example.com")
                .idempotencyKey("x")
                .includeObservation(true)
                .waitUntil(NavigateAction.WaitUntil.LOAD)
                .build()

        assertThat(navigateAction.url()).isEqualTo("https://example.com")
        assertThat(navigateAction.idempotencyKey()).contains("x")
        assertThat(navigateAction.includeObservation()).contains(true)
        assertThat(navigateAction.waitUntil()).contains(NavigateAction.WaitUntil.LOAD)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val navigateAction =
            NavigateAction.builder()
                .url("https://example.com")
                .idempotencyKey("x")
                .includeObservation(true)
                .waitUntil(NavigateAction.WaitUntil.LOAD)
                .build()

        val roundtrippedNavigateAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(navigateAction),
                jacksonTypeRef<NavigateAction>(),
            )

        assertThat(roundtrippedNavigateAction).isEqualTo(navigateAction)
    }
}
