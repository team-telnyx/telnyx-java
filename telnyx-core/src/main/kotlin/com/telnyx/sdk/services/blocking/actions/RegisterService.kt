// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.actions

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.actions.register.RegisterCreateParams
import com.telnyx.sdk.models.actions.register.RegisterCreateResponse
import java.util.function.Consumer

interface RegisterService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RegisterService

    /**
     * Register the SIM cards associated with the provided registration codes to the current user's
     * account.<br/><br/> If <code>sim_card_group_id</code> is provided, the SIM cards will be
     * associated with that group. Otherwise, the default group for the current user will be
     * used.<br/><br/>
     */
    fun create(params: RegisterCreateParams): RegisterCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RegisterCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RegisterCreateResponse

    /** A view of [RegisterService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RegisterService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /actions/register/sim_cards`, but is otherwise the
         * same as [RegisterService.create].
         */
        @MustBeClosed
        fun create(params: RegisterCreateParams): HttpResponseFor<RegisterCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RegisterCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RegisterCreateResponse>
    }
}
