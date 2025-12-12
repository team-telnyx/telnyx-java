// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TexmlRecordingSubresourcesUrisTest {

    @Test
    fun create() {
        val texmlRecordingSubresourcesUris =
            TexmlRecordingSubresourcesUris.builder().transcriptions("https://example.com").build()

        assertThat(texmlRecordingSubresourcesUris.transcriptions()).contains("https://example.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val texmlRecordingSubresourcesUris =
            TexmlRecordingSubresourcesUris.builder().transcriptions("https://example.com").build()

        val roundtrippedTexmlRecordingSubresourcesUris =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(texmlRecordingSubresourcesUris),
                jacksonTypeRef<TexmlRecordingSubresourcesUris>(),
            )

        assertThat(roundtrippedTexmlRecordingSubresourcesUris)
            .isEqualTo(texmlRecordingSubresourcesUris)
    }
}
