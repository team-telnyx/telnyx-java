// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.pricing.ProductServiceAsync
import com.telnyx.sdk.services.async.pricing.ProductServiceAsyncImpl
import java.util.function.Consumer

class PricingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PricingServiceAsync {

    private val withRawResponse: PricingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val products: ProductServiceAsync by lazy { ProductServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): PricingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PricingServiceAsync =
        PricingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Public pricing operations */
    override fun products(): ProductServiceAsync = products

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PricingServiceAsync.WithRawResponse {

        private val products: ProductServiceAsync.WithRawResponse by lazy {
            ProductServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PricingServiceAsync.WithRawResponse =
            PricingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Public pricing operations */
        override fun products(): ProductServiceAsync.WithRawResponse = products
    }
}
