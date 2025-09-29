// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.phonenumbers

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.phonenumbers.voicemail.VoicemailCreateParams
import com.telnyx.api.models.phonenumbers.voicemail.VoicemailRequest
import com.telnyx.api.models.phonenumbers.voicemail.VoicemailUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VoicemailServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val voicemailService = client.phoneNumbers().voicemail()

        val voicemail =
            voicemailService.create(
                VoicemailCreateParams.builder()
                    .phoneNumberId("123455678900")
                    .voicemailRequest(VoicemailRequest.builder().enabled(true).pin("pin").build())
                    .build()
            )

        voicemail.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val voicemailService = client.phoneNumbers().voicemail()

        val voicemail = voicemailService.retrieve("123455678900")

        voicemail.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val voicemailService = client.phoneNumbers().voicemail()

        val voicemail =
            voicemailService.update(
                VoicemailUpdateParams.builder()
                    .phoneNumberId("123455678900")
                    .voicemailRequest(VoicemailRequest.builder().enabled(true).pin("pin").build())
                    .build()
            )

        voicemail.validate()
    }
}
