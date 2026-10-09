// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.llmtokengateway.UsageServiceAsync
import java.util.function.Consumer

interface LlmTokenGatewayServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LlmTokenGatewayServiceAsync

    /** Manage and report AI Gateway traffic. */
    fun usage(): UsageServiceAsync

    /**
     * A view of [LlmTokenGatewayServiceAsync] that provides access to raw HTTP responses for each
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
        ): LlmTokenGatewayServiceAsync.WithRawResponse

        /** Manage and report AI Gateway traffic. */
        fun usage(): UsageServiceAsync.WithRawResponse
    }
}
