// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.texttospeech.TextToSpeechGenerateSpeechParams
import com.telnyx.sdk.models.texttospeech.TextToSpeechListVoicesParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class TextToSpeechServiceTest {

    @Test
    fun generateSpeech(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val textToSpeechService = client.textToSpeech()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            textToSpeechService.generateSpeech(
                TextToSpeechGenerateSpeechParams.builder().text("text").voice("voice").build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listVoices() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val textToSpeechService = client.textToSpeech()

        val response =
            textToSpeechService.listVoices(
                TextToSpeechListVoicesParams.builder()
                    .elevenlabsApiKeyRef("elevenlabs_api_key_ref")
                    .provider(TextToSpeechListVoicesParams.Provider.AWS)
                    .build()
            )

        response.validate()
    }
}
