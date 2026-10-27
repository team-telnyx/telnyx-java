// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.artifactdownloads.ArtifactDownloadRetrieveParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ArtifactDownloadServiceAsyncTest {

    @Test
    fun retrieve(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val artifactDownloadServiceAsync = client.artifactDownloads()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val artifactDownloadFuture =
            artifactDownloadServiceAsync.retrieve(
                ArtifactDownloadRetrieveParams.builder()
                    .artifactId("artifactId")
                    .expires("expires")
                    .sig("sig")
                    .build()
            )

        val artifactDownload = artifactDownloadFuture.get()
        assertThat(artifactDownload.body()).hasContent("abc")
    }
}
