// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.voicemail

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoicemailRequestTest {

    @Test
    fun create() {
        val voicemailRequest = VoicemailRequest.builder().enabled(true).pin("1234").build()

        assertThat(voicemailRequest.enabled()).contains(true)
        assertThat(voicemailRequest.pin()).contains("1234")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voicemailRequest = VoicemailRequest.builder().enabled(true).pin("1234").build()

        val roundtrippedVoicemailRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voicemailRequest),
                jacksonTypeRef<VoicemailRequest>(),
            )

        assertThat(roundtrippedVoicemailRequest).isEqualTo(voicemailRequest)
    }
}
