// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.credentialconnections

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.credentialconnections.actions.ActionCheckRegistrationStatusParams
import com.telnyx.api.models.credentialconnections.actions.ActionCheckRegistrationStatusResponse
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

    /**
     * Checks the registration_status for a credential connection, (`registration_status`) as well
     * as the timestamp for the last SIP registration event (`registration_status_updated_at`)
     */
    fun checkRegistrationStatus(id: String): ActionCheckRegistrationStatusResponse =
        checkRegistrationStatus(id, ActionCheckRegistrationStatusParams.none())

    /** @see checkRegistrationStatus */
    fun checkRegistrationStatus(
        id: String,
        params: ActionCheckRegistrationStatusParams = ActionCheckRegistrationStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionCheckRegistrationStatusResponse =
        checkRegistrationStatus(params.toBuilder().id(id).build(), requestOptions)

    /** @see checkRegistrationStatus */
    fun checkRegistrationStatus(
        id: String,
        params: ActionCheckRegistrationStatusParams = ActionCheckRegistrationStatusParams.none(),
    ): ActionCheckRegistrationStatusResponse =
        checkRegistrationStatus(id, params, RequestOptions.none())

    /** @see checkRegistrationStatus */
    fun checkRegistrationStatus(
        params: ActionCheckRegistrationStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionCheckRegistrationStatusResponse

    /** @see checkRegistrationStatus */
    fun checkRegistrationStatus(
        params: ActionCheckRegistrationStatusParams
    ): ActionCheckRegistrationStatusResponse =
        checkRegistrationStatus(params, RequestOptions.none())

    /** @see checkRegistrationStatus */
    fun checkRegistrationStatus(
        id: String,
        requestOptions: RequestOptions,
    ): ActionCheckRegistrationStatusResponse =
        checkRegistrationStatus(id, ActionCheckRegistrationStatusParams.none(), requestOptions)

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
         * /credential_connections/{id}/actions/check_registration_status`, but is otherwise the
         * same as [ActionService.checkRegistrationStatus].
         */
        @MustBeClosed
        fun checkRegistrationStatus(
            id: String
        ): HttpResponseFor<ActionCheckRegistrationStatusResponse> =
            checkRegistrationStatus(id, ActionCheckRegistrationStatusParams.none())

        /** @see checkRegistrationStatus */
        @MustBeClosed
        fun checkRegistrationStatus(
            id: String,
            params: ActionCheckRegistrationStatusParams =
                ActionCheckRegistrationStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionCheckRegistrationStatusResponse> =
            checkRegistrationStatus(params.toBuilder().id(id).build(), requestOptions)

        /** @see checkRegistrationStatus */
        @MustBeClosed
        fun checkRegistrationStatus(
            id: String,
            params: ActionCheckRegistrationStatusParams = ActionCheckRegistrationStatusParams.none(),
        ): HttpResponseFor<ActionCheckRegistrationStatusResponse> =
            checkRegistrationStatus(id, params, RequestOptions.none())

        /** @see checkRegistrationStatus */
        @MustBeClosed
        fun checkRegistrationStatus(
            params: ActionCheckRegistrationStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionCheckRegistrationStatusResponse>

        /** @see checkRegistrationStatus */
        @MustBeClosed
        fun checkRegistrationStatus(
            params: ActionCheckRegistrationStatusParams
        ): HttpResponseFor<ActionCheckRegistrationStatusResponse> =
            checkRegistrationStatus(params, RequestOptions.none())

        /** @see checkRegistrationStatus */
        @MustBeClosed
        fun checkRegistrationStatus(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionCheckRegistrationStatusResponse> =
            checkRegistrationStatus(id, ActionCheckRegistrationStatusParams.none(), requestOptions)
    }
}
