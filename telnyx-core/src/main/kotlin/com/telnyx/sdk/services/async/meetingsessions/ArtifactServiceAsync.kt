// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.meetingsessions

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.meetingsessions.artifacts.ArtifactCreateParams
import com.telnyx.sdk.models.meetingsessions.artifacts.ArtifactListParams
import com.telnyx.sdk.models.meetingsessions.artifacts.ArtifactListResponse
import com.telnyx.sdk.models.meetingsessions.artifacts.ArtifactRetrieveParams
import com.telnyx.sdk.models.meetingsessions.artifacts.MeetingSessionArtifactResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Create and retrieve asynchronous summaries and action-item artifacts. */
interface ArtifactServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ArtifactServiceAsync

    /**
     * Requests asynchronous generation of one `summary` or `action_items` artifact. Each type
     * requires its own request. Generation requires transcript content and configured inference and
     * currently reads at most the first 10,000 segments, so exceptionally long transcripts may
     * produce incomplete artifacts or fail model limits.
     */
    fun create(
        id: String,
        params: ArtifactCreateParams,
    ): CompletableFuture<MeetingSessionArtifactResponse> = create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: ArtifactCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeetingSessionArtifactResponse> =
        create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: ArtifactCreateParams): CompletableFuture<MeetingSessionArtifactResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ArtifactCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeetingSessionArtifactResponse>

    /** Retrieves a single meeting session artifact by ID. */
    fun retrieve(
        artifactId: String,
        params: ArtifactRetrieveParams,
    ): CompletableFuture<MeetingSessionArtifactResponse> =
        retrieve(artifactId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        artifactId: String,
        params: ArtifactRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeetingSessionArtifactResponse> =
        retrieve(params.toBuilder().artifactId(artifactId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: ArtifactRetrieveParams
    ): CompletableFuture<MeetingSessionArtifactResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ArtifactRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeetingSessionArtifactResponse>

    /** Returns a list of artifacts for a meeting session. */
    fun list(id: String): CompletableFuture<ArtifactListResponse> =
        list(id, ArtifactListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: ArtifactListParams = ArtifactListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ArtifactListResponse> =
        list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: ArtifactListParams = ArtifactListParams.none(),
    ): CompletableFuture<ArtifactListResponse> = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ArtifactListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ArtifactListResponse>

    /** @see list */
    fun list(params: ArtifactListParams): CompletableFuture<ArtifactListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): CompletableFuture<ArtifactListResponse> =
        list(id, ArtifactListParams.none(), requestOptions)

    /**
     * A view of [ArtifactServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ArtifactServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /meeting_sessions/{id}/artifacts`, but is otherwise
         * the same as [ArtifactServiceAsync.create].
         */
        fun create(
            id: String,
            params: ArtifactCreateParams,
        ): CompletableFuture<HttpResponseFor<MeetingSessionArtifactResponse>> =
            create(id, params, RequestOptions.none())

        /** @see create */
        fun create(
            id: String,
            params: ArtifactCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeetingSessionArtifactResponse>> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        fun create(
            params: ArtifactCreateParams
        ): CompletableFuture<HttpResponseFor<MeetingSessionArtifactResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ArtifactCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeetingSessionArtifactResponse>>

        /**
         * Returns a raw HTTP response for `get /meeting_sessions/{id}/artifacts/{artifact_id}`, but
         * is otherwise the same as [ArtifactServiceAsync.retrieve].
         */
        fun retrieve(
            artifactId: String,
            params: ArtifactRetrieveParams,
        ): CompletableFuture<HttpResponseFor<MeetingSessionArtifactResponse>> =
            retrieve(artifactId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            artifactId: String,
            params: ArtifactRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeetingSessionArtifactResponse>> =
            retrieve(params.toBuilder().artifactId(artifactId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: ArtifactRetrieveParams
        ): CompletableFuture<HttpResponseFor<MeetingSessionArtifactResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ArtifactRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeetingSessionArtifactResponse>>

        /**
         * Returns a raw HTTP response for `get /meeting_sessions/{id}/artifacts`, but is otherwise
         * the same as [ArtifactServiceAsync.list].
         */
        fun list(id: String): CompletableFuture<HttpResponseFor<ArtifactListResponse>> =
            list(id, ArtifactListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: ArtifactListParams = ArtifactListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ArtifactListResponse>> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: ArtifactListParams = ArtifactListParams.none(),
        ): CompletableFuture<HttpResponseFor<ArtifactListResponse>> =
            list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ArtifactListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ArtifactListResponse>>

        /** @see list */
        fun list(
            params: ArtifactListParams
        ): CompletableFuture<HttpResponseFor<ArtifactListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ArtifactListResponse>> =
            list(id, ArtifactListParams.none(), requestOptions)
    }
}
