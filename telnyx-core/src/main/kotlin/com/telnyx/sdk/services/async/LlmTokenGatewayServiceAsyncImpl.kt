// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.llmtokengateway.SpendServiceAsync
import com.telnyx.sdk.services.async.llmtokengateway.SpendServiceAsyncImpl
import com.telnyx.sdk.services.async.llmtokengateway.TokenGroupServiceAsync
import com.telnyx.sdk.services.async.llmtokengateway.TokenGroupServiceAsyncImpl
import com.telnyx.sdk.services.async.llmtokengateway.TokenKeyServiceAsync
import com.telnyx.sdk.services.async.llmtokengateway.TokenKeyServiceAsyncImpl
import com.telnyx.sdk.services.async.llmtokengateway.UsageServiceAsync
import com.telnyx.sdk.services.async.llmtokengateway.UsageServiceAsyncImpl
import java.util.function.Consumer

class LlmTokenGatewayServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : LlmTokenGatewayServiceAsync {

    private val withRawResponse: LlmTokenGatewayServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val usage: UsageServiceAsync by lazy { UsageServiceAsyncImpl(clientOptions) }

    private val spend: SpendServiceAsync by lazy { SpendServiceAsyncImpl(clientOptions) }

    private val tokenGroups: TokenGroupServiceAsync by lazy {
        TokenGroupServiceAsyncImpl(clientOptions)
    }

    private val tokenKeys: TokenKeyServiceAsync by lazy { TokenKeyServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): LlmTokenGatewayServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): LlmTokenGatewayServiceAsync =
        LlmTokenGatewayServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Manage and report AI Gateway usage. */
    override fun usage(): UsageServiceAsync = usage

    /** Manage and report AI Gateway usage. */
    override fun spend(): SpendServiceAsync = spend

    /** Manage and report AI Gateway usage. */
    override fun tokenGroups(): TokenGroupServiceAsync = tokenGroups

    /** Manage and report AI Gateway usage. */
    override fun tokenKeys(): TokenKeyServiceAsync = tokenKeys

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LlmTokenGatewayServiceAsync.WithRawResponse {

        private val usage: UsageServiceAsync.WithRawResponse by lazy {
            UsageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val spend: SpendServiceAsync.WithRawResponse by lazy {
            SpendServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val tokenGroups: TokenGroupServiceAsync.WithRawResponse by lazy {
            TokenGroupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val tokenKeys: TokenKeyServiceAsync.WithRawResponse by lazy {
            TokenKeyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LlmTokenGatewayServiceAsync.WithRawResponse =
            LlmTokenGatewayServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Manage and report AI Gateway usage. */
        override fun usage(): UsageServiceAsync.WithRawResponse = usage

        /** Manage and report AI Gateway usage. */
        override fun spend(): SpendServiceAsync.WithRawResponse = spend

        /** Manage and report AI Gateway usage. */
        override fun tokenGroups(): TokenGroupServiceAsync.WithRawResponse = tokenGroups

        /** Manage and report AI Gateway usage. */
        override fun tokenKeys(): TokenKeyServiceAsync.WithRawResponse = tokenKeys
    }
}
