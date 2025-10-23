// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.assistants

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.assistants.tests.AssistantTest
import com.telnyx.sdk.models.ai.assistants.tests.TestCreateParams
import com.telnyx.sdk.models.ai.assistants.tests.TestDeleteParams
import com.telnyx.sdk.models.ai.assistants.tests.TestDeleteResponse
import com.telnyx.sdk.models.ai.assistants.tests.TestListParams
import com.telnyx.sdk.models.ai.assistants.tests.TestListResponse
import com.telnyx.sdk.models.ai.assistants.tests.TestRetrieveParams
import com.telnyx.sdk.models.ai.assistants.tests.TestUpdateParams
import com.telnyx.sdk.services.blocking.ai.assistants.tests.RunService
import com.telnyx.sdk.services.blocking.ai.assistants.tests.TestSuiteService
import java.util.function.Consumer

interface TestService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestService

    fun testSuites(): TestSuiteService

    fun runs(): RunService

    /** Creates a comprehensive test configuration for evaluating AI assistant performance */
    fun create(params: TestCreateParams): AssistantTest = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssistantTest

    /** Retrieves detailed information about a specific assistant test */
    fun retrieve(testId: String): AssistantTest = retrieve(testId, TestRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        testId: String,
        params: TestRetrieveParams = TestRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssistantTest = retrieve(params.toBuilder().testId(testId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        testId: String,
        params: TestRetrieveParams = TestRetrieveParams.none(),
    ): AssistantTest = retrieve(testId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssistantTest

    /** @see retrieve */
    fun retrieve(params: TestRetrieveParams): AssistantTest =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(testId: String, requestOptions: RequestOptions): AssistantTest =
        retrieve(testId, TestRetrieveParams.none(), requestOptions)

    /** Updates an existing assistant test configuration with new settings */
    fun update(testId: String): AssistantTest = update(testId, TestUpdateParams.none())

    /** @see update */
    fun update(
        testId: String,
        params: TestUpdateParams = TestUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssistantTest = update(params.toBuilder().testId(testId).build(), requestOptions)

    /** @see update */
    fun update(testId: String, params: TestUpdateParams = TestUpdateParams.none()): AssistantTest =
        update(testId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TestUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssistantTest

    /** @see update */
    fun update(params: TestUpdateParams): AssistantTest = update(params, RequestOptions.none())

    /** @see update */
    fun update(testId: String, requestOptions: RequestOptions): AssistantTest =
        update(testId, TestUpdateParams.none(), requestOptions)

    /** Retrieves a paginated list of assistant tests with optional filtering capabilities */
    fun list(): TestListResponse = list(TestListParams.none())

    /** @see list */
    fun list(
        params: TestListParams = TestListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestListResponse

    /** @see list */
    fun list(params: TestListParams = TestListParams.none()): TestListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): TestListResponse =
        list(TestListParams.none(), requestOptions)

    /** Permanently removes an assistant test and all associated data */
    fun delete(testId: String): TestDeleteResponse = delete(testId, TestDeleteParams.none())

    /** @see delete */
    fun delete(
        testId: String,
        params: TestDeleteParams = TestDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestDeleteResponse = delete(params.toBuilder().testId(testId).build(), requestOptions)

    /** @see delete */
    fun delete(
        testId: String,
        params: TestDeleteParams = TestDeleteParams.none(),
    ): TestDeleteResponse = delete(testId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TestDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestDeleteResponse

    /** @see delete */
    fun delete(params: TestDeleteParams): TestDeleteResponse = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(testId: String, requestOptions: RequestOptions): TestDeleteResponse =
        delete(testId, TestDeleteParams.none(), requestOptions)

    /** A view of [TestService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestService.WithRawResponse

        fun testSuites(): TestSuiteService.WithRawResponse

        fun runs(): RunService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/assistants/tests`, but is otherwise the same as
         * [TestService.create].
         */
        @MustBeClosed
        fun create(params: TestCreateParams): HttpResponseFor<AssistantTest> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TestCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssistantTest>

        /**
         * Returns a raw HTTP response for `get /ai/assistants/tests/{test_id}`, but is otherwise
         * the same as [TestService.retrieve].
         */
        @MustBeClosed
        fun retrieve(testId: String): HttpResponseFor<AssistantTest> =
            retrieve(testId, TestRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            testId: String,
            params: TestRetrieveParams = TestRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssistantTest> =
            retrieve(params.toBuilder().testId(testId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            testId: String,
            params: TestRetrieveParams = TestRetrieveParams.none(),
        ): HttpResponseFor<AssistantTest> = retrieve(testId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TestRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssistantTest>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: TestRetrieveParams): HttpResponseFor<AssistantTest> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            testId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssistantTest> =
            retrieve(testId, TestRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /ai/assistants/tests/{test_id}`, but is otherwise
         * the same as [TestService.update].
         */
        @MustBeClosed
        fun update(testId: String): HttpResponseFor<AssistantTest> =
            update(testId, TestUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            testId: String,
            params: TestUpdateParams = TestUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssistantTest> =
            update(params.toBuilder().testId(testId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            testId: String,
            params: TestUpdateParams = TestUpdateParams.none(),
        ): HttpResponseFor<AssistantTest> = update(testId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: TestUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssistantTest>

        /** @see update */
        @MustBeClosed
        fun update(params: TestUpdateParams): HttpResponseFor<AssistantTest> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(testId: String, requestOptions: RequestOptions): HttpResponseFor<AssistantTest> =
            update(testId, TestUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/assistants/tests`, but is otherwise the same as
         * [TestService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<TestListResponse> = list(TestListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TestListParams = TestListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: TestListParams = TestListParams.none()
        ): HttpResponseFor<TestListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TestListResponse> =
            list(TestListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/assistants/tests/{test_id}`, but is otherwise
         * the same as [TestService.delete].
         */
        @MustBeClosed
        fun delete(testId: String): HttpResponseFor<TestDeleteResponse> =
            delete(testId, TestDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            testId: String,
            params: TestDeleteParams = TestDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestDeleteResponse> =
            delete(params.toBuilder().testId(testId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            testId: String,
            params: TestDeleteParams = TestDeleteParams.none(),
        ): HttpResponseFor<TestDeleteResponse> = delete(testId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TestDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: TestDeleteParams): HttpResponseFor<TestDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            testId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TestDeleteResponse> =
            delete(testId, TestDeleteParams.none(), requestOptions)
    }
}
