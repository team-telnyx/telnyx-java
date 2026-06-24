// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.termsofservice

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BrandedCallingServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun agree() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val brandedCallingServiceAsync = client.termsOfService().brandedCalling()

        val tosAgreementWrappedFuture = brandedCallingServiceAsync.agree()

        val tosAgreementWrapped = tosAgreementWrappedFuture.get()
        tosAgreementWrapped.validate()
    }
}
