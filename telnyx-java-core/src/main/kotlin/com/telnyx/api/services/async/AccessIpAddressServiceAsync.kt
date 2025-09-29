// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.accessipaddress.AccessIpAddressCreateParams
import com.telnyx.api.models.accessipaddress.AccessIpAddressDeleteParams
import com.telnyx.api.models.accessipaddress.AccessIpAddressListParams
import com.telnyx.api.models.accessipaddress.AccessIpAddressListResponse
import com.telnyx.api.models.accessipaddress.AccessIpAddressResponse
import com.telnyx.api.models.accessipaddress.AccessIpAddressRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AccessIpAddressServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccessIpAddressServiceAsync

    /** Create new Access IP Address */
    fun create(params: AccessIpAddressCreateParams): CompletableFuture<AccessIpAddressResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AccessIpAddressCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccessIpAddressResponse>

    /** Retrieve an access IP address */
    fun retrieve(accessIpAddressId: String): CompletableFuture<AccessIpAddressResponse> =
        retrieve(accessIpAddressId, AccessIpAddressRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        accessIpAddressId: String,
        params: AccessIpAddressRetrieveParams = AccessIpAddressRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccessIpAddressResponse> =
        retrieve(params.toBuilder().accessIpAddressId(accessIpAddressId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        accessIpAddressId: String,
        params: AccessIpAddressRetrieveParams = AccessIpAddressRetrieveParams.none(),
    ): CompletableFuture<AccessIpAddressResponse> =
        retrieve(accessIpAddressId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AccessIpAddressRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccessIpAddressResponse>

    /** @see retrieve */
    fun retrieve(
        params: AccessIpAddressRetrieveParams
    ): CompletableFuture<AccessIpAddressResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        accessIpAddressId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccessIpAddressResponse> =
        retrieve(accessIpAddressId, AccessIpAddressRetrieveParams.none(), requestOptions)

    /** List all Access IP Addresses */
    fun list(): CompletableFuture<AccessIpAddressListResponse> =
        list(AccessIpAddressListParams.none())

    /** @see list */
    fun list(
        params: AccessIpAddressListParams = AccessIpAddressListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccessIpAddressListResponse>

    /** @see list */
    fun list(
        params: AccessIpAddressListParams = AccessIpAddressListParams.none()
    ): CompletableFuture<AccessIpAddressListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AccessIpAddressListResponse> =
        list(AccessIpAddressListParams.none(), requestOptions)

    /** Delete access IP address */
    fun delete(accessIpAddressId: String): CompletableFuture<AccessIpAddressResponse> =
        delete(accessIpAddressId, AccessIpAddressDeleteParams.none())

    /** @see delete */
    fun delete(
        accessIpAddressId: String,
        params: AccessIpAddressDeleteParams = AccessIpAddressDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccessIpAddressResponse> =
        delete(params.toBuilder().accessIpAddressId(accessIpAddressId).build(), requestOptions)

    /** @see delete */
    fun delete(
        accessIpAddressId: String,
        params: AccessIpAddressDeleteParams = AccessIpAddressDeleteParams.none(),
    ): CompletableFuture<AccessIpAddressResponse> =
        delete(accessIpAddressId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AccessIpAddressDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccessIpAddressResponse>

    /** @see delete */
    fun delete(params: AccessIpAddressDeleteParams): CompletableFuture<AccessIpAddressResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        accessIpAddressId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccessIpAddressResponse> =
        delete(accessIpAddressId, AccessIpAddressDeleteParams.none(), requestOptions)

    /**
     * A view of [AccessIpAddressServiceAsync] that provides access to raw HTTP responses for each
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
        ): AccessIpAddressServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /access_ip_address`, but is otherwise the same as
         * [AccessIpAddressServiceAsync.create].
         */
        fun create(
            params: AccessIpAddressCreateParams
        ): CompletableFuture<HttpResponseFor<AccessIpAddressResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AccessIpAddressCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccessIpAddressResponse>>

        /**
         * Returns a raw HTTP response for `get /access_ip_address/{access_ip_address_id}`, but is
         * otherwise the same as [AccessIpAddressServiceAsync.retrieve].
         */
        fun retrieve(
            accessIpAddressId: String
        ): CompletableFuture<HttpResponseFor<AccessIpAddressResponse>> =
            retrieve(accessIpAddressId, AccessIpAddressRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            accessIpAddressId: String,
            params: AccessIpAddressRetrieveParams = AccessIpAddressRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccessIpAddressResponse>> =
            retrieve(
                params.toBuilder().accessIpAddressId(accessIpAddressId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            accessIpAddressId: String,
            params: AccessIpAddressRetrieveParams = AccessIpAddressRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AccessIpAddressResponse>> =
            retrieve(accessIpAddressId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AccessIpAddressRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccessIpAddressResponse>>

        /** @see retrieve */
        fun retrieve(
            params: AccessIpAddressRetrieveParams
        ): CompletableFuture<HttpResponseFor<AccessIpAddressResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            accessIpAddressId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccessIpAddressResponse>> =
            retrieve(accessIpAddressId, AccessIpAddressRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /access_ip_address`, but is otherwise the same as
         * [AccessIpAddressServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AccessIpAddressListResponse>> =
            list(AccessIpAddressListParams.none())

        /** @see list */
        fun list(
            params: AccessIpAddressListParams = AccessIpAddressListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccessIpAddressListResponse>>

        /** @see list */
        fun list(
            params: AccessIpAddressListParams = AccessIpAddressListParams.none()
        ): CompletableFuture<HttpResponseFor<AccessIpAddressListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AccessIpAddressListResponse>> =
            list(AccessIpAddressListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /access_ip_address/{access_ip_address_id}`, but
         * is otherwise the same as [AccessIpAddressServiceAsync.delete].
         */
        fun delete(
            accessIpAddressId: String
        ): CompletableFuture<HttpResponseFor<AccessIpAddressResponse>> =
            delete(accessIpAddressId, AccessIpAddressDeleteParams.none())

        /** @see delete */
        fun delete(
            accessIpAddressId: String,
            params: AccessIpAddressDeleteParams = AccessIpAddressDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccessIpAddressResponse>> =
            delete(params.toBuilder().accessIpAddressId(accessIpAddressId).build(), requestOptions)

        /** @see delete */
        fun delete(
            accessIpAddressId: String,
            params: AccessIpAddressDeleteParams = AccessIpAddressDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<AccessIpAddressResponse>> =
            delete(accessIpAddressId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AccessIpAddressDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccessIpAddressResponse>>

        /** @see delete */
        fun delete(
            params: AccessIpAddressDeleteParams
        ): CompletableFuture<HttpResponseFor<AccessIpAddressResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            accessIpAddressId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccessIpAddressResponse>> =
            delete(accessIpAddressId, AccessIpAddressDeleteParams.none(), requestOptions)
    }
}
