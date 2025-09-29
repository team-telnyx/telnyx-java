// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.ai.assistants.tests.testsuites

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.ai.assistants.tests.runs.TestRunResponse
import com.telnyx.api.models.ai.assistants.tests.testsuites.runs.PaginatedTestRunList
import com.telnyx.api.models.ai.assistants.tests.testsuites.runs.RunListParams
import com.telnyx.api.models.ai.assistants.tests.testsuites.runs.RunTriggerParams
import java.util.function.Consumer

interface RunService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService

    /** Retrieves paginated history of test runs for a specific test suite with filtering options */
    fun list(suiteName: String): PaginatedTestRunList = list(suiteName, RunListParams.none())

    /** @see list */
    fun list(
        suiteName: String,
        params: RunListParams = RunListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaginatedTestRunList = list(params.toBuilder().suiteName(suiteName).build(), requestOptions)

    /** @see list */
    fun list(
        suiteName: String,
        params: RunListParams = RunListParams.none(),
    ): PaginatedTestRunList = list(suiteName, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RunListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaginatedTestRunList

    /** @see list */
    fun list(params: RunListParams): PaginatedTestRunList = list(params, RequestOptions.none())

    /** @see list */
    fun list(suiteName: String, requestOptions: RequestOptions): PaginatedTestRunList =
        list(suiteName, RunListParams.none(), requestOptions)

    /** Executes all tests within a specific test suite as a batch operation */
    fun trigger(suiteName: String): List<TestRunResponse> =
        trigger(suiteName, RunTriggerParams.none())

    /** @see trigger */
    fun trigger(
        suiteName: String,
        params: RunTriggerParams = RunTriggerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TestRunResponse> =
        trigger(params.toBuilder().suiteName(suiteName).build(), requestOptions)

    /** @see trigger */
    fun trigger(
        suiteName: String,
        params: RunTriggerParams = RunTriggerParams.none(),
    ): List<TestRunResponse> = trigger(suiteName, params, RequestOptions.none())

    /** @see trigger */
    fun trigger(
        params: RunTriggerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TestRunResponse>

    /** @see trigger */
    fun trigger(params: RunTriggerParams): List<TestRunResponse> =
        trigger(params, RequestOptions.none())

    /** @see trigger */
    fun trigger(suiteName: String, requestOptions: RequestOptions): List<TestRunResponse> =
        trigger(suiteName, RunTriggerParams.none(), requestOptions)

    /** A view of [RunService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/assistants/tests/test-suites/{suite_name}/runs`,
         * but is otherwise the same as [RunService.list].
         */
        @MustBeClosed
        fun list(suiteName: String): HttpResponseFor<PaginatedTestRunList> =
            list(suiteName, RunListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            suiteName: String,
            params: RunListParams = RunListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaginatedTestRunList> =
            list(params.toBuilder().suiteName(suiteName).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            suiteName: String,
            params: RunListParams = RunListParams.none(),
        ): HttpResponseFor<PaginatedTestRunList> = list(suiteName, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RunListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaginatedTestRunList>

        /** @see list */
        @MustBeClosed
        fun list(params: RunListParams): HttpResponseFor<PaginatedTestRunList> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            suiteName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaginatedTestRunList> =
            list(suiteName, RunListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /ai/assistants/tests/test-suites/{suite_name}/runs`, but is otherwise the same as
         * [RunService.trigger].
         */
        @MustBeClosed
        fun trigger(suiteName: String): HttpResponseFor<List<TestRunResponse>> =
            trigger(suiteName, RunTriggerParams.none())

        /** @see trigger */
        @MustBeClosed
        fun trigger(
            suiteName: String,
            params: RunTriggerParams = RunTriggerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TestRunResponse>> =
            trigger(params.toBuilder().suiteName(suiteName).build(), requestOptions)

        /** @see trigger */
        @MustBeClosed
        fun trigger(
            suiteName: String,
            params: RunTriggerParams = RunTriggerParams.none(),
        ): HttpResponseFor<List<TestRunResponse>> =
            trigger(suiteName, params, RequestOptions.none())

        /** @see trigger */
        @MustBeClosed
        fun trigger(
            params: RunTriggerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TestRunResponse>>

        /** @see trigger */
        @MustBeClosed
        fun trigger(params: RunTriggerParams): HttpResponseFor<List<TestRunResponse>> =
            trigger(params, RequestOptions.none())

        /** @see trigger */
        @MustBeClosed
        fun trigger(
            suiteName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<TestRunResponse>> =
            trigger(suiteName, RunTriggerParams.none(), requestOptions)
    }
}
