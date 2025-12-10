// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.number10dlc.Number10dlcRetrieveParams
import com.telnyx.sdk.models.number10dlc.Number10dlcRetrieveResponse
import com.telnyx.sdk.services.blocking.number10dlc.BrandService
import com.telnyx.sdk.services.blocking.number10dlc.CampaignBuilderService
import com.telnyx.sdk.services.blocking.number10dlc.CampaignService
import com.telnyx.sdk.services.blocking.number10dlc.PartnerCampaignService
import com.telnyx.sdk.services.blocking.number10dlc.PhoneNumberAssignmentByProfileService
import com.telnyx.sdk.services.blocking.number10dlc.PhoneNumberCampaignService
import java.util.function.Consumer

interface Number10dlcService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): Number10dlcService

    fun brand(): BrandService

    fun campaign(): CampaignService

    fun campaignBuilder(): CampaignBuilderService

    fun partnerCampaign(): PartnerCampaignService

    fun partnerCampaigns(): PartnerCampaignService

    fun phoneNumberAssignmentByProfile(): PhoneNumberAssignmentByProfileService

    fun phoneNumberCampaigns(): PhoneNumberCampaignService

    /** Get Enum */
    fun retrieve(endpoint: Number10dlcRetrieveParams.Endpoint): Number10dlcRetrieveResponse =
        retrieve(endpoint, Number10dlcRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        endpoint: Number10dlcRetrieveParams.Endpoint,
        params: Number10dlcRetrieveParams = Number10dlcRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Number10dlcRetrieveResponse =
        retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        endpoint: Number10dlcRetrieveParams.Endpoint,
        params: Number10dlcRetrieveParams = Number10dlcRetrieveParams.none(),
    ): Number10dlcRetrieveResponse = retrieve(endpoint, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: Number10dlcRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Number10dlcRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: Number10dlcRetrieveParams): Number10dlcRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        endpoint: Number10dlcRetrieveParams.Endpoint,
        requestOptions: RequestOptions,
    ): Number10dlcRetrieveResponse =
        retrieve(endpoint, Number10dlcRetrieveParams.none(), requestOptions)

    /**
     * A view of [Number10dlcService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): Number10dlcService.WithRawResponse

        fun brand(): BrandService.WithRawResponse

        fun campaign(): CampaignService.WithRawResponse

        fun campaignBuilder(): CampaignBuilderService.WithRawResponse

        fun partnerCampaign(): PartnerCampaignService.WithRawResponse

        fun partnerCampaigns(): PartnerCampaignService.WithRawResponse

        fun phoneNumberAssignmentByProfile(): PhoneNumberAssignmentByProfileService.WithRawResponse

        fun phoneNumberCampaigns(): PhoneNumberCampaignService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /10dlc/enum/{endpoint}`, but is otherwise the same
         * as [Number10dlcService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            endpoint: Number10dlcRetrieveParams.Endpoint
        ): HttpResponseFor<Number10dlcRetrieveResponse> =
            retrieve(endpoint, Number10dlcRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            endpoint: Number10dlcRetrieveParams.Endpoint,
            params: Number10dlcRetrieveParams = Number10dlcRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Number10dlcRetrieveResponse> =
            retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            endpoint: Number10dlcRetrieveParams.Endpoint,
            params: Number10dlcRetrieveParams = Number10dlcRetrieveParams.none(),
        ): HttpResponseFor<Number10dlcRetrieveResponse> =
            retrieve(endpoint, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: Number10dlcRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Number10dlcRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: Number10dlcRetrieveParams
        ): HttpResponseFor<Number10dlcRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            endpoint: Number10dlcRetrieveParams.Endpoint,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Number10dlcRetrieveResponse> =
            retrieve(endpoint, Number10dlcRetrieveParams.none(), requestOptions)
    }
}
