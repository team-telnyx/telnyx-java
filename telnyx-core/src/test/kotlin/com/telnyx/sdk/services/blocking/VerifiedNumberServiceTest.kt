// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.verifiednumbers.VerifiedNumberCreateParams
import com.telnyx.sdk.models.verifiednumbers.VerifiedNumberListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VerifiedNumberServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val verifiedNumberService = client.verifiedNumbers()

        val verifiedNumber =
            verifiedNumberService.create(
                VerifiedNumberCreateParams.builder()
                    .phoneNumber("+15551234567")
                    .verificationMethod(VerifiedNumberCreateParams.VerificationMethod.SMS)
                    .extension("ww243w1")
                    .build()
            )

        verifiedNumber.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val verifiedNumberService = client.verifiedNumbers()

        val verifiedNumberDataWrapper = verifiedNumberService.retrieve("+15551234567")

        verifiedNumberDataWrapper.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val verifiedNumberService = client.verifiedNumbers()

        val verifiedNumbers =
            verifiedNumberService.list(
                VerifiedNumberListParams.builder()
                    .page(VerifiedNumberListParams.Page.builder().number(0L).size(0L).build())
                    .build()
            )

        verifiedNumbers.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val verifiedNumberService = client.verifiedNumbers()

        val verifiedNumberDataWrapper = verifiedNumberService.delete("+15551234567")

        verifiedNumberDataWrapper.validate()
    }
}
