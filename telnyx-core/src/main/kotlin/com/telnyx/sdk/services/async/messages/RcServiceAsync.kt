// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.messages

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messages.rcs.RcGenerateDeeplinkParams
import com.telnyx.sdk.models.messages.rcs.RcGenerateDeeplinkResponse
import com.telnyx.sdk.models.messages.rcs.RcSendParams
import com.telnyx.sdk.models.messages.rcs.RcSendResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RcServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RcServiceAsync

    /**
     * Generate a deeplink URL that can be used to start an RCS conversation with a specific agent.
     */
    fun generateDeeplink(agentId: String): CompletableFuture<RcGenerateDeeplinkResponse> =
        generateDeeplink(agentId, RcGenerateDeeplinkParams.none())

    /** @see generateDeeplink */
    fun generateDeeplink(
        agentId: String,
        params: RcGenerateDeeplinkParams = RcGenerateDeeplinkParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RcGenerateDeeplinkResponse> =
        generateDeeplink(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see generateDeeplink */
    fun generateDeeplink(
        agentId: String,
        params: RcGenerateDeeplinkParams = RcGenerateDeeplinkParams.none(),
    ): CompletableFuture<RcGenerateDeeplinkResponse> =
        generateDeeplink(agentId, params, RequestOptions.none())

    /** @see generateDeeplink */
    fun generateDeeplink(
        params: RcGenerateDeeplinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RcGenerateDeeplinkResponse>

    /** @see generateDeeplink */
    fun generateDeeplink(
        params: RcGenerateDeeplinkParams
    ): CompletableFuture<RcGenerateDeeplinkResponse> =
        generateDeeplink(params, RequestOptions.none())

    /** @see generateDeeplink */
    fun generateDeeplink(
        agentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RcGenerateDeeplinkResponse> =
        generateDeeplink(agentId, RcGenerateDeeplinkParams.none(), requestOptions)

    /** Send an RCS message */
    fun send(params: RcSendParams): CompletableFuture<RcSendResponse> =
        send(params, RequestOptions.none())

    /** @see send */
    fun send(
        params: RcSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RcSendResponse>

    /** A view of [RcServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RcServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /messages/rcs/deeplinks/{agent_id}`, but is
         * otherwise the same as [RcServiceAsync.generateDeeplink].
         */
        fun generateDeeplink(
            agentId: String
        ): CompletableFuture<HttpResponseFor<RcGenerateDeeplinkResponse>> =
            generateDeeplink(agentId, RcGenerateDeeplinkParams.none())

        /** @see generateDeeplink */
        fun generateDeeplink(
            agentId: String,
            params: RcGenerateDeeplinkParams = RcGenerateDeeplinkParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RcGenerateDeeplinkResponse>> =
            generateDeeplink(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see generateDeeplink */
        fun generateDeeplink(
            agentId: String,
            params: RcGenerateDeeplinkParams = RcGenerateDeeplinkParams.none(),
        ): CompletableFuture<HttpResponseFor<RcGenerateDeeplinkResponse>> =
            generateDeeplink(agentId, params, RequestOptions.none())

        /** @see generateDeeplink */
        fun generateDeeplink(
            params: RcGenerateDeeplinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RcGenerateDeeplinkResponse>>

        /** @see generateDeeplink */
        fun generateDeeplink(
            params: RcGenerateDeeplinkParams
        ): CompletableFuture<HttpResponseFor<RcGenerateDeeplinkResponse>> =
            generateDeeplink(params, RequestOptions.none())

        /** @see generateDeeplink */
        fun generateDeeplink(
            agentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RcGenerateDeeplinkResponse>> =
            generateDeeplink(agentId, RcGenerateDeeplinkParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /messages/rcs`, but is otherwise the same as
         * [RcServiceAsync.send].
         */
        fun send(params: RcSendParams): CompletableFuture<HttpResponseFor<RcSendResponse>> =
            send(params, RequestOptions.none())

        /** @see send */
        fun send(
            params: RcSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RcSendResponse>>
    }
}
