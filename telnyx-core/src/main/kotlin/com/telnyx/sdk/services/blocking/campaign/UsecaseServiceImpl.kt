// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.campaign

import com.telnyx.sdk.core.ClientOptions
import java.util.function.Consumer

class UsecaseServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    UsecaseService {

    private val withRawResponse: UsecaseService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UsecaseService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsecaseService =
        UsecaseServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UsecaseService.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UsecaseService.WithRawResponse =
            UsecaseServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
