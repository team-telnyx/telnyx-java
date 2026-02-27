// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.clusters.ClusterComputeParams
import com.telnyx.sdk.models.ai.clusters.ClusterComputeResponse
import com.telnyx.sdk.models.ai.clusters.ClusterDeleteParams
import com.telnyx.sdk.models.ai.clusters.ClusterFetchGraphParams
import com.telnyx.sdk.models.ai.clusters.ClusterListPageAsync
import com.telnyx.sdk.models.ai.clusters.ClusterListParams
import com.telnyx.sdk.models.ai.clusters.ClusterRetrieveParams
import com.telnyx.sdk.models.ai.clusters.ClusterRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Identify common themes and patterns in your embedded documents */
interface ClusterServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClusterServiceAsync

    /** Fetch a cluster */
    fun retrieve(taskId: String): CompletableFuture<ClusterRetrieveResponse> =
        retrieve(taskId, ClusterRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        taskId: String,
        params: ClusterRetrieveParams = ClusterRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ClusterRetrieveResponse> =
        retrieve(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        taskId: String,
        params: ClusterRetrieveParams = ClusterRetrieveParams.none(),
    ): CompletableFuture<ClusterRetrieveResponse> = retrieve(taskId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ClusterRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ClusterRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: ClusterRetrieveParams): CompletableFuture<ClusterRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        taskId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ClusterRetrieveResponse> =
        retrieve(taskId, ClusterRetrieveParams.none(), requestOptions)

    /** List all clusters */
    fun list(): CompletableFuture<ClusterListPageAsync> = list(ClusterListParams.none())

    /** @see list */
    fun list(
        params: ClusterListParams = ClusterListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ClusterListPageAsync>

    /** @see list */
    fun list(
        params: ClusterListParams = ClusterListParams.none()
    ): CompletableFuture<ClusterListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ClusterListPageAsync> =
        list(ClusterListParams.none(), requestOptions)

    /** Delete a cluster */
    fun delete(taskId: String): CompletableFuture<Void?> =
        delete(taskId, ClusterDeleteParams.none())

    /** @see delete */
    fun delete(
        taskId: String,
        params: ClusterDeleteParams = ClusterDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see delete */
    fun delete(
        taskId: String,
        params: ClusterDeleteParams = ClusterDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(taskId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ClusterDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: ClusterDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(taskId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(taskId, ClusterDeleteParams.none(), requestOptions)

    /**
     * Starts a background task to compute how the data in an
     * [embedded storage bucket](https://developers.telnyx.com/api-reference/embeddings/embed-documents)
     * is clustered. This helps identify common themes and patterns in the data.
     */
    fun compute(params: ClusterComputeParams): CompletableFuture<ClusterComputeResponse> =
        compute(params, RequestOptions.none())

    /** @see compute */
    fun compute(
        params: ClusterComputeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ClusterComputeResponse>

    /** Fetch a cluster visualization */
    fun fetchGraph(taskId: String): CompletableFuture<HttpResponse> =
        fetchGraph(taskId, ClusterFetchGraphParams.none())

    /** @see fetchGraph */
    fun fetchGraph(
        taskId: String,
        params: ClusterFetchGraphParams = ClusterFetchGraphParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        fetchGraph(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see fetchGraph */
    fun fetchGraph(
        taskId: String,
        params: ClusterFetchGraphParams = ClusterFetchGraphParams.none(),
    ): CompletableFuture<HttpResponse> = fetchGraph(taskId, params, RequestOptions.none())

    /** @see fetchGraph */
    fun fetchGraph(
        params: ClusterFetchGraphParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see fetchGraph */
    fun fetchGraph(params: ClusterFetchGraphParams): CompletableFuture<HttpResponse> =
        fetchGraph(params, RequestOptions.none())

    /** @see fetchGraph */
    fun fetchGraph(
        taskId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        fetchGraph(taskId, ClusterFetchGraphParams.none(), requestOptions)

    /**
     * A view of [ClusterServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ClusterServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/clusters/{task_id}`, but is otherwise the same
         * as [ClusterServiceAsync.retrieve].
         */
        fun retrieve(taskId: String): CompletableFuture<HttpResponseFor<ClusterRetrieveResponse>> =
            retrieve(taskId, ClusterRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            taskId: String,
            params: ClusterRetrieveParams = ClusterRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ClusterRetrieveResponse>> =
            retrieve(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            taskId: String,
            params: ClusterRetrieveParams = ClusterRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ClusterRetrieveResponse>> =
            retrieve(taskId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ClusterRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ClusterRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ClusterRetrieveParams
        ): CompletableFuture<HttpResponseFor<ClusterRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            taskId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ClusterRetrieveResponse>> =
            retrieve(taskId, ClusterRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/clusters`, but is otherwise the same as
         * [ClusterServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ClusterListPageAsync>> =
            list(ClusterListParams.none())

        /** @see list */
        fun list(
            params: ClusterListParams = ClusterListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ClusterListPageAsync>>

        /** @see list */
        fun list(
            params: ClusterListParams = ClusterListParams.none()
        ): CompletableFuture<HttpResponseFor<ClusterListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ClusterListPageAsync>> =
            list(ClusterListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/clusters/{task_id}`, but is otherwise the
         * same as [ClusterServiceAsync.delete].
         */
        fun delete(taskId: String): CompletableFuture<HttpResponse> =
            delete(taskId, ClusterDeleteParams.none())

        /** @see delete */
        fun delete(
            taskId: String,
            params: ClusterDeleteParams = ClusterDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see delete */
        fun delete(
            taskId: String,
            params: ClusterDeleteParams = ClusterDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(taskId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ClusterDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: ClusterDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            taskId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(taskId, ClusterDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/clusters`, but is otherwise the same as
         * [ClusterServiceAsync.compute].
         */
        fun compute(
            params: ClusterComputeParams
        ): CompletableFuture<HttpResponseFor<ClusterComputeResponse>> =
            compute(params, RequestOptions.none())

        /** @see compute */
        fun compute(
            params: ClusterComputeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ClusterComputeResponse>>

        /**
         * Returns a raw HTTP response for `get /ai/clusters/{task_id}/graph`, but is otherwise the
         * same as [ClusterServiceAsync.fetchGraph].
         */
        fun fetchGraph(taskId: String): CompletableFuture<HttpResponse> =
            fetchGraph(taskId, ClusterFetchGraphParams.none())

        /** @see fetchGraph */
        fun fetchGraph(
            taskId: String,
            params: ClusterFetchGraphParams = ClusterFetchGraphParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            fetchGraph(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see fetchGraph */
        fun fetchGraph(
            taskId: String,
            params: ClusterFetchGraphParams = ClusterFetchGraphParams.none(),
        ): CompletableFuture<HttpResponse> = fetchGraph(taskId, params, RequestOptions.none())

        /** @see fetchGraph */
        fun fetchGraph(
            params: ClusterFetchGraphParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see fetchGraph */
        fun fetchGraph(params: ClusterFetchGraphParams): CompletableFuture<HttpResponse> =
            fetchGraph(params, RequestOptions.none())

        /** @see fetchGraph */
        fun fetchGraph(
            taskId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            fetchGraph(taskId, ClusterFetchGraphParams.none(), requestOptions)
    }
}
