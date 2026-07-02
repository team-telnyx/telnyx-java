// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.storage

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.storage.kvs.KvCreateParams
import com.telnyx.sdk.models.storage.kvs.KvDeleteParams
import com.telnyx.sdk.models.storage.kvs.KvListPageAsync
import com.telnyx.sdk.models.storage.kvs.KvListParams
import com.telnyx.sdk.models.storage.kvs.KvNamespaceResponseWrapper
import com.telnyx.sdk.models.storage.kvs.KvRetrieveParams
import com.telnyx.sdk.services.async.storage.kvs.KeyServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage KV storage namespaces */
interface KvServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): KvServiceAsync

    /** Read and write keys within a KV namespace */
    fun keys(): KeyServiceAsync

    /**
     * Creates a new KV namespace. Provisioning is asynchronous: the namespace is returned with
     * status `pending` and becomes usable once it reaches `provision_ok`.
     */
    fun create(params: KvCreateParams): CompletableFuture<KvNamespaceResponseWrapper> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: KvCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<KvNamespaceResponseWrapper>

    /** Retrieves a KV namespace by its ID, including its provisioning status. */
    fun retrieve(id: String): CompletableFuture<KvNamespaceResponseWrapper> =
        retrieve(id, KvRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: KvRetrieveParams = KvRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<KvNamespaceResponseWrapper> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: KvRetrieveParams = KvRetrieveParams.none(),
    ): CompletableFuture<KvNamespaceResponseWrapper> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: KvRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<KvNamespaceResponseWrapper>

    /** @see retrieve */
    fun retrieve(params: KvRetrieveParams): CompletableFuture<KvNamespaceResponseWrapper> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<KvNamespaceResponseWrapper> =
        retrieve(id, KvRetrieveParams.none(), requestOptions)

    /**
     * Lists the KV namespaces for the authenticated user's organization. Results use page-based
     * pagination (`page[number]`/`page[size]`).
     */
    fun list(): CompletableFuture<KvListPageAsync> = list(KvListParams.none())

    /** @see list */
    fun list(
        params: KvListParams = KvListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<KvListPageAsync>

    /** @see list */
    fun list(params: KvListParams = KvListParams.none()): CompletableFuture<KvListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<KvListPageAsync> =
        list(KvListParams.none(), requestOptions)

    /**
     * Deletes a KV namespace and all of the keys it contains. Deletion is asynchronous: the
     * namespace is returned with status `deleting`. Deleting a namespace whose deletion is already
     * in progress returns a `409`.
     */
    fun delete(id: String): CompletableFuture<KvNamespaceResponseWrapper> =
        delete(id, KvDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: KvDeleteParams = KvDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<KvNamespaceResponseWrapper> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: KvDeleteParams = KvDeleteParams.none(),
    ): CompletableFuture<KvNamespaceResponseWrapper> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: KvDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<KvNamespaceResponseWrapper>

    /** @see delete */
    fun delete(params: KvDeleteParams): CompletableFuture<KvNamespaceResponseWrapper> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<KvNamespaceResponseWrapper> =
        delete(id, KvDeleteParams.none(), requestOptions)

    /** A view of [KvServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): KvServiceAsync.WithRawResponse

        /** Read and write keys within a KV namespace */
        fun keys(): KeyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /storage/kvs`, but is otherwise the same as
         * [KvServiceAsync.create].
         */
        fun create(
            params: KvCreateParams
        ): CompletableFuture<HttpResponseFor<KvNamespaceResponseWrapper>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: KvCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<KvNamespaceResponseWrapper>>

        /**
         * Returns a raw HTTP response for `get /storage/kvs/{id}`, but is otherwise the same as
         * [KvServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<KvNamespaceResponseWrapper>> =
            retrieve(id, KvRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: KvRetrieveParams = KvRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<KvNamespaceResponseWrapper>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: KvRetrieveParams = KvRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<KvNamespaceResponseWrapper>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: KvRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<KvNamespaceResponseWrapper>>

        /** @see retrieve */
        fun retrieve(
            params: KvRetrieveParams
        ): CompletableFuture<HttpResponseFor<KvNamespaceResponseWrapper>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<KvNamespaceResponseWrapper>> =
            retrieve(id, KvRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /storage/kvs`, but is otherwise the same as
         * [KvServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<KvListPageAsync>> = list(KvListParams.none())

        /** @see list */
        fun list(
            params: KvListParams = KvListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<KvListPageAsync>>

        /** @see list */
        fun list(
            params: KvListParams = KvListParams.none()
        ): CompletableFuture<HttpResponseFor<KvListPageAsync>> = list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<KvListPageAsync>> =
            list(KvListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /storage/kvs/{id}`, but is otherwise the same as
         * [KvServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<KvNamespaceResponseWrapper>> =
            delete(id, KvDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: KvDeleteParams = KvDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<KvNamespaceResponseWrapper>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: KvDeleteParams = KvDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<KvNamespaceResponseWrapper>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: KvDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<KvNamespaceResponseWrapper>>

        /** @see delete */
        fun delete(
            params: KvDeleteParams
        ): CompletableFuture<HttpResponseFor<KvNamespaceResponseWrapper>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<KvNamespaceResponseWrapper>> =
            delete(id, KvDeleteParams.none(), requestOptions)
    }
}
