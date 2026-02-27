// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messagingtollfree

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.messagingtollfree.verification.RequestService
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

    /** Manage your tollfree verification requests */
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

        /** Manage your tollfree verification requests */
        fun requests(): RequestService.WithRawResponse
    }
}
