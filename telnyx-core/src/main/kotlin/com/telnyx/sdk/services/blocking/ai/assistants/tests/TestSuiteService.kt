// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.assistants.tests

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.TestSuiteListParams
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.TestSuiteListResponse
import com.telnyx.sdk.services.blocking.ai.assistants.tests.testsuites.RunService
import java.util.function.Consumer

/** Configure AI assistant specifications */
interface TestSuiteService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestSuiteService

    /** Configure AI assistant specifications */
    fun runs(): RunService

    /** Retrieves a list of all distinct test suite names available to the current user */
    fun list(): TestSuiteListResponse = list(TestSuiteListParams.none())

    /** @see list */
    fun list(
        params: TestSuiteListParams = TestSuiteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestSuiteListResponse

    /** @see list */
    fun list(params: TestSuiteListParams = TestSuiteListParams.none()): TestSuiteListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): TestSuiteListResponse =
        list(TestSuiteListParams.none(), requestOptions)

    /** A view of [TestSuiteService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestSuiteService.WithRawResponse

        /** Configure AI assistant specifications */
        fun runs(): RunService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/assistants/tests/test-suites`, but is otherwise
         * the same as [TestSuiteService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<TestSuiteListResponse> = list(TestSuiteListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TestSuiteListParams = TestSuiteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestSuiteListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: TestSuiteListParams = TestSuiteListParams.none()
        ): HttpResponseFor<TestSuiteListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TestSuiteListResponse> =
            list(TestSuiteListParams.none(), requestOptions)
    }
}
