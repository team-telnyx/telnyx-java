// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.messages

import com.telnyx.sdk.core.ClientOptions
import java.util.function.Consumer

class WhatsappServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WhatsappServiceAsync {

    private val withRawResponse: WhatsappServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WhatsappServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WhatsappServiceAsync =
        WhatsappServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WhatsappServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WhatsappServiceAsync.WithRawResponse =
            WhatsappServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
