// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.llmtokengateway.SpendService
import com.telnyx.sdk.services.blocking.llmtokengateway.SpendServiceImpl
import com.telnyx.sdk.services.blocking.llmtokengateway.TokenGroupService
import com.telnyx.sdk.services.blocking.llmtokengateway.TokenGroupServiceImpl
import com.telnyx.sdk.services.blocking.llmtokengateway.TokenKeyService
import com.telnyx.sdk.services.blocking.llmtokengateway.TokenKeyServiceImpl
import com.telnyx.sdk.services.blocking.llmtokengateway.UsageService
import com.telnyx.sdk.services.blocking.llmtokengateway.UsageServiceImpl
import java.util.function.Consumer

class LlmTokenGatewayServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LlmTokenGatewayService {

    private val withRawResponse: LlmTokenGatewayService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val usage: UsageService by lazy { UsageServiceImpl(clientOptions) }

    private val spend: SpendService by lazy { SpendServiceImpl(clientOptions) }

    private val tokenGroups: TokenGroupService by lazy { TokenGroupServiceImpl(clientOptions) }

    private val tokenKeys: TokenKeyService by lazy { TokenKeyServiceImpl(clientOptions) }

    override fun withRawResponse(): LlmTokenGatewayService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LlmTokenGatewayService =
        LlmTokenGatewayServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Manage and report AI Gateway usage. */
    override fun usage(): UsageService = usage

    /** Manage and report AI Gateway usage. */
    override fun spend(): SpendService = spend

    /** Manage and report AI Gateway usage. */
    override fun tokenGroups(): TokenGroupService = tokenGroups

    /** Manage and report AI Gateway usage. */
    override fun tokenKeys(): TokenKeyService = tokenKeys

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LlmTokenGatewayService.WithRawResponse {

        private val usage: UsageService.WithRawResponse by lazy {
            UsageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val spend: SpendService.WithRawResponse by lazy {
            SpendServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val tokenGroups: TokenGroupService.WithRawResponse by lazy {
            TokenGroupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val tokenKeys: TokenKeyService.WithRawResponse by lazy {
            TokenKeyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LlmTokenGatewayService.WithRawResponse =
            LlmTokenGatewayServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Manage and report AI Gateway usage. */
        override fun usage(): UsageService.WithRawResponse = usage

        /** Manage and report AI Gateway usage. */
        override fun spend(): SpendService.WithRawResponse = spend

        /** Manage and report AI Gateway usage. */
        override fun tokenGroups(): TokenGroupService.WithRawResponse = tokenGroups

        /** Manage and report AI Gateway usage. */
        override fun tokenKeys(): TokenKeyService.WithRawResponse = tokenKeys
    }
}
