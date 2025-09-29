// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.conversations.insightgroups

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.conversations.insightgroups.insights.InsightAssignParams
import com.telnyx.sdk.models.ai.conversations.insightgroups.insights.InsightAssignResponse
import com.telnyx.sdk.models.ai.conversations.insightgroups.insights.InsightDeleteUnassignParams
import com.telnyx.sdk.models.ai.conversations.insightgroups.insights.InsightDeleteUnassignResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InsightServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InsightServiceAsync

    /** Assign an insight to a group */
    fun assign(
        insightId: String,
        params: InsightAssignParams,
    ): CompletableFuture<InsightAssignResponse> = assign(insightId, params, RequestOptions.none())

    /** @see assign */
    fun assign(
        insightId: String,
        params: InsightAssignParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsightAssignResponse> =
        assign(params.toBuilder().insightId(insightId).build(), requestOptions)

    /** @see assign */
    fun assign(params: InsightAssignParams): CompletableFuture<InsightAssignResponse> =
        assign(params, RequestOptions.none())

    /** @see assign */
    fun assign(
        params: InsightAssignParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsightAssignResponse>

    /** Remove an insight from a group */
    fun deleteUnassign(
        insightId: String,
        params: InsightDeleteUnassignParams,
    ): CompletableFuture<InsightDeleteUnassignResponse> =
        deleteUnassign(insightId, params, RequestOptions.none())

    /** @see deleteUnassign */
    fun deleteUnassign(
        insightId: String,
        params: InsightDeleteUnassignParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsightDeleteUnassignResponse> =
        deleteUnassign(params.toBuilder().insightId(insightId).build(), requestOptions)

    /** @see deleteUnassign */
    fun deleteUnassign(
        params: InsightDeleteUnassignParams
    ): CompletableFuture<InsightDeleteUnassignResponse> =
        deleteUnassign(params, RequestOptions.none())

    /** @see deleteUnassign */
    fun deleteUnassign(
        params: InsightDeleteUnassignParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsightDeleteUnassignResponse>

    /**
     * A view of [InsightServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InsightServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /ai/conversations/insight-groups/{group_id}/insights/{insight_id}/assign`, but is
         * otherwise the same as [InsightServiceAsync.assign].
         */
        fun assign(
            insightId: String,
            params: InsightAssignParams,
        ): CompletableFuture<HttpResponseFor<InsightAssignResponse>> =
            assign(insightId, params, RequestOptions.none())

        /** @see assign */
        fun assign(
            insightId: String,
            params: InsightAssignParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsightAssignResponse>> =
            assign(params.toBuilder().insightId(insightId).build(), requestOptions)

        /** @see assign */
        fun assign(
            params: InsightAssignParams
        ): CompletableFuture<HttpResponseFor<InsightAssignResponse>> =
            assign(params, RequestOptions.none())

        /** @see assign */
        fun assign(
            params: InsightAssignParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsightAssignResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /ai/conversations/insight-groups/{group_id}/insights/{insight_id}/unassign`, but is
         * otherwise the same as [InsightServiceAsync.deleteUnassign].
         */
        fun deleteUnassign(
            insightId: String,
            params: InsightDeleteUnassignParams,
        ): CompletableFuture<HttpResponseFor<InsightDeleteUnassignResponse>> =
            deleteUnassign(insightId, params, RequestOptions.none())

        /** @see deleteUnassign */
        fun deleteUnassign(
            insightId: String,
            params: InsightDeleteUnassignParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsightDeleteUnassignResponse>> =
            deleteUnassign(params.toBuilder().insightId(insightId).build(), requestOptions)

        /** @see deleteUnassign */
        fun deleteUnassign(
            params: InsightDeleteUnassignParams
        ): CompletableFuture<HttpResponseFor<InsightDeleteUnassignResponse>> =
            deleteUnassign(params, RequestOptions.none())

        /** @see deleteUnassign */
        fun deleteUnassign(
            params: InsightDeleteUnassignParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsightDeleteUnassignResponse>>
    }
}
