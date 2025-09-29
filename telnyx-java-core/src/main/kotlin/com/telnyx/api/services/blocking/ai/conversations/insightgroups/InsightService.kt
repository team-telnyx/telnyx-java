// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.ai.conversations.insightgroups

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.ai.conversations.insightgroups.insights.InsightAssignParams
import com.telnyx.api.models.ai.conversations.insightgroups.insights.InsightAssignResponse
import com.telnyx.api.models.ai.conversations.insightgroups.insights.InsightDeleteUnassignParams
import com.telnyx.api.models.ai.conversations.insightgroups.insights.InsightDeleteUnassignResponse
import java.util.function.Consumer

interface InsightService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InsightService

    /** Assign an insight to a group */
    fun assign(insightId: String, params: InsightAssignParams): InsightAssignResponse =
        assign(insightId, params, RequestOptions.none())

    /** @see assign */
    fun assign(
        insightId: String,
        params: InsightAssignParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsightAssignResponse =
        assign(params.toBuilder().insightId(insightId).build(), requestOptions)

    /** @see assign */
    fun assign(params: InsightAssignParams): InsightAssignResponse =
        assign(params, RequestOptions.none())

    /** @see assign */
    fun assign(
        params: InsightAssignParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsightAssignResponse

    /** Remove an insight from a group */
    fun deleteUnassign(
        insightId: String,
        params: InsightDeleteUnassignParams,
    ): InsightDeleteUnassignResponse = deleteUnassign(insightId, params, RequestOptions.none())

    /** @see deleteUnassign */
    fun deleteUnassign(
        insightId: String,
        params: InsightDeleteUnassignParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsightDeleteUnassignResponse =
        deleteUnassign(params.toBuilder().insightId(insightId).build(), requestOptions)

    /** @see deleteUnassign */
    fun deleteUnassign(params: InsightDeleteUnassignParams): InsightDeleteUnassignResponse =
        deleteUnassign(params, RequestOptions.none())

    /** @see deleteUnassign */
    fun deleteUnassign(
        params: InsightDeleteUnassignParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsightDeleteUnassignResponse

    /** A view of [InsightService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): InsightService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /ai/conversations/insight-groups/{group_id}/insights/{insight_id}/assign`, but is
         * otherwise the same as [InsightService.assign].
         */
        @MustBeClosed
        fun assign(
            insightId: String,
            params: InsightAssignParams,
        ): HttpResponseFor<InsightAssignResponse> = assign(insightId, params, RequestOptions.none())

        /** @see assign */
        @MustBeClosed
        fun assign(
            insightId: String,
            params: InsightAssignParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsightAssignResponse> =
            assign(params.toBuilder().insightId(insightId).build(), requestOptions)

        /** @see assign */
        @MustBeClosed
        fun assign(params: InsightAssignParams): HttpResponseFor<InsightAssignResponse> =
            assign(params, RequestOptions.none())

        /** @see assign */
        @MustBeClosed
        fun assign(
            params: InsightAssignParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsightAssignResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /ai/conversations/insight-groups/{group_id}/insights/{insight_id}/unassign`, but is
         * otherwise the same as [InsightService.deleteUnassign].
         */
        @MustBeClosed
        fun deleteUnassign(
            insightId: String,
            params: InsightDeleteUnassignParams,
        ): HttpResponseFor<InsightDeleteUnassignResponse> =
            deleteUnassign(insightId, params, RequestOptions.none())

        /** @see deleteUnassign */
        @MustBeClosed
        fun deleteUnassign(
            insightId: String,
            params: InsightDeleteUnassignParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsightDeleteUnassignResponse> =
            deleteUnassign(params.toBuilder().insightId(insightId).build(), requestOptions)

        /** @see deleteUnassign */
        @MustBeClosed
        fun deleteUnassign(
            params: InsightDeleteUnassignParams
        ): HttpResponseFor<InsightDeleteUnassignResponse> =
            deleteUnassign(params, RequestOptions.none())

        /** @see deleteUnassign */
        @MustBeClosed
        fun deleteUnassign(
            params: InsightDeleteUnassignParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsightDeleteUnassignResponse>
    }
}
