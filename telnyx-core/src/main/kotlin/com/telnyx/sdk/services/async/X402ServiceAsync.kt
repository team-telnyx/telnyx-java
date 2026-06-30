// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.x402.CreditAccountServiceAsync
import java.util.function.Consumer

interface X402ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): X402ServiceAsync

    /**
     * Operations for x402 cryptocurrency payment transactions. Fund your Telnyx account using USDC
     * stablecoin payments via the x402 protocol.
     */
    fun creditAccount(): CreditAccountServiceAsync

    /** A view of [X402ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): X402ServiceAsync.WithRawResponse

        /**
         * Operations for x402 cryptocurrency payment transactions. Fund your Telnyx account using
         * USDC stablecoin payments via the x402 protocol.
         */
        fun creditAccount(): CreditAccountServiceAsync.WithRawResponse
    }
}
