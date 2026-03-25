// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.reputation.NumberService
import com.telnyx.sdk.services.blocking.reputation.NumberServiceImpl
import java.util.function.Consumer

class ReputationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ReputationService {

    private val withRawResponse: ReputationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val numbers: NumberService by lazy { NumberServiceImpl(clientOptions) }

    override fun withRawResponse(): ReputationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReputationService =
        ReputationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Associate phone numbers with an enterprise for reputation monitoring and retrieve reputation
     * scores
     */
    override fun numbers(): NumberService = numbers

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReputationService.WithRawResponse {

        private val numbers: NumberService.WithRawResponse by lazy {
            NumberServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReputationService.WithRawResponse =
            ReputationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Associate phone numbers with an enterprise for reputation monitoring and retrieve
         * reputation scores
         */
        override fun numbers(): NumberService.WithRawResponse = numbers
    }
}
