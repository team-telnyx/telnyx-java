// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.llmtokengateway.UsageService
import com.telnyx.sdk.services.blocking.llmtokengateway.UsageServiceImpl
import java.util.function.Consumer

class LlmTokenGatewayServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LlmTokenGatewayService {

    private val withRawResponse: LlmTokenGatewayService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val usage: UsageService by lazy { UsageServiceImpl(clientOptions) }

    override fun withRawResponse(): LlmTokenGatewayService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LlmTokenGatewayService =
        LlmTokenGatewayServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Manage and report AI Gateway traffic. */
    override fun usage(): UsageService = usage

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LlmTokenGatewayService.WithRawResponse {

        private val usage: UsageService.WithRawResponse by lazy {
            UsageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LlmTokenGatewayService.WithRawResponse =
            LlmTokenGatewayServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Manage and report AI Gateway traffic. */
        override fun usage(): UsageService.WithRawResponse = usage
    }
}
