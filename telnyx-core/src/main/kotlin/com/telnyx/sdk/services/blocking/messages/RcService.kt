// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messages

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messages.rcs.RcGenerateDeeplinkParams
import com.telnyx.sdk.models.messages.rcs.RcGenerateDeeplinkResponse
import com.telnyx.sdk.models.messages.rcs.RcSendParams
import com.telnyx.sdk.models.messages.rcs.RcSendResponse
import java.util.function.Consumer

interface RcService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RcService

    /**
     * Generate a deeplink URL that can be used to start an RCS conversation with a specific agent.
     */
    fun generateDeeplink(agentId: String): RcGenerateDeeplinkResponse =
        generateDeeplink(agentId, RcGenerateDeeplinkParams.none())

    /** @see generateDeeplink */
    fun generateDeeplink(
        agentId: String,
        params: RcGenerateDeeplinkParams = RcGenerateDeeplinkParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RcGenerateDeeplinkResponse =
        generateDeeplink(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see generateDeeplink */
    fun generateDeeplink(
        agentId: String,
        params: RcGenerateDeeplinkParams = RcGenerateDeeplinkParams.none(),
    ): RcGenerateDeeplinkResponse = generateDeeplink(agentId, params, RequestOptions.none())

    /** @see generateDeeplink */
    fun generateDeeplink(
        params: RcGenerateDeeplinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RcGenerateDeeplinkResponse

    /** @see generateDeeplink */
    fun generateDeeplink(params: RcGenerateDeeplinkParams): RcGenerateDeeplinkResponse =
        generateDeeplink(params, RequestOptions.none())

    /** @see generateDeeplink */
    fun generateDeeplink(
        agentId: String,
        requestOptions: RequestOptions,
    ): RcGenerateDeeplinkResponse =
        generateDeeplink(agentId, RcGenerateDeeplinkParams.none(), requestOptions)

    /** Send an RCS message */
    fun send(params: RcSendParams): RcSendResponse = send(params, RequestOptions.none())

    /** @see send */
    fun send(
        params: RcSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RcSendResponse

    /** A view of [RcService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RcService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /messages/rcs/deeplinks/{agent_id}`, but is
         * otherwise the same as [RcService.generateDeeplink].
         */
        @MustBeClosed
        fun generateDeeplink(agentId: String): HttpResponseFor<RcGenerateDeeplinkResponse> =
            generateDeeplink(agentId, RcGenerateDeeplinkParams.none())

        /** @see generateDeeplink */
        @MustBeClosed
        fun generateDeeplink(
            agentId: String,
            params: RcGenerateDeeplinkParams = RcGenerateDeeplinkParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RcGenerateDeeplinkResponse> =
            generateDeeplink(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see generateDeeplink */
        @MustBeClosed
        fun generateDeeplink(
            agentId: String,
            params: RcGenerateDeeplinkParams = RcGenerateDeeplinkParams.none(),
        ): HttpResponseFor<RcGenerateDeeplinkResponse> =
            generateDeeplink(agentId, params, RequestOptions.none())

        /** @see generateDeeplink */
        @MustBeClosed
        fun generateDeeplink(
            params: RcGenerateDeeplinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RcGenerateDeeplinkResponse>

        /** @see generateDeeplink */
        @MustBeClosed
        fun generateDeeplink(
            params: RcGenerateDeeplinkParams
        ): HttpResponseFor<RcGenerateDeeplinkResponse> =
            generateDeeplink(params, RequestOptions.none())

        /** @see generateDeeplink */
        @MustBeClosed
        fun generateDeeplink(
            agentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RcGenerateDeeplinkResponse> =
            generateDeeplink(agentId, RcGenerateDeeplinkParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /messages/rcs`, but is otherwise the same as
         * [RcService.send].
         */
        @MustBeClosed
        fun send(params: RcSendParams): HttpResponseFor<RcSendResponse> =
            send(params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(
            params: RcSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RcSendResponse>
    }
}
