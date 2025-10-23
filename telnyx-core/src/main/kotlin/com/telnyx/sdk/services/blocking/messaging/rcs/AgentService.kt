// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messaging.rcs

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messaging.rcs.agents.AgentListParams
import com.telnyx.sdk.models.messaging.rcs.agents.AgentListResponse
import com.telnyx.sdk.models.messaging.rcs.agents.AgentRetrieveParams
import com.telnyx.sdk.models.messaging.rcs.agents.AgentUpdateParams
import com.telnyx.sdk.models.rcsagents.RcsAgentResponse
import java.util.function.Consumer

interface AgentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentService

    /** Retrieve an RCS agent */
    fun retrieve(id: String): RcsAgentResponse = retrieve(id, AgentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AgentRetrieveParams = AgentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RcsAgentResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AgentRetrieveParams = AgentRetrieveParams.none(),
    ): RcsAgentResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AgentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RcsAgentResponse

    /** @see retrieve */
    fun retrieve(params: AgentRetrieveParams): RcsAgentResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): RcsAgentResponse =
        retrieve(id, AgentRetrieveParams.none(), requestOptions)

    /** Modify an RCS agent */
    fun update(id: String): RcsAgentResponse = update(id, AgentUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: AgentUpdateParams = AgentUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RcsAgentResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(id: String, params: AgentUpdateParams = AgentUpdateParams.none()): RcsAgentResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AgentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RcsAgentResponse

    /** @see update */
    fun update(params: AgentUpdateParams): RcsAgentResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): RcsAgentResponse =
        update(id, AgentUpdateParams.none(), requestOptions)

    /** List all RCS agents */
    fun list(): AgentListResponse = list(AgentListParams.none())

    /** @see list */
    fun list(
        params: AgentListParams = AgentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentListResponse

    /** @see list */
    fun list(params: AgentListParams = AgentListParams.none()): AgentListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AgentListResponse =
        list(AgentListParams.none(), requestOptions)

    /** A view of [AgentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /messaging/rcs/agents/{id}`, but is otherwise the
         * same as [AgentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<RcsAgentResponse> =
            retrieve(id, AgentRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AgentRetrieveParams = AgentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RcsAgentResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AgentRetrieveParams = AgentRetrieveParams.none(),
        ): HttpResponseFor<RcsAgentResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AgentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RcsAgentResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AgentRetrieveParams): HttpResponseFor<RcsAgentResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RcsAgentResponse> =
            retrieve(id, AgentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /messaging/rcs/agents/{id}`, but is otherwise the
         * same as [AgentService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<RcsAgentResponse> =
            update(id, AgentUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: AgentUpdateParams = AgentUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RcsAgentResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: AgentUpdateParams = AgentUpdateParams.none(),
        ): HttpResponseFor<RcsAgentResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AgentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RcsAgentResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: AgentUpdateParams): HttpResponseFor<RcsAgentResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<RcsAgentResponse> =
            update(id, AgentUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /messaging/rcs/agents`, but is otherwise the same as
         * [AgentService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<AgentListResponse> = list(AgentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AgentListParams = AgentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AgentListParams = AgentListParams.none()
        ): HttpResponseFor<AgentListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AgentListResponse> =
            list(AgentListParams.none(), requestOptions)
    }
}
