// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.channelzones.ChannelZoneListParams
import com.telnyx.sdk.models.channelzones.ChannelZoneListResponse
import com.telnyx.sdk.models.channelzones.ChannelZoneUpdateParams
import com.telnyx.sdk.models.channelzones.ChannelZoneUpdateResponse
import java.util.function.Consumer

interface ChannelZoneService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChannelZoneService

    /**
     * Update the number of Voice Channels for the Non-US Zones. This allows your account to handle
     * multiple simultaneous inbound calls to Non-US numbers. Use this endpoint to increase or
     * decrease your capacity based on expected call volume.
     */
    fun update(channelZoneId: String, params: ChannelZoneUpdateParams): ChannelZoneUpdateResponse =
        update(channelZoneId, params, RequestOptions.none())

    /** @see update */
    fun update(
        channelZoneId: String,
        params: ChannelZoneUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChannelZoneUpdateResponse =
        update(params.toBuilder().channelZoneId(channelZoneId).build(), requestOptions)

    /** @see update */
    fun update(params: ChannelZoneUpdateParams): ChannelZoneUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ChannelZoneUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChannelZoneUpdateResponse

    /**
     * Returns the non-US voice channels for your account. voice channels allow you to use Channel
     * Billing for calls to your Telnyx phone numbers. Please check the <a
     * href="https://support.telnyx.com/en/articles/8428806-global-channel-billing">Telnyx Support
     * Articles</a> section for full information and examples of how to utilize Channel Billing.
     */
    fun list(): ChannelZoneListResponse = list(ChannelZoneListParams.none())

    /** @see list */
    fun list(
        params: ChannelZoneListParams = ChannelZoneListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChannelZoneListResponse

    /** @see list */
    fun list(
        params: ChannelZoneListParams = ChannelZoneListParams.none()
    ): ChannelZoneListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ChannelZoneListResponse =
        list(ChannelZoneListParams.none(), requestOptions)

    /**
     * A view of [ChannelZoneService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChannelZoneService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /channel_zones/{channel_zone_id}`, but is otherwise
         * the same as [ChannelZoneService.update].
         */
        @MustBeClosed
        fun update(
            channelZoneId: String,
            params: ChannelZoneUpdateParams,
        ): HttpResponseFor<ChannelZoneUpdateResponse> =
            update(channelZoneId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            channelZoneId: String,
            params: ChannelZoneUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChannelZoneUpdateResponse> =
            update(params.toBuilder().channelZoneId(channelZoneId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ChannelZoneUpdateParams): HttpResponseFor<ChannelZoneUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ChannelZoneUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChannelZoneUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /channel_zones`, but is otherwise the same as
         * [ChannelZoneService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ChannelZoneListResponse> = list(ChannelZoneListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ChannelZoneListParams = ChannelZoneListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChannelZoneListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ChannelZoneListParams = ChannelZoneListParams.none()
        ): HttpResponseFor<ChannelZoneListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ChannelZoneListResponse> =
            list(ChannelZoneListParams.none(), requestOptions)
    }
}
