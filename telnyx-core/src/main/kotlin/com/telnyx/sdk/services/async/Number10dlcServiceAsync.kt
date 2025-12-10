// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.number10dlc.Number10dlcRetrieveParams
import com.telnyx.sdk.models.number10dlc.Number10dlcRetrieveResponse
import com.telnyx.sdk.services.async.number10dlc.BrandServiceAsync
import com.telnyx.sdk.services.async.number10dlc.CampaignBuilderServiceAsync
import com.telnyx.sdk.services.async.number10dlc.CampaignServiceAsync
import com.telnyx.sdk.services.async.number10dlc.PartnerCampaignServiceAsync
import com.telnyx.sdk.services.async.number10dlc.PhoneNumberAssignmentByProfileServiceAsync
import com.telnyx.sdk.services.async.number10dlc.PhoneNumberCampaignServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface Number10dlcServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): Number10dlcServiceAsync

    fun brand(): BrandServiceAsync

    fun campaign(): CampaignServiceAsync

    fun campaignBuilder(): CampaignBuilderServiceAsync

    fun partnerCampaign(): PartnerCampaignServiceAsync

    fun partnerCampaigns(): PartnerCampaignServiceAsync

    fun phoneNumberAssignmentByProfile(): PhoneNumberAssignmentByProfileServiceAsync

    fun phoneNumberCampaigns(): PhoneNumberCampaignServiceAsync

    /** Get Enum */
    fun retrieve(
        endpoint: Number10dlcRetrieveParams.Endpoint
    ): CompletableFuture<Number10dlcRetrieveResponse> =
        retrieve(endpoint, Number10dlcRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        endpoint: Number10dlcRetrieveParams.Endpoint,
        params: Number10dlcRetrieveParams = Number10dlcRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Number10dlcRetrieveResponse> =
        retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        endpoint: Number10dlcRetrieveParams.Endpoint,
        params: Number10dlcRetrieveParams = Number10dlcRetrieveParams.none(),
    ): CompletableFuture<Number10dlcRetrieveResponse> =
        retrieve(endpoint, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: Number10dlcRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Number10dlcRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: Number10dlcRetrieveParams
    ): CompletableFuture<Number10dlcRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        endpoint: Number10dlcRetrieveParams.Endpoint,
        requestOptions: RequestOptions,
    ): CompletableFuture<Number10dlcRetrieveResponse> =
        retrieve(endpoint, Number10dlcRetrieveParams.none(), requestOptions)

    /**
     * A view of [Number10dlcServiceAsync] that provides access to raw HTTP responses for each
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
        ): Number10dlcServiceAsync.WithRawResponse

        fun brand(): BrandServiceAsync.WithRawResponse

        fun campaign(): CampaignServiceAsync.WithRawResponse

        fun campaignBuilder(): CampaignBuilderServiceAsync.WithRawResponse

        fun partnerCampaign(): PartnerCampaignServiceAsync.WithRawResponse

        fun partnerCampaigns(): PartnerCampaignServiceAsync.WithRawResponse

        fun phoneNumberAssignmentByProfile():
            PhoneNumberAssignmentByProfileServiceAsync.WithRawResponse

        fun phoneNumberCampaigns(): PhoneNumberCampaignServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /10dlc/enum/{endpoint}`, but is otherwise the same
         * as [Number10dlcServiceAsync.retrieve].
         */
        fun retrieve(
            endpoint: Number10dlcRetrieveParams.Endpoint
        ): CompletableFuture<HttpResponseFor<Number10dlcRetrieveResponse>> =
            retrieve(endpoint, Number10dlcRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            endpoint: Number10dlcRetrieveParams.Endpoint,
            params: Number10dlcRetrieveParams = Number10dlcRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Number10dlcRetrieveResponse>> =
            retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            endpoint: Number10dlcRetrieveParams.Endpoint,
            params: Number10dlcRetrieveParams = Number10dlcRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Number10dlcRetrieveResponse>> =
            retrieve(endpoint, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: Number10dlcRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Number10dlcRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: Number10dlcRetrieveParams
        ): CompletableFuture<HttpResponseFor<Number10dlcRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            endpoint: Number10dlcRetrieveParams.Endpoint,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Number10dlcRetrieveResponse>> =
            retrieve(endpoint, Number10dlcRetrieveParams.none(), requestOptions)
    }
}
