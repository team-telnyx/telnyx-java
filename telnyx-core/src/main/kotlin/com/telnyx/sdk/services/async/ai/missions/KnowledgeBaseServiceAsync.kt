// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.missions

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface KnowledgeBaseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): KnowledgeBaseServiceAsync

    /** Create a new knowledge base for a mission */
    fun createKnowledgeBase(
        missionId: String
    ): CompletableFuture<KnowledgeBaseCreateKnowledgeBaseResponse> =
        createKnowledgeBase(missionId, KnowledgeBaseCreateKnowledgeBaseParams.none())

    /** @see createKnowledgeBase */
    fun createKnowledgeBase(
        missionId: String,
        params: KnowledgeBaseCreateKnowledgeBaseParams =
            KnowledgeBaseCreateKnowledgeBaseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<KnowledgeBaseCreateKnowledgeBaseResponse> =
        createKnowledgeBase(params.toBuilder().missionId(missionId).build(), requestOptions)

    /** @see createKnowledgeBase */
    fun createKnowledgeBase(
        missionId: String,
        params: KnowledgeBaseCreateKnowledgeBaseParams =
            KnowledgeBaseCreateKnowledgeBaseParams.none(),
    ): CompletableFuture<KnowledgeBaseCreateKnowledgeBaseResponse> =
        createKnowledgeBase(missionId, params, RequestOptions.none())

    /** @see createKnowledgeBase */
    fun createKnowledgeBase(
        params: KnowledgeBaseCreateKnowledgeBaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<KnowledgeBaseCreateKnowledgeBaseResponse>

    /** @see createKnowledgeBase */
    fun createKnowledgeBase(
        params: KnowledgeBaseCreateKnowledgeBaseParams
    ): CompletableFuture<KnowledgeBaseCreateKnowledgeBaseResponse> =
        createKnowledgeBase(params, RequestOptions.none())

    /** @see createKnowledgeBase */
    fun createKnowledgeBase(
        missionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<KnowledgeBaseCreateKnowledgeBaseResponse> =
        createKnowledgeBase(
            missionId,
            KnowledgeBaseCreateKnowledgeBaseParams.none(),
            requestOptions,
        )

    /** Delete a knowledge base from a mission */
    fun deleteKnowledgeBase(
        knowledgeBaseId: String,
        params: KnowledgeBaseDeleteKnowledgeBaseParams,
    ): CompletableFuture<Void?> =
        deleteKnowledgeBase(knowledgeBaseId, params, RequestOptions.none())

    /** @see deleteKnowledgeBase */
    fun deleteKnowledgeBase(
        knowledgeBaseId: String,
        params: KnowledgeBaseDeleteKnowledgeBaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteKnowledgeBase(
            params.toBuilder().knowledgeBaseId(knowledgeBaseId).build(),
            requestOptions,
        )

    /** @see deleteKnowledgeBase */
    fun deleteKnowledgeBase(
        params: KnowledgeBaseDeleteKnowledgeBaseParams
    ): CompletableFuture<Void?> = deleteKnowledgeBase(params, RequestOptions.none())

    /** @see deleteKnowledgeBase */
    fun deleteKnowledgeBase(
        params: KnowledgeBaseDeleteKnowledgeBaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get a specific knowledge base by ID */
    fun getKnowledgeBase(
        knowledgeBaseId: String,
        params: KnowledgeBaseGetKnowledgeBaseParams,
    ): CompletableFuture<KnowledgeBaseGetKnowledgeBaseResponse> =
        getKnowledgeBase(knowledgeBaseId, params, RequestOptions.none())

    /** @see getKnowledgeBase */
    fun getKnowledgeBase(
        knowledgeBaseId: String,
        params: KnowledgeBaseGetKnowledgeBaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<KnowledgeBaseGetKnowledgeBaseResponse> =
        getKnowledgeBase(
            params.toBuilder().knowledgeBaseId(knowledgeBaseId).build(),
            requestOptions,
        )

    /** @see getKnowledgeBase */
    fun getKnowledgeBase(
        params: KnowledgeBaseGetKnowledgeBaseParams
    ): CompletableFuture<KnowledgeBaseGetKnowledgeBaseResponse> =
        getKnowledgeBase(params, RequestOptions.none())

    /** @see getKnowledgeBase */
    fun getKnowledgeBase(
        params: KnowledgeBaseGetKnowledgeBaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<KnowledgeBaseGetKnowledgeBaseResponse>

    /** List all knowledge bases for a mission */
    fun listKnowledgeBases(
        missionId: String
    ): CompletableFuture<KnowledgeBaseListKnowledgeBasesResponse> =
        listKnowledgeBases(missionId, KnowledgeBaseListKnowledgeBasesParams.none())

    /** @see listKnowledgeBases */
    fun listKnowledgeBases(
        missionId: String,
        params: KnowledgeBaseListKnowledgeBasesParams =
            KnowledgeBaseListKnowledgeBasesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<KnowledgeBaseListKnowledgeBasesResponse> =
        listKnowledgeBases(params.toBuilder().missionId(missionId).build(), requestOptions)

    /** @see listKnowledgeBases */
    fun listKnowledgeBases(
        missionId: String,
        params: KnowledgeBaseListKnowledgeBasesParams = KnowledgeBaseListKnowledgeBasesParams.none(),
    ): CompletableFuture<KnowledgeBaseListKnowledgeBasesResponse> =
        listKnowledgeBases(missionId, params, RequestOptions.none())

    /** @see listKnowledgeBases */
    fun listKnowledgeBases(
        params: KnowledgeBaseListKnowledgeBasesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<KnowledgeBaseListKnowledgeBasesResponse>

    /** @see listKnowledgeBases */
    fun listKnowledgeBases(
        params: KnowledgeBaseListKnowledgeBasesParams
    ): CompletableFuture<KnowledgeBaseListKnowledgeBasesResponse> =
        listKnowledgeBases(params, RequestOptions.none())

    /** @see listKnowledgeBases */
    fun listKnowledgeBases(
        missionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<KnowledgeBaseListKnowledgeBasesResponse> =
        listKnowledgeBases(missionId, KnowledgeBaseListKnowledgeBasesParams.none(), requestOptions)

    /** Update a knowledge base definition */
    fun updateKnowledgeBase(
        knowledgeBaseId: String,
        params: KnowledgeBaseUpdateKnowledgeBaseParams,
    ): CompletableFuture<KnowledgeBaseUpdateKnowledgeBaseResponse> =
        updateKnowledgeBase(knowledgeBaseId, params, RequestOptions.none())

    /** @see updateKnowledgeBase */
    fun updateKnowledgeBase(
        knowledgeBaseId: String,
        params: KnowledgeBaseUpdateKnowledgeBaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<KnowledgeBaseUpdateKnowledgeBaseResponse> =
        updateKnowledgeBase(
            params.toBuilder().knowledgeBaseId(knowledgeBaseId).build(),
            requestOptions,
        )

    /** @see updateKnowledgeBase */
    fun updateKnowledgeBase(
        params: KnowledgeBaseUpdateKnowledgeBaseParams
    ): CompletableFuture<KnowledgeBaseUpdateKnowledgeBaseResponse> =
        updateKnowledgeBase(params, RequestOptions.none())

    /** @see updateKnowledgeBase */
    fun updateKnowledgeBase(
        params: KnowledgeBaseUpdateKnowledgeBaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<KnowledgeBaseUpdateKnowledgeBaseResponse>

    /**
     * A view of [KnowledgeBaseServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): KnowledgeBaseServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/missions/{mission_id}/knowledge-bases`, but is
         * otherwise the same as [KnowledgeBaseServiceAsync.createKnowledgeBase].
         */
        fun createKnowledgeBase(
            missionId: String
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseCreateKnowledgeBaseResponse>> =
            createKnowledgeBase(missionId, KnowledgeBaseCreateKnowledgeBaseParams.none())

        /** @see createKnowledgeBase */
        fun createKnowledgeBase(
            missionId: String,
            params: KnowledgeBaseCreateKnowledgeBaseParams =
                KnowledgeBaseCreateKnowledgeBaseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseCreateKnowledgeBaseResponse>> =
            createKnowledgeBase(params.toBuilder().missionId(missionId).build(), requestOptions)

        /** @see createKnowledgeBase */
        fun createKnowledgeBase(
            missionId: String,
            params: KnowledgeBaseCreateKnowledgeBaseParams =
                KnowledgeBaseCreateKnowledgeBaseParams.none(),
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseCreateKnowledgeBaseResponse>> =
            createKnowledgeBase(missionId, params, RequestOptions.none())

        /** @see createKnowledgeBase */
        fun createKnowledgeBase(
            params: KnowledgeBaseCreateKnowledgeBaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseCreateKnowledgeBaseResponse>>

        /** @see createKnowledgeBase */
        fun createKnowledgeBase(
            params: KnowledgeBaseCreateKnowledgeBaseParams
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseCreateKnowledgeBaseResponse>> =
            createKnowledgeBase(params, RequestOptions.none())

        /** @see createKnowledgeBase */
        fun createKnowledgeBase(
            missionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseCreateKnowledgeBaseResponse>> =
            createKnowledgeBase(
                missionId,
                KnowledgeBaseCreateKnowledgeBaseParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `delete
         * /ai/missions/{mission_id}/knowledge-bases/{knowledge_base_id}`, but is otherwise the same
         * as [KnowledgeBaseServiceAsync.deleteKnowledgeBase].
         */
        fun deleteKnowledgeBase(
            knowledgeBaseId: String,
            params: KnowledgeBaseDeleteKnowledgeBaseParams,
        ): CompletableFuture<HttpResponse> =
            deleteKnowledgeBase(knowledgeBaseId, params, RequestOptions.none())

        /** @see deleteKnowledgeBase */
        fun deleteKnowledgeBase(
            knowledgeBaseId: String,
            params: KnowledgeBaseDeleteKnowledgeBaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteKnowledgeBase(
                params.toBuilder().knowledgeBaseId(knowledgeBaseId).build(),
                requestOptions,
            )

        /** @see deleteKnowledgeBase */
        fun deleteKnowledgeBase(
            params: KnowledgeBaseDeleteKnowledgeBaseParams
        ): CompletableFuture<HttpResponse> = deleteKnowledgeBase(params, RequestOptions.none())

        /** @see deleteKnowledgeBase */
        fun deleteKnowledgeBase(
            params: KnowledgeBaseDeleteKnowledgeBaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /ai/missions/{mission_id}/knowledge-bases/{knowledge_base_id}`, but is otherwise the same
         * as [KnowledgeBaseServiceAsync.getKnowledgeBase].
         */
        fun getKnowledgeBase(
            knowledgeBaseId: String,
            params: KnowledgeBaseGetKnowledgeBaseParams,
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseGetKnowledgeBaseResponse>> =
            getKnowledgeBase(knowledgeBaseId, params, RequestOptions.none())

        /** @see getKnowledgeBase */
        fun getKnowledgeBase(
            knowledgeBaseId: String,
            params: KnowledgeBaseGetKnowledgeBaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseGetKnowledgeBaseResponse>> =
            getKnowledgeBase(
                params.toBuilder().knowledgeBaseId(knowledgeBaseId).build(),
                requestOptions,
            )

        /** @see getKnowledgeBase */
        fun getKnowledgeBase(
            params: KnowledgeBaseGetKnowledgeBaseParams
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseGetKnowledgeBaseResponse>> =
            getKnowledgeBase(params, RequestOptions.none())

        /** @see getKnowledgeBase */
        fun getKnowledgeBase(
            params: KnowledgeBaseGetKnowledgeBaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseGetKnowledgeBaseResponse>>

        /**
         * Returns a raw HTTP response for `get /ai/missions/{mission_id}/knowledge-bases`, but is
         * otherwise the same as [KnowledgeBaseServiceAsync.listKnowledgeBases].
         */
        fun listKnowledgeBases(
            missionId: String
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseListKnowledgeBasesResponse>> =
            listKnowledgeBases(missionId, KnowledgeBaseListKnowledgeBasesParams.none())

        /** @see listKnowledgeBases */
        fun listKnowledgeBases(
            missionId: String,
            params: KnowledgeBaseListKnowledgeBasesParams =
                KnowledgeBaseListKnowledgeBasesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseListKnowledgeBasesResponse>> =
            listKnowledgeBases(params.toBuilder().missionId(missionId).build(), requestOptions)

        /** @see listKnowledgeBases */
        fun listKnowledgeBases(
            missionId: String,
            params: KnowledgeBaseListKnowledgeBasesParams =
                KnowledgeBaseListKnowledgeBasesParams.none(),
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseListKnowledgeBasesResponse>> =
            listKnowledgeBases(missionId, params, RequestOptions.none())

        /** @see listKnowledgeBases */
        fun listKnowledgeBases(
            params: KnowledgeBaseListKnowledgeBasesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseListKnowledgeBasesResponse>>

        /** @see listKnowledgeBases */
        fun listKnowledgeBases(
            params: KnowledgeBaseListKnowledgeBasesParams
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseListKnowledgeBasesResponse>> =
            listKnowledgeBases(params, RequestOptions.none())

        /** @see listKnowledgeBases */
        fun listKnowledgeBases(
            missionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseListKnowledgeBasesResponse>> =
            listKnowledgeBases(
                missionId,
                KnowledgeBaseListKnowledgeBasesParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `put
         * /ai/missions/{mission_id}/knowledge-bases/{knowledge_base_id}`, but is otherwise the same
         * as [KnowledgeBaseServiceAsync.updateKnowledgeBase].
         */
        fun updateKnowledgeBase(
            knowledgeBaseId: String,
            params: KnowledgeBaseUpdateKnowledgeBaseParams,
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseUpdateKnowledgeBaseResponse>> =
            updateKnowledgeBase(knowledgeBaseId, params, RequestOptions.none())

        /** @see updateKnowledgeBase */
        fun updateKnowledgeBase(
            knowledgeBaseId: String,
            params: KnowledgeBaseUpdateKnowledgeBaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseUpdateKnowledgeBaseResponse>> =
            updateKnowledgeBase(
                params.toBuilder().knowledgeBaseId(knowledgeBaseId).build(),
                requestOptions,
            )

        /** @see updateKnowledgeBase */
        fun updateKnowledgeBase(
            params: KnowledgeBaseUpdateKnowledgeBaseParams
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseUpdateKnowledgeBaseResponse>> =
            updateKnowledgeBase(params, RequestOptions.none())

        /** @see updateKnowledgeBase */
        fun updateKnowledgeBase(
            params: KnowledgeBaseUpdateKnowledgeBaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseUpdateKnowledgeBaseResponse>>
    }
}
