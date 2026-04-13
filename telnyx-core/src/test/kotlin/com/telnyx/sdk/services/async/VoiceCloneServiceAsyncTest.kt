// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.voiceclones.VoiceCloneCreateFromUploadParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneCreateParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneUpdateParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class VoiceCloneServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val voiceCloneServiceAsync = client.voiceClones()

        val voiceCloneFuture =
            voiceCloneServiceAsync.create(
                VoiceCloneCreateParams.Params.TelnyxDesignClone.builder()
                    .gender(VoiceCloneCreateParams.Params.TelnyxDesignClone.Gender.MALE)
                    .language("en")
                    .name("clone-narrator")
                    .voiceDesignId("550e8400-e29b-41d4-a716-446655440000")
                    .provider(VoiceCloneCreateParams.Params.TelnyxDesignClone.Provider.TELNYX)
                    .build()
            )

        val voiceClone = voiceCloneFuture.get()
        voiceClone.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val voiceCloneServiceAsync = client.voiceClones()

        val voiceCloneFuture =
            voiceCloneServiceAsync.update(
                VoiceCloneUpdateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("updated-clone")
                    .gender(VoiceCloneUpdateParams.Gender.MALE)
                    .language("language")
                    .build()
            )

        val voiceClone = voiceCloneFuture.get()
        voiceClone.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val voiceCloneServiceAsync = client.voiceClones()

        val pageFuture = voiceCloneServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val voiceCloneServiceAsync = client.voiceClones()

        val future = voiceCloneServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createFromUpload() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val voiceCloneServiceAsync = client.voiceClones()

        val responseFuture =
            voiceCloneServiceAsync.createFromUpload(
                VoiceCloneCreateFromUploadParams.Params.TelnyxQwen3TtsClone.builder()
                    .audioFile("Example data".byteInputStream())
                    .gender(VoiceCloneCreateFromUploadParams.Params.TelnyxQwen3TtsClone.Gender.MALE)
                    .language("lkf-Lz1vLbBu-9uDh-9AHaOS2D-Cbf")
                    .name("name")
                    .provider(
                        VoiceCloneCreateFromUploadParams.Params.TelnyxQwen3TtsClone.Provider.TELNYX
                    )
                    .label("label")
                    .modelId(
                        VoiceCloneCreateFromUploadParams.Params.TelnyxQwen3TtsClone.ModelId
                            .QWEN3_TTS
                    )
                    .refText("ref_text")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun downloadSample(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val voiceCloneServiceAsync = client.voiceClones()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            voiceCloneServiceAsync.downloadSample("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }
}
