// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.messaging.RcServiceAsync
import com.telnyx.sdk.services.async.messaging.RcServiceAsyncImpl
import java.util.function.Consumer

class MessagingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MessagingServiceAsync {

    private val withRawResponse: MessagingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val rcs: RcServiceAsync by lazy { RcServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): MessagingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessagingServiceAsync =
        MessagingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun rcs(): RcServiceAsync = rcs

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MessagingServiceAsync.WithRawResponse {

        private val rcs: RcServiceAsync.WithRawResponse by lazy {
            RcServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessagingServiceAsync.WithRawResponse =
            MessagingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun rcs(): RcServiceAsync.WithRawResponse = rcs
    }
}
