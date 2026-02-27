// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.texml.accounts

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.texml.accounts.recordings.JsonServiceAsync
import com.telnyx.sdk.services.async.texml.accounts.recordings.JsonServiceAsyncImpl
import java.util.function.Consumer

class RecordingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RecordingServiceAsync {

    private val withRawResponse: RecordingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val json: JsonServiceAsync by lazy { JsonServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): RecordingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RecordingServiceAsync =
        RecordingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** TeXML REST Commands */
    override fun json(): JsonServiceAsync = json

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RecordingServiceAsync.WithRawResponse {

        private val json: JsonServiceAsync.WithRawResponse by lazy {
            JsonServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RecordingServiceAsync.WithRawResponse =
            RecordingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** TeXML REST Commands */
        override fun json(): JsonServiceAsync.WithRawResponse = json
    }
}
