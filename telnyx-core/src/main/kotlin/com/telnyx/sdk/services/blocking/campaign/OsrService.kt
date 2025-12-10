// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.campaign

import com.telnyx.sdk.core.ClientOptions
import java.util.function.Consumer

interface OsrService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OsrService

    /** A view of [OsrService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OsrService.WithRawResponse
    }
}
