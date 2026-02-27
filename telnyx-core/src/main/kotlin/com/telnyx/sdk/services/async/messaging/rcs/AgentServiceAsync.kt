// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.messaging.rcs

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messaging.rcs.agents.AgentListPageAsync
import com.telnyx.sdk.models.messaging.rcs.agents.AgentListParams
import com.telnyx.sdk.models.messaging.rcs.agents.AgentRetrieveParams
import com.telnyx.sdk.models.messaging.rcs.agents.AgentUpdateParams
import com.telnyx.sdk.models.rcsagents.RcsAgentResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Send RCS messages */
interface AgentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentServiceAsync

    /** Retrieve an RCS agent */
    fun retrieve(id: String): CompletableFuture<RcsAgentResponse> =
        retrieve(id, AgentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AgentRetrieveParams = AgentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RcsAgentResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AgentRetrieveParams = AgentRetrieveParams.none(),
    ): CompletableFuture<RcsAgentResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AgentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RcsAgentResponse>

    /** @see retrieve */
    fun retrieve(params: AgentRetrieveParams): CompletableFuture<RcsAgentResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<RcsAgentResponse> =
        retrieve(id, AgentRetrieveParams.none(), requestOptions)

    /** Modify an RCS agent */
    fun update(id: String): CompletableFuture<RcsAgentResponse> =
        update(id, AgentUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: AgentUpdateParams = AgentUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RcsAgentResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: AgentUpdateParams = AgentUpdateParams.none(),
    ): CompletableFuture<RcsAgentResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AgentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RcsAgentResponse>

    /** @see update */
    fun update(params: AgentUpdateParams): CompletableFuture<RcsAgentResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<RcsAgentResponse> =
        update(id, AgentUpdateParams.none(), requestOptions)

    /** List all RCS agents */
    fun list(): CompletableFuture<AgentListPageAsync> = list(AgentListParams.none())

    /** @see list */
    fun list(
        params: AgentListParams = AgentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentListPageAsync>

    /** @see list */
    fun list(
        params: AgentListParams = AgentListParams.none()
    ): CompletableFuture<AgentListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AgentListPageAsync> =
        list(AgentListParams.none(), requestOptions)

    /** A view of [AgentServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AgentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /messaging/rcs/agents/{id}`, but is otherwise the
         * same as [AgentServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<RcsAgentResponse>> =
            retrieve(id, AgentRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AgentRetrieveParams = AgentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RcsAgentResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AgentRetrieveParams = AgentRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<RcsAgentResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AgentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RcsAgentResponse>>

        /** @see retrieve */
        fun retrieve(
            params: AgentRetrieveParams
        ): CompletableFuture<HttpResponseFor<RcsAgentResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RcsAgentResponse>> =
            retrieve(id, AgentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /messaging/rcs/agents/{id}`, but is otherwise the
         * same as [AgentServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<RcsAgentResponse>> =
            update(id, AgentUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: AgentUpdateParams = AgentUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RcsAgentResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: AgentUpdateParams = AgentUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<RcsAgentResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AgentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RcsAgentResponse>>

        /** @see update */
        fun update(
            params: AgentUpdateParams
        ): CompletableFuture<HttpResponseFor<RcsAgentResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RcsAgentResponse>> =
            update(id, AgentUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /messaging/rcs/agents`, but is otherwise the same as
         * [AgentServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AgentListPageAsync>> =
            list(AgentListParams.none())

        /** @see list */
        fun list(
            params: AgentListParams = AgentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentListPageAsync>>

        /** @see list */
        fun list(
            params: AgentListParams = AgentListParams.none()
        ): CompletableFuture<HttpResponseFor<AgentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AgentListPageAsync>> =
            list(AgentListParams.none(), requestOptions)
    }
}
