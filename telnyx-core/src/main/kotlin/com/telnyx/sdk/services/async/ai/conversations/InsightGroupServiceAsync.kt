// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.conversations

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.conversations.insightgroups.InsightGroupDeleteParams
import com.telnyx.sdk.models.ai.conversations.insightgroups.InsightGroupInsightGroupsParams
import com.telnyx.sdk.models.ai.conversations.insightgroups.InsightGroupRetrieveInsightGroupsPageAsync
import com.telnyx.sdk.models.ai.conversations.insightgroups.InsightGroupRetrieveInsightGroupsParams
import com.telnyx.sdk.models.ai.conversations.insightgroups.InsightGroupRetrieveParams
import com.telnyx.sdk.models.ai.conversations.insightgroups.InsightGroupUpdateParams
import com.telnyx.sdk.models.ai.conversations.insightgroups.InsightTemplateGroupDetail
import com.telnyx.sdk.services.async.ai.conversations.insightgroups.InsightServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage historical AI assistant conversations */
interface InsightGroupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InsightGroupServiceAsync

    /** Manage historical AI assistant conversations */
    fun insights(): InsightServiceAsync

    /** Get insight group by ID */
    fun retrieve(groupId: String): CompletableFuture<InsightTemplateGroupDetail> =
        retrieve(groupId, InsightGroupRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        groupId: String,
        params: InsightGroupRetrieveParams = InsightGroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsightTemplateGroupDetail> =
        retrieve(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        groupId: String,
        params: InsightGroupRetrieveParams = InsightGroupRetrieveParams.none(),
    ): CompletableFuture<InsightTemplateGroupDetail> =
        retrieve(groupId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InsightGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsightTemplateGroupDetail>

    /** @see retrieve */
    fun retrieve(
        params: InsightGroupRetrieveParams
    ): CompletableFuture<InsightTemplateGroupDetail> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        groupId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InsightTemplateGroupDetail> =
        retrieve(groupId, InsightGroupRetrieveParams.none(), requestOptions)

    /** Update an insight template group */
    fun update(groupId: String): CompletableFuture<InsightTemplateGroupDetail> =
        update(groupId, InsightGroupUpdateParams.none())

    /** @see update */
    fun update(
        groupId: String,
        params: InsightGroupUpdateParams = InsightGroupUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsightTemplateGroupDetail> =
        update(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see update */
    fun update(
        groupId: String,
        params: InsightGroupUpdateParams = InsightGroupUpdateParams.none(),
    ): CompletableFuture<InsightTemplateGroupDetail> =
        update(groupId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: InsightGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsightTemplateGroupDetail>

    /** @see update */
    fun update(params: InsightGroupUpdateParams): CompletableFuture<InsightTemplateGroupDetail> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        groupId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InsightTemplateGroupDetail> =
        update(groupId, InsightGroupUpdateParams.none(), requestOptions)

    /** Delete insight group by ID */
    fun delete(groupId: String): CompletableFuture<Void?> =
        delete(groupId, InsightGroupDeleteParams.none())

    /** @see delete */
    fun delete(
        groupId: String,
        params: InsightGroupDeleteParams = InsightGroupDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see delete */
    fun delete(
        groupId: String,
        params: InsightGroupDeleteParams = InsightGroupDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(groupId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: InsightGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: InsightGroupDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(groupId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(groupId, InsightGroupDeleteParams.none(), requestOptions)

    /** Create a new insight group */
    fun insightGroups(
        params: InsightGroupInsightGroupsParams
    ): CompletableFuture<InsightTemplateGroupDetail> = insightGroups(params, RequestOptions.none())

    /** @see insightGroups */
    fun insightGroups(
        params: InsightGroupInsightGroupsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsightTemplateGroupDetail>

    /** Get all insight groups */
    fun retrieveInsightGroups(): CompletableFuture<InsightGroupRetrieveInsightGroupsPageAsync> =
        retrieveInsightGroups(InsightGroupRetrieveInsightGroupsParams.none())

    /** @see retrieveInsightGroups */
    fun retrieveInsightGroups(
        params: InsightGroupRetrieveInsightGroupsParams =
            InsightGroupRetrieveInsightGroupsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsightGroupRetrieveInsightGroupsPageAsync>

    /** @see retrieveInsightGroups */
    fun retrieveInsightGroups(
        params: InsightGroupRetrieveInsightGroupsParams =
            InsightGroupRetrieveInsightGroupsParams.none()
    ): CompletableFuture<InsightGroupRetrieveInsightGroupsPageAsync> =
        retrieveInsightGroups(params, RequestOptions.none())

    /** @see retrieveInsightGroups */
    fun retrieveInsightGroups(
        requestOptions: RequestOptions
    ): CompletableFuture<InsightGroupRetrieveInsightGroupsPageAsync> =
        retrieveInsightGroups(InsightGroupRetrieveInsightGroupsParams.none(), requestOptions)

    /**
     * A view of [InsightGroupServiceAsync] that provides access to raw HTTP responses for each
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
        ): InsightGroupServiceAsync.WithRawResponse

        /** Manage historical AI assistant conversations */
        fun insights(): InsightServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/conversations/insight-groups/{group_id}`, but is
         * otherwise the same as [InsightGroupServiceAsync.retrieve].
         */
        fun retrieve(
            groupId: String
        ): CompletableFuture<HttpResponseFor<InsightTemplateGroupDetail>> =
            retrieve(groupId, InsightGroupRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            groupId: String,
            params: InsightGroupRetrieveParams = InsightGroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsightTemplateGroupDetail>> =
            retrieve(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            groupId: String,
            params: InsightGroupRetrieveParams = InsightGroupRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<InsightTemplateGroupDetail>> =
            retrieve(groupId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: InsightGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsightTemplateGroupDetail>>

        /** @see retrieve */
        fun retrieve(
            params: InsightGroupRetrieveParams
        ): CompletableFuture<HttpResponseFor<InsightTemplateGroupDetail>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            groupId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InsightTemplateGroupDetail>> =
            retrieve(groupId, InsightGroupRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /ai/conversations/insight-groups/{group_id}`, but is
         * otherwise the same as [InsightGroupServiceAsync.update].
         */
        fun update(
            groupId: String
        ): CompletableFuture<HttpResponseFor<InsightTemplateGroupDetail>> =
            update(groupId, InsightGroupUpdateParams.none())

        /** @see update */
        fun update(
            groupId: String,
            params: InsightGroupUpdateParams = InsightGroupUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsightTemplateGroupDetail>> =
            update(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see update */
        fun update(
            groupId: String,
            params: InsightGroupUpdateParams = InsightGroupUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<InsightTemplateGroupDetail>> =
            update(groupId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: InsightGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsightTemplateGroupDetail>>

        /** @see update */
        fun update(
            params: InsightGroupUpdateParams
        ): CompletableFuture<HttpResponseFor<InsightTemplateGroupDetail>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            groupId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InsightTemplateGroupDetail>> =
            update(groupId, InsightGroupUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/conversations/insight-groups/{group_id}`, but
         * is otherwise the same as [InsightGroupServiceAsync.delete].
         */
        fun delete(groupId: String): CompletableFuture<HttpResponse> =
            delete(groupId, InsightGroupDeleteParams.none())

        /** @see delete */
        fun delete(
            groupId: String,
            params: InsightGroupDeleteParams = InsightGroupDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see delete */
        fun delete(
            groupId: String,
            params: InsightGroupDeleteParams = InsightGroupDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(groupId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: InsightGroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: InsightGroupDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            groupId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(groupId, InsightGroupDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/conversations/insight-groups`, but is otherwise
         * the same as [InsightGroupServiceAsync.insightGroups].
         */
        fun insightGroups(
            params: InsightGroupInsightGroupsParams
        ): CompletableFuture<HttpResponseFor<InsightTemplateGroupDetail>> =
            insightGroups(params, RequestOptions.none())

        /** @see insightGroups */
        fun insightGroups(
            params: InsightGroupInsightGroupsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsightTemplateGroupDetail>>

        /**
         * Returns a raw HTTP response for `get /ai/conversations/insight-groups`, but is otherwise
         * the same as [InsightGroupServiceAsync.retrieveInsightGroups].
         */
        fun retrieveInsightGroups():
            CompletableFuture<HttpResponseFor<InsightGroupRetrieveInsightGroupsPageAsync>> =
            retrieveInsightGroups(InsightGroupRetrieveInsightGroupsParams.none())

        /** @see retrieveInsightGroups */
        fun retrieveInsightGroups(
            params: InsightGroupRetrieveInsightGroupsParams =
                InsightGroupRetrieveInsightGroupsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsightGroupRetrieveInsightGroupsPageAsync>>

        /** @see retrieveInsightGroups */
        fun retrieveInsightGroups(
            params: InsightGroupRetrieveInsightGroupsParams =
                InsightGroupRetrieveInsightGroupsParams.none()
        ): CompletableFuture<HttpResponseFor<InsightGroupRetrieveInsightGroupsPageAsync>> =
            retrieveInsightGroups(params, RequestOptions.none())

        /** @see retrieveInsightGroups */
        fun retrieveInsightGroups(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InsightGroupRetrieveInsightGroupsPageAsync>> =
            retrieveInsightGroups(InsightGroupRetrieveInsightGroupsParams.none(), requestOptions)
    }
}
