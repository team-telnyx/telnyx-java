// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.actions.PurchaseService
import com.telnyx.sdk.services.blocking.actions.RegisterService
import java.util.function.Consumer

interface ActionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService

    /** SIM Cards operations */
    fun purchase(): PurchaseService

    /** SIM Cards operations */
    fun register(): RegisterService

    /** A view of [ActionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService.WithRawResponse

        /** SIM Cards operations */
        fun purchase(): PurchaseService.WithRawResponse

        /** SIM Cards operations */
        fun register(): RegisterService.WithRawResponse
    }
}
