// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentTest {

    @Test
    fun create() {
        val document =
            Document.builder()
                .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                .documentType(Document.DocumentType.BUSINESS_REGISTRATION)
                .description("Certificate of incorporation.")
                .build()

        assertThat(document.documentId()).isEqualTo("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
        assertThat(document.documentType()).isEqualTo(Document.DocumentType.BUSINESS_REGISTRATION)
        assertThat(document.description()).contains("Certificate of incorporation.")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val document =
            Document.builder()
                .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                .documentType(Document.DocumentType.BUSINESS_REGISTRATION)
                .description("Certificate of incorporation.")
                .build()

        val roundtrippedDocument =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(document),
                jacksonTypeRef<Document>(),
            )

        assertThat(roundtrippedDocument).isEqualTo(document)
    }
}
