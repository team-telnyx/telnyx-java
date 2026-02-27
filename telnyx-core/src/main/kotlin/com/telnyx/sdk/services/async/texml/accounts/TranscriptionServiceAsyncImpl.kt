// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.texml.accounts

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.texml.accounts.transcriptions.JsonServiceAsync
import com.telnyx.sdk.services.async.texml.accounts.transcriptions.JsonServiceAsyncImpl
import java.util.function.Consumer

class TranscriptionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TranscriptionServiceAsync {

    private val withRawResponse: TranscriptionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val json: JsonServiceAsync by lazy { JsonServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): TranscriptionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TranscriptionServiceAsync =
        TranscriptionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** TeXML REST Commands */
    override fun json(): JsonServiceAsync = json

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TranscriptionServiceAsync.WithRawResponse {

        private val json: JsonServiceAsync.WithRawResponse by lazy {
            JsonServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TranscriptionServiceAsync.WithRawResponse =
            TranscriptionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** TeXML REST Commands */
        override fun json(): JsonServiceAsync.WithRawResponse = json
    }
}
