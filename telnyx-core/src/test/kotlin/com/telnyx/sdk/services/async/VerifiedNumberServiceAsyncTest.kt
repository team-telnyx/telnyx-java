// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.verifiednumbers.VerifiedNumberCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VerifiedNumberServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val verifiedNumberServiceAsync = client.verifiedNumbers()

        val verifiedNumberFuture =
            verifiedNumberServiceAsync.create(
                VerifiedNumberCreateParams.builder()
                    .phoneNumber("+15551234567")
                    .verificationMethod(VerifiedNumberCreateParams.VerificationMethod.SMS)
                    .extension("ww243w1")
                    .build()
            )

        val verifiedNumber = verifiedNumberFuture.get()
        verifiedNumber.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val verifiedNumberServiceAsync = client.verifiedNumbers()

        val verifiedNumberDataWrapperFuture = verifiedNumberServiceAsync.retrieve("+15551234567")

        val verifiedNumberDataWrapper = verifiedNumberDataWrapperFuture.get()
        verifiedNumberDataWrapper.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val verifiedNumberServiceAsync = client.verifiedNumbers()

        val pageFuture = verifiedNumberServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val verifiedNumberServiceAsync = client.verifiedNumbers()

        val verifiedNumberDataWrapperFuture = verifiedNumberServiceAsync.delete("+15551234567")

        val verifiedNumberDataWrapper = verifiedNumberDataWrapperFuture.get()
        verifiedNumberDataWrapper.validate()
    }
}
