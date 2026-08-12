// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.rcs.AgentServiceAsync
import com.telnyx.sdk.services.async.rcs.BrandServiceAsync
import java.util.function.Consumer

interface RcServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RcServiceAsync

    /** Manage RCS agent registration, testing, verification, and launch. */
    fun agents(): AgentServiceAsync

    /** Manage the legal business entities that operate RCS agents. */
    fun brands(): BrandServiceAsync

    /** A view of [RcServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RcServiceAsync.WithRawResponse

        /** Manage RCS agent registration, testing, verification, and launch. */
        fun agents(): AgentServiceAsync.WithRawResponse

        /** Manage the legal business entities that operate RCS agents. */
        fun brands(): BrandServiceAsync.WithRawResponse
    }
}
