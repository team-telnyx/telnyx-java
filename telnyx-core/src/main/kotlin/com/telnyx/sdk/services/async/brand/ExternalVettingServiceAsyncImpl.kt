// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.brand

import com.telnyx.sdk.core.ClientOptions
import java.util.function.Consumer

class ExternalVettingServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ExternalVettingServiceAsync {

    private val withRawResponse: ExternalVettingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExternalVettingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ExternalVettingServiceAsync =
        ExternalVettingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExternalVettingServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExternalVettingServiceAsync.WithRawResponse =
            ExternalVettingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
