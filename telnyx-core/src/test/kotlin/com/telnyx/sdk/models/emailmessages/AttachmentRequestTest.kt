// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailmessages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttachmentRequestTest {

    @Test
    fun create() {
        val attachmentRequest =
            AttachmentRequest.builder()
                .content("content")
                .contentId("content_id")
                .contentType("content_type")
                .disposition("disposition")
                .filename("filename")
                .build()

        assertThat(attachmentRequest.content()).contains("content")
        assertThat(attachmentRequest.contentId()).contains("content_id")
        assertThat(attachmentRequest.contentType()).contains("content_type")
        assertThat(attachmentRequest.disposition()).contains("disposition")
        assertThat(attachmentRequest.filename()).contains("filename")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val attachmentRequest =
            AttachmentRequest.builder()
                .content("content")
                .contentId("content_id")
                .contentType("content_type")
                .disposition("disposition")
                .filename("filename")
                .build()

        val roundtrippedAttachmentRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(attachmentRequest),
                jacksonTypeRef<AttachmentRequest>(),
            )

        assertThat(roundtrippedAttachmentRequest).isEqualTo(attachmentRequest)
    }
}
