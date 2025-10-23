// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.conversations

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.conversations.insights.InsightCreateParams
import com.telnyx.sdk.models.ai.conversations.insights.InsightDeleteParams
import com.telnyx.sdk.models.ai.conversations.insights.InsightDeleteResponse
import com.telnyx.sdk.models.ai.conversations.insights.InsightListParams
import com.telnyx.sdk.models.ai.conversations.insights.InsightListResponse
import com.telnyx.sdk.models.ai.conversations.insights.InsightRetrieveParams
import com.telnyx.sdk.models.ai.conversations.insights.InsightTemplateDetail
import com.telnyx.sdk.models.ai.conversations.insights.InsightUpdateParams
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

    /** Create a new insight */
    fun create(params: InsightCreateParams): CompletableFuture<InsightTemplateDetail> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: InsightCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsightTemplateDetail>

    /** Get insight by ID */
    fun retrieve(insightId: String): CompletableFuture<InsightTemplateDetail> =
        retrieve(insightId, InsightRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        insightId: String,
        params: InsightRetrieveParams = InsightRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsightTemplateDetail> =
        retrieve(params.toBuilder().insightId(insightId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        insightId: String,
        params: InsightRetrieveParams = InsightRetrieveParams.none(),
    ): CompletableFuture<InsightTemplateDetail> = retrieve(insightId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InsightRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsightTemplateDetail>

    /** @see retrieve */
    fun retrieve(params: InsightRetrieveParams): CompletableFuture<InsightTemplateDetail> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        insightId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InsightTemplateDetail> =
        retrieve(insightId, InsightRetrieveParams.none(), requestOptions)

    /** Update an insight template */
    fun update(insightId: String): CompletableFuture<InsightTemplateDetail> =
        update(insightId, InsightUpdateParams.none())

    /** @see update */
    fun update(
        insightId: String,
        params: InsightUpdateParams = InsightUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsightTemplateDetail> =
        update(params.toBuilder().insightId(insightId).build(), requestOptions)

    /** @see update */
    fun update(
        insightId: String,
        params: InsightUpdateParams = InsightUpdateParams.none(),
    ): CompletableFuture<InsightTemplateDetail> = update(insightId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: InsightUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsightTemplateDetail>

    /** @see update */
    fun update(params: InsightUpdateParams): CompletableFuture<InsightTemplateDetail> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        insightId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InsightTemplateDetail> =
        update(insightId, InsightUpdateParams.none(), requestOptions)

    /** Get all insights */
    fun list(): CompletableFuture<InsightListResponse> = list(InsightListParams.none())

    /** @see list */
    fun list(
        params: InsightListParams = InsightListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsightListResponse>

    /** @see list */
    fun list(
        params: InsightListParams = InsightListParams.none()
    ): CompletableFuture<InsightListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<InsightListResponse> =
        list(InsightListParams.none(), requestOptions)

    /** Delete insight by ID */
    fun delete(insightId: String): CompletableFuture<InsightDeleteResponse> =
        delete(insightId, InsightDeleteParams.none())

    /** @see delete */
    fun delete(
        insightId: String,
        params: InsightDeleteParams = InsightDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsightDeleteResponse> =
        delete(params.toBuilder().insightId(insightId).build(), requestOptions)

    /** @see delete */
    fun delete(
        insightId: String,
        params: InsightDeleteParams = InsightDeleteParams.none(),
    ): CompletableFuture<InsightDeleteResponse> = delete(insightId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: InsightDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsightDeleteResponse>

    /** @see delete */
    fun delete(params: InsightDeleteParams): CompletableFuture<InsightDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        insightId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InsightDeleteResponse> =
        delete(insightId, InsightDeleteParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /ai/conversations/insights`, but is otherwise the
         * same as [InsightServiceAsync.create].
         */
        fun create(
            params: InsightCreateParams
        ): CompletableFuture<HttpResponseFor<InsightTemplateDetail>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: InsightCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsightTemplateDetail>>

        /**
         * Returns a raw HTTP response for `get /ai/conversations/insights/{insight_id}`, but is
         * otherwise the same as [InsightServiceAsync.retrieve].
         */
        fun retrieve(insightId: String): CompletableFuture<HttpResponseFor<InsightTemplateDetail>> =
            retrieve(insightId, InsightRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            insightId: String,
            params: InsightRetrieveParams = InsightRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsightTemplateDetail>> =
            retrieve(params.toBuilder().insightId(insightId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            insightId: String,
            params: InsightRetrieveParams = InsightRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<InsightTemplateDetail>> =
            retrieve(insightId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: InsightRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsightTemplateDetail>>

        /** @see retrieve */
        fun retrieve(
            params: InsightRetrieveParams
        ): CompletableFuture<HttpResponseFor<InsightTemplateDetail>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            insightId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InsightTemplateDetail>> =
            retrieve(insightId, InsightRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /ai/conversations/insights/{insight_id}`, but is
         * otherwise the same as [InsightServiceAsync.update].
         */
        fun update(insightId: String): CompletableFuture<HttpResponseFor<InsightTemplateDetail>> =
            update(insightId, InsightUpdateParams.none())

        /** @see update */
        fun update(
            insightId: String,
            params: InsightUpdateParams = InsightUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsightTemplateDetail>> =
            update(params.toBuilder().insightId(insightId).build(), requestOptions)

        /** @see update */
        fun update(
            insightId: String,
            params: InsightUpdateParams = InsightUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<InsightTemplateDetail>> =
            update(insightId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: InsightUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsightTemplateDetail>>

        /** @see update */
        fun update(
            params: InsightUpdateParams
        ): CompletableFuture<HttpResponseFor<InsightTemplateDetail>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            insightId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InsightTemplateDetail>> =
            update(insightId, InsightUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/conversations/insights`, but is otherwise the
         * same as [InsightServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<InsightListResponse>> =
            list(InsightListParams.none())

        /** @see list */
        fun list(
            params: InsightListParams = InsightListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsightListResponse>>

        /** @see list */
        fun list(
            params: InsightListParams = InsightListParams.none()
        ): CompletableFuture<HttpResponseFor<InsightListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InsightListResponse>> =
            list(InsightListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/conversations/insights/{insight_id}`, but is
         * otherwise the same as [InsightServiceAsync.delete].
         */
        fun delete(insightId: String): CompletableFuture<HttpResponseFor<InsightDeleteResponse>> =
            delete(insightId, InsightDeleteParams.none())

        /** @see delete */
        fun delete(
            insightId: String,
            params: InsightDeleteParams = InsightDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsightDeleteResponse>> =
            delete(params.toBuilder().insightId(insightId).build(), requestOptions)

        /** @see delete */
        fun delete(
            insightId: String,
            params: InsightDeleteParams = InsightDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<InsightDeleteResponse>> =
            delete(insightId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: InsightDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsightDeleteResponse>>

        /** @see delete */
        fun delete(
            params: InsightDeleteParams
        ): CompletableFuture<HttpResponseFor<InsightDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            insightId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InsightDeleteResponse>> =
            delete(insightId, InsightDeleteParams.none(), requestOptions)
    }
}
