// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.managedaccounts

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.managedaccounts.actions.ActionDisableParams
import com.telnyx.sdk.models.managedaccounts.actions.ActionDisableResponse
import com.telnyx.sdk.models.managedaccounts.actions.ActionEnableParams
import com.telnyx.sdk.models.managedaccounts.actions.ActionEnableResponse
import java.util.function.Consumer

/** Managed Accounts operations */
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
     * Disables a managed account, forbidding it to use Telnyx services, including sending or
     * receiving phone calls and SMS messages. Ongoing phone calls will not be affected. The managed
     * account and its sub-users will no longer be able to log in via the mission control portal.
     */
    fun disable(id: String): ActionDisableResponse = disable(id, ActionDisableParams.none())

    /** @see disable */
    fun disable(
        id: String,
        params: ActionDisableParams = ActionDisableParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionDisableResponse = disable(params.toBuilder().id(id).build(), requestOptions)

    /** @see disable */
    fun disable(
        id: String,
        params: ActionDisableParams = ActionDisableParams.none(),
    ): ActionDisableResponse = disable(id, params, RequestOptions.none())

    /** @see disable */
    fun disable(
        params: ActionDisableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionDisableResponse

    /** @see disable */
    fun disable(params: ActionDisableParams): ActionDisableResponse =
        disable(params, RequestOptions.none())

    /** @see disable */
    fun disable(id: String, requestOptions: RequestOptions): ActionDisableResponse =
        disable(id, ActionDisableParams.none(), requestOptions)

    /** Enables a managed account and its sub-users to use Telnyx services. */
    fun enable(id: String): ActionEnableResponse = enable(id, ActionEnableParams.none())

    /** @see enable */
    fun enable(
        id: String,
        params: ActionEnableParams = ActionEnableParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionEnableResponse = enable(params.toBuilder().id(id).build(), requestOptions)

    /** @see enable */
    fun enable(
        id: String,
        params: ActionEnableParams = ActionEnableParams.none(),
    ): ActionEnableResponse = enable(id, params, RequestOptions.none())

    /** @see enable */
    fun enable(
        params: ActionEnableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionEnableResponse

    /** @see enable */
    fun enable(params: ActionEnableParams): ActionEnableResponse =
        enable(params, RequestOptions.none())

    /** @see enable */
    fun enable(id: String, requestOptions: RequestOptions): ActionEnableResponse =
        enable(id, ActionEnableParams.none(), requestOptions)

    /** A view of [ActionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /managed_accounts/{id}/actions/disable`, but is
         * otherwise the same as [ActionService.disable].
         */
        @MustBeClosed
        fun disable(id: String): HttpResponseFor<ActionDisableResponse> =
            disable(id, ActionDisableParams.none())

        /** @see disable */
        @MustBeClosed
        fun disable(
            id: String,
            params: ActionDisableParams = ActionDisableParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionDisableResponse> =
            disable(params.toBuilder().id(id).build(), requestOptions)

        /** @see disable */
        @MustBeClosed
        fun disable(
            id: String,
            params: ActionDisableParams = ActionDisableParams.none(),
        ): HttpResponseFor<ActionDisableResponse> = disable(id, params, RequestOptions.none())

        /** @see disable */
        @MustBeClosed
        fun disable(
            params: ActionDisableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionDisableResponse>

        /** @see disable */
        @MustBeClosed
        fun disable(params: ActionDisableParams): HttpResponseFor<ActionDisableResponse> =
            disable(params, RequestOptions.none())

        /** @see disable */
        @MustBeClosed
        fun disable(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionDisableResponse> =
            disable(id, ActionDisableParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /managed_accounts/{id}/actions/enable`, but is
         * otherwise the same as [ActionService.enable].
         */
        @MustBeClosed
        fun enable(id: String): HttpResponseFor<ActionEnableResponse> =
            enable(id, ActionEnableParams.none())

        /** @see enable */
        @MustBeClosed
        fun enable(
            id: String,
            params: ActionEnableParams = ActionEnableParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionEnableResponse> =
            enable(params.toBuilder().id(id).build(), requestOptions)

        /** @see enable */
        @MustBeClosed
        fun enable(
            id: String,
            params: ActionEnableParams = ActionEnableParams.none(),
        ): HttpResponseFor<ActionEnableResponse> = enable(id, params, RequestOptions.none())

        /** @see enable */
        @MustBeClosed
        fun enable(
            params: ActionEnableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionEnableResponse>

        /** @see enable */
        @MustBeClosed
        fun enable(params: ActionEnableParams): HttpResponseFor<ActionEnableResponse> =
            enable(params, RequestOptions.none())

        /** @see enable */
        @MustBeClosed
        fun enable(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionEnableResponse> =
            enable(id, ActionEnableParams.none(), requestOptions)
    }
}
