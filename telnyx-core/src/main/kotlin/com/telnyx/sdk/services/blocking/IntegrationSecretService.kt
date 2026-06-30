// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.integrationsecrets.IntegrationSecretCreateParams
import com.telnyx.sdk.models.integrationsecrets.IntegrationSecretCreateResponse
import com.telnyx.sdk.models.integrationsecrets.IntegrationSecretDeleteParams
import com.telnyx.sdk.models.integrationsecrets.IntegrationSecretListPage
import com.telnyx.sdk.models.integrationsecrets.IntegrationSecretListParams
import java.util.function.Consumer

/** Store and retrieve integration secrets */
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
    fun list(): IntegrationSecretListPage = list(IntegrationSecretListParams.none())

    /** @see list */
    fun list(
        params: IntegrationSecretListParams = IntegrationSecretListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegrationSecretListPage

    /** @see list */
    fun list(
        params: IntegrationSecretListParams = IntegrationSecretListParams.none()
    ): IntegrationSecretListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): IntegrationSecretListPage =
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
        fun list(): HttpResponseFor<IntegrationSecretListPage> =
            list(IntegrationSecretListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: IntegrationSecretListParams = IntegrationSecretListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegrationSecretListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: IntegrationSecretListParams = IntegrationSecretListParams.none()
        ): HttpResponseFor<IntegrationSecretListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<IntegrationSecretListPage> =
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
