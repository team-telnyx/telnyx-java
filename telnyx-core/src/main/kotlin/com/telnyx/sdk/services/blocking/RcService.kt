// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.rcs.AgentService
import com.telnyx.sdk.services.blocking.rcs.BrandService
import java.util.function.Consumer

interface RcService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RcService

    /** Manage RCS agent registration, testing, verification, and launch. */
    fun agents(): AgentService

    /** Manage the legal business entities that operate RCS agents. */
    fun brands(): BrandService

    /** A view of [RcService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RcService.WithRawResponse

        /** Manage RCS agent registration, testing, verification, and launch. */
        fun agents(): AgentService.WithRawResponse

        /** Manage the legal business entities that operate RCS agents. */
        fun brands(): BrandService.WithRawResponse
    }
}
