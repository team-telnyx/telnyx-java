// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.agentgateways

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.agentgateways.apis.AgentGatewayApiResponse
import com.telnyx.sdk.models.agentgateways.apis.ApiCreateParams
import com.telnyx.sdk.models.agentgateways.apis.ApiDeleteParams
import com.telnyx.sdk.models.agentgateways.apis.ApiListParams
import com.telnyx.sdk.models.agentgateways.apis.ApiListResponse
import com.telnyx.sdk.models.agentgateways.apis.ApiUpdateParams
import java.util.function.Consumer

/** REST APIs on an instance, served to agents as tools. */
interface ApiService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ApiService

    /**
     * Adds a REST API by its OpenAPI description. Each operation becomes a tool at
     * `{gateway_url}/mcp`, named with the API's `name`, a hyphen, and the lowercased `operationId`.
     * A description the gateway cannot fetch yields an API with no tools. The instance must be
     * `ready`; otherwise the request answers `409`.
     */
    fun create(instanceId: String, params: ApiCreateParams): AgentGatewayApiResponse =
        create(instanceId, params, RequestOptions.none())

    /** @see create */
    fun create(
        instanceId: String,
        params: ApiCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayApiResponse =
        create(params.toBuilder().instanceId(instanceId).build(), requestOptions)

    /** @see create */
    fun create(params: ApiCreateParams): AgentGatewayApiResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ApiCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayApiResponse

    /**
     * Changes an API's settings. A field left out stays as it is, `"base_url": null` clears the
     * base URL, and `auth` is replaced whole. The instance must be `ready`; otherwise the request
     * answers `409`.
     */
    fun update(apiId: String, params: ApiUpdateParams): AgentGatewayApiResponse =
        update(apiId, params, RequestOptions.none())

    /** @see update */
    fun update(
        apiId: String,
        params: ApiUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayApiResponse = update(params.toBuilder().apiId(apiId).build(), requestOptions)

    /** @see update */
    fun update(params: ApiUpdateParams): AgentGatewayApiResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ApiUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayApiResponse

    /**
     * Lists the REST APIs the instance serves as tools, without their credentials. The instance
     * must be `ready`; otherwise the request answers `409`.
     */
    fun list(instanceId: String): ApiListResponse = list(instanceId, ApiListParams.none())

    /** @see list */
    fun list(
        instanceId: String,
        params: ApiListParams = ApiListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiListResponse = list(params.toBuilder().instanceId(instanceId).build(), requestOptions)

    /** @see list */
    fun list(instanceId: String, params: ApiListParams = ApiListParams.none()): ApiListResponse =
        list(instanceId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ApiListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiListResponse

    /** @see list */
    fun list(params: ApiListParams): ApiListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(instanceId: String, requestOptions: RequestOptions): ApiListResponse =
        list(instanceId, ApiListParams.none(), requestOptions)

    /**
     * Removes an API and returns it as it was. An MCP server's `id` answers `404`. The instance
     * must be `ready`; otherwise the request answers `409`.
     */
    fun delete(apiId: String, params: ApiDeleteParams): AgentGatewayApiResponse =
        delete(apiId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        apiId: String,
        params: ApiDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayApiResponse = delete(params.toBuilder().apiId(apiId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ApiDeleteParams): AgentGatewayApiResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ApiDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayApiResponse

    /** A view of [ApiService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ApiService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /agent_gateways/{instance_id}/apis`, but is
         * otherwise the same as [ApiService.create].
         */
        @MustBeClosed
        fun create(
            instanceId: String,
            params: ApiCreateParams,
        ): HttpResponseFor<AgentGatewayApiResponse> =
            create(instanceId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            instanceId: String,
            params: ApiCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayApiResponse> =
            create(params.toBuilder().instanceId(instanceId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: ApiCreateParams): HttpResponseFor<AgentGatewayApiResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ApiCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayApiResponse>

        /**
         * Returns a raw HTTP response for `patch /agent_gateways/{instance_id}/apis/{api_id}`, but
         * is otherwise the same as [ApiService.update].
         */
        @MustBeClosed
        fun update(
            apiId: String,
            params: ApiUpdateParams,
        ): HttpResponseFor<AgentGatewayApiResponse> = update(apiId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            apiId: String,
            params: ApiUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayApiResponse> =
            update(params.toBuilder().apiId(apiId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ApiUpdateParams): HttpResponseFor<AgentGatewayApiResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ApiUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayApiResponse>

        /**
         * Returns a raw HTTP response for `get /agent_gateways/{instance_id}/apis`, but is
         * otherwise the same as [ApiService.list].
         */
        @MustBeClosed
        fun list(instanceId: String): HttpResponseFor<ApiListResponse> =
            list(instanceId, ApiListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            instanceId: String,
            params: ApiListParams = ApiListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiListResponse> =
            list(params.toBuilder().instanceId(instanceId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            instanceId: String,
            params: ApiListParams = ApiListParams.none(),
        ): HttpResponseFor<ApiListResponse> = list(instanceId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ApiListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: ApiListParams): HttpResponseFor<ApiListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            instanceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiListResponse> = list(instanceId, ApiListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /agent_gateways/{instance_id}/apis/{api_id}`, but
         * is otherwise the same as [ApiService.delete].
         */
        @MustBeClosed
        fun delete(
            apiId: String,
            params: ApiDeleteParams,
        ): HttpResponseFor<AgentGatewayApiResponse> = delete(apiId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            apiId: String,
            params: ApiDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayApiResponse> =
            delete(params.toBuilder().apiId(apiId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: ApiDeleteParams): HttpResponseFor<AgentGatewayApiResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ApiDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayApiResponse>
    }
}
