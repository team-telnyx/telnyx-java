// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.memory.namespaces

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileDeleteParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileDeleteResponse
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileIngestParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileIngestResponse
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileListPageAsync
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileListParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileRecallParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileRecallResponse
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileRememberParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileRememberResponse
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileRetrieveSummaryParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileRetrieveSummaryResponse
import com.telnyx.sdk.services.async.ai.memory.namespaces.profiles.MemoryServiceAsync
import com.telnyx.sdk.services.async.ai.memory.namespaces.profiles.SourceServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ProfileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProfileServiceAsync

    /** What a namespace and a profile hold. */
    fun memories(): MemoryServiceAsync

    /** What a profile stored, and what its memories came from. */
    fun sources(): SourceServiceAsync

    /**
     * Profiles are never created, only written to, so this lists the ones that hold a memory. A
     * profile whose first ingest is still running is not here yet. Ordered by memory count, largest
     * first, so a profile written to while the listing is paged can move between pages and be
     * repeated or missed.
     */
    fun list(namespace: String): CompletableFuture<ProfileListPageAsync> =
        list(namespace, ProfileListParams.none())

    /** @see list */
    fun list(
        namespace: String,
        params: ProfileListParams = ProfileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProfileListPageAsync> =
        list(params.toBuilder().namespace(namespace).build(), requestOptions)

    /** @see list */
    fun list(
        namespace: String,
        params: ProfileListParams = ProfileListParams.none(),
    ): CompletableFuture<ProfileListPageAsync> = list(namespace, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ProfileListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProfileListPageAsync>

    /** @see list */
    fun list(params: ProfileListParams): CompletableFuture<ProfileListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        namespace: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProfileListPageAsync> =
        list(namespace, ProfileListParams.none(), requestOptions)

    /**
     * Delete everything held about one profile. A 2xx means none of its memories are left, and its
     * summary goes with them. There is no undo.
     */
    fun delete(
        profileId: String,
        params: ProfileDeleteParams,
    ): CompletableFuture<ProfileDeleteResponse> = delete(profileId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        profileId: String,
        params: ProfileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProfileDeleteResponse> =
        delete(params.toBuilder().profileId(profileId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ProfileDeleteParams): CompletableFuture<ProfileDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ProfileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProfileDeleteResponse>

    /**
     * Store a session. Facts are extracted from whatever you send — the body is taken as any JSON
     * value and stored whole, so a framework's own transcript shape works unchanged. `messages` of
     * `role`/`content` is the conventional shape, not a requirement. An empty object or a null body
     * is refused. Carry a `session_id` to name the session: re-ingesting the same one replaces what
     * it held. Omit it and a session is opened and returned. Extraction runs asynchronously — poll
     * the returned operation.
     */
    fun ingest(
        profileId: String,
        params: ProfileIngestParams,
    ): CompletableFuture<ProfileIngestResponse> = ingest(profileId, params, RequestOptions.none())

    /** @see ingest */
    fun ingest(
        profileId: String,
        params: ProfileIngestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProfileIngestResponse> =
        ingest(params.toBuilder().profileId(profileId).build(), requestOptions)

    /** @see ingest */
    fun ingest(params: ProfileIngestParams): CompletableFuture<ProfileIngestResponse> =
        ingest(params, RequestOptions.none())

    /** @see ingest */
    fun ingest(
        params: ProfileIngestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProfileIngestResponse>

    /**
     * Ranked memories for a question. Matching runs over the profile's memories and returns them in
     * rank order with a relevance `score`; the score is null where the deployment's reranker is a
     * passthrough, in which case order is the only signal. No model runs in this path — recall
     * returns facts, it does not compose an answer.
     */
    fun recall(
        profileId: String,
        params: ProfileRecallParams,
    ): CompletableFuture<ProfileRecallResponse> = recall(profileId, params, RequestOptions.none())

    /** @see recall */
    fun recall(
        profileId: String,
        params: ProfileRecallParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProfileRecallResponse> =
        recall(params.toBuilder().profileId(profileId).build(), requestOptions)

    /** @see recall */
    fun recall(params: ProfileRecallParams): CompletableFuture<ProfileRecallResponse> =
        recall(params, RequestOptions.none())

    /** @see recall */
    fun recall(
        params: ProfileRecallParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProfileRecallResponse>

    /**
     * For a fact the agent has already distilled: `text` is stored as given, with nothing extracted
     * from it. Send a transcript to `ingest` instead. Remembering the same text again writes the
     * same memory rather than a second copy of it, so a retry is safe. The write runs
     * asynchronously -- poll the returned operation.
     */
    fun remember(
        profileId: String,
        params: ProfileRememberParams,
    ): CompletableFuture<ProfileRememberResponse> =
        remember(profileId, params, RequestOptions.none())

    /** @see remember */
    fun remember(
        profileId: String,
        params: ProfileRememberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProfileRememberResponse> =
        remember(params.toBuilder().profileId(profileId).build(), requestOptions)

    /** @see remember */
    fun remember(params: ProfileRememberParams): CompletableFuture<ProfileRememberResponse> =
        remember(params, RequestOptions.none())

    /** @see remember */
    fun remember(
        params: ProfileRememberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProfileRememberResponse>

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
    ): CompletableFuture<ProfileRetrieveSummaryResponse> =
        retrieveSummary(profileId, params, RequestOptions.none())

    /** @see retrieveSummary */
    fun retrieveSummary(
        profileId: String,
        params: ProfileRetrieveSummaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProfileRetrieveSummaryResponse> =
        retrieveSummary(params.toBuilder().profileId(profileId).build(), requestOptions)

    /** @see retrieveSummary */
    fun retrieveSummary(
        params: ProfileRetrieveSummaryParams
    ): CompletableFuture<ProfileRetrieveSummaryResponse> =
        retrieveSummary(params, RequestOptions.none())

    /** @see retrieveSummary */
    fun retrieveSummary(
        params: ProfileRetrieveSummaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProfileRetrieveSummaryResponse>

    /**
     * A view of [ProfileServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProfileServiceAsync.WithRawResponse

        /** What a namespace and a profile hold. */
        fun memories(): MemoryServiceAsync.WithRawResponse

        /** What a profile stored, and what its memories came from. */
        fun sources(): SourceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/memory/namespaces/{namespace}/profiles`, but is
         * otherwise the same as [ProfileServiceAsync.list].
         */
        fun list(namespace: String): CompletableFuture<HttpResponseFor<ProfileListPageAsync>> =
            list(namespace, ProfileListParams.none())

        /** @see list */
        fun list(
            namespace: String,
            params: ProfileListParams = ProfileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProfileListPageAsync>> =
            list(params.toBuilder().namespace(namespace).build(), requestOptions)

        /** @see list */
        fun list(
            namespace: String,
            params: ProfileListParams = ProfileListParams.none(),
        ): CompletableFuture<HttpResponseFor<ProfileListPageAsync>> =
            list(namespace, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ProfileListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProfileListPageAsync>>

        /** @see list */
        fun list(
            params: ProfileListParams
        ): CompletableFuture<HttpResponseFor<ProfileListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            namespace: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProfileListPageAsync>> =
            list(namespace, ProfileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /ai/memory/namespaces/{namespace}/profiles/{profile_id}`, but is otherwise the same as
         * [ProfileServiceAsync.delete].
         */
        fun delete(
            profileId: String,
            params: ProfileDeleteParams,
        ): CompletableFuture<HttpResponseFor<ProfileDeleteResponse>> =
            delete(profileId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            profileId: String,
            params: ProfileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProfileDeleteResponse>> =
            delete(params.toBuilder().profileId(profileId).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: ProfileDeleteParams
        ): CompletableFuture<HttpResponseFor<ProfileDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ProfileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProfileDeleteResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /ai/memory/namespaces/{namespace}/profiles/{profile_id}/ingest`, but is otherwise the
         * same as [ProfileServiceAsync.ingest].
         */
        fun ingest(
            profileId: String,
            params: ProfileIngestParams,
        ): CompletableFuture<HttpResponseFor<ProfileIngestResponse>> =
            ingest(profileId, params, RequestOptions.none())

        /** @see ingest */
        fun ingest(
            profileId: String,
            params: ProfileIngestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProfileIngestResponse>> =
            ingest(params.toBuilder().profileId(profileId).build(), requestOptions)

        /** @see ingest */
        fun ingest(
            params: ProfileIngestParams
        ): CompletableFuture<HttpResponseFor<ProfileIngestResponse>> =
            ingest(params, RequestOptions.none())

        /** @see ingest */
        fun ingest(
            params: ProfileIngestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProfileIngestResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /ai/memory/namespaces/{namespace}/profiles/{profile_id}/recall`, but is otherwise the
         * same as [ProfileServiceAsync.recall].
         */
        fun recall(
            profileId: String,
            params: ProfileRecallParams,
        ): CompletableFuture<HttpResponseFor<ProfileRecallResponse>> =
            recall(profileId, params, RequestOptions.none())

        /** @see recall */
        fun recall(
            profileId: String,
            params: ProfileRecallParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProfileRecallResponse>> =
            recall(params.toBuilder().profileId(profileId).build(), requestOptions)

        /** @see recall */
        fun recall(
            params: ProfileRecallParams
        ): CompletableFuture<HttpResponseFor<ProfileRecallResponse>> =
            recall(params, RequestOptions.none())

        /** @see recall */
        fun recall(
            params: ProfileRecallParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProfileRecallResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /ai/memory/namespaces/{namespace}/profiles/{profile_id}/remember`, but is otherwise the
         * same as [ProfileServiceAsync.remember].
         */
        fun remember(
            profileId: String,
            params: ProfileRememberParams,
        ): CompletableFuture<HttpResponseFor<ProfileRememberResponse>> =
            remember(profileId, params, RequestOptions.none())

        /** @see remember */
        fun remember(
            profileId: String,
            params: ProfileRememberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProfileRememberResponse>> =
            remember(params.toBuilder().profileId(profileId).build(), requestOptions)

        /** @see remember */
        fun remember(
            params: ProfileRememberParams
        ): CompletableFuture<HttpResponseFor<ProfileRememberResponse>> =
            remember(params, RequestOptions.none())

        /** @see remember */
        fun remember(
            params: ProfileRememberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProfileRememberResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /ai/memory/namespaces/{namespace}/profiles/{profile_id}/summary`, but is otherwise the
         * same as [ProfileServiceAsync.retrieveSummary].
         */
        fun retrieveSummary(
            profileId: String,
            params: ProfileRetrieveSummaryParams,
        ): CompletableFuture<HttpResponseFor<ProfileRetrieveSummaryResponse>> =
            retrieveSummary(profileId, params, RequestOptions.none())

        /** @see retrieveSummary */
        fun retrieveSummary(
            profileId: String,
            params: ProfileRetrieveSummaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProfileRetrieveSummaryResponse>> =
            retrieveSummary(params.toBuilder().profileId(profileId).build(), requestOptions)

        /** @see retrieveSummary */
        fun retrieveSummary(
            params: ProfileRetrieveSummaryParams
        ): CompletableFuture<HttpResponseFor<ProfileRetrieveSummaryResponse>> =
            retrieveSummary(params, RequestOptions.none())

        /** @see retrieveSummary */
        fun retrieveSummary(
            params: ProfileRetrieveSummaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProfileRetrieveSummaryResponse>>
    }
}
