// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messaging10dlc.Messaging10dlcGetEnumParams
import com.telnyx.sdk.models.messaging10dlc.Messaging10dlcGetEnumResponse
import com.telnyx.sdk.services.blocking.messaging10dlc.BrandService
import com.telnyx.sdk.services.blocking.messaging10dlc.CampaignBuilderService
import com.telnyx.sdk.services.blocking.messaging10dlc.CampaignService
import com.telnyx.sdk.services.blocking.messaging10dlc.PartnerCampaignService
import com.telnyx.sdk.services.blocking.messaging10dlc.PhoneNumberAssignmentByProfileService
import com.telnyx.sdk.services.blocking.messaging10dlc.PhoneNumberCampaignService
import java.util.function.Consumer

interface Messaging10dlcService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): Messaging10dlcService

    fun brand(): BrandService

    fun campaign(): CampaignService

    fun campaignBuilder(): CampaignBuilderService

    fun partnerCampaigns(): PartnerCampaignService

    fun phoneNumberCampaigns(): PhoneNumberCampaignService

    fun phoneNumberAssignmentByProfile(): PhoneNumberAssignmentByProfileService

    /** Get Enum */
    fun getEnum(endpoint: Messaging10dlcGetEnumParams.Endpoint): Messaging10dlcGetEnumResponse =
        getEnum(endpoint, Messaging10dlcGetEnumParams.none())

    /** @see getEnum */
    fun getEnum(
        endpoint: Messaging10dlcGetEnumParams.Endpoint,
        params: Messaging10dlcGetEnumParams = Messaging10dlcGetEnumParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Messaging10dlcGetEnumResponse =
        getEnum(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see getEnum */
    fun getEnum(
        endpoint: Messaging10dlcGetEnumParams.Endpoint,
        params: Messaging10dlcGetEnumParams = Messaging10dlcGetEnumParams.none(),
    ): Messaging10dlcGetEnumResponse = getEnum(endpoint, params, RequestOptions.none())

    /** @see getEnum */
    fun getEnum(
        params: Messaging10dlcGetEnumParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Messaging10dlcGetEnumResponse

    /** @see getEnum */
    fun getEnum(params: Messaging10dlcGetEnumParams): Messaging10dlcGetEnumResponse =
        getEnum(params, RequestOptions.none())

    /** @see getEnum */
    fun getEnum(
        endpoint: Messaging10dlcGetEnumParams.Endpoint,
        requestOptions: RequestOptions,
    ): Messaging10dlcGetEnumResponse =
        getEnum(endpoint, Messaging10dlcGetEnumParams.none(), requestOptions)

    /**
     * A view of [Messaging10dlcService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): Messaging10dlcService.WithRawResponse

        fun brand(): BrandService.WithRawResponse

        fun campaign(): CampaignService.WithRawResponse

        fun campaignBuilder(): CampaignBuilderService.WithRawResponse

        fun partnerCampaigns(): PartnerCampaignService.WithRawResponse

        fun phoneNumberCampaigns(): PhoneNumberCampaignService.WithRawResponse

        fun phoneNumberAssignmentByProfile(): PhoneNumberAssignmentByProfileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /10dlc/enum/{endpoint}`, but is otherwise the same
         * as [Messaging10dlcService.getEnum].
         */
        @MustBeClosed
        fun getEnum(
            endpoint: Messaging10dlcGetEnumParams.Endpoint
        ): HttpResponseFor<Messaging10dlcGetEnumResponse> =
            getEnum(endpoint, Messaging10dlcGetEnumParams.none())

        /** @see getEnum */
        @MustBeClosed
        fun getEnum(
            endpoint: Messaging10dlcGetEnumParams.Endpoint,
            params: Messaging10dlcGetEnumParams = Messaging10dlcGetEnumParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Messaging10dlcGetEnumResponse> =
            getEnum(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see getEnum */
        @MustBeClosed
        fun getEnum(
            endpoint: Messaging10dlcGetEnumParams.Endpoint,
            params: Messaging10dlcGetEnumParams = Messaging10dlcGetEnumParams.none(),
        ): HttpResponseFor<Messaging10dlcGetEnumResponse> =
            getEnum(endpoint, params, RequestOptions.none())

        /** @see getEnum */
        @MustBeClosed
        fun getEnum(
            params: Messaging10dlcGetEnumParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Messaging10dlcGetEnumResponse>

        /** @see getEnum */
        @MustBeClosed
        fun getEnum(
            params: Messaging10dlcGetEnumParams
        ): HttpResponseFor<Messaging10dlcGetEnumResponse> = getEnum(params, RequestOptions.none())

        /** @see getEnum */
        @MustBeClosed
        fun getEnum(
            endpoint: Messaging10dlcGetEnumParams.Endpoint,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Messaging10dlcGetEnumResponse> =
            getEnum(endpoint, Messaging10dlcGetEnumParams.none(), requestOptions)
    }
}
