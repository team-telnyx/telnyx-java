// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.brand

import com.telnyx.sdk.core.ClientOptions
import java.util.function.Consumer

interface SmsOtpServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SmsOtpServiceAsync

    /**
     * A view of [SmsOtpServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SmsOtpServiceAsync.WithRawResponse
    }
}
