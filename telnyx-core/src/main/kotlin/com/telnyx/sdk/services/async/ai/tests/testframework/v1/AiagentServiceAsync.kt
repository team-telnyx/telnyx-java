// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.tests.testframework.v1

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
interface AiagentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AiagentServiceAsync

    /**
     * Creates a test agent in your organization. The agent wraps a Telnyx AI assistant so simulated
     * callers can be sent against it.
     */
    fun create(params: AiagentCreateParams): CompletableFuture<TestAgent> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AiagentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestAgent>

    /** Returns the specified test agent. */
    fun retrieve(id: Long): CompletableFuture<TestAgent> =
        retrieve(id, AiagentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: Long,
        params: AiagentRetrieveParams = AiagentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestAgent> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: Long,
        params: AiagentRetrieveParams = AiagentRetrieveParams.none(),
    ): CompletableFuture<TestAgent> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AiagentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestAgent>

    /** @see retrieve */
    fun retrieve(params: AiagentRetrieveParams): CompletableFuture<TestAgent> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: Long, requestOptions: RequestOptions): CompletableFuture<TestAgent> =
        retrieve(id, AiagentRetrieveParams.none(), requestOptions)

    /** Updates the specified test agent. */
    fun update(id: Long): CompletableFuture<TestAgent> = update(id, AiagentUpdateParams.none())

    /** @see update */
    fun update(
        id: Long,
        params: AiagentUpdateParams = AiagentUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestAgent> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: Long,
        params: AiagentUpdateParams = AiagentUpdateParams.none(),
    ): CompletableFuture<TestAgent> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AiagentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestAgent>

    /** @see update */
    fun update(params: AiagentUpdateParams): CompletableFuture<TestAgent> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: Long, requestOptions: RequestOptions): CompletableFuture<TestAgent> =
        update(id, AiagentUpdateParams.none(), requestOptions)

    /**
     * Returns a paginated list of test agents in your organization. A test agent wraps the Telnyx
     * AI assistant under test and drives simulated callers against it.
     */
    fun list(): CompletableFuture<AiagentListResponse> = list(AiagentListParams.none())

    /** @see list */
    fun list(
        params: AiagentListParams = AiagentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AiagentListResponse>

    /** @see list */
    fun list(
        params: AiagentListParams = AiagentListParams.none()
    ): CompletableFuture<AiagentListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AiagentListResponse> =
        list(AiagentListParams.none(), requestOptions)

    /** Deletes the specified test agent. */
    fun delete(id: Long): CompletableFuture<AiagentDeleteResponse> =
        delete(id, AiagentDeleteParams.none())

    /** @see delete */
    fun delete(
        id: Long,
        params: AiagentDeleteParams = AiagentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AiagentDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: Long,
        params: AiagentDeleteParams = AiagentDeleteParams.none(),
    ): CompletableFuture<AiagentDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AiagentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AiagentDeleteResponse>

    /** @see delete */
    fun delete(params: AiagentDeleteParams): CompletableFuture<AiagentDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: Long, requestOptions: RequestOptions): CompletableFuture<AiagentDeleteResponse> =
        delete(id, AiagentDeleteParams.none(), requestOptions)

    /**
     * A view of [AiagentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AiagentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/tests/test_framework/v1/aiagents`, but is
         * otherwise the same as [AiagentServiceAsync.create].
         */
        fun create(params: AiagentCreateParams): CompletableFuture<HttpResponseFor<TestAgent>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AiagentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestAgent>>

        /**
         * Returns a raw HTTP response for `get /ai/tests/test_framework/v1/aiagents/{id}`, but is
         * otherwise the same as [AiagentServiceAsync.retrieve].
         */
        fun retrieve(id: Long): CompletableFuture<HttpResponseFor<TestAgent>> =
            retrieve(id, AiagentRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: Long,
            params: AiagentRetrieveParams = AiagentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestAgent>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: Long,
            params: AiagentRetrieveParams = AiagentRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TestAgent>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AiagentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestAgent>>

        /** @see retrieve */
        fun retrieve(params: AiagentRetrieveParams): CompletableFuture<HttpResponseFor<TestAgent>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TestAgent>> =
            retrieve(id, AiagentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /ai/tests/test_framework/v1/aiagents/{id}`, but is
         * otherwise the same as [AiagentServiceAsync.update].
         */
        fun update(id: Long): CompletableFuture<HttpResponseFor<TestAgent>> =
            update(id, AiagentUpdateParams.none())

        /** @see update */
        fun update(
            id: Long,
            params: AiagentUpdateParams = AiagentUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestAgent>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: Long,
            params: AiagentUpdateParams = AiagentUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<TestAgent>> = update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AiagentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestAgent>>

        /** @see update */
        fun update(params: AiagentUpdateParams): CompletableFuture<HttpResponseFor<TestAgent>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TestAgent>> =
            update(id, AiagentUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/tests/test_framework/v1/aiagents`, but is
         * otherwise the same as [AiagentServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AiagentListResponse>> =
            list(AiagentListParams.none())

        /** @see list */
        fun list(
            params: AiagentListParams = AiagentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AiagentListResponse>>

        /** @see list */
        fun list(
            params: AiagentListParams = AiagentListParams.none()
        ): CompletableFuture<HttpResponseFor<AiagentListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AiagentListResponse>> =
            list(AiagentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/tests/test_framework/v1/aiagents/{id}`, but
         * is otherwise the same as [AiagentServiceAsync.delete].
         */
        fun delete(id: Long): CompletableFuture<HttpResponseFor<AiagentDeleteResponse>> =
            delete(id, AiagentDeleteParams.none())

        /** @see delete */
        fun delete(
            id: Long,
            params: AiagentDeleteParams = AiagentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AiagentDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: Long,
            params: AiagentDeleteParams = AiagentDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<AiagentDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AiagentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AiagentDeleteResponse>>

        /** @see delete */
        fun delete(
            params: AiagentDeleteParams
        ): CompletableFuture<HttpResponseFor<AiagentDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AiagentDeleteResponse>> =
            delete(id, AiagentDeleteParams.none(), requestOptions)
    }
}
