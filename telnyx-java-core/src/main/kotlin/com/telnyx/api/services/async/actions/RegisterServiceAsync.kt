// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.actions

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.actions.register.RegisterCreateParams
import com.telnyx.api.models.actions.register.RegisterCreateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RegisterServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RegisterServiceAsync

    /**
     * Register the SIM cards associated with the provided registration codes to the current user's
     * account.<br/><br/> If <code>sim_card_group_id</code> is provided, the SIM cards will be
     * associated with that group. Otherwise, the default group for the current user will be
     * used.<br/><br/>
     */
    fun create(params: RegisterCreateParams): CompletableFuture<RegisterCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RegisterCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RegisterCreateResponse>

    /**
     * A view of [RegisterServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RegisterServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /actions/register/sim_cards`, but is otherwise the
         * same as [RegisterServiceAsync.create].
         */
        fun create(
            params: RegisterCreateParams
        ): CompletableFuture<HttpResponseFor<RegisterCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RegisterCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RegisterCreateResponse>>
    }
}
