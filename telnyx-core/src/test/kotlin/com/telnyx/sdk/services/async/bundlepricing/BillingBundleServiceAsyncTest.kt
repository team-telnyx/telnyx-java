// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.bundlepricing

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.bundlepricing.billingbundles.BillingBundleRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BillingBundleServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val billingBundleServiceAsync = client.bundlePricing().billingBundles()

        val billingBundleFuture =
            billingBundleServiceAsync.retrieve(
                BillingBundleRetrieveParams.builder()
                    .bundleId("8661948c-a386-4385-837f-af00f40f111a")
                    .authorizationBearer("authorization_bearer")
                    .build()
            )

        val billingBundle = billingBundleFuture.get()
        billingBundle.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val billingBundleServiceAsync = client.bundlePricing().billingBundles()

        val pageFuture = billingBundleServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
