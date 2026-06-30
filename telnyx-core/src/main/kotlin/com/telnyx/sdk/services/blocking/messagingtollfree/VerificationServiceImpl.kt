// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messagingtollfree

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.messagingtollfree.verification.RequestService
import com.telnyx.sdk.services.blocking.messagingtollfree.verification.RequestServiceImpl
import java.util.function.Consumer

class VerificationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    VerificationService {

    private val withRawResponse: VerificationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val requests: RequestService by lazy { RequestServiceImpl(clientOptions) }

    override fun withRawResponse(): VerificationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VerificationService =
        VerificationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Manage your tollfree verification requests */
    override fun requests(): RequestService = requests

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VerificationService.WithRawResponse {

        private val requests: RequestService.WithRawResponse by lazy {
            RequestServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VerificationService.WithRawResponse =
            VerificationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Manage your tollfree verification requests */
        override fun requests(): RequestService.WithRawResponse = requests
    }
}
