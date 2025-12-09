// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.brand.ExternalVettingServiceAsync
import com.telnyx.sdk.services.async.brand.ExternalVettingServiceAsyncImpl
import java.util.function.Consumer

class BrandServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BrandServiceAsync {

    private val withRawResponse: BrandServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val externalVetting: ExternalVettingServiceAsync by lazy {
        ExternalVettingServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): BrandServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandServiceAsync =
        BrandServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun externalVetting(): ExternalVettingServiceAsync = externalVetting

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BrandServiceAsync.WithRawResponse {

        private val externalVetting: ExternalVettingServiceAsync.WithRawResponse by lazy {
            ExternalVettingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BrandServiceAsync.WithRawResponse =
            BrandServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun externalVetting(): ExternalVettingServiceAsync.WithRawResponse =
            externalVetting
    }
}
