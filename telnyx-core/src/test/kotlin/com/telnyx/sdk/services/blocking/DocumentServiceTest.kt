// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
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
internal class DocumentServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val documentService = client.documents()

        val document = documentService.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        document.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val documentService = client.documents()

        val document =
            documentService.update(
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

        document.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val documentService = client.documents()

        val page = documentService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val documentService = client.documents()

        val document = documentService.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        document.validate()
    }

    @Test
    fun download(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val documentService = client.documents()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response = documentService.download("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun generateDownloadLink() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val documentService = client.documents()

        val response = documentService.generateDownloadLink("550e8400-e29b-41d4-a716-446655440000")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upload() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val documentService = client.documents()

        val response =
            documentService.upload(
                DocumentUploadParams.builder()
                    .customerReference("MY REF 001")
                    .file("ZXhhbXBsZSBvZiBlbmNvZGVkIGNvbnRlbnQ=")
                    .filename("test-document.pdf")
                    .url("https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun uploadJson() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val documentService = client.documents()

        val response =
            documentService.uploadJson(
                DocumentUploadJsonParams.builder()
                    .customerReference("MY REF 001")
                    .file("ZXhhbXBsZSBvZiBlbmNvZGVkIGNvbnRlbnQ=")
                    .filename("test-document.pdf")
                    .url("https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf")
                    .build()
            )

        response.validate()
    }
}
