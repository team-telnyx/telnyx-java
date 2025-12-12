// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.campaign

import com.telnyx.sdk.core.ClientOptions
import java.util.function.Consumer

class UsecaseServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UsecaseServiceAsync {

    private val withRawResponse: UsecaseServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UsecaseServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsecaseServiceAsync =
        UsecaseServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UsecaseServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UsecaseServiceAsync.WithRawResponse =
            UsecaseServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
