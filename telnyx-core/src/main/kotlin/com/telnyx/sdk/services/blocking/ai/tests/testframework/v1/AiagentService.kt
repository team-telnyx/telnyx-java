// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.tests.testframework.v1

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.tests.testframework.v1.aiagents.AiagentCreateParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.aiagents.AiagentDeleteParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.aiagents.AiagentDeleteResponse
import com.telnyx.sdk.models.ai.tests.testframework.v1.aiagents.AiagentListParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.aiagents.AiagentListResponse
import com.telnyx.sdk.models.ai.tests.testframework.v1.aiagents.AiagentRetrieveParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.aiagents.AiagentUpdateParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.aiagents.TestAgent
import java.util.function.Consumer

/** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
interface AiagentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AiagentService

    /**
     * Creates a test agent in your organization. The agent wraps a Telnyx AI assistant so simulated
     * callers can be sent against it.
     */
    fun create(params: AiagentCreateParams): TestAgent = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AiagentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestAgent

    /** Returns the specified test agent. */
    fun retrieve(id: Long): TestAgent = retrieve(id, AiagentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: Long,
        params: AiagentRetrieveParams = AiagentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestAgent = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: Long,
        params: AiagentRetrieveParams = AiagentRetrieveParams.none(),
    ): TestAgent = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AiagentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestAgent

    /** @see retrieve */
    fun retrieve(params: AiagentRetrieveParams): TestAgent = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: Long, requestOptions: RequestOptions): TestAgent =
        retrieve(id, AiagentRetrieveParams.none(), requestOptions)

    /** Updates the specified test agent. */
    fun update(id: Long): TestAgent = update(id, AiagentUpdateParams.none())

    /** @see update */
    fun update(
        id: Long,
        params: AiagentUpdateParams = AiagentUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestAgent = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(id: Long, params: AiagentUpdateParams = AiagentUpdateParams.none()): TestAgent =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AiagentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestAgent

    /** @see update */
    fun update(params: AiagentUpdateParams): TestAgent = update(params, RequestOptions.none())

    /** @see update */
    fun update(id: Long, requestOptions: RequestOptions): TestAgent =
        update(id, AiagentUpdateParams.none(), requestOptions)

    /**
     * Returns a paginated list of test agents in your organization. A test agent wraps the Telnyx
     * AI assistant under test and drives simulated callers against it.
     */
    fun list(): AiagentListResponse = list(AiagentListParams.none())

    /** @see list */
    fun list(
        params: AiagentListParams = AiagentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AiagentListResponse

    /** @see list */
    fun list(params: AiagentListParams = AiagentListParams.none()): AiagentListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AiagentListResponse =
        list(AiagentListParams.none(), requestOptions)

    /** Deletes the specified test agent. */
    fun delete(id: Long): AiagentDeleteResponse = delete(id, AiagentDeleteParams.none())

    /** @see delete */
    fun delete(
        id: Long,
        params: AiagentDeleteParams = AiagentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AiagentDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: Long,
        params: AiagentDeleteParams = AiagentDeleteParams.none(),
    ): AiagentDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AiagentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AiagentDeleteResponse

    /** @see delete */
    fun delete(params: AiagentDeleteParams): AiagentDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: Long, requestOptions: RequestOptions): AiagentDeleteResponse =
        delete(id, AiagentDeleteParams.none(), requestOptions)

    /** A view of [AiagentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AiagentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/tests/test_framework/v1/aiagents`, but is
         * otherwise the same as [AiagentService.create].
         */
        @MustBeClosed
        fun create(params: AiagentCreateParams): HttpResponseFor<TestAgent> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AiagentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestAgent>

        /**
         * Returns a raw HTTP response for `get /ai/tests/test_framework/v1/aiagents/{id}`, but is
         * otherwise the same as [AiagentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: Long): HttpResponseFor<TestAgent> =
            retrieve(id, AiagentRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: Long,
            params: AiagentRetrieveParams = AiagentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestAgent> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: Long,
            params: AiagentRetrieveParams = AiagentRetrieveParams.none(),
        ): HttpResponseFor<TestAgent> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AiagentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestAgent>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AiagentRetrieveParams): HttpResponseFor<TestAgent> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: Long, requestOptions: RequestOptions): HttpResponseFor<TestAgent> =
            retrieve(id, AiagentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /ai/tests/test_framework/v1/aiagents/{id}`, but is
         * otherwise the same as [AiagentService.update].
         */
        @MustBeClosed
        fun update(id: Long): HttpResponseFor<TestAgent> = update(id, AiagentUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: Long,
            params: AiagentUpdateParams = AiagentUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestAgent> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: Long,
            params: AiagentUpdateParams = AiagentUpdateParams.none(),
        ): HttpResponseFor<TestAgent> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AiagentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestAgent>

        /** @see update */
        @MustBeClosed
        fun update(params: AiagentUpdateParams): HttpResponseFor<TestAgent> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(id: Long, requestOptions: RequestOptions): HttpResponseFor<TestAgent> =
            update(id, AiagentUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/tests/test_framework/v1/aiagents`, but is
         * otherwise the same as [AiagentService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AiagentListResponse> = list(AiagentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AiagentListParams = AiagentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AiagentListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AiagentListParams = AiagentListParams.none()
        ): HttpResponseFor<AiagentListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AiagentListResponse> =
            list(AiagentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/tests/test_framework/v1/aiagents/{id}`, but
         * is otherwise the same as [AiagentService.delete].
         */
        @MustBeClosed
        fun delete(id: Long): HttpResponseFor<AiagentDeleteResponse> =
            delete(id, AiagentDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: Long,
            params: AiagentDeleteParams = AiagentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AiagentDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: Long,
            params: AiagentDeleteParams = AiagentDeleteParams.none(),
        ): HttpResponseFor<AiagentDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AiagentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AiagentDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: AiagentDeleteParams): HttpResponseFor<AiagentDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AiagentDeleteResponse> =
            delete(id, AiagentDeleteParams.none(), requestOptions)
    }
}
