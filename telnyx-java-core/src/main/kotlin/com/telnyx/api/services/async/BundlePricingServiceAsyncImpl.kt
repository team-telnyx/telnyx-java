// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.services.async.bundlepricing.BillingBundleServiceAsync
import com.telnyx.api.services.async.bundlepricing.BillingBundleServiceAsyncImpl
import com.telnyx.api.services.async.bundlepricing.UserBundleServiceAsync
import com.telnyx.api.services.async.bundlepricing.UserBundleServiceAsyncImpl
import java.util.function.Consumer

class BundlePricingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BundlePricingServiceAsync {

    private val withRawResponse: BundlePricingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val billingBundles: BillingBundleServiceAsync by lazy {
        BillingBundleServiceAsyncImpl(clientOptions)
    }

    private val userBundles: UserBundleServiceAsync by lazy {
        UserBundleServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): BundlePricingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BundlePricingServiceAsync =
        BundlePricingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun billingBundles(): BillingBundleServiceAsync = billingBundles

    override fun userBundles(): UserBundleServiceAsync = userBundles

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BundlePricingServiceAsync.WithRawResponse {

        private val billingBundles: BillingBundleServiceAsync.WithRawResponse by lazy {
            BillingBundleServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val userBundles: UserBundleServiceAsync.WithRawResponse by lazy {
            UserBundleServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BundlePricingServiceAsync.WithRawResponse =
            BundlePricingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun billingBundles(): BillingBundleServiceAsync.WithRawResponse = billingBundles

        override fun userBundles(): UserBundleServiceAsync.WithRawResponse = userBundles
    }
}
