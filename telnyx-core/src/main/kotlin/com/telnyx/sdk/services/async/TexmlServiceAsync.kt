// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.texml.TexmlInitiateAiCallParams
import com.telnyx.sdk.models.texml.TexmlInitiateAiCallResponse
import com.telnyx.sdk.models.texml.TexmlSecretsParams
import com.telnyx.sdk.models.texml.TexmlSecretsResponse
import com.telnyx.sdk.services.async.texml.AccountServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** TeXML REST Commands */
interface TexmlServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TexmlServiceAsync

    /** TeXML REST Commands */
    fun accounts(): AccountServiceAsync

    /**
     * Initiate an outbound AI call with warm-up support. Validates parameters, builds an internal
     * TeXML with an AI Assistant configuration, encodes instructions into client state, and calls
     * the dial API. The Twiml, Texml, and Url parameters are not allowed and will result in a 422
     * error.
     */
    fun initiateAiCall(
        connectionId: String,
        params: TexmlInitiateAiCallParams,
    ): CompletableFuture<TexmlInitiateAiCallResponse> =
        initiateAiCall(connectionId, params, RequestOptions.none())

    /** @see initiateAiCall */
    fun initiateAiCall(
        connectionId: String,
        params: TexmlInitiateAiCallParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TexmlInitiateAiCallResponse> =
        initiateAiCall(params.toBuilder().connectionId(connectionId).build(), requestOptions)

    /** @see initiateAiCall */
    fun initiateAiCall(
        params: TexmlInitiateAiCallParams
    ): CompletableFuture<TexmlInitiateAiCallResponse> =
        initiateAiCall(params, RequestOptions.none())

    /** @see initiateAiCall */
    fun initiateAiCall(
        params: TexmlInitiateAiCallParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TexmlInitiateAiCallResponse>

    /**
     * Create a TeXML secret which can be later used as a Dynamic Parameter for TeXML when using
     * Mustache Templates in your TeXML. In your TeXML you will be able to use your secret name, and
     * this name will be replaced by the actual secret value when processing the TeXML on Telnyx
     * side. The secrets are not visible in any logs.
     */
    fun secrets(params: TexmlSecretsParams): CompletableFuture<TexmlSecretsResponse> =
        secrets(params, RequestOptions.none())

    /** @see secrets */
    fun secrets(
        params: TexmlSecretsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TexmlSecretsResponse>

    /** A view of [TexmlServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TexmlServiceAsync.WithRawResponse

        /** TeXML REST Commands */
        fun accounts(): AccountServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /texml/ai_calls/{connection_id}`, but is otherwise
         * the same as [TexmlServiceAsync.initiateAiCall].
         */
        fun initiateAiCall(
            connectionId: String,
            params: TexmlInitiateAiCallParams,
        ): CompletableFuture<HttpResponseFor<TexmlInitiateAiCallResponse>> =
            initiateAiCall(connectionId, params, RequestOptions.none())

        /** @see initiateAiCall */
        fun initiateAiCall(
            connectionId: String,
            params: TexmlInitiateAiCallParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TexmlInitiateAiCallResponse>> =
            initiateAiCall(params.toBuilder().connectionId(connectionId).build(), requestOptions)

        /** @see initiateAiCall */
        fun initiateAiCall(
            params: TexmlInitiateAiCallParams
        ): CompletableFuture<HttpResponseFor<TexmlInitiateAiCallResponse>> =
            initiateAiCall(params, RequestOptions.none())

        /** @see initiateAiCall */
        fun initiateAiCall(
            params: TexmlInitiateAiCallParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TexmlInitiateAiCallResponse>>

        /**
         * Returns a raw HTTP response for `post /texml/secrets`, but is otherwise the same as
         * [TexmlServiceAsync.secrets].
         */
        fun secrets(
            params: TexmlSecretsParams
        ): CompletableFuture<HttpResponseFor<TexmlSecretsResponse>> =
            secrets(params, RequestOptions.none())

        /** @see secrets */
        fun secrets(
            params: TexmlSecretsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TexmlSecretsResponse>>
    }
}
