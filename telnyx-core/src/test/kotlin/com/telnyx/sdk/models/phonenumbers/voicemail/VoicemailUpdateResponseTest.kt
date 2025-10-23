// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.voicemail

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoicemailUpdateResponseTest {

    @Test
    fun create() {
        val voicemailUpdateResponse =
            VoicemailUpdateResponse.builder()
                .data(VoicemailPrefResponse.builder().enabled(true).pin("1234").build())
                .build()

        assertThat(voicemailUpdateResponse.data())
            .contains(VoicemailPrefResponse.builder().enabled(true).pin("1234").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voicemailUpdateResponse =
            VoicemailUpdateResponse.builder()
                .data(VoicemailPrefResponse.builder().enabled(true).pin("1234").build())
                .build()

        val roundtrippedVoicemailUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voicemailUpdateResponse),
                jacksonTypeRef<VoicemailUpdateResponse>(),
            )

        assertThat(roundtrippedVoicemailUpdateResponse).isEqualTo(voicemailUpdateResponse)
    }
}
