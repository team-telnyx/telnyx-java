// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.services.blocking.messagingtollfree.VerificationService
import com.telnyx.api.services.blocking.messagingtollfree.VerificationServiceImpl
import java.util.function.Consumer

class MessagingTollfreeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MessagingTollfreeService {

    private val withRawResponse: MessagingTollfreeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val verification: VerificationService by lazy { VerificationServiceImpl(clientOptions) }

    override fun withRawResponse(): MessagingTollfreeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessagingTollfreeService =
        MessagingTollfreeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun verification(): VerificationService = verification

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MessagingTollfreeService.WithRawResponse {

        private val verification: VerificationService.WithRawResponse by lazy {
            VerificationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessagingTollfreeService.WithRawResponse =
            MessagingTollfreeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun verification(): VerificationService.WithRawResponse = verification
    }
}
