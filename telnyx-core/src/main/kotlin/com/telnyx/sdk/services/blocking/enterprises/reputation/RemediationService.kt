// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.enterprises.reputation

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.enterprises.reputation.remediation.RemediationCreateParams
import com.telnyx.sdk.models.enterprises.reputation.remediation.RemediationListPage
import com.telnyx.sdk.models.enterprises.reputation.remediation.RemediationListParams
import com.telnyx.sdk.models.enterprises.reputation.remediation.RemediationRequestWrapped
import com.telnyx.sdk.models.enterprises.reputation.remediation.RemediationRetrieveParams
import java.util.function.Consumer

/** Phone-number reputation monitoring (spam-score lookup and tracking). */
interface RemediationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RemediationService

    /**
     * Submit a batch of phone numbers belonging to this enterprise for reputation remediation. The
     * request is accepted asynchronously: this endpoint returns `202` with the persisted request
     * id, then the request transitions through processing states until completion. Use the GET
     * endpoints to poll status and per-number results.
     *
     * Each phone number must be in E.164 format and belong to this enterprise. A number that
     * already has an in-flight remediation request is rejected.
     */
    fun create(enterpriseId: String, params: RemediationCreateParams): RemediationRequestWrapped =
        create(enterpriseId, params, RequestOptions.none())

    /** @see create */
    fun create(
        enterpriseId: String,
        params: RemediationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RemediationRequestWrapped =
        create(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see create */
    fun create(params: RemediationCreateParams): RemediationRequestWrapped =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RemediationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RemediationRequestWrapped

    /**
     * Retrieve the full detail of a remediation request, including current status, per-number
     * results (once available), and submission metadata.
     */
    fun retrieve(
        remediationId: String,
        params: RemediationRetrieveParams,
    ): RemediationRequestWrapped = retrieve(remediationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        remediationId: String,
        params: RemediationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RemediationRequestWrapped =
        retrieve(params.toBuilder().remediationId(remediationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: RemediationRetrieveParams): RemediationRequestWrapped =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RemediationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RemediationRequestWrapped

    /**
     * Paginated list of remediation requests for this enterprise. List items omit per-number
     * results and webhook URLs to keep the response small; call GET by id for full detail. Supports
     * JSON:API pagination and optional filters on status and created-at range.
     */
    fun list(enterpriseId: String): RemediationListPage =
        list(enterpriseId, RemediationListParams.none())

    /** @see list */
    fun list(
        enterpriseId: String,
        params: RemediationListParams = RemediationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RemediationListPage =
        list(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see list */
    fun list(
        enterpriseId: String,
        params: RemediationListParams = RemediationListParams.none(),
    ): RemediationListPage = list(enterpriseId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RemediationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RemediationListPage

    /** @see list */
    fun list(params: RemediationListParams): RemediationListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(enterpriseId: String, requestOptions: RequestOptions): RemediationListPage =
        list(enterpriseId, RemediationListParams.none(), requestOptions)

    /**
     * A view of [RemediationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RemediationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /enterprises/{enterprise_id}/reputation/remediation`, but is otherwise the same as
         * [RemediationService.create].
         */
        @MustBeClosed
        fun create(
            enterpriseId: String,
            params: RemediationCreateParams,
        ): HttpResponseFor<RemediationRequestWrapped> =
            create(enterpriseId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            enterpriseId: String,
            params: RemediationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RemediationRequestWrapped> =
            create(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: RemediationCreateParams): HttpResponseFor<RemediationRequestWrapped> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RemediationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RemediationRequestWrapped>

        /**
         * Returns a raw HTTP response for `get
         * /enterprises/{enterprise_id}/reputation/remediation/{remediation_id}`, but is otherwise
         * the same as [RemediationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            remediationId: String,
            params: RemediationRetrieveParams,
        ): HttpResponseFor<RemediationRequestWrapped> =
            retrieve(remediationId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            remediationId: String,
            params: RemediationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RemediationRequestWrapped> =
            retrieve(params.toBuilder().remediationId(remediationId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RemediationRetrieveParams
        ): HttpResponseFor<RemediationRequestWrapped> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RemediationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RemediationRequestWrapped>

        /**
         * Returns a raw HTTP response for `get
         * /enterprises/{enterprise_id}/reputation/remediation`, but is otherwise the same as
         * [RemediationService.list].
         */
        @MustBeClosed
        fun list(enterpriseId: String): HttpResponseFor<RemediationListPage> =
            list(enterpriseId, RemediationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            enterpriseId: String,
            params: RemediationListParams = RemediationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RemediationListPage> =
            list(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            enterpriseId: String,
            params: RemediationListParams = RemediationListParams.none(),
        ): HttpResponseFor<RemediationListPage> = list(enterpriseId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RemediationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RemediationListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: RemediationListParams): HttpResponseFor<RemediationListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            enterpriseId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RemediationListPage> =
            list(enterpriseId, RemediationListParams.none(), requestOptions)
    }
}
