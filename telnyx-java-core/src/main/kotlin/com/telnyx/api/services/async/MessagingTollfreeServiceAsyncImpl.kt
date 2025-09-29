// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.services.async.messagingtollfree.VerificationServiceAsync
import com.telnyx.api.services.async.messagingtollfree.VerificationServiceAsyncImpl
import java.util.function.Consumer

class MessagingTollfreeServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : MessagingTollfreeServiceAsync {

    private val withRawResponse: MessagingTollfreeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val verification: VerificationServiceAsync by lazy {
        VerificationServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): MessagingTollfreeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): MessagingTollfreeServiceAsync =
        MessagingTollfreeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun verification(): VerificationServiceAsync = verification

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MessagingTollfreeServiceAsync.WithRawResponse {

        private val verification: VerificationServiceAsync.WithRawResponse by lazy {
            VerificationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessagingTollfreeServiceAsync.WithRawResponse =
            MessagingTollfreeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun verification(): VerificationServiceAsync.WithRawResponse = verification
    }
}
