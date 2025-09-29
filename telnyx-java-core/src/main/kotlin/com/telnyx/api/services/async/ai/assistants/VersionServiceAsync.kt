// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.ai.assistants

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface VersionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VersionServiceAsync

    /** Retrieves a specific version of an assistant by assistant_id and version_id */
    fun retrieve(
        versionId: String,
        params: VersionRetrieveParams,
    ): CompletableFuture<VersionRetrieveResponse> =
        retrieve(versionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        versionId: String,
        params: VersionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VersionRetrieveResponse> =
        retrieve(params.toBuilder().versionId(versionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: VersionRetrieveParams): CompletableFuture<VersionRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VersionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VersionRetrieveResponse>

    /** Updates the configuration of a specific assistant version. Can not update main version */
    fun update(
        versionId: String,
        params: VersionUpdateParams,
    ): CompletableFuture<VersionUpdateResponse> = update(versionId, params, RequestOptions.none())

    /** @see update */
    fun update(
        versionId: String,
        params: VersionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VersionUpdateResponse> =
        update(params.toBuilder().versionId(versionId).build(), requestOptions)

    /** @see update */
    fun update(params: VersionUpdateParams): CompletableFuture<VersionUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: VersionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VersionUpdateResponse>

    /** Retrieves all versions of a specific assistant with complete configuration and metadata */
    fun list(assistantId: String): CompletableFuture<AssistantsList> =
        list(assistantId, VersionListParams.none())

    /** @see list */
    fun list(
        assistantId: String,
        params: VersionListParams = VersionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssistantsList> =
        list(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see list */
    fun list(
        assistantId: String,
        params: VersionListParams = VersionListParams.none(),
    ): CompletableFuture<AssistantsList> = list(assistantId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: VersionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssistantsList>

    /** @see list */
    fun list(params: VersionListParams): CompletableFuture<AssistantsList> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        assistantId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssistantsList> =
        list(assistantId, VersionListParams.none(), requestOptions)

    /** Permanently removes a specific version of an assistant. Can not delete main version */
    fun delete(versionId: String, params: VersionDeleteParams): CompletableFuture<Void?> =
        delete(versionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        versionId: String,
        params: VersionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().versionId(versionId).build(), requestOptions)

    /** @see delete */
    fun delete(params: VersionDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: VersionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Promotes a specific version to be the main/current version of the assistant. This will delete
     * any existing canary deploy configuration and send all live production traffic to this
     * version.
     */
    fun promote(
        versionId: String,
        params: VersionPromoteParams,
    ): CompletableFuture<VersionPromoteResponse> = promote(versionId, params, RequestOptions.none())

    /** @see promote */
    fun promote(
        versionId: String,
        params: VersionPromoteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VersionPromoteResponse> =
        promote(params.toBuilder().versionId(versionId).build(), requestOptions)

    /** @see promote */
    fun promote(params: VersionPromoteParams): CompletableFuture<VersionPromoteResponse> =
        promote(params, RequestOptions.none())

    /** @see promote */
    fun promote(
        params: VersionPromoteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VersionPromoteResponse>

    /**
     * A view of [VersionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VersionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /ai/assistants/{assistant_id}/versions/{version_id}`, but is otherwise the same as
         * [VersionServiceAsync.retrieve].
         */
        fun retrieve(
            versionId: String,
            params: VersionRetrieveParams,
        ): CompletableFuture<HttpResponseFor<VersionRetrieveResponse>> =
            retrieve(versionId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            versionId: String,
            params: VersionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VersionRetrieveResponse>> =
            retrieve(params.toBuilder().versionId(versionId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: VersionRetrieveParams
        ): CompletableFuture<HttpResponseFor<VersionRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: VersionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VersionRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /ai/assistants/{assistant_id}/versions/{version_id}`, but is otherwise the same as
         * [VersionServiceAsync.update].
         */
        fun update(
            versionId: String,
            params: VersionUpdateParams,
        ): CompletableFuture<HttpResponseFor<VersionUpdateResponse>> =
            update(versionId, params, RequestOptions.none())

        /** @see update */
        fun update(
            versionId: String,
            params: VersionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VersionUpdateResponse>> =
            update(params.toBuilder().versionId(versionId).build(), requestOptions)

        /** @see update */
        fun update(
            params: VersionUpdateParams
        ): CompletableFuture<HttpResponseFor<VersionUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: VersionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VersionUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /ai/assistants/{assistant_id}/versions`, but is
         * otherwise the same as [VersionServiceAsync.list].
         */
        fun list(assistantId: String): CompletableFuture<HttpResponseFor<AssistantsList>> =
            list(assistantId, VersionListParams.none())

        /** @see list */
        fun list(
            assistantId: String,
            params: VersionListParams = VersionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssistantsList>> =
            list(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see list */
        fun list(
            assistantId: String,
            params: VersionListParams = VersionListParams.none(),
        ): CompletableFuture<HttpResponseFor<AssistantsList>> =
            list(assistantId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: VersionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssistantsList>>

        /** @see list */
        fun list(params: VersionListParams): CompletableFuture<HttpResponseFor<AssistantsList>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            assistantId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssistantsList>> =
            list(assistantId, VersionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /ai/assistants/{assistant_id}/versions/{version_id}`, but is otherwise the same as
         * [VersionServiceAsync.delete].
         */
        fun delete(
            versionId: String,
            params: VersionDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(versionId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            versionId: String,
            params: VersionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().versionId(versionId).build(), requestOptions)

        /** @see delete */
        fun delete(params: VersionDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: VersionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post
         * /ai/assistants/{assistant_id}/versions/{version_id}/promote`, but is otherwise the same
         * as [VersionServiceAsync.promote].
         */
        fun promote(
            versionId: String,
            params: VersionPromoteParams,
        ): CompletableFuture<HttpResponseFor<VersionPromoteResponse>> =
            promote(versionId, params, RequestOptions.none())

        /** @see promote */
        fun promote(
            versionId: String,
            params: VersionPromoteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VersionPromoteResponse>> =
            promote(params.toBuilder().versionId(versionId).build(), requestOptions)

        /** @see promote */
        fun promote(
            params: VersionPromoteParams
        ): CompletableFuture<HttpResponseFor<VersionPromoteResponse>> =
            promote(params, RequestOptions.none())

        /** @see promote */
        fun promote(
            params: VersionPromoteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VersionPromoteResponse>>
    }
}
