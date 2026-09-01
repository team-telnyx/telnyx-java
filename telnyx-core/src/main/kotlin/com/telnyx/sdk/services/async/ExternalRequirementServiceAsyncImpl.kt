// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.externalrequirements.SubNumberOrderServiceAsync
import com.telnyx.sdk.services.async.externalrequirements.SubNumberOrderServiceAsyncImpl
import java.util.function.Consumer

class ExternalRequirementServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ExternalRequirementServiceAsync {

    private val withRawResponse: ExternalRequirementServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val subNumberOrders: SubNumberOrderServiceAsync by lazy {
        SubNumberOrderServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): ExternalRequirementServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ExternalRequirementServiceAsync =
        ExternalRequirementServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    /** Requirement Groups */
    override fun subNumberOrders(): SubNumberOrderServiceAsync = subNumberOrders

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExternalRequirementServiceAsync.WithRawResponse {

        private val subNumberOrders: SubNumberOrderServiceAsync.WithRawResponse by lazy {
            SubNumberOrderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExternalRequirementServiceAsync.WithRawResponse =
            ExternalRequirementServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Requirement Groups */
        override fun subNumberOrders(): SubNumberOrderServiceAsync.WithRawResponse = subNumberOrders
    }
}
