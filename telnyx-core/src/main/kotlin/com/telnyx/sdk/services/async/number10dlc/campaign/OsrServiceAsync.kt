// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.number10dlc.campaign

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.number10dlc.campaign.osr.OsrRetrieveAttributesParams
import com.telnyx.sdk.models.number10dlc.campaign.osr.OsrRetrieveAttributesResponse
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
    fun retrieveAttributes(campaignId: String): CompletableFuture<OsrRetrieveAttributesResponse> =
        retrieveAttributes(campaignId, OsrRetrieveAttributesParams.none())

    /** @see retrieveAttributes */
    fun retrieveAttributes(
        campaignId: String,
        params: OsrRetrieveAttributesParams = OsrRetrieveAttributesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OsrRetrieveAttributesResponse> =
        retrieveAttributes(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see retrieveAttributes */
    fun retrieveAttributes(
        campaignId: String,
        params: OsrRetrieveAttributesParams = OsrRetrieveAttributesParams.none(),
    ): CompletableFuture<OsrRetrieveAttributesResponse> =
        retrieveAttributes(campaignId, params, RequestOptions.none())

    /** @see retrieveAttributes */
    fun retrieveAttributes(
        params: OsrRetrieveAttributesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OsrRetrieveAttributesResponse>

    /** @see retrieveAttributes */
    fun retrieveAttributes(
        params: OsrRetrieveAttributesParams
    ): CompletableFuture<OsrRetrieveAttributesResponse> =
        retrieveAttributes(params, RequestOptions.none())

    /** @see retrieveAttributes */
    fun retrieveAttributes(
        campaignId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<OsrRetrieveAttributesResponse> =
        retrieveAttributes(campaignId, OsrRetrieveAttributesParams.none(), requestOptions)

    /** A view of [OsrServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OsrServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /10dlc/campaign/{campaignId}/osr/attributes`, but is
         * otherwise the same as [OsrServiceAsync.retrieveAttributes].
         */
        fun retrieveAttributes(
            campaignId: String
        ): CompletableFuture<HttpResponseFor<OsrRetrieveAttributesResponse>> =
            retrieveAttributes(campaignId, OsrRetrieveAttributesParams.none())

        /** @see retrieveAttributes */
        fun retrieveAttributes(
            campaignId: String,
            params: OsrRetrieveAttributesParams = OsrRetrieveAttributesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OsrRetrieveAttributesResponse>> =
            retrieveAttributes(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see retrieveAttributes */
        fun retrieveAttributes(
            campaignId: String,
            params: OsrRetrieveAttributesParams = OsrRetrieveAttributesParams.none(),
        ): CompletableFuture<HttpResponseFor<OsrRetrieveAttributesResponse>> =
            retrieveAttributes(campaignId, params, RequestOptions.none())

        /** @see retrieveAttributes */
        fun retrieveAttributes(
            params: OsrRetrieveAttributesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OsrRetrieveAttributesResponse>>

        /** @see retrieveAttributes */
        fun retrieveAttributes(
            params: OsrRetrieveAttributesParams
        ): CompletableFuture<HttpResponseFor<OsrRetrieveAttributesResponse>> =
            retrieveAttributes(params, RequestOptions.none())

        /** @see retrieveAttributes */
        fun retrieveAttributes(
            campaignId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OsrRetrieveAttributesResponse>> =
            retrieveAttributes(campaignId, OsrRetrieveAttributesParams.none(), requestOptions)
    }
}
