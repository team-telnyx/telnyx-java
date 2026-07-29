// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.pricing.ProductService
import com.telnyx.sdk.services.blocking.pricing.ProductServiceImpl
import java.util.function.Consumer

class PricingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PricingService {

    private val withRawResponse: PricingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val products: ProductService by lazy { ProductServiceImpl(clientOptions) }

    override fun withRawResponse(): PricingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PricingService =
        PricingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Public pricing operations */
    override fun products(): ProductService = products

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PricingService.WithRawResponse {

        private val products: ProductService.WithRawResponse by lazy {
            ProductServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PricingService.WithRawResponse =
            PricingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Public pricing operations */
        override fun products(): ProductService.WithRawResponse = products
    }
}
