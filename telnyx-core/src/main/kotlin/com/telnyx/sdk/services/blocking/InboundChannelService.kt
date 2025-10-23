// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.inboundchannels.InboundChannelListParams
import com.telnyx.sdk.models.inboundchannels.InboundChannelListResponse
import com.telnyx.sdk.models.inboundchannels.InboundChannelUpdateParams
import com.telnyx.sdk.models.inboundchannels.InboundChannelUpdateResponse
import java.util.function.Consumer

interface InboundChannelService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboundChannelService

    /**
     * Update the number of Voice Channels for the US Zone. This allows your account to handle
     * multiple simultaneous inbound calls to US numbers. Use this endpoint to increase or decrease
     * your capacity based on expected call volume.
     */
    fun update(params: InboundChannelUpdateParams): InboundChannelUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: InboundChannelUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundChannelUpdateResponse

    /**
     * Returns the US Zone voice channels for your account. voice channels allows you to use Channel
     * Billing for calls to your Telnyx phone numbers. Please check the <a
     * href="https://support.telnyx.com/en/articles/8428806-global-channel-billing">Telnyx Support
     * Articles</a> section for full information and examples of how to utilize Channel Billing.
     */
    fun list(): InboundChannelListResponse = list(InboundChannelListParams.none())

    /** @see list */
    fun list(
        params: InboundChannelListParams = InboundChannelListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundChannelListResponse

    /** @see list */
    fun list(
        params: InboundChannelListParams = InboundChannelListParams.none()
    ): InboundChannelListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): InboundChannelListResponse =
        list(InboundChannelListParams.none(), requestOptions)

    /**
     * A view of [InboundChannelService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboundChannelService.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /inbound_channels`, but is otherwise the same as
         * [InboundChannelService.update].
         */
        @MustBeClosed
        fun update(
            params: InboundChannelUpdateParams
        ): HttpResponseFor<InboundChannelUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: InboundChannelUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundChannelUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /inbound_channels`, but is otherwise the same as
         * [InboundChannelService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<InboundChannelListResponse> =
            list(InboundChannelListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: InboundChannelListParams = InboundChannelListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundChannelListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: InboundChannelListParams = InboundChannelListParams.none()
        ): HttpResponseFor<InboundChannelListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InboundChannelListResponse> =
            list(InboundChannelListParams.none(), requestOptions)
    }
}
