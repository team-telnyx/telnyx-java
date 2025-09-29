// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.portingorders

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.portingorders.actions.ActionActivateParams
import com.telnyx.api.models.portingorders.actions.ActionActivateResponse
import com.telnyx.api.models.portingorders.actions.ActionCancelParams
import com.telnyx.api.models.portingorders.actions.ActionCancelResponse
import com.telnyx.api.models.portingorders.actions.ActionConfirmParams
import com.telnyx.api.models.portingorders.actions.ActionConfirmResponse
import com.telnyx.api.models.portingorders.actions.ActionShareParams
import com.telnyx.api.models.portingorders.actions.ActionShareResponse
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
     * Activate each number in a porting order asynchronously. This operation is limited to US
     * FastPort orders only.
     */
    fun activate(id: String): CompletableFuture<ActionActivateResponse> =
        activate(id, ActionActivateParams.none())

    /** @see activate */
    fun activate(
        id: String,
        params: ActionActivateParams = ActionActivateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionActivateResponse> =
        activate(params.toBuilder().id(id).build(), requestOptions)

    /** @see activate */
    fun activate(
        id: String,
        params: ActionActivateParams = ActionActivateParams.none(),
    ): CompletableFuture<ActionActivateResponse> = activate(id, params, RequestOptions.none())

    /** @see activate */
    fun activate(
        params: ActionActivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionActivateResponse>

    /** @see activate */
    fun activate(params: ActionActivateParams): CompletableFuture<ActionActivateResponse> =
        activate(params, RequestOptions.none())

    /** @see activate */
    fun activate(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionActivateResponse> =
        activate(id, ActionActivateParams.none(), requestOptions)

    /** Cancel a porting order */
    fun cancel(id: String): CompletableFuture<ActionCancelResponse> =
        cancel(id, ActionCancelParams.none())

    /** @see cancel */
    fun cancel(
        id: String,
        params: ActionCancelParams = ActionCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionCancelResponse> =
        cancel(params.toBuilder().id(id).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        id: String,
        params: ActionCancelParams = ActionCancelParams.none(),
    ): CompletableFuture<ActionCancelResponse> = cancel(id, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: ActionCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionCancelResponse>

    /** @see cancel */
    fun cancel(params: ActionCancelParams): CompletableFuture<ActionCancelResponse> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionCancelResponse> =
        cancel(id, ActionCancelParams.none(), requestOptions)

    /** Confirm and submit your porting order. */
    fun confirm(id: String): CompletableFuture<ActionConfirmResponse> =
        confirm(id, ActionConfirmParams.none())

    /** @see confirm */
    fun confirm(
        id: String,
        params: ActionConfirmParams = ActionConfirmParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionConfirmResponse> =
        confirm(params.toBuilder().id(id).build(), requestOptions)

    /** @see confirm */
    fun confirm(
        id: String,
        params: ActionConfirmParams = ActionConfirmParams.none(),
    ): CompletableFuture<ActionConfirmResponse> = confirm(id, params, RequestOptions.none())

    /** @see confirm */
    fun confirm(
        params: ActionConfirmParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionConfirmResponse>

    /** @see confirm */
    fun confirm(params: ActionConfirmParams): CompletableFuture<ActionConfirmResponse> =
        confirm(params, RequestOptions.none())

    /** @see confirm */
    fun confirm(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionConfirmResponse> =
        confirm(id, ActionConfirmParams.none(), requestOptions)

    /**
     * Creates a sharing token for a porting order. The token can be used to share the porting order
     * with non-Telnyx users.
     */
    fun share(id: String): CompletableFuture<ActionShareResponse> =
        share(id, ActionShareParams.none())

    /** @see share */
    fun share(
        id: String,
        params: ActionShareParams = ActionShareParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionShareResponse> =
        share(params.toBuilder().id(id).build(), requestOptions)

    /** @see share */
    fun share(
        id: String,
        params: ActionShareParams = ActionShareParams.none(),
    ): CompletableFuture<ActionShareResponse> = share(id, params, RequestOptions.none())

    /** @see share */
    fun share(
        params: ActionShareParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionShareResponse>

    /** @see share */
    fun share(params: ActionShareParams): CompletableFuture<ActionShareResponse> =
        share(params, RequestOptions.none())

    /** @see share */
    fun share(id: String, requestOptions: RequestOptions): CompletableFuture<ActionShareResponse> =
        share(id, ActionShareParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /porting_orders/{id}/actions/activate`, but is
         * otherwise the same as [ActionServiceAsync.activate].
         */
        fun activate(id: String): CompletableFuture<HttpResponseFor<ActionActivateResponse>> =
            activate(id, ActionActivateParams.none())

        /** @see activate */
        fun activate(
            id: String,
            params: ActionActivateParams = ActionActivateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionActivateResponse>> =
            activate(params.toBuilder().id(id).build(), requestOptions)

        /** @see activate */
        fun activate(
            id: String,
            params: ActionActivateParams = ActionActivateParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionActivateResponse>> =
            activate(id, params, RequestOptions.none())

        /** @see activate */
        fun activate(
            params: ActionActivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionActivateResponse>>

        /** @see activate */
        fun activate(
            params: ActionActivateParams
        ): CompletableFuture<HttpResponseFor<ActionActivateResponse>> =
            activate(params, RequestOptions.none())

        /** @see activate */
        fun activate(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionActivateResponse>> =
            activate(id, ActionActivateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /porting_orders/{id}/actions/cancel`, but is
         * otherwise the same as [ActionServiceAsync.cancel].
         */
        fun cancel(id: String): CompletableFuture<HttpResponseFor<ActionCancelResponse>> =
            cancel(id, ActionCancelParams.none())

        /** @see cancel */
        fun cancel(
            id: String,
            params: ActionCancelParams = ActionCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionCancelResponse>> =
            cancel(params.toBuilder().id(id).build(), requestOptions)

        /** @see cancel */
        fun cancel(
            id: String,
            params: ActionCancelParams = ActionCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionCancelResponse>> =
            cancel(id, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: ActionCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionCancelResponse>>

        /** @see cancel */
        fun cancel(
            params: ActionCancelParams
        ): CompletableFuture<HttpResponseFor<ActionCancelResponse>> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionCancelResponse>> =
            cancel(id, ActionCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /porting_orders/{id}/actions/confirm`, but is
         * otherwise the same as [ActionServiceAsync.confirm].
         */
        fun confirm(id: String): CompletableFuture<HttpResponseFor<ActionConfirmResponse>> =
            confirm(id, ActionConfirmParams.none())

        /** @see confirm */
        fun confirm(
            id: String,
            params: ActionConfirmParams = ActionConfirmParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionConfirmResponse>> =
            confirm(params.toBuilder().id(id).build(), requestOptions)

        /** @see confirm */
        fun confirm(
            id: String,
            params: ActionConfirmParams = ActionConfirmParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionConfirmResponse>> =
            confirm(id, params, RequestOptions.none())

        /** @see confirm */
        fun confirm(
            params: ActionConfirmParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionConfirmResponse>>

        /** @see confirm */
        fun confirm(
            params: ActionConfirmParams
        ): CompletableFuture<HttpResponseFor<ActionConfirmResponse>> =
            confirm(params, RequestOptions.none())

        /** @see confirm */
        fun confirm(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionConfirmResponse>> =
            confirm(id, ActionConfirmParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /porting_orders/{id}/actions/share`, but is
         * otherwise the same as [ActionServiceAsync.share].
         */
        fun share(id: String): CompletableFuture<HttpResponseFor<ActionShareResponse>> =
            share(id, ActionShareParams.none())

        /** @see share */
        fun share(
            id: String,
            params: ActionShareParams = ActionShareParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionShareResponse>> =
            share(params.toBuilder().id(id).build(), requestOptions)

        /** @see share */
        fun share(
            id: String,
            params: ActionShareParams = ActionShareParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionShareResponse>> =
            share(id, params, RequestOptions.none())

        /** @see share */
        fun share(
            params: ActionShareParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionShareResponse>>

        /** @see share */
        fun share(
            params: ActionShareParams
        ): CompletableFuture<HttpResponseFor<ActionShareResponse>> =
            share(params, RequestOptions.none())

        /** @see share */
        fun share(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionShareResponse>> =
            share(id, ActionShareParams.none(), requestOptions)
    }
}
