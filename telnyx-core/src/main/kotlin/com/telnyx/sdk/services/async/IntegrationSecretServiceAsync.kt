// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.integrationsecrets.IntegrationSecretCreateParams
import com.telnyx.sdk.models.integrationsecrets.IntegrationSecretCreateResponse
import com.telnyx.sdk.models.integrationsecrets.IntegrationSecretDeleteParams
import com.telnyx.sdk.models.integrationsecrets.IntegrationSecretListParams
import com.telnyx.sdk.models.integrationsecrets.IntegrationSecretListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface IntegrationSecretServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IntegrationSecretServiceAsync

    /**
     * Create a new secret with an associated identifier that can be used to securely integrate with
     * other services.
     */
    fun create(
        params: IntegrationSecretCreateParams
    ): CompletableFuture<IntegrationSecretCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: IntegrationSecretCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegrationSecretCreateResponse>

    /** Retrieve a list of all integration secrets configured by the user. */
    fun list(): CompletableFuture<IntegrationSecretListResponse> =
        list(IntegrationSecretListParams.none())

    /** @see list */
    fun list(
        params: IntegrationSecretListParams = IntegrationSecretListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegrationSecretListResponse>

    /** @see list */
    fun list(
        params: IntegrationSecretListParams = IntegrationSecretListParams.none()
    ): CompletableFuture<IntegrationSecretListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<IntegrationSecretListResponse> =
        list(IntegrationSecretListParams.none(), requestOptions)

    /** Delete an integration secret given its ID. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(id, IntegrationSecretDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: IntegrationSecretDeleteParams = IntegrationSecretDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: IntegrationSecretDeleteParams = IntegrationSecretDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: IntegrationSecretDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: IntegrationSecretDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, IntegrationSecretDeleteParams.none(), requestOptions)

    /**
     * A view of [IntegrationSecretServiceAsync] that provides access to raw HTTP responses for each
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
        ): IntegrationSecretServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /integration_secrets`, but is otherwise the same as
         * [IntegrationSecretServiceAsync.create].
         */
        fun create(
            params: IntegrationSecretCreateParams
        ): CompletableFuture<HttpResponseFor<IntegrationSecretCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: IntegrationSecretCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegrationSecretCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /integration_secrets`, but is otherwise the same as
         * [IntegrationSecretServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<IntegrationSecretListResponse>> =
            list(IntegrationSecretListParams.none())

        /** @see list */
        fun list(
            params: IntegrationSecretListParams = IntegrationSecretListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegrationSecretListResponse>>

        /** @see list */
        fun list(
            params: IntegrationSecretListParams = IntegrationSecretListParams.none()
        ): CompletableFuture<HttpResponseFor<IntegrationSecretListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<IntegrationSecretListResponse>> =
            list(IntegrationSecretListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /integration_secrets/{id}`, but is otherwise the
         * same as [IntegrationSecretServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, IntegrationSecretDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: IntegrationSecretDeleteParams = IntegrationSecretDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: IntegrationSecretDeleteParams = IntegrationSecretDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: IntegrationSecretDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: IntegrationSecretDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, IntegrationSecretDeleteParams.none(), requestOptions)
    }
}
