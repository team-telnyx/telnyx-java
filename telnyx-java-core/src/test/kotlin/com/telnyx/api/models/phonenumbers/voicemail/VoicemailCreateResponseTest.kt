// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.phonenumbers.voicemail

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoicemailCreateResponseTest {

    @Test
    fun create() {
        val voicemailCreateResponse =
            VoicemailCreateResponse.builder()
                .data(VoicemailPrefResponse.builder().enabled(true).pin("1234").build())
                .build()

        assertThat(voicemailCreateResponse.data())
            .contains(VoicemailPrefResponse.builder().enabled(true).pin("1234").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voicemailCreateResponse =
            VoicemailCreateResponse.builder()
                .data(VoicemailPrefResponse.builder().enabled(true).pin("1234").build())
                .build()

        val roundtrippedVoicemailCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voicemailCreateResponse),
                jacksonTypeRef<VoicemailCreateResponse>(),
            )

        assertThat(roundtrippedVoicemailCreateResponse).isEqualTo(voicemailCreateResponse)
    }
}
