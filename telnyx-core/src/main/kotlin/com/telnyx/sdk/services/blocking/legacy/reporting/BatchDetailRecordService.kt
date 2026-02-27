// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.legacy.reporting

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.legacy.reporting.batchdetailrecords.MessagingService
import com.telnyx.sdk.services.blocking.legacy.reporting.batchdetailrecords.SpeechToTextService
import com.telnyx.sdk.services.blocking.legacy.reporting.batchdetailrecords.VoiceService
import java.util.function.Consumer

interface BatchDetailRecordService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchDetailRecordService

    /** Messaging batch detail records */
    fun messaging(): MessagingService

    /** Speech to text batch detail records */
    fun speechToText(): SpeechToTextService

    /** Voice batch detail records */
    fun voice(): VoiceService

    /**
     * A view of [BatchDetailRecordService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatchDetailRecordService.WithRawResponse

        /** Messaging batch detail records */
        fun messaging(): MessagingService.WithRawResponse

        /** Speech to text batch detail records */
        fun speechToText(): SpeechToTextService.WithRawResponse

        /** Voice batch detail records */
        fun voice(): VoiceService.WithRawResponse
    }
}
