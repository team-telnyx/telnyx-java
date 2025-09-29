// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.ai.assistants

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.ai.assistants.canarydeploys.CanaryDeployCreateParams
import com.telnyx.api.models.ai.assistants.canarydeploys.CanaryDeployDeleteParams
import com.telnyx.api.models.ai.assistants.canarydeploys.CanaryDeployResponse
import com.telnyx.api.models.ai.assistants.canarydeploys.CanaryDeployRetrieveParams
import com.telnyx.api.models.ai.assistants.canarydeploys.CanaryDeployUpdateParams
import java.util.function.Consumer

interface CanaryDeployService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CanaryDeployService

    /**
     * Endpoint to create a canary deploy configuration for an assistant.
     *
     * Creates a new canary deploy configuration with multiple version IDs and their traffic
     * percentages for A/B testing or gradual rollouts of assistant versions.
     */
    fun create(assistantId: String, params: CanaryDeployCreateParams): CanaryDeployResponse =
        create(assistantId, params, RequestOptions.none())

    /** @see create */
    fun create(
        assistantId: String,
        params: CanaryDeployCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CanaryDeployResponse =
        create(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see create */
    fun create(params: CanaryDeployCreateParams): CanaryDeployResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CanaryDeployCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CanaryDeployResponse

    /**
     * Endpoint to get a canary deploy configuration for an assistant.
     *
     * Retrieves the current canary deploy configuration with all version IDs and their traffic
     * percentages for the specified assistant.
     */
    fun retrieve(assistantId: String): CanaryDeployResponse =
        retrieve(assistantId, CanaryDeployRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        assistantId: String,
        params: CanaryDeployRetrieveParams = CanaryDeployRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CanaryDeployResponse =
        retrieve(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        assistantId: String,
        params: CanaryDeployRetrieveParams = CanaryDeployRetrieveParams.none(),
    ): CanaryDeployResponse = retrieve(assistantId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CanaryDeployRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CanaryDeployResponse

    /** @see retrieve */
    fun retrieve(params: CanaryDeployRetrieveParams): CanaryDeployResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(assistantId: String, requestOptions: RequestOptions): CanaryDeployResponse =
        retrieve(assistantId, CanaryDeployRetrieveParams.none(), requestOptions)

    /**
     * Endpoint to update a canary deploy configuration for an assistant.
     *
     * Updates the existing canary deploy configuration with new version IDs and percentages. All
     * old versions and percentages are replaces by new ones from this request.
     */
    fun update(assistantId: String, params: CanaryDeployUpdateParams): CanaryDeployResponse =
        update(assistantId, params, RequestOptions.none())

    /** @see update */
    fun update(
        assistantId: String,
        params: CanaryDeployUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CanaryDeployResponse =
        update(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see update */
    fun update(params: CanaryDeployUpdateParams): CanaryDeployResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CanaryDeployUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CanaryDeployResponse

    /**
     * Endpoint to delete a canary deploy configuration for an assistant.
     *
     * Removes all canary deploy configurations for the specified assistant.
     */
    fun delete(assistantId: String) = delete(assistantId, CanaryDeployDeleteParams.none())

    /** @see delete */
    fun delete(
        assistantId: String,
        params: CanaryDeployDeleteParams = CanaryDeployDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see delete */
    fun delete(
        assistantId: String,
        params: CanaryDeployDeleteParams = CanaryDeployDeleteParams.none(),
    ) = delete(assistantId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CanaryDeployDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: CanaryDeployDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(assistantId: String, requestOptions: RequestOptions) =
        delete(assistantId, CanaryDeployDeleteParams.none(), requestOptions)

    /**
     * A view of [CanaryDeployService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CanaryDeployService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/assistants/{assistant_id}/canary-deploys`, but
         * is otherwise the same as [CanaryDeployService.create].
         */
        @MustBeClosed
        fun create(
            assistantId: String,
            params: CanaryDeployCreateParams,
        ): HttpResponseFor<CanaryDeployResponse> =
            create(assistantId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            assistantId: String,
            params: CanaryDeployCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CanaryDeployResponse> =
            create(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: CanaryDeployCreateParams): HttpResponseFor<CanaryDeployResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CanaryDeployCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CanaryDeployResponse>

        /**
         * Returns a raw HTTP response for `get /ai/assistants/{assistant_id}/canary-deploys`, but
         * is otherwise the same as [CanaryDeployService.retrieve].
         */
        @MustBeClosed
        fun retrieve(assistantId: String): HttpResponseFor<CanaryDeployResponse> =
            retrieve(assistantId, CanaryDeployRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            assistantId: String,
            params: CanaryDeployRetrieveParams = CanaryDeployRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CanaryDeployResponse> =
            retrieve(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            assistantId: String,
            params: CanaryDeployRetrieveParams = CanaryDeployRetrieveParams.none(),
        ): HttpResponseFor<CanaryDeployResponse> =
            retrieve(assistantId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CanaryDeployRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CanaryDeployResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CanaryDeployRetrieveParams): HttpResponseFor<CanaryDeployResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            assistantId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CanaryDeployResponse> =
            retrieve(assistantId, CanaryDeployRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /ai/assistants/{assistant_id}/canary-deploys`, but
         * is otherwise the same as [CanaryDeployService.update].
         */
        @MustBeClosed
        fun update(
            assistantId: String,
            params: CanaryDeployUpdateParams,
        ): HttpResponseFor<CanaryDeployResponse> =
            update(assistantId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            assistantId: String,
            params: CanaryDeployUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CanaryDeployResponse> =
            update(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: CanaryDeployUpdateParams): HttpResponseFor<CanaryDeployResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CanaryDeployUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CanaryDeployResponse>

        /**
         * Returns a raw HTTP response for `delete /ai/assistants/{assistant_id}/canary-deploys`,
         * but is otherwise the same as [CanaryDeployService.delete].
         */
        @MustBeClosed
        fun delete(assistantId: String): HttpResponse =
            delete(assistantId, CanaryDeployDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            assistantId: String,
            params: CanaryDeployDeleteParams = CanaryDeployDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            assistantId: String,
            params: CanaryDeployDeleteParams = CanaryDeployDeleteParams.none(),
        ): HttpResponse = delete(assistantId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CanaryDeployDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: CanaryDeployDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(assistantId: String, requestOptions: RequestOptions): HttpResponse =
            delete(assistantId, CanaryDeployDeleteParams.none(), requestOptions)
    }
}
