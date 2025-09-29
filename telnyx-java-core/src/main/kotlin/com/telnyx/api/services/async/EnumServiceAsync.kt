// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.enum_.EnumRetrieveParams
import com.telnyx.api.models.enum_.EnumRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EnumServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EnumServiceAsync

    /** Get Enum */
    fun retrieve(endpoint: EnumRetrieveParams.Endpoint): CompletableFuture<EnumRetrieveResponse> =
        retrieve(endpoint, EnumRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        endpoint: EnumRetrieveParams.Endpoint,
        params: EnumRetrieveParams = EnumRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnumRetrieveResponse> =
        retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        endpoint: EnumRetrieveParams.Endpoint,
        params: EnumRetrieveParams = EnumRetrieveParams.none(),
    ): CompletableFuture<EnumRetrieveResponse> = retrieve(endpoint, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EnumRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnumRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: EnumRetrieveParams): CompletableFuture<EnumRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        endpoint: EnumRetrieveParams.Endpoint,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnumRetrieveResponse> =
        retrieve(endpoint, EnumRetrieveParams.none(), requestOptions)

    /** A view of [EnumServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EnumServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /enum/{endpoint}`, but is otherwise the same as
         * [EnumServiceAsync.retrieve].
         */
        fun retrieve(
            endpoint: EnumRetrieveParams.Endpoint
        ): CompletableFuture<HttpResponseFor<EnumRetrieveResponse>> =
            retrieve(endpoint, EnumRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            endpoint: EnumRetrieveParams.Endpoint,
            params: EnumRetrieveParams = EnumRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnumRetrieveResponse>> =
            retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            endpoint: EnumRetrieveParams.Endpoint,
            params: EnumRetrieveParams = EnumRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EnumRetrieveResponse>> =
            retrieve(endpoint, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EnumRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnumRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: EnumRetrieveParams
        ): CompletableFuture<HttpResponseFor<EnumRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            endpoint: EnumRetrieveParams.Endpoint,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnumRetrieveResponse>> =
            retrieve(endpoint, EnumRetrieveParams.none(), requestOptions)
    }
}
