// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.llmtokengateway

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.llmtokengateway.tokengroups.TokenGroupCreateParams
import com.telnyx.sdk.models.llmtokengateway.tokengroups.TokenGroupDeleteParams
import com.telnyx.sdk.models.llmtokengateway.tokengroups.TokenGroupListPageAsync
import com.telnyx.sdk.models.llmtokengateway.tokengroups.TokenGroupListParams
import com.telnyx.sdk.models.llmtokengateway.tokengroups.TokenGroupResponse
import com.telnyx.sdk.models.llmtokengateway.tokengroups.TokenGroupRetrieveParams
import com.telnyx.sdk.models.llmtokengateway.tokengroups.TokenGroupUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage and report AI Gateway usage. */
interface TokenGroupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TokenGroupServiceAsync

    /**
     * Create gateway token group within the authenticated Telnyx account. Foreign and unknown
     * resource IDs return the same 404 response.
     */
    fun create(params: TokenGroupCreateParams): CompletableFuture<TokenGroupResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TokenGroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenGroupResponse>

    /**
     * Get gateway token group within the authenticated Telnyx account. Foreign and unknown resource
     * IDs return the same 404 response.
     */
    fun retrieve(id: String): CompletableFuture<TokenGroupResponse> =
        retrieve(id, TokenGroupRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TokenGroupRetrieveParams = TokenGroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenGroupResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TokenGroupRetrieveParams = TokenGroupRetrieveParams.none(),
    ): CompletableFuture<TokenGroupResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TokenGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenGroupResponse>

    /** @see retrieve */
    fun retrieve(params: TokenGroupRetrieveParams): CompletableFuture<TokenGroupResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TokenGroupResponse> =
        retrieve(id, TokenGroupRetrieveParams.none(), requestOptions)

    /**
     * Update gateway token group within the authenticated Telnyx account. Foreign and unknown
     * resource IDs return the same 404 response. Omitted fields are preserved. Null clears the
     * optional concurrency, fallback and retry settings. A stale If-Match returns 412; read the
     * resource again before updating.
     */
    fun update(id: String, params: TokenGroupUpdateParams): CompletableFuture<TokenGroupResponse> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: TokenGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenGroupResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: TokenGroupUpdateParams): CompletableFuture<TokenGroupResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TokenGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenGroupResponse>

    /**
     * List gateway token groups within the authenticated Telnyx account. Foreign and unknown
     * resource IDs return the same 404 response.
     */
    fun list(): CompletableFuture<TokenGroupListPageAsync> = list(TokenGroupListParams.none())

    /** @see list */
    fun list(
        params: TokenGroupListParams = TokenGroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenGroupListPageAsync>

    /** @see list */
    fun list(
        params: TokenGroupListParams = TokenGroupListParams.none()
    ): CompletableFuture<TokenGroupListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TokenGroupListPageAsync> =
        list(TokenGroupListParams.none(), requestOptions)

    /**
     * Revoke resource and its keys atomically; retain historical attribution, never detach into an
     * ungoverned service key.
     */
    fun delete(id: String, params: TokenGroupDeleteParams): CompletableFuture<Void?> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: TokenGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: TokenGroupDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TokenGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [TokenGroupServiceAsync] that provides access to raw HTTP responses for each
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
        ): TokenGroupServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /llm_token_gateway/token_groups`, but is otherwise
         * the same as [TokenGroupServiceAsync.create].
         */
        fun create(
            params: TokenGroupCreateParams
        ): CompletableFuture<HttpResponseFor<TokenGroupResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TokenGroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenGroupResponse>>

        /**
         * Returns a raw HTTP response for `get /llm_token_gateway/token_groups/{id}`, but is
         * otherwise the same as [TokenGroupServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<TokenGroupResponse>> =
            retrieve(id, TokenGroupRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TokenGroupRetrieveParams = TokenGroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenGroupResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TokenGroupRetrieveParams = TokenGroupRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TokenGroupResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TokenGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenGroupResponse>>

        /** @see retrieve */
        fun retrieve(
            params: TokenGroupRetrieveParams
        ): CompletableFuture<HttpResponseFor<TokenGroupResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TokenGroupResponse>> =
            retrieve(id, TokenGroupRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /llm_token_gateway/token_groups/{id}`, but is
         * otherwise the same as [TokenGroupServiceAsync.update].
         */
        fun update(
            id: String,
            params: TokenGroupUpdateParams,
        ): CompletableFuture<HttpResponseFor<TokenGroupResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: TokenGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenGroupResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: TokenGroupUpdateParams
        ): CompletableFuture<HttpResponseFor<TokenGroupResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TokenGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenGroupResponse>>

        /**
         * Returns a raw HTTP response for `get /llm_token_gateway/token_groups`, but is otherwise
         * the same as [TokenGroupServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TokenGroupListPageAsync>> =
            list(TokenGroupListParams.none())

        /** @see list */
        fun list(
            params: TokenGroupListParams = TokenGroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenGroupListPageAsync>>

        /** @see list */
        fun list(
            params: TokenGroupListParams = TokenGroupListParams.none()
        ): CompletableFuture<HttpResponseFor<TokenGroupListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TokenGroupListPageAsync>> =
            list(TokenGroupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /llm_token_gateway/token_groups/{id}`, but is
         * otherwise the same as [TokenGroupServiceAsync.delete].
         */
        fun delete(id: String, params: TokenGroupDeleteParams): CompletableFuture<HttpResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            params: TokenGroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(params: TokenGroupDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TokenGroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
