// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.integrations.Integration
import com.telnyx.sdk.models.ai.integrations.IntegrationListParams
import com.telnyx.sdk.models.ai.integrations.IntegrationListResponse
import com.telnyx.sdk.models.ai.integrations.IntegrationRetrieveParams
import com.telnyx.sdk.services.async.ai.integrations.ConnectionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface IntegrationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IntegrationServiceAsync

    fun connections(): ConnectionServiceAsync

    /** Retrieve integration details */
    fun retrieve(integrationId: String): CompletableFuture<Integration> =
        retrieve(integrationId, IntegrationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        integrationId: String,
        params: IntegrationRetrieveParams = IntegrationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Integration> =
        retrieve(params.toBuilder().integrationId(integrationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        integrationId: String,
        params: IntegrationRetrieveParams = IntegrationRetrieveParams.none(),
    ): CompletableFuture<Integration> = retrieve(integrationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: IntegrationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Integration>

    /** @see retrieve */
    fun retrieve(params: IntegrationRetrieveParams): CompletableFuture<Integration> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        integrationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Integration> =
        retrieve(integrationId, IntegrationRetrieveParams.none(), requestOptions)

    /** List all available integrations. */
    fun list(): CompletableFuture<IntegrationListResponse> = list(IntegrationListParams.none())

    /** @see list */
    fun list(
        params: IntegrationListParams = IntegrationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegrationListResponse>

    /** @see list */
    fun list(
        params: IntegrationListParams = IntegrationListParams.none()
    ): CompletableFuture<IntegrationListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<IntegrationListResponse> =
        list(IntegrationListParams.none(), requestOptions)

    /**
     * A view of [IntegrationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IntegrationServiceAsync.WithRawResponse

        fun connections(): ConnectionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/integrations/{integration_id}`, but is otherwise
         * the same as [IntegrationServiceAsync.retrieve].
         */
        fun retrieve(integrationId: String): CompletableFuture<HttpResponseFor<Integration>> =
            retrieve(integrationId, IntegrationRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            integrationId: String,
            params: IntegrationRetrieveParams = IntegrationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Integration>> =
            retrieve(params.toBuilder().integrationId(integrationId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            integrationId: String,
            params: IntegrationRetrieveParams = IntegrationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Integration>> =
            retrieve(integrationId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: IntegrationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Integration>>

        /** @see retrieve */
        fun retrieve(
            params: IntegrationRetrieveParams
        ): CompletableFuture<HttpResponseFor<Integration>> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            integrationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Integration>> =
            retrieve(integrationId, IntegrationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/integrations`, but is otherwise the same as
         * [IntegrationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<IntegrationListResponse>> =
            list(IntegrationListParams.none())

        /** @see list */
        fun list(
            params: IntegrationListParams = IntegrationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegrationListResponse>>

        /** @see list */
        fun list(
            params: IntegrationListParams = IntegrationListParams.none()
        ): CompletableFuture<HttpResponseFor<IntegrationListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<IntegrationListResponse>> =
            list(IntegrationListParams.none(), requestOptions)
    }
}
