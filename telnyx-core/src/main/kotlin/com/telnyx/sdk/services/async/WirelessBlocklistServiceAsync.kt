// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.wirelessblocklists.WirelessBlocklistCreateParams
import com.telnyx.sdk.models.wirelessblocklists.WirelessBlocklistCreateResponse
import com.telnyx.sdk.models.wirelessblocklists.WirelessBlocklistDeleteParams
import com.telnyx.sdk.models.wirelessblocklists.WirelessBlocklistDeleteResponse
import com.telnyx.sdk.models.wirelessblocklists.WirelessBlocklistListPageAsync
import com.telnyx.sdk.models.wirelessblocklists.WirelessBlocklistListParams
import com.telnyx.sdk.models.wirelessblocklists.WirelessBlocklistRetrieveParams
import com.telnyx.sdk.models.wirelessblocklists.WirelessBlocklistRetrieveResponse
import com.telnyx.sdk.models.wirelessblocklists.WirelessBlocklistUpdateParams
import com.telnyx.sdk.models.wirelessblocklists.WirelessBlocklistUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Wireless Blocklists operations */
interface WirelessBlocklistServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WirelessBlocklistServiceAsync

    /** Create a Wireless Blocklist to prevent SIMs from connecting to certain networks. */
    fun create(
        params: WirelessBlocklistCreateParams
    ): CompletableFuture<WirelessBlocklistCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WirelessBlocklistCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WirelessBlocklistCreateResponse>

    /** Retrieve information about a Wireless Blocklist. */
    fun retrieve(id: String): CompletableFuture<WirelessBlocklistRetrieveResponse> =
        retrieve(id, WirelessBlocklistRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: WirelessBlocklistRetrieveParams = WirelessBlocklistRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WirelessBlocklistRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: WirelessBlocklistRetrieveParams = WirelessBlocklistRetrieveParams.none(),
    ): CompletableFuture<WirelessBlocklistRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: WirelessBlocklistRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WirelessBlocklistRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: WirelessBlocklistRetrieveParams
    ): CompletableFuture<WirelessBlocklistRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WirelessBlocklistRetrieveResponse> =
        retrieve(id, WirelessBlocklistRetrieveParams.none(), requestOptions)

    /** Update a Wireless Blocklist. */
    fun update(): CompletableFuture<WirelessBlocklistUpdateResponse> =
        update(WirelessBlocklistUpdateParams.none())

    /** @see update */
    fun update(
        params: WirelessBlocklistUpdateParams = WirelessBlocklistUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WirelessBlocklistUpdateResponse>

    /** @see update */
    fun update(
        params: WirelessBlocklistUpdateParams = WirelessBlocklistUpdateParams.none()
    ): CompletableFuture<WirelessBlocklistUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(requestOptions: RequestOptions): CompletableFuture<WirelessBlocklistUpdateResponse> =
        update(WirelessBlocklistUpdateParams.none(), requestOptions)

    /** Get all Wireless Blocklists belonging to the user. */
    fun list(): CompletableFuture<WirelessBlocklistListPageAsync> =
        list(WirelessBlocklistListParams.none())

    /** @see list */
    fun list(
        params: WirelessBlocklistListParams = WirelessBlocklistListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WirelessBlocklistListPageAsync>

    /** @see list */
    fun list(
        params: WirelessBlocklistListParams = WirelessBlocklistListParams.none()
    ): CompletableFuture<WirelessBlocklistListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<WirelessBlocklistListPageAsync> =
        list(WirelessBlocklistListParams.none(), requestOptions)

    /** Deletes the Wireless Blocklist. */
    fun delete(id: String): CompletableFuture<WirelessBlocklistDeleteResponse> =
        delete(id, WirelessBlocklistDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: WirelessBlocklistDeleteParams = WirelessBlocklistDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WirelessBlocklistDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: WirelessBlocklistDeleteParams = WirelessBlocklistDeleteParams.none(),
    ): CompletableFuture<WirelessBlocklistDeleteResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: WirelessBlocklistDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WirelessBlocklistDeleteResponse>

    /** @see delete */
    fun delete(
        params: WirelessBlocklistDeleteParams
    ): CompletableFuture<WirelessBlocklistDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WirelessBlocklistDeleteResponse> =
        delete(id, WirelessBlocklistDeleteParams.none(), requestOptions)

    /**
     * A view of [WirelessBlocklistServiceAsync] that provides access to raw HTTP responses for each
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
        ): WirelessBlocklistServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /wireless_blocklists`, but is otherwise the same as
         * [WirelessBlocklistServiceAsync.create].
         */
        fun create(
            params: WirelessBlocklistCreateParams
        ): CompletableFuture<HttpResponseFor<WirelessBlocklistCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: WirelessBlocklistCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WirelessBlocklistCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /wireless_blocklists/{id}`, but is otherwise the
         * same as [WirelessBlocklistServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<WirelessBlocklistRetrieveResponse>> =
            retrieve(id, WirelessBlocklistRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: WirelessBlocklistRetrieveParams = WirelessBlocklistRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WirelessBlocklistRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: WirelessBlocklistRetrieveParams = WirelessBlocklistRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<WirelessBlocklistRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: WirelessBlocklistRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WirelessBlocklistRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: WirelessBlocklistRetrieveParams
        ): CompletableFuture<HttpResponseFor<WirelessBlocklistRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WirelessBlocklistRetrieveResponse>> =
            retrieve(id, WirelessBlocklistRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /wireless_blocklists`, but is otherwise the same
         * as [WirelessBlocklistServiceAsync.update].
         */
        fun update(): CompletableFuture<HttpResponseFor<WirelessBlocklistUpdateResponse>> =
            update(WirelessBlocklistUpdateParams.none())

        /** @see update */
        fun update(
            params: WirelessBlocklistUpdateParams = WirelessBlocklistUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WirelessBlocklistUpdateResponse>>

        /** @see update */
        fun update(
            params: WirelessBlocklistUpdateParams = WirelessBlocklistUpdateParams.none()
        ): CompletableFuture<HttpResponseFor<WirelessBlocklistUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<WirelessBlocklistUpdateResponse>> =
            update(WirelessBlocklistUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /wireless_blocklists`, but is otherwise the same as
         * [WirelessBlocklistServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<WirelessBlocklistListPageAsync>> =
            list(WirelessBlocklistListParams.none())

        /** @see list */
        fun list(
            params: WirelessBlocklistListParams = WirelessBlocklistListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WirelessBlocklistListPageAsync>>

        /** @see list */
        fun list(
            params: WirelessBlocklistListParams = WirelessBlocklistListParams.none()
        ): CompletableFuture<HttpResponseFor<WirelessBlocklistListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<WirelessBlocklistListPageAsync>> =
            list(WirelessBlocklistListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /wireless_blocklists/{id}`, but is otherwise the
         * same as [WirelessBlocklistServiceAsync.delete].
         */
        fun delete(
            id: String
        ): CompletableFuture<HttpResponseFor<WirelessBlocklistDeleteResponse>> =
            delete(id, WirelessBlocklistDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: WirelessBlocklistDeleteParams = WirelessBlocklistDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WirelessBlocklistDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: WirelessBlocklistDeleteParams = WirelessBlocklistDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<WirelessBlocklistDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: WirelessBlocklistDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WirelessBlocklistDeleteResponse>>

        /** @see delete */
        fun delete(
            params: WirelessBlocklistDeleteParams
        ): CompletableFuture<HttpResponseFor<WirelessBlocklistDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WirelessBlocklistDeleteResponse>> =
            delete(id, WirelessBlocklistDeleteParams.none(), requestOptions)
    }
}
