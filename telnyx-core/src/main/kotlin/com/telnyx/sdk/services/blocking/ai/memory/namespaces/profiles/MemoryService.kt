// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.memory.namespaces.profiles

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.memories.MemoryListPage
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.memories.MemoryListParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.memories.MemoryRetrieveParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.memories.MemoryRetrieveResponse
import java.util.function.Consumer

/** What a namespace and a profile hold. */
interface MemoryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MemoryService

    /**
     * One memory by its id, as `recall` and the listing return it, together with what it came from.
     * A fact names its `source_id`: read it with `GET .../sources/{source_id}` to see what was
     * stored. A memory derived from other memories names them in `derived_from` instead; read each
     * of those to reach its source.
     */
    fun retrieve(memoryId: String, params: MemoryRetrieveParams): MemoryRetrieveResponse =
        retrieve(memoryId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        memoryId: String,
        params: MemoryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MemoryRetrieveResponse =
        retrieve(params.toBuilder().memoryId(memoryId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: MemoryRetrieveParams): MemoryRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MemoryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MemoryRetrieveResponse

    /**
     * Everything stored under one profile, unranked -- ask `recall` for the memories that answer a
     * question. A profile that holds nothing is an empty page rather than a 404: profiles exist by
     * being written to. Each memory names the `source_id` it was extracted from, or null for a
     * memory derived from other memories -- which can read almost the same as the fact it restates.
     * A `source_id` narrows the listing to the memories extracted from that source, and a
     * `session_id` to those extracted from the session, which is the same thing named another way;
     * pass one or the other. Neither is everything the source led to: a memory derived from several
     * sources belongs to no single one and appears only in the unfiltered listing. A memory written
     * while the listing is paged shifts the pages after it, so an entry can be repeated or missed
     * at a page boundary.
     */
    fun list(profileId: String, params: MemoryListParams): MemoryListPage =
        list(profileId, params, RequestOptions.none())

    /** @see list */
    fun list(
        profileId: String,
        params: MemoryListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MemoryListPage = list(params.toBuilder().profileId(profileId).build(), requestOptions)

    /** @see list */
    fun list(params: MemoryListParams): MemoryListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: MemoryListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MemoryListPage

    /** A view of [MemoryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MemoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /ai/memory/namespaces/{namespace}/profiles/{profile_id}/memories/{memory_id}`, but is
         * otherwise the same as [MemoryService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            memoryId: String,
            params: MemoryRetrieveParams,
        ): HttpResponseFor<MemoryRetrieveResponse> =
            retrieve(memoryId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            memoryId: String,
            params: MemoryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MemoryRetrieveResponse> =
            retrieve(params.toBuilder().memoryId(memoryId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: MemoryRetrieveParams): HttpResponseFor<MemoryRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MemoryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MemoryRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get
         * /ai/memory/namespaces/{namespace}/profiles/{profile_id}/memories`, but is otherwise the
         * same as [MemoryService.list].
         */
        @MustBeClosed
        fun list(profileId: String, params: MemoryListParams): HttpResponseFor<MemoryListPage> =
            list(profileId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            profileId: String,
            params: MemoryListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MemoryListPage> =
            list(params.toBuilder().profileId(profileId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(params: MemoryListParams): HttpResponseFor<MemoryListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MemoryListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MemoryListPage>
    }
}
