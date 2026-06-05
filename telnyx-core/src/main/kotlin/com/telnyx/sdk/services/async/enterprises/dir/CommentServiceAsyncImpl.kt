// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.enterprises.dir

import com.telnyx.sdk.core.ClientOptions
import java.util.function.Consumer

class CommentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CommentServiceAsync {

    private val withRawResponse: CommentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CommentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommentServiceAsync =
        CommentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CommentServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CommentServiceAsync.WithRawResponse =
            CommentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
