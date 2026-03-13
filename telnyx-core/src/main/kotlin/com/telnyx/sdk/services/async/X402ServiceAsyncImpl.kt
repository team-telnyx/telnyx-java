// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.x402.CreditAccountServiceAsync
import com.telnyx.sdk.services.async.x402.CreditAccountServiceAsyncImpl
import java.util.function.Consumer

class X402ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    X402ServiceAsync {

    private val withRawResponse: X402ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val creditAccount: CreditAccountServiceAsync by lazy {
        CreditAccountServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): X402ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): X402ServiceAsync =
        X402ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Operations for x402 cryptocurrency payment transactions. Fund your Telnyx account using USDC
     * stablecoin payments via the x402 protocol.
     */
    override fun creditAccount(): CreditAccountServiceAsync = creditAccount

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        X402ServiceAsync.WithRawResponse {

        private val creditAccount: CreditAccountServiceAsync.WithRawResponse by lazy {
            CreditAccountServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): X402ServiceAsync.WithRawResponse =
            X402ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Operations for x402 cryptocurrency payment transactions. Fund your Telnyx account using
         * USDC stablecoin payments via the x402 protocol.
         */
        override fun creditAccount(): CreditAccountServiceAsync.WithRawResponse = creditAccount
    }
}
