// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.integrationsecrets.IntegrationSecretCreateParams
import com.telnyx.api.models.integrationsecrets.IntegrationSecretCreateResponse
import com.telnyx.api.models.integrationsecrets.IntegrationSecretDeleteParams
import com.telnyx.api.models.integrationsecrets.IntegrationSecretListParams
import com.telnyx.api.models.integrationsecrets.IntegrationSecretListResponse
import java.util.function.Consumer

interface IntegrationSecretService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IntegrationSecretService

    /**
     * Create a new secret with an associated identifier that can be used to securely integrate with
     * other services.
     */
    fun create(params: IntegrationSecretCreateParams): IntegrationSecretCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: IntegrationSecretCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegrationSecretCreateResponse

    /** Retrieve a list of all integration secrets configured by the user. */
    fun list(): IntegrationSecretListResponse = list(IntegrationSecretListParams.none())

    /** @see list */
    fun list(
        params: IntegrationSecretListParams = IntegrationSecretListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegrationSecretListResponse

    /** @see list */
    fun list(
        params: IntegrationSecretListParams = IntegrationSecretListParams.none()
    ): IntegrationSecretListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): IntegrationSecretListResponse =
        list(IntegrationSecretListParams.none(), requestOptions)

    /** Delete an integration secret given its ID. */
    fun delete(id: String) = delete(id, IntegrationSecretDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: IntegrationSecretDeleteParams = IntegrationSecretDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: IntegrationSecretDeleteParams = IntegrationSecretDeleteParams.none(),
    ) = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: IntegrationSecretDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: IntegrationSecretDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, IntegrationSecretDeleteParams.none(), requestOptions)

    /**
     * A view of [IntegrationSecretService] that provides access to raw HTTP responses for each
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
        ): IntegrationSecretService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /integration_secrets`, but is otherwise the same as
         * [IntegrationSecretService.create].
         */
        @MustBeClosed
        fun create(
            params: IntegrationSecretCreateParams
        ): HttpResponseFor<IntegrationSecretCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: IntegrationSecretCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegrationSecretCreateResponse>

        /**
         * Returns a raw HTTP response for `get /integration_secrets`, but is otherwise the same as
         * [IntegrationSecretService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<IntegrationSecretListResponse> =
            list(IntegrationSecretListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: IntegrationSecretListParams = IntegrationSecretListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegrationSecretListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: IntegrationSecretListParams = IntegrationSecretListParams.none()
        ): HttpResponseFor<IntegrationSecretListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<IntegrationSecretListResponse> =
            list(IntegrationSecretListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /integration_secrets/{id}`, but is otherwise the
         * same as [IntegrationSecretService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, IntegrationSecretDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: IntegrationSecretDeleteParams = IntegrationSecretDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: IntegrationSecretDeleteParams = IntegrationSecretDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: IntegrationSecretDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: IntegrationSecretDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, IntegrationSecretDeleteParams.none(), requestOptions)
    }
}
