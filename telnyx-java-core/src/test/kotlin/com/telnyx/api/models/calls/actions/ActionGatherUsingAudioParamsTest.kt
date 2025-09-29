// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionGatherUsingAudioParamsTest {

    @Test
    fun create() {
        ActionGatherUsingAudioParams.builder()
            .callControlId("call_control_id")
            .audioUrl("http://example.com/message.wav")
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .interDigitTimeoutMillis(10000)
            .invalidAudioUrl("http://example.com/message.wav")
            .invalidMediaName("my_media_uploaded_to_media_storage_api")
            .maximumDigits(10)
            .maximumTries(3)
            .mediaName("my_media_uploaded_to_media_storage_api")
            .minimumDigits(1)
            .terminatingDigit("#")
            .timeoutMillis(10000)
            .validDigits("123")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ActionGatherUsingAudioParams.builder().callControlId("call_control_id").build()

        assertThat(params._pathParam(0)).isEqualTo("call_control_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionGatherUsingAudioParams.builder()
                .callControlId("call_control_id")
                .audioUrl("http://example.com/message.wav")
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .interDigitTimeoutMillis(10000)
                .invalidAudioUrl("http://example.com/message.wav")
                .invalidMediaName("my_media_uploaded_to_media_storage_api")
                .maximumDigits(10)
                .maximumTries(3)
                .mediaName("my_media_uploaded_to_media_storage_api")
                .minimumDigits(1)
                .terminatingDigit("#")
                .timeoutMillis(10000)
                .validDigits("123")
                .build()

        val body = params._body()

        assertThat(body.audioUrl()).contains("http://example.com/message.wav")
        assertThat(body.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
        assertThat(body.interDigitTimeoutMillis()).contains(10000)
        assertThat(body.invalidAudioUrl()).contains("http://example.com/message.wav")
        assertThat(body.invalidMediaName()).contains("my_media_uploaded_to_media_storage_api")
        assertThat(body.maximumDigits()).contains(10)
        assertThat(body.maximumTries()).contains(3)
        assertThat(body.mediaName()).contains("my_media_uploaded_to_media_storage_api")
        assertThat(body.minimumDigits()).contains(1)
        assertThat(body.terminatingDigit()).contains("#")
        assertThat(body.timeoutMillis()).contains(10000)
        assertThat(body.validDigits()).contains("123")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ActionGatherUsingAudioParams.builder().callControlId("call_control_id").build()

        val body = params._body()
    }
}
