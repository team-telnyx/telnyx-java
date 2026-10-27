// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.tests.testframework.v1

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

/** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
interface ResultService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ResultService

    /** Returns the specified test run batch, optionally with per-run detail. */
    fun retrieve(id: Long): TestRunResult = retrieve(id, ResultRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: Long,
        params: ResultRetrieveParams = ResultRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestRunResult = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: Long,
        params: ResultRetrieveParams = ResultRetrieveParams.none(),
    ): TestRunResult = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ResultRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestRunResult

    /** @see retrieve */
    fun retrieve(params: ResultRetrieveParams): TestRunResult =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: Long, requestOptions: RequestOptions): TestRunResult =
        retrieve(id, ResultRetrieveParams.none(), requestOptions)

    /**
     * Returns a paginated list of test run batches in your organization, optionally filtered by
     * test agent, search text, or scenarios.
     */
    fun list(): ResultListResponse = list(ResultListParams.none())

    /** @see list */
    fun list(
        params: ResultListParams = ResultListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResultListResponse

    /** @see list */
    fun list(params: ResultListParams = ResultListParams.none()): ResultListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ResultListResponse =
        list(ResultListParams.none(), requestOptions)

    /** Deletes the specified test run batch. */
    fun delete(id: Long): ResultDeleteResponse = delete(id, ResultDeleteParams.none())

    /** @see delete */
    fun delete(
        id: Long,
        params: ResultDeleteParams = ResultDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResultDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: Long,
        params: ResultDeleteParams = ResultDeleteParams.none(),
    ): ResultDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ResultDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResultDeleteResponse

    /** @see delete */
    fun delete(params: ResultDeleteParams): ResultDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: Long, requestOptions: RequestOptions): ResultDeleteResponse =
        delete(id, ResultDeleteParams.none(), requestOptions)

    /** Re-executes the scenarios of the specified test run batch and creates a new run batch. */
    fun rerun(id: Long): TestRunResult = rerun(id, ResultRerunParams.none())

    /** @see rerun */
    fun rerun(
        id: Long,
        params: ResultRerunParams = ResultRerunParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestRunResult = rerun(params.toBuilder().id(id).build(), requestOptions)

    /** @see rerun */
    fun rerun(id: Long, params: ResultRerunParams = ResultRerunParams.none()): TestRunResult =
        rerun(id, params, RequestOptions.none())

    /** @see rerun */
    fun rerun(
        params: ResultRerunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestRunResult

    /** @see rerun */
    fun rerun(params: ResultRerunParams): TestRunResult = rerun(params, RequestOptions.none())

    /** @see rerun */
    fun rerun(id: Long, requestOptions: RequestOptions): TestRunResult =
        rerun(id, ResultRerunParams.none(), requestOptions)

    /** A view of [ResultService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ResultService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/tests/test_framework/v1/results/{id}`, but is
         * otherwise the same as [ResultService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: Long): HttpResponseFor<TestRunResult> =
            retrieve(id, ResultRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: Long,
            params: ResultRetrieveParams = ResultRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestRunResult> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: Long,
            params: ResultRetrieveParams = ResultRetrieveParams.none(),
        ): HttpResponseFor<TestRunResult> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ResultRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestRunResult>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ResultRetrieveParams): HttpResponseFor<TestRunResult> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: Long, requestOptions: RequestOptions): HttpResponseFor<TestRunResult> =
            retrieve(id, ResultRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/tests/test_framework/v1/results`, but is
         * otherwise the same as [ResultService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ResultListResponse> = list(ResultListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ResultListParams = ResultListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResultListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ResultListParams = ResultListParams.none()
        ): HttpResponseFor<ResultListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ResultListResponse> =
            list(ResultListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/tests/test_framework/v1/results/{id}`, but is
         * otherwise the same as [ResultService.delete].
         */
        @MustBeClosed
        fun delete(id: Long): HttpResponseFor<ResultDeleteResponse> =
            delete(id, ResultDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: Long,
            params: ResultDeleteParams = ResultDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResultDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: Long,
            params: ResultDeleteParams = ResultDeleteParams.none(),
        ): HttpResponseFor<ResultDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ResultDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResultDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: ResultDeleteParams): HttpResponseFor<ResultDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResultDeleteResponse> =
            delete(id, ResultDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/tests/test_framework/v1/results/{id}/rerun`,
         * but is otherwise the same as [ResultService.rerun].
         */
        @MustBeClosed
        fun rerun(id: Long): HttpResponseFor<TestRunResult> = rerun(id, ResultRerunParams.none())

        /** @see rerun */
        @MustBeClosed
        fun rerun(
            id: Long,
            params: ResultRerunParams = ResultRerunParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestRunResult> = rerun(params.toBuilder().id(id).build(), requestOptions)

        /** @see rerun */
        @MustBeClosed
        fun rerun(
            id: Long,
            params: ResultRerunParams = ResultRerunParams.none(),
        ): HttpResponseFor<TestRunResult> = rerun(id, params, RequestOptions.none())

        /** @see rerun */
        @MustBeClosed
        fun rerun(
            params: ResultRerunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestRunResult>

        /** @see rerun */
        @MustBeClosed
        fun rerun(params: ResultRerunParams): HttpResponseFor<TestRunResult> =
            rerun(params, RequestOptions.none())

        /** @see rerun */
        @MustBeClosed
        fun rerun(id: Long, requestOptions: RequestOptions): HttpResponseFor<TestRunResult> =
            rerun(id, ResultRerunParams.none(), requestOptions)
    }
}
