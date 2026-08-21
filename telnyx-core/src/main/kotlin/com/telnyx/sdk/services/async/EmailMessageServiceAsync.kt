// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emailinboxes.drafts.EmailMessageResponse
import com.telnyx.sdk.models.emailmessages.EmailMessageBatchParams
import com.telnyx.sdk.models.emailmessages.EmailMessageBatchResponse
import com.telnyx.sdk.models.emailmessages.EmailMessageCreateParams
import com.telnyx.sdk.models.emailmessages.EmailMessageDeleteAllParams
import com.telnyx.sdk.models.emailmessages.EmailMessageDeleteParams
import com.telnyx.sdk.models.emailmessages.EmailMessageDeleteScheduleParams
import com.telnyx.sdk.models.emailmessages.EmailMessageListPageAsync
import com.telnyx.sdk.models.emailmessages.EmailMessageListParams
import com.telnyx.sdk.models.emailmessages.EmailMessageRetrieveEventsPageAsync
import com.telnyx.sdk.models.emailmessages.EmailMessageRetrieveEventsParams
import com.telnyx.sdk.models.emailmessages.EmailMessageRetrieveParams
import com.telnyx.sdk.models.emailmessages.EmailMessageRetrieveResponse
import com.telnyx.sdk.services.async.emailmessages.RecipientServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Send and manage email messages. Legacy `/v2/emails` routes are aliases for these endpoints. */
interface EmailMessageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailMessageServiceAsync

    /**
     * Send and manage email messages. Legacy `/v2/emails` routes are aliases for these endpoints.
     */
    fun recipients(): RecipientServiceAsync

    /**
     * Queues, schedules, or sandbox-sends an email message. The legacy `/v2/emails` POST route is a
     * backward-compatible alias for this operation.
     *
     * `subject` is required unless `template_id` is supplied. When using `template_id`, do not also
     * provide `subject`, `html_body`, or `text_body`; the template is rendered with
     * `template_variables`.
     *
     * Note: template lookup failures (not found, wrong account) return 400, not 404.
     */
    fun create(params: EmailMessageCreateParams): CompletableFuture<EmailMessageResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EmailMessageCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailMessageResponse>

    /** The legacy `/v2/emails/{id}` GET route is a backward-compatible alias for this operation. */
    fun retrieve(id: String): CompletableFuture<EmailMessageRetrieveResponse> =
        retrieve(id, EmailMessageRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EmailMessageRetrieveParams = EmailMessageRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailMessageRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EmailMessageRetrieveParams = EmailMessageRetrieveParams.none(),
    ): CompletableFuture<EmailMessageRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EmailMessageRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailMessageRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: EmailMessageRetrieveParams
    ): CompletableFuture<EmailMessageRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailMessageRetrieveResponse> =
        retrieve(id, EmailMessageRetrieveParams.none(), requestOptions)

    /**
     * Lists messages sorted newest first by `created_at desc, id desc`. No filters other than
     * cursor pagination are implemented. The legacy `/v2/emails` GET route is a backward-compatible
     * alias for this operation.
     */
    fun list(): CompletableFuture<EmailMessageListPageAsync> = list(EmailMessageListParams.none())

    /** @see list */
    fun list(
        params: EmailMessageListParams = EmailMessageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailMessageListPageAsync>

    /** @see list */
    fun list(
        params: EmailMessageListParams = EmailMessageListParams.none()
    ): CompletableFuture<EmailMessageListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EmailMessageListPageAsync> =
        list(EmailMessageListParams.none(), requestOptions)

    /**
     * Permanently deletes an account-scoped email message, its events, its durable recipients, and
     * unshared attachment objects. Returns 404 when the message does not exist in the authenticated
     * account. The legacy `/v2/emails/{id}` DELETE route is a backward-compatible alias.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, EmailMessageDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: EmailMessageDeleteParams = EmailMessageDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: EmailMessageDeleteParams = EmailMessageDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EmailMessageDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: EmailMessageDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, EmailMessageDeleteParams.none(), requestOptions)

    /** Creates up to 50 email messages in a single request. */
    fun batch(params: EmailMessageBatchParams): CompletableFuture<EmailMessageBatchResponse> =
        batch(params, RequestOptions.none())

    /** @see batch */
    fun batch(
        params: EmailMessageBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailMessageBatchResponse>

    /**
     * Permanently deletes every email in the authenticated account sent from or to the supplied
     * address, including retained events whose parent message has expired. Events and durable
     * recipients are deleted immediately with each message. The operation never searches or reports
     * matches in another account. The legacy `/v2/emails` DELETE route is a backward-compatible
     * alias.
     */
    fun deleteAll(params: EmailMessageDeleteAllParams): CompletableFuture<Void?> =
        deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        params: EmailMessageDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Cancels a scheduled email and returns it with status `cancelled`. The legacy
     * `/v2/emails/{id}/schedule` DELETE route is an alias.
     */
    fun deleteSchedule(emailId: String): CompletableFuture<EmailMessageResponse> =
        deleteSchedule(emailId, EmailMessageDeleteScheduleParams.none())

    /** @see deleteSchedule */
    fun deleteSchedule(
        emailId: String,
        params: EmailMessageDeleteScheduleParams = EmailMessageDeleteScheduleParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailMessageResponse> =
        deleteSchedule(params.toBuilder().emailId(emailId).build(), requestOptions)

    /** @see deleteSchedule */
    fun deleteSchedule(
        emailId: String,
        params: EmailMessageDeleteScheduleParams = EmailMessageDeleteScheduleParams.none(),
    ): CompletableFuture<EmailMessageResponse> =
        deleteSchedule(emailId, params, RequestOptions.none())

    /** @see deleteSchedule */
    fun deleteSchedule(
        params: EmailMessageDeleteScheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailMessageResponse>

    /** @see deleteSchedule */
    fun deleteSchedule(
        params: EmailMessageDeleteScheduleParams
    ): CompletableFuture<EmailMessageResponse> = deleteSchedule(params, RequestOptions.none())

    /** @see deleteSchedule */
    fun deleteSchedule(
        emailId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailMessageResponse> =
        deleteSchedule(emailId, EmailMessageDeleteScheduleParams.none(), requestOptions)

    /**
     * Lists events for a single message sorted oldest first by `occurred_at asc, id asc`. The
     * legacy `/v2/emails/{id}/events` GET route is a backward-compatible alias.
     */
    fun retrieveEvents(emailId: String): CompletableFuture<EmailMessageRetrieveEventsPageAsync> =
        retrieveEvents(emailId, EmailMessageRetrieveEventsParams.none())

    /** @see retrieveEvents */
    fun retrieveEvents(
        emailId: String,
        params: EmailMessageRetrieveEventsParams = EmailMessageRetrieveEventsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailMessageRetrieveEventsPageAsync> =
        retrieveEvents(params.toBuilder().emailId(emailId).build(), requestOptions)

    /** @see retrieveEvents */
    fun retrieveEvents(
        emailId: String,
        params: EmailMessageRetrieveEventsParams = EmailMessageRetrieveEventsParams.none(),
    ): CompletableFuture<EmailMessageRetrieveEventsPageAsync> =
        retrieveEvents(emailId, params, RequestOptions.none())

    /** @see retrieveEvents */
    fun retrieveEvents(
        params: EmailMessageRetrieveEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailMessageRetrieveEventsPageAsync>

    /** @see retrieveEvents */
    fun retrieveEvents(
        params: EmailMessageRetrieveEventsParams
    ): CompletableFuture<EmailMessageRetrieveEventsPageAsync> =
        retrieveEvents(params, RequestOptions.none())

    /** @see retrieveEvents */
    fun retrieveEvents(
        emailId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailMessageRetrieveEventsPageAsync> =
        retrieveEvents(emailId, EmailMessageRetrieveEventsParams.none(), requestOptions)

    /**
     * A view of [EmailMessageServiceAsync] that provides access to raw HTTP responses for each
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
        ): EmailMessageServiceAsync.WithRawResponse

        /**
         * Send and manage email messages. Legacy `/v2/emails` routes are aliases for these
         * endpoints.
         */
        fun recipients(): RecipientServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /email_messages`, but is otherwise the same as
         * [EmailMessageServiceAsync.create].
         */
        fun create(
            params: EmailMessageCreateParams
        ): CompletableFuture<HttpResponseFor<EmailMessageResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EmailMessageCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailMessageResponse>>

        /**
         * Returns a raw HTTP response for `get /email_messages/{id}`, but is otherwise the same as
         * [EmailMessageServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<EmailMessageRetrieveResponse>> =
            retrieve(id, EmailMessageRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EmailMessageRetrieveParams = EmailMessageRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailMessageRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EmailMessageRetrieveParams = EmailMessageRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EmailMessageRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EmailMessageRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailMessageRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: EmailMessageRetrieveParams
        ): CompletableFuture<HttpResponseFor<EmailMessageRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailMessageRetrieveResponse>> =
            retrieve(id, EmailMessageRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /email_messages`, but is otherwise the same as
         * [EmailMessageServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EmailMessageListPageAsync>> =
            list(EmailMessageListParams.none())

        /** @see list */
        fun list(
            params: EmailMessageListParams = EmailMessageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailMessageListPageAsync>>

        /** @see list */
        fun list(
            params: EmailMessageListParams = EmailMessageListParams.none()
        ): CompletableFuture<HttpResponseFor<EmailMessageListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EmailMessageListPageAsync>> =
            list(EmailMessageListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /email_messages/{id}`, but is otherwise the same
         * as [EmailMessageServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, EmailMessageDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: EmailMessageDeleteParams = EmailMessageDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: EmailMessageDeleteParams = EmailMessageDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: EmailMessageDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: EmailMessageDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, EmailMessageDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /email_messages/batch`, but is otherwise the same
         * as [EmailMessageServiceAsync.batch].
         */
        fun batch(
            params: EmailMessageBatchParams
        ): CompletableFuture<HttpResponseFor<EmailMessageBatchResponse>> =
            batch(params, RequestOptions.none())

        /** @see batch */
        fun batch(
            params: EmailMessageBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailMessageBatchResponse>>

        /**
         * Returns a raw HTTP response for `delete /email_messages`, but is otherwise the same as
         * [EmailMessageServiceAsync.deleteAll].
         */
        fun deleteAll(params: EmailMessageDeleteAllParams): CompletableFuture<HttpResponse> =
            deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        fun deleteAll(
            params: EmailMessageDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `delete /email_messages/{email_id}/schedule`, but is
         * otherwise the same as [EmailMessageServiceAsync.deleteSchedule].
         */
        fun deleteSchedule(
            emailId: String
        ): CompletableFuture<HttpResponseFor<EmailMessageResponse>> =
            deleteSchedule(emailId, EmailMessageDeleteScheduleParams.none())

        /** @see deleteSchedule */
        fun deleteSchedule(
            emailId: String,
            params: EmailMessageDeleteScheduleParams = EmailMessageDeleteScheduleParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailMessageResponse>> =
            deleteSchedule(params.toBuilder().emailId(emailId).build(), requestOptions)

        /** @see deleteSchedule */
        fun deleteSchedule(
            emailId: String,
            params: EmailMessageDeleteScheduleParams = EmailMessageDeleteScheduleParams.none(),
        ): CompletableFuture<HttpResponseFor<EmailMessageResponse>> =
            deleteSchedule(emailId, params, RequestOptions.none())

        /** @see deleteSchedule */
        fun deleteSchedule(
            params: EmailMessageDeleteScheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailMessageResponse>>

        /** @see deleteSchedule */
        fun deleteSchedule(
            params: EmailMessageDeleteScheduleParams
        ): CompletableFuture<HttpResponseFor<EmailMessageResponse>> =
            deleteSchedule(params, RequestOptions.none())

        /** @see deleteSchedule */
        fun deleteSchedule(
            emailId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailMessageResponse>> =
            deleteSchedule(emailId, EmailMessageDeleteScheduleParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /email_messages/{email_id}/events`, but is otherwise
         * the same as [EmailMessageServiceAsync.retrieveEvents].
         */
        fun retrieveEvents(
            emailId: String
        ): CompletableFuture<HttpResponseFor<EmailMessageRetrieveEventsPageAsync>> =
            retrieveEvents(emailId, EmailMessageRetrieveEventsParams.none())

        /** @see retrieveEvents */
        fun retrieveEvents(
            emailId: String,
            params: EmailMessageRetrieveEventsParams = EmailMessageRetrieveEventsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailMessageRetrieveEventsPageAsync>> =
            retrieveEvents(params.toBuilder().emailId(emailId).build(), requestOptions)

        /** @see retrieveEvents */
        fun retrieveEvents(
            emailId: String,
            params: EmailMessageRetrieveEventsParams = EmailMessageRetrieveEventsParams.none(),
        ): CompletableFuture<HttpResponseFor<EmailMessageRetrieveEventsPageAsync>> =
            retrieveEvents(emailId, params, RequestOptions.none())

        /** @see retrieveEvents */
        fun retrieveEvents(
            params: EmailMessageRetrieveEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailMessageRetrieveEventsPageAsync>>

        /** @see retrieveEvents */
        fun retrieveEvents(
            params: EmailMessageRetrieveEventsParams
        ): CompletableFuture<HttpResponseFor<EmailMessageRetrieveEventsPageAsync>> =
            retrieveEvents(params, RequestOptions.none())

        /** @see retrieveEvents */
        fun retrieveEvents(
            emailId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailMessageRetrieveEventsPageAsync>> =
            retrieveEvents(emailId, EmailMessageRetrieveEventsParams.none(), requestOptions)
    }
}
