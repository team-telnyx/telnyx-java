// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.storage.kvs

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.storage.kvs.keys.KeyDeleteParams
import com.telnyx.sdk.models.storage.kvs.keys.KeyListParams
import com.telnyx.sdk.models.storage.kvs.keys.KeyListResponse
import com.telnyx.sdk.models.storage.kvs.keys.KeyRetrieveParams
import com.telnyx.sdk.models.storage.kvs.keys.KeyUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Read and write keys within a KV namespace */
interface KeyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): KeyServiceAsync

    /**
     * Returns the raw stored value for a key. The response body is the value exactly as it was
     * written; the `Content-Type` header echoes the value's stored content type (defaults to
     * `application/octet-stream`).
     */
    fun retrieve(key: String, params: KeyRetrieveParams): CompletableFuture<HttpResponse> =
        retrieve(key, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        key: String,
        params: KeyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        retrieve(params.toBuilder().key(key).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: KeyRetrieveParams): CompletableFuture<HttpResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: KeyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /**
     * Creates or replaces the value for a key. The request body is stored verbatim as the value —
     * no base64, no JSON envelope — up to 1 MiB. The request's `Content-Type` header is stored with
     * the value and echoed back on retrieval. Returns `201` when the key is created and `200` when
     * an existing key is updated.
     */
    fun update(key: String, params: KeyUpdateParams): CompletableFuture<Void?> =
        update(key, params, RequestOptions.none())

    /** @see update */
    fun update(
        key: String,
        params: KeyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().key(key).build(), requestOptions)

    /** @see update */
    fun update(params: KeyUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: KeyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Lists the keys in a namespace. Returns key names and metadata only, never values. Results are
     * paginated with `limit` and an opaque `cursor`.
     */
    fun list(id: String): CompletableFuture<KeyListResponse> = list(id, KeyListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: KeyListParams = KeyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<KeyListResponse> = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: KeyListParams = KeyListParams.none(),
    ): CompletableFuture<KeyListResponse> = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: KeyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<KeyListResponse>

    /** @see list */
    fun list(params: KeyListParams): CompletableFuture<KeyListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): CompletableFuture<KeyListResponse> =
        list(id, KeyListParams.none(), requestOptions)

    /**
     * Deletes a key. Idempotent: deleting a key that does not exist still succeeds. The namespace
     * itself must exist and be provisioned.
     */
    fun delete(key: String, params: KeyDeleteParams): CompletableFuture<Void?> =
        delete(key, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        key: String,
        params: KeyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().key(key).build(), requestOptions)

    /** @see delete */
    fun delete(params: KeyDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: KeyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** A view of [KeyServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): KeyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /storage/kvs/{id}/keys/{key}`, but is otherwise the
         * same as [KeyServiceAsync.retrieve].
         */
        fun retrieve(key: String, params: KeyRetrieveParams): CompletableFuture<HttpResponse> =
            retrieve(key, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            key: String,
            params: KeyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieve(params.toBuilder().key(key).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(params: KeyRetrieveParams): CompletableFuture<HttpResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: KeyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /storage/kvs/{id}/keys/{key}`, but is otherwise the
         * same as [KeyServiceAsync.update].
         */
        fun update(key: String, params: KeyUpdateParams): CompletableFuture<HttpResponse> =
            update(key, params, RequestOptions.none())

        /** @see update */
        fun update(
            key: String,
            params: KeyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().key(key).build(), requestOptions)

        /** @see update */
        fun update(params: KeyUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: KeyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /storage/kvs/{id}/keys`, but is otherwise the same
         * as [KeyServiceAsync.list].
         */
        fun list(id: String): CompletableFuture<HttpResponseFor<KeyListResponse>> =
            list(id, KeyListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: KeyListParams = KeyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<KeyListResponse>> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: KeyListParams = KeyListParams.none(),
        ): CompletableFuture<HttpResponseFor<KeyListResponse>> =
            list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: KeyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<KeyListResponse>>

        /** @see list */
        fun list(params: KeyListParams): CompletableFuture<HttpResponseFor<KeyListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<KeyListResponse>> =
            list(id, KeyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /storage/kvs/{id}/keys/{key}`, but is otherwise
         * the same as [KeyServiceAsync.delete].
         */
        fun delete(key: String, params: KeyDeleteParams): CompletableFuture<HttpResponse> =
            delete(key, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            key: String,
            params: KeyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().key(key).build(), requestOptions)

        /** @see delete */
        fun delete(params: KeyDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: KeyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
