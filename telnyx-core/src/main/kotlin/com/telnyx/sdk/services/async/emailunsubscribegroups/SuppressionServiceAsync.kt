// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.emailunsubscribegroups

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emailblocks.EmailBlockResponse
import com.telnyx.sdk.models.emailunsubscribegroups.suppressions.SuppressionCreateParams
import com.telnyx.sdk.models.emailunsubscribegroups.suppressions.SuppressionDeleteParams
import com.telnyx.sdk.models.emailunsubscribegroups.suppressions.SuppressionListPageAsync
import com.telnyx.sdk.models.emailunsubscribegroups.suppressions.SuppressionListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Named groups and group-scoped suppressions. */
interface SuppressionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SuppressionServiceAsync

    /**
     * Creates a suppression with `reason: unsubscribe`, `source: manual`, `group_id: <this group>`.
     * All other body fields are ignored; only `to` is read. Idempotent (same dedupe key → `200`, no
     * new event).
     */
    fun create(id: String, params: SuppressionCreateParams): CompletableFuture<EmailBlockResponse> =
        create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: SuppressionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailBlockResponse> =
        create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: SuppressionCreateParams): CompletableFuture<EmailBlockResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SuppressionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailBlockResponse>

    /**
     * Account + group scoped. Offset pagination only (`page[number]` default 1, `page[size]`
     * default 25, max 100). No `sort`/`filter`/ cursor — ordering fixed `desc created_at, desc id`.
     * Uses the shared `QueryParser.parse_offset/1` — a malformed `page` returns `400` (code
     * `10015`), consistent with `GET /v2/email_blocks`. `meta` includes `total_pages`. Rows reuse
     * the standard suppression shape (`group_id` set to this group).
     */
    fun list(id: String): CompletableFuture<SuppressionListPageAsync> =
        list(id, SuppressionListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: SuppressionListParams = SuppressionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SuppressionListPageAsync> =
        list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: SuppressionListParams = SuppressionListParams.none(),
    ): CompletableFuture<SuppressionListPageAsync> = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SuppressionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SuppressionListPageAsync>

    /** @see list */
    fun list(params: SuppressionListParams): CompletableFuture<SuppressionListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SuppressionListPageAsync> =
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
    fun delete(email: String, params: SuppressionDeleteParams): CompletableFuture<Void?> =
        delete(email, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        email: String,
        params: SuppressionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().email(email).build(), requestOptions)

    /** @see delete */
    fun delete(params: SuppressionDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SuppressionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [SuppressionServiceAsync] that provides access to raw HTTP responses for each
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
        ): SuppressionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /email_unsubscribe_groups/{id}/suppressions`, but
         * is otherwise the same as [SuppressionServiceAsync.create].
         */
        fun create(
            id: String,
            params: SuppressionCreateParams,
        ): CompletableFuture<HttpResponseFor<EmailBlockResponse>> =
            create(id, params, RequestOptions.none())

        /** @see create */
        fun create(
            id: String,
            params: SuppressionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailBlockResponse>> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        fun create(
            params: SuppressionCreateParams
        ): CompletableFuture<HttpResponseFor<EmailBlockResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SuppressionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailBlockResponse>>

        /**
         * Returns a raw HTTP response for `get /email_unsubscribe_groups/{id}/suppressions`, but is
         * otherwise the same as [SuppressionServiceAsync.list].
         */
        fun list(id: String): CompletableFuture<HttpResponseFor<SuppressionListPageAsync>> =
            list(id, SuppressionListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: SuppressionListParams = SuppressionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SuppressionListPageAsync>> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: SuppressionListParams = SuppressionListParams.none(),
        ): CompletableFuture<HttpResponseFor<SuppressionListPageAsync>> =
            list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: SuppressionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SuppressionListPageAsync>>

        /** @see list */
        fun list(
            params: SuppressionListParams
        ): CompletableFuture<HttpResponseFor<SuppressionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SuppressionListPageAsync>> =
            list(id, SuppressionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /email_unsubscribe_groups/{id}/suppressions/{email}`, but is otherwise the same as
         * [SuppressionServiceAsync.delete].
         */
        fun delete(
            email: String,
            params: SuppressionDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(email, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            email: String,
            params: SuppressionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().email(email).build(), requestOptions)

        /** @see delete */
        fun delete(params: SuppressionDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SuppressionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
