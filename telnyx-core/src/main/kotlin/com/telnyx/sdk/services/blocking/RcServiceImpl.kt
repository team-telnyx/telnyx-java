// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.rcs.AgentService
import com.telnyx.sdk.services.blocking.rcs.AgentServiceImpl
import java.util.function.Consumer

class RcServiceImpl internal constructor(private val clientOptions: ClientOptions) : RcService {

    private val withRawResponse: RcService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val agents: AgentService by lazy { AgentServiceImpl(clientOptions) }

    override fun withRawResponse(): RcService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RcService =
        RcServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun agents(): AgentService = agents

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RcService.WithRawResponse {

        private val agents: AgentService.WithRawResponse by lazy {
            AgentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RcService.WithRawResponse =
            RcServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun agents(): AgentService.WithRawResponse = agents
    }
}
