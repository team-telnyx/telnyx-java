// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.portingorders

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.portingorders.actionrequirements.ActionRequirementInitiateParams
import com.telnyx.api.models.portingorders.actionrequirements.ActionRequirementInitiateResponse
import com.telnyx.api.models.portingorders.actionrequirements.ActionRequirementListParams
import com.telnyx.api.models.portingorders.actionrequirements.ActionRequirementListResponse
import java.util.function.Consumer

interface ActionRequirementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionRequirementService

    /** Returns a list of action requirements for a specific porting order. */
    fun list(portingOrderId: String): ActionRequirementListResponse =
        list(portingOrderId, ActionRequirementListParams.none())

    /** @see list */
    fun list(
        portingOrderId: String,
        params: ActionRequirementListParams = ActionRequirementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRequirementListResponse =
        list(params.toBuilder().portingOrderId(portingOrderId).build(), requestOptions)

    /** @see list */
    fun list(
        portingOrderId: String,
        params: ActionRequirementListParams = ActionRequirementListParams.none(),
    ): ActionRequirementListResponse = list(portingOrderId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ActionRequirementListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRequirementListResponse

    /** @see list */
    fun list(params: ActionRequirementListParams): ActionRequirementListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        portingOrderId: String,
        requestOptions: RequestOptions,
    ): ActionRequirementListResponse =
        list(portingOrderId, ActionRequirementListParams.none(), requestOptions)

    /** Initiates a specific action requirement for a porting order. */
    fun initiate(
        id: String,
        params: ActionRequirementInitiateParams,
    ): ActionRequirementInitiateResponse = initiate(id, params, RequestOptions.none())

    /** @see initiate */
    fun initiate(
        id: String,
        params: ActionRequirementInitiateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRequirementInitiateResponse =
        initiate(params.toBuilder().id(id).build(), requestOptions)

    /** @see initiate */
    fun initiate(params: ActionRequirementInitiateParams): ActionRequirementInitiateResponse =
        initiate(params, RequestOptions.none())

    /** @see initiate */
    fun initiate(
        params: ActionRequirementInitiateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRequirementInitiateResponse

    /**
     * A view of [ActionRequirementService] that provides access to raw HTTP responses for each
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
        ): ActionRequirementService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /porting_orders/{porting_order_id}/action_requirements`, but is otherwise the same as
         * [ActionRequirementService.list].
         */
        @MustBeClosed
        fun list(portingOrderId: String): HttpResponseFor<ActionRequirementListResponse> =
            list(portingOrderId, ActionRequirementListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            portingOrderId: String,
            params: ActionRequirementListParams = ActionRequirementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRequirementListResponse> =
            list(params.toBuilder().portingOrderId(portingOrderId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            portingOrderId: String,
            params: ActionRequirementListParams = ActionRequirementListParams.none(),
        ): HttpResponseFor<ActionRequirementListResponse> =
            list(portingOrderId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ActionRequirementListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRequirementListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ActionRequirementListParams
        ): HttpResponseFor<ActionRequirementListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            portingOrderId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionRequirementListResponse> =
            list(portingOrderId, ActionRequirementListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /porting_orders/{porting_order_id}/action_requirements/{id}/initiate`, but is otherwise
         * the same as [ActionRequirementService.initiate].
         */
        @MustBeClosed
        fun initiate(
            id: String,
            params: ActionRequirementInitiateParams,
        ): HttpResponseFor<ActionRequirementInitiateResponse> =
            initiate(id, params, RequestOptions.none())

        /** @see initiate */
        @MustBeClosed
        fun initiate(
            id: String,
            params: ActionRequirementInitiateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRequirementInitiateResponse> =
            initiate(params.toBuilder().id(id).build(), requestOptions)

        /** @see initiate */
        @MustBeClosed
        fun initiate(
            params: ActionRequirementInitiateParams
        ): HttpResponseFor<ActionRequirementInitiateResponse> =
            initiate(params, RequestOptions.none())

        /** @see initiate */
        @MustBeClosed
        fun initiate(
            params: ActionRequirementInitiateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRequirementInitiateResponse>
    }
}
