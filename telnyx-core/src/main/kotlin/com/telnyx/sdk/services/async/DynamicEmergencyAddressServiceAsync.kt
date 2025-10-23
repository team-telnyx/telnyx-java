// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.dynamicemergencyaddresses.DynamicEmergencyAddress
import com.telnyx.sdk.models.dynamicemergencyaddresses.DynamicEmergencyAddressCreateParams
import com.telnyx.sdk.models.dynamicemergencyaddresses.DynamicEmergencyAddressCreateResponse
import com.telnyx.sdk.models.dynamicemergencyaddresses.DynamicEmergencyAddressDeleteParams
import com.telnyx.sdk.models.dynamicemergencyaddresses.DynamicEmergencyAddressDeleteResponse
import com.telnyx.sdk.models.dynamicemergencyaddresses.DynamicEmergencyAddressListParams
import com.telnyx.sdk.models.dynamicemergencyaddresses.DynamicEmergencyAddressListResponse
import com.telnyx.sdk.models.dynamicemergencyaddresses.DynamicEmergencyAddressRetrieveParams
import com.telnyx.sdk.models.dynamicemergencyaddresses.DynamicEmergencyAddressRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DynamicEmergencyAddressServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DynamicEmergencyAddressServiceAsync

    /** Creates a dynamic emergency address. */
    fun create(
        params: DynamicEmergencyAddressCreateParams
    ): CompletableFuture<DynamicEmergencyAddressCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DynamicEmergencyAddressCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DynamicEmergencyAddressCreateResponse>

    /** @see create */
    fun create(
        dynamicEmergencyAddress: DynamicEmergencyAddress,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DynamicEmergencyAddressCreateResponse> =
        create(
            DynamicEmergencyAddressCreateParams.builder()
                .dynamicEmergencyAddress(dynamicEmergencyAddress)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        dynamicEmergencyAddress: DynamicEmergencyAddress
    ): CompletableFuture<DynamicEmergencyAddressCreateResponse> =
        create(dynamicEmergencyAddress, RequestOptions.none())

    /** Returns the dynamic emergency address based on the ID provided */
    fun retrieve(id: String): CompletableFuture<DynamicEmergencyAddressRetrieveResponse> =
        retrieve(id, DynamicEmergencyAddressRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DynamicEmergencyAddressRetrieveParams =
            DynamicEmergencyAddressRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DynamicEmergencyAddressRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DynamicEmergencyAddressRetrieveParams = DynamicEmergencyAddressRetrieveParams.none(),
    ): CompletableFuture<DynamicEmergencyAddressRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DynamicEmergencyAddressRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DynamicEmergencyAddressRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: DynamicEmergencyAddressRetrieveParams
    ): CompletableFuture<DynamicEmergencyAddressRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DynamicEmergencyAddressRetrieveResponse> =
        retrieve(id, DynamicEmergencyAddressRetrieveParams.none(), requestOptions)

    /** Returns the dynamic emergency addresses according to filters */
    fun list(): CompletableFuture<DynamicEmergencyAddressListResponse> =
        list(DynamicEmergencyAddressListParams.none())

    /** @see list */
    fun list(
        params: DynamicEmergencyAddressListParams = DynamicEmergencyAddressListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DynamicEmergencyAddressListResponse>

    /** @see list */
    fun list(
        params: DynamicEmergencyAddressListParams = DynamicEmergencyAddressListParams.none()
    ): CompletableFuture<DynamicEmergencyAddressListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<DynamicEmergencyAddressListResponse> =
        list(DynamicEmergencyAddressListParams.none(), requestOptions)

    /** Deletes the dynamic emergency address based on the ID provided */
    fun delete(id: String): CompletableFuture<DynamicEmergencyAddressDeleteResponse> =
        delete(id, DynamicEmergencyAddressDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: DynamicEmergencyAddressDeleteParams = DynamicEmergencyAddressDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DynamicEmergencyAddressDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: DynamicEmergencyAddressDeleteParams = DynamicEmergencyAddressDeleteParams.none(),
    ): CompletableFuture<DynamicEmergencyAddressDeleteResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DynamicEmergencyAddressDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DynamicEmergencyAddressDeleteResponse>

    /** @see delete */
    fun delete(
        params: DynamicEmergencyAddressDeleteParams
    ): CompletableFuture<DynamicEmergencyAddressDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DynamicEmergencyAddressDeleteResponse> =
        delete(id, DynamicEmergencyAddressDeleteParams.none(), requestOptions)

    /**
     * A view of [DynamicEmergencyAddressServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DynamicEmergencyAddressServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /dynamic_emergency_addresses`, but is otherwise the
         * same as [DynamicEmergencyAddressServiceAsync.create].
         */
        fun create(
            params: DynamicEmergencyAddressCreateParams
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyAddressCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DynamicEmergencyAddressCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyAddressCreateResponse>>

        /** @see create */
        fun create(
            dynamicEmergencyAddress: DynamicEmergencyAddress,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyAddressCreateResponse>> =
            create(
                DynamicEmergencyAddressCreateParams.builder()
                    .dynamicEmergencyAddress(dynamicEmergencyAddress)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            dynamicEmergencyAddress: DynamicEmergencyAddress
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyAddressCreateResponse>> =
            create(dynamicEmergencyAddress, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /dynamic_emergency_addresses/{id}`, but is otherwise
         * the same as [DynamicEmergencyAddressServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyAddressRetrieveResponse>> =
            retrieve(id, DynamicEmergencyAddressRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: DynamicEmergencyAddressRetrieveParams =
                DynamicEmergencyAddressRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyAddressRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: DynamicEmergencyAddressRetrieveParams =
                DynamicEmergencyAddressRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyAddressRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: DynamicEmergencyAddressRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyAddressRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: DynamicEmergencyAddressRetrieveParams
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyAddressRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyAddressRetrieveResponse>> =
            retrieve(id, DynamicEmergencyAddressRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /dynamic_emergency_addresses`, but is otherwise the
         * same as [DynamicEmergencyAddressServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<DynamicEmergencyAddressListResponse>> =
            list(DynamicEmergencyAddressListParams.none())

        /** @see list */
        fun list(
            params: DynamicEmergencyAddressListParams = DynamicEmergencyAddressListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyAddressListResponse>>

        /** @see list */
        fun list(
            params: DynamicEmergencyAddressListParams = DynamicEmergencyAddressListParams.none()
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyAddressListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyAddressListResponse>> =
            list(DynamicEmergencyAddressListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /dynamic_emergency_addresses/{id}`, but is
         * otherwise the same as [DynamicEmergencyAddressServiceAsync.delete].
         */
        fun delete(
            id: String
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyAddressDeleteResponse>> =
            delete(id, DynamicEmergencyAddressDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: DynamicEmergencyAddressDeleteParams =
                DynamicEmergencyAddressDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyAddressDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: DynamicEmergencyAddressDeleteParams = DynamicEmergencyAddressDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyAddressDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: DynamicEmergencyAddressDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyAddressDeleteResponse>>

        /** @see delete */
        fun delete(
            params: DynamicEmergencyAddressDeleteParams
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyAddressDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyAddressDeleteResponse>> =
            delete(id, DynamicEmergencyAddressDeleteParams.none(), requestOptions)
    }
}
