// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.termsofservice.NumberReputationService
import com.telnyx.sdk.services.blocking.termsofservice.NumberReputationServiceImpl
import java.util.function.Consumer

class TermsOfServiceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TermsOfServiceService {

    private val withRawResponse: TermsOfServiceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val numberReputation: NumberReputationService by lazy {
        NumberReputationServiceImpl(clientOptions)
    }

    override fun withRawResponse(): TermsOfServiceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TermsOfServiceService =
        TermsOfServiceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Terms of Service agreement endpoints */
    override fun numberReputation(): NumberReputationService = numberReputation

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TermsOfServiceService.WithRawResponse {

        private val numberReputation: NumberReputationService.WithRawResponse by lazy {
            NumberReputationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TermsOfServiceService.WithRawResponse =
            TermsOfServiceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Terms of Service agreement endpoints */
        override fun numberReputation(): NumberReputationService.WithRawResponse = numberReputation
    }
}
