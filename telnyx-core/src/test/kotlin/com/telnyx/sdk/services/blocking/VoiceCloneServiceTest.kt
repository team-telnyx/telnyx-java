// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.voiceclones.VoiceCloneCreateFromUploadParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneCreateParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneUpdateParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class VoiceCloneServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val voiceCloneService = client.voiceClones()

        val voiceClone =
            voiceCloneService.create(
                VoiceCloneCreateParams.builder()
                    .gender(VoiceCloneCreateParams.Gender.MALE)
                    .language("en")
                    .name("clone-narrator")
                    .voiceDesignId("550e8400-e29b-41d4-a716-446655440000")
                    .build()
            )

        voiceClone.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val voiceCloneService = client.voiceClones()

        val voiceClone =
            voiceCloneService.update(
                VoiceCloneUpdateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("updated-clone")
                    .gender(VoiceCloneUpdateParams.Gender.MALE)
                    .language("language")
                    .build()
            )

        voiceClone.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val voiceCloneService = client.voiceClones()

        val page = voiceCloneService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val voiceCloneService = client.voiceClones()

        voiceCloneService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createFromUpload() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val voiceCloneService = client.voiceClones()

        val response =
            voiceCloneService.createFromUpload(
                VoiceCloneCreateFromUploadParams.builder()
                    .audioFile("Example data".byteInputStream())
                    .language("lkf-Lz1vLbBu-9uDh-9AHaOS2D-Cbf")
                    .name("name")
                    .gender(VoiceCloneCreateFromUploadParams.Gender.MALE)
                    .label("label")
                    .refText("ref_text")
                    .build()
            )

        response.validate()
    }

    @Test
    fun downloadSample(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val voiceCloneService = client.voiceClones()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response = voiceCloneService.downloadSample("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        assertThat(response.body()).hasContent("abc")
    }
}
