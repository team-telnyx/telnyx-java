// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.wirelessblocklists.WirelessBlocklistCreateParams
import com.telnyx.sdk.models.wirelessblocklists.WirelessBlocklistCreateResponse
import com.telnyx.sdk.models.wirelessblocklists.WirelessBlocklistDeleteParams
import com.telnyx.sdk.models.wirelessblocklists.WirelessBlocklistDeleteResponse
import com.telnyx.sdk.models.wirelessblocklists.WirelessBlocklistListPage
import com.telnyx.sdk.models.wirelessblocklists.WirelessBlocklistListParams
import com.telnyx.sdk.models.wirelessblocklists.WirelessBlocklistRetrieveParams
import com.telnyx.sdk.models.wirelessblocklists.WirelessBlocklistRetrieveResponse
import com.telnyx.sdk.models.wirelessblocklists.WirelessBlocklistUpdateParams
import com.telnyx.sdk.models.wirelessblocklists.WirelessBlocklistUpdateResponse
import java.util.function.Consumer

/** Wireless Blocklists operations */
interface WirelessBlocklistService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WirelessBlocklistService

    /** Create a Wireless Blocklist to prevent SIMs from connecting to certain networks. */
    fun create(params: WirelessBlocklistCreateParams): WirelessBlocklistCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WirelessBlocklistCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WirelessBlocklistCreateResponse

    /** Retrieve information about a Wireless Blocklist. */
    fun retrieve(id: String): WirelessBlocklistRetrieveResponse =
        retrieve(id, WirelessBlocklistRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: WirelessBlocklistRetrieveParams = WirelessBlocklistRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WirelessBlocklistRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: WirelessBlocklistRetrieveParams = WirelessBlocklistRetrieveParams.none(),
    ): WirelessBlocklistRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: WirelessBlocklistRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WirelessBlocklistRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: WirelessBlocklistRetrieveParams): WirelessBlocklistRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): WirelessBlocklistRetrieveResponse =
        retrieve(id, WirelessBlocklistRetrieveParams.none(), requestOptions)

    /** Update a Wireless Blocklist. */
    fun update(): WirelessBlocklistUpdateResponse = update(WirelessBlocklistUpdateParams.none())

    /** @see update */
    fun update(
        params: WirelessBlocklistUpdateParams = WirelessBlocklistUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WirelessBlocklistUpdateResponse

    /** @see update */
    fun update(
        params: WirelessBlocklistUpdateParams = WirelessBlocklistUpdateParams.none()
    ): WirelessBlocklistUpdateResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(requestOptions: RequestOptions): WirelessBlocklistUpdateResponse =
        update(WirelessBlocklistUpdateParams.none(), requestOptions)

    /** Get all Wireless Blocklists belonging to the user. */
    fun list(): WirelessBlocklistListPage = list(WirelessBlocklistListParams.none())

    /** @see list */
    fun list(
        params: WirelessBlocklistListParams = WirelessBlocklistListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WirelessBlocklistListPage

    /** @see list */
    fun list(
        params: WirelessBlocklistListParams = WirelessBlocklistListParams.none()
    ): WirelessBlocklistListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): WirelessBlocklistListPage =
        list(WirelessBlocklistListParams.none(), requestOptions)

    /** Deletes the Wireless Blocklist. */
    fun delete(id: String): WirelessBlocklistDeleteResponse =
        delete(id, WirelessBlocklistDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: WirelessBlocklistDeleteParams = WirelessBlocklistDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WirelessBlocklistDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: WirelessBlocklistDeleteParams = WirelessBlocklistDeleteParams.none(),
    ): WirelessBlocklistDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: WirelessBlocklistDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WirelessBlocklistDeleteResponse

    /** @see delete */
    fun delete(params: WirelessBlocklistDeleteParams): WirelessBlocklistDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): WirelessBlocklistDeleteResponse =
        delete(id, WirelessBlocklistDeleteParams.none(), requestOptions)

    /**
     * A view of [WirelessBlocklistService] that provides access to raw HTTP responses for each
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
        ): WirelessBlocklistService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /wireless_blocklists`, but is otherwise the same as
         * [WirelessBlocklistService.create].
         */
        @MustBeClosed
        fun create(
            params: WirelessBlocklistCreateParams
        ): HttpResponseFor<WirelessBlocklistCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: WirelessBlocklistCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WirelessBlocklistCreateResponse>

        /**
         * Returns a raw HTTP response for `get /wireless_blocklists/{id}`, but is otherwise the
         * same as [WirelessBlocklistService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<WirelessBlocklistRetrieveResponse> =
            retrieve(id, WirelessBlocklistRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: WirelessBlocklistRetrieveParams = WirelessBlocklistRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WirelessBlocklistRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: WirelessBlocklistRetrieveParams = WirelessBlocklistRetrieveParams.none(),
        ): HttpResponseFor<WirelessBlocklistRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: WirelessBlocklistRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WirelessBlocklistRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: WirelessBlocklistRetrieveParams
        ): HttpResponseFor<WirelessBlocklistRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WirelessBlocklistRetrieveResponse> =
            retrieve(id, WirelessBlocklistRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /wireless_blocklists`, but is otherwise the same
         * as [WirelessBlocklistService.update].
         */
        @MustBeClosed
        fun update(): HttpResponseFor<WirelessBlocklistUpdateResponse> =
            update(WirelessBlocklistUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: WirelessBlocklistUpdateParams = WirelessBlocklistUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WirelessBlocklistUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            params: WirelessBlocklistUpdateParams = WirelessBlocklistUpdateParams.none()
        ): HttpResponseFor<WirelessBlocklistUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            requestOptions: RequestOptions
        ): HttpResponseFor<WirelessBlocklistUpdateResponse> =
            update(WirelessBlocklistUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /wireless_blocklists`, but is otherwise the same as
         * [WirelessBlocklistService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<WirelessBlocklistListPage> =
            list(WirelessBlocklistListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: WirelessBlocklistListParams = WirelessBlocklistListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WirelessBlocklistListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: WirelessBlocklistListParams = WirelessBlocklistListParams.none()
        ): HttpResponseFor<WirelessBlocklistListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<WirelessBlocklistListPage> =
            list(WirelessBlocklistListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /wireless_blocklists/{id}`, but is otherwise the
         * same as [WirelessBlocklistService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<WirelessBlocklistDeleteResponse> =
            delete(id, WirelessBlocklistDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: WirelessBlocklistDeleteParams = WirelessBlocklistDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WirelessBlocklistDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: WirelessBlocklistDeleteParams = WirelessBlocklistDeleteParams.none(),
        ): HttpResponseFor<WirelessBlocklistDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: WirelessBlocklistDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WirelessBlocklistDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: WirelessBlocklistDeleteParams
        ): HttpResponseFor<WirelessBlocklistDeleteResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WirelessBlocklistDeleteResponse> =
            delete(id, WirelessBlocklistDeleteParams.none(), requestOptions)
    }
}
