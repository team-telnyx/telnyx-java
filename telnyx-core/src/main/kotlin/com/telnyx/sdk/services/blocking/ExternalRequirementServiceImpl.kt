// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.externalrequirements.SubNumberOrderService
import com.telnyx.sdk.services.blocking.externalrequirements.SubNumberOrderServiceImpl
import java.util.function.Consumer

class ExternalRequirementServiceImpl
internal constructor(private val clientOptions: ClientOptions) : ExternalRequirementService {

    private val withRawResponse: ExternalRequirementService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val subNumberOrders: SubNumberOrderService by lazy {
        SubNumberOrderServiceImpl(clientOptions)
    }

    override fun withRawResponse(): ExternalRequirementService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ExternalRequirementService =
        ExternalRequirementServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Requirement Groups */
    override fun subNumberOrders(): SubNumberOrderService = subNumberOrders

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExternalRequirementService.WithRawResponse {

        private val subNumberOrders: SubNumberOrderService.WithRawResponse by lazy {
            SubNumberOrderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExternalRequirementService.WithRawResponse =
            ExternalRequirementServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Requirement Groups */
        override fun subNumberOrders(): SubNumberOrderService.WithRawResponse = subNumberOrders
    }
}
