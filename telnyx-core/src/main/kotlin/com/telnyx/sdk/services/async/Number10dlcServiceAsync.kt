// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.number10dlc.Number10dlcGetEnumParams
import com.telnyx.sdk.models.number10dlc.Number10dlcGetEnumResponse
import com.telnyx.sdk.services.async.number10dlc.BrandServiceAsync
import com.telnyx.sdk.services.async.number10dlc.CampaignBuilderServiceAsync
import com.telnyx.sdk.services.async.number10dlc.CampaignServiceAsync
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

    fun phoneNumberCampaigns(): PhoneNumberCampaignServiceAsync

    /** Get Enum */
    fun getEnum(
        endpoint: Number10dlcGetEnumParams.Endpoint
    ): CompletableFuture<Number10dlcGetEnumResponse> =
        getEnum(endpoint, Number10dlcGetEnumParams.none())

    /** @see getEnum */
    fun getEnum(
        endpoint: Number10dlcGetEnumParams.Endpoint,
        params: Number10dlcGetEnumParams = Number10dlcGetEnumParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Number10dlcGetEnumResponse> =
        getEnum(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see getEnum */
    fun getEnum(
        endpoint: Number10dlcGetEnumParams.Endpoint,
        params: Number10dlcGetEnumParams = Number10dlcGetEnumParams.none(),
    ): CompletableFuture<Number10dlcGetEnumResponse> =
        getEnum(endpoint, params, RequestOptions.none())

    /** @see getEnum */
    fun getEnum(
        params: Number10dlcGetEnumParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Number10dlcGetEnumResponse>

    /** @see getEnum */
    fun getEnum(params: Number10dlcGetEnumParams): CompletableFuture<Number10dlcGetEnumResponse> =
        getEnum(params, RequestOptions.none())

    /** @see getEnum */
    fun getEnum(
        endpoint: Number10dlcGetEnumParams.Endpoint,
        requestOptions: RequestOptions,
    ): CompletableFuture<Number10dlcGetEnumResponse> =
        getEnum(endpoint, Number10dlcGetEnumParams.none(), requestOptions)

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

        fun phoneNumberCampaigns(): PhoneNumberCampaignServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /10dlc/enum/{endpoint}`, but is otherwise the same
         * as [Number10dlcServiceAsync.getEnum].
         */
        fun getEnum(
            endpoint: Number10dlcGetEnumParams.Endpoint
        ): CompletableFuture<HttpResponseFor<Number10dlcGetEnumResponse>> =
            getEnum(endpoint, Number10dlcGetEnumParams.none())

        /** @see getEnum */
        fun getEnum(
            endpoint: Number10dlcGetEnumParams.Endpoint,
            params: Number10dlcGetEnumParams = Number10dlcGetEnumParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Number10dlcGetEnumResponse>> =
            getEnum(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see getEnum */
        fun getEnum(
            endpoint: Number10dlcGetEnumParams.Endpoint,
            params: Number10dlcGetEnumParams = Number10dlcGetEnumParams.none(),
        ): CompletableFuture<HttpResponseFor<Number10dlcGetEnumResponse>> =
            getEnum(endpoint, params, RequestOptions.none())

        /** @see getEnum */
        fun getEnum(
            params: Number10dlcGetEnumParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Number10dlcGetEnumResponse>>

        /** @see getEnum */
        fun getEnum(
            params: Number10dlcGetEnumParams
        ): CompletableFuture<HttpResponseFor<Number10dlcGetEnumResponse>> =
            getEnum(params, RequestOptions.none())

        /** @see getEnum */
        fun getEnum(
            endpoint: Number10dlcGetEnumParams.Endpoint,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Number10dlcGetEnumResponse>> =
            getEnum(endpoint, Number10dlcGetEnumParams.none(), requestOptions)
    }
}
