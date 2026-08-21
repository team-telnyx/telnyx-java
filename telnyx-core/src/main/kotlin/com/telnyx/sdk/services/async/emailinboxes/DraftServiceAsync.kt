// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.emailinboxes

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emailinboxes.drafts.DraftCreateParams
import com.telnyx.sdk.models.emailinboxes.drafts.DraftDeleteParams
import com.telnyx.sdk.models.emailinboxes.drafts.DraftListPageAsync
import com.telnyx.sdk.models.emailinboxes.drafts.DraftListParams
import com.telnyx.sdk.models.emailinboxes.drafts.DraftPatchParams
import com.telnyx.sdk.models.emailinboxes.drafts.DraftRetrieveParams
import com.telnyx.sdk.models.emailinboxes.drafts.DraftSendParams
import com.telnyx.sdk.models.emailinboxes.drafts.DraftUpdateParams
import com.telnyx.sdk.models.emailinboxes.drafts.EmailDraftResponse
import com.telnyx.sdk.models.emailinboxes.drafts.EmailMessageResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Create, list, retrieve, update, delete, and send unsent draft messages belonging to an agent
 * inbox.
 */
interface DraftServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DraftServiceAsync

    /**
     * Creates an unsent draft in the inbox. Every field is optional — a draft is a work-in-progress
     * and may be saved incomplete. Send-time requirements (sender, subject, at least one recipient)
     * are enforced when the draft is sent, not when it is created.
     *
     * Drafts are unbillable and emit no Email Detail Records until they are sent.
     */
    fun create(inboxId: String): CompletableFuture<EmailDraftResponse> =
        create(inboxId, DraftCreateParams.none())

    /** @see create */
    fun create(
        inboxId: String,
        params: DraftCreateParams = DraftCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailDraftResponse> =
        create(params.toBuilder().inboxId(inboxId).build(), requestOptions)

    /** @see create */
    fun create(
        inboxId: String,
        params: DraftCreateParams = DraftCreateParams.none(),
    ): CompletableFuture<EmailDraftResponse> = create(inboxId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DraftCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailDraftResponse>

    /** @see create */
    fun create(params: DraftCreateParams): CompletableFuture<EmailDraftResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        inboxId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailDraftResponse> =
        create(inboxId, DraftCreateParams.none(), requestOptions)

    /**
     * Returns a single draft. Drafts that have been sent remain retrievable, so the exact content
     * that was sent stays auditable.
     */
    fun retrieve(
        draftId: String,
        params: DraftRetrieveParams,
    ): CompletableFuture<EmailDraftResponse> = retrieve(draftId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        draftId: String,
        params: DraftRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailDraftResponse> =
        retrieve(params.toBuilder().draftId(draftId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: DraftRetrieveParams): CompletableFuture<EmailDraftResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DraftRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailDraftResponse>

    /**
     * Updates the supplied fields on a draft. `account_id` and `inbox_id` are server-owned and
     * ignored if present in the body, so a draft can never be moved between accounts or inboxes.
     *
     * A draft that is being sent or has already been sent is immutable and returns 422 — modifying
     * it would race with delivery or rewrite the record of what was actually sent.
     */
    fun update(draftId: String, params: DraftUpdateParams): CompletableFuture<EmailDraftResponse> =
        update(draftId, params, RequestOptions.none())

    /** @see update */
    fun update(
        draftId: String,
        params: DraftUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailDraftResponse> =
        update(params.toBuilder().draftId(draftId).build(), requestOptions)

    /** @see update */
    fun update(params: DraftUpdateParams): CompletableFuture<EmailDraftResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DraftUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailDraftResponse>

    /**
     * Lists drafts newest first using stable cursor pagination. All access is scoped to the
     * authenticated account and the given inbox.
     */
    fun list(inboxId: String): CompletableFuture<DraftListPageAsync> =
        list(inboxId, DraftListParams.none())

    /** @see list */
    fun list(
        inboxId: String,
        params: DraftListParams = DraftListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DraftListPageAsync> =
        list(params.toBuilder().inboxId(inboxId).build(), requestOptions)

    /** @see list */
    fun list(
        inboxId: String,
        params: DraftListParams = DraftListParams.none(),
    ): CompletableFuture<DraftListPageAsync> = list(inboxId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: DraftListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DraftListPageAsync>

    /** @see list */
    fun list(params: DraftListParams): CompletableFuture<DraftListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        inboxId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DraftListPageAsync> = list(inboxId, DraftListParams.none(), requestOptions)

    /**
     * Permanently deletes an unsent draft. Drafts that are being sent or have been sent cannot be
     * deleted; sent drafts are retained for audit.
     */
    fun delete(draftId: String, params: DraftDeleteParams): CompletableFuture<Void?> =
        delete(draftId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        draftId: String,
        params: DraftDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().draftId(draftId).build(), requestOptions)

    /** @see delete */
    fun delete(params: DraftDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DraftDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Identical to `PUT`; both apply a partial update to the supplied fields. */
    fun patch(draftId: String, params: DraftPatchParams): CompletableFuture<EmailDraftResponse> =
        patch(draftId, params, RequestOptions.none())

    /** @see patch */
    fun patch(
        draftId: String,
        params: DraftPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailDraftResponse> =
        patch(params.toBuilder().draftId(draftId).build(), requestOptions)

    /** @see patch */
    fun patch(params: DraftPatchParams): CompletableFuture<EmailDraftResponse> =
        patch(params, RequestOptions.none())

    /** @see patch */
    fun patch(
        params: DraftPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailDraftResponse>

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
    fun send(draftId: String, params: DraftSendParams): CompletableFuture<EmailMessageResponse> =
        send(draftId, params, RequestOptions.none())

    /** @see send */
    fun send(
        draftId: String,
        params: DraftSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailMessageResponse> =
        send(params.toBuilder().draftId(draftId).build(), requestOptions)

    /** @see send */
    fun send(params: DraftSendParams): CompletableFuture<EmailMessageResponse> =
        send(params, RequestOptions.none())

    /** @see send */
    fun send(
        params: DraftSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailMessageResponse>

    /** A view of [DraftServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DraftServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /email_inboxes/{inbox_id}/drafts`, but is otherwise
         * the same as [DraftServiceAsync.create].
         */
        fun create(inboxId: String): CompletableFuture<HttpResponseFor<EmailDraftResponse>> =
            create(inboxId, DraftCreateParams.none())

        /** @see create */
        fun create(
            inboxId: String,
            params: DraftCreateParams = DraftCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailDraftResponse>> =
            create(params.toBuilder().inboxId(inboxId).build(), requestOptions)

        /** @see create */
        fun create(
            inboxId: String,
            params: DraftCreateParams = DraftCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<EmailDraftResponse>> =
            create(inboxId, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DraftCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailDraftResponse>>

        /** @see create */
        fun create(
            params: DraftCreateParams
        ): CompletableFuture<HttpResponseFor<EmailDraftResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            inboxId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailDraftResponse>> =
            create(inboxId, DraftCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /email_inboxes/{inbox_id}/drafts/{draft_id}`, but is
         * otherwise the same as [DraftServiceAsync.retrieve].
         */
        fun retrieve(
            draftId: String,
            params: DraftRetrieveParams,
        ): CompletableFuture<HttpResponseFor<EmailDraftResponse>> =
            retrieve(draftId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            draftId: String,
            params: DraftRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailDraftResponse>> =
            retrieve(params.toBuilder().draftId(draftId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: DraftRetrieveParams
        ): CompletableFuture<HttpResponseFor<EmailDraftResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: DraftRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailDraftResponse>>

        /**
         * Returns a raw HTTP response for `put /email_inboxes/{inbox_id}/drafts/{draft_id}`, but is
         * otherwise the same as [DraftServiceAsync.update].
         */
        fun update(
            draftId: String,
            params: DraftUpdateParams,
        ): CompletableFuture<HttpResponseFor<EmailDraftResponse>> =
            update(draftId, params, RequestOptions.none())

        /** @see update */
        fun update(
            draftId: String,
            params: DraftUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailDraftResponse>> =
            update(params.toBuilder().draftId(draftId).build(), requestOptions)

        /** @see update */
        fun update(
            params: DraftUpdateParams
        ): CompletableFuture<HttpResponseFor<EmailDraftResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: DraftUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailDraftResponse>>

        /**
         * Returns a raw HTTP response for `get /email_inboxes/{inbox_id}/drafts`, but is otherwise
         * the same as [DraftServiceAsync.list].
         */
        fun list(inboxId: String): CompletableFuture<HttpResponseFor<DraftListPageAsync>> =
            list(inboxId, DraftListParams.none())

        /** @see list */
        fun list(
            inboxId: String,
            params: DraftListParams = DraftListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DraftListPageAsync>> =
            list(params.toBuilder().inboxId(inboxId).build(), requestOptions)

        /** @see list */
        fun list(
            inboxId: String,
            params: DraftListParams = DraftListParams.none(),
        ): CompletableFuture<HttpResponseFor<DraftListPageAsync>> =
            list(inboxId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: DraftListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DraftListPageAsync>>

        /** @see list */
        fun list(params: DraftListParams): CompletableFuture<HttpResponseFor<DraftListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            inboxId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DraftListPageAsync>> =
            list(inboxId, DraftListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /email_inboxes/{inbox_id}/drafts/{draft_id}`, but
         * is otherwise the same as [DraftServiceAsync.delete].
         */
        fun delete(draftId: String, params: DraftDeleteParams): CompletableFuture<HttpResponse> =
            delete(draftId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            draftId: String,
            params: DraftDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().draftId(draftId).build(), requestOptions)

        /** @see delete */
        fun delete(params: DraftDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: DraftDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `patch /email_inboxes/{inbox_id}/drafts/{draft_id}`, but
         * is otherwise the same as [DraftServiceAsync.patch].
         */
        fun patch(
            draftId: String,
            params: DraftPatchParams,
        ): CompletableFuture<HttpResponseFor<EmailDraftResponse>> =
            patch(draftId, params, RequestOptions.none())

        /** @see patch */
        fun patch(
            draftId: String,
            params: DraftPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailDraftResponse>> =
            patch(params.toBuilder().draftId(draftId).build(), requestOptions)

        /** @see patch */
        fun patch(
            params: DraftPatchParams
        ): CompletableFuture<HttpResponseFor<EmailDraftResponse>> =
            patch(params, RequestOptions.none())

        /** @see patch */
        fun patch(
            params: DraftPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailDraftResponse>>

        /**
         * Returns a raw HTTP response for `post /email_inboxes/{inbox_id}/drafts/{draft_id}/send`,
         * but is otherwise the same as [DraftServiceAsync.send].
         */
        fun send(
            draftId: String,
            params: DraftSendParams,
        ): CompletableFuture<HttpResponseFor<EmailMessageResponse>> =
            send(draftId, params, RequestOptions.none())

        /** @see send */
        fun send(
            draftId: String,
            params: DraftSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailMessageResponse>> =
            send(params.toBuilder().draftId(draftId).build(), requestOptions)

        /** @see send */
        fun send(
            params: DraftSendParams
        ): CompletableFuture<HttpResponseFor<EmailMessageResponse>> =
            send(params, RequestOptions.none())

        /** @see send */
        fun send(
            params: DraftSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailMessageResponse>>
    }
}
