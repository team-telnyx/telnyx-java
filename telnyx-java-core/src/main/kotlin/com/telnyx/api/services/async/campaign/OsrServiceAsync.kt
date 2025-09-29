// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.campaign

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.campaign.osr.OsrGetAttributesParams
import com.telnyx.api.models.campaign.osr.OsrGetAttributesResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OsrServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OsrServiceAsync

    /** Get My Osr Campaign Attributes */
    fun getAttributes(campaignId: String): CompletableFuture<OsrGetAttributesResponse> =
        getAttributes(campaignId, OsrGetAttributesParams.none())

    /** @see getAttributes */
    fun getAttributes(
        campaignId: String,
        params: OsrGetAttributesParams = OsrGetAttributesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OsrGetAttributesResponse> =
        getAttributes(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see getAttributes */
    fun getAttributes(
        campaignId: String,
        params: OsrGetAttributesParams = OsrGetAttributesParams.none(),
    ): CompletableFuture<OsrGetAttributesResponse> =
        getAttributes(campaignId, params, RequestOptions.none())

    /** @see getAttributes */
    fun getAttributes(
        params: OsrGetAttributesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OsrGetAttributesResponse>

    /** @see getAttributes */
    fun getAttributes(params: OsrGetAttributesParams): CompletableFuture<OsrGetAttributesResponse> =
        getAttributes(params, RequestOptions.none())

    /** @see getAttributes */
    fun getAttributes(
        campaignId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<OsrGetAttributesResponse> =
        getAttributes(campaignId, OsrGetAttributesParams.none(), requestOptions)

    /** A view of [OsrServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OsrServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /campaign/{campaignId}/osr/attributes`, but is
         * otherwise the same as [OsrServiceAsync.getAttributes].
         */
        fun getAttributes(
            campaignId: String
        ): CompletableFuture<HttpResponseFor<OsrGetAttributesResponse>> =
            getAttributes(campaignId, OsrGetAttributesParams.none())

        /** @see getAttributes */
        fun getAttributes(
            campaignId: String,
            params: OsrGetAttributesParams = OsrGetAttributesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OsrGetAttributesResponse>> =
            getAttributes(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see getAttributes */
        fun getAttributes(
            campaignId: String,
            params: OsrGetAttributesParams = OsrGetAttributesParams.none(),
        ): CompletableFuture<HttpResponseFor<OsrGetAttributesResponse>> =
            getAttributes(campaignId, params, RequestOptions.none())

        /** @see getAttributes */
        fun getAttributes(
            params: OsrGetAttributesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OsrGetAttributesResponse>>

        /** @see getAttributes */
        fun getAttributes(
            params: OsrGetAttributesParams
        ): CompletableFuture<HttpResponseFor<OsrGetAttributesResponse>> =
            getAttributes(params, RequestOptions.none())

        /** @see getAttributes */
        fun getAttributes(
            campaignId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OsrGetAttributesResponse>> =
            getAttributes(campaignId, OsrGetAttributesParams.none(), requestOptions)
    }
}
