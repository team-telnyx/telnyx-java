// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.assistants.tests

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.assistants.tests.runs.RunListPage
import com.telnyx.sdk.models.ai.assistants.tests.runs.RunListParams
import com.telnyx.sdk.models.ai.assistants.tests.runs.RunRetrieveParams
import com.telnyx.sdk.models.ai.assistants.tests.runs.RunTriggerParams
import com.telnyx.sdk.models.ai.assistants.tests.runs.TestRunResponse
import java.util.function.Consumer

/** Configure AI assistant specifications */
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

    /** Retrieves detailed information about a specific test run execution */
    fun retrieve(runId: String, params: RunRetrieveParams): TestRunResponse =
        retrieve(runId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        runId: String,
        params: RunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestRunResponse = retrieve(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: RunRetrieveParams): TestRunResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestRunResponse

    /**
     * Retrieves paginated execution history for a specific assistant test with filtering options
     */
    fun list(testId: String): RunListPage = list(testId, RunListParams.none())

    /** @see list */
    fun list(
        testId: String,
        params: RunListParams = RunListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunListPage = list(params.toBuilder().testId(testId).build(), requestOptions)

    /** @see list */
    fun list(testId: String, params: RunListParams = RunListParams.none()): RunListPage =
        list(testId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RunListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunListPage

    /** @see list */
    fun list(params: RunListParams): RunListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(testId: String, requestOptions: RequestOptions): RunListPage =
        list(testId, RunListParams.none(), requestOptions)

    /** Initiates immediate execution of a specific assistant test */
    fun trigger(testId: String): TestRunResponse = trigger(testId, RunTriggerParams.none())

    /** @see trigger */
    fun trigger(
        testId: String,
        params: RunTriggerParams = RunTriggerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestRunResponse = trigger(params.toBuilder().testId(testId).build(), requestOptions)

    /** @see trigger */
    fun trigger(
        testId: String,
        params: RunTriggerParams = RunTriggerParams.none(),
    ): TestRunResponse = trigger(testId, params, RequestOptions.none())

    /** @see trigger */
    fun trigger(
        params: RunTriggerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestRunResponse

    /** @see trigger */
    fun trigger(params: RunTriggerParams): TestRunResponse = trigger(params, RequestOptions.none())

    /** @see trigger */
    fun trigger(testId: String, requestOptions: RequestOptions): TestRunResponse =
        trigger(testId, RunTriggerParams.none(), requestOptions)

    /** A view of [RunService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/assistants/tests/{test_id}/runs/{run_id}`, but
         * is otherwise the same as [RunService.retrieve].
         */
        @MustBeClosed
        fun retrieve(runId: String, params: RunRetrieveParams): HttpResponseFor<TestRunResponse> =
            retrieve(runId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            runId: String,
            params: RunRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestRunResponse> =
            retrieve(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: RunRetrieveParams): HttpResponseFor<TestRunResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RunRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestRunResponse>

        /**
         * Returns a raw HTTP response for `get /ai/assistants/tests/{test_id}/runs`, but is
         * otherwise the same as [RunService.list].
         */
        @MustBeClosed
        fun list(testId: String): HttpResponseFor<RunListPage> = list(testId, RunListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            testId: String,
            params: RunListParams = RunListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunListPage> =
            list(params.toBuilder().testId(testId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            testId: String,
            params: RunListParams = RunListParams.none(),
        ): HttpResponseFor<RunListPage> = list(testId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RunListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: RunListParams): HttpResponseFor<RunListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(testId: String, requestOptions: RequestOptions): HttpResponseFor<RunListPage> =
            list(testId, RunListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/assistants/tests/{test_id}/runs`, but is
         * otherwise the same as [RunService.trigger].
         */
        @MustBeClosed
        fun trigger(testId: String): HttpResponseFor<TestRunResponse> =
            trigger(testId, RunTriggerParams.none())

        /** @see trigger */
        @MustBeClosed
        fun trigger(
            testId: String,
            params: RunTriggerParams = RunTriggerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestRunResponse> =
            trigger(params.toBuilder().testId(testId).build(), requestOptions)

        /** @see trigger */
        @MustBeClosed
        fun trigger(
            testId: String,
            params: RunTriggerParams = RunTriggerParams.none(),
        ): HttpResponseFor<TestRunResponse> = trigger(testId, params, RequestOptions.none())

        /** @see trigger */
        @MustBeClosed
        fun trigger(
            params: RunTriggerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestRunResponse>

        /** @see trigger */
        @MustBeClosed
        fun trigger(params: RunTriggerParams): HttpResponseFor<TestRunResponse> =
            trigger(params, RequestOptions.none())

        /** @see trigger */
        @MustBeClosed
        fun trigger(
            testId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TestRunResponse> =
            trigger(testId, RunTriggerParams.none(), requestOptions)
    }
}
