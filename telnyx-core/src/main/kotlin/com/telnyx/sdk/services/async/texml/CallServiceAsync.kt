// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.texml

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.texml.calls.CallCreateParams
import com.telnyx.sdk.models.texml.calls.CallCreateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** TeXML REST Commands */
interface CallServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallServiceAsync

    /**
     * Initiate an outbound TeXML call using a TeXML application connection ID, not an account SID.
     * Request parameter names are case-sensitive. From and To are required; Texml supplies inline
     * instructions and Url overrides the application XML request URL. When neither is supplied, the
     * application configuration supplies the instructions. The response is a flat call object
     * without a data wrapper.
     */
    fun create(
        connectionId: String,
        params: CallCreateParams,
    ): CompletableFuture<CallCreateResponse> = create(connectionId, params, RequestOptions.none())

    /** @see create */
    fun create(
        connectionId: String,
        params: CallCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallCreateResponse> =
        create(params.toBuilder().connectionId(connectionId).build(), requestOptions)

    /** @see create */
    fun create(params: CallCreateParams): CompletableFuture<CallCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CallCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallCreateResponse>

    /** A view of [CallServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /texml/calls/{connection_id}`, but is otherwise the
         * same as [CallServiceAsync.create].
         */
        fun create(
            connectionId: String,
            params: CallCreateParams,
        ): CompletableFuture<HttpResponseFor<CallCreateResponse>> =
            create(connectionId, params, RequestOptions.none())

        /** @see create */
        fun create(
            connectionId: String,
            params: CallCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallCreateResponse>> =
            create(params.toBuilder().connectionId(connectionId).build(), requestOptions)

        /** @see create */
        fun create(
            params: CallCreateParams
        ): CompletableFuture<HttpResponseFor<CallCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CallCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallCreateResponse>>
    }
}
