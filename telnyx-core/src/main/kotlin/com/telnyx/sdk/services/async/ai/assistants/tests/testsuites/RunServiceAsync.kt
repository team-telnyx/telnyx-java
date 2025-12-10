// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.assistants.tests.testsuites

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.assistants.tests.runs.TestRunResponse
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.RunListPageAsync
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.RunListParams
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.RunTriggerParams
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

    /** Retrieves paginated history of test runs for a specific test suite with filtering options */
    fun list(suiteName: String): CompletableFuture<RunListPageAsync> =
        list(suiteName, RunListParams.none())

    /** @see list */
    fun list(
        suiteName: String,
        params: RunListParams = RunListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunListPageAsync> =
        list(params.toBuilder().suiteName(suiteName).build(), requestOptions)

    /** @see list */
    fun list(
        suiteName: String,
        params: RunListParams = RunListParams.none(),
    ): CompletableFuture<RunListPageAsync> = list(suiteName, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RunListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunListPageAsync>

    /** @see list */
    fun list(params: RunListParams): CompletableFuture<RunListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        suiteName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunListPageAsync> = list(suiteName, RunListParams.none(), requestOptions)

    /** Executes all tests within a specific test suite as a batch operation */
    fun trigger(suiteName: String): CompletableFuture<List<TestRunResponse>> =
        trigger(suiteName, RunTriggerParams.none())

    /** @see trigger */
    fun trigger(
        suiteName: String,
        params: RunTriggerParams = RunTriggerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<TestRunResponse>> =
        trigger(params.toBuilder().suiteName(suiteName).build(), requestOptions)

    /** @see trigger */
    fun trigger(
        suiteName: String,
        params: RunTriggerParams = RunTriggerParams.none(),
    ): CompletableFuture<List<TestRunResponse>> = trigger(suiteName, params, RequestOptions.none())

    /** @see trigger */
    fun trigger(
        params: RunTriggerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<TestRunResponse>>

    /** @see trigger */
    fun trigger(params: RunTriggerParams): CompletableFuture<List<TestRunResponse>> =
        trigger(params, RequestOptions.none())

    /** @see trigger */
    fun trigger(
        suiteName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<TestRunResponse>> =
        trigger(suiteName, RunTriggerParams.none(), requestOptions)

    /** A view of [RunServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/assistants/tests/test-suites/{suite_name}/runs`,
         * but is otherwise the same as [RunServiceAsync.list].
         */
        fun list(suiteName: String): CompletableFuture<HttpResponseFor<RunListPageAsync>> =
            list(suiteName, RunListParams.none())

        /** @see list */
        fun list(
            suiteName: String,
            params: RunListParams = RunListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunListPageAsync>> =
            list(params.toBuilder().suiteName(suiteName).build(), requestOptions)

        /** @see list */
        fun list(
            suiteName: String,
            params: RunListParams = RunListParams.none(),
        ): CompletableFuture<HttpResponseFor<RunListPageAsync>> =
            list(suiteName, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: RunListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunListPageAsync>>

        /** @see list */
        fun list(params: RunListParams): CompletableFuture<HttpResponseFor<RunListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            suiteName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunListPageAsync>> =
            list(suiteName, RunListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /ai/assistants/tests/test-suites/{suite_name}/runs`, but is otherwise the same as
         * [RunServiceAsync.trigger].
         */
        fun trigger(suiteName: String): CompletableFuture<HttpResponseFor<List<TestRunResponse>>> =
            trigger(suiteName, RunTriggerParams.none())

        /** @see trigger */
        fun trigger(
            suiteName: String,
            params: RunTriggerParams = RunTriggerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<TestRunResponse>>> =
            trigger(params.toBuilder().suiteName(suiteName).build(), requestOptions)

        /** @see trigger */
        fun trigger(
            suiteName: String,
            params: RunTriggerParams = RunTriggerParams.none(),
        ): CompletableFuture<HttpResponseFor<List<TestRunResponse>>> =
            trigger(suiteName, params, RequestOptions.none())

        /** @see trigger */
        fun trigger(
            params: RunTriggerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<TestRunResponse>>>

        /** @see trigger */
        fun trigger(
            params: RunTriggerParams
        ): CompletableFuture<HttpResponseFor<List<TestRunResponse>>> =
            trigger(params, RequestOptions.none())

        /** @see trigger */
        fun trigger(
            suiteName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<TestRunResponse>>> =
            trigger(suiteName, RunTriggerParams.none(), requestOptions)
    }
}
