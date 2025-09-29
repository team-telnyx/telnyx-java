// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.messagingtollfree

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.services.blocking.messagingtollfree.verification.RequestService
import java.util.function.Consumer

interface VerificationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VerificationService

    fun requests(): RequestService

    /**
     * A view of [VerificationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VerificationService.WithRawResponse

        fun requests(): RequestService.WithRawResponse
    }
}
