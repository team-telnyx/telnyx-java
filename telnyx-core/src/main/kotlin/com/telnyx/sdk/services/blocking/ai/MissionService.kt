// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.missions.MissionCloneMissionParams
import com.telnyx.sdk.models.ai.missions.MissionCloneMissionResponse
import com.telnyx.sdk.models.ai.missions.MissionCreateParams
import com.telnyx.sdk.models.ai.missions.MissionCreateResponse
import com.telnyx.sdk.models.ai.missions.MissionDeleteMissionParams
import com.telnyx.sdk.models.ai.missions.MissionListEventsPage
import com.telnyx.sdk.models.ai.missions.MissionListEventsParams
import com.telnyx.sdk.models.ai.missions.MissionListPage
import com.telnyx.sdk.models.ai.missions.MissionListParams
import com.telnyx.sdk.models.ai.missions.MissionRetrieveParams
import com.telnyx.sdk.models.ai.missions.MissionRetrieveResponse
import com.telnyx.sdk.models.ai.missions.MissionUpdateMissionParams
import com.telnyx.sdk.models.ai.missions.MissionUpdateMissionResponse
import com.telnyx.sdk.services.blocking.ai.missions.KnowledgeBaseService
import com.telnyx.sdk.services.blocking.ai.missions.McpServerService
import com.telnyx.sdk.services.blocking.ai.missions.RunService
import com.telnyx.sdk.services.blocking.ai.missions.ToolService
import java.util.function.Consumer

