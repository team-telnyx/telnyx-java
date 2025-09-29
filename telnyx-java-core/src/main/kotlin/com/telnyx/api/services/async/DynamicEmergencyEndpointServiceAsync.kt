// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.dynamicemergencyendpoints.DynamicEmergencyEndpoint
import com.telnyx.api.models.dynamicemergencyendpoints.DynamicEmergencyEndpointCreateParams
import com.telnyx.api.models.dynamicemergencyendpoints.DynamicEmergencyEndpointCreateResponse
import com.telnyx.api.models.dynamicemergencyendpoints.DynamicEmergencyEndpointDeleteParams
import com.telnyx.api.models.dynamicemergencyendpoints.DynamicEmergencyEndpointDeleteResponse
import com.telnyx.api.models.dynamicemergencyendpoints.DynamicEmergencyEndpointListParams
import com.telnyx.api.models.dynamicemergencyendpoints.DynamicEmergencyEndpointListResponse
import com.telnyx.api.models.dynamicemergencyendpoints.DynamicEmergencyEndpointRetrieveParams
import com.telnyx.api.models.dynamicemergencyendpoints.DynamicEmergencyEndpointRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DynamicEmergencyEndpointServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DynamicEmergencyEndpointServiceAsync

    /** Creates a dynamic emergency endpoints. */
    fun create(
        params: DynamicEmergencyEndpointCreateParams
    ): CompletableFuture<DynamicEmergencyEndpointCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DynamicEmergencyEndpointCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DynamicEmergencyEndpointCreateResponse>

    /** @see create */
    fun create(
        dynamicEmergencyEndpoint: DynamicEmergencyEndpoint,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DynamicEmergencyEndpointCreateResponse> =
        create(
            DynamicEmergencyEndpointCreateParams.builder()
                .dynamicEmergencyEndpoint(dynamicEmergencyEndpoint)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        dynamicEmergencyEndpoint: DynamicEmergencyEndpoint
    ): CompletableFuture<DynamicEmergencyEndpointCreateResponse> =
        create(dynamicEmergencyEndpoint, RequestOptions.none())

    /** Returns the dynamic emergency endpoint based on the ID provided */
    fun retrieve(id: String): CompletableFuture<DynamicEmergencyEndpointRetrieveResponse> =
        retrieve(id, DynamicEmergencyEndpointRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DynamicEmergencyEndpointRetrieveParams =
            DynamicEmergencyEndpointRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DynamicEmergencyEndpointRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DynamicEmergencyEndpointRetrieveParams =
            DynamicEmergencyEndpointRetrieveParams.none(),
    ): CompletableFuture<DynamicEmergencyEndpointRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DynamicEmergencyEndpointRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DynamicEmergencyEndpointRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: DynamicEmergencyEndpointRetrieveParams
    ): CompletableFuture<DynamicEmergencyEndpointRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DynamicEmergencyEndpointRetrieveResponse> =
        retrieve(id, DynamicEmergencyEndpointRetrieveParams.none(), requestOptions)

    /** Returns the dynamic emergency endpoints according to filters */
    fun list(): CompletableFuture<DynamicEmergencyEndpointListResponse> =
        list(DynamicEmergencyEndpointListParams.none())

    /** @see list */
    fun list(
        params: DynamicEmergencyEndpointListParams = DynamicEmergencyEndpointListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DynamicEmergencyEndpointListResponse>

    /** @see list */
    fun list(
        params: DynamicEmergencyEndpointListParams = DynamicEmergencyEndpointListParams.none()
    ): CompletableFuture<DynamicEmergencyEndpointListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<DynamicEmergencyEndpointListResponse> =
        list(DynamicEmergencyEndpointListParams.none(), requestOptions)

    /** Deletes the dynamic emergency endpoint based on the ID provided */
    fun delete(id: String): CompletableFuture<DynamicEmergencyEndpointDeleteResponse> =
        delete(id, DynamicEmergencyEndpointDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: DynamicEmergencyEndpointDeleteParams = DynamicEmergencyEndpointDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DynamicEmergencyEndpointDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: DynamicEmergencyEndpointDeleteParams = DynamicEmergencyEndpointDeleteParams.none(),
    ): CompletableFuture<DynamicEmergencyEndpointDeleteResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DynamicEmergencyEndpointDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DynamicEmergencyEndpointDeleteResponse>

    /** @see delete */
    fun delete(
        params: DynamicEmergencyEndpointDeleteParams
    ): CompletableFuture<DynamicEmergencyEndpointDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DynamicEmergencyEndpointDeleteResponse> =
        delete(id, DynamicEmergencyEndpointDeleteParams.none(), requestOptions)

    /**
     * A view of [DynamicEmergencyEndpointServiceAsync] that provides access to raw HTTP responses
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
        ): DynamicEmergencyEndpointServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /dynamic_emergency_endpoints`, but is otherwise the
         * same as [DynamicEmergencyEndpointServiceAsync.create].
         */
        fun create(
            params: DynamicEmergencyEndpointCreateParams
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyEndpointCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DynamicEmergencyEndpointCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyEndpointCreateResponse>>

        /** @see create */
        fun create(
            dynamicEmergencyEndpoint: DynamicEmergencyEndpoint,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyEndpointCreateResponse>> =
            create(
                DynamicEmergencyEndpointCreateParams.builder()
                    .dynamicEmergencyEndpoint(dynamicEmergencyEndpoint)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            dynamicEmergencyEndpoint: DynamicEmergencyEndpoint
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyEndpointCreateResponse>> =
            create(dynamicEmergencyEndpoint, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /dynamic_emergency_endpoints/{id}`, but is otherwise
         * the same as [DynamicEmergencyEndpointServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyEndpointRetrieveResponse>> =
            retrieve(id, DynamicEmergencyEndpointRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: DynamicEmergencyEndpointRetrieveParams =
                DynamicEmergencyEndpointRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyEndpointRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: DynamicEmergencyEndpointRetrieveParams =
                DynamicEmergencyEndpointRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyEndpointRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: DynamicEmergencyEndpointRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyEndpointRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: DynamicEmergencyEndpointRetrieveParams
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyEndpointRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyEndpointRetrieveResponse>> =
            retrieve(id, DynamicEmergencyEndpointRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /dynamic_emergency_endpoints`, but is otherwise the
         * same as [DynamicEmergencyEndpointServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<DynamicEmergencyEndpointListResponse>> =
            list(DynamicEmergencyEndpointListParams.none())

        /** @see list */
        fun list(
            params: DynamicEmergencyEndpointListParams = DynamicEmergencyEndpointListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyEndpointListResponse>>

        /** @see list */
        fun list(
            params: DynamicEmergencyEndpointListParams = DynamicEmergencyEndpointListParams.none()
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyEndpointListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyEndpointListResponse>> =
            list(DynamicEmergencyEndpointListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /dynamic_emergency_endpoints/{id}`, but is
         * otherwise the same as [DynamicEmergencyEndpointServiceAsync.delete].
         */
        fun delete(
            id: String
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyEndpointDeleteResponse>> =
            delete(id, DynamicEmergencyEndpointDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: DynamicEmergencyEndpointDeleteParams =
                DynamicEmergencyEndpointDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyEndpointDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: DynamicEmergencyEndpointDeleteParams =
                DynamicEmergencyEndpointDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyEndpointDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: DynamicEmergencyEndpointDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyEndpointDeleteResponse>>

        /** @see delete */
        fun delete(
            params: DynamicEmergencyEndpointDeleteParams
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyEndpointDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyEndpointDeleteResponse>> =
            delete(id, DynamicEmergencyEndpointDeleteParams.none(), requestOptions)
    }
}
