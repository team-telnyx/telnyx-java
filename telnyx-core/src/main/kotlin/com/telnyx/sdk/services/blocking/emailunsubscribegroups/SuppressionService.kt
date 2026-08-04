// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.emailunsubscribegroups

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emailblocks.EmailBlockResponse
import com.telnyx.sdk.models.emailunsubscribegroups.suppressions.SuppressionCreateParams
import com.telnyx.sdk.models.emailunsubscribegroups.suppressions.SuppressionDeleteParams
import com.telnyx.sdk.models.emailunsubscribegroups.suppressions.SuppressionListPage
import com.telnyx.sdk.models.emailunsubscribegroups.suppressions.SuppressionListParams
import java.util.function.Consumer

/** Named groups and group-scoped suppressions. */
interface SuppressionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SuppressionService

    /**
     * Creates a suppression with `reason: unsubscribe`, `source: manual`, `group_id: <this group>`.
     * All other body fields are ignored; only `to` is read. Idempotent (same dedupe key → `200`, no
     * new event).
     */
    fun create(id: String, params: SuppressionCreateParams): EmailBlockResponse =
        create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: SuppressionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailBlockResponse = create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: SuppressionCreateParams): EmailBlockResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SuppressionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailBlockResponse

    /**
     * Account + group scoped. Offset pagination only (`page[number]` default 1, `page[size]`
     * default 25, max 100). No `sort`/`filter`/ cursor — ordering fixed `desc created_at, desc id`.
     * Uses the shared `QueryParser.parse_offset/1` — a malformed `page` returns `400` (code
     * `10015`), consistent with `GET /v2/email_blocks`. `meta` includes `total_pages`. Rows reuse
     * the standard suppression shape (`group_id` set to this group).
     */
    fun list(id: String): SuppressionListPage = list(id, SuppressionListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: SuppressionListParams = SuppressionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SuppressionListPage = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: SuppressionListParams = SuppressionListParams.none(),
    ): SuppressionListPage = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SuppressionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SuppressionListPage

    /** @see list */
    fun list(params: SuppressionListParams): SuppressionListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): SuppressionListPage =
        list(id, SuppressionListParams.none(), requestOptions)

    /**
     * Soft-deletes all active blocks for (account, group, normalized email) — one `removed` audit
     * event per block (`actor: manual`). The `email` path segment is normalized (trim + lower-case)
     * before matching. Idempotent on already-removed rows (returns `404` since they're no longer
     * `active`).
     *
     * Two distinct `404` cases: a missing/cross-account **group** returns `10001 "The requested
     * unsubscribe group was not found"`; a group that exists but has **no active suppression** for
     * that email returns `10001 "The requested group suppression was not found"`.
     */
    fun delete(email: String, params: SuppressionDeleteParams) =
        delete(email, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        email: String,
        params: SuppressionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().email(email).build(), requestOptions)

    /** @see delete */
    fun delete(params: SuppressionDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SuppressionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [SuppressionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SuppressionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /email_unsubscribe_groups/{id}/suppressions`, but
         * is otherwise the same as [SuppressionService.create].
         */
        @MustBeClosed
        fun create(
            id: String,
            params: SuppressionCreateParams,
        ): HttpResponseFor<EmailBlockResponse> = create(id, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            id: String,
            params: SuppressionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailBlockResponse> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: SuppressionCreateParams): HttpResponseFor<EmailBlockResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SuppressionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailBlockResponse>

        /**
         * Returns a raw HTTP response for `get /email_unsubscribe_groups/{id}/suppressions`, but is
         * otherwise the same as [SuppressionService.list].
         */
        @MustBeClosed
        fun list(id: String): HttpResponseFor<SuppressionListPage> =
            list(id, SuppressionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: SuppressionListParams = SuppressionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SuppressionListPage> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: SuppressionListParams = SuppressionListParams.none(),
        ): HttpResponseFor<SuppressionListPage> = list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SuppressionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SuppressionListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: SuppressionListParams): HttpResponseFor<SuppressionListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(id: String, requestOptions: RequestOptions): HttpResponseFor<SuppressionListPage> =
            list(id, SuppressionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /email_unsubscribe_groups/{id}/suppressions/{email}`, but is otherwise the same as
         * [SuppressionService.delete].
         */
        @MustBeClosed
        fun delete(email: String, params: SuppressionDeleteParams): HttpResponse =
            delete(email, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            email: String,
            params: SuppressionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().email(email).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: SuppressionDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SuppressionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
