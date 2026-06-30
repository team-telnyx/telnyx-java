// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.texml.accounts

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.texml.accounts.recordings.JsonService
import com.telnyx.sdk.services.blocking.texml.accounts.recordings.JsonServiceImpl
import java.util.function.Consumer

class RecordingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RecordingService {

    private val withRawResponse: RecordingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val json: JsonService by lazy { JsonServiceImpl(clientOptions) }

    override fun withRawResponse(): RecordingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RecordingService =
        RecordingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** TeXML REST Commands */
    override fun json(): JsonService = json

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RecordingService.WithRawResponse {

        private val json: JsonService.WithRawResponse by lazy {
            JsonServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RecordingService.WithRawResponse =
            RecordingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** TeXML REST Commands */
        override fun json(): JsonService.WithRawResponse = json
    }
}
