// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.bundlepricing

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.bundlepricing.billingbundles.BillingBundleListParams
import com.telnyx.sdk.models.bundlepricing.billingbundles.BillingBundleRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BillingBundleServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val billingBundleServiceAsync = client.bundlePricing().billingBundles()

        val billingBundlesFuture =
            billingBundleServiceAsync.list(
                BillingBundleListParams.builder()
                    .filter(
                        BillingBundleListParams.Filter.builder()
                            .addCountryIso("US")
                            .addResource("+15617819942")
                            .build()
                    )
                    .page(BillingBundleListParams.Page.builder().number(1L).size(1L).build())
                    .authorizationBearer("authorization_bearer")
                    .build()
            )

        val billingBundles = billingBundlesFuture.get()
        billingBundles.validate()
    }
}
