// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.voicemail

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoicemailRequestTest {

    @Test
    fun create() {
        val voicemailRequest = VoicemailRequest.builder().enabled(true).pin("pin").build()

        assertThat(voicemailRequest.enabled()).contains(true)
        assertThat(voicemailRequest.pin()).contains("pin")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voicemailRequest = VoicemailRequest.builder().enabled(true).pin("pin").build()

        val roundtrippedVoicemailRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voicemailRequest),
                jacksonTypeRef<VoicemailRequest>(),
            )

        assertThat(roundtrippedVoicemailRequest).isEqualTo(voicemailRequest)
    }
}
