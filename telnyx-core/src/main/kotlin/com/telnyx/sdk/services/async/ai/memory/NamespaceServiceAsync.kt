// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.memory

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.memory.namespaces.NamespaceCreateParams
import com.telnyx.sdk.models.ai.memory.namespaces.NamespaceCreateResponse
import com.telnyx.sdk.models.ai.memory.namespaces.NamespaceDeleteParams
import com.telnyx.sdk.models.ai.memory.namespaces.NamespaceListParams
import com.telnyx.sdk.models.ai.memory.namespaces.NamespaceListResponse
import com.telnyx.sdk.models.ai.memory.namespaces.NamespaceRetrieveParams
import com.telnyx.sdk.models.ai.memory.namespaces.NamespaceRetrieveResponse
import com.telnyx.sdk.services.async.ai.memory.namespaces.ProfileServiceAsync
import com.telnyx.sdk.services.async.ai.memory.namespaces.SettingServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface NamespaceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NamespaceServiceAsync

    fun profiles(): ProfileServiceAsync

    /** How a namespace's summaries are written. */
    fun settings(): SettingServiceAsync

    /**
     * Create a namespace. An organization can have at most five, `default` among them — a sixth
     * returns `403`.
     */
    fun create(params: NamespaceCreateParams): CompletableFuture<NamespaceCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: NamespaceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NamespaceCreateResponse>

    /**
     * Whether a write has finished. Both `ingest` and `remember` return an `operation_id`, and a
     * memory is not recallable until its operation completes — extraction, embedding and
     * consolidation all run first.
     */
    fun retrieve(
        operationId: String,
        params: NamespaceRetrieveParams,
    ): CompletableFuture<NamespaceRetrieveResponse> =
        retrieve(operationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        operationId: String,
        params: NamespaceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NamespaceRetrieveResponse> =
        retrieve(params.toBuilder().operationId(operationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: NamespaceRetrieveParams): CompletableFuture<NamespaceRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NamespaceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NamespaceRetrieveResponse>

    /** Every namespace in your organization, `default` among them. */
    fun list(): CompletableFuture<NamespaceListResponse> = list(NamespaceListParams.none())

    /** @see list */
    fun list(
        params: NamespaceListParams = NamespaceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NamespaceListResponse>

    /** @see list */
    fun list(
        params: NamespaceListParams = NamespaceListParams.none()
    ): CompletableFuture<NamespaceListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<NamespaceListResponse> =
        list(NamespaceListParams.none(), requestOptions)

    /**
     * Delete a namespace and every profile and memory in it. `default` cannot be deleted. This
     * cannot be undone.
     */
    fun delete(namespace: String): CompletableFuture<Void?> =
        delete(namespace, NamespaceDeleteParams.none())

    /** @see delete */
    fun delete(
        namespace: String,
        params: NamespaceDeleteParams = NamespaceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().namespace(namespace).build(), requestOptions)

    /** @see delete */
    fun delete(
        namespace: String,
        params: NamespaceDeleteParams = NamespaceDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(namespace, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: NamespaceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: NamespaceDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(namespace: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(namespace, NamespaceDeleteParams.none(), requestOptions)

    /**
     * A view of [NamespaceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NamespaceServiceAsync.WithRawResponse

        fun profiles(): ProfileServiceAsync.WithRawResponse

        /** How a namespace's summaries are written. */
        fun settings(): SettingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/memory/namespaces`, but is otherwise the same
         * as [NamespaceServiceAsync.create].
         */
        fun create(
            params: NamespaceCreateParams
        ): CompletableFuture<HttpResponseFor<NamespaceCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: NamespaceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NamespaceCreateResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /ai/memory/namespaces/{namespace}/operations/{operation_id}`, but is otherwise the same
         * as [NamespaceServiceAsync.retrieve].
         */
        fun retrieve(
            operationId: String,
            params: NamespaceRetrieveParams,
        ): CompletableFuture<HttpResponseFor<NamespaceRetrieveResponse>> =
            retrieve(operationId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            operationId: String,
            params: NamespaceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NamespaceRetrieveResponse>> =
            retrieve(params.toBuilder().operationId(operationId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: NamespaceRetrieveParams
        ): CompletableFuture<HttpResponseFor<NamespaceRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: NamespaceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NamespaceRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `get /ai/memory/namespaces`, but is otherwise the same as
         * [NamespaceServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<NamespaceListResponse>> =
            list(NamespaceListParams.none())

        /** @see list */
        fun list(
            params: NamespaceListParams = NamespaceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NamespaceListResponse>>

        /** @see list */
        fun list(
            params: NamespaceListParams = NamespaceListParams.none()
        ): CompletableFuture<HttpResponseFor<NamespaceListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<NamespaceListResponse>> =
            list(NamespaceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/memory/namespaces/{namespace}`, but is
         * otherwise the same as [NamespaceServiceAsync.delete].
         */
        fun delete(namespace: String): CompletableFuture<HttpResponse> =
            delete(namespace, NamespaceDeleteParams.none())

        /** @see delete */
        fun delete(
            namespace: String,
            params: NamespaceDeleteParams = NamespaceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().namespace(namespace).build(), requestOptions)

        /** @see delete */
        fun delete(
            namespace: String,
            params: NamespaceDeleteParams = NamespaceDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(namespace, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: NamespaceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: NamespaceDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            namespace: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(namespace, NamespaceDeleteParams.none(), requestOptions)
    }
}
