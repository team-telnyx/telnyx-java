// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
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
internal class VoiceDesignServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val voiceDesignService = client.voiceDesigns()

        val voiceDesign =
            voiceDesignService.create(
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

        voiceDesign.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val voiceDesignService = client.voiceDesigns()

        val voiceDesign =
            voiceDesignService.retrieve(
                VoiceDesignRetrieveParams.builder().id("id").version(1L).build()
            )

        voiceDesign.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val voiceDesignService = client.voiceDesigns()

        val page = voiceDesignService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val voiceDesignService = client.voiceDesigns()

        voiceDesignService.delete("id")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteVersion() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val voiceDesignService = client.voiceDesigns()

        voiceDesignService.deleteVersion(
            VoiceDesignDeleteVersionParams.builder().id("id").version(1L).build()
        )
    }

    @Test
    fun downloadSample(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val voiceDesignService = client.voiceDesigns()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            voiceDesignService.downloadSample(
                VoiceDesignDownloadSampleParams.builder().id("id").version(1L).build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun rename() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val voiceDesignService = client.voiceDesigns()

        val response =
            voiceDesignService.rename(
                VoiceDesignRenameParams.builder().id("id").name("updated-narrator").build()
            )

        response.validate()
    }
}
