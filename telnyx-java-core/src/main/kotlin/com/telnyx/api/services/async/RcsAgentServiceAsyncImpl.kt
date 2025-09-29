// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import java.util.function.Consumer

class RcsAgentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RcsAgentServiceAsync {

    private val withRawResponse: RcsAgentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RcsAgentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RcsAgentServiceAsync =
        RcsAgentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RcsAgentServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RcsAgentServiceAsync.WithRawResponse =
            RcsAgentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
