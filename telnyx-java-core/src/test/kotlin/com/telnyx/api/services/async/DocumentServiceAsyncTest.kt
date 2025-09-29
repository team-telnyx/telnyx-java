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
import com.telnyx.api.models.documents.DocServiceDocument
import com.telnyx.api.models.documents.DocumentListParams
import com.telnyx.api.models.documents.DocumentUpdateParams
import com.telnyx.api.models.documents.DocumentUploadParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class DocumentServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentServiceAsync = client.documents()

        val documentFuture = documentServiceAsync.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val document = documentFuture.get()
        document.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentServiceAsync = client.documents()

        val documentFuture =
            documentServiceAsync.update(
                DocumentUpdateParams.builder()
                    .pathId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .docServiceDocument(
                        DocServiceDocument.builder()
                            .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
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
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentServiceAsync = client.documents()

        val documentsFuture =
            documentServiceAsync.list(
                DocumentListParams.builder()
                    .filter(
                        DocumentListParams.Filter.builder()
                            .createdAt(
                                DocumentListParams.Filter.CreatedAt.builder()
                                    .gt(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                                    .lt(OffsetDateTime.parse("2021-04-09T22:25:27.521Z"))
                                    .build()
                            )
                            .customerReference(
                                DocumentListParams.Filter.CustomerReference.builder()
                                    .eq("MY REF 001")
                                    .addIn("REF001")
                                    .addIn("REF002")
                                    .build()
                            )
                            .filename(
                                DocumentListParams.Filter.Filename.builder()
                                    .contains("invoice")
                                    .build()
                            )
                            .build()
                    )
                    .page(DocumentListParams.Page.builder().number(1L).size(1L).build())
                    .addSort(DocumentListParams.Sort.FILENAME)
                    .build()
            )

        val documents = documentsFuture.get()
        documents.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentServiceAsync = client.documents()

        val responseFuture =
            documentServiceAsync.generateDownloadLink("550e8400-e29b-41d4-a716-446655440000")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun upload() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentServiceAsync = client.documents()

        val responseFuture =
            documentServiceAsync.upload(
                DocumentUploadParams.builder()
                    .body(
                        DocumentUploadParams.Body.DocServiceDocumentUploadUrl.builder()
                            .url(
                                "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf"
                            )
                            .customerReference("MY REF 001")
                            .filename("test-document.pdf")
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
