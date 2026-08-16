// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.meetingsessions

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.meetingsessions.artifacts.ArtifactCreateParams
import com.telnyx.sdk.models.meetingsessions.artifacts.ArtifactListParams
import com.telnyx.sdk.models.meetingsessions.artifacts.ArtifactListResponse
import com.telnyx.sdk.models.meetingsessions.artifacts.ArtifactRetrieveParams
import com.telnyx.sdk.models.meetingsessions.artifacts.MeetingSessionArtifactResponse
import java.util.function.Consumer

/** Create and retrieve asynchronous summaries and action-item artifacts. */
interface ArtifactService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ArtifactService

    /**
     * Requests asynchronous generation of one `summary` or `action_items` artifact. Each type
     * requires its own request. Generation requires transcript content and configured inference and
     * currently reads at most the first 10,000 segments, so exceptionally long transcripts may
     * produce incomplete artifacts or fail model limits.
     */
    fun create(id: String, params: ArtifactCreateParams): MeetingSessionArtifactResponse =
        create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: ArtifactCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeetingSessionArtifactResponse = create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: ArtifactCreateParams): MeetingSessionArtifactResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ArtifactCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeetingSessionArtifactResponse

    /** Retrieves a single meeting session artifact by ID. */
    fun retrieve(
        artifactId: String,
        params: ArtifactRetrieveParams,
    ): MeetingSessionArtifactResponse = retrieve(artifactId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        artifactId: String,
        params: ArtifactRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeetingSessionArtifactResponse =
        retrieve(params.toBuilder().artifactId(artifactId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: ArtifactRetrieveParams): MeetingSessionArtifactResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ArtifactRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeetingSessionArtifactResponse

    /** Returns a list of artifacts for a meeting session. */
    fun list(id: String): ArtifactListResponse = list(id, ArtifactListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: ArtifactListParams = ArtifactListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ArtifactListResponse = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: ArtifactListParams = ArtifactListParams.none(),
    ): ArtifactListResponse = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ArtifactListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ArtifactListResponse

    /** @see list */
    fun list(params: ArtifactListParams): ArtifactListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): ArtifactListResponse =
        list(id, ArtifactListParams.none(), requestOptions)

    /** A view of [ArtifactService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ArtifactService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /meeting_sessions/{id}/artifacts`, but is otherwise
         * the same as [ArtifactService.create].
         */
        @MustBeClosed
        fun create(
            id: String,
            params: ArtifactCreateParams,
        ): HttpResponseFor<MeetingSessionArtifactResponse> =
            create(id, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            id: String,
            params: ArtifactCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeetingSessionArtifactResponse> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: ArtifactCreateParams): HttpResponseFor<MeetingSessionArtifactResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ArtifactCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeetingSessionArtifactResponse>

        /**
         * Returns a raw HTTP response for `get /meeting_sessions/{id}/artifacts/{artifact_id}`, but
         * is otherwise the same as [ArtifactService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            artifactId: String,
            params: ArtifactRetrieveParams,
        ): HttpResponseFor<MeetingSessionArtifactResponse> =
            retrieve(artifactId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            artifactId: String,
            params: ArtifactRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeetingSessionArtifactResponse> =
            retrieve(params.toBuilder().artifactId(artifactId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ArtifactRetrieveParams
        ): HttpResponseFor<MeetingSessionArtifactResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ArtifactRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeetingSessionArtifactResponse>

        /**
         * Returns a raw HTTP response for `get /meeting_sessions/{id}/artifacts`, but is otherwise
         * the same as [ArtifactService.list].
         */
        @MustBeClosed
        fun list(id: String): HttpResponseFor<ArtifactListResponse> =
            list(id, ArtifactListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: ArtifactListParams = ArtifactListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ArtifactListResponse> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: ArtifactListParams = ArtifactListParams.none(),
        ): HttpResponseFor<ArtifactListResponse> = list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ArtifactListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ArtifactListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: ArtifactListParams): HttpResponseFor<ArtifactListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ArtifactListResponse> =
            list(id, ArtifactListParams.none(), requestOptions)
    }
}
