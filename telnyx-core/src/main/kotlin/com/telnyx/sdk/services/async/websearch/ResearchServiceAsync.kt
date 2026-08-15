// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.websearch

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.websearch.research.ResearchCreateParams
import com.telnyx.sdk.models.websearch.research.ResearchCreateResponse
import com.telnyx.sdk.models.websearch.research.ResearchRetrieveParams
import com.telnyx.sdk.models.websearch.research.ResearchRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Deep research with citations and async task polling. */
interface ResearchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ResearchServiceAsync

    /**
     * Starts a deep research task that runs multiple searches, reads sources, and synthesizes an
     * answer with citations.
     *
     * ## Synchronous mode (default)
     *
     * When `background` is `false` or omitted, the request blocks until the research completes and
     * returns the answer with citations. This can take up to 120 seconds depending on
     * `research_effort`.
     *
     * ## Asynchronous mode
     *
     * When `background` is `true`, the request returns immediately with a `task_id` and `status:
     * pending`. Poll `GET /web_search/research/{task_id}` to check when the research completes and
     * retrieve the answer.
     */
    fun create(params: ResearchCreateParams): CompletableFuture<ResearchCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ResearchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResearchCreateResponse>

    /**
     * Polls the status of a previously started asynchronous research task. When the status is
     * `completed`, the response includes the answer and citations. When the status is `failed`, the
     * response includes an error message.
     */
    fun retrieve(taskId: String): CompletableFuture<ResearchRetrieveResponse> =
        retrieve(taskId, ResearchRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        taskId: String,
        params: ResearchRetrieveParams = ResearchRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResearchRetrieveResponse> =
        retrieve(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        taskId: String,
        params: ResearchRetrieveParams = ResearchRetrieveParams.none(),
    ): CompletableFuture<ResearchRetrieveResponse> = retrieve(taskId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ResearchRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResearchRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: ResearchRetrieveParams): CompletableFuture<ResearchRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        taskId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResearchRetrieveResponse> =
        retrieve(taskId, ResearchRetrieveParams.none(), requestOptions)

    /**
     * A view of [ResearchServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ResearchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /web_search/research`, but is otherwise the same as
         * [ResearchServiceAsync.create].
         */
        fun create(
            params: ResearchCreateParams
        ): CompletableFuture<HttpResponseFor<ResearchCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ResearchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResearchCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /web_search/research/{task_id}`, but is otherwise
         * the same as [ResearchServiceAsync.retrieve].
         */
        fun retrieve(taskId: String): CompletableFuture<HttpResponseFor<ResearchRetrieveResponse>> =
            retrieve(taskId, ResearchRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            taskId: String,
            params: ResearchRetrieveParams = ResearchRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResearchRetrieveResponse>> =
            retrieve(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            taskId: String,
            params: ResearchRetrieveParams = ResearchRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ResearchRetrieveResponse>> =
            retrieve(taskId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ResearchRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResearchRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ResearchRetrieveParams
        ): CompletableFuture<HttpResponseFor<ResearchRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            taskId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ResearchRetrieveResponse>> =
            retrieve(taskId, ResearchRetrieveParams.none(), requestOptions)
    }
}
