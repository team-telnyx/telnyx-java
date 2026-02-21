// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messagingprofiles

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messagingprofiles.actions.ActionRegenerateSecretParams
import com.telnyx.sdk.models.messagingprofiles.actions.ActionRegenerateSecretResponse
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

    /** Regenerate the v1 secret for a messaging profile. */
    fun regenerateSecret(id: String): ActionRegenerateSecretResponse =
        regenerateSecret(id, ActionRegenerateSecretParams.none())

    /** @see regenerateSecret */
    fun regenerateSecret(
        id: String,
        params: ActionRegenerateSecretParams = ActionRegenerateSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRegenerateSecretResponse =
        regenerateSecret(params.toBuilder().id(id).build(), requestOptions)

    /** @see regenerateSecret */
    fun regenerateSecret(
        id: String,
        params: ActionRegenerateSecretParams = ActionRegenerateSecretParams.none(),
    ): ActionRegenerateSecretResponse = regenerateSecret(id, params, RequestOptions.none())

    /** @see regenerateSecret */
    fun regenerateSecret(
        params: ActionRegenerateSecretParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRegenerateSecretResponse

    /** @see regenerateSecret */
    fun regenerateSecret(params: ActionRegenerateSecretParams): ActionRegenerateSecretResponse =
        regenerateSecret(params, RequestOptions.none())

    /** @see regenerateSecret */
    fun regenerateSecret(
        id: String,
        requestOptions: RequestOptions,
    ): ActionRegenerateSecretResponse =
        regenerateSecret(id, ActionRegenerateSecretParams.none(), requestOptions)

    /** A view of [ActionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /messaging_profiles/{id}/actions/regenerate_secret`, but is otherwise the same as
         * [ActionService.regenerateSecret].
         */
        @MustBeClosed
        fun regenerateSecret(id: String): HttpResponseFor<ActionRegenerateSecretResponse> =
            regenerateSecret(id, ActionRegenerateSecretParams.none())

        /** @see regenerateSecret */
        @MustBeClosed
        fun regenerateSecret(
            id: String,
            params: ActionRegenerateSecretParams = ActionRegenerateSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRegenerateSecretResponse> =
            regenerateSecret(params.toBuilder().id(id).build(), requestOptions)

        /** @see regenerateSecret */
        @MustBeClosed
        fun regenerateSecret(
            id: String,
            params: ActionRegenerateSecretParams = ActionRegenerateSecretParams.none(),
        ): HttpResponseFor<ActionRegenerateSecretResponse> =
            regenerateSecret(id, params, RequestOptions.none())

        /** @see regenerateSecret */
        @MustBeClosed
        fun regenerateSecret(
            params: ActionRegenerateSecretParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRegenerateSecretResponse>

        /** @see regenerateSecret */
        @MustBeClosed
        fun regenerateSecret(
            params: ActionRegenerateSecretParams
        ): HttpResponseFor<ActionRegenerateSecretResponse> =
            regenerateSecret(params, RequestOptions.none())

        /** @see regenerateSecret */
        @MustBeClosed
        fun regenerateSecret(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionRegenerateSecretResponse> =
            regenerateSecret(id, ActionRegenerateSecretParams.none(), requestOptions)
    }
}
