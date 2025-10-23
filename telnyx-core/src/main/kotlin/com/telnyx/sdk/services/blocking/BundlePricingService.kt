// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.bundlepricing.BillingBundleService
import com.telnyx.sdk.services.blocking.bundlepricing.UserBundleService
import java.util.function.Consumer

interface BundlePricingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BundlePricingService

    fun billingBundles(): BillingBundleService

    fun userBundles(): UserBundleService

    /**
     * A view of [BundlePricingService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BundlePricingService.WithRawResponse

        fun billingBundles(): BillingBundleService.WithRawResponse

        fun userBundles(): UserBundleService.WithRawResponse
    }
}
