// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.bundlepricing.BillingBundleService
import com.telnyx.sdk.services.blocking.bundlepricing.BillingBundleServiceImpl
import com.telnyx.sdk.services.blocking.bundlepricing.UserBundleService
import com.telnyx.sdk.services.blocking.bundlepricing.UserBundleServiceImpl
import java.util.function.Consumer

class BundlePricingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BundlePricingService {

    private val withRawResponse: BundlePricingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val billingBundles: BillingBundleService by lazy {
        BillingBundleServiceImpl(clientOptions)
    }

    private val userBundles: UserBundleService by lazy { UserBundleServiceImpl(clientOptions) }

    override fun withRawResponse(): BundlePricingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BundlePricingService =
        BundlePricingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun billingBundles(): BillingBundleService = billingBundles

    override fun userBundles(): UserBundleService = userBundles

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BundlePricingService.WithRawResponse {

        private val billingBundles: BillingBundleService.WithRawResponse by lazy {
            BillingBundleServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val userBundles: UserBundleService.WithRawResponse by lazy {
            UserBundleServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BundlePricingService.WithRawResponse =
            BundlePricingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun billingBundles(): BillingBundleService.WithRawResponse = billingBundles

        override fun userBundles(): UserBundleService.WithRawResponse = userBundles
    }
}
