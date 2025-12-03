// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.enumeration.EnumerationRetrieveParams
import com.telnyx.sdk.models.enumeration.EnumerationRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EnumerationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EnumerationServiceAsync

    /** Get Enum */
    fun retrieve(
        endpoint: EnumerationRetrieveParams.Endpoint
    ): CompletableFuture<EnumerationRetrieveResponse> =
        retrieve(endpoint, EnumerationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        endpoint: EnumerationRetrieveParams.Endpoint,
        params: EnumerationRetrieveParams = EnumerationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnumerationRetrieveResponse> =
        retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        endpoint: EnumerationRetrieveParams.Endpoint,
        params: EnumerationRetrieveParams = EnumerationRetrieveParams.none(),
    ): CompletableFuture<EnumerationRetrieveResponse> =
        retrieve(endpoint, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EnumerationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnumerationRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: EnumerationRetrieveParams
    ): CompletableFuture<EnumerationRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        endpoint: EnumerationRetrieveParams.Endpoint,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnumerationRetrieveResponse> =
        retrieve(endpoint, EnumerationRetrieveParams.none(), requestOptions)

    /**
     * A view of [EnumerationServiceAsync] that provides access to raw HTTP responses for each
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
        ): EnumerationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /enum/{endpoint}`, but is otherwise the same as
         * [EnumerationServiceAsync.retrieve].
         */
        fun retrieve(
            endpoint: EnumerationRetrieveParams.Endpoint
        ): CompletableFuture<HttpResponseFor<EnumerationRetrieveResponse>> =
            retrieve(endpoint, EnumerationRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            endpoint: EnumerationRetrieveParams.Endpoint,
            params: EnumerationRetrieveParams = EnumerationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnumerationRetrieveResponse>> =
            retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            endpoint: EnumerationRetrieveParams.Endpoint,
            params: EnumerationRetrieveParams = EnumerationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EnumerationRetrieveResponse>> =
            retrieve(endpoint, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EnumerationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnumerationRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: EnumerationRetrieveParams
        ): CompletableFuture<HttpResponseFor<EnumerationRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            endpoint: EnumerationRetrieveParams.Endpoint,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnumerationRetrieveResponse>> =
            retrieve(endpoint, EnumerationRetrieveParams.none(), requestOptions)
    }
}
