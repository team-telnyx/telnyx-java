// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.storage

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.storage.kvs.KvCreateParams
import com.telnyx.sdk.models.storage.kvs.KvDeleteParams
import com.telnyx.sdk.models.storage.kvs.KvListPage
import com.telnyx.sdk.models.storage.kvs.KvListParams
import com.telnyx.sdk.models.storage.kvs.KvNamespaceResponseWrapper
import com.telnyx.sdk.models.storage.kvs.KvRetrieveParams
import com.telnyx.sdk.services.blocking.storage.kvs.KeyService
import java.util.function.Consumer

/** Manage KV storage namespaces */
interface KvService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): KvService

    /** Read and write keys within a KV namespace */
    fun keys(): KeyService

    /**
     * Creates a new KV namespace. Provisioning is asynchronous: the namespace is returned with
     * status `pending` and becomes usable once it reaches `provision_ok`.
     */
    fun create(params: KvCreateParams): KvNamespaceResponseWrapper =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: KvCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KvNamespaceResponseWrapper

    /** Retrieves a KV namespace by its ID, including its provisioning status. */
    fun retrieve(id: String): KvNamespaceResponseWrapper = retrieve(id, KvRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: KvRetrieveParams = KvRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KvNamespaceResponseWrapper = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: KvRetrieveParams = KvRetrieveParams.none(),
    ): KvNamespaceResponseWrapper = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: KvRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KvNamespaceResponseWrapper

    /** @see retrieve */
    fun retrieve(params: KvRetrieveParams): KvNamespaceResponseWrapper =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): KvNamespaceResponseWrapper =
        retrieve(id, KvRetrieveParams.none(), requestOptions)

    /**
     * Lists the KV namespaces for the authenticated user's organization. Results use page-based
     * pagination (`page[number]`/`page[size]`).
     */
    fun list(): KvListPage = list(KvListParams.none())

    /** @see list */
    fun list(
        params: KvListParams = KvListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KvListPage

    /** @see list */
    fun list(params: KvListParams = KvListParams.none()): KvListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): KvListPage = list(KvListParams.none(), requestOptions)

    /**
     * Deletes a KV namespace and all of the keys it contains. Deletion is asynchronous: the
     * namespace is returned with status `deleting`. Deleting a namespace whose deletion is already
     * in progress returns a `409`.
     */
    fun delete(id: String): KvNamespaceResponseWrapper = delete(id, KvDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: KvDeleteParams = KvDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KvNamespaceResponseWrapper = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: KvDeleteParams = KvDeleteParams.none(),
    ): KvNamespaceResponseWrapper = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: KvDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KvNamespaceResponseWrapper

    /** @see delete */
    fun delete(params: KvDeleteParams): KvNamespaceResponseWrapper =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): KvNamespaceResponseWrapper =
        delete(id, KvDeleteParams.none(), requestOptions)

    /** A view of [KvService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): KvService.WithRawResponse

        /** Read and write keys within a KV namespace */
        fun keys(): KeyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /storage/kvs`, but is otherwise the same as
         * [KvService.create].
         */
        @MustBeClosed
        fun create(params: KvCreateParams): HttpResponseFor<KvNamespaceResponseWrapper> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: KvCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KvNamespaceResponseWrapper>

        /**
         * Returns a raw HTTP response for `get /storage/kvs/{id}`, but is otherwise the same as
         * [KvService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<KvNamespaceResponseWrapper> =
            retrieve(id, KvRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: KvRetrieveParams = KvRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KvNamespaceResponseWrapper> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: KvRetrieveParams = KvRetrieveParams.none(),
        ): HttpResponseFor<KvNamespaceResponseWrapper> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: KvRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KvNamespaceResponseWrapper>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: KvRetrieveParams): HttpResponseFor<KvNamespaceResponseWrapper> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KvNamespaceResponseWrapper> =
            retrieve(id, KvRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /storage/kvs`, but is otherwise the same as
         * [KvService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<KvListPage> = list(KvListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: KvListParams = KvListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KvListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: KvListParams = KvListParams.none()): HttpResponseFor<KvListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<KvListPage> =
            list(KvListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /storage/kvs/{id}`, but is otherwise the same as
         * [KvService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<KvNamespaceResponseWrapper> =
            delete(id, KvDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: KvDeleteParams = KvDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KvNamespaceResponseWrapper> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: KvDeleteParams = KvDeleteParams.none(),
        ): HttpResponseFor<KvNamespaceResponseWrapper> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: KvDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KvNamespaceResponseWrapper>

        /** @see delete */
        @MustBeClosed
        fun delete(params: KvDeleteParams): HttpResponseFor<KvNamespaceResponseWrapper> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KvNamespaceResponseWrapper> =
            delete(id, KvDeleteParams.none(), requestOptions)
    }
}
