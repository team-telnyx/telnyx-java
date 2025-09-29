// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.ai

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.services.blocking.ai.finetuning.JobService
import java.util.function.Consumer

interface FineTuningService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FineTuningService

    fun jobs(): JobService

    /** A view of [FineTuningService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FineTuningService.WithRawResponse

        fun jobs(): JobService.WithRawResponse
    }
}
