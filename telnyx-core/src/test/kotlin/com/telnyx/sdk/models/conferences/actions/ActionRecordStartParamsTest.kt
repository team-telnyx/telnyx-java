// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionRecordStartParamsTest {

    @Test
    fun create() {
        ActionRecordStartParams.builder()
            .id("id")
            .format(ActionRecordStartParams.Format.WAV)
            .channels(ActionRecordStartParams.Channels.DUAL)
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .customFileName("my_recording_file_name")
            .playBeep(true)
            .region(ActionRecordStartParams.Region.US)
            .trim(ActionRecordStartParams.Trim.TRIM_SILENCE)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionRecordStartParams.builder()
                .id("id")
                .format(ActionRecordStartParams.Format.WAV)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionRecordStartParams.builder()
                .id("id")
                .format(ActionRecordStartParams.Format.WAV)
                .channels(ActionRecordStartParams.Channels.DUAL)
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .customFileName("my_recording_file_name")
                .playBeep(true)
                .region(ActionRecordStartParams.Region.US)
                .trim(ActionRecordStartParams.Trim.TRIM_SILENCE)
                .build()

        val body = params._body()

        assertThat(body.format()).isEqualTo(ActionRecordStartParams.Format.WAV)
        assertThat(body.channels()).contains(ActionRecordStartParams.Channels.DUAL)
        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
        assertThat(body.customFileName()).contains("my_recording_file_name")
        assertThat(body.playBeep()).contains(true)
        assertThat(body.region()).contains(ActionRecordStartParams.Region.US)
        assertThat(body.trim()).contains(ActionRecordStartParams.Trim.TRIM_SILENCE)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionRecordStartParams.builder()
                .id("id")
                .format(ActionRecordStartParams.Format.WAV)
                .build()

        val body = params._body()

        assertThat(body.format()).isEqualTo(ActionRecordStartParams.Format.WAV)
    }
}
