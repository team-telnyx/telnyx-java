// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.missions

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseCreateKnowledgeBaseParams
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseCreateKnowledgeBaseResponse
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseDeleteKnowledgeBaseParams
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseGetKnowledgeBaseParams
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseGetKnowledgeBaseResponse
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseListKnowledgeBasesParams
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseListKnowledgeBasesResponse
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseUpdateKnowledgeBaseParams
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseUpdateKnowledgeBaseResponse
import java.util.function.Consumer

interface KnowledgeBaseService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): KnowledgeBaseService

    /** Create a new knowledge base for a mission */
    fun createKnowledgeBase(missionId: String): KnowledgeBaseCreateKnowledgeBaseResponse =
        createKnowledgeBase(missionId, KnowledgeBaseCreateKnowledgeBaseParams.none())

    /** @see createKnowledgeBase */
    fun createKnowledgeBase(
        missionId: String,
        params: KnowledgeBaseCreateKnowledgeBaseParams =
            KnowledgeBaseCreateKnowledgeBaseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KnowledgeBaseCreateKnowledgeBaseResponse =
        createKnowledgeBase(params.toBuilder().missionId(missionId).build(), requestOptions)

    /** @see createKnowledgeBase */
    fun createKnowledgeBase(
        missionId: String,
        params: KnowledgeBaseCreateKnowledgeBaseParams =
            KnowledgeBaseCreateKnowledgeBaseParams.none(),
    ): KnowledgeBaseCreateKnowledgeBaseResponse =
        createKnowledgeBase(missionId, params, RequestOptions.none())

    /** @see createKnowledgeBase */
    fun createKnowledgeBase(
        params: KnowledgeBaseCreateKnowledgeBaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KnowledgeBaseCreateKnowledgeBaseResponse

    /** @see createKnowledgeBase */
    fun createKnowledgeBase(
        params: KnowledgeBaseCreateKnowledgeBaseParams
    ): KnowledgeBaseCreateKnowledgeBaseResponse = createKnowledgeBase(params, RequestOptions.none())

    /** @see createKnowledgeBase */
    fun createKnowledgeBase(
        missionId: String,
        requestOptions: RequestOptions,
    ): KnowledgeBaseCreateKnowledgeBaseResponse =
        createKnowledgeBase(
            missionId,
            KnowledgeBaseCreateKnowledgeBaseParams.none(),
            requestOptions,
        )

    /** Delete a knowledge base from a mission */
    fun deleteKnowledgeBase(
        knowledgeBaseId: String,
        params: KnowledgeBaseDeleteKnowledgeBaseParams,
    ) = deleteKnowledgeBase(knowledgeBaseId, params, RequestOptions.none())

    /** @see deleteKnowledgeBase */
    fun deleteKnowledgeBase(
        knowledgeBaseId: String,
        params: KnowledgeBaseDeleteKnowledgeBaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        deleteKnowledgeBase(
            params.toBuilder().knowledgeBaseId(knowledgeBaseId).build(),
            requestOptions,
        )

    /** @see deleteKnowledgeBase */
    fun deleteKnowledgeBase(params: KnowledgeBaseDeleteKnowledgeBaseParams) =
        deleteKnowledgeBase(params, RequestOptions.none())

    /** @see deleteKnowledgeBase */
    fun deleteKnowledgeBase(
        params: KnowledgeBaseDeleteKnowledgeBaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Get a specific knowledge base by ID */
    fun getKnowledgeBase(
        knowledgeBaseId: String,
        params: KnowledgeBaseGetKnowledgeBaseParams,
    ): KnowledgeBaseGetKnowledgeBaseResponse =
        getKnowledgeBase(knowledgeBaseId, params, RequestOptions.none())

    /** @see getKnowledgeBase */
    fun getKnowledgeBase(
        knowledgeBaseId: String,
        params: KnowledgeBaseGetKnowledgeBaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KnowledgeBaseGetKnowledgeBaseResponse =
        getKnowledgeBase(
            params.toBuilder().knowledgeBaseId(knowledgeBaseId).build(),
            requestOptions,
        )

    /** @see getKnowledgeBase */
    fun getKnowledgeBase(
        params: KnowledgeBaseGetKnowledgeBaseParams
    ): KnowledgeBaseGetKnowledgeBaseResponse = getKnowledgeBase(params, RequestOptions.none())

    /** @see getKnowledgeBase */
    fun getKnowledgeBase(
        params: KnowledgeBaseGetKnowledgeBaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KnowledgeBaseGetKnowledgeBaseResponse

    /** List all knowledge bases for a mission */
    fun listKnowledgeBases(missionId: String): KnowledgeBaseListKnowledgeBasesResponse =
        listKnowledgeBases(missionId, KnowledgeBaseListKnowledgeBasesParams.none())

    /** @see listKnowledgeBases */
    fun listKnowledgeBases(
        missionId: String,
        params: KnowledgeBaseListKnowledgeBasesParams =
            KnowledgeBaseListKnowledgeBasesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KnowledgeBaseListKnowledgeBasesResponse =
        listKnowledgeBases(params.toBuilder().missionId(missionId).build(), requestOptions)

    /** @see listKnowledgeBases */
    fun listKnowledgeBases(
        missionId: String,
        params: KnowledgeBaseListKnowledgeBasesParams = KnowledgeBaseListKnowledgeBasesParams.none(),
    ): KnowledgeBaseListKnowledgeBasesResponse =
        listKnowledgeBases(missionId, params, RequestOptions.none())

    /** @see listKnowledgeBases */
    fun listKnowledgeBases(
        params: KnowledgeBaseListKnowledgeBasesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KnowledgeBaseListKnowledgeBasesResponse

    /** @see listKnowledgeBases */
    fun listKnowledgeBases(
        params: KnowledgeBaseListKnowledgeBasesParams
    ): KnowledgeBaseListKnowledgeBasesResponse = listKnowledgeBases(params, RequestOptions.none())

    /** @see listKnowledgeBases */
    fun listKnowledgeBases(
        missionId: String,
        requestOptions: RequestOptions,
    ): KnowledgeBaseListKnowledgeBasesResponse =
        listKnowledgeBases(missionId, KnowledgeBaseListKnowledgeBasesParams.none(), requestOptions)

    /** Update a knowledge base definition */
    fun updateKnowledgeBase(
        knowledgeBaseId: String,
        params: KnowledgeBaseUpdateKnowledgeBaseParams,
    ): KnowledgeBaseUpdateKnowledgeBaseResponse =
        updateKnowledgeBase(knowledgeBaseId, params, RequestOptions.none())

    /** @see updateKnowledgeBase */
    fun updateKnowledgeBase(
        knowledgeBaseId: String,
        params: KnowledgeBaseUpdateKnowledgeBaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KnowledgeBaseUpdateKnowledgeBaseResponse =
        updateKnowledgeBase(
            params.toBuilder().knowledgeBaseId(knowledgeBaseId).build(),
            requestOptions,
        )

    /** @see updateKnowledgeBase */
    fun updateKnowledgeBase(
        params: KnowledgeBaseUpdateKnowledgeBaseParams
    ): KnowledgeBaseUpdateKnowledgeBaseResponse = updateKnowledgeBase(params, RequestOptions.none())

    /** @see updateKnowledgeBase */
    fun updateKnowledgeBase(
        params: KnowledgeBaseUpdateKnowledgeBaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KnowledgeBaseUpdateKnowledgeBaseResponse

    /**
     * A view of [KnowledgeBaseService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): KnowledgeBaseService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/missions/{mission_id}/knowledge-bases`, but is
         * otherwise the same as [KnowledgeBaseService.createKnowledgeBase].
         */
        @MustBeClosed
        fun createKnowledgeBase(
            missionId: String
        ): HttpResponseFor<KnowledgeBaseCreateKnowledgeBaseResponse> =
            createKnowledgeBase(missionId, KnowledgeBaseCreateKnowledgeBaseParams.none())

        /** @see createKnowledgeBase */
        @MustBeClosed
        fun createKnowledgeBase(
            missionId: String,
            params: KnowledgeBaseCreateKnowledgeBaseParams =
                KnowledgeBaseCreateKnowledgeBaseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KnowledgeBaseCreateKnowledgeBaseResponse> =
            createKnowledgeBase(params.toBuilder().missionId(missionId).build(), requestOptions)

        /** @see createKnowledgeBase */
        @MustBeClosed
        fun createKnowledgeBase(
            missionId: String,
            params: KnowledgeBaseCreateKnowledgeBaseParams =
                KnowledgeBaseCreateKnowledgeBaseParams.none(),
        ): HttpResponseFor<KnowledgeBaseCreateKnowledgeBaseResponse> =
            createKnowledgeBase(missionId, params, RequestOptions.none())

        /** @see createKnowledgeBase */
        @MustBeClosed
        fun createKnowledgeBase(
            params: KnowledgeBaseCreateKnowledgeBaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KnowledgeBaseCreateKnowledgeBaseResponse>

        /** @see createKnowledgeBase */
        @MustBeClosed
        fun createKnowledgeBase(
            params: KnowledgeBaseCreateKnowledgeBaseParams
        ): HttpResponseFor<KnowledgeBaseCreateKnowledgeBaseResponse> =
            createKnowledgeBase(params, RequestOptions.none())

        /** @see createKnowledgeBase */
        @MustBeClosed
        fun createKnowledgeBase(
            missionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KnowledgeBaseCreateKnowledgeBaseResponse> =
            createKnowledgeBase(
                missionId,
                KnowledgeBaseCreateKnowledgeBaseParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `delete
         * /ai/missions/{mission_id}/knowledge-bases/{knowledge_base_id}`, but is otherwise the same
         * as [KnowledgeBaseService.deleteKnowledgeBase].
         */
        @MustBeClosed
        fun deleteKnowledgeBase(
            knowledgeBaseId: String,
            params: KnowledgeBaseDeleteKnowledgeBaseParams,
        ): HttpResponse = deleteKnowledgeBase(knowledgeBaseId, params, RequestOptions.none())

        /** @see deleteKnowledgeBase */
        @MustBeClosed
        fun deleteKnowledgeBase(
            knowledgeBaseId: String,
            params: KnowledgeBaseDeleteKnowledgeBaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteKnowledgeBase(
                params.toBuilder().knowledgeBaseId(knowledgeBaseId).build(),
                requestOptions,
            )

        /** @see deleteKnowledgeBase */
        @MustBeClosed
        fun deleteKnowledgeBase(params: KnowledgeBaseDeleteKnowledgeBaseParams): HttpResponse =
            deleteKnowledgeBase(params, RequestOptions.none())

        /** @see deleteKnowledgeBase */
        @MustBeClosed
        fun deleteKnowledgeBase(
            params: KnowledgeBaseDeleteKnowledgeBaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /ai/missions/{mission_id}/knowledge-bases/{knowledge_base_id}`, but is otherwise the same
         * as [KnowledgeBaseService.getKnowledgeBase].
         */
        @MustBeClosed
        fun getKnowledgeBase(
            knowledgeBaseId: String,
            params: KnowledgeBaseGetKnowledgeBaseParams,
        ): HttpResponseFor<KnowledgeBaseGetKnowledgeBaseResponse> =
            getKnowledgeBase(knowledgeBaseId, params, RequestOptions.none())

        /** @see getKnowledgeBase */
        @MustBeClosed
        fun getKnowledgeBase(
            knowledgeBaseId: String,
            params: KnowledgeBaseGetKnowledgeBaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KnowledgeBaseGetKnowledgeBaseResponse> =
            getKnowledgeBase(
                params.toBuilder().knowledgeBaseId(knowledgeBaseId).build(),
                requestOptions,
            )

        /** @see getKnowledgeBase */
        @MustBeClosed
        fun getKnowledgeBase(
            params: KnowledgeBaseGetKnowledgeBaseParams
        ): HttpResponseFor<KnowledgeBaseGetKnowledgeBaseResponse> =
            getKnowledgeBase(params, RequestOptions.none())

        /** @see getKnowledgeBase */
        @MustBeClosed
        fun getKnowledgeBase(
            params: KnowledgeBaseGetKnowledgeBaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KnowledgeBaseGetKnowledgeBaseResponse>

        /**
         * Returns a raw HTTP response for `get /ai/missions/{mission_id}/knowledge-bases`, but is
         * otherwise the same as [KnowledgeBaseService.listKnowledgeBases].
         */
        @MustBeClosed
        fun listKnowledgeBases(
            missionId: String
        ): HttpResponseFor<KnowledgeBaseListKnowledgeBasesResponse> =
            listKnowledgeBases(missionId, KnowledgeBaseListKnowledgeBasesParams.none())

        /** @see listKnowledgeBases */
        @MustBeClosed
        fun listKnowledgeBases(
            missionId: String,
            params: KnowledgeBaseListKnowledgeBasesParams =
                KnowledgeBaseListKnowledgeBasesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KnowledgeBaseListKnowledgeBasesResponse> =
            listKnowledgeBases(params.toBuilder().missionId(missionId).build(), requestOptions)

        /** @see listKnowledgeBases */
        @MustBeClosed
        fun listKnowledgeBases(
            missionId: String,
            params: KnowledgeBaseListKnowledgeBasesParams =
                KnowledgeBaseListKnowledgeBasesParams.none(),
        ): HttpResponseFor<KnowledgeBaseListKnowledgeBasesResponse> =
            listKnowledgeBases(missionId, params, RequestOptions.none())

        /** @see listKnowledgeBases */
        @MustBeClosed
        fun listKnowledgeBases(
            params: KnowledgeBaseListKnowledgeBasesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KnowledgeBaseListKnowledgeBasesResponse>

        /** @see listKnowledgeBases */
        @MustBeClosed
        fun listKnowledgeBases(
            params: KnowledgeBaseListKnowledgeBasesParams
        ): HttpResponseFor<KnowledgeBaseListKnowledgeBasesResponse> =
            listKnowledgeBases(params, RequestOptions.none())

        /** @see listKnowledgeBases */
        @MustBeClosed
        fun listKnowledgeBases(
            missionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KnowledgeBaseListKnowledgeBasesResponse> =
            listKnowledgeBases(
                missionId,
                KnowledgeBaseListKnowledgeBasesParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `put
         * /ai/missions/{mission_id}/knowledge-bases/{knowledge_base_id}`, but is otherwise the same
         * as [KnowledgeBaseService.updateKnowledgeBase].
         */
        @MustBeClosed
        fun updateKnowledgeBase(
            knowledgeBaseId: String,
            params: KnowledgeBaseUpdateKnowledgeBaseParams,
        ): HttpResponseFor<KnowledgeBaseUpdateKnowledgeBaseResponse> =
            updateKnowledgeBase(knowledgeBaseId, params, RequestOptions.none())

        /** @see updateKnowledgeBase */
        @MustBeClosed
        fun updateKnowledgeBase(
            knowledgeBaseId: String,
            params: KnowledgeBaseUpdateKnowledgeBaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KnowledgeBaseUpdateKnowledgeBaseResponse> =
            updateKnowledgeBase(
                params.toBuilder().knowledgeBaseId(knowledgeBaseId).build(),
                requestOptions,
            )

        /** @see updateKnowledgeBase */
        @MustBeClosed
        fun updateKnowledgeBase(
            params: KnowledgeBaseUpdateKnowledgeBaseParams
        ): HttpResponseFor<KnowledgeBaseUpdateKnowledgeBaseResponse> =
            updateKnowledgeBase(params, RequestOptions.none())

        /** @see updateKnowledgeBase */
        @MustBeClosed
        fun updateKnowledgeBase(
            params: KnowledgeBaseUpdateKnowledgeBaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KnowledgeBaseUpdateKnowledgeBaseResponse>
    }
}
