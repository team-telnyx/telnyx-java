// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.emailinboxes

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emailinboxes.drafts.DraftCreateParams
import com.telnyx.sdk.models.emailinboxes.drafts.DraftDeleteParams
import com.telnyx.sdk.models.emailinboxes.drafts.DraftListPage
import com.telnyx.sdk.models.emailinboxes.drafts.DraftListParams
import com.telnyx.sdk.models.emailinboxes.drafts.DraftPatchParams
import com.telnyx.sdk.models.emailinboxes.drafts.DraftRetrieveParams
import com.telnyx.sdk.models.emailinboxes.drafts.DraftSendParams
import com.telnyx.sdk.models.emailinboxes.drafts.DraftUpdateParams
import com.telnyx.sdk.models.emailinboxes.drafts.EmailDraftResponse
import com.telnyx.sdk.models.emailinboxes.drafts.EmailMessageResponse
import java.util.function.Consumer

/**
 * Create, list, retrieve, update, delete, and send unsent draft messages belonging to an agent
 * inbox.
 */
interface DraftService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DraftService

    /**
     * Creates an unsent draft in the inbox. Every field is optional — a draft is a work-in-progress
     * and may be saved incomplete. Send-time requirements (sender, subject, at least one recipient)
     * are enforced when the draft is sent, not when it is created.
     *
     * Drafts are unbillable and emit no Email Detail Records until they are sent.
     */
    fun create(inboxId: String): EmailDraftResponse = create(inboxId, DraftCreateParams.none())

    /** @see create */
    fun create(
        inboxId: String,
        params: DraftCreateParams = DraftCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailDraftResponse = create(params.toBuilder().inboxId(inboxId).build(), requestOptions)

    /** @see create */
    fun create(
        inboxId: String,
        params: DraftCreateParams = DraftCreateParams.none(),
    ): EmailDraftResponse = create(inboxId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DraftCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailDraftResponse

    /** @see create */
    fun create(params: DraftCreateParams): EmailDraftResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(inboxId: String, requestOptions: RequestOptions): EmailDraftResponse =
        create(inboxId, DraftCreateParams.none(), requestOptions)

    /**
     * Returns a single draft. Drafts that have been sent remain retrievable, so the exact content
     * that was sent stays auditable.
     */
    fun retrieve(draftId: String, params: DraftRetrieveParams): EmailDraftResponse =
        retrieve(draftId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        draftId: String,
        params: DraftRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailDraftResponse = retrieve(params.toBuilder().draftId(draftId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: DraftRetrieveParams): EmailDraftResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DraftRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailDraftResponse

    /**
     * Updates the supplied fields on a draft. `account_id` and `inbox_id` are server-owned and
     * ignored if present in the body, so a draft can never be moved between accounts or inboxes.
     *
     * A draft that is being sent or has already been sent is immutable and returns 422 — modifying
     * it would race with delivery or rewrite the record of what was actually sent.
     */
    fun update(draftId: String, params: DraftUpdateParams): EmailDraftResponse =
        update(draftId, params, RequestOptions.none())

    /** @see update */
    fun update(
        draftId: String,
        params: DraftUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailDraftResponse = update(params.toBuilder().draftId(draftId).build(), requestOptions)

    /** @see update */
    fun update(params: DraftUpdateParams): EmailDraftResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DraftUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailDraftResponse

    /**
     * Lists drafts newest first using stable cursor pagination. All access is scoped to the
     * authenticated account and the given inbox.
     */
    fun list(inboxId: String): DraftListPage = list(inboxId, DraftListParams.none())

    /** @see list */
    fun list(
        inboxId: String,
        params: DraftListParams = DraftListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DraftListPage = list(params.toBuilder().inboxId(inboxId).build(), requestOptions)

    /** @see list */
    fun list(inboxId: String, params: DraftListParams = DraftListParams.none()): DraftListPage =
        list(inboxId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: DraftListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DraftListPage

    /** @see list */
    fun list(params: DraftListParams): DraftListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(inboxId: String, requestOptions: RequestOptions): DraftListPage =
        list(inboxId, DraftListParams.none(), requestOptions)

    /**
     * Permanently deletes an unsent draft. Drafts that are being sent or have been sent cannot be
     * deleted; sent drafts are retained for audit.
     */
    fun delete(draftId: String, params: DraftDeleteParams) =
        delete(draftId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        draftId: String,
        params: DraftDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().draftId(draftId).build(), requestOptions)

    /** @see delete */
    fun delete(params: DraftDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: DraftDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Identical to `PUT`; both apply a partial update to the supplied fields. */
    fun patch(draftId: String, params: DraftPatchParams): EmailDraftResponse =
        patch(draftId, params, RequestOptions.none())

    /** @see patch */
    fun patch(
        draftId: String,
        params: DraftPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailDraftResponse = patch(params.toBuilder().draftId(draftId).build(), requestOptions)

    /** @see patch */
    fun patch(params: DraftPatchParams): EmailDraftResponse = patch(params, RequestOptions.none())

    /** @see patch */
    fun patch(
        params: DraftPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailDraftResponse

    /**
     * Sends the draft through the standard send pipeline — the same domain resolution, suppression,
     * reputation, daily-quota, persistence and Detail Record behaviour as `POST
     * /v2/email_messages`. The response body is the created email message.
     *
     * If the draft has no explicit `from_email`, the inbox address is used.
     *
     * The draft is marked `sent` only after the send is accepted; a send rejected for suppression,
     * quota or reputation leaves the draft editable so it can be fixed and retried. A draft that is
     * already `sent` returns 422 rather than sending twice.
     */
    fun send(draftId: String, params: DraftSendParams): EmailMessageResponse =
        send(draftId, params, RequestOptions.none())

    /** @see send */
    fun send(
        draftId: String,
        params: DraftSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailMessageResponse = send(params.toBuilder().draftId(draftId).build(), requestOptions)

    /** @see send */
    fun send(params: DraftSendParams): EmailMessageResponse = send(params, RequestOptions.none())

    /** @see send */
    fun send(
        params: DraftSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailMessageResponse

    /** A view of [DraftService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DraftService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /email_inboxes/{inbox_id}/drafts`, but is otherwise
         * the same as [DraftService.create].
         */
        @MustBeClosed
        fun create(inboxId: String): HttpResponseFor<EmailDraftResponse> =
            create(inboxId, DraftCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            inboxId: String,
            params: DraftCreateParams = DraftCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailDraftResponse> =
            create(params.toBuilder().inboxId(inboxId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            inboxId: String,
            params: DraftCreateParams = DraftCreateParams.none(),
        ): HttpResponseFor<EmailDraftResponse> = create(inboxId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DraftCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailDraftResponse>

        /** @see create */
        @MustBeClosed
        fun create(params: DraftCreateParams): HttpResponseFor<EmailDraftResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            inboxId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailDraftResponse> =
            create(inboxId, DraftCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /email_inboxes/{inbox_id}/drafts/{draft_id}`, but is
         * otherwise the same as [DraftService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            draftId: String,
            params: DraftRetrieveParams,
        ): HttpResponseFor<EmailDraftResponse> = retrieve(draftId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            draftId: String,
            params: DraftRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailDraftResponse> =
            retrieve(params.toBuilder().draftId(draftId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: DraftRetrieveParams): HttpResponseFor<EmailDraftResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DraftRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailDraftResponse>

        /**
         * Returns a raw HTTP response for `put /email_inboxes/{inbox_id}/drafts/{draft_id}`, but is
         * otherwise the same as [DraftService.update].
         */
        @MustBeClosed
        fun update(
            draftId: String,
            params: DraftUpdateParams,
        ): HttpResponseFor<EmailDraftResponse> = update(draftId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            draftId: String,
            params: DraftUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailDraftResponse> =
            update(params.toBuilder().draftId(draftId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: DraftUpdateParams): HttpResponseFor<EmailDraftResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: DraftUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailDraftResponse>

        /**
         * Returns a raw HTTP response for `get /email_inboxes/{inbox_id}/drafts`, but is otherwise
         * the same as [DraftService.list].
         */
        @MustBeClosed
        fun list(inboxId: String): HttpResponseFor<DraftListPage> =
            list(inboxId, DraftListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            inboxId: String,
            params: DraftListParams = DraftListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DraftListPage> =
            list(params.toBuilder().inboxId(inboxId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            inboxId: String,
            params: DraftListParams = DraftListParams.none(),
        ): HttpResponseFor<DraftListPage> = list(inboxId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DraftListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DraftListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: DraftListParams): HttpResponseFor<DraftListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(inboxId: String, requestOptions: RequestOptions): HttpResponseFor<DraftListPage> =
            list(inboxId, DraftListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /email_inboxes/{inbox_id}/drafts/{draft_id}`, but
         * is otherwise the same as [DraftService.delete].
         */
        @MustBeClosed
        fun delete(draftId: String, params: DraftDeleteParams): HttpResponse =
            delete(draftId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            draftId: String,
            params: DraftDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().draftId(draftId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: DraftDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DraftDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `patch /email_inboxes/{inbox_id}/drafts/{draft_id}`, but
         * is otherwise the same as [DraftService.patch].
         */
        @MustBeClosed
        fun patch(draftId: String, params: DraftPatchParams): HttpResponseFor<EmailDraftResponse> =
            patch(draftId, params, RequestOptions.none())

        /** @see patch */
        @MustBeClosed
        fun patch(
            draftId: String,
            params: DraftPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailDraftResponse> =
            patch(params.toBuilder().draftId(draftId).build(), requestOptions)

        /** @see patch */
        @MustBeClosed
        fun patch(params: DraftPatchParams): HttpResponseFor<EmailDraftResponse> =
            patch(params, RequestOptions.none())

        /** @see patch */
        @MustBeClosed
        fun patch(
            params: DraftPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailDraftResponse>

        /**
         * Returns a raw HTTP response for `post /email_inboxes/{inbox_id}/drafts/{draft_id}/send`,
         * but is otherwise the same as [DraftService.send].
         */
        @MustBeClosed
        fun send(draftId: String, params: DraftSendParams): HttpResponseFor<EmailMessageResponse> =
            send(draftId, params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(
            draftId: String,
            params: DraftSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailMessageResponse> =
            send(params.toBuilder().draftId(draftId).build(), requestOptions)

        /** @see send */
        @MustBeClosed
        fun send(params: DraftSendParams): HttpResponseFor<EmailMessageResponse> =
            send(params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(
            params: DraftSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailMessageResponse>
    }
}
