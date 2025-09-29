// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.texml.accounts

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.services.blocking.texml.accounts.transcriptions.JsonService
import com.telnyx.api.services.blocking.texml.accounts.transcriptions.JsonServiceImpl
import java.util.function.Consumer

class TranscriptionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TranscriptionService {

    private val withRawResponse: TranscriptionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val json: JsonService by lazy { JsonServiceImpl(clientOptions) }

    override fun withRawResponse(): TranscriptionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TranscriptionService =
        TranscriptionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun json(): JsonService = json

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TranscriptionService.WithRawResponse {

        private val json: JsonService.WithRawResponse by lazy {
            JsonServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TranscriptionService.WithRawResponse =
            TranscriptionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun json(): JsonService.WithRawResponse = json
    }
}
