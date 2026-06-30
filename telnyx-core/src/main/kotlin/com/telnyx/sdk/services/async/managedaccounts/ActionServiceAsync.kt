// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.managedaccounts

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.managedaccounts.actions.ActionDisableParams
import com.telnyx.sdk.models.managedaccounts.actions.ActionDisableResponse
import com.telnyx.sdk.models.managedaccounts.actions.ActionEnableParams
import com.telnyx.sdk.models.managedaccounts.actions.ActionEnableResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Managed Accounts operations */
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
     * Disables a managed account, forbidding it to use Telnyx services, including sending or
     * receiving phone calls and SMS messages. Ongoing phone calls will not be affected. The managed
     * account and its sub-users will no longer be able to log in via the mission control portal.
     */
    fun disable(id: String): CompletableFuture<ActionDisableResponse> =
        disable(id, ActionDisableParams.none())

    /** @see disable */
    fun disable(
        id: String,
        params: ActionDisableParams = ActionDisableParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionDisableResponse> =
        disable(params.toBuilder().id(id).build(), requestOptions)

    /** @see disable */
    fun disable(
        id: String,
        params: ActionDisableParams = ActionDisableParams.none(),
    ): CompletableFuture<ActionDisableResponse> = disable(id, params, RequestOptions.none())

    /** @see disable */
    fun disable(
        params: ActionDisableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionDisableResponse>

    /** @see disable */
    fun disable(params: ActionDisableParams): CompletableFuture<ActionDisableResponse> =
        disable(params, RequestOptions.none())

    /** @see disable */
    fun disable(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionDisableResponse> =
        disable(id, ActionDisableParams.none(), requestOptions)

    /** Enables a managed account and its sub-users to use Telnyx services. */
    fun enable(id: String): CompletableFuture<ActionEnableResponse> =
        enable(id, ActionEnableParams.none())

    /** @see enable */
    fun enable(
        id: String,
        params: ActionEnableParams = ActionEnableParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionEnableResponse> =
        enable(params.toBuilder().id(id).build(), requestOptions)

    /** @see enable */
    fun enable(
        id: String,
        params: ActionEnableParams = ActionEnableParams.none(),
    ): CompletableFuture<ActionEnableResponse> = enable(id, params, RequestOptions.none())

    /** @see enable */
    fun enable(
        params: ActionEnableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionEnableResponse>

    /** @see enable */
    fun enable(params: ActionEnableParams): CompletableFuture<ActionEnableResponse> =
        enable(params, RequestOptions.none())

    /** @see enable */
    fun enable(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionEnableResponse> =
        enable(id, ActionEnableParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /managed_accounts/{id}/actions/disable`, but is
         * otherwise the same as [ActionServiceAsync.disable].
         */
        fun disable(id: String): CompletableFuture<HttpResponseFor<ActionDisableResponse>> =
            disable(id, ActionDisableParams.none())

        /** @see disable */
        fun disable(
            id: String,
            params: ActionDisableParams = ActionDisableParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionDisableResponse>> =
            disable(params.toBuilder().id(id).build(), requestOptions)

        /** @see disable */
        fun disable(
            id: String,
            params: ActionDisableParams = ActionDisableParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionDisableResponse>> =
            disable(id, params, RequestOptions.none())

        /** @see disable */
        fun disable(
            params: ActionDisableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionDisableResponse>>

        /** @see disable */
        fun disable(
            params: ActionDisableParams
        ): CompletableFuture<HttpResponseFor<ActionDisableResponse>> =
            disable(params, RequestOptions.none())

        /** @see disable */
        fun disable(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionDisableResponse>> =
            disable(id, ActionDisableParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /managed_accounts/{id}/actions/enable`, but is
         * otherwise the same as [ActionServiceAsync.enable].
         */
        fun enable(id: String): CompletableFuture<HttpResponseFor<ActionEnableResponse>> =
            enable(id, ActionEnableParams.none())

        /** @see enable */
        fun enable(
            id: String,
            params: ActionEnableParams = ActionEnableParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionEnableResponse>> =
            enable(params.toBuilder().id(id).build(), requestOptions)

        /** @see enable */
        fun enable(
            id: String,
            params: ActionEnableParams = ActionEnableParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionEnableResponse>> =
            enable(id, params, RequestOptions.none())

        /** @see enable */
        fun enable(
            params: ActionEnableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionEnableResponse>>

        /** @see enable */
        fun enable(
            params: ActionEnableParams
        ): CompletableFuture<HttpResponseFor<ActionEnableResponse>> =
            enable(params, RequestOptions.none())

        /** @see enable */
        fun enable(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionEnableResponse>> =
            enable(id, ActionEnableParams.none(), requestOptions)
    }
}
