// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.assistants

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.assistants.tests.AssistantTest
import com.telnyx.sdk.models.ai.assistants.tests.TestCreateParams
import com.telnyx.sdk.models.ai.assistants.tests.TestDeleteParams
import com.telnyx.sdk.models.ai.assistants.tests.TestListPageAsync
import com.telnyx.sdk.models.ai.assistants.tests.TestListParams
import com.telnyx.sdk.models.ai.assistants.tests.TestRetrieveParams
import com.telnyx.sdk.models.ai.assistants.tests.TestUpdateParams
import com.telnyx.sdk.services.async.ai.assistants.tests.RunServiceAsync
import com.telnyx.sdk.services.async.ai.assistants.tests.TestSuiteServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Configure AI assistant specifications */
interface TestServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestServiceAsync

    /** Configure AI assistant specifications */
    fun testSuites(): TestSuiteServiceAsync

    /** Configure AI assistant specifications */
    fun runs(): RunServiceAsync

    /** Creates a comprehensive test configuration for evaluating AI assistant performance */
    fun create(params: TestCreateParams): CompletableFuture<AssistantTest> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssistantTest>

    /** Retrieves detailed information about a specific assistant test */
    fun retrieve(testId: String): CompletableFuture<AssistantTest> =
        retrieve(testId, TestRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        testId: String,
        params: TestRetrieveParams = TestRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssistantTest> =
        retrieve(params.toBuilder().testId(testId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        testId: String,
        params: TestRetrieveParams = TestRetrieveParams.none(),
    ): CompletableFuture<AssistantTest> = retrieve(testId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssistantTest>

    /** @see retrieve */
    fun retrieve(params: TestRetrieveParams): CompletableFuture<AssistantTest> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(testId: String, requestOptions: RequestOptions): CompletableFuture<AssistantTest> =
        retrieve(testId, TestRetrieveParams.none(), requestOptions)

    /** Updates an existing assistant test configuration with new settings */
    fun update(testId: String): CompletableFuture<AssistantTest> =
        update(testId, TestUpdateParams.none())

    /** @see update */
    fun update(
        testId: String,
        params: TestUpdateParams = TestUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssistantTest> =
        update(params.toBuilder().testId(testId).build(), requestOptions)

    /** @see update */
    fun update(
        testId: String,
        params: TestUpdateParams = TestUpdateParams.none(),
    ): CompletableFuture<AssistantTest> = update(testId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TestUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssistantTest>

    /** @see update */
    fun update(params: TestUpdateParams): CompletableFuture<AssistantTest> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(testId: String, requestOptions: RequestOptions): CompletableFuture<AssistantTest> =
        update(testId, TestUpdateParams.none(), requestOptions)

    /** Retrieves a paginated list of assistant tests with optional filtering capabilities */
    fun list(): CompletableFuture<TestListPageAsync> = list(TestListParams.none())

    /** @see list */
    fun list(
        params: TestListParams = TestListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestListPageAsync>

    /** @see list */
    fun list(params: TestListParams = TestListParams.none()): CompletableFuture<TestListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TestListPageAsync> =
        list(TestListParams.none(), requestOptions)

    /** Permanently removes an assistant test and all associated data */
    fun delete(testId: String): CompletableFuture<Void?> = delete(testId, TestDeleteParams.none())

    /** @see delete */
    fun delete(
        testId: String,
        params: TestDeleteParams = TestDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().testId(testId).build(), requestOptions)

    /** @see delete */
    fun delete(
        testId: String,
        params: TestDeleteParams = TestDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(testId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TestDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: TestDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(testId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(testId, TestDeleteParams.none(), requestOptions)

    /** A view of [TestServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestServiceAsync.WithRawResponse

        /** Configure AI assistant specifications */
        fun testSuites(): TestSuiteServiceAsync.WithRawResponse

        /** Configure AI assistant specifications */
        fun runs(): RunServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/assistants/tests`, but is otherwise the same as
         * [TestServiceAsync.create].
         */
        fun create(params: TestCreateParams): CompletableFuture<HttpResponseFor<AssistantTest>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TestCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssistantTest>>

        /**
         * Returns a raw HTTP response for `get /ai/assistants/tests/{test_id}`, but is otherwise
         * the same as [TestServiceAsync.retrieve].
         */
        fun retrieve(testId: String): CompletableFuture<HttpResponseFor<AssistantTest>> =
            retrieve(testId, TestRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            testId: String,
            params: TestRetrieveParams = TestRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssistantTest>> =
            retrieve(params.toBuilder().testId(testId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            testId: String,
            params: TestRetrieveParams = TestRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AssistantTest>> =
            retrieve(testId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TestRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssistantTest>>

        /** @see retrieve */
        fun retrieve(
            params: TestRetrieveParams
        ): CompletableFuture<HttpResponseFor<AssistantTest>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            testId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssistantTest>> =
            retrieve(testId, TestRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /ai/assistants/tests/{test_id}`, but is otherwise
         * the same as [TestServiceAsync.update].
         */
        fun update(testId: String): CompletableFuture<HttpResponseFor<AssistantTest>> =
            update(testId, TestUpdateParams.none())

        /** @see update */
        fun update(
            testId: String,
            params: TestUpdateParams = TestUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssistantTest>> =
            update(params.toBuilder().testId(testId).build(), requestOptions)

        /** @see update */
        fun update(
            testId: String,
            params: TestUpdateParams = TestUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<AssistantTest>> =
            update(testId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TestUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssistantTest>>

        /** @see update */
        fun update(params: TestUpdateParams): CompletableFuture<HttpResponseFor<AssistantTest>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            testId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssistantTest>> =
            update(testId, TestUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/assistants/tests`, but is otherwise the same as
         * [TestServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TestListPageAsync>> =
            list(TestListParams.none())

        /** @see list */
        fun list(
            params: TestListParams = TestListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestListPageAsync>>

        /** @see list */
        fun list(
            params: TestListParams = TestListParams.none()
        ): CompletableFuture<HttpResponseFor<TestListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TestListPageAsync>> =
            list(TestListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/assistants/tests/{test_id}`, but is otherwise
         * the same as [TestServiceAsync.delete].
         */
        fun delete(testId: String): CompletableFuture<HttpResponse> =
            delete(testId, TestDeleteParams.none())

        /** @see delete */
        fun delete(
            testId: String,
            params: TestDeleteParams = TestDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().testId(testId).build(), requestOptions)

        /** @see delete */
        fun delete(
            testId: String,
            params: TestDeleteParams = TestDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(testId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TestDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: TestDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            testId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> = delete(testId, TestDeleteParams.none(), requestOptions)
    }
}
