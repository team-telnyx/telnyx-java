// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.compute.FuncService
import com.telnyx.sdk.services.blocking.compute.FuncServiceImpl
import java.util.function.Consumer

class ComputeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ComputeService {

    private val withRawResponse: ComputeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val funcs: FuncService by lazy { FuncServiceImpl(clientOptions) }

    override fun withRawResponse(): ComputeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ComputeService =
        ComputeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun funcs(): FuncService = funcs

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ComputeService.WithRawResponse {

        private val funcs: FuncService.WithRawResponse by lazy {
            FuncServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ComputeService.WithRawResponse =
            ComputeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun funcs(): FuncService.WithRawResponse = funcs
    }
}
