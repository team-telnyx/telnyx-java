// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.llmtokengateway

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.llmtokengateway.tokenkeys.TokenKeyCreateParams
import com.telnyx.sdk.models.llmtokengateway.tokenkeys.TokenKeyDeleteParams
import com.telnyx.sdk.models.llmtokengateway.tokenkeys.TokenKeyListPage
import com.telnyx.sdk.models.llmtokengateway.tokenkeys.TokenKeyListParams
import com.telnyx.sdk.models.llmtokengateway.tokenkeys.TokenKeyResponse
import com.telnyx.sdk.models.llmtokengateway.tokenkeys.TokenKeyRetrieveParams
import com.telnyx.sdk.models.llmtokengateway.tokenkeys.TokenKeyUpdateParams
import java.util.function.Consumer

/** Manage and report AI Gateway usage. */
interface TokenKeyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TokenKeyService

    /**
     * Create gateway token key within the authenticated Telnyx account. Foreign and unknown
     * resource IDs return the same 404 response. The token secret is returned only on the original
     * create response. A replay returns metadata without the secret. Provisioning is advisory;
     * ready is not a guarantee of inference availability.
     */
    fun create(params: TokenKeyCreateParams): TokenKeyResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TokenKeyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenKeyResponse

    /**
     * Get gateway token key within the authenticated Telnyx account. Foreign and unknown resource
     * IDs return the same 404 response.
     */
    fun retrieve(id: String): TokenKeyResponse = retrieve(id, TokenKeyRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TokenKeyRetrieveParams = TokenKeyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenKeyResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TokenKeyRetrieveParams = TokenKeyRetrieveParams.none(),
    ): TokenKeyResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TokenKeyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenKeyResponse

    /** @see retrieve */
    fun retrieve(params: TokenKeyRetrieveParams): TokenKeyResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): TokenKeyResponse =
        retrieve(id, TokenKeyRetrieveParams.none(), requestOptions)

    /**
     * Update gateway token key within the authenticated Telnyx account. Foreign and unknown
     * resource IDs return the same 404 response. Omitted fields are preserved. Null clears
     * max_parallel_requests; null resets budget and rate limits to their maximum. A stale If-Match
     * returns 412.
     */
    fun update(id: String, params: TokenKeyUpdateParams): TokenKeyResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: TokenKeyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenKeyResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: TokenKeyUpdateParams): TokenKeyResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TokenKeyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenKeyResponse

    /**
     * List gateway token keys within the authenticated Telnyx account. Foreign and unknown resource
     * IDs return the same 404 response.
     */
    fun list(): TokenKeyListPage = list(TokenKeyListParams.none())

    /** @see list */
    fun list(
        params: TokenKeyListParams = TokenKeyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenKeyListPage

    /** @see list */
    fun list(params: TokenKeyListParams = TokenKeyListParams.none()): TokenKeyListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): TokenKeyListPage =
        list(TokenKeyListParams.none(), requestOptions)

    /**
     * Revoke this token key. Acknowledged revocation blocks new admissions with the key; requests
     * already admitted may complete. Historical usage attribution is retained. Other keys in the
     * group are unchanged.
     */
    fun delete(id: String, params: TokenKeyDeleteParams) = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: TokenKeyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: TokenKeyDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: TokenKeyDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [TokenKeyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TokenKeyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /llm_token_gateway/token_keys`, but is otherwise
         * the same as [TokenKeyService.create].
         */
        @MustBeClosed
        fun create(params: TokenKeyCreateParams): HttpResponseFor<TokenKeyResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TokenKeyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenKeyResponse>

        /**
         * Returns a raw HTTP response for `get /llm_token_gateway/token_keys/{id}`, but is
         * otherwise the same as [TokenKeyService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<TokenKeyResponse> =
            retrieve(id, TokenKeyRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TokenKeyRetrieveParams = TokenKeyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenKeyResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TokenKeyRetrieveParams = TokenKeyRetrieveParams.none(),
        ): HttpResponseFor<TokenKeyResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TokenKeyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenKeyResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: TokenKeyRetrieveParams): HttpResponseFor<TokenKeyResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TokenKeyResponse> =
            retrieve(id, TokenKeyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /llm_token_gateway/token_keys/{id}`, but is
         * otherwise the same as [TokenKeyService.update].
         */
        @MustBeClosed
        fun update(id: String, params: TokenKeyUpdateParams): HttpResponseFor<TokenKeyResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: TokenKeyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenKeyResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: TokenKeyUpdateParams): HttpResponseFor<TokenKeyResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: TokenKeyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenKeyResponse>

        /**
         * Returns a raw HTTP response for `get /llm_token_gateway/token_keys`, but is otherwise the
         * same as [TokenKeyService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<TokenKeyListPage> = list(TokenKeyListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TokenKeyListParams = TokenKeyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenKeyListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: TokenKeyListParams = TokenKeyListParams.none()
        ): HttpResponseFor<TokenKeyListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TokenKeyListPage> =
            list(TokenKeyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /llm_token_gateway/token_keys/{id}`, but is
         * otherwise the same as [TokenKeyService.delete].
         */
        @MustBeClosed
        fun delete(id: String, params: TokenKeyDeleteParams): HttpResponse =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: TokenKeyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: TokenKeyDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TokenKeyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
