// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.ai.assistants

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.ai.assistants.AssistantsList
import com.telnyx.api.models.ai.assistants.versions.VersionDeleteParams
import com.telnyx.api.models.ai.assistants.versions.VersionListParams
import com.telnyx.api.models.ai.assistants.versions.VersionPromoteParams
import com.telnyx.api.models.ai.assistants.versions.VersionPromoteResponse
import com.telnyx.api.models.ai.assistants.versions.VersionRetrieveParams
import com.telnyx.api.models.ai.assistants.versions.VersionRetrieveResponse
import com.telnyx.api.models.ai.assistants.versions.VersionUpdateParams
import com.telnyx.api.models.ai.assistants.versions.VersionUpdateResponse
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
    fun retrieve(versionId: String, params: VersionRetrieveParams): VersionRetrieveResponse =
        retrieve(versionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        versionId: String,
        params: VersionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VersionRetrieveResponse =
        retrieve(params.toBuilder().versionId(versionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: VersionRetrieveParams): VersionRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VersionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VersionRetrieveResponse

    /** Updates the configuration of a specific assistant version. Can not update main version */
    fun update(versionId: String, params: VersionUpdateParams): VersionUpdateResponse =
        update(versionId, params, RequestOptions.none())

    /** @see update */
    fun update(
        versionId: String,
        params: VersionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VersionUpdateResponse =
        update(params.toBuilder().versionId(versionId).build(), requestOptions)

    /** @see update */
    fun update(params: VersionUpdateParams): VersionUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: VersionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VersionUpdateResponse

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
    fun promote(versionId: String, params: VersionPromoteParams): VersionPromoteResponse =
        promote(versionId, params, RequestOptions.none())

    /** @see promote */
    fun promote(
        versionId: String,
        params: VersionPromoteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VersionPromoteResponse =
        promote(params.toBuilder().versionId(versionId).build(), requestOptions)

    /** @see promote */
    fun promote(params: VersionPromoteParams): VersionPromoteResponse =
        promote(params, RequestOptions.none())

    /** @see promote */
    fun promote(
        params: VersionPromoteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VersionPromoteResponse

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
        ): HttpResponseFor<VersionRetrieveResponse> =
            retrieve(versionId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            versionId: String,
            params: VersionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VersionRetrieveResponse> =
            retrieve(params.toBuilder().versionId(versionId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: VersionRetrieveParams): HttpResponseFor<VersionRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: VersionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VersionRetrieveResponse>

        /**
         * Returns a raw HTTP response for `post
         * /ai/assistants/{assistant_id}/versions/{version_id}`, but is otherwise the same as
         * [VersionService.update].
         */
        @MustBeClosed
        fun update(
            versionId: String,
            params: VersionUpdateParams,
        ): HttpResponseFor<VersionUpdateResponse> = update(versionId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            versionId: String,
            params: VersionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VersionUpdateResponse> =
            update(params.toBuilder().versionId(versionId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: VersionUpdateParams): HttpResponseFor<VersionUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: VersionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VersionUpdateResponse>

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
        ): HttpResponseFor<VersionPromoteResponse> =
            promote(versionId, params, RequestOptions.none())

        /** @see promote */
        @MustBeClosed
        fun promote(
            versionId: String,
            params: VersionPromoteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VersionPromoteResponse> =
            promote(params.toBuilder().versionId(versionId).build(), requestOptions)

        /** @see promote */
        @MustBeClosed
        fun promote(params: VersionPromoteParams): HttpResponseFor<VersionPromoteResponse> =
            promote(params, RequestOptions.none())

        /** @see promote */
        @MustBeClosed
        fun promote(
            params: VersionPromoteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VersionPromoteResponse>
    }
}
