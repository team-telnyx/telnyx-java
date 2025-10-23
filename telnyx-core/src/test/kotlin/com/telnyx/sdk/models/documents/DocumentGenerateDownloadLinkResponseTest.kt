// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.documents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentGenerateDownloadLinkResponseTest {

    @Test
    fun create() {
        val documentGenerateDownloadLinkResponse =
            DocumentGenerateDownloadLinkResponse.builder()
                .data(
                    DocumentGenerateDownloadLinkResponse.Data.builder()
                        .url(
                            "https://s3.amazonaws.com/bucket/path/to/document?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=..."
                        )
                        .build()
                )
                .build()

        assertThat(documentGenerateDownloadLinkResponse.data())
            .isEqualTo(
                DocumentGenerateDownloadLinkResponse.Data.builder()
                    .url(
                        "https://s3.amazonaws.com/bucket/path/to/document?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=..."
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentGenerateDownloadLinkResponse =
            DocumentGenerateDownloadLinkResponse.builder()
                .data(
                    DocumentGenerateDownloadLinkResponse.Data.builder()
                        .url(
                            "https://s3.amazonaws.com/bucket/path/to/document?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=..."
                        )
                        .build()
                )
                .build()

        val roundtrippedDocumentGenerateDownloadLinkResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentGenerateDownloadLinkResponse),
                jacksonTypeRef<DocumentGenerateDownloadLinkResponse>(),
            )

        assertThat(roundtrippedDocumentGenerateDownloadLinkResponse)
            .isEqualTo(documentGenerateDownloadLinkResponse)
    }
}
