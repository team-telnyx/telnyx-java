// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.externalrequirements.SubNumberOrderServiceAsync
import java.util.function.Consumer

interface ExternalRequirementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExternalRequirementServiceAsync

    /** Requirement Groups */
    fun subNumberOrders(): SubNumberOrderServiceAsync

    /**
     * A view of [ExternalRequirementServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExternalRequirementServiceAsync.WithRawResponse

        /** Requirement Groups */
        fun subNumberOrders(): SubNumberOrderServiceAsync.WithRawResponse
    }
}
