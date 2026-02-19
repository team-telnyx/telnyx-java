// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.documents.DocServiceDocument
import com.telnyx.sdk.models.documents.DocumentUpdateParams
import com.telnyx.sdk.models.documents.DocumentUploadJsonParams
import com.telnyx.sdk.models.documents.DocumentUploadParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class DocumentServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val documentServiceAsync = client.documents()

        val documentFuture = documentServiceAsync.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val document = documentFuture.get()
        document.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val documentServiceAsync = client.documents()

        val documentFuture =
            documentServiceAsync.update(
                DocumentUpdateParams.builder()
                    .documentId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .docServiceDocument(
                        DocServiceDocument.builder()
                            .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                            .avScanStatus(DocServiceDocument.AvScanStatus.SCANNED)
                            .contentType("application/pdf")
                            .createdAt("2018-02-02T22:25:27.521Z")
                            .customerReference("MY REF 001")
                            .filename("test-document.pdf")
                            .recordType("document")
                            .sha256(
                                "08a96c641c3a74e44eb59afb61a24f2cb9f4d7188748e76ba4bb5edfa3cb7d1c"
                            )
                            .size(
                                DocServiceDocument.Size.builder()
                                    .amount(123456L)
                                    .unit("bytes")
                                    .build()
                            )
                            .status(DocServiceDocument.Status.PENDING)
                            .updatedAt("2018-02-02T22:25:27.521Z")
                            .build()
                    )
                    .build()
            )

        val document = documentFuture.get()
        document.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val documentServiceAsync = client.documents()

        val pageFuture = documentServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val documentServiceAsync = client.documents()

        val documentFuture = documentServiceAsync.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val document = documentFuture.get()
        document.validate()
    }

    @Test
    fun download(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val documentServiceAsync = client.documents()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture = documentServiceAsync.download("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun generateDownloadLink() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val documentServiceAsync = client.documents()

        val responseFuture =
            documentServiceAsync.generateDownloadLink("550e8400-e29b-41d4-a716-446655440000")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun upload() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val documentServiceAsync = client.documents()

        val responseFuture =
            documentServiceAsync.upload(
                DocumentUploadParams.builder()
                    .customerReference("MY REF 001")
                    .file("ZXhhbXBsZSBvZiBlbmNvZGVkIGNvbnRlbnQ=")
                    .filename("test-document.pdf")
                    .url("https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun uploadJson() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val documentServiceAsync = client.documents()

        val responseFuture =
            documentServiceAsync.uploadJson(
                DocumentUploadJsonParams.builder()
                    .customerReference("MY REF 001")
                    .file("ZXhhbXBsZSBvZiBlbmNvZGVkIGNvbnRlbnQ=")
                    .filename("test-document.pdf")
                    .url("https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
