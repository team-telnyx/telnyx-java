// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.channelzones.ChannelZoneListPageAsync
import com.telnyx.sdk.models.channelzones.ChannelZoneListParams
import com.telnyx.sdk.models.channelzones.ChannelZoneUpdateParams
import com.telnyx.sdk.models.channelzones.ChannelZoneUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ChannelZoneServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChannelZoneServiceAsync

    /**
     * Update the number of Voice Channels for the Non-US Zones. This allows your account to handle
     * multiple simultaneous inbound calls to Non-US numbers. Use this endpoint to increase or
     * decrease your capacity based on expected call volume.
     */
    fun update(
        channelZoneId: String,
        params: ChannelZoneUpdateParams,
    ): CompletableFuture<ChannelZoneUpdateResponse> =
        update(channelZoneId, params, RequestOptions.none())

    /** @see update */
    fun update(
        channelZoneId: String,
        params: ChannelZoneUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChannelZoneUpdateResponse> =
        update(params.toBuilder().channelZoneId(channelZoneId).build(), requestOptions)

    /** @see update */
    fun update(params: ChannelZoneUpdateParams): CompletableFuture<ChannelZoneUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ChannelZoneUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChannelZoneUpdateResponse>

    /**
     * Returns the non-US voice channels for your account. voice channels allow you to use Channel
     * Billing for calls to your Telnyx phone numbers. Please check the <a
     * href="https://support.telnyx.com/en/articles/8428806-global-channel-billing">Telnyx Support
     * Articles</a> section for full information and examples of how to utilize Channel Billing.
     */
    fun list(): CompletableFuture<ChannelZoneListPageAsync> = list(ChannelZoneListParams.none())

    /** @see list */
    fun list(
        params: ChannelZoneListParams = ChannelZoneListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChannelZoneListPageAsync>

    /** @see list */
    fun list(
        params: ChannelZoneListParams = ChannelZoneListParams.none()
    ): CompletableFuture<ChannelZoneListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ChannelZoneListPageAsync> =
        list(ChannelZoneListParams.none(), requestOptions)

    /**
     * A view of [ChannelZoneServiceAsync] that provides access to raw HTTP responses for each
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
        ): ChannelZoneServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /channel_zones/{channel_zone_id}`, but is otherwise
         * the same as [ChannelZoneServiceAsync.update].
         */
        fun update(
            channelZoneId: String,
            params: ChannelZoneUpdateParams,
        ): CompletableFuture<HttpResponseFor<ChannelZoneUpdateResponse>> =
            update(channelZoneId, params, RequestOptions.none())

        /** @see update */
        fun update(
            channelZoneId: String,
            params: ChannelZoneUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChannelZoneUpdateResponse>> =
            update(params.toBuilder().channelZoneId(channelZoneId).build(), requestOptions)

        /** @see update */
        fun update(
            params: ChannelZoneUpdateParams
        ): CompletableFuture<HttpResponseFor<ChannelZoneUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ChannelZoneUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChannelZoneUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /channel_zones`, but is otherwise the same as
         * [ChannelZoneServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ChannelZoneListPageAsync>> =
            list(ChannelZoneListParams.none())

        /** @see list */
        fun list(
            params: ChannelZoneListParams = ChannelZoneListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChannelZoneListPageAsync>>

        /** @see list */
        fun list(
            params: ChannelZoneListParams = ChannelZoneListParams.none()
        ): CompletableFuture<HttpResponseFor<ChannelZoneListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ChannelZoneListPageAsync>> =
            list(ChannelZoneListParams.none(), requestOptions)
    }
}
