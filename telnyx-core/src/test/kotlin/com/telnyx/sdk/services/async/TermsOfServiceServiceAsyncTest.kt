// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.termsofservice.TermsOfServiceRetrieveInfoParams
import com.telnyx.sdk.models.termsofservice.TermsOfServiceStatusParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TermsOfServiceServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveInfo() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val termsOfServiceServiceAsync = client.termsOfService()

        val responseFuture =
            termsOfServiceServiceAsync.retrieveInfo(
                TermsOfServiceRetrieveInfoParams.builder()
                    .productType(TermsOfServiceRetrieveInfoParams.ProductType.BRANDED_CALLING)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun status() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val termsOfServiceServiceAsync = client.termsOfService()

        val responseFuture =
            termsOfServiceServiceAsync.status(
                TermsOfServiceStatusParams.builder()
                    .productType(TermsOfServiceStatusParams.ProductType.BRANDED_CALLING)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
