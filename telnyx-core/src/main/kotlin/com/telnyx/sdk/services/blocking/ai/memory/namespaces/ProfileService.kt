// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.memory.namespaces

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileDeleteParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileDeleteResponse
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileIngestParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileIngestResponse
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileListPage
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileListParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileRecallParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileRecallResponse
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileRememberParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileRememberResponse
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileRetrieveSummaryParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileRetrieveSummaryResponse
import com.telnyx.sdk.services.blocking.ai.memory.namespaces.profiles.MemoryService
import com.telnyx.sdk.services.blocking.ai.memory.namespaces.profiles.SourceService
import java.util.function.Consumer

interface ProfileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProfileService

    /** What a namespace and a profile hold. */
    fun memories(): MemoryService

    /** What a profile stored, and what its memories came from. */
    fun sources(): SourceService

    /**
     * Profiles are never created, only written to, so this lists the ones that hold a memory. A
     * profile whose first ingest is still running is not here yet. Ordered by memory count, largest
     * first, so a profile written to while the listing is paged can move between pages and be
     * repeated or missed.
     */
    fun list(namespace: String): ProfileListPage = list(namespace, ProfileListParams.none())

    /** @see list */
    fun list(
        namespace: String,
        params: ProfileListParams = ProfileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProfileListPage = list(params.toBuilder().namespace(namespace).build(), requestOptions)

    /** @see list */
    fun list(
        namespace: String,
        params: ProfileListParams = ProfileListParams.none(),
    ): ProfileListPage = list(namespace, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ProfileListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProfileListPage

    /** @see list */
    fun list(params: ProfileListParams): ProfileListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(namespace: String, requestOptions: RequestOptions): ProfileListPage =
        list(namespace, ProfileListParams.none(), requestOptions)

    /**
     * Delete everything held about one profile. A 2xx means none of its memories are left, and its
     * summary goes with them. There is no undo.
     */
    fun delete(profileId: String, params: ProfileDeleteParams): ProfileDeleteResponse =
        delete(profileId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        profileId: String,
        params: ProfileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProfileDeleteResponse =
        delete(params.toBuilder().profileId(profileId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ProfileDeleteParams): ProfileDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ProfileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProfileDeleteResponse

    /**
     * Store a session. Facts are extracted from whatever you send — the body is taken as any JSON
     * value and stored whole, so a framework's own transcript shape works unchanged. `messages` of
     * `role`/`content` is the conventional shape, not a requirement. An empty object or a null body
     * is refused. Carry a `session_id` to name the session: re-ingesting the same one replaces what
     * it held. Omit it and a session is opened and returned. Extraction runs asynchronously — poll
     * the returned operation.
     */
    fun ingest(profileId: String, params: ProfileIngestParams): ProfileIngestResponse =
        ingest(profileId, params, RequestOptions.none())

    /** @see ingest */
    fun ingest(
        profileId: String,
        params: ProfileIngestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProfileIngestResponse =
        ingest(params.toBuilder().profileId(profileId).build(), requestOptions)

    /** @see ingest */
    fun ingest(params: ProfileIngestParams): ProfileIngestResponse =
        ingest(params, RequestOptions.none())

    /** @see ingest */
    fun ingest(
        params: ProfileIngestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProfileIngestResponse

    /**
     * Ranked memories for a question. Matching runs over the profile's memories and returns them in
     * rank order with a relevance `score`; the score is null where the deployment's reranker is a
     * passthrough, in which case order is the only signal. No model runs in this path — recall
     * returns facts, it does not compose an answer.
     */
    fun recall(profileId: String, params: ProfileRecallParams): ProfileRecallResponse =
        recall(profileId, params, RequestOptions.none())

    /** @see recall */
    fun recall(
        profileId: String,
        params: ProfileRecallParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProfileRecallResponse =
        recall(params.toBuilder().profileId(profileId).build(), requestOptions)

    /** @see recall */
    fun recall(params: ProfileRecallParams): ProfileRecallResponse =
        recall(params, RequestOptions.none())

    /** @see recall */
    fun recall(
        params: ProfileRecallParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProfileRecallResponse

    /**
     * For a fact the agent has already distilled: `text` is stored as given, with nothing extracted
     * from it. Send a transcript to `ingest` instead. Remembering the same text again writes the
     * same memory rather than a second copy of it, so a retry is safe. The write runs
     * asynchronously -- poll the returned operation.
     */
    fun remember(profileId: String, params: ProfileRememberParams): ProfileRememberResponse =
        remember(profileId, params, RequestOptions.none())

    /** @see remember */
    fun remember(
        profileId: String,
        params: ProfileRememberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProfileRememberResponse =
        remember(params.toBuilder().profileId(profileId).build(), requestOptions)

    /** @see remember */
    fun remember(params: ProfileRememberParams): ProfileRememberResponse =
        remember(params, RequestOptions.none())

    /** @see remember */
    fun remember(
        params: ProfileRememberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProfileRememberResponse

    /**
     * The whole profile as one card, precomputed, with no query. Built for the start of a session,
     * where there is no question to ask yet.
     *
     * A summary is generated in the background. `is_stale` tells you newer memories have arrived
     * since it was written; that is ordinary and the card is still usable.
     */
    fun retrieveSummary(
        profileId: String,
        params: ProfileRetrieveSummaryParams,
    ): ProfileRetrieveSummaryResponse = retrieveSummary(profileId, params, RequestOptions.none())

    /** @see retrieveSummary */
    fun retrieveSummary(
        profileId: String,
        params: ProfileRetrieveSummaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProfileRetrieveSummaryResponse =
        retrieveSummary(params.toBuilder().profileId(profileId).build(), requestOptions)

    /** @see retrieveSummary */
    fun retrieveSummary(params: ProfileRetrieveSummaryParams): ProfileRetrieveSummaryResponse =
        retrieveSummary(params, RequestOptions.none())

    /** @see retrieveSummary */
    fun retrieveSummary(
        params: ProfileRetrieveSummaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProfileRetrieveSummaryResponse

    /** A view of [ProfileService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProfileService.WithRawResponse

        /** What a namespace and a profile hold. */
        fun memories(): MemoryService.WithRawResponse

        /** What a profile stored, and what its memories came from. */
        fun sources(): SourceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/memory/namespaces/{namespace}/profiles`, but is
         * otherwise the same as [ProfileService.list].
         */
        @MustBeClosed
        fun list(namespace: String): HttpResponseFor<ProfileListPage> =
            list(namespace, ProfileListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            namespace: String,
            params: ProfileListParams = ProfileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProfileListPage> =
            list(params.toBuilder().namespace(namespace).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            namespace: String,
            params: ProfileListParams = ProfileListParams.none(),
        ): HttpResponseFor<ProfileListPage> = list(namespace, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ProfileListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProfileListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: ProfileListParams): HttpResponseFor<ProfileListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            namespace: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProfileListPage> =
            list(namespace, ProfileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /ai/memory/namespaces/{namespace}/profiles/{profile_id}`, but is otherwise the same as
         * [ProfileService.delete].
         */
        @MustBeClosed
        fun delete(
            profileId: String,
            params: ProfileDeleteParams,
        ): HttpResponseFor<ProfileDeleteResponse> = delete(profileId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            profileId: String,
            params: ProfileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProfileDeleteResponse> =
            delete(params.toBuilder().profileId(profileId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: ProfileDeleteParams): HttpResponseFor<ProfileDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ProfileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProfileDeleteResponse>

        /**
         * Returns a raw HTTP response for `post
         * /ai/memory/namespaces/{namespace}/profiles/{profile_id}/ingest`, but is otherwise the
         * same as [ProfileService.ingest].
         */
        @MustBeClosed
        fun ingest(
            profileId: String,
            params: ProfileIngestParams,
        ): HttpResponseFor<ProfileIngestResponse> = ingest(profileId, params, RequestOptions.none())

        /** @see ingest */
        @MustBeClosed
        fun ingest(
            profileId: String,
            params: ProfileIngestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProfileIngestResponse> =
            ingest(params.toBuilder().profileId(profileId).build(), requestOptions)

        /** @see ingest */
        @MustBeClosed
        fun ingest(params: ProfileIngestParams): HttpResponseFor<ProfileIngestResponse> =
            ingest(params, RequestOptions.none())

        /** @see ingest */
        @MustBeClosed
        fun ingest(
            params: ProfileIngestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProfileIngestResponse>

        /**
         * Returns a raw HTTP response for `post
         * /ai/memory/namespaces/{namespace}/profiles/{profile_id}/recall`, but is otherwise the
         * same as [ProfileService.recall].
         */
        @MustBeClosed
        fun recall(
            profileId: String,
            params: ProfileRecallParams,
        ): HttpResponseFor<ProfileRecallResponse> = recall(profileId, params, RequestOptions.none())

        /** @see recall */
        @MustBeClosed
        fun recall(
            profileId: String,
            params: ProfileRecallParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProfileRecallResponse> =
            recall(params.toBuilder().profileId(profileId).build(), requestOptions)

        /** @see recall */
        @MustBeClosed
        fun recall(params: ProfileRecallParams): HttpResponseFor<ProfileRecallResponse> =
            recall(params, RequestOptions.none())

        /** @see recall */
        @MustBeClosed
        fun recall(
            params: ProfileRecallParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProfileRecallResponse>

        /**
         * Returns a raw HTTP response for `post
         * /ai/memory/namespaces/{namespace}/profiles/{profile_id}/remember`, but is otherwise the
         * same as [ProfileService.remember].
         */
        @MustBeClosed
        fun remember(
            profileId: String,
            params: ProfileRememberParams,
        ): HttpResponseFor<ProfileRememberResponse> =
            remember(profileId, params, RequestOptions.none())

        /** @see remember */
        @MustBeClosed
        fun remember(
            profileId: String,
            params: ProfileRememberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProfileRememberResponse> =
            remember(params.toBuilder().profileId(profileId).build(), requestOptions)

        /** @see remember */
        @MustBeClosed
        fun remember(params: ProfileRememberParams): HttpResponseFor<ProfileRememberResponse> =
            remember(params, RequestOptions.none())

        /** @see remember */
        @MustBeClosed
        fun remember(
            params: ProfileRememberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProfileRememberResponse>

        /**
         * Returns a raw HTTP response for `get
         * /ai/memory/namespaces/{namespace}/profiles/{profile_id}/summary`, but is otherwise the
         * same as [ProfileService.retrieveSummary].
         */
        @MustBeClosed
        fun retrieveSummary(
            profileId: String,
            params: ProfileRetrieveSummaryParams,
        ): HttpResponseFor<ProfileRetrieveSummaryResponse> =
            retrieveSummary(profileId, params, RequestOptions.none())

        /** @see retrieveSummary */
        @MustBeClosed
        fun retrieveSummary(
            profileId: String,
            params: ProfileRetrieveSummaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProfileRetrieveSummaryResponse> =
            retrieveSummary(params.toBuilder().profileId(profileId).build(), requestOptions)

        /** @see retrieveSummary */
        @MustBeClosed
        fun retrieveSummary(
            params: ProfileRetrieveSummaryParams
        ): HttpResponseFor<ProfileRetrieveSummaryResponse> =
            retrieveSummary(params, RequestOptions.none())

        /** @see retrieveSummary */
        @MustBeClosed
        fun retrieveSummary(
            params: ProfileRetrieveSummaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProfileRetrieveSummaryResponse>
    }
}
