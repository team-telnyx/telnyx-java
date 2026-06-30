// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.legacy.reporting

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.legacy.reporting.batchdetailrecords.MessagingServiceAsync
import com.telnyx.sdk.services.async.legacy.reporting.batchdetailrecords.SpeechToTextServiceAsync
import com.telnyx.sdk.services.async.legacy.reporting.batchdetailrecords.VoiceServiceAsync
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

    /** Messaging batch detail records */
    fun messaging(): MessagingServiceAsync

    /** Speech to text batch detail records */
    fun speechToText(): SpeechToTextServiceAsync

    /** Voice batch detail records */
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

        /** Messaging batch detail records */
        fun messaging(): MessagingServiceAsync.WithRawResponse

        /** Speech to text batch detail records */
        fun speechToText(): SpeechToTextServiceAsync.WithRawResponse

        /** Voice batch detail records */
        fun voice(): VoiceServiceAsync.WithRawResponse
    }
}
