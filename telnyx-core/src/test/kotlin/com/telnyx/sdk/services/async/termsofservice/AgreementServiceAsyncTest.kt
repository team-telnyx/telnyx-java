// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.termsofservice

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AgreementServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val agreementServiceAsync = client.termsOfService().agreements()

        val tosAgreementWrappedFuture =
            agreementServiceAsync.retrieve("550e8400-e29b-41d4-a716-446655440000")

        val tosAgreementWrapped = tosAgreementWrappedFuture.get()
        tosAgreementWrapped.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val agreementServiceAsync = client.termsOfService().agreements()

        val pageFuture = agreementServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
