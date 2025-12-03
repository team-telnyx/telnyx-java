// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.enumeration.EnumerationRetrieveParams
import com.telnyx.sdk.models.enumeration.EnumerationRetrieveResponse
import java.util.function.Consumer

interface EnumerationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EnumerationService

    /** Get Enum */
    fun retrieve(endpoint: EnumerationRetrieveParams.Endpoint): EnumerationRetrieveResponse =
        retrieve(endpoint, EnumerationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        endpoint: EnumerationRetrieveParams.Endpoint,
        params: EnumerationRetrieveParams = EnumerationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnumerationRetrieveResponse =
        retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        endpoint: EnumerationRetrieveParams.Endpoint,
        params: EnumerationRetrieveParams = EnumerationRetrieveParams.none(),
    ): EnumerationRetrieveResponse = retrieve(endpoint, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EnumerationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnumerationRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: EnumerationRetrieveParams): EnumerationRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        endpoint: EnumerationRetrieveParams.Endpoint,
        requestOptions: RequestOptions,
    ): EnumerationRetrieveResponse =
        retrieve(endpoint, EnumerationRetrieveParams.none(), requestOptions)

    /**
     * A view of [EnumerationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EnumerationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /enum/{endpoint}`, but is otherwise the same as
         * [EnumerationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            endpoint: EnumerationRetrieveParams.Endpoint
        ): HttpResponseFor<EnumerationRetrieveResponse> =
            retrieve(endpoint, EnumerationRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            endpoint: EnumerationRetrieveParams.Endpoint,
            params: EnumerationRetrieveParams = EnumerationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnumerationRetrieveResponse> =
            retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            endpoint: EnumerationRetrieveParams.Endpoint,
            params: EnumerationRetrieveParams = EnumerationRetrieveParams.none(),
        ): HttpResponseFor<EnumerationRetrieveResponse> =
            retrieve(endpoint, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EnumerationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnumerationRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EnumerationRetrieveParams
        ): HttpResponseFor<EnumerationRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            endpoint: EnumerationRetrieveParams.Endpoint,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EnumerationRetrieveResponse> =
            retrieve(endpoint, EnumerationRetrieveParams.none(), requestOptions)
    }
}
