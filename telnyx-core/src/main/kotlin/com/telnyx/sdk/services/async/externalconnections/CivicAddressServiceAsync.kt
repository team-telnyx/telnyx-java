// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.externalconnections

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.externalconnections.civicaddresses.CivicAddressListParams
import com.telnyx.sdk.models.externalconnections.civicaddresses.CivicAddressListResponse
import com.telnyx.sdk.models.externalconnections.civicaddresses.CivicAddressRetrieveParams
import com.telnyx.sdk.models.externalconnections.civicaddresses.CivicAddressRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CivicAddressServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CivicAddressServiceAsync

    /**
     * Return the details of an existing Civic Address with its Locations inside the 'data'
     * attribute of the response.
     */
    fun retrieve(
        addressId: String,
        params: CivicAddressRetrieveParams,
    ): CompletableFuture<CivicAddressRetrieveResponse> =
        retrieve(addressId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        addressId: String,
        params: CivicAddressRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CivicAddressRetrieveResponse> =
        retrieve(params.toBuilder().addressId(addressId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: CivicAddressRetrieveParams
    ): CompletableFuture<CivicAddressRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CivicAddressRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CivicAddressRetrieveResponse>

    /** Returns the civic addresses and locations from Microsoft Teams. */
    fun list(id: String): CompletableFuture<CivicAddressListResponse> =
        list(id, CivicAddressListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: CivicAddressListParams = CivicAddressListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CivicAddressListResponse> =
        list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: CivicAddressListParams = CivicAddressListParams.none(),
    ): CompletableFuture<CivicAddressListResponse> = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CivicAddressListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CivicAddressListResponse>

    /** @see list */
    fun list(params: CivicAddressListParams): CompletableFuture<CivicAddressListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CivicAddressListResponse> =
        list(id, CivicAddressListParams.none(), requestOptions)

    /**
     * A view of [CivicAddressServiceAsync] that provides access to raw HTTP responses for each
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
        ): CivicAddressServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /external_connections/{id}/civic_addresses/{address_id}`, but is otherwise the same as
         * [CivicAddressServiceAsync.retrieve].
         */
        fun retrieve(
            addressId: String,
            params: CivicAddressRetrieveParams,
        ): CompletableFuture<HttpResponseFor<CivicAddressRetrieveResponse>> =
            retrieve(addressId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            addressId: String,
            params: CivicAddressRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CivicAddressRetrieveResponse>> =
            retrieve(params.toBuilder().addressId(addressId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: CivicAddressRetrieveParams
        ): CompletableFuture<HttpResponseFor<CivicAddressRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CivicAddressRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CivicAddressRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `get /external_connections/{id}/civic_addresses`, but is
         * otherwise the same as [CivicAddressServiceAsync.list].
         */
        fun list(id: String): CompletableFuture<HttpResponseFor<CivicAddressListResponse>> =
            list(id, CivicAddressListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: CivicAddressListParams = CivicAddressListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CivicAddressListResponse>> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: CivicAddressListParams = CivicAddressListParams.none(),
        ): CompletableFuture<HttpResponseFor<CivicAddressListResponse>> =
            list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: CivicAddressListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CivicAddressListResponse>>

        /** @see list */
        fun list(
            params: CivicAddressListParams
        ): CompletableFuture<HttpResponseFor<CivicAddressListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CivicAddressListResponse>> =
            list(id, CivicAddressListParams.none(), requestOptions)
    }
}
