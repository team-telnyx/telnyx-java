// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.missions.MissionCloneMissionParams
import com.telnyx.sdk.models.ai.missions.MissionCloneMissionResponse
import com.telnyx.sdk.models.ai.missions.MissionCreateParams
import com.telnyx.sdk.models.ai.missions.MissionCreateResponse
import com.telnyx.sdk.models.ai.missions.MissionDeleteMissionParams
import com.telnyx.sdk.models.ai.missions.MissionListEventsPageAsync
import com.telnyx.sdk.models.ai.missions.MissionListEventsParams
import com.telnyx.sdk.models.ai.missions.MissionListPageAsync
import com.telnyx.sdk.models.ai.missions.MissionListParams
import com.telnyx.sdk.models.ai.missions.MissionRetrieveParams
import com.telnyx.sdk.models.ai.missions.MissionRetrieveResponse
import com.telnyx.sdk.models.ai.missions.MissionUpdateMissionParams
import com.telnyx.sdk.models.ai.missions.MissionUpdateMissionResponse
import com.telnyx.sdk.services.async.ai.missions.KnowledgeBaseServiceAsync
import com.telnyx.sdk.services.async.ai.missions.McpServerServiceAsync
import com.telnyx.sdk.services.async.ai.missions.RunServiceAsync
import com.telnyx.sdk.services.async.ai.missions.ToolServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MissionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MissionServiceAsync

    fun runs(): RunServiceAsync

    fun knowledgeBases(): KnowledgeBaseServiceAsync

    fun mcpServers(): McpServerServiceAsync

    fun tools(): ToolServiceAsync

    /** Create a new mission definition */
    fun create(params: MissionCreateParams): CompletableFuture<MissionCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MissionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MissionCreateResponse>

    /** Get a mission by ID (includes tools, knowledge_bases, mcp_servers) */
    fun retrieve(missionId: String): CompletableFuture<MissionRetrieveResponse> =
        retrieve(missionId, MissionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        missionId: String,
        params: MissionRetrieveParams = MissionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MissionRetrieveResponse> =
        retrieve(params.toBuilder().missionId(missionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        missionId: String,
        params: MissionRetrieveParams = MissionRetrieveParams.none(),
    ): CompletableFuture<MissionRetrieveResponse> =
        retrieve(missionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MissionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MissionRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: MissionRetrieveParams): CompletableFuture<MissionRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        missionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MissionRetrieveResponse> =
        retrieve(missionId, MissionRetrieveParams.none(), requestOptions)

    /** List all missions for the organization */
    fun list(): CompletableFuture<MissionListPageAsync> = list(MissionListParams.none())

    /** @see list */
    fun list(
        params: MissionListParams = MissionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MissionListPageAsync>

    /** @see list */
    fun list(
        params: MissionListParams = MissionListParams.none()
    ): CompletableFuture<MissionListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MissionListPageAsync> =
        list(MissionListParams.none(), requestOptions)

    /** Clone an existing mission */
    fun cloneMission(missionId: String): CompletableFuture<MissionCloneMissionResponse> =
        cloneMission(missionId, MissionCloneMissionParams.none())

    /** @see cloneMission */
    fun cloneMission(
        missionId: String,
        params: MissionCloneMissionParams = MissionCloneMissionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MissionCloneMissionResponse> =
        cloneMission(params.toBuilder().missionId(missionId).build(), requestOptions)

    /** @see cloneMission */
    fun cloneMission(
        missionId: String,
        params: MissionCloneMissionParams = MissionCloneMissionParams.none(),
    ): CompletableFuture<MissionCloneMissionResponse> =
        cloneMission(missionId, params, RequestOptions.none())

    /** @see cloneMission */
    fun cloneMission(
        params: MissionCloneMissionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MissionCloneMissionResponse>

    /** @see cloneMission */
    fun cloneMission(
        params: MissionCloneMissionParams
    ): CompletableFuture<MissionCloneMissionResponse> = cloneMission(params, RequestOptions.none())

    /** @see cloneMission */
    fun cloneMission(
        missionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MissionCloneMissionResponse> =
        cloneMission(missionId, MissionCloneMissionParams.none(), requestOptions)

    /** Delete a mission */
    fun deleteMission(missionId: String): CompletableFuture<Void?> =
        deleteMission(missionId, MissionDeleteMissionParams.none())

    /** @see deleteMission */
    fun deleteMission(
        missionId: String,
        params: MissionDeleteMissionParams = MissionDeleteMissionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteMission(params.toBuilder().missionId(missionId).build(), requestOptions)

    /** @see deleteMission */
    fun deleteMission(
        missionId: String,
        params: MissionDeleteMissionParams = MissionDeleteMissionParams.none(),
    ): CompletableFuture<Void?> = deleteMission(missionId, params, RequestOptions.none())

    /** @see deleteMission */
    fun deleteMission(
        params: MissionDeleteMissionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteMission */
    fun deleteMission(params: MissionDeleteMissionParams): CompletableFuture<Void?> =
        deleteMission(params, RequestOptions.none())

    /** @see deleteMission */
    fun deleteMission(missionId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        deleteMission(missionId, MissionDeleteMissionParams.none(), requestOptions)

    /** List recent events across all missions */
    fun listEvents(): CompletableFuture<MissionListEventsPageAsync> =
        listEvents(MissionListEventsParams.none())

    /** @see listEvents */
    fun listEvents(
        params: MissionListEventsParams = MissionListEventsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MissionListEventsPageAsync>

    /** @see listEvents */
    fun listEvents(
        params: MissionListEventsParams = MissionListEventsParams.none()
    ): CompletableFuture<MissionListEventsPageAsync> = listEvents(params, RequestOptions.none())

    /** @see listEvents */
    fun listEvents(requestOptions: RequestOptions): CompletableFuture<MissionListEventsPageAsync> =
        listEvents(MissionListEventsParams.none(), requestOptions)

    /** Update a mission definition */
    fun updateMission(missionId: String): CompletableFuture<MissionUpdateMissionResponse> =
        updateMission(missionId, MissionUpdateMissionParams.none())

    /** @see updateMission */
    fun updateMission(
        missionId: String,
        params: MissionUpdateMissionParams = MissionUpdateMissionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MissionUpdateMissionResponse> =
        updateMission(params.toBuilder().missionId(missionId).build(), requestOptions)

    /** @see updateMission */
    fun updateMission(
        missionId: String,
        params: MissionUpdateMissionParams = MissionUpdateMissionParams.none(),
    ): CompletableFuture<MissionUpdateMissionResponse> =
        updateMission(missionId, params, RequestOptions.none())

    /** @see updateMission */
    fun updateMission(
        params: MissionUpdateMissionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MissionUpdateMissionResponse>

    /** @see updateMission */
    fun updateMission(
        params: MissionUpdateMissionParams
    ): CompletableFuture<MissionUpdateMissionResponse> =
        updateMission(params, RequestOptions.none())

    /** @see updateMission */
    fun updateMission(
        missionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MissionUpdateMissionResponse> =
        updateMission(missionId, MissionUpdateMissionParams.none(), requestOptions)

    /**
     * A view of [MissionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MissionServiceAsync.WithRawResponse

        fun runs(): RunServiceAsync.WithRawResponse

        fun knowledgeBases(): KnowledgeBaseServiceAsync.WithRawResponse

        fun mcpServers(): McpServerServiceAsync.WithRawResponse

        fun tools(): ToolServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/missions`, but is otherwise the same as
         * [MissionServiceAsync.create].
         */
        fun create(
            params: MissionCreateParams
        ): CompletableFuture<HttpResponseFor<MissionCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: MissionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MissionCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /ai/missions/{mission_id}`, but is otherwise the
         * same as [MissionServiceAsync.retrieve].
         */
        fun retrieve(
            missionId: String
        ): CompletableFuture<HttpResponseFor<MissionRetrieveResponse>> =
            retrieve(missionId, MissionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            missionId: String,
            params: MissionRetrieveParams = MissionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MissionRetrieveResponse>> =
            retrieve(params.toBuilder().missionId(missionId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            missionId: String,
            params: MissionRetrieveParams = MissionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<MissionRetrieveResponse>> =
            retrieve(missionId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: MissionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MissionRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: MissionRetrieveParams
        ): CompletableFuture<HttpResponseFor<MissionRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            missionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MissionRetrieveResponse>> =
            retrieve(missionId, MissionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/missions`, but is otherwise the same as
         * [MissionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MissionListPageAsync>> =
            list(MissionListParams.none())

        /** @see list */
        fun list(
            params: MissionListParams = MissionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MissionListPageAsync>>

        /** @see list */
        fun list(
            params: MissionListParams = MissionListParams.none()
        ): CompletableFuture<HttpResponseFor<MissionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MissionListPageAsync>> =
            list(MissionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/missions/{mission_id}/clone`, but is otherwise
         * the same as [MissionServiceAsync.cloneMission].
         */
        fun cloneMission(
            missionId: String
        ): CompletableFuture<HttpResponseFor<MissionCloneMissionResponse>> =
            cloneMission(missionId, MissionCloneMissionParams.none())

        /** @see cloneMission */
        fun cloneMission(
            missionId: String,
            params: MissionCloneMissionParams = MissionCloneMissionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MissionCloneMissionResponse>> =
            cloneMission(params.toBuilder().missionId(missionId).build(), requestOptions)

        /** @see cloneMission */
        fun cloneMission(
            missionId: String,
            params: MissionCloneMissionParams = MissionCloneMissionParams.none(),
        ): CompletableFuture<HttpResponseFor<MissionCloneMissionResponse>> =
            cloneMission(missionId, params, RequestOptions.none())

        /** @see cloneMission */
        fun cloneMission(
            params: MissionCloneMissionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MissionCloneMissionResponse>>

        /** @see cloneMission */
        fun cloneMission(
            params: MissionCloneMissionParams
        ): CompletableFuture<HttpResponseFor<MissionCloneMissionResponse>> =
            cloneMission(params, RequestOptions.none())

        /** @see cloneMission */
        fun cloneMission(
            missionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MissionCloneMissionResponse>> =
            cloneMission(missionId, MissionCloneMissionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/missions/{mission_id}`, but is otherwise the
         * same as [MissionServiceAsync.deleteMission].
         */
        fun deleteMission(missionId: String): CompletableFuture<HttpResponse> =
            deleteMission(missionId, MissionDeleteMissionParams.none())

        /** @see deleteMission */
        fun deleteMission(
            missionId: String,
            params: MissionDeleteMissionParams = MissionDeleteMissionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteMission(params.toBuilder().missionId(missionId).build(), requestOptions)

        /** @see deleteMission */
        fun deleteMission(
            missionId: String,
            params: MissionDeleteMissionParams = MissionDeleteMissionParams.none(),
        ): CompletableFuture<HttpResponse> = deleteMission(missionId, params, RequestOptions.none())

        /** @see deleteMission */
        fun deleteMission(
            params: MissionDeleteMissionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteMission */
        fun deleteMission(params: MissionDeleteMissionParams): CompletableFuture<HttpResponse> =
            deleteMission(params, RequestOptions.none())

        /** @see deleteMission */
        fun deleteMission(
            missionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deleteMission(missionId, MissionDeleteMissionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/missions/events`, but is otherwise the same as
         * [MissionServiceAsync.listEvents].
         */
        fun listEvents(): CompletableFuture<HttpResponseFor<MissionListEventsPageAsync>> =
            listEvents(MissionListEventsParams.none())

        /** @see listEvents */
        fun listEvents(
            params: MissionListEventsParams = MissionListEventsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MissionListEventsPageAsync>>

        /** @see listEvents */
        fun listEvents(
            params: MissionListEventsParams = MissionListEventsParams.none()
        ): CompletableFuture<HttpResponseFor<MissionListEventsPageAsync>> =
            listEvents(params, RequestOptions.none())

        /** @see listEvents */
        fun listEvents(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MissionListEventsPageAsync>> =
            listEvents(MissionListEventsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /ai/missions/{mission_id}`, but is otherwise the
         * same as [MissionServiceAsync.updateMission].
         */
        fun updateMission(
            missionId: String
        ): CompletableFuture<HttpResponseFor<MissionUpdateMissionResponse>> =
            updateMission(missionId, MissionUpdateMissionParams.none())

        /** @see updateMission */
        fun updateMission(
            missionId: String,
            params: MissionUpdateMissionParams = MissionUpdateMissionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MissionUpdateMissionResponse>> =
            updateMission(params.toBuilder().missionId(missionId).build(), requestOptions)

        /** @see updateMission */
        fun updateMission(
            missionId: String,
            params: MissionUpdateMissionParams = MissionUpdateMissionParams.none(),
        ): CompletableFuture<HttpResponseFor<MissionUpdateMissionResponse>> =
            updateMission(missionId, params, RequestOptions.none())

        /** @see updateMission */
        fun updateMission(
            params: MissionUpdateMissionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MissionUpdateMissionResponse>>

        /** @see updateMission */
        fun updateMission(
            params: MissionUpdateMissionParams
        ): CompletableFuture<HttpResponseFor<MissionUpdateMissionResponse>> =
            updateMission(params, RequestOptions.none())

        /** @see updateMission */
        fun updateMission(
            missionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MissionUpdateMissionResponse>> =
            updateMission(missionId, MissionUpdateMissionParams.none(), requestOptions)
    }
}
