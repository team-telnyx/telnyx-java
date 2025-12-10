// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.number10dlc.campaign

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.number10dlc.campaign.osr.OsrRetrieveAttributesParams
import com.telnyx.sdk.models.number10dlc.campaign.osr.OsrRetrieveAttributesResponse
import java.util.function.Consumer

interface OsrService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OsrService

    /** Get My Osr Campaign Attributes */
    fun retrieveAttributes(campaignId: String): OsrRetrieveAttributesResponse =
        retrieveAttributes(campaignId, OsrRetrieveAttributesParams.none())

    /** @see retrieveAttributes */
    fun retrieveAttributes(
        campaignId: String,
        params: OsrRetrieveAttributesParams = OsrRetrieveAttributesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OsrRetrieveAttributesResponse =
        retrieveAttributes(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see retrieveAttributes */
    fun retrieveAttributes(
        campaignId: String,
        params: OsrRetrieveAttributesParams = OsrRetrieveAttributesParams.none(),
    ): OsrRetrieveAttributesResponse = retrieveAttributes(campaignId, params, RequestOptions.none())

    /** @see retrieveAttributes */
    fun retrieveAttributes(
        params: OsrRetrieveAttributesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OsrRetrieveAttributesResponse

    /** @see retrieveAttributes */
    fun retrieveAttributes(params: OsrRetrieveAttributesParams): OsrRetrieveAttributesResponse =
        retrieveAttributes(params, RequestOptions.none())

    /** @see retrieveAttributes */
    fun retrieveAttributes(
        campaignId: String,
        requestOptions: RequestOptions,
    ): OsrRetrieveAttributesResponse =
        retrieveAttributes(campaignId, OsrRetrieveAttributesParams.none(), requestOptions)

    /** A view of [OsrService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OsrService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /10dlc/campaign/{campaignId}/osr/attributes`, but is
         * otherwise the same as [OsrService.retrieveAttributes].
         */
        @MustBeClosed
        fun retrieveAttributes(campaignId: String): HttpResponseFor<OsrRetrieveAttributesResponse> =
            retrieveAttributes(campaignId, OsrRetrieveAttributesParams.none())

        /** @see retrieveAttributes */
        @MustBeClosed
        fun retrieveAttributes(
            campaignId: String,
            params: OsrRetrieveAttributesParams = OsrRetrieveAttributesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OsrRetrieveAttributesResponse> =
            retrieveAttributes(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see retrieveAttributes */
        @MustBeClosed
        fun retrieveAttributes(
            campaignId: String,
            params: OsrRetrieveAttributesParams = OsrRetrieveAttributesParams.none(),
        ): HttpResponseFor<OsrRetrieveAttributesResponse> =
            retrieveAttributes(campaignId, params, RequestOptions.none())

        /** @see retrieveAttributes */
        @MustBeClosed
        fun retrieveAttributes(
            params: OsrRetrieveAttributesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OsrRetrieveAttributesResponse>

        /** @see retrieveAttributes */
        @MustBeClosed
        fun retrieveAttributes(
            params: OsrRetrieveAttributesParams
        ): HttpResponseFor<OsrRetrieveAttributesResponse> =
            retrieveAttributes(params, RequestOptions.none())

        /** @see retrieveAttributes */
        @MustBeClosed
        fun retrieveAttributes(
            campaignId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OsrRetrieveAttributesResponse> =
            retrieveAttributes(campaignId, OsrRetrieveAttributesParams.none(), requestOptions)
    }
}
