// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.reputation.NumberServiceAsync
import com.telnyx.sdk.services.async.reputation.NumberServiceAsyncImpl
import java.util.function.Consumer

class ReputationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ReputationServiceAsync {

    private val withRawResponse: ReputationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val numbers: NumberServiceAsync by lazy { NumberServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ReputationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReputationServiceAsync =
        ReputationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Associate phone numbers with an enterprise for reputation monitoring and retrieve reputation
     * scores
     */
    override fun numbers(): NumberServiceAsync = numbers

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReputationServiceAsync.WithRawResponse {

        private val numbers: NumberServiceAsync.WithRawResponse by lazy {
            NumberServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReputationServiceAsync.WithRawResponse =
            ReputationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Associate phone numbers with an enterprise for reputation monitoring and retrieve
         * reputation scores
         */
        override fun numbers(): NumberServiceAsync.WithRawResponse = numbers
    }
}
