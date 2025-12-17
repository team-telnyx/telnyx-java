// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messages

import com.telnyx.sdk.core.ClientOptions
import java.util.function.Consumer

class WhatsappServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WhatsappService {

    private val withRawResponse: WhatsappService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WhatsappService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WhatsappService =
        WhatsappServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WhatsappService.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WhatsappService.WithRawResponse =
            WhatsappServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
