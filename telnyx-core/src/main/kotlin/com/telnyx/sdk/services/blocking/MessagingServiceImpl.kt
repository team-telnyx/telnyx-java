// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.messaging.RcService
import com.telnyx.sdk.services.blocking.messaging.RcServiceImpl
import java.util.function.Consumer

class MessagingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MessagingService {

    private val withRawResponse: MessagingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val rcs: RcService by lazy { RcServiceImpl(clientOptions) }

    override fun withRawResponse(): MessagingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessagingService =
        MessagingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Send RCS messages */
    override fun rcs(): RcService = rcs

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MessagingService.WithRawResponse {

        private val rcs: RcService.WithRawResponse by lazy {
            RcServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessagingService.WithRawResponse =
            MessagingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Send RCS messages */
        override fun rcs(): RcService.WithRawResponse = rcs
    }
}
