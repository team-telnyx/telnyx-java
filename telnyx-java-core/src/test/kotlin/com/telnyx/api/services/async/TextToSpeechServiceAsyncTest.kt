// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.texttospeech.TextToSpeechGenerateSpeechParams
import com.telnyx.api.models.texttospeech.TextToSpeechListVoicesParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class TextToSpeechServiceAsyncTest {

    @Test
    fun generateSpeech(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val textToSpeechServiceAsync = client.textToSpeech()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            textToSpeechServiceAsync.generateSpeech(
                TextToSpeechGenerateSpeechParams.builder().text("text").voice("voice").build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listVoices() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val textToSpeechServiceAsync = client.textToSpeech()

        val responseFuture =
            textToSpeechServiceAsync.listVoices(
                TextToSpeechListVoicesParams.builder()
                    .elevenlabsApiKeyRef("elevenlabs_api_key_ref")
                    .provider(TextToSpeechListVoicesParams.Provider.AWS)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
