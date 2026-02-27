// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.clusters.ClusterComputeParams
import com.telnyx.sdk.models.ai.clusters.ClusterComputeResponse
import com.telnyx.sdk.models.ai.clusters.ClusterDeleteParams
import com.telnyx.sdk.models.ai.clusters.ClusterFetchGraphParams
import com.telnyx.sdk.models.ai.clusters.ClusterListPage
import com.telnyx.sdk.models.ai.clusters.ClusterListParams
import com.telnyx.sdk.models.ai.clusters.ClusterRetrieveParams
import com.telnyx.sdk.models.ai.clusters.ClusterRetrieveResponse
import java.util.function.Consumer

/** Identify common themes and patterns in your embedded documents */
interface ClusterService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClusterService

    /** Fetch a cluster */
    fun retrieve(taskId: String): ClusterRetrieveResponse =
        retrieve(taskId, ClusterRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        taskId: String,
        params: ClusterRetrieveParams = ClusterRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClusterRetrieveResponse = retrieve(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        taskId: String,
        params: ClusterRetrieveParams = ClusterRetrieveParams.none(),
    ): ClusterRetrieveResponse = retrieve(taskId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ClusterRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClusterRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: ClusterRetrieveParams): ClusterRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(taskId: String, requestOptions: RequestOptions): ClusterRetrieveResponse =
        retrieve(taskId, ClusterRetrieveParams.none(), requestOptions)

    /** List all clusters */
    fun list(): ClusterListPage = list(ClusterListParams.none())

    /** @see list */
    fun list(
        params: ClusterListParams = ClusterListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClusterListPage

    /** @see list */
    fun list(params: ClusterListParams = ClusterListParams.none()): ClusterListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ClusterListPage =
        list(ClusterListParams.none(), requestOptions)

    /** Delete a cluster */
    fun delete(taskId: String) = delete(taskId, ClusterDeleteParams.none())

    /** @see delete */
    fun delete(
        taskId: String,
        params: ClusterDeleteParams = ClusterDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see delete */
    fun delete(taskId: String, params: ClusterDeleteParams = ClusterDeleteParams.none()) =
        delete(taskId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ClusterDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: ClusterDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(taskId: String, requestOptions: RequestOptions) =
        delete(taskId, ClusterDeleteParams.none(), requestOptions)

    /**
     * Starts a background task to compute how the data in an
     * [embedded storage bucket](https://developers.telnyx.com/api-reference/embeddings/embed-documents)
     * is clustered. This helps identify common themes and patterns in the data.
     */
    fun compute(params: ClusterComputeParams): ClusterComputeResponse =
        compute(params, RequestOptions.none())

    /** @see compute */
    fun compute(
        params: ClusterComputeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClusterComputeResponse

    /** Fetch a cluster visualization */
    @MustBeClosed
    fun fetchGraph(taskId: String): HttpResponse =
        fetchGraph(taskId, ClusterFetchGraphParams.none())

    /** @see fetchGraph */
    @MustBeClosed
    fun fetchGraph(
        taskId: String,
        params: ClusterFetchGraphParams = ClusterFetchGraphParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = fetchGraph(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see fetchGraph */
    @MustBeClosed
    fun fetchGraph(
        taskId: String,
        params: ClusterFetchGraphParams = ClusterFetchGraphParams.none(),
    ): HttpResponse = fetchGraph(taskId, params, RequestOptions.none())

    /** @see fetchGraph */
    @MustBeClosed
    fun fetchGraph(
        params: ClusterFetchGraphParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see fetchGraph */
    @MustBeClosed
    fun fetchGraph(params: ClusterFetchGraphParams): HttpResponse =
        fetchGraph(params, RequestOptions.none())

    /** @see fetchGraph */
    @MustBeClosed
    fun fetchGraph(taskId: String, requestOptions: RequestOptions): HttpResponse =
        fetchGraph(taskId, ClusterFetchGraphParams.none(), requestOptions)

    /** A view of [ClusterService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClusterService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/clusters/{task_id}`, but is otherwise the same
         * as [ClusterService.retrieve].
         */
        @MustBeClosed
        fun retrieve(taskId: String): HttpResponseFor<ClusterRetrieveResponse> =
            retrieve(taskId, ClusterRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            taskId: String,
            params: ClusterRetrieveParams = ClusterRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClusterRetrieveResponse> =
            retrieve(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            taskId: String,
            params: ClusterRetrieveParams = ClusterRetrieveParams.none(),
        ): HttpResponseFor<ClusterRetrieveResponse> =
            retrieve(taskId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ClusterRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClusterRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ClusterRetrieveParams): HttpResponseFor<ClusterRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            taskId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClusterRetrieveResponse> =
            retrieve(taskId, ClusterRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/clusters`, but is otherwise the same as
         * [ClusterService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ClusterListPage> = list(ClusterListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ClusterListParams = ClusterListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClusterListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ClusterListParams = ClusterListParams.none()
        ): HttpResponseFor<ClusterListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ClusterListPage> =
            list(ClusterListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/clusters/{task_id}`, but is otherwise the
         * same as [ClusterService.delete].
         */
        @MustBeClosed
        fun delete(taskId: String): HttpResponse = delete(taskId, ClusterDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            taskId: String,
            params: ClusterDeleteParams = ClusterDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            taskId: String,
            params: ClusterDeleteParams = ClusterDeleteParams.none(),
        ): HttpResponse = delete(taskId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ClusterDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ClusterDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(taskId: String, requestOptions: RequestOptions): HttpResponse =
            delete(taskId, ClusterDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/clusters`, but is otherwise the same as
         * [ClusterService.compute].
         */
        @MustBeClosed
        fun compute(params: ClusterComputeParams): HttpResponseFor<ClusterComputeResponse> =
            compute(params, RequestOptions.none())

        /** @see compute */
        @MustBeClosed
        fun compute(
            params: ClusterComputeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClusterComputeResponse>

        /**
         * Returns a raw HTTP response for `get /ai/clusters/{task_id}/graph`, but is otherwise the
         * same as [ClusterService.fetchGraph].
         */
        @MustBeClosed
        fun fetchGraph(taskId: String): HttpResponse =
            fetchGraph(taskId, ClusterFetchGraphParams.none())

        /** @see fetchGraph */
        @MustBeClosed
        fun fetchGraph(
            taskId: String,
            params: ClusterFetchGraphParams = ClusterFetchGraphParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = fetchGraph(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see fetchGraph */
        @MustBeClosed
        fun fetchGraph(
            taskId: String,
            params: ClusterFetchGraphParams = ClusterFetchGraphParams.none(),
        ): HttpResponse = fetchGraph(taskId, params, RequestOptions.none())

        /** @see fetchGraph */
        @MustBeClosed
        fun fetchGraph(
            params: ClusterFetchGraphParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see fetchGraph */
        @MustBeClosed
        fun fetchGraph(params: ClusterFetchGraphParams): HttpResponse =
            fetchGraph(params, RequestOptions.none())

        /** @see fetchGraph */
        @MustBeClosed
        fun fetchGraph(taskId: String, requestOptions: RequestOptions): HttpResponse =
            fetchGraph(taskId, ClusterFetchGraphParams.none(), requestOptions)
    }
}
