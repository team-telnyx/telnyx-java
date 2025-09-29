// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.externalconnections.uploads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UploadCreateResponseTest {

    @Test
    fun create() {
        val uploadCreateResponse =
            UploadCreateResponse.builder()
                .success(true)
                .ticketId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(uploadCreateResponse.success()).contains(true)
        assertThat(uploadCreateResponse.ticketId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val uploadCreateResponse =
            UploadCreateResponse.builder()
                .success(true)
                .ticketId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedUploadCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(uploadCreateResponse),
                jacksonTypeRef<UploadCreateResponse>(),
            )

        assertThat(roundtrippedUploadCreateResponse).isEqualTo(uploadCreateResponse)
    }
}
