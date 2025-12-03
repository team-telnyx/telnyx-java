// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.portingorders

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.portingorders.actionrequirements.ActionRequirementInitiateParams
import com.telnyx.sdk.models.portingorders.actionrequirements.ActionRequirementInitiateResponse
import com.telnyx.sdk.models.portingorders.actionrequirements.ActionRequirementListPage
import com.telnyx.sdk.models.portingorders.actionrequirements.ActionRequirementListParams
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
    fun list(portingOrderId: String): ActionRequirementListPage =
        list(portingOrderId, ActionRequirementListParams.none())

    /** @see list */
    fun list(
        portingOrderId: String,
        params: ActionRequirementListParams = ActionRequirementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRequirementListPage =
        list(params.toBuilder().portingOrderId(portingOrderId).build(), requestOptions)

    /** @see list */
    fun list(
        portingOrderId: String,
        params: ActionRequirementListParams = ActionRequirementListParams.none(),
    ): ActionRequirementListPage = list(portingOrderId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ActionRequirementListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRequirementListPage

    /** @see list */
    fun list(params: ActionRequirementListParams): ActionRequirementListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(portingOrderId: String, requestOptions: RequestOptions): ActionRequirementListPage =
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
        fun list(portingOrderId: String): HttpResponseFor<ActionRequirementListPage> =
            list(portingOrderId, ActionRequirementListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            portingOrderId: String,
            params: ActionRequirementListParams = ActionRequirementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRequirementListPage> =
            list(params.toBuilder().portingOrderId(portingOrderId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            portingOrderId: String,
            params: ActionRequirementListParams = ActionRequirementListParams.none(),
        ): HttpResponseFor<ActionRequirementListPage> =
            list(portingOrderId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ActionRequirementListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRequirementListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: ActionRequirementListParams): HttpResponseFor<ActionRequirementListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            portingOrderId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionRequirementListPage> =
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
