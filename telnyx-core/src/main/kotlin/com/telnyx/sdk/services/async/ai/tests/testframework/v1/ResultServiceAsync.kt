// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.tests.testframework.v1

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.tests.testframework.v1.results.ResultDeleteParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.results.ResultDeleteResponse
import com.telnyx.sdk.models.ai.tests.testframework.v1.results.ResultListParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.results.ResultListResponse
import com.telnyx.sdk.models.ai.tests.testframework.v1.results.ResultRerunParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.results.ResultRetrieveParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.results.TestRunResult
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
interface ResultServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ResultServiceAsync

    /** Returns the specified test run batch, optionally with per-run detail. */
    fun retrieve(id: Long): CompletableFuture<TestRunResult> =
        retrieve(id, ResultRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: Long,
        params: ResultRetrieveParams = ResultRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestRunResult> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: Long,
        params: ResultRetrieveParams = ResultRetrieveParams.none(),
    ): CompletableFuture<TestRunResult> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ResultRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestRunResult>

    /** @see retrieve */
    fun retrieve(params: ResultRetrieveParams): CompletableFuture<TestRunResult> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: Long, requestOptions: RequestOptions): CompletableFuture<TestRunResult> =
        retrieve(id, ResultRetrieveParams.none(), requestOptions)

    /**
     * Returns a paginated list of test run batches in your organization, optionally filtered by
     * test agent, search text, or scenarios.
     */
    fun list(): CompletableFuture<ResultListResponse> = list(ResultListParams.none())

    /** @see list */
    fun list(
        params: ResultListParams = ResultListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResultListResponse>

    /** @see list */
    fun list(
        params: ResultListParams = ResultListParams.none()
    ): CompletableFuture<ResultListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ResultListResponse> =
        list(ResultListParams.none(), requestOptions)

    /** Deletes the specified test run batch. */
    fun delete(id: Long): CompletableFuture<ResultDeleteResponse> =
        delete(id, ResultDeleteParams.none())

    /** @see delete */
    fun delete(
        id: Long,
        params: ResultDeleteParams = ResultDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResultDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: Long,
        params: ResultDeleteParams = ResultDeleteParams.none(),
    ): CompletableFuture<ResultDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ResultDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResultDeleteResponse>

    /** @see delete */
    fun delete(params: ResultDeleteParams): CompletableFuture<ResultDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: Long, requestOptions: RequestOptions): CompletableFuture<ResultDeleteResponse> =
        delete(id, ResultDeleteParams.none(), requestOptions)

    /** Re-executes the scenarios of the specified test run batch and creates a new run batch. */
    fun rerun(id: Long): CompletableFuture<TestRunResult> = rerun(id, ResultRerunParams.none())

    /** @see rerun */
    fun rerun(
        id: Long,
        params: ResultRerunParams = ResultRerunParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestRunResult> = rerun(params.toBuilder().id(id).build(), requestOptions)

    /** @see rerun */
    fun rerun(
        id: Long,
        params: ResultRerunParams = ResultRerunParams.none(),
    ): CompletableFuture<TestRunResult> = rerun(id, params, RequestOptions.none())

    /** @see rerun */
    fun rerun(
        params: ResultRerunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestRunResult>

    /** @see rerun */
    fun rerun(params: ResultRerunParams): CompletableFuture<TestRunResult> =
        rerun(params, RequestOptions.none())

    /** @see rerun */
    fun rerun(id: Long, requestOptions: RequestOptions): CompletableFuture<TestRunResult> =
        rerun(id, ResultRerunParams.none(), requestOptions)

    /**
     * A view of [ResultServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ResultServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/tests/test_framework/v1/results/{id}`, but is
         * otherwise the same as [ResultServiceAsync.retrieve].
         */
        fun retrieve(id: Long): CompletableFuture<HttpResponseFor<TestRunResult>> =
            retrieve(id, ResultRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: Long,
            params: ResultRetrieveParams = ResultRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestRunResult>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: Long,
            params: ResultRetrieveParams = ResultRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TestRunResult>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ResultRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestRunResult>>

        /** @see retrieve */
        fun retrieve(
            params: ResultRetrieveParams
        ): CompletableFuture<HttpResponseFor<TestRunResult>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TestRunResult>> =
            retrieve(id, ResultRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/tests/test_framework/v1/results`, but is
         * otherwise the same as [ResultServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ResultListResponse>> =
            list(ResultListParams.none())

        /** @see list */
        fun list(
            params: ResultListParams = ResultListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResultListResponse>>

        /** @see list */
        fun list(
            params: ResultListParams = ResultListParams.none()
        ): CompletableFuture<HttpResponseFor<ResultListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ResultListResponse>> =
            list(ResultListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/tests/test_framework/v1/results/{id}`, but is
         * otherwise the same as [ResultServiceAsync.delete].
         */
        fun delete(id: Long): CompletableFuture<HttpResponseFor<ResultDeleteResponse>> =
            delete(id, ResultDeleteParams.none())

        /** @see delete */
        fun delete(
            id: Long,
            params: ResultDeleteParams = ResultDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResultDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: Long,
            params: ResultDeleteParams = ResultDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<ResultDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ResultDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResultDeleteResponse>>

        /** @see delete */
        fun delete(
            params: ResultDeleteParams
        ): CompletableFuture<HttpResponseFor<ResultDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ResultDeleteResponse>> =
            delete(id, ResultDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/tests/test_framework/v1/results/{id}/rerun`,
         * but is otherwise the same as [ResultServiceAsync.rerun].
         */
        fun rerun(id: Long): CompletableFuture<HttpResponseFor<TestRunResult>> =
            rerun(id, ResultRerunParams.none())

        /** @see rerun */
        fun rerun(
            id: Long,
            params: ResultRerunParams = ResultRerunParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestRunResult>> =
            rerun(params.toBuilder().id(id).build(), requestOptions)

        /** @see rerun */
        fun rerun(
            id: Long,
            params: ResultRerunParams = ResultRerunParams.none(),
        ): CompletableFuture<HttpResponseFor<TestRunResult>> =
            rerun(id, params, RequestOptions.none())

        /** @see rerun */
        fun rerun(
            params: ResultRerunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestRunResult>>

        /** @see rerun */
        fun rerun(params: ResultRerunParams): CompletableFuture<HttpResponseFor<TestRunResult>> =
            rerun(params, RequestOptions.none())

        /** @see rerun */
        fun rerun(
            id: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TestRunResult>> =
            rerun(id, ResultRerunParams.none(), requestOptions)
    }
}
