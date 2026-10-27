// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.browsersessions.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScreenshotActionTest {

    @Test
    fun create() {
        val screenshotAction =
            ScreenshotAction.builder().idempotencyKey("x").includeObservation(true).build()

        assertThat(screenshotAction.idempotencyKey()).contains("x")
        assertThat(screenshotAction.includeObservation()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val screenshotAction =
            ScreenshotAction.builder().idempotencyKey("x").includeObservation(true).build()

        val roundtrippedScreenshotAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(screenshotAction),
                jacksonTypeRef<ScreenshotAction>(),
            )

        assertThat(roundtrippedScreenshotAction).isEqualTo(screenshotAction)
    }
}
