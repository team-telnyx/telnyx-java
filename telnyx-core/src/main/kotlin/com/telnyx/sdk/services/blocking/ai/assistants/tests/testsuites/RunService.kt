// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.assistants.tests.testsuites

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.assistants.tests.runs.TestRunResponse
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.RunListPage
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.RunListParams
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.RunTriggerParams
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

    /** Retrieves paginated history of test runs for a specific test suite with filtering options */
    fun list(suiteName: String): RunListPage = list(suiteName, RunListParams.none())

    /** @see list */
    fun list(
        suiteName: String,
        params: RunListParams = RunListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunListPage = list(params.toBuilder().suiteName(suiteName).build(), requestOptions)

    /** @see list */
    fun list(suiteName: String, params: RunListParams = RunListParams.none()): RunListPage =
        list(suiteName, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RunListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunListPage

    /** @see list */
    fun list(params: RunListParams): RunListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(suiteName: String, requestOptions: RequestOptions): RunListPage =
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
        fun list(suiteName: String): HttpResponseFor<RunListPage> =
            list(suiteName, RunListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            suiteName: String,
            params: RunListParams = RunListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunListPage> =
            list(params.toBuilder().suiteName(suiteName).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            suiteName: String,
            params: RunListParams = RunListParams.none(),
        ): HttpResponseFor<RunListPage> = list(suiteName, params, RequestOptions.none())

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
        fun list(suiteName: String, requestOptions: RequestOptions): HttpResponseFor<RunListPage> =
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
