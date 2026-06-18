// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.legacy.reporting

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.legacy.reporting.batchdetailrecords.MessagingService
import com.telnyx.sdk.services.blocking.legacy.reporting.batchdetailrecords.MessagingServiceImpl
import com.telnyx.sdk.services.blocking.legacy.reporting.batchdetailrecords.SpeechToTextService
import com.telnyx.sdk.services.blocking.legacy.reporting.batchdetailrecords.SpeechToTextServiceImpl
import com.telnyx.sdk.services.blocking.legacy.reporting.batchdetailrecords.VoiceService
import com.telnyx.sdk.services.blocking.legacy.reporting.batchdetailrecords.VoiceServiceImpl
import java.util.function.Consumer

class BatchDetailRecordServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BatchDetailRecordService {

    private val withRawResponse: BatchDetailRecordService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val messaging: MessagingService by lazy { MessagingServiceImpl(clientOptions) }

    private val speechToText: SpeechToTextService by lazy { SpeechToTextServiceImpl(clientOptions) }

    private val voice: VoiceService by lazy { VoiceServiceImpl(clientOptions) }

    override fun withRawResponse(): BatchDetailRecordService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchDetailRecordService =
        BatchDetailRecordServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Messaging batch detail records */
    override fun messaging(): MessagingService = messaging

    /** Speech to text batch detail records */
    override fun speechToText(): SpeechToTextService = speechToText

    /** Voice batch detail records */
    override fun voice(): VoiceService = voice

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BatchDetailRecordService.WithRawResponse {

        private val messaging: MessagingService.WithRawResponse by lazy {
            MessagingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val speechToText: SpeechToTextService.WithRawResponse by lazy {
            SpeechToTextServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val voice: VoiceService.WithRawResponse by lazy {
            VoiceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatchDetailRecordService.WithRawResponse =
            BatchDetailRecordServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Messaging batch detail records */
        override fun messaging(): MessagingService.WithRawResponse = messaging

        /** Speech to text batch detail records */
        override fun speechToText(): SpeechToTextService.WithRawResponse = speechToText

        /** Voice batch detail records */
        override fun voice(): VoiceService.WithRawResponse = voice
    }
}
