// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.texml.accounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TexmlRecordingSubresourcesUrisTest {

    @Test
    fun create() {
        val texmlRecordingSubresourcesUris =
            TexmlRecordingSubresourcesUris.builder()
                .transcriptions(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Recordings/b08f0fa1-a32c-4218-b3b5-9cf78941ccac/Transcriptions.json"
                )
                .build()

        assertThat(texmlRecordingSubresourcesUris.transcriptions())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Recordings/b08f0fa1-a32c-4218-b3b5-9cf78941ccac/Transcriptions.json"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val texmlRecordingSubresourcesUris =
            TexmlRecordingSubresourcesUris.builder()
                .transcriptions(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Recordings/b08f0fa1-a32c-4218-b3b5-9cf78941ccac/Transcriptions.json"
                )
                .build()

        val roundtrippedTexmlRecordingSubresourcesUris =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(texmlRecordingSubresourcesUris),
                jacksonTypeRef<TexmlRecordingSubresourcesUris>(),
            )

        assertThat(roundtrippedTexmlRecordingSubresourcesUris)
            .isEqualTo(texmlRecordingSubresourcesUris)
    }
}
