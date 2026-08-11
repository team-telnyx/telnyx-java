// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emailunsubscribegroups.EmailUnsubscribeGroupCreateParams
import com.telnyx.sdk.models.emailunsubscribegroups.EmailUnsubscribeGroupDeleteParams
import com.telnyx.sdk.models.emailunsubscribegroups.EmailUnsubscribeGroupListPage
import com.telnyx.sdk.models.emailunsubscribegroups.EmailUnsubscribeGroupListParams
import com.telnyx.sdk.models.emailunsubscribegroups.EmailUnsubscribeGroupRetrieveParams
import com.telnyx.sdk.models.emailunsubscribegroups.EmailUnsubscribeGroupUpdateParams
import com.telnyx.sdk.models.emailunsubscribegroups.UnsubscribeGroupResponse
import com.telnyx.sdk.services.blocking.emailunsubscribegroups.SuppressionService
import java.util.function.Consumer

/** Named groups and group-scoped suppressions. */
interface EmailUnsubscribeGroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailUnsubscribeGroupService

    /** Named groups and group-scoped suppressions. */
    fun suppressions(): SuppressionService

    /**
     * Creates an account-owned unsubscribe group for associating email categories with separate
     * recipient suppression lists.
     */
    fun create(params: EmailUnsubscribeGroupCreateParams): UnsubscribeGroupResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EmailUnsubscribeGroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UnsubscribeGroupResponse

    /** Returns the account-owned unsubscribe group identified by ID. */
    fun retrieve(id: String): UnsubscribeGroupResponse =
        retrieve(id, EmailUnsubscribeGroupRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EmailUnsubscribeGroupRetrieveParams = EmailUnsubscribeGroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UnsubscribeGroupResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EmailUnsubscribeGroupRetrieveParams = EmailUnsubscribeGroupRetrieveParams.none(),
    ): UnsubscribeGroupResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EmailUnsubscribeGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UnsubscribeGroupResponse

    /** @see retrieve */
    fun retrieve(params: EmailUnsubscribeGroupRetrieveParams): UnsubscribeGroupResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): UnsubscribeGroupResponse =
        retrieve(id, EmailUnsubscribeGroupRetrieveParams.none(), requestOptions)

    /** Partial update (only `name` / `description`). `PUT` is not routed. */
    fun update(id: String): UnsubscribeGroupResponse =
        update(id, EmailUnsubscribeGroupUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: EmailUnsubscribeGroupUpdateParams = EmailUnsubscribeGroupUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UnsubscribeGroupResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: EmailUnsubscribeGroupUpdateParams = EmailUnsubscribeGroupUpdateParams.none(),
    ): UnsubscribeGroupResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EmailUnsubscribeGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UnsubscribeGroupResponse

    /** @see update */
    fun update(params: EmailUnsubscribeGroupUpdateParams): UnsubscribeGroupResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): UnsubscribeGroupResponse =
        update(id, EmailUnsubscribeGroupUpdateParams.none(), requestOptions)

    /**
     * Offset pagination only (`page[number]` default 1, `page[size]` default 25, max 100). No
     * `sort`/`filter`/cursor — ordering fixed `desc created_at, desc id`. Uses the shared
     * `QueryParser.parse_offset/1` — a malformed `page` (e.g. flat `?page=1` instead of
     * `?page[number]=1`) returns `400` (code `10015`), consistent with `GET /v2/email_blocks`.
     * `meta` includes `total_pages`.
     */
    fun list(): EmailUnsubscribeGroupListPage = list(EmailUnsubscribeGroupListParams.none())

    /** @see list */
    fun list(
        params: EmailUnsubscribeGroupListParams = EmailUnsubscribeGroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailUnsubscribeGroupListPage

    /** @see list */
    fun list(
        params: EmailUnsubscribeGroupListParams = EmailUnsubscribeGroupListParams.none()
    ): EmailUnsubscribeGroupListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): EmailUnsubscribeGroupListPage =
        list(EmailUnsubscribeGroupListParams.none(), requestOptions)

    /**
     * If the group has 0 active suppressions, hard-deletes the row. With `force=true`, soft-deletes
     * all active suppressions first (status → `removed`, `group_id` cleared, `removed` audit event
     * per block) in a single transaction, then hard-deletes the group. Without `force` and active
     * suppressions present → `409`. Audit trail is preserved. `force` only accepts the string
     * `"true"` or boolean `true`; all other values are false.
     */
    fun delete(id: String) = delete(id, EmailUnsubscribeGroupDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: EmailUnsubscribeGroupDeleteParams = EmailUnsubscribeGroupDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: EmailUnsubscribeGroupDeleteParams = EmailUnsubscribeGroupDeleteParams.none(),
    ) = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EmailUnsubscribeGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: EmailUnsubscribeGroupDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, EmailUnsubscribeGroupDeleteParams.none(), requestOptions)

    /**
     * A view of [EmailUnsubscribeGroupService] that provides access to raw HTTP responses for each
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
        ): EmailUnsubscribeGroupService.WithRawResponse

        /** Named groups and group-scoped suppressions. */
        fun suppressions(): SuppressionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /email_unsubscribe_groups`, but is otherwise the
         * same as [EmailUnsubscribeGroupService.create].
         */
        @MustBeClosed
        fun create(
            params: EmailUnsubscribeGroupCreateParams
        ): HttpResponseFor<UnsubscribeGroupResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: EmailUnsubscribeGroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UnsubscribeGroupResponse>

        /**
         * Returns a raw HTTP response for `get /email_unsubscribe_groups/{id}`, but is otherwise
         * the same as [EmailUnsubscribeGroupService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<UnsubscribeGroupResponse> =
            retrieve(id, EmailUnsubscribeGroupRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EmailUnsubscribeGroupRetrieveParams =
                EmailUnsubscribeGroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UnsubscribeGroupResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EmailUnsubscribeGroupRetrieveParams = EmailUnsubscribeGroupRetrieveParams.none(),
        ): HttpResponseFor<UnsubscribeGroupResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EmailUnsubscribeGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UnsubscribeGroupResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EmailUnsubscribeGroupRetrieveParams
        ): HttpResponseFor<UnsubscribeGroupResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UnsubscribeGroupResponse> =
            retrieve(id, EmailUnsubscribeGroupRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /email_unsubscribe_groups/{id}`, but is otherwise
         * the same as [EmailUnsubscribeGroupService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<UnsubscribeGroupResponse> =
            update(id, EmailUnsubscribeGroupUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: EmailUnsubscribeGroupUpdateParams = EmailUnsubscribeGroupUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UnsubscribeGroupResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: EmailUnsubscribeGroupUpdateParams = EmailUnsubscribeGroupUpdateParams.none(),
        ): HttpResponseFor<UnsubscribeGroupResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: EmailUnsubscribeGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UnsubscribeGroupResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            params: EmailUnsubscribeGroupUpdateParams
        ): HttpResponseFor<UnsubscribeGroupResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UnsubscribeGroupResponse> =
            update(id, EmailUnsubscribeGroupUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /email_unsubscribe_groups`, but is otherwise the
         * same as [EmailUnsubscribeGroupService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<EmailUnsubscribeGroupListPage> =
            list(EmailUnsubscribeGroupListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EmailUnsubscribeGroupListParams = EmailUnsubscribeGroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailUnsubscribeGroupListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: EmailUnsubscribeGroupListParams = EmailUnsubscribeGroupListParams.none()
        ): HttpResponseFor<EmailUnsubscribeGroupListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EmailUnsubscribeGroupListPage> =
            list(EmailUnsubscribeGroupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /email_unsubscribe_groups/{id}`, but is otherwise
         * the same as [EmailUnsubscribeGroupService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, EmailUnsubscribeGroupDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: EmailUnsubscribeGroupDeleteParams = EmailUnsubscribeGroupDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: EmailUnsubscribeGroupDeleteParams = EmailUnsubscribeGroupDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: EmailUnsubscribeGroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: EmailUnsubscribeGroupDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, EmailUnsubscribeGroupDeleteParams.none(), requestOptions)
    }
}
