// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.portingorders

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.portingorders.actionrequirements.ActionRequirementInitiateParams
import com.telnyx.sdk.models.portingorders.actionrequirements.ActionRequirementInitiateResponse
import com.telnyx.sdk.models.portingorders.actionrequirements.ActionRequirementListPageAsync
import com.telnyx.sdk.models.portingorders.actionrequirements.ActionRequirementListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ActionRequirementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionRequirementServiceAsync

    /** Returns a list of action requirements for a specific porting order. */
    fun list(portingOrderId: String): CompletableFuture<ActionRequirementListPageAsync> =
        list(portingOrderId, ActionRequirementListParams.none())

    /** @see list */
    fun list(
        portingOrderId: String,
        params: ActionRequirementListParams = ActionRequirementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRequirementListPageAsync> =
        list(params.toBuilder().portingOrderId(portingOrderId).build(), requestOptions)

    /** @see list */
    fun list(
        portingOrderId: String,
        params: ActionRequirementListParams = ActionRequirementListParams.none(),
    ): CompletableFuture<ActionRequirementListPageAsync> =
        list(portingOrderId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ActionRequirementListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRequirementListPageAsync>

    /** @see list */
    fun list(
        params: ActionRequirementListParams
    ): CompletableFuture<ActionRequirementListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        portingOrderId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionRequirementListPageAsync> =
        list(portingOrderId, ActionRequirementListParams.none(), requestOptions)

    /** Initiates a specific action requirement for a porting order. */
    fun initiate(
        id: String,
        params: ActionRequirementInitiateParams,
    ): CompletableFuture<ActionRequirementInitiateResponse> =
        initiate(id, params, RequestOptions.none())

    /** @see initiate */
    fun initiate(
        id: String,
        params: ActionRequirementInitiateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRequirementInitiateResponse> =
        initiate(params.toBuilder().id(id).build(), requestOptions)

    /** @see initiate */
    fun initiate(
        params: ActionRequirementInitiateParams
    ): CompletableFuture<ActionRequirementInitiateResponse> =
        initiate(params, RequestOptions.none())

    /** @see initiate */
    fun initiate(
        params: ActionRequirementInitiateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRequirementInitiateResponse>

    /**
     * A view of [ActionRequirementServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActionRequirementServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /porting_orders/{porting_order_id}/action_requirements`, but is otherwise the same as
         * [ActionRequirementServiceAsync.list].
         */
        fun list(
            portingOrderId: String
        ): CompletableFuture<HttpResponseFor<ActionRequirementListPageAsync>> =
            list(portingOrderId, ActionRequirementListParams.none())

        /** @see list */
        fun list(
            portingOrderId: String,
            params: ActionRequirementListParams = ActionRequirementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRequirementListPageAsync>> =
            list(params.toBuilder().portingOrderId(portingOrderId).build(), requestOptions)

        /** @see list */
        fun list(
            portingOrderId: String,
            params: ActionRequirementListParams = ActionRequirementListParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionRequirementListPageAsync>> =
            list(portingOrderId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ActionRequirementListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRequirementListPageAsync>>

        /** @see list */
        fun list(
            params: ActionRequirementListParams
        ): CompletableFuture<HttpResponseFor<ActionRequirementListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            portingOrderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionRequirementListPageAsync>> =
            list(portingOrderId, ActionRequirementListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /porting_orders/{porting_order_id}/action_requirements/{id}/initiate`, but is otherwise
         * the same as [ActionRequirementServiceAsync.initiate].
         */
        fun initiate(
            id: String,
            params: ActionRequirementInitiateParams,
        ): CompletableFuture<HttpResponseFor<ActionRequirementInitiateResponse>> =
            initiate(id, params, RequestOptions.none())

        /** @see initiate */
        fun initiate(
            id: String,
            params: ActionRequirementInitiateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRequirementInitiateResponse>> =
            initiate(params.toBuilder().id(id).build(), requestOptions)

        /** @see initiate */
        fun initiate(
            params: ActionRequirementInitiateParams
        ): CompletableFuture<HttpResponseFor<ActionRequirementInitiateResponse>> =
            initiate(params, RequestOptions.none())

        /** @see initiate */
        fun initiate(
            params: ActionRequirementInitiateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRequirementInitiateResponse>>
    }
}
