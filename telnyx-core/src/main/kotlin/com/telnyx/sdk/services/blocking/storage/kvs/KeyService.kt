// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.storage.kvs

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.storage.kvs.keys.KeyDeleteParams
import com.telnyx.sdk.models.storage.kvs.keys.KeyListParams
import com.telnyx.sdk.models.storage.kvs.keys.KeyListResponse
import com.telnyx.sdk.models.storage.kvs.keys.KeyRetrieveParams
import com.telnyx.sdk.models.storage.kvs.keys.KeyUpdateParams
import java.util.function.Consumer

/** Read and write keys within a KV namespace */
interface KeyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): KeyService

    /**
     * Returns the raw stored value for a key. The response body is the value exactly as it was
     * written; the `Content-Type` header echoes the value's stored content type (defaults to
     * `application/octet-stream`).
     */
    @MustBeClosed
    fun retrieve(key: String, params: KeyRetrieveParams): HttpResponse =
        retrieve(key, params, RequestOptions.none())

    /** @see retrieve */
    @MustBeClosed
    fun retrieve(
        key: String,
        params: KeyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = retrieve(params.toBuilder().key(key).build(), requestOptions)

    /** @see retrieve */
    @MustBeClosed
    fun retrieve(params: KeyRetrieveParams): HttpResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    @MustBeClosed
    fun retrieve(
        params: KeyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /**
     * Creates or replaces the value for a key. The request body is stored verbatim as the value —
     * no base64, no JSON envelope — up to 1 MiB. The request's `Content-Type` header is stored with
     * the value and echoed back on retrieval. Returns `201` when the key is created and `200` when
     * an existing key is updated.
     */
    fun update(key: String, params: KeyUpdateParams) = update(key, params, RequestOptions.none())

    /** @see update */
    fun update(
        key: String,
        params: KeyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().key(key).build(), requestOptions)

    /** @see update */
    fun update(params: KeyUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(params: KeyUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Lists the keys in a namespace. Returns key names and metadata only, never values. Results are
     * paginated with `limit` and an opaque `cursor`.
     */
    fun list(id: String): KeyListResponse = list(id, KeyListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: KeyListParams = KeyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KeyListResponse = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(id: String, params: KeyListParams = KeyListParams.none()): KeyListResponse =
        list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: KeyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KeyListResponse

    /** @see list */
    fun list(params: KeyListParams): KeyListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): KeyListResponse =
        list(id, KeyListParams.none(), requestOptions)

    /**
     * Deletes a key. Idempotent: deleting a key that does not exist still succeeds. The namespace
     * itself must exist and be provisioned.
     */
    fun delete(key: String, params: KeyDeleteParams) = delete(key, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        key: String,
        params: KeyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().key(key).build(), requestOptions)

    /** @see delete */
    fun delete(params: KeyDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: KeyDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [KeyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): KeyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /storage/kvs/{id}/keys/{key}`, but is otherwise the
         * same as [KeyService.retrieve].
         */
        @MustBeClosed
        fun retrieve(key: String, params: KeyRetrieveParams): HttpResponse =
            retrieve(key, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            key: String,
            params: KeyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().key(key).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: KeyRetrieveParams): HttpResponse =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: KeyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /storage/kvs/{id}/keys/{key}`, but is otherwise the
         * same as [KeyService.update].
         */
        @MustBeClosed
        fun update(key: String, params: KeyUpdateParams): HttpResponse =
            update(key, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            key: String,
            params: KeyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().key(key).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: KeyUpdateParams): HttpResponse = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: KeyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /storage/kvs/{id}/keys`, but is otherwise the same
         * as [KeyService.list].
         */
        @MustBeClosed
        fun list(id: String): HttpResponseFor<KeyListResponse> = list(id, KeyListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: KeyListParams = KeyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KeyListResponse> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: KeyListParams = KeyListParams.none(),
        ): HttpResponseFor<KeyListResponse> = list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: KeyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KeyListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: KeyListParams): HttpResponseFor<KeyListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(id: String, requestOptions: RequestOptions): HttpResponseFor<KeyListResponse> =
            list(id, KeyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /storage/kvs/{id}/keys/{key}`, but is otherwise
         * the same as [KeyService.delete].
         */
        @MustBeClosed
        fun delete(key: String, params: KeyDeleteParams): HttpResponse =
            delete(key, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            key: String,
            params: KeyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().key(key).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: KeyDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: KeyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
