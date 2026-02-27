// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.messagingtollfree

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.messagingtollfree.verification.RequestServiceAsync
import com.telnyx.sdk.services.async.messagingtollfree.verification.RequestServiceAsyncImpl
import java.util.function.Consumer

class VerificationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    VerificationServiceAsync {

    private val withRawResponse: VerificationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val requests: RequestServiceAsync by lazy { RequestServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): VerificationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VerificationServiceAsync =
        VerificationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Manage your tollfree verification requests */
    override fun requests(): RequestServiceAsync = requests

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VerificationServiceAsync.WithRawResponse {

        private val requests: RequestServiceAsync.WithRawResponse by lazy {
            RequestServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VerificationServiceAsync.WithRawResponse =
            VerificationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Manage your tollfree verification requests */
        override fun requests(): RequestServiceAsync.WithRawResponse = requests
    }
}
