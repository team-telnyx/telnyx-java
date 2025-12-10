// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.number10dlc.Number10dlcGetEnumParams
import com.telnyx.sdk.models.number10dlc.Number10dlcGetEnumResponse
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
    fun getEnum(endpoint: Number10dlcGetEnumParams.Endpoint): Number10dlcGetEnumResponse =
        getEnum(endpoint, Number10dlcGetEnumParams.none())

    /** @see getEnum */
    fun getEnum(
        endpoint: Number10dlcGetEnumParams.Endpoint,
        params: Number10dlcGetEnumParams = Number10dlcGetEnumParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Number10dlcGetEnumResponse =
        getEnum(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see getEnum */
    fun getEnum(
        endpoint: Number10dlcGetEnumParams.Endpoint,
        params: Number10dlcGetEnumParams = Number10dlcGetEnumParams.none(),
    ): Number10dlcGetEnumResponse = getEnum(endpoint, params, RequestOptions.none())

    /** @see getEnum */
    fun getEnum(
        params: Number10dlcGetEnumParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Number10dlcGetEnumResponse

    /** @see getEnum */
    fun getEnum(params: Number10dlcGetEnumParams): Number10dlcGetEnumResponse =
        getEnum(params, RequestOptions.none())

    /** @see getEnum */
    fun getEnum(
        endpoint: Number10dlcGetEnumParams.Endpoint,
        requestOptions: RequestOptions,
    ): Number10dlcGetEnumResponse =
        getEnum(endpoint, Number10dlcGetEnumParams.none(), requestOptions)

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
         * as [Number10dlcService.getEnum].
         */
        @MustBeClosed
        fun getEnum(
            endpoint: Number10dlcGetEnumParams.Endpoint
        ): HttpResponseFor<Number10dlcGetEnumResponse> =
            getEnum(endpoint, Number10dlcGetEnumParams.none())

        /** @see getEnum */
        @MustBeClosed
        fun getEnum(
            endpoint: Number10dlcGetEnumParams.Endpoint,
            params: Number10dlcGetEnumParams = Number10dlcGetEnumParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Number10dlcGetEnumResponse> =
            getEnum(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see getEnum */
        @MustBeClosed
        fun getEnum(
            endpoint: Number10dlcGetEnumParams.Endpoint,
            params: Number10dlcGetEnumParams = Number10dlcGetEnumParams.none(),
        ): HttpResponseFor<Number10dlcGetEnumResponse> =
            getEnum(endpoint, params, RequestOptions.none())

        /** @see getEnum */
        @MustBeClosed
        fun getEnum(
            params: Number10dlcGetEnumParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Number10dlcGetEnumResponse>

        /** @see getEnum */
        @MustBeClosed
        fun getEnum(params: Number10dlcGetEnumParams): HttpResponseFor<Number10dlcGetEnumResponse> =
            getEnum(params, RequestOptions.none())

        /** @see getEnum */
        @MustBeClosed
        fun getEnum(
            endpoint: Number10dlcGetEnumParams.Endpoint,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Number10dlcGetEnumResponse> =
            getEnum(endpoint, Number10dlcGetEnumParams.none(), requestOptions)
    }
}
