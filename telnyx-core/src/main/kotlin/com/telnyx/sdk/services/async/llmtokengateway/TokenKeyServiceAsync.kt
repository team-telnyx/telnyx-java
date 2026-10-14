// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.llmtokengateway

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.llmtokengateway.tokenkeys.TokenKeyCreateParams
import com.telnyx.sdk.models.llmtokengateway.tokenkeys.TokenKeyDeleteParams
import com.telnyx.sdk.models.llmtokengateway.tokenkeys.TokenKeyListPageAsync
import com.telnyx.sdk.models.llmtokengateway.tokenkeys.TokenKeyListParams
import com.telnyx.sdk.models.llmtokengateway.tokenkeys.TokenKeyResponse
import com.telnyx.sdk.models.llmtokengateway.tokenkeys.TokenKeyRetrieveParams
import com.telnyx.sdk.models.llmtokengateway.tokenkeys.TokenKeyUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage and report AI Gateway usage. */
interface TokenKeyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TokenKeyServiceAsync

    /**
     * Create gateway token key within the authenticated Telnyx account. Foreign and unknown
     * resource IDs return the same 404 response. The token secret is returned only on the original
     * create response. A replay returns metadata without the secret. Provisioning is advisory;
     * ready is not a guarantee of inference availability.
     */
    fun create(params: TokenKeyCreateParams): CompletableFuture<TokenKeyResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TokenKeyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenKeyResponse>

    /**
     * Get gateway token key within the authenticated Telnyx account. Foreign and unknown resource
     * IDs return the same 404 response.
     */
    fun retrieve(id: String): CompletableFuture<TokenKeyResponse> =
        retrieve(id, TokenKeyRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TokenKeyRetrieveParams = TokenKeyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenKeyResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TokenKeyRetrieveParams = TokenKeyRetrieveParams.none(),
    ): CompletableFuture<TokenKeyResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TokenKeyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenKeyResponse>

    /** @see retrieve */
    fun retrieve(params: TokenKeyRetrieveParams): CompletableFuture<TokenKeyResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<TokenKeyResponse> =
        retrieve(id, TokenKeyRetrieveParams.none(), requestOptions)

    /**
     * Update gateway token key within the authenticated Telnyx account. Foreign and unknown
     * resource IDs return the same 404 response. Omitted fields are preserved. Null clears
     * max_parallel_requests; null resets budget and rate limits to their maximum. A stale If-Match
     * returns 412.
     */
    fun update(id: String, params: TokenKeyUpdateParams): CompletableFuture<TokenKeyResponse> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: TokenKeyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenKeyResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: TokenKeyUpdateParams): CompletableFuture<TokenKeyResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TokenKeyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenKeyResponse>

    /**
     * List gateway token keys within the authenticated Telnyx account. Foreign and unknown resource
     * IDs return the same 404 response.
     */
    fun list(): CompletableFuture<TokenKeyListPageAsync> = list(TokenKeyListParams.none())

    /** @see list */
    fun list(
        params: TokenKeyListParams = TokenKeyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenKeyListPageAsync>

    /** @see list */
    fun list(
        params: TokenKeyListParams = TokenKeyListParams.none()
    ): CompletableFuture<TokenKeyListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TokenKeyListPageAsync> =
        list(TokenKeyListParams.none(), requestOptions)

    /**
     * Revoke this token key. Acknowledged revocation blocks new admissions with the key; requests
     * already admitted may complete. Historical usage attribution is retained. Other keys in the
     * group are unchanged.
     */
    fun delete(id: String, params: TokenKeyDeleteParams): CompletableFuture<Void?> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: TokenKeyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: TokenKeyDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TokenKeyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [TokenKeyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TokenKeyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /llm_token_gateway/token_keys`, but is otherwise
         * the same as [TokenKeyServiceAsync.create].
         */
        fun create(
            params: TokenKeyCreateParams
        ): CompletableFuture<HttpResponseFor<TokenKeyResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TokenKeyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenKeyResponse>>

        /**
         * Returns a raw HTTP response for `get /llm_token_gateway/token_keys/{id}`, but is
         * otherwise the same as [TokenKeyServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<TokenKeyResponse>> =
            retrieve(id, TokenKeyRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TokenKeyRetrieveParams = TokenKeyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenKeyResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TokenKeyRetrieveParams = TokenKeyRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TokenKeyResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TokenKeyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenKeyResponse>>

        /** @see retrieve */
        fun retrieve(
            params: TokenKeyRetrieveParams
        ): CompletableFuture<HttpResponseFor<TokenKeyResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TokenKeyResponse>> =
            retrieve(id, TokenKeyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /llm_token_gateway/token_keys/{id}`, but is
         * otherwise the same as [TokenKeyServiceAsync.update].
         */
        fun update(
            id: String,
            params: TokenKeyUpdateParams,
        ): CompletableFuture<HttpResponseFor<TokenKeyResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: TokenKeyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenKeyResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: TokenKeyUpdateParams
        ): CompletableFuture<HttpResponseFor<TokenKeyResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TokenKeyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenKeyResponse>>

        /**
         * Returns a raw HTTP response for `get /llm_token_gateway/token_keys`, but is otherwise the
         * same as [TokenKeyServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TokenKeyListPageAsync>> =
            list(TokenKeyListParams.none())

        /** @see list */
        fun list(
            params: TokenKeyListParams = TokenKeyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenKeyListPageAsync>>

        /** @see list */
        fun list(
            params: TokenKeyListParams = TokenKeyListParams.none()
        ): CompletableFuture<HttpResponseFor<TokenKeyListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TokenKeyListPageAsync>> =
            list(TokenKeyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /llm_token_gateway/token_keys/{id}`, but is
         * otherwise the same as [TokenKeyServiceAsync.delete].
         */
        fun delete(id: String, params: TokenKeyDeleteParams): CompletableFuture<HttpResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            params: TokenKeyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(params: TokenKeyDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TokenKeyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
