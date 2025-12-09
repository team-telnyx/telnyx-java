// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.wireguardinterfaces.WireguardInterfaceCreateParams
import com.telnyx.sdk.models.wireguardinterfaces.WireguardInterfaceCreateResponse
import com.telnyx.sdk.models.wireguardinterfaces.WireguardInterfaceDeleteParams
import com.telnyx.sdk.models.wireguardinterfaces.WireguardInterfaceDeleteResponse
import com.telnyx.sdk.models.wireguardinterfaces.WireguardInterfaceListPage
import com.telnyx.sdk.models.wireguardinterfaces.WireguardInterfaceListParams
import com.telnyx.sdk.models.wireguardinterfaces.WireguardInterfaceRetrieveParams
import com.telnyx.sdk.models.wireguardinterfaces.WireguardInterfaceRetrieveResponse
import java.util.function.Consumer

interface WireguardInterfaceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WireguardInterfaceService

    /**
     * Create a new WireGuard Interface. Current limitation of 10 interfaces per user can be
     * created.
     */
    fun create(): WireguardInterfaceCreateResponse = create(WireguardInterfaceCreateParams.none())

    /** @see create */
    fun create(
        params: WireguardInterfaceCreateParams = WireguardInterfaceCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireguardInterfaceCreateResponse

    /** @see create */
    fun create(
        params: WireguardInterfaceCreateParams = WireguardInterfaceCreateParams.none()
    ): WireguardInterfaceCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): WireguardInterfaceCreateResponse =
        create(WireguardInterfaceCreateParams.none(), requestOptions)

    /** Retrieve a WireGuard Interfaces. */
    fun retrieve(id: String): WireguardInterfaceRetrieveResponse =
        retrieve(id, WireguardInterfaceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: WireguardInterfaceRetrieveParams = WireguardInterfaceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireguardInterfaceRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: WireguardInterfaceRetrieveParams = WireguardInterfaceRetrieveParams.none(),
    ): WireguardInterfaceRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: WireguardInterfaceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireguardInterfaceRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: WireguardInterfaceRetrieveParams): WireguardInterfaceRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): WireguardInterfaceRetrieveResponse =
        retrieve(id, WireguardInterfaceRetrieveParams.none(), requestOptions)

    /** List all WireGuard Interfaces. */
    fun list(): WireguardInterfaceListPage = list(WireguardInterfaceListParams.none())

    /** @see list */
    fun list(
        params: WireguardInterfaceListParams = WireguardInterfaceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireguardInterfaceListPage

    /** @see list */
    fun list(
        params: WireguardInterfaceListParams = WireguardInterfaceListParams.none()
    ): WireguardInterfaceListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): WireguardInterfaceListPage =
        list(WireguardInterfaceListParams.none(), requestOptions)

    /** Delete a WireGuard Interface. */
    fun delete(id: String): WireguardInterfaceDeleteResponse =
        delete(id, WireguardInterfaceDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: WireguardInterfaceDeleteParams = WireguardInterfaceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireguardInterfaceDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: WireguardInterfaceDeleteParams = WireguardInterfaceDeleteParams.none(),
    ): WireguardInterfaceDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: WireguardInterfaceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireguardInterfaceDeleteResponse

    /** @see delete */
    fun delete(params: WireguardInterfaceDeleteParams): WireguardInterfaceDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): WireguardInterfaceDeleteResponse =
        delete(id, WireguardInterfaceDeleteParams.none(), requestOptions)

    /**
     * A view of [WireguardInterfaceService] that provides access to raw HTTP responses for each
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
        ): WireguardInterfaceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /wireguard_interfaces`, but is otherwise the same
         * as [WireguardInterfaceService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<WireguardInterfaceCreateResponse> =
            create(WireguardInterfaceCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: WireguardInterfaceCreateParams = WireguardInterfaceCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireguardInterfaceCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: WireguardInterfaceCreateParams = WireguardInterfaceCreateParams.none()
        ): HttpResponseFor<WireguardInterfaceCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): HttpResponseFor<WireguardInterfaceCreateResponse> =
            create(WireguardInterfaceCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /wireguard_interfaces/{id}`, but is otherwise the
         * same as [WireguardInterfaceService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<WireguardInterfaceRetrieveResponse> =
            retrieve(id, WireguardInterfaceRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: WireguardInterfaceRetrieveParams = WireguardInterfaceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireguardInterfaceRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: WireguardInterfaceRetrieveParams = WireguardInterfaceRetrieveParams.none(),
        ): HttpResponseFor<WireguardInterfaceRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: WireguardInterfaceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireguardInterfaceRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: WireguardInterfaceRetrieveParams
        ): HttpResponseFor<WireguardInterfaceRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WireguardInterfaceRetrieveResponse> =
            retrieve(id, WireguardInterfaceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /wireguard_interfaces`, but is otherwise the same as
         * [WireguardInterfaceService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<WireguardInterfaceListPage> =
            list(WireguardInterfaceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: WireguardInterfaceListParams = WireguardInterfaceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireguardInterfaceListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: WireguardInterfaceListParams = WireguardInterfaceListParams.none()
        ): HttpResponseFor<WireguardInterfaceListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<WireguardInterfaceListPage> =
            list(WireguardInterfaceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /wireguard_interfaces/{id}`, but is otherwise the
         * same as [WireguardInterfaceService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<WireguardInterfaceDeleteResponse> =
            delete(id, WireguardInterfaceDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: WireguardInterfaceDeleteParams = WireguardInterfaceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireguardInterfaceDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: WireguardInterfaceDeleteParams = WireguardInterfaceDeleteParams.none(),
        ): HttpResponseFor<WireguardInterfaceDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: WireguardInterfaceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireguardInterfaceDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: WireguardInterfaceDeleteParams
        ): HttpResponseFor<WireguardInterfaceDeleteResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WireguardInterfaceDeleteResponse> =
            delete(id, WireguardInterfaceDeleteParams.none(), requestOptions)
    }
}
