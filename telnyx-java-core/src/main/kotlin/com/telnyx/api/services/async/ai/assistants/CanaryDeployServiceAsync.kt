// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.ai.assistants

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.ai.assistants.canarydeploys.CanaryDeployCreateParams
import com.telnyx.api.models.ai.assistants.canarydeploys.CanaryDeployDeleteParams
import com.telnyx.api.models.ai.assistants.canarydeploys.CanaryDeployResponse
import com.telnyx.api.models.ai.assistants.canarydeploys.CanaryDeployRetrieveParams
import com.telnyx.api.models.ai.assistants.canarydeploys.CanaryDeployUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CanaryDeployServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CanaryDeployServiceAsync

    /**
     * Endpoint to create a canary deploy configuration for an assistant.
     *
     * Creates a new canary deploy configuration with multiple version IDs and their traffic
     * percentages for A/B testing or gradual rollouts of assistant versions.
     */
    fun create(
        assistantId: String,
        params: CanaryDeployCreateParams,
    ): CompletableFuture<CanaryDeployResponse> = create(assistantId, params, RequestOptions.none())

    /** @see create */
    fun create(
        assistantId: String,
        params: CanaryDeployCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CanaryDeployResponse> =
        create(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see create */
    fun create(params: CanaryDeployCreateParams): CompletableFuture<CanaryDeployResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CanaryDeployCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CanaryDeployResponse>

    /**
     * Endpoint to get a canary deploy configuration for an assistant.
     *
     * Retrieves the current canary deploy configuration with all version IDs and their traffic
     * percentages for the specified assistant.
     */
    fun retrieve(assistantId: String): CompletableFuture<CanaryDeployResponse> =
        retrieve(assistantId, CanaryDeployRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        assistantId: String,
        params: CanaryDeployRetrieveParams = CanaryDeployRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CanaryDeployResponse> =
        retrieve(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        assistantId: String,
        params: CanaryDeployRetrieveParams = CanaryDeployRetrieveParams.none(),
    ): CompletableFuture<CanaryDeployResponse> =
        retrieve(assistantId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CanaryDeployRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CanaryDeployResponse>

    /** @see retrieve */
    fun retrieve(params: CanaryDeployRetrieveParams): CompletableFuture<CanaryDeployResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        assistantId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CanaryDeployResponse> =
        retrieve(assistantId, CanaryDeployRetrieveParams.none(), requestOptions)

    /**
     * Endpoint to update a canary deploy configuration for an assistant.
     *
     * Updates the existing canary deploy configuration with new version IDs and percentages. All
     * old versions and percentages are replaces by new ones from this request.
     */
    fun update(
        assistantId: String,
        params: CanaryDeployUpdateParams,
    ): CompletableFuture<CanaryDeployResponse> = update(assistantId, params, RequestOptions.none())

    /** @see update */
    fun update(
        assistantId: String,
        params: CanaryDeployUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CanaryDeployResponse> =
        update(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see update */
    fun update(params: CanaryDeployUpdateParams): CompletableFuture<CanaryDeployResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CanaryDeployUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CanaryDeployResponse>

    /**
     * Endpoint to delete a canary deploy configuration for an assistant.
     *
     * Removes all canary deploy configurations for the specified assistant.
     */
    fun delete(assistantId: String): CompletableFuture<Void?> =
        delete(assistantId, CanaryDeployDeleteParams.none())

    /** @see delete */
    fun delete(
        assistantId: String,
        params: CanaryDeployDeleteParams = CanaryDeployDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see delete */
    fun delete(
        assistantId: String,
        params: CanaryDeployDeleteParams = CanaryDeployDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(assistantId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CanaryDeployDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: CanaryDeployDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(assistantId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(assistantId, CanaryDeployDeleteParams.none(), requestOptions)

    /**
     * A view of [CanaryDeployServiceAsync] that provides access to raw HTTP responses for each
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
        ): CanaryDeployServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/assistants/{assistant_id}/canary-deploys`, but
         * is otherwise the same as [CanaryDeployServiceAsync.create].
         */
        fun create(
            assistantId: String,
            params: CanaryDeployCreateParams,
        ): CompletableFuture<HttpResponseFor<CanaryDeployResponse>> =
            create(assistantId, params, RequestOptions.none())

        /** @see create */
        fun create(
            assistantId: String,
            params: CanaryDeployCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CanaryDeployResponse>> =
            create(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see create */
        fun create(
            params: CanaryDeployCreateParams
        ): CompletableFuture<HttpResponseFor<CanaryDeployResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CanaryDeployCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CanaryDeployResponse>>

        /**
         * Returns a raw HTTP response for `get /ai/assistants/{assistant_id}/canary-deploys`, but
         * is otherwise the same as [CanaryDeployServiceAsync.retrieve].
         */
        fun retrieve(
            assistantId: String
        ): CompletableFuture<HttpResponseFor<CanaryDeployResponse>> =
            retrieve(assistantId, CanaryDeployRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            assistantId: String,
            params: CanaryDeployRetrieveParams = CanaryDeployRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CanaryDeployResponse>> =
            retrieve(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            assistantId: String,
            params: CanaryDeployRetrieveParams = CanaryDeployRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CanaryDeployResponse>> =
            retrieve(assistantId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CanaryDeployRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CanaryDeployResponse>>

        /** @see retrieve */
        fun retrieve(
            params: CanaryDeployRetrieveParams
        ): CompletableFuture<HttpResponseFor<CanaryDeployResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            assistantId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CanaryDeployResponse>> =
            retrieve(assistantId, CanaryDeployRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /ai/assistants/{assistant_id}/canary-deploys`, but
         * is otherwise the same as [CanaryDeployServiceAsync.update].
         */
        fun update(
            assistantId: String,
            params: CanaryDeployUpdateParams,
        ): CompletableFuture<HttpResponseFor<CanaryDeployResponse>> =
            update(assistantId, params, RequestOptions.none())

        /** @see update */
        fun update(
            assistantId: String,
            params: CanaryDeployUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CanaryDeployResponse>> =
            update(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see update */
        fun update(
            params: CanaryDeployUpdateParams
        ): CompletableFuture<HttpResponseFor<CanaryDeployResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CanaryDeployUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CanaryDeployResponse>>

        /**
         * Returns a raw HTTP response for `delete /ai/assistants/{assistant_id}/canary-deploys`,
         * but is otherwise the same as [CanaryDeployServiceAsync.delete].
         */
        fun delete(assistantId: String): CompletableFuture<HttpResponse> =
            delete(assistantId, CanaryDeployDeleteParams.none())

        /** @see delete */
        fun delete(
            assistantId: String,
            params: CanaryDeployDeleteParams = CanaryDeployDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see delete */
        fun delete(
            assistantId: String,
            params: CanaryDeployDeleteParams = CanaryDeployDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(assistantId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CanaryDeployDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: CanaryDeployDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            assistantId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(assistantId, CanaryDeployDeleteParams.none(), requestOptions)
    }
}
