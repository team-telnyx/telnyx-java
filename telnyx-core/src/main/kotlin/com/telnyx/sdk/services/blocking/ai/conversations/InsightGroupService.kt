// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.conversations

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.conversations.insightgroups.InsightGroupDeleteParams
import com.telnyx.sdk.models.ai.conversations.insightgroups.InsightGroupInsightGroupsParams
import com.telnyx.sdk.models.ai.conversations.insightgroups.InsightGroupRetrieveInsightGroupsPage
import com.telnyx.sdk.models.ai.conversations.insightgroups.InsightGroupRetrieveInsightGroupsParams
import com.telnyx.sdk.models.ai.conversations.insightgroups.InsightGroupRetrieveParams
import com.telnyx.sdk.models.ai.conversations.insightgroups.InsightGroupUpdateParams
import com.telnyx.sdk.models.ai.conversations.insightgroups.InsightTemplateGroupDetail
import com.telnyx.sdk.services.blocking.ai.conversations.insightgroups.InsightService
import java.util.function.Consumer

interface InsightGroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InsightGroupService

    fun insights(): InsightService

    /** Get insight group by ID */
    fun retrieve(groupId: String): InsightTemplateGroupDetail =
        retrieve(groupId, InsightGroupRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        groupId: String,
        params: InsightGroupRetrieveParams = InsightGroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsightTemplateGroupDetail =
        retrieve(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        groupId: String,
        params: InsightGroupRetrieveParams = InsightGroupRetrieveParams.none(),
    ): InsightTemplateGroupDetail = retrieve(groupId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InsightGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsightTemplateGroupDetail

    /** @see retrieve */
    fun retrieve(params: InsightGroupRetrieveParams): InsightTemplateGroupDetail =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(groupId: String, requestOptions: RequestOptions): InsightTemplateGroupDetail =
        retrieve(groupId, InsightGroupRetrieveParams.none(), requestOptions)

    /** Update an insight template group */
    fun update(groupId: String): InsightTemplateGroupDetail =
        update(groupId, InsightGroupUpdateParams.none())

    /** @see update */
    fun update(
        groupId: String,
        params: InsightGroupUpdateParams = InsightGroupUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsightTemplateGroupDetail =
        update(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see update */
    fun update(
        groupId: String,
        params: InsightGroupUpdateParams = InsightGroupUpdateParams.none(),
    ): InsightTemplateGroupDetail = update(groupId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: InsightGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsightTemplateGroupDetail

    /** @see update */
    fun update(params: InsightGroupUpdateParams): InsightTemplateGroupDetail =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(groupId: String, requestOptions: RequestOptions): InsightTemplateGroupDetail =
        update(groupId, InsightGroupUpdateParams.none(), requestOptions)

    /** Delete insight group by ID */
    fun delete(groupId: String) = delete(groupId, InsightGroupDeleteParams.none())

    /** @see delete */
    fun delete(
        groupId: String,
        params: InsightGroupDeleteParams = InsightGroupDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see delete */
    fun delete(
        groupId: String,
        params: InsightGroupDeleteParams = InsightGroupDeleteParams.none(),
    ) = delete(groupId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: InsightGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: InsightGroupDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(groupId: String, requestOptions: RequestOptions) =
        delete(groupId, InsightGroupDeleteParams.none(), requestOptions)

    /** Create a new insight group */
    fun insightGroups(params: InsightGroupInsightGroupsParams): InsightTemplateGroupDetail =
        insightGroups(params, RequestOptions.none())

    /** @see insightGroups */
    fun insightGroups(
        params: InsightGroupInsightGroupsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsightTemplateGroupDetail

    /** Get all insight groups */
    fun retrieveInsightGroups(): InsightGroupRetrieveInsightGroupsPage =
        retrieveInsightGroups(InsightGroupRetrieveInsightGroupsParams.none())

    /** @see retrieveInsightGroups */
    fun retrieveInsightGroups(
        params: InsightGroupRetrieveInsightGroupsParams =
            InsightGroupRetrieveInsightGroupsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsightGroupRetrieveInsightGroupsPage

    /** @see retrieveInsightGroups */
    fun retrieveInsightGroups(
        params: InsightGroupRetrieveInsightGroupsParams =
            InsightGroupRetrieveInsightGroupsParams.none()
    ): InsightGroupRetrieveInsightGroupsPage = retrieveInsightGroups(params, RequestOptions.none())

    /** @see retrieveInsightGroups */
    fun retrieveInsightGroups(
        requestOptions: RequestOptions
    ): InsightGroupRetrieveInsightGroupsPage =
        retrieveInsightGroups(InsightGroupRetrieveInsightGroupsParams.none(), requestOptions)

    /**
     * A view of [InsightGroupService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InsightGroupService.WithRawResponse

        fun insights(): InsightService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/conversations/insight-groups/{group_id}`, but is
         * otherwise the same as [InsightGroupService.retrieve].
         */
        @MustBeClosed
        fun retrieve(groupId: String): HttpResponseFor<InsightTemplateGroupDetail> =
            retrieve(groupId, InsightGroupRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            groupId: String,
            params: InsightGroupRetrieveParams = InsightGroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsightTemplateGroupDetail> =
            retrieve(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            groupId: String,
            params: InsightGroupRetrieveParams = InsightGroupRetrieveParams.none(),
        ): HttpResponseFor<InsightTemplateGroupDetail> =
            retrieve(groupId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: InsightGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsightTemplateGroupDetail>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: InsightGroupRetrieveParams
        ): HttpResponseFor<InsightTemplateGroupDetail> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            groupId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InsightTemplateGroupDetail> =
            retrieve(groupId, InsightGroupRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /ai/conversations/insight-groups/{group_id}`, but is
         * otherwise the same as [InsightGroupService.update].
         */
        @MustBeClosed
        fun update(groupId: String): HttpResponseFor<InsightTemplateGroupDetail> =
            update(groupId, InsightGroupUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            groupId: String,
            params: InsightGroupUpdateParams = InsightGroupUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsightTemplateGroupDetail> =
            update(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            groupId: String,
            params: InsightGroupUpdateParams = InsightGroupUpdateParams.none(),
        ): HttpResponseFor<InsightTemplateGroupDetail> =
            update(groupId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: InsightGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsightTemplateGroupDetail>

        /** @see update */
        @MustBeClosed
        fun update(params: InsightGroupUpdateParams): HttpResponseFor<InsightTemplateGroupDetail> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            groupId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InsightTemplateGroupDetail> =
            update(groupId, InsightGroupUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/conversations/insight-groups/{group_id}`, but
         * is otherwise the same as [InsightGroupService.delete].
         */
        @MustBeClosed
        fun delete(groupId: String): HttpResponse = delete(groupId, InsightGroupDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            groupId: String,
            params: InsightGroupDeleteParams = InsightGroupDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            groupId: String,
            params: InsightGroupDeleteParams = InsightGroupDeleteParams.none(),
        ): HttpResponse = delete(groupId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: InsightGroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: InsightGroupDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(groupId: String, requestOptions: RequestOptions): HttpResponse =
            delete(groupId, InsightGroupDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/conversations/insight-groups`, but is otherwise
         * the same as [InsightGroupService.insightGroups].
         */
        @MustBeClosed
        fun insightGroups(
            params: InsightGroupInsightGroupsParams
        ): HttpResponseFor<InsightTemplateGroupDetail> =
            insightGroups(params, RequestOptions.none())

        /** @see insightGroups */
        @MustBeClosed
        fun insightGroups(
            params: InsightGroupInsightGroupsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsightTemplateGroupDetail>

        /**
         * Returns a raw HTTP response for `get /ai/conversations/insight-groups`, but is otherwise
         * the same as [InsightGroupService.retrieveInsightGroups].
         */
        @MustBeClosed
        fun retrieveInsightGroups(): HttpResponseFor<InsightGroupRetrieveInsightGroupsPage> =
            retrieveInsightGroups(InsightGroupRetrieveInsightGroupsParams.none())

        /** @see retrieveInsightGroups */
        @MustBeClosed
        fun retrieveInsightGroups(
            params: InsightGroupRetrieveInsightGroupsParams =
                InsightGroupRetrieveInsightGroupsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsightGroupRetrieveInsightGroupsPage>

        /** @see retrieveInsightGroups */
        @MustBeClosed
        fun retrieveInsightGroups(
            params: InsightGroupRetrieveInsightGroupsParams =
                InsightGroupRetrieveInsightGroupsParams.none()
        ): HttpResponseFor<InsightGroupRetrieveInsightGroupsPage> =
            retrieveInsightGroups(params, RequestOptions.none())

        /** @see retrieveInsightGroups */
        @MustBeClosed
        fun retrieveInsightGroups(
            requestOptions: RequestOptions
        ): HttpResponseFor<InsightGroupRetrieveInsightGroupsPage> =
            retrieveInsightGroups(InsightGroupRetrieveInsightGroupsParams.none(), requestOptions)
    }
}
