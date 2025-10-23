// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.credentialconnections

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.credentialconnections.actions.ActionCheckRegistrationStatusParams
import com.telnyx.sdk.models.credentialconnections.actions.ActionCheckRegistrationStatusResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ActionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionServiceAsync

    /**
     * Checks the registration_status for a credential connection, (`registration_status`) as well
     * as the timestamp for the last SIP registration event (`registration_status_updated_at`)
     */
    fun checkRegistrationStatus(
        id: String
    ): CompletableFuture<ActionCheckRegistrationStatusResponse> =
        checkRegistrationStatus(id, ActionCheckRegistrationStatusParams.none())

    /** @see checkRegistrationStatus */
    fun checkRegistrationStatus(
        id: String,
        params: ActionCheckRegistrationStatusParams = ActionCheckRegistrationStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionCheckRegistrationStatusResponse> =
        checkRegistrationStatus(params.toBuilder().id(id).build(), requestOptions)

    /** @see checkRegistrationStatus */
    fun checkRegistrationStatus(
        id: String,
        params: ActionCheckRegistrationStatusParams = ActionCheckRegistrationStatusParams.none(),
    ): CompletableFuture<ActionCheckRegistrationStatusResponse> =
        checkRegistrationStatus(id, params, RequestOptions.none())

    /** @see checkRegistrationStatus */
    fun checkRegistrationStatus(
        params: ActionCheckRegistrationStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionCheckRegistrationStatusResponse>

    /** @see checkRegistrationStatus */
    fun checkRegistrationStatus(
        params: ActionCheckRegistrationStatusParams
    ): CompletableFuture<ActionCheckRegistrationStatusResponse> =
        checkRegistrationStatus(params, RequestOptions.none())

    /** @see checkRegistrationStatus */
    fun checkRegistrationStatus(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionCheckRegistrationStatusResponse> =
        checkRegistrationStatus(id, ActionCheckRegistrationStatusParams.none(), requestOptions)

    /**
     * A view of [ActionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /credential_connections/{id}/actions/check_registration_status`, but is otherwise the
         * same as [ActionServiceAsync.checkRegistrationStatus].
         */
        fun checkRegistrationStatus(
            id: String
        ): CompletableFuture<HttpResponseFor<ActionCheckRegistrationStatusResponse>> =
            checkRegistrationStatus(id, ActionCheckRegistrationStatusParams.none())

        /** @see checkRegistrationStatus */
        fun checkRegistrationStatus(
            id: String,
            params: ActionCheckRegistrationStatusParams =
                ActionCheckRegistrationStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionCheckRegistrationStatusResponse>> =
            checkRegistrationStatus(params.toBuilder().id(id).build(), requestOptions)

        /** @see checkRegistrationStatus */
        fun checkRegistrationStatus(
            id: String,
            params: ActionCheckRegistrationStatusParams = ActionCheckRegistrationStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionCheckRegistrationStatusResponse>> =
            checkRegistrationStatus(id, params, RequestOptions.none())

        /** @see checkRegistrationStatus */
        fun checkRegistrationStatus(
            params: ActionCheckRegistrationStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionCheckRegistrationStatusResponse>>

        /** @see checkRegistrationStatus */
        fun checkRegistrationStatus(
            params: ActionCheckRegistrationStatusParams
        ): CompletableFuture<HttpResponseFor<ActionCheckRegistrationStatusResponse>> =
            checkRegistrationStatus(params, RequestOptions.none())

        /** @see checkRegistrationStatus */
        fun checkRegistrationStatus(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionCheckRegistrationStatusResponse>> =
            checkRegistrationStatus(id, ActionCheckRegistrationStatusParams.none(), requestOptions)
    }
}
