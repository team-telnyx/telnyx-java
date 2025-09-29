// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.texml.accounts

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.services.async.texml.accounts.recordings.JsonServiceAsync
import java.util.function.Consumer

interface RecordingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RecordingServiceAsync

    fun json(): JsonServiceAsync

    /**
     * A view of [RecordingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RecordingServiceAsync.WithRawResponse

        fun json(): JsonServiceAsync.WithRawResponse
    }
}
