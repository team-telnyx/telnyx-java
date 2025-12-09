// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.campaign

import com.telnyx.sdk.core.ClientOptions
import java.util.function.Consumer

class OsrServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OsrServiceAsync {

    private val withRawResponse: OsrServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OsrServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OsrServiceAsync =
        OsrServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OsrServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OsrServiceAsync.WithRawResponse =
            OsrServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
