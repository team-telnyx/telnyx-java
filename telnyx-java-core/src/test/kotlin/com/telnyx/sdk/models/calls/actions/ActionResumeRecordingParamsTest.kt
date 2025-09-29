// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionResumeRecordingParamsTest {

    @Test
    fun create() {
        ActionResumeRecordingParams.builder()
            .callControlId("call_control_id")
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .recordingId("6e00ab49-9487-4364-8ad6-23965965afb2")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ActionResumeRecordingParams.builder().callControlId("call_control_id").build()

        assertThat(params._pathParam(0)).isEqualTo("call_control_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionResumeRecordingParams.builder()
                .callControlId("call_control_id")
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .recordingId("6e00ab49-9487-4364-8ad6-23965965afb2")
                .build()

        val body = params._body()

        assertThat(body.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
        assertThat(body.recordingId()).contains("6e00ab49-9487-4364-8ad6-23965965afb2")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ActionResumeRecordingParams.builder().callControlId("call_control_id").build()

        val body = params._body()
    }
}
