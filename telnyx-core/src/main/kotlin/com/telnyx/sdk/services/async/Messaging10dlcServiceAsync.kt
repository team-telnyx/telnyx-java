// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messaging10dlc.Messaging10dlcGetEnumParams
import com.telnyx.sdk.models.messaging10dlc.Messaging10dlcGetEnumResponse
import com.telnyx.sdk.services.async.messaging10dlc.BrandServiceAsync
import com.telnyx.sdk.services.async.messaging10dlc.CampaignBuilderServiceAsync
import com.telnyx.sdk.services.async.messaging10dlc.CampaignServiceAsync
import com.telnyx.sdk.services.async.messaging10dlc.PartnerCampaignServiceAsync
import com.telnyx.sdk.services.async.messaging10dlc.PhoneNumberAssignmentByProfileServiceAsync
import com.telnyx.sdk.services.async.messaging10dlc.PhoneNumberCampaignServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface Messaging10dlcServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): Messaging10dlcServiceAsync

    /** Brand operations */
    fun brand(): BrandServiceAsync

    /** Campaign operations */
    fun campaign(): CampaignServiceAsync

    /** Campaign operations */
    fun campaignBuilder(): CampaignBuilderServiceAsync

    fun partnerCampaigns(): PartnerCampaignServiceAsync

    /** Phone number campaign assignment */
    fun phoneNumberCampaigns(): PhoneNumberCampaignServiceAsync

    /** Phone number campaign bulk assignment */
    fun phoneNumberAssignmentByProfile(): PhoneNumberAssignmentByProfileServiceAsync

    /** Get Enum */
    fun getEnum(
        endpoint: Messaging10dlcGetEnumParams.Endpoint
    ): CompletableFuture<Messaging10dlcGetEnumResponse> =
        getEnum(endpoint, Messaging10dlcGetEnumParams.none())

    /** @see getEnum */
    fun getEnum(
        endpoint: Messaging10dlcGetEnumParams.Endpoint,
        params: Messaging10dlcGetEnumParams = Messaging10dlcGetEnumParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Messaging10dlcGetEnumResponse> =
        getEnum(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see getEnum */
    fun getEnum(
        endpoint: Messaging10dlcGetEnumParams.Endpoint,
        params: Messaging10dlcGetEnumParams = Messaging10dlcGetEnumParams.none(),
    ): CompletableFuture<Messaging10dlcGetEnumResponse> =
        getEnum(endpoint, params, RequestOptions.none())

    /** @see getEnum */
    fun getEnum(
        params: Messaging10dlcGetEnumParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Messaging10dlcGetEnumResponse>

    /** @see getEnum */
    fun getEnum(
        params: Messaging10dlcGetEnumParams
    ): CompletableFuture<Messaging10dlcGetEnumResponse> = getEnum(params, RequestOptions.none())

    /** @see getEnum */
    fun getEnum(
        endpoint: Messaging10dlcGetEnumParams.Endpoint,
        requestOptions: RequestOptions,
    ): CompletableFuture<Messaging10dlcGetEnumResponse> =
        getEnum(endpoint, Messaging10dlcGetEnumParams.none(), requestOptions)

    /**
     * A view of [Messaging10dlcServiceAsync] that provides access to raw HTTP responses for each
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
        ): Messaging10dlcServiceAsync.WithRawResponse

        /** Brand operations */
        fun brand(): BrandServiceAsync.WithRawResponse

        /** Campaign operations */
        fun campaign(): CampaignServiceAsync.WithRawResponse

        /** Campaign operations */
        fun campaignBuilder(): CampaignBuilderServiceAsync.WithRawResponse

        fun partnerCampaigns(): PartnerCampaignServiceAsync.WithRawResponse

        /** Phone number campaign assignment */
        fun phoneNumberCampaigns(): PhoneNumberCampaignServiceAsync.WithRawResponse

        /** Phone number campaign bulk assignment */
        fun phoneNumberAssignmentByProfile():
            PhoneNumberAssignmentByProfileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /10dlc/enum/{endpoint}`, but is otherwise the same
         * as [Messaging10dlcServiceAsync.getEnum].
         */
        fun getEnum(
            endpoint: Messaging10dlcGetEnumParams.Endpoint
        ): CompletableFuture<HttpResponseFor<Messaging10dlcGetEnumResponse>> =
            getEnum(endpoint, Messaging10dlcGetEnumParams.none())

        /** @see getEnum */
        fun getEnum(
            endpoint: Messaging10dlcGetEnumParams.Endpoint,
            params: Messaging10dlcGetEnumParams = Messaging10dlcGetEnumParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Messaging10dlcGetEnumResponse>> =
            getEnum(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see getEnum */
        fun getEnum(
            endpoint: Messaging10dlcGetEnumParams.Endpoint,
            params: Messaging10dlcGetEnumParams = Messaging10dlcGetEnumParams.none(),
        ): CompletableFuture<HttpResponseFor<Messaging10dlcGetEnumResponse>> =
            getEnum(endpoint, params, RequestOptions.none())

        /** @see getEnum */
        fun getEnum(
            params: Messaging10dlcGetEnumParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Messaging10dlcGetEnumResponse>>

        /** @see getEnum */
        fun getEnum(
            params: Messaging10dlcGetEnumParams
        ): CompletableFuture<HttpResponseFor<Messaging10dlcGetEnumResponse>> =
            getEnum(params, RequestOptions.none())

        /** @see getEnum */
        fun getEnum(
            endpoint: Messaging10dlcGetEnumParams.Endpoint,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Messaging10dlcGetEnumResponse>> =
            getEnum(endpoint, Messaging10dlcGetEnumParams.none(), requestOptions)
    }
}
