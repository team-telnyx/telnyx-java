// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.ai.assistants.tests

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.ai.assistants.tests.runs.RunListParams
import com.telnyx.api.models.ai.assistants.tests.runs.RunRetrieveParams
import com.telnyx.api.models.ai.assistants.tests.runs.RunTriggerParams
import com.telnyx.api.models.ai.assistants.tests.runs.TestRunResponse
import com.telnyx.api.models.ai.assistants.tests.testsuites.runs.PaginatedTestRunList
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RunServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync

    /** Retrieves detailed information about a specific test run execution */
    fun retrieve(runId: String, params: RunRetrieveParams): CompletableFuture<TestRunResponse> =
        retrieve(runId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        runId: String,
        params: RunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestRunResponse> =
        retrieve(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: RunRetrieveParams): CompletableFuture<TestRunResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestRunResponse>

    /**
     * Retrieves paginated execution history for a specific assistant test with filtering options
     */
    fun list(testId: String): CompletableFuture<PaginatedTestRunList> =
        list(testId, RunListParams.none())

    /** @see list */
    fun list(
        testId: String,
        params: RunListParams = RunListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaginatedTestRunList> =
        list(params.toBuilder().testId(testId).build(), requestOptions)

    /** @see list */
    fun list(
        testId: String,
        params: RunListParams = RunListParams.none(),
    ): CompletableFuture<PaginatedTestRunList> = list(testId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RunListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaginatedTestRunList>

    /** @see list */
    fun list(params: RunListParams): CompletableFuture<PaginatedTestRunList> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        testId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PaginatedTestRunList> = list(testId, RunListParams.none(), requestOptions)

    /** Initiates immediate execution of a specific assistant test */
    fun trigger(testId: String): CompletableFuture<TestRunResponse> =
        trigger(testId, RunTriggerParams.none())

    /** @see trigger */
    fun trigger(
        testId: String,
        params: RunTriggerParams = RunTriggerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestRunResponse> =
        trigger(params.toBuilder().testId(testId).build(), requestOptions)

    /** @see trigger */
    fun trigger(
        testId: String,
        params: RunTriggerParams = RunTriggerParams.none(),
    ): CompletableFuture<TestRunResponse> = trigger(testId, params, RequestOptions.none())

    /** @see trigger */
    fun trigger(
        params: RunTriggerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestRunResponse>

    /** @see trigger */
    fun trigger(params: RunTriggerParams): CompletableFuture<TestRunResponse> =
        trigger(params, RequestOptions.none())

    /** @see trigger */
    fun trigger(
        testId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TestRunResponse> = trigger(testId, RunTriggerParams.none(), requestOptions)

    /** A view of [RunServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/assistants/tests/{test_id}/runs/{run_id}`, but
         * is otherwise the same as [RunServiceAsync.retrieve].
         */
        fun retrieve(
            runId: String,
            params: RunRetrieveParams,
        ): CompletableFuture<HttpResponseFor<TestRunResponse>> =
            retrieve(runId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            runId: String,
            params: RunRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestRunResponse>> =
            retrieve(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: RunRetrieveParams
        ): CompletableFuture<HttpResponseFor<TestRunResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RunRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestRunResponse>>

        /**
         * Returns a raw HTTP response for `get /ai/assistants/tests/{test_id}/runs`, but is
         * otherwise the same as [RunServiceAsync.list].
         */
        fun list(testId: String): CompletableFuture<HttpResponseFor<PaginatedTestRunList>> =
            list(testId, RunListParams.none())

        /** @see list */
        fun list(
            testId: String,
            params: RunListParams = RunListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaginatedTestRunList>> =
            list(params.toBuilder().testId(testId).build(), requestOptions)

        /** @see list */
        fun list(
            testId: String,
            params: RunListParams = RunListParams.none(),
        ): CompletableFuture<HttpResponseFor<PaginatedTestRunList>> =
            list(testId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: RunListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaginatedTestRunList>>

        /** @see list */
        fun list(params: RunListParams): CompletableFuture<HttpResponseFor<PaginatedTestRunList>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            testId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PaginatedTestRunList>> =
            list(testId, RunListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/assistants/tests/{test_id}/runs`, but is
         * otherwise the same as [RunServiceAsync.trigger].
         */
        fun trigger(testId: String): CompletableFuture<HttpResponseFor<TestRunResponse>> =
            trigger(testId, RunTriggerParams.none())

        /** @see trigger */
        fun trigger(
            testId: String,
            params: RunTriggerParams = RunTriggerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestRunResponse>> =
            trigger(params.toBuilder().testId(testId).build(), requestOptions)

        /** @see trigger */
        fun trigger(
            testId: String,
            params: RunTriggerParams = RunTriggerParams.none(),
        ): CompletableFuture<HttpResponseFor<TestRunResponse>> =
            trigger(testId, params, RequestOptions.none())

        /** @see trigger */
        fun trigger(
            params: RunTriggerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestRunResponse>>

        /** @see trigger */
        fun trigger(params: RunTriggerParams): CompletableFuture<HttpResponseFor<TestRunResponse>> =
            trigger(params, RequestOptions.none())

        /** @see trigger */
        fun trigger(
            testId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TestRunResponse>> =
            trigger(testId, RunTriggerParams.none(), requestOptions)
    }
}
