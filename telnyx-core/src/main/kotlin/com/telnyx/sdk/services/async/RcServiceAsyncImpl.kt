// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.rcs.AgentServiceAsync
import com.telnyx.sdk.services.async.rcs.AgentServiceAsyncImpl
import java.util.function.Consumer

class RcServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RcServiceAsync {

    private val withRawResponse: RcServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val agents: AgentServiceAsync by lazy { AgentServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): RcServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RcServiceAsync =
        RcServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun agents(): AgentServiceAsync = agents

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RcServiceAsync.WithRawResponse {

        private val agents: AgentServiceAsync.WithRawResponse by lazy {
            AgentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RcServiceAsync.WithRawResponse =
            RcServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun agents(): AgentServiceAsync.WithRawResponse = agents
    }
}
