// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.media.MediaListParams
import com.telnyx.api.models.media.MediaUpdateParams
import com.telnyx.api.models.media.MediaUploadParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class MediaServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mediaService = client.media()

        val media = mediaService.retrieve("media_name")

        media.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mediaService = client.media()

        val media =
            mediaService.update(
                MediaUpdateParams.builder()
                    .mediaName("media_name")
                    .mediaUrl("http://www.example.com/audio.mp3")
                    .ttlSecs(86400L)
                    .build()
            )

        media.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mediaService = client.media()

        val media =
            mediaService.list(
                MediaListParams.builder()
                    .filter(
                        MediaListParams.Filter.builder().addContentType("application_xml").build()
                    )
                    .build()
            )

        media.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mediaService = client.media()

        mediaService.delete("media_name")
    }

    @Test
    fun download(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val mediaService = client.media()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response = mediaService.download("media_name")

        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun upload() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mediaService = client.media()

        val response =
            mediaService.upload(
                MediaUploadParams.builder()
                    .mediaUrl("http://www.example.com/audio.mp3")
                    .mediaName("my-file")
                    .ttlSecs(86400L)
                    .build()
            )

        response.validate()
    }
}
