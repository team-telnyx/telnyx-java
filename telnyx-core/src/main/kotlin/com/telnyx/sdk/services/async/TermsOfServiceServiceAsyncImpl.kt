// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.termsofservice.NumberReputationServiceAsync
import com.telnyx.sdk.services.async.termsofservice.NumberReputationServiceAsyncImpl
import java.util.function.Consumer

class TermsOfServiceServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : TermsOfServiceServiceAsync {

    private val withRawResponse: TermsOfServiceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val numberReputation: NumberReputationServiceAsync by lazy {
        NumberReputationServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): TermsOfServiceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): TermsOfServiceServiceAsync =
        TermsOfServiceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Terms of Service agreement endpoints */
    override fun numberReputation(): NumberReputationServiceAsync = numberReputation

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TermsOfServiceServiceAsync.WithRawResponse {

        private val numberReputation: NumberReputationServiceAsync.WithRawResponse by lazy {
            NumberReputationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TermsOfServiceServiceAsync.WithRawResponse =
            TermsOfServiceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Terms of Service agreement endpoints */
        override fun numberReputation(): NumberReputationServiceAsync.WithRawResponse =
            numberReputation
    }
}