interface MissionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MissionService

    fun runs(): RunService

    fun knowledgeBases(): KnowledgeBaseService

    fun mcpServers(): McpServerService

    fun tools(): ToolService

    /** Create a new mission definition */
    fun create(params: MissionCreateParams): MissionCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MissionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MissionCreateResponse

    /** Get a mission by ID (includes tools, knowledge_bases, mcp_servers) */
    fun retrieve(missionId: String): MissionRetrieveResponse =
        retrieve(missionId, MissionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        missionId: String,
        params: MissionRetrieveParams = MissionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MissionRetrieveResponse =
        retrieve(params.toBuilder().missionId(missionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        missionId: String,
        params: MissionRetrieveParams = MissionRetrieveParams.none(),
    ): MissionRetrieveResponse = retrieve(missionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MissionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MissionRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: MissionRetrieveParams): MissionRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(missionId: String, requestOptions: RequestOptions): MissionRetrieveResponse =
        retrieve(missionId, MissionRetrieveParams.none(), requestOptions)

    /** List all missions for the organization */
    fun list(): MissionListPage = list(MissionListParams.none())

    /** @see list */
    fun list(
        params: MissionListParams = MissionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MissionListPage

    /** @see list */
    fun list(params: MissionListParams = MissionListParams.none()): MissionListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MissionListPage =
        list(MissionListParams.none(), requestOptions)

    /** Clone an existing mission */
    fun cloneMission(missionId: String): MissionCloneMissionResponse =
        cloneMission(missionId, MissionCloneMissionParams.none())

    /** @see cloneMission */
    fun cloneMission(
        missionId: String,
        params: MissionCloneMissionParams = MissionCloneMissionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MissionCloneMissionResponse =
        cloneMission(params.toBuilder().missionId(missionId).build(), requestOptions)

    /** @see cloneMission */
    fun cloneMission(
        missionId: String,
        params: MissionCloneMissionParams = MissionCloneMissionParams.none(),
    ): MissionCloneMissionResponse = cloneMission(missionId, params, RequestOptions.none())

    /** @see cloneMission */
    fun cloneMission(
        params: MissionCloneMissionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MissionCloneMissionResponse

    /** @see cloneMission */
    fun cloneMission(params: MissionCloneMissionParams): MissionCloneMissionResponse =
        cloneMission(params, RequestOptions.none())

    /** @see cloneMission */
    fun cloneMission(
        missionId: String,
        requestOptions: RequestOptions,
    ): MissionCloneMissionResponse =
        cloneMission(missionId, MissionCloneMissionParams.none(), requestOptions)

    /** Delete a mission */
    fun deleteMission(missionId: String) =
        deleteMission(missionId, MissionDeleteMissionParams.none())

    /** @see deleteMission */
    fun deleteMission(
        missionId: String,
        params: MissionDeleteMissionParams = MissionDeleteMissionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteMission(params.toBuilder().missionId(missionId).build(), requestOptions)

    /** @see deleteMission */
    fun deleteMission(
        missionId: String,
        params: MissionDeleteMissionParams = MissionDeleteMissionParams.none(),
    ) = deleteMission(missionId, params, RequestOptions.none())

    /** @see deleteMission */
    fun deleteMission(
        params: MissionDeleteMissionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteMission */
    fun deleteMission(params: MissionDeleteMissionParams) =
        deleteMission(params, RequestOptions.none())

    /** @see deleteMission */
    fun deleteMission(missionId: String, requestOptions: RequestOptions) =
        deleteMission(missionId, MissionDeleteMissionParams.none(), requestOptions)

    /** List recent events across all missions */
    fun listEvents(): MissionListEventsPage = listEvents(MissionListEventsParams.none())

    /** @see listEvents */
    fun listEvents(
        params: MissionListEventsParams = MissionListEventsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MissionListEventsPage

    /** @see listEvents */
    fun listEvents(
        params: MissionListEventsParams = MissionListEventsParams.none()
    ): MissionListEventsPage = listEvents(params, RequestOptions.none())

    /** @see listEvents */
    fun listEvents(requestOptions: RequestOptions): MissionListEventsPage =
        listEvents(MissionListEventsParams.none(), requestOptions)

    /** Update a mission definition */
    fun updateMission(missionId: String): MissionUpdateMissionResponse =
        updateMission(missionId, MissionUpdateMissionParams.none())

    /** @see updateMission */
    fun updateMission(
        missionId: String,
        params: MissionUpdateMissionParams = MissionUpdateMissionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MissionUpdateMissionResponse =
        updateMission(params.toBuilder().missionId(missionId).build(), requestOptions)

    /** @see updateMission */
    fun updateMission(
        missionId: String,
        params: MissionUpdateMissionParams = MissionUpdateMissionParams.none(),
    ): MissionUpdateMissionResponse = updateMission(missionId, params, RequestOptions.none())

    /** @see updateMission */
    fun updateMission(
        params: MissionUpdateMissionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MissionUpdateMissionResponse

    /** @see updateMission */
    fun updateMission(params: MissionUpdateMissionParams): MissionUpdateMissionResponse =
        updateMission(params, RequestOptions.none())

    /** @see updateMission */
    fun updateMission(
        missionId: String,
        requestOptions: RequestOptions,
    ): MissionUpdateMissionResponse =
        updateMission(missionId, MissionUpdateMissionParams.none(), requestOptions)

    /** A view of [MissionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MissionService.WithRawResponse

        fun runs(): RunService.WithRawResponse

        fun knowledgeBases(): KnowledgeBaseService.WithRawResponse

        fun mcpServers(): McpServerService.WithRawResponse

        fun tools(): ToolService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/missions`, but is otherwise the same as
         * [MissionService.create].
         */
        @MustBeClosed
        fun create(params: MissionCreateParams): HttpResponseFor<MissionCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: MissionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MissionCreateResponse>

        /**
         * Returns a raw HTTP response for `get /ai/missions/{mission_id}`, but is otherwise the
         * same as [MissionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(missionId: String): HttpResponseFor<MissionRetrieveResponse> =
            retrieve(missionId, MissionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            missionId: String,
            params: MissionRetrieveParams = MissionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MissionRetrieveResponse> =
            retrieve(params.toBuilder().missionId(missionId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            missionId: String,
            params: MissionRetrieveParams = MissionRetrieveParams.none(),
        ): HttpResponseFor<MissionRetrieveResponse> =
            retrieve(missionId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MissionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MissionRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: MissionRetrieveParams): HttpResponseFor<MissionRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            missionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MissionRetrieveResponse> =
            retrieve(missionId, MissionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/missions`, but is otherwise the same as
         * [MissionService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<MissionListPage> = list(MissionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MissionListParams = MissionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MissionListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MissionListParams = MissionListParams.none()
        ): HttpResponseFor<MissionListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MissionListPage> =
            list(MissionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/missions/{mission_id}/clone`, but is otherwise
         * the same as [MissionService.cloneMission].
         */
        @MustBeClosed
        fun cloneMission(missionId: String): HttpResponseFor<MissionCloneMissionResponse> =
            cloneMission(missionId, MissionCloneMissionParams.none())

        /** @see cloneMission */
        @MustBeClosed
        fun cloneMission(
            missionId: String,
            params: MissionCloneMissionParams = MissionCloneMissionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MissionCloneMissionResponse> =
            cloneMission(params.toBuilder().missionId(missionId).build(), requestOptions)

        /** @see cloneMission */
        @MustBeClosed
        fun cloneMission(
            missionId: String,
            params: MissionCloneMissionParams = MissionCloneMissionParams.none(),
        ): HttpResponseFor<MissionCloneMissionResponse> =
            cloneMission(missionId, params, RequestOptions.none())

        /** @see cloneMission */
        @MustBeClosed
        fun cloneMission(
            params: MissionCloneMissionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MissionCloneMissionResponse>

        /** @see cloneMission */
        @MustBeClosed
        fun cloneMission(
            params: MissionCloneMissionParams
        ): HttpResponseFor<MissionCloneMissionResponse> =
            cloneMission(params, RequestOptions.none())

        /** @see cloneMission */
        @MustBeClosed
        fun cloneMission(
            missionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MissionCloneMissionResponse> =
            cloneMission(missionId, MissionCloneMissionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/missions/{mission_id}`, but is otherwise the
         * same as [MissionService.deleteMission].
         */
        @MustBeClosed
        fun deleteMission(missionId: String): HttpResponse =
            deleteMission(missionId, MissionDeleteMissionParams.none())

        /** @see deleteMission */
        @MustBeClosed
        fun deleteMission(
            missionId: String,
            params: MissionDeleteMissionParams = MissionDeleteMissionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteMission(params.toBuilder().missionId(missionId).build(), requestOptions)

        /** @see deleteMission */
        @MustBeClosed
        fun deleteMission(
            missionId: String,
            params: MissionDeleteMissionParams = MissionDeleteMissionParams.none(),
        ): HttpResponse = deleteMission(missionId, params, RequestOptions.none())

        /** @see deleteMission */
        @MustBeClosed
        fun deleteMission(
            params: MissionDeleteMissionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteMission */
        @MustBeClosed
        fun deleteMission(params: MissionDeleteMissionParams): HttpResponse =
            deleteMission(params, RequestOptions.none())

        /** @see deleteMission */
        @MustBeClosed
        fun deleteMission(missionId: String, requestOptions: RequestOptions): HttpResponse =
            deleteMission(missionId, MissionDeleteMissionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/missions/events`, but is otherwise the same as
         * [MissionService.listEvents].
         */
        @MustBeClosed
        fun listEvents(): HttpResponseFor<MissionListEventsPage> =
            listEvents(MissionListEventsParams.none())

        /** @see listEvents */
        @MustBeClosed
        fun listEvents(
            params: MissionListEventsParams = MissionListEventsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MissionListEventsPage>

        /** @see listEvents */
        @MustBeClosed
        fun listEvents(
            params: MissionListEventsParams = MissionListEventsParams.none()
        ): HttpResponseFor<MissionListEventsPage> = listEvents(params, RequestOptions.none())

        /** @see listEvents */
        @MustBeClosed
        fun listEvents(requestOptions: RequestOptions): HttpResponseFor<MissionListEventsPage> =
            listEvents(MissionListEventsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /ai/missions/{mission_id}`, but is otherwise the
         * same as [MissionService.updateMission].
         */
        @MustBeClosed
        fun updateMission(missionId: String): HttpResponseFor<MissionUpdateMissionResponse> =
            updateMission(missionId, MissionUpdateMissionParams.none())

        /** @see updateMission */
        @MustBeClosed
        fun updateMission(
            missionId: String,
            params: MissionUpdateMissionParams = MissionUpdateMissionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MissionUpdateMissionResponse> =
            updateMission(params.toBuilder().missionId(missionId).build(), requestOptions)

        /** @see updateMission */
        @MustBeClosed
        fun updateMission(
            missionId: String,
            params: MissionUpdateMissionParams = MissionUpdateMissionParams.none(),
        ): HttpResponseFor<MissionUpdateMissionResponse> =
            updateMission(missionId, params, RequestOptions.none())

        /** @see updateMission */
        @MustBeClosed
        fun updateMission(
            params: MissionUpdateMissionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MissionUpdateMissionResponse>

        /** @see updateMission */
        @MustBeClosed
        fun updateMission(
            params: MissionUpdateMissionParams
        ): HttpResponseFor<MissionUpdateMissionResponse> =
            updateMission(params, RequestOptions.none())

        /** @see updateMission */
        @MustBeClosed
        fun updateMission(
            missionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MissionUpdateMissionResponse> =
            updateMission(missionId, MissionUpdateMissionParams.none(), requestOptions)
    }
}
