// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.invoices.InvoiceListParams
import com.telnyx.api.models.invoices.InvoiceListResponse
import com.telnyx.api.models.invoices.InvoiceRetrieveParams
import com.telnyx.api.models.invoices.InvoiceRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InvoiceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvoiceServiceAsync

    /** Retrieve a single invoice by its unique identifier. */
    fun retrieve(id: String): CompletableFuture<InvoiceRetrieveResponse> =
        retrieve(id, InvoiceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: InvoiceRetrieveParams = InvoiceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvoiceRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: InvoiceRetrieveParams = InvoiceRetrieveParams.none(),
    ): CompletableFuture<InvoiceRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InvoiceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvoiceRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: InvoiceRetrieveParams): CompletableFuture<InvoiceRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InvoiceRetrieveResponse> =
        retrieve(id, InvoiceRetrieveParams.none(), requestOptions)

    /** Retrieve a paginated list of invoices. */
    fun list(): CompletableFuture<InvoiceListResponse> = list(InvoiceListParams.none())

    /** @see list */
    fun list(
        params: InvoiceListParams = InvoiceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvoiceListResponse>

    /** @see list */
    fun list(
        params: InvoiceListParams = InvoiceListParams.none()
    ): CompletableFuture<InvoiceListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<InvoiceListResponse> =
        list(InvoiceListParams.none(), requestOptions)

    /**
     * A view of [InvoiceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InvoiceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /invoices/{id}`, but is otherwise the same as
         * [InvoiceServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<InvoiceRetrieveResponse>> =
            retrieve(id, InvoiceRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: InvoiceRetrieveParams = InvoiceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: InvoiceRetrieveParams = InvoiceRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: InvoiceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: InvoiceRetrieveParams
        ): CompletableFuture<HttpResponseFor<InvoiceRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InvoiceRetrieveResponse>> =
            retrieve(id, InvoiceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /invoices`, but is otherwise the same as
         * [InvoiceServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<InvoiceListResponse>> =
            list(InvoiceListParams.none())

        /** @see list */
        fun list(
            params: InvoiceListParams = InvoiceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceListResponse>>

        /** @see list */
        fun list(
            params: InvoiceListParams = InvoiceListParams.none()
        ): CompletableFuture<HttpResponseFor<InvoiceListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InvoiceListResponse>> =
            list(InvoiceListParams.none(), requestOptions)
    }
}
