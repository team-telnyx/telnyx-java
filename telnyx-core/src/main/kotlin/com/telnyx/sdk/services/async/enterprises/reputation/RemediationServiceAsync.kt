// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.enterprises.reputation

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.enterprises.reputation.remediation.RemediationCreateParams
import com.telnyx.sdk.models.enterprises.reputation.remediation.RemediationListPageAsync
import com.telnyx.sdk.models.enterprises.reputation.remediation.RemediationListParams
import com.telnyx.sdk.models.enterprises.reputation.remediation.RemediationRequestWrapped
import com.telnyx.sdk.models.enterprises.reputation.remediation.RemediationRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Phone-number reputation monitoring (spam-score lookup and tracking). */
interface RemediationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RemediationServiceAsync

    /**
     * Submit a batch of phone numbers belonging to this enterprise for reputation remediation. The
     * request is accepted asynchronously: this endpoint returns `202` with the persisted request
     * id, then the request transitions through processing states until completion. Use the GET
     * endpoints to poll status and per-number results.
     *
     * Each phone number must be in E.164 format and belong to this enterprise. A number that
     * already has an in-flight remediation request is rejected.
     */
    fun create(
        enterpriseId: String,
        params: RemediationCreateParams,
    ): CompletableFuture<RemediationRequestWrapped> =
        create(enterpriseId, params, RequestOptions.none())

    /** @see create */
    fun create(
        enterpriseId: String,
        params: RemediationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RemediationRequestWrapped> =
        create(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see create */
    fun create(params: RemediationCreateParams): CompletableFuture<RemediationRequestWrapped> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RemediationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RemediationRequestWrapped>

    /**
     * Retrieve the full detail of a remediation request, including current status, per-number
     * results (once available), and submission metadata.
     */
    fun retrieve(
        remediationId: String,
        params: RemediationRetrieveParams,
    ): CompletableFuture<RemediationRequestWrapped> =
        retrieve(remediationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        remediationId: String,
        params: RemediationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RemediationRequestWrapped> =
        retrieve(params.toBuilder().remediationId(remediationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: RemediationRetrieveParams): CompletableFuture<RemediationRequestWrapped> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RemediationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RemediationRequestWrapped>

    /**
     * Paginated list of remediation requests for this enterprise. List items omit per-number
     * results and webhook URLs to keep the response small; call GET by id for full detail. Supports
     * JSON:API pagination and optional filters on status and created-at range.
     */
    fun list(enterpriseId: String): CompletableFuture<RemediationListPageAsync> =
        list(enterpriseId, RemediationListParams.none())

    /** @see list */
    fun list(
        enterpriseId: String,
        params: RemediationListParams = RemediationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RemediationListPageAsync> =
        list(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see list */
    fun list(
        enterpriseId: String,
        params: RemediationListParams = RemediationListParams.none(),
    ): CompletableFuture<RemediationListPageAsync> =
        list(enterpriseId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RemediationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RemediationListPageAsync>

    /** @see list */
    fun list(params: RemediationListParams): CompletableFuture<RemediationListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        enterpriseId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RemediationListPageAsync> =
        list(enterpriseId, RemediationListParams.none(), requestOptions)

    /**
     * A view of [RemediationServiceAsync] that provides access to raw HTTP responses for each
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
        ): RemediationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /enterprises/{enterprise_id}/reputation/remediation`, but is otherwise the same as
         * [RemediationServiceAsync.create].
         */
        fun create(
            enterpriseId: String,
            params: RemediationCreateParams,
        ): CompletableFuture<HttpResponseFor<RemediationRequestWrapped>> =
            create(enterpriseId, params, RequestOptions.none())

        /** @see create */
        fun create(
            enterpriseId: String,
            params: RemediationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RemediationRequestWrapped>> =
            create(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see create */
        fun create(
            params: RemediationCreateParams
        ): CompletableFuture<HttpResponseFor<RemediationRequestWrapped>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RemediationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RemediationRequestWrapped>>

        /**
         * Returns a raw HTTP response for `get
         * /enterprises/{enterprise_id}/reputation/remediation/{remediation_id}`, but is otherwise
         * the same as [RemediationServiceAsync.retrieve].
         */
        fun retrieve(
            remediationId: String,
            params: RemediationRetrieveParams,
        ): CompletableFuture<HttpResponseFor<RemediationRequestWrapped>> =
            retrieve(remediationId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            remediationId: String,
            params: RemediationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RemediationRequestWrapped>> =
            retrieve(params.toBuilder().remediationId(remediationId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: RemediationRetrieveParams
        ): CompletableFuture<HttpResponseFor<RemediationRequestWrapped>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RemediationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RemediationRequestWrapped>>

        /**
         * Returns a raw HTTP response for `get
         * /enterprises/{enterprise_id}/reputation/remediation`, but is otherwise the same as
         * [RemediationServiceAsync.list].
         */
        fun list(
            enterpriseId: String
        ): CompletableFuture<HttpResponseFor<RemediationListPageAsync>> =
            list(enterpriseId, RemediationListParams.none())

        /** @see list */
        fun list(
            enterpriseId: String,
            params: RemediationListParams = RemediationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RemediationListPageAsync>> =
            list(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see list */
        fun list(
            enterpriseId: String,
            params: RemediationListParams = RemediationListParams.none(),
        ): CompletableFuture<HttpResponseFor<RemediationListPageAsync>> =
            list(enterpriseId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: RemediationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RemediationListPageAsync>>

        /** @see list */
        fun list(
            params: RemediationListParams
        ): CompletableFuture<HttpResponseFor<RemediationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            enterpriseId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RemediationListPageAsync>> =
            list(enterpriseId, RemediationListParams.none(), requestOptions)
    }
}
