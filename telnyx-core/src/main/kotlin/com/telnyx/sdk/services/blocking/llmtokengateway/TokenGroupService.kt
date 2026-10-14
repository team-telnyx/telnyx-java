// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.llmtokengateway

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.llmtokengateway.tokengroups.TokenGroupCreateParams
import com.telnyx.sdk.models.llmtokengateway.tokengroups.TokenGroupDeleteParams
import com.telnyx.sdk.models.llmtokengateway.tokengroups.TokenGroupListPage
import com.telnyx.sdk.models.llmtokengateway.tokengroups.TokenGroupListParams
import com.telnyx.sdk.models.llmtokengateway.tokengroups.TokenGroupResponse
import com.telnyx.sdk.models.llmtokengateway.tokengroups.TokenGroupRetrieveParams
import com.telnyx.sdk.models.llmtokengateway.tokengroups.TokenGroupUpdateParams
import java.util.function.Consumer

/** Manage and report AI Gateway usage. */
interface TokenGroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TokenGroupService

    /**
     * Create gateway token group within the authenticated Telnyx account. Foreign and unknown
     * resource IDs return the same 404 response.
     */
    fun create(params: TokenGroupCreateParams): TokenGroupResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TokenGroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenGroupResponse

    /**
     * Get gateway token group within the authenticated Telnyx account. Foreign and unknown resource
     * IDs return the same 404 response.
     */
    fun retrieve(id: String): TokenGroupResponse = retrieve(id, TokenGroupRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TokenGroupRetrieveParams = TokenGroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenGroupResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TokenGroupRetrieveParams = TokenGroupRetrieveParams.none(),
    ): TokenGroupResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TokenGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenGroupResponse

    /** @see retrieve */
    fun retrieve(params: TokenGroupRetrieveParams): TokenGroupResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): TokenGroupResponse =
        retrieve(id, TokenGroupRetrieveParams.none(), requestOptions)

    /**
     * Update gateway token group within the authenticated Telnyx account. Foreign and unknown
     * resource IDs return the same 404 response. Omitted fields are preserved. Null clears the
     * optional concurrency, fallback and retry settings. A stale If-Match returns 412; read the
     * resource again before updating.
     */
    fun update(id: String, params: TokenGroupUpdateParams): TokenGroupResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: TokenGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenGroupResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: TokenGroupUpdateParams): TokenGroupResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TokenGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenGroupResponse

    /**
     * List gateway token groups within the authenticated Telnyx account. Foreign and unknown
     * resource IDs return the same 404 response.
     */
    fun list(): TokenGroupListPage = list(TokenGroupListParams.none())

    /** @see list */
    fun list(
        params: TokenGroupListParams = TokenGroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenGroupListPage

    /** @see list */
    fun list(params: TokenGroupListParams = TokenGroupListParams.none()): TokenGroupListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): TokenGroupListPage =
        list(TokenGroupListParams.none(), requestOptions)

    /**
     * Revoke resource and its keys atomically; retain historical attribution, never detach into an
     * ungoverned service key.
     */
    fun delete(id: String, params: TokenGroupDeleteParams) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: TokenGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: TokenGroupDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TokenGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [TokenGroupService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TokenGroupService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /llm_token_gateway/token_groups`, but is otherwise
         * the same as [TokenGroupService.create].
         */
        @MustBeClosed
        fun create(params: TokenGroupCreateParams): HttpResponseFor<TokenGroupResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TokenGroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenGroupResponse>

        /**
         * Returns a raw HTTP response for `get /llm_token_gateway/token_groups/{id}`, but is
         * otherwise the same as [TokenGroupService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<TokenGroupResponse> =
            retrieve(id, TokenGroupRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TokenGroupRetrieveParams = TokenGroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenGroupResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TokenGroupRetrieveParams = TokenGroupRetrieveParams.none(),
        ): HttpResponseFor<TokenGroupResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TokenGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenGroupResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: TokenGroupRetrieveParams): HttpResponseFor<TokenGroupResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TokenGroupResponse> =
            retrieve(id, TokenGroupRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /llm_token_gateway/token_groups/{id}`, but is
         * otherwise the same as [TokenGroupService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: TokenGroupUpdateParams,
        ): HttpResponseFor<TokenGroupResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: TokenGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenGroupResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: TokenGroupUpdateParams): HttpResponseFor<TokenGroupResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: TokenGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenGroupResponse>

        /**
         * Returns a raw HTTP response for `get /llm_token_gateway/token_groups`, but is otherwise
         * the same as [TokenGroupService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<TokenGroupListPage> = list(TokenGroupListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TokenGroupListParams = TokenGroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenGroupListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: TokenGroupListParams = TokenGroupListParams.none()
        ): HttpResponseFor<TokenGroupListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TokenGroupListPage> =
            list(TokenGroupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /llm_token_gateway/token_groups/{id}`, but is
         * otherwise the same as [TokenGroupService.delete].
         */
        @MustBeClosed
        fun delete(id: String, params: TokenGroupDeleteParams): HttpResponse =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: TokenGroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: TokenGroupDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TokenGroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
