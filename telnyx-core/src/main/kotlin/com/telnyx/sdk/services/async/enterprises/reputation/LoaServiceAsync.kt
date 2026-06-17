// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.enterprises.reputation

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.enterprises.reputation.EnterpriseReputationPublicWrapped
import com.telnyx.sdk.models.enterprises.reputation.loa.LoaRenderParams
import com.telnyx.sdk.models.enterprises.reputation.loa.LoaUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Phone-number reputation monitoring (spam-score lookup and tracking). */
interface LoaServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LoaServiceAsync

    /**
     * Point the enterprise's reputation settings at a new signed LOA document. This resets LOA
     * approval to `pending`; the new document must be approved before additional phone numbers can
     * be added.
     */
    fun update(
        enterpriseId: String,
        params: LoaUpdateParams,
    ): CompletableFuture<EnterpriseReputationPublicWrapped> =
        update(enterpriseId, params, RequestOptions.none())

    /** @see update */
    fun update(
        enterpriseId: String,
        params: LoaUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnterpriseReputationPublicWrapped> =
        update(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see update */
    fun update(params: LoaUpdateParams): CompletableFuture<EnterpriseReputationPublicWrapped> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LoaUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnterpriseReputationPublicWrapped>

    /**
     * Render the LOA for this enterprise as a PDF. The enterprise identity, address, and
     * authorized-representative contact are taken from the enterprise record; the optional `agent`
     * block is supplied only when a third-party partner manages the numbers. The response is the
     * PDF itself (unsigned unless a `signature` is provided). Sign it and upload it to the Telnyx
     * Documents API (`POST /v2/documents`, see https://developers.telnyx.com/api/documents) to
     * obtain the `loa_document_id` required by `POST .../reputation`.
     */
    fun render(enterpriseId: String): CompletableFuture<HttpResponse> =
        render(enterpriseId, LoaRenderParams.none())

    /** @see render */
    fun render(
        enterpriseId: String,
        params: LoaRenderParams = LoaRenderParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        render(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see render */
    fun render(
        enterpriseId: String,
        params: LoaRenderParams = LoaRenderParams.none(),
    ): CompletableFuture<HttpResponse> = render(enterpriseId, params, RequestOptions.none())

    /** @see render */
    fun render(
        params: LoaRenderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see render */
    fun render(params: LoaRenderParams): CompletableFuture<HttpResponse> =
        render(params, RequestOptions.none())

    /** @see render */
    fun render(
        enterpriseId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        render(enterpriseId, LoaRenderParams.none(), requestOptions)

    /** A view of [LoaServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LoaServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /enterprises/{enterprise_id}/reputation/loa`, but
         * is otherwise the same as [LoaServiceAsync.update].
         */
        fun update(
            enterpriseId: String,
            params: LoaUpdateParams,
        ): CompletableFuture<HttpResponseFor<EnterpriseReputationPublicWrapped>> =
            update(enterpriseId, params, RequestOptions.none())

        /** @see update */
        fun update(
            enterpriseId: String,
            params: LoaUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnterpriseReputationPublicWrapped>> =
            update(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see update */
        fun update(
            params: LoaUpdateParams
        ): CompletableFuture<HttpResponseFor<EnterpriseReputationPublicWrapped>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: LoaUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnterpriseReputationPublicWrapped>>

        /**
         * Returns a raw HTTP response for `post /enterprises/{enterprise_id}/reputation/loa`, but
         * is otherwise the same as [LoaServiceAsync.render].
         */
        fun render(enterpriseId: String): CompletableFuture<HttpResponse> =
            render(enterpriseId, LoaRenderParams.none())

        /** @see render */
        fun render(
            enterpriseId: String,
            params: LoaRenderParams = LoaRenderParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            render(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see render */
        fun render(
            enterpriseId: String,
            params: LoaRenderParams = LoaRenderParams.none(),
        ): CompletableFuture<HttpResponse> = render(enterpriseId, params, RequestOptions.none())

        /** @see render */
        fun render(
            params: LoaRenderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see render */
        fun render(params: LoaRenderParams): CompletableFuture<HttpResponse> =
            render(params, RequestOptions.none())

        /** @see render */
        fun render(
            enterpriseId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            render(enterpriseId, LoaRenderParams.none(), requestOptions)
    }
}
