// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.texml.accounts

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.services.blocking.texml.accounts.recordings.JsonService
import java.util.function.Consumer

interface RecordingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RecordingService

    fun json(): JsonService

    /** A view of [RecordingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RecordingService.WithRawResponse

        fun json(): JsonService.WithRawResponse
    }
}
