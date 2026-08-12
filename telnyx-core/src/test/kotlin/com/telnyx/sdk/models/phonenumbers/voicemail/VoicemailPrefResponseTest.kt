// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.voicemail

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoicemailPrefResponseTest {

    @Test
    fun create() {
        val voicemailPrefResponse =
            VoicemailPrefResponse.builder()
                .enabled(true)
                .greeting(
                    VoicemailPrefResponse.Greeting.builder()
                        .mediaName("my_voicemail_greeting")
                        .mode(VoicemailPrefResponse.Greeting.Mode.CUSTOM_GREETING)
                        .build()
                )
                .pin("1234")
                .build()

        assertThat(voicemailPrefResponse.enabled()).contains(true)
        assertThat(voicemailPrefResponse.greeting())
            .contains(
                VoicemailPrefResponse.Greeting.builder()
                    .mediaName("my_voicemail_greeting")
                    .mode(VoicemailPrefResponse.Greeting.Mode.CUSTOM_GREETING)
                    .build()
            )
        assertThat(voicemailPrefResponse.pin()).contains("1234")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voicemailPrefResponse =
            VoicemailPrefResponse.builder()
                .enabled(true)
                .greeting(
                    VoicemailPrefResponse.Greeting.builder()
                        .mediaName("my_voicemail_greeting")
                        .mode(VoicemailPrefResponse.Greeting.Mode.CUSTOM_GREETING)
                        .build()
                )
                .pin("1234")
                .build()

        val roundtrippedVoicemailPrefResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voicemailPrefResponse),
                jacksonTypeRef<VoicemailPrefResponse>(),
            )

        assertThat(roundtrippedVoicemailPrefResponse).isEqualTo(voicemailPrefResponse)
    }
}
