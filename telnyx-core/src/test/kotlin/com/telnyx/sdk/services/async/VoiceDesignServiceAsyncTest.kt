// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.voicedesigns.VoiceDesignCreateParams
import com.telnyx.sdk.models.voicedesigns.VoiceDesignDeleteVersionParams
import com.telnyx.sdk.models.voicedesigns.VoiceDesignDownloadSampleParams
import com.telnyx.sdk.models.voicedesigns.VoiceDesignRenameParams
import com.telnyx.sdk.models.voicedesigns.VoiceDesignRetrieveParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class VoiceDesignServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val voiceDesignServiceAsync = client.voiceDesigns()

        val voiceDesignFuture =
            voiceDesignServiceAsync.create(
                VoiceDesignCreateParams.builder()
                    .prompt("Speak in a warm, friendly tone")
                    .text("Hello, welcome to our service.")
                    .language("Auto")
                    .maxNewTokens(100L)
                    .name("friendly-narrator")
                    .provider(VoiceDesignCreateParams.Provider.TELNYX)
                    .repetitionPenalty(1.0f)
                    .temperature(0.0f)
                    .topK(1L)
                    .topP(0.0f)
                    .voiceDesignId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val voiceDesign = voiceDesignFuture.get()
        voiceDesign.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val voiceDesignServiceAsync = client.voiceDesigns()

        val voiceDesignFuture =
            voiceDesignServiceAsync.retrieve(
                VoiceDesignRetrieveParams.builder().id("id").version(1L).build()
            )

        val voiceDesign = voiceDesignFuture.get()
        voiceDesign.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val voiceDesignServiceAsync = client.voiceDesigns()

        val pageFuture = voiceDesignServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val voiceDesignServiceAsync = client.voiceDesigns()

        val future = voiceDesignServiceAsync.delete("id")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteVersion() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val voiceDesignServiceAsync = client.voiceDesigns()

        val future =
            voiceDesignServiceAsync.deleteVersion(
                VoiceDesignDeleteVersionParams.builder().id("id").version(1L).build()
            )

        val response = future.get()
    }

    @Test
    fun downloadSample(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val voiceDesignServiceAsync = client.voiceDesigns()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            voiceDesignServiceAsync.downloadSample(
                VoiceDesignDownloadSampleParams.builder().id("id").version(1L).build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun rename() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val voiceDesignServiceAsync = client.voiceDesigns()

        val responseFuture =
            voiceDesignServiceAsync.rename(
                VoiceDesignRenameParams.builder().id("id").name("updated-narrator").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
