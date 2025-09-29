// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.inboundchannels.InboundChannelListParams
import com.telnyx.api.models.inboundchannels.InboundChannelListResponse
import com.telnyx.api.models.inboundchannels.InboundChannelUpdateParams
import com.telnyx.api.models.inboundchannels.InboundChannelUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InboundChannelServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboundChannelServiceAsync

    /**
     * Update the number of Voice Channels for the US Zone. This allows your account to handle
     * multiple simultaneous inbound calls to US numbers. Use this endpoint to increase or decrease
     * your capacity based on expected call volume.
     */
    fun update(
        params: InboundChannelUpdateParams
    ): CompletableFuture<InboundChannelUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: InboundChannelUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundChannelUpdateResponse>

    /**
     * Returns the US Zone voice channels for your account. voice channels allows you to use Channel
     * Billing for calls to your Telnyx phone numbers. Please check the <a
     * href="https://support.telnyx.com/en/articles/8428806-global-channel-billing">Telnyx Support
     * Articles</a> section for full information and examples of how to utilize Channel Billing.
     */
    fun list(): CompletableFuture<InboundChannelListResponse> =
        list(InboundChannelListParams.none())

    /** @see list */
    fun list(
        params: InboundChannelListParams = InboundChannelListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundChannelListResponse>

    /** @see list */
    fun list(
        params: InboundChannelListParams = InboundChannelListParams.none()
    ): CompletableFuture<InboundChannelListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<InboundChannelListResponse> =
        list(InboundChannelListParams.none(), requestOptions)

    /**
     * A view of [InboundChannelServiceAsync] that provides access to raw HTTP responses for each
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
        ): InboundChannelServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /inbound_channels`, but is otherwise the same as
         * [InboundChannelServiceAsync.update].
         */
        fun update(
            params: InboundChannelUpdateParams
        ): CompletableFuture<HttpResponseFor<InboundChannelUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: InboundChannelUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundChannelUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /inbound_channels`, but is otherwise the same as
         * [InboundChannelServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<InboundChannelListResponse>> =
            list(InboundChannelListParams.none())

        /** @see list */
        fun list(
            params: InboundChannelListParams = InboundChannelListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundChannelListResponse>>

        /** @see list */
        fun list(
            params: InboundChannelListParams = InboundChannelListParams.none()
        ): CompletableFuture<HttpResponseFor<InboundChannelListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InboundChannelListResponse>> =
            list(InboundChannelListParams.none(), requestOptions)
    }
}
