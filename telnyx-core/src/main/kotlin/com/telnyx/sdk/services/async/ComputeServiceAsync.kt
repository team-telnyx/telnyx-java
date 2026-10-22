// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.compute.ComputeRetrieveParams
import com.telnyx.sdk.models.compute.ComputeRetrieveResponse
import com.telnyx.sdk.services.async.compute.FuncServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Inspect Stateful Actor types */
interface ComputeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ComputeServiceAsync

    /** Manage Edge Compute functions */
    fun funcs(): FuncServiceAsync

    /**
     * Retrieve one account-scoped Stateful Actor type. owner_function_id identifies the function
     * that owns and ships the actor class; other functions may reference the same actor type
     * through actor bindings.
     */
    fun retrieve(id: String): CompletableFuture<ComputeRetrieveResponse> =
        retrieve(id, ComputeRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ComputeRetrieveParams = ComputeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ComputeRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ComputeRetrieveParams = ComputeRetrieveParams.none(),
    ): CompletableFuture<ComputeRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ComputeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ComputeRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: ComputeRetrieveParams): CompletableFuture<ComputeRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ComputeRetrieveResponse> =
        retrieve(id, ComputeRetrieveParams.none(), requestOptions)

    /**
     * A view of [ComputeServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ComputeServiceAsync.WithRawResponse

        /** Manage Edge Compute functions */
        fun funcs(): FuncServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /compute/actors/{id}`, but is otherwise the same as
         * [ComputeServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<ComputeRetrieveResponse>> =
            retrieve(id, ComputeRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ComputeRetrieveParams = ComputeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ComputeRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ComputeRetrieveParams = ComputeRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ComputeRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ComputeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ComputeRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ComputeRetrieveParams
        ): CompletableFuture<HttpResponseFor<ComputeRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ComputeRetrieveResponse>> =
            retrieve(id, ComputeRetrieveParams.none(), requestOptions)
    }
}
