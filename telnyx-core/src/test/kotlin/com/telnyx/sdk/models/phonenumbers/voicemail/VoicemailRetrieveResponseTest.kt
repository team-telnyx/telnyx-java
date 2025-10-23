// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.voicemail

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoicemailRetrieveResponseTest {

    @Test
    fun create() {
        val voicemailRetrieveResponse =
            VoicemailRetrieveResponse.builder()
                .data(VoicemailPrefResponse.builder().enabled(true).pin("1234").build())
                .build()

        assertThat(voicemailRetrieveResponse.data())
            .contains(VoicemailPrefResponse.builder().enabled(true).pin("1234").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voicemailRetrieveResponse =
            VoicemailRetrieveResponse.builder()
                .data(VoicemailPrefResponse.builder().enabled(true).pin("1234").build())
                .build()

        val roundtrippedVoicemailRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voicemailRetrieveResponse),
                jacksonTypeRef<VoicemailRetrieveResponse>(),
            )

        assertThat(roundtrippedVoicemailRetrieveResponse).isEqualTo(voicemailRetrieveResponse)
    }
}
