// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.texml.accounts

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.texml.accounts.transcriptions.JsonService
import java.util.function.Consumer

interface TranscriptionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TranscriptionService

    /** TeXML REST Commands */
    fun json(): JsonService

    /**
     * A view of [TranscriptionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TranscriptionService.WithRawResponse

        /** TeXML REST Commands */
        fun json(): JsonService.WithRawResponse
    }
}
