// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.invoices.InvoiceListParams
import com.telnyx.api.models.invoices.InvoiceListResponse
import com.telnyx.api.models.invoices.InvoiceRetrieveParams
import com.telnyx.api.models.invoices.InvoiceRetrieveResponse
import java.util.function.Consumer

interface InvoiceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvoiceService

    /** Retrieve a single invoice by its unique identifier. */
    fun retrieve(id: String): InvoiceRetrieveResponse = retrieve(id, InvoiceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: InvoiceRetrieveParams = InvoiceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: InvoiceRetrieveParams = InvoiceRetrieveParams.none(),
    ): InvoiceRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InvoiceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: InvoiceRetrieveParams): InvoiceRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): InvoiceRetrieveResponse =
        retrieve(id, InvoiceRetrieveParams.none(), requestOptions)

    /** Retrieve a paginated list of invoices. */
    fun list(): InvoiceListResponse = list(InvoiceListParams.none())

    /** @see list */
    fun list(
        params: InvoiceListParams = InvoiceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceListResponse

    /** @see list */
    fun list(params: InvoiceListParams = InvoiceListParams.none()): InvoiceListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): InvoiceListResponse =
        list(InvoiceListParams.none(), requestOptions)

    /** A view of [InvoiceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvoiceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /invoices/{id}`, but is otherwise the same as
         * [InvoiceService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<InvoiceRetrieveResponse> =
            retrieve(id, InvoiceRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: InvoiceRetrieveParams = InvoiceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: InvoiceRetrieveParams = InvoiceRetrieveParams.none(),
        ): HttpResponseFor<InvoiceRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: InvoiceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: InvoiceRetrieveParams): HttpResponseFor<InvoiceRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvoiceRetrieveResponse> =
            retrieve(id, InvoiceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /invoices`, but is otherwise the same as
         * [InvoiceService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<InvoiceListResponse> = list(InvoiceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: InvoiceListParams = InvoiceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: InvoiceListParams = InvoiceListParams.none()
        ): HttpResponseFor<InvoiceListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InvoiceListResponse> =
            list(InvoiceListParams.none(), requestOptions)
    }
}
