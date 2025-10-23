// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences.actions

import com.telnyx.sdk.models.calls.actions.StopRecordingRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionRecordStopParamsTest {

    @Test
    fun create() {
        ActionRecordStopParams.builder()
            .id("id")
            .stopRecordingRequest(
                StopRecordingRequest.builder()
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .recordingId("6e00ab49-9487-4364-8ad6-23965965afb2")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionRecordStopParams.builder()
                .id("id")
                .stopRecordingRequest(StopRecordingRequest.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionRecordStopParams.builder()
                .id("id")
                .stopRecordingRequest(
                    StopRecordingRequest.builder()
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                        .recordingId("6e00ab49-9487-4364-8ad6-23965965afb2")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                StopRecordingRequest.builder()
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .recordingId("6e00ab49-9487-4364-8ad6-23965965afb2")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionRecordStopParams.builder()
                .id("id")
                .stopRecordingRequest(StopRecordingRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(StopRecordingRequest.builder().build())
    }
}
