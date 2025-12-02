// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.phonenumbers

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.phonenumbers.voicemail.VoicemailCreateParams
import com.telnyx.sdk.models.phonenumbers.voicemail.VoicemailRequest
import com.telnyx.sdk.models.phonenumbers.voicemail.VoicemailUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VoicemailServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val voicemailServiceAsync = client.phoneNumbers().voicemail()

        val voicemailFuture =
            voicemailServiceAsync.create(
                VoicemailCreateParams.builder()
                    .phoneNumberId("123455678900")
                    .voicemailRequest(VoicemailRequest.builder().enabled(true).pin("1234").build())
                    .build()
            )

        val voicemail = voicemailFuture.get()
        voicemail.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val voicemailServiceAsync = client.phoneNumbers().voicemail()

        val voicemailFuture = voicemailServiceAsync.retrieve("123455678900")

        val voicemail = voicemailFuture.get()
        voicemail.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val voicemailServiceAsync = client.phoneNumbers().voicemail()

        val voicemailFuture =
            voicemailServiceAsync.update(
                VoicemailUpdateParams.builder()
                    .phoneNumberId("123455678900")
                    .voicemailRequest(VoicemailRequest.builder().enabled(true).pin("1234").build())
                    .build()
            )

        val voicemail = voicemailFuture.get()
        voicemail.validate()
    }
}
