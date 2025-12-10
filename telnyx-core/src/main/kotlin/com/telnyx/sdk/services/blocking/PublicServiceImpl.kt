// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.public_.BrandService
import com.telnyx.sdk.services.blocking.public_.BrandServiceImpl
import java.util.function.Consumer

class PublicServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PublicService {

    private val withRawResponse: PublicService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val brand: BrandService by lazy { BrandServiceImpl(clientOptions) }

    override fun withRawResponse(): PublicService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PublicService =
        PublicServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun brand(): BrandService = brand

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PublicService.WithRawResponse {

        private val brand: BrandService.WithRawResponse by lazy {
            BrandServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PublicService.WithRawResponse =
            PublicServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun brand(): BrandService.WithRawResponse = brand
    }
}
