// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.fqdnconnections

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.fqdnconnections.fqdnauthentication.FqdnAuthenticationListParams
import com.telnyx.sdk.models.fqdnconnections.fqdnauthentication.FqdnAuthenticationListResponse
import com.telnyx.sdk.models.fqdnconnections.fqdnauthentication.FqdnAuthenticationPatchAllParams
import com.telnyx.sdk.models.fqdnconnections.fqdnauthentication.FqdnAuthenticationPatchAllResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** FQDN connection operations */
interface FqdnAuthenticationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FqdnAuthenticationServiceAsync

    /**
     * Retrieves the details of an existing FQDN authentication strategy for a specific FQDN
     * connection.
     */
    fun list(fqdnConnectionId: String): CompletableFuture<FqdnAuthenticationListResponse> =
        list(fqdnConnectionId, FqdnAuthenticationListParams.none())

    /** @see list */
    fun list(
        fqdnConnectionId: String,
        params: FqdnAuthenticationListParams = FqdnAuthenticationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FqdnAuthenticationListResponse> =
        list(params.toBuilder().fqdnConnectionId(fqdnConnectionId).build(), requestOptions)

    /** @see list */
    fun list(
        fqdnConnectionId: String,
        params: FqdnAuthenticationListParams = FqdnAuthenticationListParams.none(),
    ): CompletableFuture<FqdnAuthenticationListResponse> =
        list(fqdnConnectionId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: FqdnAuthenticationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FqdnAuthenticationListResponse>

    /** @see list */
    fun list(
        params: FqdnAuthenticationListParams
    ): CompletableFuture<FqdnAuthenticationListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        fqdnConnectionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FqdnAuthenticationListResponse> =
        list(fqdnConnectionId, FqdnAuthenticationListParams.none(), requestOptions)

    /** Updates the FQDN authentication strategy for a specific FQDN connection. */
    fun patchAll(fqdnConnectionId: String): CompletableFuture<FqdnAuthenticationPatchAllResponse> =
        patchAll(fqdnConnectionId, FqdnAuthenticationPatchAllParams.none())

    /** @see patchAll */
    fun patchAll(
        fqdnConnectionId: String,
        params: FqdnAuthenticationPatchAllParams = FqdnAuthenticationPatchAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FqdnAuthenticationPatchAllResponse> =
        patchAll(params.toBuilder().fqdnConnectionId(fqdnConnectionId).build(), requestOptions)

    /** @see patchAll */
    fun patchAll(
        fqdnConnectionId: String,
        params: FqdnAuthenticationPatchAllParams = FqdnAuthenticationPatchAllParams.none(),
    ): CompletableFuture<FqdnAuthenticationPatchAllResponse> =
        patchAll(fqdnConnectionId, params, RequestOptions.none())

    /** @see patchAll */
    fun patchAll(
        params: FqdnAuthenticationPatchAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FqdnAuthenticationPatchAllResponse>

    /** @see patchAll */
    fun patchAll(
        params: FqdnAuthenticationPatchAllParams
    ): CompletableFuture<FqdnAuthenticationPatchAllResponse> =
        patchAll(params, RequestOptions.none())

    /** @see patchAll */
    fun patchAll(
        fqdnConnectionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FqdnAuthenticationPatchAllResponse> =
        patchAll(fqdnConnectionId, FqdnAuthenticationPatchAllParams.none(), requestOptions)

    /**
     * A view of [FqdnAuthenticationServiceAsync] that provides access to raw HTTP responses for
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
        ): FqdnAuthenticationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /fqdn_connections/{fqdn_connection_id}/fqdn_authentication`, but is otherwise the same as
         * [FqdnAuthenticationServiceAsync.list].
         */
        fun list(
            fqdnConnectionId: String
        ): CompletableFuture<HttpResponseFor<FqdnAuthenticationListResponse>> =
            list(fqdnConnectionId, FqdnAuthenticationListParams.none())

        /** @see list */
        fun list(
            fqdnConnectionId: String,
            params: FqdnAuthenticationListParams = FqdnAuthenticationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FqdnAuthenticationListResponse>> =
            list(params.toBuilder().fqdnConnectionId(fqdnConnectionId).build(), requestOptions)

        /** @see list */
        fun list(
            fqdnConnectionId: String,
            params: FqdnAuthenticationListParams = FqdnAuthenticationListParams.none(),
        ): CompletableFuture<HttpResponseFor<FqdnAuthenticationListResponse>> =
            list(fqdnConnectionId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: FqdnAuthenticationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FqdnAuthenticationListResponse>>

        /** @see list */
        fun list(
            params: FqdnAuthenticationListParams
        ): CompletableFuture<HttpResponseFor<FqdnAuthenticationListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            fqdnConnectionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FqdnAuthenticationListResponse>> =
            list(fqdnConnectionId, FqdnAuthenticationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /fqdn_connections/{fqdn_connection_id}/fqdn_authentication`, but is otherwise the same as
         * [FqdnAuthenticationServiceAsync.patchAll].
         */
        fun patchAll(
            fqdnConnectionId: String
        ): CompletableFuture<HttpResponseFor<FqdnAuthenticationPatchAllResponse>> =
            patchAll(fqdnConnectionId, FqdnAuthenticationPatchAllParams.none())

        /** @see patchAll */
        fun patchAll(
            fqdnConnectionId: String,
            params: FqdnAuthenticationPatchAllParams = FqdnAuthenticationPatchAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FqdnAuthenticationPatchAllResponse>> =
            patchAll(params.toBuilder().fqdnConnectionId(fqdnConnectionId).build(), requestOptions)

        /** @see patchAll */
        fun patchAll(
            fqdnConnectionId: String,
            params: FqdnAuthenticationPatchAllParams = FqdnAuthenticationPatchAllParams.none(),
        ): CompletableFuture<HttpResponseFor<FqdnAuthenticationPatchAllResponse>> =
            patchAll(fqdnConnectionId, params, RequestOptions.none())

        /** @see patchAll */
        fun patchAll(
            params: FqdnAuthenticationPatchAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FqdnAuthenticationPatchAllResponse>>

        /** @see patchAll */
        fun patchAll(
            params: FqdnAuthenticationPatchAllParams
        ): CompletableFuture<HttpResponseFor<FqdnAuthenticationPatchAllResponse>> =
            patchAll(params, RequestOptions.none())

        /** @see patchAll */
        fun patchAll(
            fqdnConnectionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FqdnAuthenticationPatchAllResponse>> =
            patchAll(fqdnConnectionId, FqdnAuthenticationPatchAllParams.none(), requestOptions)
    }
}
