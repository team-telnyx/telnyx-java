// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.ai.conversations

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.ai.conversations.insights.InsightCreateParams
import com.telnyx.api.models.ai.conversations.insights.InsightDeleteParams
import com.telnyx.api.models.ai.conversations.insights.InsightDeleteResponse
import com.telnyx.api.models.ai.conversations.insights.InsightListParams
import com.telnyx.api.models.ai.conversations.insights.InsightListResponse
import com.telnyx.api.models.ai.conversations.insights.InsightRetrieveParams
import com.telnyx.api.models.ai.conversations.insights.InsightTemplateDetail
import com.telnyx.api.models.ai.conversations.insights.InsightUpdateParams
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

    /** Create a new insight */
    fun create(params: InsightCreateParams): InsightTemplateDetail =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: InsightCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsightTemplateDetail

    /** Get insight by ID */
    fun retrieve(insightId: String): InsightTemplateDetail =
        retrieve(insightId, InsightRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        insightId: String,
        params: InsightRetrieveParams = InsightRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsightTemplateDetail =
        retrieve(params.toBuilder().insightId(insightId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        insightId: String,
        params: InsightRetrieveParams = InsightRetrieveParams.none(),
    ): InsightTemplateDetail = retrieve(insightId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InsightRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsightTemplateDetail

    /** @see retrieve */
    fun retrieve(params: InsightRetrieveParams): InsightTemplateDetail =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(insightId: String, requestOptions: RequestOptions): InsightTemplateDetail =
        retrieve(insightId, InsightRetrieveParams.none(), requestOptions)

    /** Update an insight template */
    fun update(insightId: String): InsightTemplateDetail =
        update(insightId, InsightUpdateParams.none())

    /** @see update */
    fun update(
        insightId: String,
        params: InsightUpdateParams = InsightUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsightTemplateDetail =
        update(params.toBuilder().insightId(insightId).build(), requestOptions)

    /** @see update */
    fun update(
        insightId: String,
        params: InsightUpdateParams = InsightUpdateParams.none(),
    ): InsightTemplateDetail = update(insightId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: InsightUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsightTemplateDetail

    /** @see update */
    fun update(params: InsightUpdateParams): InsightTemplateDetail =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(insightId: String, requestOptions: RequestOptions): InsightTemplateDetail =
        update(insightId, InsightUpdateParams.none(), requestOptions)

    /** Get all insights */
    fun list(): InsightListResponse = list(InsightListParams.none())

    /** @see list */
    fun list(
        params: InsightListParams = InsightListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsightListResponse

    /** @see list */
    fun list(params: InsightListParams = InsightListParams.none()): InsightListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): InsightListResponse =
        list(InsightListParams.none(), requestOptions)

    /** Delete insight by ID */
    fun delete(insightId: String): InsightDeleteResponse =
        delete(insightId, InsightDeleteParams.none())

    /** @see delete */
    fun delete(
        insightId: String,
        params: InsightDeleteParams = InsightDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsightDeleteResponse =
        delete(params.toBuilder().insightId(insightId).build(), requestOptions)

    /** @see delete */
    fun delete(
        insightId: String,
        params: InsightDeleteParams = InsightDeleteParams.none(),
    ): InsightDeleteResponse = delete(insightId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: InsightDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsightDeleteResponse

    /** @see delete */
    fun delete(params: InsightDeleteParams): InsightDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(insightId: String, requestOptions: RequestOptions): InsightDeleteResponse =
        delete(insightId, InsightDeleteParams.none(), requestOptions)

    /** A view of [InsightService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): InsightService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/conversations/insights`, but is otherwise the
         * same as [InsightService.create].
         */
        @MustBeClosed
        fun create(params: InsightCreateParams): HttpResponseFor<InsightTemplateDetail> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: InsightCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsightTemplateDetail>

        /**
         * Returns a raw HTTP response for `get /ai/conversations/insights/{insight_id}`, but is
         * otherwise the same as [InsightService.retrieve].
         */
        @MustBeClosed
        fun retrieve(insightId: String): HttpResponseFor<InsightTemplateDetail> =
            retrieve(insightId, InsightRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            insightId: String,
            params: InsightRetrieveParams = InsightRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsightTemplateDetail> =
            retrieve(params.toBuilder().insightId(insightId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            insightId: String,
            params: InsightRetrieveParams = InsightRetrieveParams.none(),
        ): HttpResponseFor<InsightTemplateDetail> =
            retrieve(insightId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: InsightRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsightTemplateDetail>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: InsightRetrieveParams): HttpResponseFor<InsightTemplateDetail> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            insightId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InsightTemplateDetail> =
            retrieve(insightId, InsightRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /ai/conversations/insights/{insight_id}`, but is
         * otherwise the same as [InsightService.update].
         */
        @MustBeClosed
        fun update(insightId: String): HttpResponseFor<InsightTemplateDetail> =
            update(insightId, InsightUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            insightId: String,
            params: InsightUpdateParams = InsightUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsightTemplateDetail> =
            update(params.toBuilder().insightId(insightId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            insightId: String,
            params: InsightUpdateParams = InsightUpdateParams.none(),
        ): HttpResponseFor<InsightTemplateDetail> = update(insightId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: InsightUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsightTemplateDetail>

        /** @see update */
        @MustBeClosed
        fun update(params: InsightUpdateParams): HttpResponseFor<InsightTemplateDetail> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            insightId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InsightTemplateDetail> =
            update(insightId, InsightUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/conversations/insights`, but is otherwise the
         * same as [InsightService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<InsightListResponse> = list(InsightListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: InsightListParams = InsightListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsightListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: InsightListParams = InsightListParams.none()
        ): HttpResponseFor<InsightListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InsightListResponse> =
            list(InsightListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/conversations/insights/{insight_id}`, but is
         * otherwise the same as [InsightService.delete].
         */
        @MustBeClosed
        fun delete(insightId: String): HttpResponseFor<InsightDeleteResponse> =
            delete(insightId, InsightDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            insightId: String,
            params: InsightDeleteParams = InsightDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsightDeleteResponse> =
            delete(params.toBuilder().insightId(insightId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            insightId: String,
            params: InsightDeleteParams = InsightDeleteParams.none(),
        ): HttpResponseFor<InsightDeleteResponse> = delete(insightId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: InsightDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsightDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: InsightDeleteParams): HttpResponseFor<InsightDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            insightId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InsightDeleteResponse> =
            delete(insightId, InsightDeleteParams.none(), requestOptions)
    }
}
