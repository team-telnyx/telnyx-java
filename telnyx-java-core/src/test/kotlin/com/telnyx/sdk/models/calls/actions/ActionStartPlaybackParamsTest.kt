// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionStartPlaybackParamsTest {

    @Test
    fun create() {
        ActionStartPlaybackParams.builder()
            .callControlId("call_control_id")
            .audioType(ActionStartPlaybackParams.AudioType.WAV)
            .audioUrl("http://www.example.com/sounds/greeting.wav")
            .cacheAudio(true)
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .loop("infinity")
            .mediaName("my_media_uploaded_to_media_storage_api")
            .overlay(true)
            .playbackContent("SUQzAwAAAAADf1...")
            .stop("current")
            .targetLegs("self")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ActionStartPlaybackParams.builder().callControlId("call_control_id").build()

        assertThat(params._pathParam(0)).isEqualTo("call_control_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionStartPlaybackParams.builder()
                .callControlId("call_control_id")
                .audioType(ActionStartPlaybackParams.AudioType.WAV)
                .audioUrl("http://www.example.com/sounds/greeting.wav")
                .cacheAudio(true)
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .loop("infinity")
                .mediaName("my_media_uploaded_to_media_storage_api")
                .overlay(true)
                .playbackContent("SUQzAwAAAAADf1...")
                .stop("current")
                .targetLegs("self")
                .build()

        val body = params._body()

        assertThat(body.audioType()).contains(ActionStartPlaybackParams.AudioType.WAV)
        assertThat(body.audioUrl()).contains("http://www.example.com/sounds/greeting.wav")
        assertThat(body.cacheAudio()).contains(true)
        assertThat(body.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
        assertThat(body.loop()).contains(Loopcount.ofString("infinity"))
        assertThat(body.mediaName()).contains("my_media_uploaded_to_media_storage_api")
        assertThat(body.overlay()).contains(true)
        assertThat(body.playbackContent()).contains("SUQzAwAAAAADf1...")
        assertThat(body.stop()).contains("current")
        assertThat(body.targetLegs()).contains("self")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ActionStartPlaybackParams.builder().callControlId("call_control_id").build()

        val body = params._body()
    }
}
