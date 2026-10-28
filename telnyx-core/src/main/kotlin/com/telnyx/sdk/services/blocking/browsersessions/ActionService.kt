// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.browsersessions

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.browsersessions.actions.ActionCreateParams
import com.telnyx.sdk.models.browsersessions.actions.ActionCreateResponse
import com.telnyx.sdk.models.browsersessions.actions.ActionRetrieveParams
import com.telnyx.sdk.models.browsersessions.actions.ActionRetrieveResponse
import java.util.function.Consumer

/**
 * Execute browser actions: navigate, observe, click, fill, select, press, scroll, wait_for,
 * screenshot, batch.
 */
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
     * Executes a browser action on the session. Returns 200 if completed within wait_seconds, 202
     * if still in-flight.
     *
     * Action types: navigate, observe, click, fill, select, press, scroll, wait_for, screenshot,
     * batch.
     */
    fun create(id: String, params: ActionCreateParams): ActionCreateResponse =
        create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: ActionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionCreateResponse = create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: ActionCreateParams): ActionCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ActionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionCreateResponse

    /**
     * Returns the stored status and result of an action. Use this to poll actions that returned
     * 202; HTTP 200 can contain any action status. Stored observations contain metadata with empty
     * tree and refs, not the full snapshot; submit a fresh observe action to obtain current refs.
     */
    fun retrieve(actionId: String, params: ActionRetrieveParams): ActionRetrieveResponse =
        retrieve(actionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        actionId: String,
        params: ActionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRetrieveResponse =
        retrieve(params.toBuilder().actionId(actionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: ActionRetrieveParams): ActionRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ActionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRetrieveResponse

    /** A view of [ActionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /browser_sessions/{id}/actions`, but is otherwise
         * the same as [ActionService.create].
         */
        @MustBeClosed
        fun create(id: String, params: ActionCreateParams): HttpResponseFor<ActionCreateResponse> =
            create(id, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            id: String,
            params: ActionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionCreateResponse> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: ActionCreateParams): HttpResponseFor<ActionCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ActionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionCreateResponse>

        /**
         * Returns a raw HTTP response for `get /browser_sessions/{id}/actions/{actionId}`, but is
         * otherwise the same as [ActionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            actionId: String,
            params: ActionRetrieveParams,
        ): HttpResponseFor<ActionRetrieveResponse> =
            retrieve(actionId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            actionId: String,
            params: ActionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRetrieveResponse> =
            retrieve(params.toBuilder().actionId(actionId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ActionRetrieveParams): HttpResponseFor<ActionRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ActionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRetrieveResponse>
    }
}
