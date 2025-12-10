// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.public_.BrandServiceAsync
import com.telnyx.sdk.services.async.public_.BrandServiceAsyncImpl
import java.util.function.Consumer

class PublicServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PublicServiceAsync {

    private val withRawResponse: PublicServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val brand: BrandServiceAsync by lazy { BrandServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): PublicServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PublicServiceAsync =
        PublicServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun brand(): BrandServiceAsync = brand

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PublicServiceAsync.WithRawResponse {

        private val brand: BrandServiceAsync.WithRawResponse by lazy {
            BrandServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PublicServiceAsync.WithRawResponse =
            PublicServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun brand(): BrandServiceAsync.WithRawResponse = brand
    }
}
