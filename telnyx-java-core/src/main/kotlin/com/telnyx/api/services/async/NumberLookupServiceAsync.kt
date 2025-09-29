// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.numberlookup.NumberLookupRetrieveParams
import com.telnyx.api.models.numberlookup.NumberLookupRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface NumberLookupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumberLookupServiceAsync

    /** Returns information about the provided phone number. */
    fun retrieve(phoneNumber: String): CompletableFuture<NumberLookupRetrieveResponse> =
        retrieve(phoneNumber, NumberLookupRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        params: NumberLookupRetrieveParams = NumberLookupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberLookupRetrieveResponse> =
        retrieve(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        params: NumberLookupRetrieveParams = NumberLookupRetrieveParams.none(),
    ): CompletableFuture<NumberLookupRetrieveResponse> =
        retrieve(phoneNumber, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NumberLookupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberLookupRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: NumberLookupRetrieveParams
    ): CompletableFuture<NumberLookupRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NumberLookupRetrieveResponse> =
        retrieve(phoneNumber, NumberLookupRetrieveParams.none(), requestOptions)

    /**
     * A view of [NumberLookupServiceAsync] that provides access to raw HTTP responses for each
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
        ): NumberLookupServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /number_lookup/{phone_number}`, but is otherwise the
         * same as [NumberLookupServiceAsync.retrieve].
         */
        fun retrieve(
            phoneNumber: String
        ): CompletableFuture<HttpResponseFor<NumberLookupRetrieveResponse>> =
            retrieve(phoneNumber, NumberLookupRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            phoneNumber: String,
            params: NumberLookupRetrieveParams = NumberLookupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberLookupRetrieveResponse>> =
            retrieve(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            phoneNumber: String,
            params: NumberLookupRetrieveParams = NumberLookupRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<NumberLookupRetrieveResponse>> =
            retrieve(phoneNumber, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: NumberLookupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberLookupRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: NumberLookupRetrieveParams
        ): CompletableFuture<HttpResponseFor<NumberLookupRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NumberLookupRetrieveResponse>> =
            retrieve(phoneNumber, NumberLookupRetrieveParams.none(), requestOptions)
    }
}
