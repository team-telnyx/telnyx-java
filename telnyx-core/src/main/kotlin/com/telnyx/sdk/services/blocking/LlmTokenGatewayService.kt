// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.llmtokengateway.SpendService
import com.telnyx.sdk.services.blocking.llmtokengateway.TokenGroupService
import com.telnyx.sdk.services.blocking.llmtokengateway.TokenKeyService
import com.telnyx.sdk.services.blocking.llmtokengateway.UsageService
import java.util.function.Consumer

interface LlmTokenGatewayService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LlmTokenGatewayService

    /** Manage and report AI Gateway usage. */
    fun usage(): UsageService

    /** Manage and report AI Gateway usage. */
    fun spend(): SpendService

    /** Manage and report AI Gateway usage. */
    fun tokenGroups(): TokenGroupService

    /** Manage and report AI Gateway usage. */
    fun tokenKeys(): TokenKeyService

    /**
     * A view of [LlmTokenGatewayService] that provides access to raw HTTP responses for each
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
        ): LlmTokenGatewayService.WithRawResponse

        /** Manage and report AI Gateway usage. */
        fun usage(): UsageService.WithRawResponse

        /** Manage and report AI Gateway usage. */
        fun spend(): SpendService.WithRawResponse

        /** Manage and report AI Gateway usage. */
        fun tokenGroups(): TokenGroupService.WithRawResponse

        /** Manage and report AI Gateway usage. */
        fun tokenKeys(): TokenKeyService.WithRawResponse
    }
}
