// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.messagingprofiles

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messagingprofiles.actions.ActionRegenerateSecretParams
import com.telnyx.sdk.models.messagingprofiles.actions.ActionRegenerateSecretResponse
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

    /** Regenerate the v1 secret for a messaging profile. */
    fun regenerateSecret(id: String): CompletableFuture<ActionRegenerateSecretResponse> =
        regenerateSecret(id, ActionRegenerateSecretParams.none())

    /** @see regenerateSecret */
    fun regenerateSecret(
        id: String,
        params: ActionRegenerateSecretParams = ActionRegenerateSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRegenerateSecretResponse> =
        regenerateSecret(params.toBuilder().id(id).build(), requestOptions)

    /** @see regenerateSecret */
    fun regenerateSecret(
        id: String,
        params: ActionRegenerateSecretParams = ActionRegenerateSecretParams.none(),
    ): CompletableFuture<ActionRegenerateSecretResponse> =
        regenerateSecret(id, params, RequestOptions.none())

    /** @see regenerateSecret */
    fun regenerateSecret(
        params: ActionRegenerateSecretParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRegenerateSecretResponse>

    /** @see regenerateSecret */
    fun regenerateSecret(
        params: ActionRegenerateSecretParams
    ): CompletableFuture<ActionRegenerateSecretResponse> =
        regenerateSecret(params, RequestOptions.none())

    /** @see regenerateSecret */
    fun regenerateSecret(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionRegenerateSecretResponse> =
        regenerateSecret(id, ActionRegenerateSecretParams.none(), requestOptions)

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
         * /messaging_profiles/{id}/actions/regenerate_secret`, but is otherwise the same as
         * [ActionServiceAsync.regenerateSecret].
         */
        fun regenerateSecret(
            id: String
        ): CompletableFuture<HttpResponseFor<ActionRegenerateSecretResponse>> =
            regenerateSecret(id, ActionRegenerateSecretParams.none())

        /** @see regenerateSecret */
        fun regenerateSecret(
            id: String,
            params: ActionRegenerateSecretParams = ActionRegenerateSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRegenerateSecretResponse>> =
            regenerateSecret(params.toBuilder().id(id).build(), requestOptions)

        /** @see regenerateSecret */
        fun regenerateSecret(
            id: String,
            params: ActionRegenerateSecretParams = ActionRegenerateSecretParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionRegenerateSecretResponse>> =
            regenerateSecret(id, params, RequestOptions.none())

        /** @see regenerateSecret */
        fun regenerateSecret(
            params: ActionRegenerateSecretParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRegenerateSecretResponse>>

        /** @see regenerateSecret */
        fun regenerateSecret(
            params: ActionRegenerateSecretParams
        ): CompletableFuture<HttpResponseFor<ActionRegenerateSecretResponse>> =
            regenerateSecret(params, RequestOptions.none())

        /** @see regenerateSecret */
        fun regenerateSecret(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionRegenerateSecretResponse>> =
            regenerateSecret(id, ActionRegenerateSecretParams.none(), requestOptions)
    }
}
