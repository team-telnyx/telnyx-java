// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionRecordStopParamsTest {

    @Test
    fun create() {
        ActionRecordStopParams.builder()
            .id("id")
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .recordingId("6e00ab49-9487-4364-8ad6-23965965afb2")
            .region(ActionRecordStopParams.Region.US)
            .build()
    }

    @Test
    fun pathParams() {
        val params = ActionRecordStopParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionRecordStopParams.builder()
                .id("id")
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .recordingId("6e00ab49-9487-4364-8ad6-23965965afb2")
                .region(ActionRecordStopParams.Region.US)
                .build()

        val body = params._body()

        assertThat(body.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
        assertThat(body.recordingId()).contains("6e00ab49-9487-4364-8ad6-23965965afb2")
        assertThat(body.region()).contains(ActionRecordStopParams.Region.US)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ActionRecordStopParams.builder().id("id").build()

        val body = params._body()
    }
}
