// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.ai.assistants.tests

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.ai.assistants.tests.testsuites.TestSuiteListParams
import com.telnyx.api.models.ai.assistants.tests.testsuites.TestSuiteListResponse
import com.telnyx.api.services.async.ai.assistants.tests.testsuites.RunServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TestSuiteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestSuiteServiceAsync

    fun runs(): RunServiceAsync

    /** Retrieves a list of all distinct test suite names available to the current user */
    fun list(): CompletableFuture<TestSuiteListResponse> = list(TestSuiteListParams.none())

    /** @see list */
    fun list(
        params: TestSuiteListParams = TestSuiteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestSuiteListResponse>

    /** @see list */
    fun list(
        params: TestSuiteListParams = TestSuiteListParams.none()
    ): CompletableFuture<TestSuiteListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TestSuiteListResponse> =
        list(TestSuiteListParams.none(), requestOptions)

    /**
     * A view of [TestSuiteServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TestSuiteServiceAsync.WithRawResponse

        fun runs(): RunServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/assistants/tests/test-suites`, but is otherwise
         * the same as [TestSuiteServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TestSuiteListResponse>> =
            list(TestSuiteListParams.none())

        /** @see list */
        fun list(
            params: TestSuiteListParams = TestSuiteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestSuiteListResponse>>

        /** @see list */
        fun list(
            params: TestSuiteListParams = TestSuiteListParams.none()
        ): CompletableFuture<HttpResponseFor<TestSuiteListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TestSuiteListResponse>> =
            list(TestSuiteListParams.none(), requestOptions)
    }
}
