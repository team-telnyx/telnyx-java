// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.compute.ComputeRetrieveParams
import com.telnyx.sdk.models.compute.ComputeRetrieveResponse
import com.telnyx.sdk.services.blocking.compute.FuncService
import java.util.function.Consumer

/** Inspect Stateful Actor types */
interface ComputeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ComputeService

    /** Manage Edge Compute functions */
    fun funcs(): FuncService

    /**
     * Retrieve one account-scoped Stateful Actor type. owner_function_id identifies the function
     * that owns and ships the actor class; other functions may reference the same actor type
     * through actor bindings.
     */
    fun retrieve(id: String): ComputeRetrieveResponse = retrieve(id, ComputeRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ComputeRetrieveParams = ComputeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ComputeRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ComputeRetrieveParams = ComputeRetrieveParams.none(),
    ): ComputeRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ComputeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ComputeRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: ComputeRetrieveParams): ComputeRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): ComputeRetrieveResponse =
        retrieve(id, ComputeRetrieveParams.none(), requestOptions)

    /** A view of [ComputeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ComputeService.WithRawResponse

        /** Manage Edge Compute functions */
        fun funcs(): FuncService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /compute/actors/{id}`, but is otherwise the same as
         * [ComputeService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<ComputeRetrieveResponse> =
            retrieve(id, ComputeRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ComputeRetrieveParams = ComputeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ComputeRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ComputeRetrieveParams = ComputeRetrieveParams.none(),
        ): HttpResponseFor<ComputeRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ComputeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ComputeRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ComputeRetrieveParams): HttpResponseFor<ComputeRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ComputeRetrieveResponse> =
            retrieve(id, ComputeRetrieveParams.none(), requestOptions)
    }
}
