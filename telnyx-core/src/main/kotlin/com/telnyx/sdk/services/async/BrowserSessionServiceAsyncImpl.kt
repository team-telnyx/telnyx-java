// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import java.util.function.Consumer

class BrowserSessionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : BrowserSessionServiceAsync {

    private val withRawResponse: BrowserSessionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BrowserSessionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): BrowserSessionServiceAsync =
        BrowserSessionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BrowserSessionServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BrowserSessionServiceAsync.WithRawResponse =
            BrowserSessionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
