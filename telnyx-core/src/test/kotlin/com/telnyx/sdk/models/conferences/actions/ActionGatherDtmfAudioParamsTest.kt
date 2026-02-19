// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionGatherDtmfAudioParamsTest {

    @Test
    fun create() {
        ActionGatherDtmfAudioParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
            .audioUrl("http://example.com/gather_prompt.wav")
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .gatherId("gather_id")
            .initialTimeoutMillis(10000L)
            .interDigitTimeoutMillis(3000L)
            .invalidAudioUrl("invalid_audio_url")
            .invalidMediaName("invalid_media_name")
            .maximumDigits(4L)
            .maximumTries(3L)
            .mediaName("media_name")
            .minimumDigits(1L)
            .stopPlaybackOnDtmf(true)
            .terminatingDigit("#")
            .timeoutMillis(30000L)
            .validDigits("0123456789")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionGatherDtmfAudioParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionGatherDtmfAudioParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                .audioUrl("http://example.com/gather_prompt.wav")
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .gatherId("gather_id")
                .initialTimeoutMillis(10000L)
                .interDigitTimeoutMillis(3000L)
                .invalidAudioUrl("invalid_audio_url")
                .invalidMediaName("invalid_media_name")
                .maximumDigits(4L)
                .maximumTries(3L)
                .mediaName("media_name")
                .minimumDigits(1L)
                .stopPlaybackOnDtmf(true)
                .terminatingDigit("#")
                .timeoutMillis(30000L)
                .validDigits("0123456789")
                .build()

        val body = params._body()

        assertThat(body.callControlId())
            .isEqualTo("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
        assertThat(body.audioUrl()).contains("http://example.com/gather_prompt.wav")
        assertThat(body.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(body.gatherId()).contains("gather_id")
        assertThat(body.initialTimeoutMillis()).contains(10000L)
        assertThat(body.interDigitTimeoutMillis()).contains(3000L)
        assertThat(body.invalidAudioUrl()).contains("invalid_audio_url")
        assertThat(body.invalidMediaName()).contains("invalid_media_name")
        assertThat(body.maximumDigits()).contains(4L)
        assertThat(body.maximumTries()).contains(3L)
        assertThat(body.mediaName()).contains("media_name")
        assertThat(body.minimumDigits()).contains(1L)
        assertThat(body.stopPlaybackOnDtmf()).contains(true)
        assertThat(body.terminatingDigit()).contains("#")
        assertThat(body.timeoutMillis()).contains(30000L)
        assertThat(body.validDigits()).contains("0123456789")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionGatherDtmfAudioParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                .build()

        val body = params._body()

        assertThat(body.callControlId())
            .isEqualTo("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
    }
}
