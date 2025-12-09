// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.brand

import com.telnyx.sdk.core.ClientOptions
import java.util.function.Consumer

class ExternalVettingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExternalVettingService {

    private val withRawResponse: ExternalVettingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExternalVettingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExternalVettingService =
        ExternalVettingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExternalVettingService.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExternalVettingService.WithRawResponse =
            ExternalVettingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
