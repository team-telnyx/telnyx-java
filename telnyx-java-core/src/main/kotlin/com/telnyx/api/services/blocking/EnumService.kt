// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.enum_.EnumRetrieveParams
import com.telnyx.api.models.enum_.EnumRetrieveResponse
import java.util.function.Consumer

interface EnumService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EnumService

    /** Get Enum */
    fun retrieve(endpoint: EnumRetrieveParams.Endpoint): EnumRetrieveResponse =
        retrieve(endpoint, EnumRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        endpoint: EnumRetrieveParams.Endpoint,
        params: EnumRetrieveParams = EnumRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnumRetrieveResponse =
        retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        endpoint: EnumRetrieveParams.Endpoint,
        params: EnumRetrieveParams = EnumRetrieveParams.none(),
    ): EnumRetrieveResponse = retrieve(endpoint, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EnumRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnumRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: EnumRetrieveParams): EnumRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        endpoint: EnumRetrieveParams.Endpoint,
        requestOptions: RequestOptions,
    ): EnumRetrieveResponse = retrieve(endpoint, EnumRetrieveParams.none(), requestOptions)

    /** A view of [EnumService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EnumService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /enum/{endpoint}`, but is otherwise the same as
         * [EnumService.retrieve].
         */
        @MustBeClosed
        fun retrieve(endpoint: EnumRetrieveParams.Endpoint): HttpResponseFor<EnumRetrieveResponse> =
            retrieve(endpoint, EnumRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            endpoint: EnumRetrieveParams.Endpoint,
            params: EnumRetrieveParams = EnumRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnumRetrieveResponse> =
            retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            endpoint: EnumRetrieveParams.Endpoint,
            params: EnumRetrieveParams = EnumRetrieveParams.none(),
        ): HttpResponseFor<EnumRetrieveResponse> = retrieve(endpoint, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EnumRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnumRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: EnumRetrieveParams): HttpResponseFor<EnumRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            endpoint: EnumRetrieveParams.Endpoint,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EnumRetrieveResponse> =
            retrieve(endpoint, EnumRetrieveParams.none(), requestOptions)
    }
}
