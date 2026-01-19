// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messaging10dlc.campaign

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messaging10dlc.campaign.osr.OsrGetAttributesParams
import com.telnyx.sdk.models.messaging10dlc.campaign.osr.OsrGetAttributesResponse
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

    /** Get OSR campaign attributes */
    fun getAttributes(campaignId: String): OsrGetAttributesResponse =
        getAttributes(campaignId, OsrGetAttributesParams.none())

    /** @see getAttributes */
    fun getAttributes(
        campaignId: String,
        params: OsrGetAttributesParams = OsrGetAttributesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OsrGetAttributesResponse =
        getAttributes(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see getAttributes */
    fun getAttributes(
        campaignId: String,
        params: OsrGetAttributesParams = OsrGetAttributesParams.none(),
    ): OsrGetAttributesResponse = getAttributes(campaignId, params, RequestOptions.none())

    /** @see getAttributes */
    fun getAttributes(
        params: OsrGetAttributesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OsrGetAttributesResponse

    /** @see getAttributes */
    fun getAttributes(params: OsrGetAttributesParams): OsrGetAttributesResponse =
        getAttributes(params, RequestOptions.none())

    /** @see getAttributes */
    fun getAttributes(
        campaignId: String,
        requestOptions: RequestOptions,
    ): OsrGetAttributesResponse =
        getAttributes(campaignId, OsrGetAttributesParams.none(), requestOptions)

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
         * otherwise the same as [OsrService.getAttributes].
         */
        @MustBeClosed
        fun getAttributes(campaignId: String): HttpResponseFor<OsrGetAttributesResponse> =
            getAttributes(campaignId, OsrGetAttributesParams.none())

        /** @see getAttributes */
        @MustBeClosed
        fun getAttributes(
            campaignId: String,
            params: OsrGetAttributesParams = OsrGetAttributesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OsrGetAttributesResponse> =
            getAttributes(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see getAttributes */
        @MustBeClosed
        fun getAttributes(
            campaignId: String,
            params: OsrGetAttributesParams = OsrGetAttributesParams.none(),
        ): HttpResponseFor<OsrGetAttributesResponse> =
            getAttributes(campaignId, params, RequestOptions.none())

        /** @see getAttributes */
        @MustBeClosed
        fun getAttributes(
            params: OsrGetAttributesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OsrGetAttributesResponse>

        /** @see getAttributes */
        @MustBeClosed
        fun getAttributes(
            params: OsrGetAttributesParams
        ): HttpResponseFor<OsrGetAttributesResponse> = getAttributes(params, RequestOptions.none())

        /** @see getAttributes */
        @MustBeClosed
        fun getAttributes(
            campaignId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OsrGetAttributesResponse> =
            getAttributes(campaignId, OsrGetAttributesParams.none(), requestOptions)
    }
}
