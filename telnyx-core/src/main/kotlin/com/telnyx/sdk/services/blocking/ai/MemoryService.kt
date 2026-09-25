// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.ai.memory.NamespaceService
import java.util.function.Consumer

interface MemoryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MemoryService

    /** Whether a write has finished. */
    fun namespaces(): NamespaceService

    /** A view of [MemoryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MemoryService.WithRawResponse

        /** Whether a write has finished. */
        fun namespaces(): NamespaceService.WithRawResponse
    }
}
