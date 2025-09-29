// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.services.async.operatorconnect.ActionServiceAsync
import com.telnyx.api.services.async.operatorconnect.ActionServiceAsyncImpl
import java.util.function.Consumer

class OperatorConnectServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : OperatorConnectServiceAsync {

    private val withRawResponse: OperatorConnectServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionServiceAsync by lazy { ActionServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): OperatorConnectServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): OperatorConnectServiceAsync =
        OperatorConnectServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun actions(): ActionServiceAsync = actions

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OperatorConnectServiceAsync.WithRawResponse {

        private val actions: ActionServiceAsync.WithRawResponse by lazy {
            ActionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OperatorConnectServiceAsync.WithRawResponse =
            OperatorConnectServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun actions(): ActionServiceAsync.WithRawResponse = actions
    }
}
