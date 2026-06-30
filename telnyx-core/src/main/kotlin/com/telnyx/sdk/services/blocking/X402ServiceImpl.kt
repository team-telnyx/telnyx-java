// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.x402.CreditAccountService
import com.telnyx.sdk.services.blocking.x402.CreditAccountServiceImpl
import java.util.function.Consumer

class X402ServiceImpl internal constructor(private val clientOptions: ClientOptions) : X402Service {

    private val withRawResponse: X402Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val creditAccount: CreditAccountService by lazy {
        CreditAccountServiceImpl(clientOptions)
    }

    override fun withRawResponse(): X402Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): X402Service =
        X402ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Operations for x402 cryptocurrency payment transactions. Fund your Telnyx account using USDC
     * stablecoin payments via the x402 protocol.
     */
    override fun creditAccount(): CreditAccountService = creditAccount

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        X402Service.WithRawResponse {

        private val creditAccount: CreditAccountService.WithRawResponse by lazy {
            CreditAccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): X402Service.WithRawResponse =
            X402ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Operations for x402 cryptocurrency payment transactions. Fund your Telnyx account using
         * USDC stablecoin payments via the x402 protocol.
         */
        override fun creditAccount(): CreditAccountService.WithRawResponse = creditAccount
    }
}
