// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.rcs

import com.telnyx.sdk.core.ClientOptions
import java.util.function.Consumer

class AgentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AgentService {

    private val withRawResponse: AgentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AgentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentService =
        AgentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AgentService.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AgentService.WithRawResponse =
            AgentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
