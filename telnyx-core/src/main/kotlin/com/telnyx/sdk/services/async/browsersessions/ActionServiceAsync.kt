// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.browsersessions

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.browsersessions.actions.ActionCreateParams
import com.telnyx.sdk.models.browsersessions.actions.ActionCreateResponse
import com.telnyx.sdk.models.browsersessions.actions.ActionRetrieveParams
import com.telnyx.sdk.models.browsersessions.actions.ActionRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Execute browser actions: navigate, observe, click, fill, select, press, scroll, wait_for,
 * screenshot, batch.
 */
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
     * Executes a browser action on the session. Returns 200 if completed within wait_seconds, 202
     * if still in-flight.
     *
     * Action types: navigate, observe, click, fill, select, press, scroll, wait_for, screenshot,
     * batch.
     */
    fun create(id: String, params: ActionCreateParams): CompletableFuture<ActionCreateResponse> =
        create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: ActionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionCreateResponse> =
        create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: ActionCreateParams): CompletableFuture<ActionCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ActionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionCreateResponse>

    /**
     * Returns the stored status and result of an action. Use this to poll actions that returned
     * 202; HTTP 200 can contain any action status. Stored observations contain metadata with empty
     * tree and refs, not the full snapshot; submit a fresh observe action to obtain current refs.
     */
    fun retrieve(
        actionId: String,
        params: ActionRetrieveParams,
    ): CompletableFuture<ActionRetrieveResponse> = retrieve(actionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        actionId: String,
        params: ActionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRetrieveResponse> =
        retrieve(params.toBuilder().actionId(actionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: ActionRetrieveParams): CompletableFuture<ActionRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ActionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRetrieveResponse>

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
         * Returns a raw HTTP response for `post /browser_sessions/{id}/actions`, but is otherwise
         * the same as [ActionServiceAsync.create].
         */
        fun create(
            id: String,
            params: ActionCreateParams,
        ): CompletableFuture<HttpResponseFor<ActionCreateResponse>> =
            create(id, params, RequestOptions.none())

        /** @see create */
        fun create(
            id: String,
            params: ActionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionCreateResponse>> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        fun create(
            params: ActionCreateParams
        ): CompletableFuture<HttpResponseFor<ActionCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ActionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /browser_sessions/{id}/actions/{actionId}`, but is
         * otherwise the same as [ActionServiceAsync.retrieve].
         */
        fun retrieve(
            actionId: String,
            params: ActionRetrieveParams,
        ): CompletableFuture<HttpResponseFor<ActionRetrieveResponse>> =
            retrieve(actionId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            actionId: String,
            params: ActionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRetrieveResponse>> =
            retrieve(params.toBuilder().actionId(actionId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: ActionRetrieveParams
        ): CompletableFuture<HttpResponseFor<ActionRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ActionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRetrieveResponse>>
    }
}
