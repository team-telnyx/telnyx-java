// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.externalconnections

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.externalconnections.civicaddresses.CivicAddressListParams
import com.telnyx.sdk.models.externalconnections.civicaddresses.CivicAddressListResponse
import com.telnyx.sdk.models.externalconnections.civicaddresses.CivicAddressRetrieveParams
import com.telnyx.sdk.models.externalconnections.civicaddresses.CivicAddressRetrieveResponse
import java.util.function.Consumer

interface CivicAddressService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CivicAddressService

    /**
     * Return the details of an existing Civic Address with its Locations inside the 'data'
     * attribute of the response.
     */
    fun retrieve(
        addressId: String,
        params: CivicAddressRetrieveParams,
    ): CivicAddressRetrieveResponse = retrieve(addressId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        addressId: String,
        params: CivicAddressRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CivicAddressRetrieveResponse =
        retrieve(params.toBuilder().addressId(addressId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: CivicAddressRetrieveParams): CivicAddressRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CivicAddressRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CivicAddressRetrieveResponse

    /** Returns the civic addresses and locations from Microsoft Teams. */
    fun list(id: String): CivicAddressListResponse = list(id, CivicAddressListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: CivicAddressListParams = CivicAddressListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CivicAddressListResponse = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: CivicAddressListParams = CivicAddressListParams.none(),
    ): CivicAddressListResponse = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CivicAddressListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CivicAddressListResponse

    /** @see list */
    fun list(params: CivicAddressListParams): CivicAddressListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): CivicAddressListResponse =
        list(id, CivicAddressListParams.none(), requestOptions)

    /**
     * A view of [CivicAddressService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CivicAddressService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /external_connections/{id}/civic_addresses/{address_id}`, but is otherwise the same as
         * [CivicAddressService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            addressId: String,
            params: CivicAddressRetrieveParams,
        ): HttpResponseFor<CivicAddressRetrieveResponse> =
            retrieve(addressId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            addressId: String,
            params: CivicAddressRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CivicAddressRetrieveResponse> =
            retrieve(params.toBuilder().addressId(addressId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CivicAddressRetrieveParams
        ): HttpResponseFor<CivicAddressRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CivicAddressRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CivicAddressRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /external_connections/{id}/civic_addresses`, but is
         * otherwise the same as [CivicAddressService.list].
         */
        @MustBeClosed
        fun list(id: String): HttpResponseFor<CivicAddressListResponse> =
            list(id, CivicAddressListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: CivicAddressListParams = CivicAddressListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CivicAddressListResponse> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: CivicAddressListParams = CivicAddressListParams.none(),
        ): HttpResponseFor<CivicAddressListResponse> = list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CivicAddressListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CivicAddressListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: CivicAddressListParams): HttpResponseFor<CivicAddressListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CivicAddressListResponse> =
            list(id, CivicAddressListParams.none(), requestOptions)
    }
}
