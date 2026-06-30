// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.portingorders

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.portingorders.actions.ActionActivateParams
import com.telnyx.sdk.models.portingorders.actions.ActionActivateResponse
import com.telnyx.sdk.models.portingorders.actions.ActionCancelParams
import com.telnyx.sdk.models.portingorders.actions.ActionCancelResponse
import com.telnyx.sdk.models.portingorders.actions.ActionConfirmParams
import com.telnyx.sdk.models.portingorders.actions.ActionConfirmResponse
import com.telnyx.sdk.models.portingorders.actions.ActionShareParams
import com.telnyx.sdk.models.portingorders.actions.ActionShareResponse
import java.util.function.Consumer

/** Endpoints related to porting orders management. */
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
     * Activate each number in a porting order asynchronously. This operation is limited to US
     * FastPort orders only.
     */
    fun activate(id: String): ActionActivateResponse = activate(id, ActionActivateParams.none())

    /** @see activate */
    fun activate(
        id: String,
        params: ActionActivateParams = ActionActivateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionActivateResponse = activate(params.toBuilder().id(id).build(), requestOptions)

    /** @see activate */
    fun activate(
        id: String,
        params: ActionActivateParams = ActionActivateParams.none(),
    ): ActionActivateResponse = activate(id, params, RequestOptions.none())

    /** @see activate */
    fun activate(
        params: ActionActivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionActivateResponse

    /** @see activate */
    fun activate(params: ActionActivateParams): ActionActivateResponse =
        activate(params, RequestOptions.none())

    /** @see activate */
    fun activate(id: String, requestOptions: RequestOptions): ActionActivateResponse =
        activate(id, ActionActivateParams.none(), requestOptions)

    /** Cancel a porting order */
    fun cancel(id: String): ActionCancelResponse = cancel(id, ActionCancelParams.none())

    /** @see cancel */
    fun cancel(
        id: String,
        params: ActionCancelParams = ActionCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionCancelResponse = cancel(params.toBuilder().id(id).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        id: String,
        params: ActionCancelParams = ActionCancelParams.none(),
    ): ActionCancelResponse = cancel(id, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: ActionCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionCancelResponse

    /** @see cancel */
    fun cancel(params: ActionCancelParams): ActionCancelResponse =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(id: String, requestOptions: RequestOptions): ActionCancelResponse =
        cancel(id, ActionCancelParams.none(), requestOptions)

    /** Confirm and submit your porting order. */
    fun confirm(id: String): ActionConfirmResponse = confirm(id, ActionConfirmParams.none())

    /** @see confirm */
    fun confirm(
        id: String,
        params: ActionConfirmParams = ActionConfirmParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionConfirmResponse = confirm(params.toBuilder().id(id).build(), requestOptions)

    /** @see confirm */
    fun confirm(
        id: String,
        params: ActionConfirmParams = ActionConfirmParams.none(),
    ): ActionConfirmResponse = confirm(id, params, RequestOptions.none())

    /** @see confirm */
    fun confirm(
        params: ActionConfirmParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionConfirmResponse

    /** @see confirm */
    fun confirm(params: ActionConfirmParams): ActionConfirmResponse =
        confirm(params, RequestOptions.none())

    /** @see confirm */
    fun confirm(id: String, requestOptions: RequestOptions): ActionConfirmResponse =
        confirm(id, ActionConfirmParams.none(), requestOptions)

    /**
     * Creates a sharing token for a porting order. The token can be used to share the porting order
     * with non-Telnyx users.
     */
    fun share(id: String): ActionShareResponse = share(id, ActionShareParams.none())

    /** @see share */
    fun share(
        id: String,
        params: ActionShareParams = ActionShareParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionShareResponse = share(params.toBuilder().id(id).build(), requestOptions)

    /** @see share */
    fun share(
        id: String,
        params: ActionShareParams = ActionShareParams.none(),
    ): ActionShareResponse = share(id, params, RequestOptions.none())

    /** @see share */
    fun share(
        params: ActionShareParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionShareResponse

    /** @see share */
    fun share(params: ActionShareParams): ActionShareResponse = share(params, RequestOptions.none())

    /** @see share */
    fun share(id: String, requestOptions: RequestOptions): ActionShareResponse =
        share(id, ActionShareParams.none(), requestOptions)

    /** A view of [ActionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /porting_orders/{id}/actions/activate`, but is
         * otherwise the same as [ActionService.activate].
         */
        @MustBeClosed
        fun activate(id: String): HttpResponseFor<ActionActivateResponse> =
            activate(id, ActionActivateParams.none())

        /** @see activate */
        @MustBeClosed
        fun activate(
            id: String,
            params: ActionActivateParams = ActionActivateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionActivateResponse> =
            activate(params.toBuilder().id(id).build(), requestOptions)

        /** @see activate */
        @MustBeClosed
        fun activate(
            id: String,
            params: ActionActivateParams = ActionActivateParams.none(),
        ): HttpResponseFor<ActionActivateResponse> = activate(id, params, RequestOptions.none())

        /** @see activate */
        @MustBeClosed
        fun activate(
            params: ActionActivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionActivateResponse>

        /** @see activate */
        @MustBeClosed
        fun activate(params: ActionActivateParams): HttpResponseFor<ActionActivateResponse> =
            activate(params, RequestOptions.none())

        /** @see activate */
        @MustBeClosed
        fun activate(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionActivateResponse> =
            activate(id, ActionActivateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /porting_orders/{id}/actions/cancel`, but is
         * otherwise the same as [ActionService.cancel].
         */
        @MustBeClosed
        fun cancel(id: String): HttpResponseFor<ActionCancelResponse> =
            cancel(id, ActionCancelParams.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            id: String,
            params: ActionCancelParams = ActionCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionCancelResponse> =
            cancel(params.toBuilder().id(id).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            id: String,
            params: ActionCancelParams = ActionCancelParams.none(),
        ): HttpResponseFor<ActionCancelResponse> = cancel(id, params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: ActionCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionCancelResponse>

        /** @see cancel */
        @MustBeClosed
        fun cancel(params: ActionCancelParams): HttpResponseFor<ActionCancelResponse> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionCancelResponse> =
            cancel(id, ActionCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /porting_orders/{id}/actions/confirm`, but is
         * otherwise the same as [ActionService.confirm].
         */
        @MustBeClosed
        fun confirm(id: String): HttpResponseFor<ActionConfirmResponse> =
            confirm(id, ActionConfirmParams.none())

        /** @see confirm */
        @MustBeClosed
        fun confirm(
            id: String,
            params: ActionConfirmParams = ActionConfirmParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionConfirmResponse> =
            confirm(params.toBuilder().id(id).build(), requestOptions)

        /** @see confirm */
        @MustBeClosed
        fun confirm(
            id: String,
            params: ActionConfirmParams = ActionConfirmParams.none(),
        ): HttpResponseFor<ActionConfirmResponse> = confirm(id, params, RequestOptions.none())

        /** @see confirm */
        @MustBeClosed
        fun confirm(
            params: ActionConfirmParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionConfirmResponse>

        /** @see confirm */
        @MustBeClosed
        fun confirm(params: ActionConfirmParams): HttpResponseFor<ActionConfirmResponse> =
            confirm(params, RequestOptions.none())

        /** @see confirm */
        @MustBeClosed
        fun confirm(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionConfirmResponse> =
            confirm(id, ActionConfirmParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /porting_orders/{id}/actions/share`, but is
         * otherwise the same as [ActionService.share].
         */
        @MustBeClosed
        fun share(id: String): HttpResponseFor<ActionShareResponse> =
            share(id, ActionShareParams.none())

        /** @see share */
        @MustBeClosed
        fun share(
            id: String,
            params: ActionShareParams = ActionShareParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionShareResponse> =
            share(params.toBuilder().id(id).build(), requestOptions)

        /** @see share */
        @MustBeClosed
        fun share(
            id: String,
            params: ActionShareParams = ActionShareParams.none(),
        ): HttpResponseFor<ActionShareResponse> = share(id, params, RequestOptions.none())

        /** @see share */
        @MustBeClosed
        fun share(
            params: ActionShareParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionShareResponse>

        /** @see share */
        @MustBeClosed
        fun share(params: ActionShareParams): HttpResponseFor<ActionShareResponse> =
            share(params, RequestOptions.none())

        /** @see share */
        @MustBeClosed
        fun share(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionShareResponse> =
            share(id, ActionShareParams.none(), requestOptions)
    }
}
