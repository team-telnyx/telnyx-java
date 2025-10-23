// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.assistants

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.assistants.AssistantsList
import com.telnyx.sdk.models.ai.assistants.InferenceEmbedding
import com.telnyx.sdk.models.ai.assistants.versions.VersionDeleteParams
import com.telnyx.sdk.models.ai.assistants.versions.VersionListParams
import com.telnyx.sdk.models.ai.assistants.versions.VersionPromoteParams
import com.telnyx.sdk.models.ai.assistants.versions.VersionRetrieveParams
import com.telnyx.sdk.models.ai.assistants.versions.VersionUpdateParams
import java.util.function.Consumer

interface VersionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VersionService

    /** Retrieves a specific version of an assistant by assistant_id and version_id */
    fun retrieve(versionId: String, params: VersionRetrieveParams): InferenceEmbedding =
        retrieve(versionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        versionId: String,
        params: VersionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InferenceEmbedding =
        retrieve(params.toBuilder().versionId(versionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: VersionRetrieveParams): InferenceEmbedding =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VersionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InferenceEmbedding

    /** Updates the configuration of a specific assistant version. Can not update main version */
    fun update(versionId: String, params: VersionUpdateParams): InferenceEmbedding =
        update(versionId, params, RequestOptions.none())

    /** @see update */
    fun update(
        versionId: String,
        params: VersionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InferenceEmbedding = update(params.toBuilder().versionId(versionId).build(), requestOptions)

    /** @see update */
    fun update(params: VersionUpdateParams): InferenceEmbedding =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: VersionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InferenceEmbedding

    /** Retrieves all versions of a specific assistant with complete configuration and metadata */
    fun list(assistantId: String): AssistantsList = list(assistantId, VersionListParams.none())

    /** @see list */
    fun list(
        assistantId: String,
        params: VersionListParams = VersionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssistantsList = list(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see list */
    fun list(
        assistantId: String,
        params: VersionListParams = VersionListParams.none(),
    ): AssistantsList = list(assistantId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: VersionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssistantsList

    /** @see list */
    fun list(params: VersionListParams): AssistantsList = list(params, RequestOptions.none())

    /** @see list */
    fun list(assistantId: String, requestOptions: RequestOptions): AssistantsList =
        list(assistantId, VersionListParams.none(), requestOptions)

    /** Permanently removes a specific version of an assistant. Can not delete main version */
    fun delete(versionId: String, params: VersionDeleteParams) =
        delete(versionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        versionId: String,
        params: VersionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().versionId(versionId).build(), requestOptions)

    /** @see delete */
    fun delete(params: VersionDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: VersionDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Promotes a specific version to be the main/current version of the assistant. This will delete
     * any existing canary deploy configuration and send all live production traffic to this
     * version.
     */
    fun promote(versionId: String, params: VersionPromoteParams): InferenceEmbedding =
        promote(versionId, params, RequestOptions.none())

    /** @see promote */
    fun promote(
        versionId: String,
        params: VersionPromoteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InferenceEmbedding = promote(params.toBuilder().versionId(versionId).build(), requestOptions)

    /** @see promote */
    fun promote(params: VersionPromoteParams): InferenceEmbedding =
        promote(params, RequestOptions.none())

    /** @see promote */
    fun promote(
        params: VersionPromoteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InferenceEmbedding

    /** A view of [VersionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): VersionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /ai/assistants/{assistant_id}/versions/{version_id}`, but is otherwise the same as
         * [VersionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            versionId: String,
            params: VersionRetrieveParams,
        ): HttpResponseFor<InferenceEmbedding> = retrieve(versionId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            versionId: String,
            params: VersionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InferenceEmbedding> =
            retrieve(params.toBuilder().versionId(versionId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: VersionRetrieveParams): HttpResponseFor<InferenceEmbedding> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: VersionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InferenceEmbedding>

        /**
         * Returns a raw HTTP response for `post
         * /ai/assistants/{assistant_id}/versions/{version_id}`, but is otherwise the same as
         * [VersionService.update].
         */
        @MustBeClosed
        fun update(
            versionId: String,
            params: VersionUpdateParams,
        ): HttpResponseFor<InferenceEmbedding> = update(versionId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            versionId: String,
            params: VersionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InferenceEmbedding> =
            update(params.toBuilder().versionId(versionId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: VersionUpdateParams): HttpResponseFor<InferenceEmbedding> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: VersionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InferenceEmbedding>

        /**
         * Returns a raw HTTP response for `get /ai/assistants/{assistant_id}/versions`, but is
         * otherwise the same as [VersionService.list].
         */
        @MustBeClosed
        fun list(assistantId: String): HttpResponseFor<AssistantsList> =
            list(assistantId, VersionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            assistantId: String,
            params: VersionListParams = VersionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssistantsList> =
            list(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            assistantId: String,
            params: VersionListParams = VersionListParams.none(),
        ): HttpResponseFor<AssistantsList> = list(assistantId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: VersionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssistantsList>

        /** @see list */
        @MustBeClosed
        fun list(params: VersionListParams): HttpResponseFor<AssistantsList> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            assistantId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssistantsList> =
            list(assistantId, VersionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /ai/assistants/{assistant_id}/versions/{version_id}`, but is otherwise the same as
         * [VersionService.delete].
         */
        @MustBeClosed
        fun delete(versionId: String, params: VersionDeleteParams): HttpResponse =
            delete(versionId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            versionId: String,
            params: VersionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().versionId(versionId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: VersionDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: VersionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /ai/assistants/{assistant_id}/versions/{version_id}/promote`, but is otherwise the same
         * as [VersionService.promote].
         */
        @MustBeClosed
        fun promote(
            versionId: String,
            params: VersionPromoteParams,
        ): HttpResponseFor<InferenceEmbedding> = promote(versionId, params, RequestOptions.none())

        /** @see promote */
        @MustBeClosed
        fun promote(
            versionId: String,
            params: VersionPromoteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InferenceEmbedding> =
            promote(params.toBuilder().versionId(versionId).build(), requestOptions)

        /** @see promote */
        @MustBeClosed
        fun promote(params: VersionPromoteParams): HttpResponseFor<InferenceEmbedding> =
            promote(params, RequestOptions.none())

        /** @see promote */
        @MustBeClosed
        fun promote(
            params: VersionPromoteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InferenceEmbedding>
    }
}
