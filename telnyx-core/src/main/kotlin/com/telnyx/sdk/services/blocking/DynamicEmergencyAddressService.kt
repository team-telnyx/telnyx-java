// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.dynamicemergencyaddresses.DynamicEmergencyAddress
import com.telnyx.sdk.models.dynamicemergencyaddresses.DynamicEmergencyAddressCreateParams
import com.telnyx.sdk.models.dynamicemergencyaddresses.DynamicEmergencyAddressCreateResponse
import com.telnyx.sdk.models.dynamicemergencyaddresses.DynamicEmergencyAddressDeleteParams
import com.telnyx.sdk.models.dynamicemergencyaddresses.DynamicEmergencyAddressDeleteResponse
import com.telnyx.sdk.models.dynamicemergencyaddresses.DynamicEmergencyAddressListPage
import com.telnyx.sdk.models.dynamicemergencyaddresses.DynamicEmergencyAddressListParams
import com.telnyx.sdk.models.dynamicemergencyaddresses.DynamicEmergencyAddressRetrieveParams
import com.telnyx.sdk.models.dynamicemergencyaddresses.DynamicEmergencyAddressRetrieveResponse
import java.util.function.Consumer

interface DynamicEmergencyAddressService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DynamicEmergencyAddressService

    /** Creates a dynamic emergency address. */
    fun create(params: DynamicEmergencyAddressCreateParams): DynamicEmergencyAddressCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DynamicEmergencyAddressCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DynamicEmergencyAddressCreateResponse

    /** @see create */
    fun create(
        dynamicEmergencyAddress: DynamicEmergencyAddress,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DynamicEmergencyAddressCreateResponse =
        create(
            DynamicEmergencyAddressCreateParams.builder()
                .dynamicEmergencyAddress(dynamicEmergencyAddress)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        dynamicEmergencyAddress: DynamicEmergencyAddress
    ): DynamicEmergencyAddressCreateResponse =
        create(dynamicEmergencyAddress, RequestOptions.none())

    /** Returns the dynamic emergency address based on the ID provided */
    fun retrieve(id: String): DynamicEmergencyAddressRetrieveResponse =
        retrieve(id, DynamicEmergencyAddressRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DynamicEmergencyAddressRetrieveParams =
            DynamicEmergencyAddressRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DynamicEmergencyAddressRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DynamicEmergencyAddressRetrieveParams = DynamicEmergencyAddressRetrieveParams.none(),
    ): DynamicEmergencyAddressRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DynamicEmergencyAddressRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DynamicEmergencyAddressRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: DynamicEmergencyAddressRetrieveParams
    ): DynamicEmergencyAddressRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): DynamicEmergencyAddressRetrieveResponse =
        retrieve(id, DynamicEmergencyAddressRetrieveParams.none(), requestOptions)

    /** Returns the dynamic emergency addresses according to filters */
    fun list(): DynamicEmergencyAddressListPage = list(DynamicEmergencyAddressListParams.none())

    /** @see list */
    fun list(
        params: DynamicEmergencyAddressListParams = DynamicEmergencyAddressListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DynamicEmergencyAddressListPage

    /** @see list */
    fun list(
        params: DynamicEmergencyAddressListParams = DynamicEmergencyAddressListParams.none()
    ): DynamicEmergencyAddressListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): DynamicEmergencyAddressListPage =
        list(DynamicEmergencyAddressListParams.none(), requestOptions)

    /** Deletes the dynamic emergency address based on the ID provided */
    fun delete(id: String): DynamicEmergencyAddressDeleteResponse =
        delete(id, DynamicEmergencyAddressDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: DynamicEmergencyAddressDeleteParams = DynamicEmergencyAddressDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DynamicEmergencyAddressDeleteResponse =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: DynamicEmergencyAddressDeleteParams = DynamicEmergencyAddressDeleteParams.none(),
    ): DynamicEmergencyAddressDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DynamicEmergencyAddressDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DynamicEmergencyAddressDeleteResponse

    /** @see delete */
    fun delete(params: DynamicEmergencyAddressDeleteParams): DynamicEmergencyAddressDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): DynamicEmergencyAddressDeleteResponse =
        delete(id, DynamicEmergencyAddressDeleteParams.none(), requestOptions)

    /**
     * A view of [DynamicEmergencyAddressService] that provides access to raw HTTP responses for
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
        ): DynamicEmergencyAddressService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /dynamic_emergency_addresses`, but is otherwise the
         * same as [DynamicEmergencyAddressService.create].
         */
        @MustBeClosed
        fun create(
            params: DynamicEmergencyAddressCreateParams
        ): HttpResponseFor<DynamicEmergencyAddressCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DynamicEmergencyAddressCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DynamicEmergencyAddressCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            dynamicEmergencyAddress: DynamicEmergencyAddress,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DynamicEmergencyAddressCreateResponse> =
            create(
                DynamicEmergencyAddressCreateParams.builder()
                    .dynamicEmergencyAddress(dynamicEmergencyAddress)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            dynamicEmergencyAddress: DynamicEmergencyAddress
        ): HttpResponseFor<DynamicEmergencyAddressCreateResponse> =
            create(dynamicEmergencyAddress, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /dynamic_emergency_addresses/{id}`, but is otherwise
         * the same as [DynamicEmergencyAddressService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<DynamicEmergencyAddressRetrieveResponse> =
            retrieve(id, DynamicEmergencyAddressRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DynamicEmergencyAddressRetrieveParams =
                DynamicEmergencyAddressRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DynamicEmergencyAddressRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DynamicEmergencyAddressRetrieveParams =
                DynamicEmergencyAddressRetrieveParams.none(),
        ): HttpResponseFor<DynamicEmergencyAddressRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DynamicEmergencyAddressRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DynamicEmergencyAddressRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DynamicEmergencyAddressRetrieveParams
        ): HttpResponseFor<DynamicEmergencyAddressRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DynamicEmergencyAddressRetrieveResponse> =
            retrieve(id, DynamicEmergencyAddressRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /dynamic_emergency_addresses`, but is otherwise the
         * same as [DynamicEmergencyAddressService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<DynamicEmergencyAddressListPage> =
            list(DynamicEmergencyAddressListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DynamicEmergencyAddressListParams = DynamicEmergencyAddressListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DynamicEmergencyAddressListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: DynamicEmergencyAddressListParams = DynamicEmergencyAddressListParams.none()
        ): HttpResponseFor<DynamicEmergencyAddressListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DynamicEmergencyAddressListPage> =
            list(DynamicEmergencyAddressListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /dynamic_emergency_addresses/{id}`, but is
         * otherwise the same as [DynamicEmergencyAddressService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<DynamicEmergencyAddressDeleteResponse> =
            delete(id, DynamicEmergencyAddressDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: DynamicEmergencyAddressDeleteParams =
                DynamicEmergencyAddressDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DynamicEmergencyAddressDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: DynamicEmergencyAddressDeleteParams = DynamicEmergencyAddressDeleteParams.none(),
        ): HttpResponseFor<DynamicEmergencyAddressDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DynamicEmergencyAddressDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DynamicEmergencyAddressDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DynamicEmergencyAddressDeleteParams
        ): HttpResponseFor<DynamicEmergencyAddressDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DynamicEmergencyAddressDeleteResponse> =
            delete(id, DynamicEmergencyAddressDeleteParams.none(), requestOptions)
    }
}
