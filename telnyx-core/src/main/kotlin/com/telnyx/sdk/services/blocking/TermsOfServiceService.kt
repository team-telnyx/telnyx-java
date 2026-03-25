// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.termsofservice.NumberReputationService
import java.util.function.Consumer

interface TermsOfServiceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TermsOfServiceService

    /** Terms of Service agreement endpoints */
    fun numberReputation(): NumberReputationService

    /**
     * A view of [TermsOfServiceService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TermsOfServiceService.WithRawResponse

        /** Terms of Service agreement endpoints */
        fun numberReputation(): NumberReputationService.WithRawResponse
    }
}
