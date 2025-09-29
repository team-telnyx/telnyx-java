// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.legacy.reporting

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.services.blocking.legacy.reporting.batchdetailrecords.MessagingService
import com.telnyx.api.services.blocking.legacy.reporting.batchdetailrecords.SpeechToTextService
import com.telnyx.api.services.blocking.legacy.reporting.batchdetailrecords.VoiceService
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

    fun messaging(): MessagingService

    fun speechToText(): SpeechToTextService

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

        fun messaging(): MessagingService.WithRawResponse

        fun speechToText(): SpeechToTextService.WithRawResponse

        fun voice(): VoiceService.WithRawResponse
    }
}
