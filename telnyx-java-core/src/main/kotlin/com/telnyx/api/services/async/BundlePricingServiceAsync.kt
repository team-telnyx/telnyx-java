// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.services.async.bundlepricing.BillingBundleServiceAsync
import com.telnyx.api.services.async.bundlepricing.UserBundleServiceAsync
import java.util.function.Consumer

interface BundlePricingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BundlePricingServiceAsync

    fun billingBundles(): BillingBundleServiceAsync

    fun userBundles(): UserBundleServiceAsync

    /**
     * A view of [BundlePricingServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BundlePricingServiceAsync.WithRawResponse

        fun billingBundles(): BillingBundleServiceAsync.WithRawResponse

        fun userBundles(): UserBundleServiceAsync.WithRawResponse
    }
}
