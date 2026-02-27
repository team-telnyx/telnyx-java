// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.numberlookup.NumberLookupRetrieveParams
import com.telnyx.sdk.models.numberlookup.NumberLookupRetrieveResponse
import java.util.function.Consumer

/** Look up phone number data */
interface NumberLookupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumberLookupService

    /** Returns information about the provided phone number. */
    fun retrieve(phoneNumber: String): NumberLookupRetrieveResponse =
        retrieve(phoneNumber, NumberLookupRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        params: NumberLookupRetrieveParams = NumberLookupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberLookupRetrieveResponse =
        retrieve(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        params: NumberLookupRetrieveParams = NumberLookupRetrieveParams.none(),
    ): NumberLookupRetrieveResponse = retrieve(phoneNumber, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NumberLookupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberLookupRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: NumberLookupRetrieveParams): NumberLookupRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        requestOptions: RequestOptions,
    ): NumberLookupRetrieveResponse =
        retrieve(phoneNumber, NumberLookupRetrieveParams.none(), requestOptions)

    /**
     * A view of [NumberLookupService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NumberLookupService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /number_lookup/{phone_number}`, but is otherwise the
         * same as [NumberLookupService.retrieve].
         */
        @MustBeClosed
        fun retrieve(phoneNumber: String): HttpResponseFor<NumberLookupRetrieveResponse> =
            retrieve(phoneNumber, NumberLookupRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            phoneNumber: String,
            params: NumberLookupRetrieveParams = NumberLookupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberLookupRetrieveResponse> =
            retrieve(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            phoneNumber: String,
            params: NumberLookupRetrieveParams = NumberLookupRetrieveParams.none(),
        ): HttpResponseFor<NumberLookupRetrieveResponse> =
            retrieve(phoneNumber, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NumberLookupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberLookupRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NumberLookupRetrieveParams
        ): HttpResponseFor<NumberLookupRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NumberLookupRetrieveResponse> =
            retrieve(phoneNumber, NumberLookupRetrieveParams.none(), requestOptions)
    }
}
