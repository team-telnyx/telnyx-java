// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.llmtokengateway.UsageServiceAsync
import com.telnyx.sdk.services.async.llmtokengateway.UsageServiceAsyncImpl
import java.util.function.Consumer

class LlmTokenGatewayServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : LlmTokenGatewayServiceAsync {

    private val withRawResponse: LlmTokenGatewayServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val usage: UsageServiceAsync by lazy { UsageServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): LlmTokenGatewayServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): LlmTokenGatewayServiceAsync =
        LlmTokenGatewayServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Manage and report AI Gateway traffic. */
    override fun usage(): UsageServiceAsync = usage

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LlmTokenGatewayServiceAsync.WithRawResponse {

        private val usage: UsageServiceAsync.WithRawResponse by lazy {
            UsageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LlmTokenGatewayServiceAsync.WithRawResponse =
            LlmTokenGatewayServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Manage and report AI Gateway traffic. */
        override fun usage(): UsageServiceAsync.WithRawResponse = usage
    }
}
