// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.legacy.reporting

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.services.async.legacy.reporting.batchdetailrecords.MessagingServiceAsync
import com.telnyx.api.services.async.legacy.reporting.batchdetailrecords.SpeechToTextServiceAsync
import com.telnyx.api.services.async.legacy.reporting.batchdetailrecords.VoiceServiceAsync
import java.util.function.Consumer

interface BatchDetailRecordServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchDetailRecordServiceAsync

    fun messaging(): MessagingServiceAsync

    fun speechToText(): SpeechToTextServiceAsync

    fun voice(): VoiceServiceAsync

    /**
     * A view of [BatchDetailRecordServiceAsync] that provides access to raw HTTP responses for each
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
        ): BatchDetailRecordServiceAsync.WithRawResponse

        fun messaging(): MessagingServiceAsync.WithRawResponse

        fun speechToText(): SpeechToTextServiceAsync.WithRawResponse

        fun voice(): VoiceServiceAsync.WithRawResponse
    }
}
