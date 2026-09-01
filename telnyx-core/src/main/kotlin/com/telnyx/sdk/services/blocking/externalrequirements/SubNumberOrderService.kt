// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.externalrequirements

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.externalrequirements.subnumberorders.SubNumberOrderRetrieveParams
import com.telnyx.sdk.models.externalrequirements.subnumberorders.SubNumberOrderRetrieveResponse
import com.telnyx.sdk.models.externalrequirements.subnumberorders.SubNumberOrderUpdateParams
import com.telnyx.sdk.models.externalrequirements.subnumberorders.SubNumberOrderUpdateResponse
import java.util.function.Consumer

/** Requirement Groups */
interface SubNumberOrderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubNumberOrderService

    /**
     * Returns the input fields an action requirement needs and the current requirement action for a
     * sub number order. Action requirements are fulfilled by an external step rather than by
     * uploading documents. Australia mobile ID verification is currently the only action
     * requirement. Once a verification link has been generated, it is returned in
     * `requirement_action.value`.
     */
    fun retrieve(
        subNumberOrderId: String,
        params: SubNumberOrderRetrieveParams,
    ): SubNumberOrderRetrieveResponse = retrieve(subNumberOrderId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        subNumberOrderId: String,
        params: SubNumberOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubNumberOrderRetrieveResponse =
        retrieve(params.toBuilder().subNumberOrderId(subNumberOrderId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: SubNumberOrderRetrieveParams): SubNumberOrderRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SubNumberOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubNumberOrderRetrieveResponse

    /**
     * Submits the end user's details to the external verification provider and returns the
     * requirement action. Australia mobile ID verification is currently the only action
     * requirement. It generates a unique Onfido verification link, returned in
     * `requirement_action.value`, which you share with the end user. The end user's `first_name`
     * and `last_name` must be nested inside a `requirement` object; sending them at the top level
     * is rejected.
     */
    fun update(
        subNumberOrderId: String,
        params: SubNumberOrderUpdateParams,
    ): SubNumberOrderUpdateResponse = update(subNumberOrderId, params, RequestOptions.none())

    /** @see update */
    fun update(
        subNumberOrderId: String,
        params: SubNumberOrderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubNumberOrderUpdateResponse =
        update(params.toBuilder().subNumberOrderId(subNumberOrderId).build(), requestOptions)

    /** @see update */
    fun update(params: SubNumberOrderUpdateParams): SubNumberOrderUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SubNumberOrderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubNumberOrderUpdateResponse

    /**
     * A view of [SubNumberOrderService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubNumberOrderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /external_requirements/{regulatory_requirement_id}/sub_number_orders/{sub_number_order_id}`,
         * but is otherwise the same as [SubNumberOrderService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            subNumberOrderId: String,
            params: SubNumberOrderRetrieveParams,
        ): HttpResponseFor<SubNumberOrderRetrieveResponse> =
            retrieve(subNumberOrderId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            subNumberOrderId: String,
            params: SubNumberOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubNumberOrderRetrieveResponse> =
            retrieve(params.toBuilder().subNumberOrderId(subNumberOrderId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SubNumberOrderRetrieveParams
        ): HttpResponseFor<SubNumberOrderRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SubNumberOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubNumberOrderRetrieveResponse>

        /**
         * Returns a raw HTTP response for `post
         * /external_requirements/{regulatory_requirement_id}/sub_number_orders/{sub_number_order_id}`,
         * but is otherwise the same as [SubNumberOrderService.update].
         */
        @MustBeClosed
        fun update(
            subNumberOrderId: String,
            params: SubNumberOrderUpdateParams,
        ): HttpResponseFor<SubNumberOrderUpdateResponse> =
            update(subNumberOrderId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            subNumberOrderId: String,
            params: SubNumberOrderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubNumberOrderUpdateResponse> =
            update(params.toBuilder().subNumberOrderId(subNumberOrderId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: SubNumberOrderUpdateParams
        ): HttpResponseFor<SubNumberOrderUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SubNumberOrderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubNumberOrderUpdateResponse>
    }
}
