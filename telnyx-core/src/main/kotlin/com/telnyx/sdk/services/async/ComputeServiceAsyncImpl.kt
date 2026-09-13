// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.compute.FuncServiceAsync
import com.telnyx.sdk.services.async.compute.FuncServiceAsyncImpl
import java.util.function.Consumer

class ComputeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ComputeServiceAsync {

    private val withRawResponse: ComputeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val funcs: FuncServiceAsync by lazy { FuncServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ComputeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ComputeServiceAsync =
        ComputeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun funcs(): FuncServiceAsync = funcs

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ComputeServiceAsync.WithRawResponse {

        private val funcs: FuncServiceAsync.WithRawResponse by lazy {
            FuncServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ComputeServiceAsync.WithRawResponse =
            ComputeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun funcs(): FuncServiceAsync.WithRawResponse = funcs
    }
}
