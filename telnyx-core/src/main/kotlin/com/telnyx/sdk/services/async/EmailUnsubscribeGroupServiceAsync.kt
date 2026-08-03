// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emailunsubscribegroups.EmailUnsubscribeGroupCreateParams
import com.telnyx.sdk.models.emailunsubscribegroups.EmailUnsubscribeGroupDeleteParams
import com.telnyx.sdk.models.emailunsubscribegroups.EmailUnsubscribeGroupListPageAsync
import com.telnyx.sdk.models.emailunsubscribegroups.EmailUnsubscribeGroupListParams
import com.telnyx.sdk.models.emailunsubscribegroups.EmailUnsubscribeGroupRetrieveParams
import com.telnyx.sdk.models.emailunsubscribegroups.EmailUnsubscribeGroupUpdateParams
import com.telnyx.sdk.models.emailunsubscribegroups.UnsubscribeGroupResponse
import com.telnyx.sdk.services.async.emailunsubscribegroups.SuppressionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Named groups and group-scoped suppressions. */
interface EmailUnsubscribeGroupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailUnsubscribeGroupServiceAsync

    /** Named groups and group-scoped suppressions. */
    fun suppressions(): SuppressionServiceAsync

    /** Create an unsubscribe group */
    fun create(
        params: EmailUnsubscribeGroupCreateParams
    ): CompletableFuture<UnsubscribeGroupResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EmailUnsubscribeGroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UnsubscribeGroupResponse>

    /** Retrieve an unsubscribe group */
    fun retrieve(id: String): CompletableFuture<UnsubscribeGroupResponse> =
        retrieve(id, EmailUnsubscribeGroupRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EmailUnsubscribeGroupRetrieveParams = EmailUnsubscribeGroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UnsubscribeGroupResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EmailUnsubscribeGroupRetrieveParams = EmailUnsubscribeGroupRetrieveParams.none(),
    ): CompletableFuture<UnsubscribeGroupResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EmailUnsubscribeGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UnsubscribeGroupResponse>

    /** @see retrieve */
    fun retrieve(
        params: EmailUnsubscribeGroupRetrieveParams
    ): CompletableFuture<UnsubscribeGroupResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<UnsubscribeGroupResponse> =
        retrieve(id, EmailUnsubscribeGroupRetrieveParams.none(), requestOptions)

    /** Partial update (only `name` / `description`). `PUT` is not routed. */
    fun update(id: String): CompletableFuture<UnsubscribeGroupResponse> =
        update(id, EmailUnsubscribeGroupUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: EmailUnsubscribeGroupUpdateParams = EmailUnsubscribeGroupUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UnsubscribeGroupResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: EmailUnsubscribeGroupUpdateParams = EmailUnsubscribeGroupUpdateParams.none(),
    ): CompletableFuture<UnsubscribeGroupResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EmailUnsubscribeGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UnsubscribeGroupResponse>

    /** @see update */
    fun update(
        params: EmailUnsubscribeGroupUpdateParams
    ): CompletableFuture<UnsubscribeGroupResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<UnsubscribeGroupResponse> =
        update(id, EmailUnsubscribeGroupUpdateParams.none(), requestOptions)

    /**
     * Offset pagination only (`page[number]` default 1, `page[size]` default 25, max 100). No
     * `sort`/`filter`/cursor — ordering fixed `desc created_at, desc id`. Uses the shared
     * `QueryParser.parse_offset/1` — a malformed `page` (e.g. flat `?page=1` instead of
     * `?page[number]=1`) returns `400` (code `10015`), consistent with `GET /v2/email_blocks`.
     * `meta` includes `total_pages`.
     */
    fun list(): CompletableFuture<EmailUnsubscribeGroupListPageAsync> =
        list(EmailUnsubscribeGroupListParams.none())

    /** @see list */
    fun list(
        params: EmailUnsubscribeGroupListParams = EmailUnsubscribeGroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailUnsubscribeGroupListPageAsync>

    /** @see list */
    fun list(
        params: EmailUnsubscribeGroupListParams = EmailUnsubscribeGroupListParams.none()
    ): CompletableFuture<EmailUnsubscribeGroupListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<EmailUnsubscribeGroupListPageAsync> =
        list(EmailUnsubscribeGroupListParams.none(), requestOptions)

    /**
     * If the group has 0 active suppressions, hard-deletes the row. With `force=true`, soft-deletes
     * all active suppressions first (status → `removed`, `group_id` cleared, `removed` audit event
     * per block) in a single transaction, then hard-deletes the group. Without `force` and active
     * suppressions present → `409`. Audit trail is preserved. `force` only accepts the string
     * `"true"` or boolean `true`; all other values are false.
     */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(id, EmailUnsubscribeGroupDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: EmailUnsubscribeGroupDeleteParams = EmailUnsubscribeGroupDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: EmailUnsubscribeGroupDeleteParams = EmailUnsubscribeGroupDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EmailUnsubscribeGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: EmailUnsubscribeGroupDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, EmailUnsubscribeGroupDeleteParams.none(), requestOptions)

    /**
     * A view of [EmailUnsubscribeGroupServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailUnsubscribeGroupServiceAsync.WithRawResponse

        /** Named groups and group-scoped suppressions. */
        fun suppressions(): SuppressionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /email_unsubscribe_groups`, but is otherwise the
         * same as [EmailUnsubscribeGroupServiceAsync.create].
         */
        fun create(
            params: EmailUnsubscribeGroupCreateParams
        ): CompletableFuture<HttpResponseFor<UnsubscribeGroupResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EmailUnsubscribeGroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UnsubscribeGroupResponse>>

        /**
         * Returns a raw HTTP response for `get /email_unsubscribe_groups/{id}`, but is otherwise
         * the same as [EmailUnsubscribeGroupServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<UnsubscribeGroupResponse>> =
            retrieve(id, EmailUnsubscribeGroupRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EmailUnsubscribeGroupRetrieveParams =
                EmailUnsubscribeGroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UnsubscribeGroupResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EmailUnsubscribeGroupRetrieveParams = EmailUnsubscribeGroupRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<UnsubscribeGroupResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EmailUnsubscribeGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UnsubscribeGroupResponse>>

        /** @see retrieve */
        fun retrieve(
            params: EmailUnsubscribeGroupRetrieveParams
        ): CompletableFuture<HttpResponseFor<UnsubscribeGroupResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UnsubscribeGroupResponse>> =
            retrieve(id, EmailUnsubscribeGroupRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /email_unsubscribe_groups/{id}`, but is otherwise
         * the same as [EmailUnsubscribeGroupServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<UnsubscribeGroupResponse>> =
            update(id, EmailUnsubscribeGroupUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: EmailUnsubscribeGroupUpdateParams = EmailUnsubscribeGroupUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UnsubscribeGroupResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: EmailUnsubscribeGroupUpdateParams = EmailUnsubscribeGroupUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<UnsubscribeGroupResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: EmailUnsubscribeGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UnsubscribeGroupResponse>>

        /** @see update */
        fun update(
            params: EmailUnsubscribeGroupUpdateParams
        ): CompletableFuture<HttpResponseFor<UnsubscribeGroupResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UnsubscribeGroupResponse>> =
            update(id, EmailUnsubscribeGroupUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /email_unsubscribe_groups`, but is otherwise the
         * same as [EmailUnsubscribeGroupServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EmailUnsubscribeGroupListPageAsync>> =
            list(EmailUnsubscribeGroupListParams.none())

        /** @see list */
        fun list(
            params: EmailUnsubscribeGroupListParams = EmailUnsubscribeGroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailUnsubscribeGroupListPageAsync>>

        /** @see list */
        fun list(
            params: EmailUnsubscribeGroupListParams = EmailUnsubscribeGroupListParams.none()
        ): CompletableFuture<HttpResponseFor<EmailUnsubscribeGroupListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EmailUnsubscribeGroupListPageAsync>> =
            list(EmailUnsubscribeGroupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /email_unsubscribe_groups/{id}`, but is otherwise
         * the same as [EmailUnsubscribeGroupServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, EmailUnsubscribeGroupDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: EmailUnsubscribeGroupDeleteParams = EmailUnsubscribeGroupDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: EmailUnsubscribeGroupDeleteParams = EmailUnsubscribeGroupDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: EmailUnsubscribeGroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: EmailUnsubscribeGroupDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, EmailUnsubscribeGroupDeleteParams.none(), requestOptions)
    }
}
