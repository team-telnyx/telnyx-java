// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.phonenumbers.voicemail

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoicemailPrefResponseTest {

    @Test
    fun create() {
        val voicemailPrefResponse =
            VoicemailPrefResponse.builder().enabled(true).pin("1234").build()

        assertThat(voicemailPrefResponse.enabled()).contains(true)
        assertThat(voicemailPrefResponse.pin()).contains("1234")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voicemailPrefResponse =
            VoicemailPrefResponse.builder().enabled(true).pin("1234").build()

        val roundtrippedVoicemailPrefResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voicemailPrefResponse),
                jacksonTypeRef<VoicemailPrefResponse>(),
            )

        assertThat(roundtrippedVoicemailPrefResponse).isEqualTo(voicemailPrefResponse)
    }
}
