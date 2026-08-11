// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.fqdnconnections

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.fqdnconnections.fqdnauthentication.FqdnAuthenticationListParams
import com.telnyx.sdk.models.fqdnconnections.fqdnauthentication.FqdnAuthenticationListResponse
import com.telnyx.sdk.models.fqdnconnections.fqdnauthentication.FqdnAuthenticationPatchAllParams
import com.telnyx.sdk.models.fqdnconnections.fqdnauthentication.FqdnAuthenticationPatchAllResponse
import java.util.function.Consumer

/** FQDN connection operations */
interface FqdnAuthenticationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FqdnAuthenticationService

    /**
     * Retrieves the details of an existing FQDN authentication strategy for a specific FQDN
     * connection.
     */
    fun list(fqdnConnectionId: String): FqdnAuthenticationListResponse =
        list(fqdnConnectionId, FqdnAuthenticationListParams.none())

    /** @see list */
    fun list(
        fqdnConnectionId: String,
        params: FqdnAuthenticationListParams = FqdnAuthenticationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FqdnAuthenticationListResponse =
        list(params.toBuilder().fqdnConnectionId(fqdnConnectionId).build(), requestOptions)

    /** @see list */
    fun list(
        fqdnConnectionId: String,
        params: FqdnAuthenticationListParams = FqdnAuthenticationListParams.none(),
    ): FqdnAuthenticationListResponse = list(fqdnConnectionId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: FqdnAuthenticationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FqdnAuthenticationListResponse

    /** @see list */
    fun list(params: FqdnAuthenticationListParams): FqdnAuthenticationListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        fqdnConnectionId: String,
        requestOptions: RequestOptions,
    ): FqdnAuthenticationListResponse =
        list(fqdnConnectionId, FqdnAuthenticationListParams.none(), requestOptions)

    /** Updates the FQDN authentication strategy for a specific FQDN connection. */
    fun patchAll(fqdnConnectionId: String): FqdnAuthenticationPatchAllResponse =
        patchAll(fqdnConnectionId, FqdnAuthenticationPatchAllParams.none())

    /** @see patchAll */
    fun patchAll(
        fqdnConnectionId: String,
        params: FqdnAuthenticationPatchAllParams = FqdnAuthenticationPatchAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FqdnAuthenticationPatchAllResponse =
        patchAll(params.toBuilder().fqdnConnectionId(fqdnConnectionId).build(), requestOptions)

    /** @see patchAll */
    fun patchAll(
        fqdnConnectionId: String,
        params: FqdnAuthenticationPatchAllParams = FqdnAuthenticationPatchAllParams.none(),
    ): FqdnAuthenticationPatchAllResponse =
        patchAll(fqdnConnectionId, params, RequestOptions.none())

    /** @see patchAll */
    fun patchAll(
        params: FqdnAuthenticationPatchAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FqdnAuthenticationPatchAllResponse

    /** @see patchAll */
    fun patchAll(params: FqdnAuthenticationPatchAllParams): FqdnAuthenticationPatchAllResponse =
        patchAll(params, RequestOptions.none())

    /** @see patchAll */
    fun patchAll(
        fqdnConnectionId: String,
        requestOptions: RequestOptions,
    ): FqdnAuthenticationPatchAllResponse =
        patchAll(fqdnConnectionId, FqdnAuthenticationPatchAllParams.none(), requestOptions)

    /**
     * A view of [FqdnAuthenticationService] that provides access to raw HTTP responses for each
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
        ): FqdnAuthenticationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /fqdn_connections/{fqdn_connection_id}/fqdn_authentication`, but is otherwise the same as
         * [FqdnAuthenticationService.list].
         */
        @MustBeClosed
        fun list(fqdnConnectionId: String): HttpResponseFor<FqdnAuthenticationListResponse> =
            list(fqdnConnectionId, FqdnAuthenticationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            fqdnConnectionId: String,
            params: FqdnAuthenticationListParams = FqdnAuthenticationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FqdnAuthenticationListResponse> =
            list(params.toBuilder().fqdnConnectionId(fqdnConnectionId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            fqdnConnectionId: String,
            params: FqdnAuthenticationListParams = FqdnAuthenticationListParams.none(),
        ): HttpResponseFor<FqdnAuthenticationListResponse> =
            list(fqdnConnectionId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: FqdnAuthenticationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FqdnAuthenticationListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: FqdnAuthenticationListParams
        ): HttpResponseFor<FqdnAuthenticationListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            fqdnConnectionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FqdnAuthenticationListResponse> =
            list(fqdnConnectionId, FqdnAuthenticationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /fqdn_connections/{fqdn_connection_id}/fqdn_authentication`, but is otherwise the same as
         * [FqdnAuthenticationService.patchAll].
         */
        @MustBeClosed
        fun patchAll(
            fqdnConnectionId: String
        ): HttpResponseFor<FqdnAuthenticationPatchAllResponse> =
            patchAll(fqdnConnectionId, FqdnAuthenticationPatchAllParams.none())

        /** @see patchAll */
        @MustBeClosed
        fun patchAll(
            fqdnConnectionId: String,
            params: FqdnAuthenticationPatchAllParams = FqdnAuthenticationPatchAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FqdnAuthenticationPatchAllResponse> =
            patchAll(params.toBuilder().fqdnConnectionId(fqdnConnectionId).build(), requestOptions)

        /** @see patchAll */
        @MustBeClosed
        fun patchAll(
            fqdnConnectionId: String,
            params: FqdnAuthenticationPatchAllParams = FqdnAuthenticationPatchAllParams.none(),
        ): HttpResponseFor<FqdnAuthenticationPatchAllResponse> =
            patchAll(fqdnConnectionId, params, RequestOptions.none())

        /** @see patchAll */
        @MustBeClosed
        fun patchAll(
            params: FqdnAuthenticationPatchAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FqdnAuthenticationPatchAllResponse>

        /** @see patchAll */
        @MustBeClosed
        fun patchAll(
            params: FqdnAuthenticationPatchAllParams
        ): HttpResponseFor<FqdnAuthenticationPatchAllResponse> =
            patchAll(params, RequestOptions.none())

        /** @see patchAll */
        @MustBeClosed
        fun patchAll(
            fqdnConnectionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FqdnAuthenticationPatchAllResponse> =
            patchAll(fqdnConnectionId, FqdnAuthenticationPatchAllParams.none(), requestOptions)
    }
}
