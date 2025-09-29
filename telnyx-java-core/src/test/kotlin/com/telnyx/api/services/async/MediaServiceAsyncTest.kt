// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
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
internal class MediaServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mediaServiceAsync = client.media()

        val mediaFuture = mediaServiceAsync.retrieve("media_name")

        val media = mediaFuture.get()
        media.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mediaServiceAsync = client.media()

        val mediaFuture =
            mediaServiceAsync.update(
                MediaUpdateParams.builder()
                    .mediaName("media_name")
                    .mediaUrl("http://www.example.com/audio.mp3")
                    .ttlSecs(86400L)
                    .build()
            )

        val media = mediaFuture.get()
        media.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mediaServiceAsync = client.media()

        val mediaFuture =
            mediaServiceAsync.list(
                MediaListParams.builder()
                    .filter(
                        MediaListParams.Filter.builder().addContentType("application_xml").build()
                    )
                    .build()
            )

        val media = mediaFuture.get()
        media.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mediaServiceAsync = client.media()

        val future = mediaServiceAsync.delete("media_name")

        val response = future.get()
    }

    @Test
    fun download(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val mediaServiceAsync = client.media()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture = mediaServiceAsync.download("media_name")

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun upload() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mediaServiceAsync = client.media()

        val responseFuture =
            mediaServiceAsync.upload(
                MediaUploadParams.builder()
                    .mediaUrl("http://www.example.com/audio.mp3")
                    .mediaName("my-file")
                    .ttlSecs(86400L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
