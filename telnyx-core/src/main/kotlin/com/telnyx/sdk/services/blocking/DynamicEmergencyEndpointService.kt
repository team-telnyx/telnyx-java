// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.dynamicemergencyendpoints.DynamicEmergencyEndpoint
import com.telnyx.sdk.models.dynamicemergencyendpoints.DynamicEmergencyEndpointCreateParams
import com.telnyx.sdk.models.dynamicemergencyendpoints.DynamicEmergencyEndpointCreateResponse
import com.telnyx.sdk.models.dynamicemergencyendpoints.DynamicEmergencyEndpointDeleteParams
import com.telnyx.sdk.models.dynamicemergencyendpoints.DynamicEmergencyEndpointDeleteResponse
import com.telnyx.sdk.models.dynamicemergencyendpoints.DynamicEmergencyEndpointListPage
import com.telnyx.sdk.models.dynamicemergencyendpoints.DynamicEmergencyEndpointListParams
import com.telnyx.sdk.models.dynamicemergencyendpoints.DynamicEmergencyEndpointRetrieveParams
import com.telnyx.sdk.models.dynamicemergencyendpoints.DynamicEmergencyEndpointRetrieveResponse
import java.util.function.Consumer

/** Dynamic Emergency Endpoints */
interface DynamicEmergencyEndpointService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DynamicEmergencyEndpointService

    /** Creates a dynamic emergency endpoints. */
    fun create(
        params: DynamicEmergencyEndpointCreateParams
    ): DynamicEmergencyEndpointCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DynamicEmergencyEndpointCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DynamicEmergencyEndpointCreateResponse

    /** @see create */
    fun create(
        dynamicEmergencyEndpoint: DynamicEmergencyEndpoint,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DynamicEmergencyEndpointCreateResponse =
        create(
            DynamicEmergencyEndpointCreateParams.builder()
                .dynamicEmergencyEndpoint(dynamicEmergencyEndpoint)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        dynamicEmergencyEndpoint: DynamicEmergencyEndpoint
    ): DynamicEmergencyEndpointCreateResponse =
        create(dynamicEmergencyEndpoint, RequestOptions.none())

    /** Returns the dynamic emergency endpoint based on the ID provided */
    fun retrieve(id: String): DynamicEmergencyEndpointRetrieveResponse =
        retrieve(id, DynamicEmergencyEndpointRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DynamicEmergencyEndpointRetrieveParams =
            DynamicEmergencyEndpointRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DynamicEmergencyEndpointRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DynamicEmergencyEndpointRetrieveParams =
            DynamicEmergencyEndpointRetrieveParams.none(),
    ): DynamicEmergencyEndpointRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DynamicEmergencyEndpointRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DynamicEmergencyEndpointRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: DynamicEmergencyEndpointRetrieveParams
    ): DynamicEmergencyEndpointRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): DynamicEmergencyEndpointRetrieveResponse =
        retrieve(id, DynamicEmergencyEndpointRetrieveParams.none(), requestOptions)

    /** Returns the dynamic emergency endpoints according to filters */
    fun list(): DynamicEmergencyEndpointListPage = list(DynamicEmergencyEndpointListParams.none())

    /** @see list */
    fun list(
        params: DynamicEmergencyEndpointListParams = DynamicEmergencyEndpointListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DynamicEmergencyEndpointListPage

    /** @see list */
    fun list(
        params: DynamicEmergencyEndpointListParams = DynamicEmergencyEndpointListParams.none()
    ): DynamicEmergencyEndpointListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): DynamicEmergencyEndpointListPage =
        list(DynamicEmergencyEndpointListParams.none(), requestOptions)

    /** Deletes the dynamic emergency endpoint based on the ID provided */
    fun delete(id: String): DynamicEmergencyEndpointDeleteResponse =
        delete(id, DynamicEmergencyEndpointDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: DynamicEmergencyEndpointDeleteParams = DynamicEmergencyEndpointDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DynamicEmergencyEndpointDeleteResponse =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: DynamicEmergencyEndpointDeleteParams = DynamicEmergencyEndpointDeleteParams.none(),
    ): DynamicEmergencyEndpointDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DynamicEmergencyEndpointDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DynamicEmergencyEndpointDeleteResponse

    /** @see delete */
    fun delete(
        params: DynamicEmergencyEndpointDeleteParams
    ): DynamicEmergencyEndpointDeleteResponse = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): DynamicEmergencyEndpointDeleteResponse =
        delete(id, DynamicEmergencyEndpointDeleteParams.none(), requestOptions)

    /**
     * A view of [DynamicEmergencyEndpointService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DynamicEmergencyEndpointService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /dynamic_emergency_endpoints`, but is otherwise the
         * same as [DynamicEmergencyEndpointService.create].
         */
        @MustBeClosed
        fun create(
            params: DynamicEmergencyEndpointCreateParams
        ): HttpResponseFor<DynamicEmergencyEndpointCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DynamicEmergencyEndpointCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DynamicEmergencyEndpointCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            dynamicEmergencyEndpoint: DynamicEmergencyEndpoint,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DynamicEmergencyEndpointCreateResponse> =
            create(
                DynamicEmergencyEndpointCreateParams.builder()
                    .dynamicEmergencyEndpoint(dynamicEmergencyEndpoint)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            dynamicEmergencyEndpoint: DynamicEmergencyEndpoint
        ): HttpResponseFor<DynamicEmergencyEndpointCreateResponse> =
            create(dynamicEmergencyEndpoint, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /dynamic_emergency_endpoints/{id}`, but is otherwise
         * the same as [DynamicEmergencyEndpointService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<DynamicEmergencyEndpointRetrieveResponse> =
            retrieve(id, DynamicEmergencyEndpointRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DynamicEmergencyEndpointRetrieveParams =
                DynamicEmergencyEndpointRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DynamicEmergencyEndpointRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DynamicEmergencyEndpointRetrieveParams =
                DynamicEmergencyEndpointRetrieveParams.none(),
        ): HttpResponseFor<DynamicEmergencyEndpointRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DynamicEmergencyEndpointRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DynamicEmergencyEndpointRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DynamicEmergencyEndpointRetrieveParams
        ): HttpResponseFor<DynamicEmergencyEndpointRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DynamicEmergencyEndpointRetrieveResponse> =
            retrieve(id, DynamicEmergencyEndpointRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /dynamic_emergency_endpoints`, but is otherwise the
         * same as [DynamicEmergencyEndpointService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<DynamicEmergencyEndpointListPage> =
            list(DynamicEmergencyEndpointListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DynamicEmergencyEndpointListParams = DynamicEmergencyEndpointListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DynamicEmergencyEndpointListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: DynamicEmergencyEndpointListParams = DynamicEmergencyEndpointListParams.none()
        ): HttpResponseFor<DynamicEmergencyEndpointListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<DynamicEmergencyEndpointListPage> =
            list(DynamicEmergencyEndpointListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /dynamic_emergency_endpoints/{id}`, but is
         * otherwise the same as [DynamicEmergencyEndpointService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<DynamicEmergencyEndpointDeleteResponse> =
            delete(id, DynamicEmergencyEndpointDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: DynamicEmergencyEndpointDeleteParams =
                DynamicEmergencyEndpointDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DynamicEmergencyEndpointDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: DynamicEmergencyEndpointDeleteParams =
                DynamicEmergencyEndpointDeleteParams.none(),
        ): HttpResponseFor<DynamicEmergencyEndpointDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DynamicEmergencyEndpointDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DynamicEmergencyEndpointDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DynamicEmergencyEndpointDeleteParams
        ): HttpResponseFor<DynamicEmergencyEndpointDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DynamicEmergencyEndpointDeleteResponse> =
            delete(id, DynamicEmergencyEndpointDeleteParams.none(), requestOptions)
    }
}
