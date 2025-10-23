// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.accessipaddress.AccessIpAddressCreateParams
import com.telnyx.sdk.models.accessipaddress.AccessIpAddressDeleteParams
import com.telnyx.sdk.models.accessipaddress.AccessIpAddressListParams
import com.telnyx.sdk.models.accessipaddress.AccessIpAddressListResponse
import com.telnyx.sdk.models.accessipaddress.AccessIpAddressResponse
import com.telnyx.sdk.models.accessipaddress.AccessIpAddressRetrieveParams
import java.util.function.Consumer

interface AccessIpAddressService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccessIpAddressService

    /** Create new Access IP Address */
    fun create(params: AccessIpAddressCreateParams): AccessIpAddressResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AccessIpAddressCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccessIpAddressResponse

    /** Retrieve an access IP address */
    fun retrieve(accessIpAddressId: String): AccessIpAddressResponse =
        retrieve(accessIpAddressId, AccessIpAddressRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        accessIpAddressId: String,
        params: AccessIpAddressRetrieveParams = AccessIpAddressRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccessIpAddressResponse =
        retrieve(params.toBuilder().accessIpAddressId(accessIpAddressId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        accessIpAddressId: String,
        params: AccessIpAddressRetrieveParams = AccessIpAddressRetrieveParams.none(),
    ): AccessIpAddressResponse = retrieve(accessIpAddressId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AccessIpAddressRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccessIpAddressResponse

    /** @see retrieve */
    fun retrieve(params: AccessIpAddressRetrieveParams): AccessIpAddressResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        accessIpAddressId: String,
        requestOptions: RequestOptions,
    ): AccessIpAddressResponse =
        retrieve(accessIpAddressId, AccessIpAddressRetrieveParams.none(), requestOptions)

    /** List all Access IP Addresses */
    fun list(): AccessIpAddressListResponse = list(AccessIpAddressListParams.none())

    /** @see list */
    fun list(
        params: AccessIpAddressListParams = AccessIpAddressListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccessIpAddressListResponse

    /** @see list */
    fun list(
        params: AccessIpAddressListParams = AccessIpAddressListParams.none()
    ): AccessIpAddressListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AccessIpAddressListResponse =
        list(AccessIpAddressListParams.none(), requestOptions)

    /** Delete access IP address */
    fun delete(accessIpAddressId: String): AccessIpAddressResponse =
        delete(accessIpAddressId, AccessIpAddressDeleteParams.none())

    /** @see delete */
    fun delete(
        accessIpAddressId: String,
        params: AccessIpAddressDeleteParams = AccessIpAddressDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccessIpAddressResponse =
        delete(params.toBuilder().accessIpAddressId(accessIpAddressId).build(), requestOptions)

    /** @see delete */
    fun delete(
        accessIpAddressId: String,
        params: AccessIpAddressDeleteParams = AccessIpAddressDeleteParams.none(),
    ): AccessIpAddressResponse = delete(accessIpAddressId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AccessIpAddressDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccessIpAddressResponse

    /** @see delete */
    fun delete(params: AccessIpAddressDeleteParams): AccessIpAddressResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(accessIpAddressId: String, requestOptions: RequestOptions): AccessIpAddressResponse =
        delete(accessIpAddressId, AccessIpAddressDeleteParams.none(), requestOptions)

    /**
     * A view of [AccessIpAddressService] that provides access to raw HTTP responses for each
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
        ): AccessIpAddressService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /access_ip_address`, but is otherwise the same as
         * [AccessIpAddressService.create].
         */
        @MustBeClosed
        fun create(params: AccessIpAddressCreateParams): HttpResponseFor<AccessIpAddressResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AccessIpAddressCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccessIpAddressResponse>

        /**
         * Returns a raw HTTP response for `get /access_ip_address/{access_ip_address_id}`, but is
         * otherwise the same as [AccessIpAddressService.retrieve].
         */
        @MustBeClosed
        fun retrieve(accessIpAddressId: String): HttpResponseFor<AccessIpAddressResponse> =
            retrieve(accessIpAddressId, AccessIpAddressRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            accessIpAddressId: String,
            params: AccessIpAddressRetrieveParams = AccessIpAddressRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccessIpAddressResponse> =
            retrieve(
                params.toBuilder().accessIpAddressId(accessIpAddressId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            accessIpAddressId: String,
            params: AccessIpAddressRetrieveParams = AccessIpAddressRetrieveParams.none(),
        ): HttpResponseFor<AccessIpAddressResponse> =
            retrieve(accessIpAddressId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AccessIpAddressRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccessIpAddressResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AccessIpAddressRetrieveParams
        ): HttpResponseFor<AccessIpAddressResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            accessIpAddressId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccessIpAddressResponse> =
            retrieve(accessIpAddressId, AccessIpAddressRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /access_ip_address`, but is otherwise the same as
         * [AccessIpAddressService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AccessIpAddressListResponse> =
            list(AccessIpAddressListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AccessIpAddressListParams = AccessIpAddressListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccessIpAddressListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AccessIpAddressListParams = AccessIpAddressListParams.none()
        ): HttpResponseFor<AccessIpAddressListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AccessIpAddressListResponse> =
            list(AccessIpAddressListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /access_ip_address/{access_ip_address_id}`, but
         * is otherwise the same as [AccessIpAddressService.delete].
         */
        @MustBeClosed
        fun delete(accessIpAddressId: String): HttpResponseFor<AccessIpAddressResponse> =
            delete(accessIpAddressId, AccessIpAddressDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            accessIpAddressId: String,
            params: AccessIpAddressDeleteParams = AccessIpAddressDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccessIpAddressResponse> =
            delete(params.toBuilder().accessIpAddressId(accessIpAddressId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            accessIpAddressId: String,
            params: AccessIpAddressDeleteParams = AccessIpAddressDeleteParams.none(),
        ): HttpResponseFor<AccessIpAddressResponse> =
            delete(accessIpAddressId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AccessIpAddressDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccessIpAddressResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: AccessIpAddressDeleteParams): HttpResponseFor<AccessIpAddressResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            accessIpAddressId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccessIpAddressResponse> =
            delete(accessIpAddressId, AccessIpAddressDeleteParams.none(), requestOptions)
    }
}
