// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.legacy.reporting

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.legacy.reporting.batchdetailrecords.MessagingServiceAsync
import com.telnyx.sdk.services.async.legacy.reporting.batchdetailrecords.MessagingServiceAsyncImpl
import com.telnyx.sdk.services.async.legacy.reporting.batchdetailrecords.SpeechToTextServiceAsync
import com.telnyx.sdk.services.async.legacy.reporting.batchdetailrecords.SpeechToTextServiceAsyncImpl
import com.telnyx.sdk.services.async.legacy.reporting.batchdetailrecords.VoiceServiceAsync
import com.telnyx.sdk.services.async.legacy.reporting.batchdetailrecords.VoiceServiceAsyncImpl
import java.util.function.Consumer

class BatchDetailRecordServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : BatchDetailRecordServiceAsync {

    private val withRawResponse: BatchDetailRecordServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val messaging: MessagingServiceAsync by lazy {
        MessagingServiceAsyncImpl(clientOptions)
    }

    private val speechToText: SpeechToTextServiceAsync by lazy {
        SpeechToTextServiceAsyncImpl(clientOptions)
    }

    private val voice: VoiceServiceAsync by lazy { VoiceServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): BatchDetailRecordServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): BatchDetailRecordServiceAsync =
        BatchDetailRecordServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Messaging batch detail records */
    override fun messaging(): MessagingServiceAsync = messaging

    /** Speech to text batch detail records */
    override fun speechToText(): SpeechToTextServiceAsync = speechToText

    /** Voice batch detail records */
    override fun voice(): VoiceServiceAsync = voice

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BatchDetailRecordServiceAsync.WithRawResponse {

        private val messaging: MessagingServiceAsync.WithRawResponse by lazy {
            MessagingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val speechToText: SpeechToTextServiceAsync.WithRawResponse by lazy {
            SpeechToTextServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val voice: VoiceServiceAsync.WithRawResponse by lazy {
            VoiceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatchDetailRecordServiceAsync.WithRawResponse =
            BatchDetailRecordServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Messaging batch detail records */
        override fun messaging(): MessagingServiceAsync.WithRawResponse = messaging

        /** Speech to text batch detail records */
        override fun speechToText(): SpeechToTextServiceAsync.WithRawResponse = speechToText

        /** Voice batch detail records */
        override fun voice(): VoiceServiceAsync.WithRawResponse = voice
    }
}
