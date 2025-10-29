// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.integrations.IntegrationListParams
import com.telnyx.sdk.models.ai.integrations.IntegrationListResponse
import com.telnyx.sdk.models.ai.integrations.IntegrationRetrieveParams
import com.telnyx.sdk.models.ai.integrations.IntegrationRetrieveResponse
import com.telnyx.sdk.services.blocking.ai.integrations.ConnectionService
import java.util.function.Consumer

interface IntegrationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IntegrationService

    fun connections(): ConnectionService

    /** Retrieve integration details */
    fun retrieve(integrationId: String): IntegrationRetrieveResponse =
        retrieve(integrationId, IntegrationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        integrationId: String,
        params: IntegrationRetrieveParams = IntegrationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegrationRetrieveResponse =
        retrieve(params.toBuilder().integrationId(integrationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        integrationId: String,
        params: IntegrationRetrieveParams = IntegrationRetrieveParams.none(),
    ): IntegrationRetrieveResponse = retrieve(integrationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: IntegrationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegrationRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: IntegrationRetrieveParams): IntegrationRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        integrationId: String,
        requestOptions: RequestOptions,
    ): IntegrationRetrieveResponse =
        retrieve(integrationId, IntegrationRetrieveParams.none(), requestOptions)

    /** List all available integrations. */
    fun list(): IntegrationListResponse = list(IntegrationListParams.none())

    /** @see list */
    fun list(
        params: IntegrationListParams = IntegrationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegrationListResponse

    /** @see list */
    fun list(
        params: IntegrationListParams = IntegrationListParams.none()
    ): IntegrationListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): IntegrationListResponse =
        list(IntegrationListParams.none(), requestOptions)

    /**
     * A view of [IntegrationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IntegrationService.WithRawResponse

        fun connections(): ConnectionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/integrations/{integration_id}`, but is otherwise
         * the same as [IntegrationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(integrationId: String): HttpResponseFor<IntegrationRetrieveResponse> =
            retrieve(integrationId, IntegrationRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            integrationId: String,
            params: IntegrationRetrieveParams = IntegrationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegrationRetrieveResponse> =
            retrieve(params.toBuilder().integrationId(integrationId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            integrationId: String,
            params: IntegrationRetrieveParams = IntegrationRetrieveParams.none(),
        ): HttpResponseFor<IntegrationRetrieveResponse> =
            retrieve(integrationId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: IntegrationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegrationRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: IntegrationRetrieveParams
        ): HttpResponseFor<IntegrationRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            integrationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntegrationRetrieveResponse> =
            retrieve(integrationId, IntegrationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/integrations`, but is otherwise the same as
         * [IntegrationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<IntegrationListResponse> = list(IntegrationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: IntegrationListParams = IntegrationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegrationListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: IntegrationListParams = IntegrationListParams.none()
        ): HttpResponseFor<IntegrationListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<IntegrationListResponse> =
            list(IntegrationListParams.none(), requestOptions)
    }
}
