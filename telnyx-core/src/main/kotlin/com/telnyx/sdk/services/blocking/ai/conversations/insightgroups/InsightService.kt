// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.conversations.insightgroups

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.models.ai.conversations.insightgroups.insights.InsightAssignParams
import com.telnyx.sdk.models.ai.conversations.insightgroups.insights.InsightDeleteUnassignParams
import java.util.function.Consumer

/** Manage historical AI assistant conversations */
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
    fun assign(insightId: String, params: InsightAssignParams) =
        assign(insightId, params, RequestOptions.none())

    /** @see assign */
    fun assign(
        insightId: String,
        params: InsightAssignParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = assign(params.toBuilder().insightId(insightId).build(), requestOptions)

    /** @see assign */
    fun assign(params: InsightAssignParams) = assign(params, RequestOptions.none())

    /** @see assign */
    fun assign(params: InsightAssignParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Remove an insight from a group */
    fun deleteUnassign(insightId: String, params: InsightDeleteUnassignParams) =
        deleteUnassign(insightId, params, RequestOptions.none())

    /** @see deleteUnassign */
    fun deleteUnassign(
        insightId: String,
        params: InsightDeleteUnassignParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteUnassign(params.toBuilder().insightId(insightId).build(), requestOptions)

    /** @see deleteUnassign */
    fun deleteUnassign(params: InsightDeleteUnassignParams) =
        deleteUnassign(params, RequestOptions.none())

    /** @see deleteUnassign */
    fun deleteUnassign(
        params: InsightDeleteUnassignParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

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
        fun assign(insightId: String, params: InsightAssignParams): HttpResponse =
            assign(insightId, params, RequestOptions.none())

        /** @see assign */
        @MustBeClosed
        fun assign(
            insightId: String,
            params: InsightAssignParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = assign(params.toBuilder().insightId(insightId).build(), requestOptions)

        /** @see assign */
        @MustBeClosed
        fun assign(params: InsightAssignParams): HttpResponse =
            assign(params, RequestOptions.none())

        /** @see assign */
        @MustBeClosed
        fun assign(
            params: InsightAssignParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete
         * /ai/conversations/insight-groups/{group_id}/insights/{insight_id}/unassign`, but is
         * otherwise the same as [InsightService.deleteUnassign].
         */
        @MustBeClosed
        fun deleteUnassign(insightId: String, params: InsightDeleteUnassignParams): HttpResponse =
            deleteUnassign(insightId, params, RequestOptions.none())

        /** @see deleteUnassign */
        @MustBeClosed
        fun deleteUnassign(
            insightId: String,
            params: InsightDeleteUnassignParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteUnassign(params.toBuilder().insightId(insightId).build(), requestOptions)

        /** @see deleteUnassign */
        @MustBeClosed
        fun deleteUnassign(params: InsightDeleteUnassignParams): HttpResponse =
            deleteUnassign(params, RequestOptions.none())

        /** @see deleteUnassign */
        @MustBeClosed
        fun deleteUnassign(
            params: InsightDeleteUnassignParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
