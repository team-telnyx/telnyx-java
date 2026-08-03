// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import com.telnyx.sdk.models.emailmessages.EmailMessageListParams
import com.telnyx.sdk.models.emailmessages.EmailMessageListResponse
import com.telnyx.sdk.models.emailmessages.EmailMessageRetrieveEventsParams
import com.telnyx.sdk.models.emailmessages.EmailMessageRetrieveEventsResponse
import com.telnyx.sdk.models.emailmessages.EmailMessageRetrieveParams
import com.telnyx.sdk.models.emailmessages.EmailMessageRetrieveResponse
import com.telnyx.sdk.services.blocking.emailmessages.RecipientService
import java.util.function.Consumer

/** Send and manage email messages. Legacy `/v2/emails` routes are aliases for these endpoints. */
interface EmailMessageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailMessageService

    /**
     * Send and manage email messages. Legacy `/v2/emails` routes are aliases for these endpoints.
     */
    fun recipients(): RecipientService

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
    fun create(params: EmailMessageCreateParams): EmailMessageResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EmailMessageCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailMessageResponse

    /** The legacy `/v2/emails/{id}` GET route is a backward-compatible alias for this operation. */
    fun retrieve(id: String): EmailMessageRetrieveResponse =
        retrieve(id, EmailMessageRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EmailMessageRetrieveParams = EmailMessageRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailMessageRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EmailMessageRetrieveParams = EmailMessageRetrieveParams.none(),
    ): EmailMessageRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EmailMessageRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailMessageRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: EmailMessageRetrieveParams): EmailMessageRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): EmailMessageRetrieveResponse =
        retrieve(id, EmailMessageRetrieveParams.none(), requestOptions)

    /**
     * Lists messages sorted newest first by `created_at desc, id desc`. No filters other than
     * cursor pagination are implemented. The legacy `/v2/emails` GET route is a backward-compatible
     * alias for this operation.
     */
    fun list(): EmailMessageListResponse = list(EmailMessageListParams.none())

    /** @see list */
    fun list(
        params: EmailMessageListParams = EmailMessageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailMessageListResponse

    /** @see list */
    fun list(
        params: EmailMessageListParams = EmailMessageListParams.none()
    ): EmailMessageListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): EmailMessageListResponse =
        list(EmailMessageListParams.none(), requestOptions)

    /**
     * Permanently deletes an account-scoped email message, its events, its durable recipients, and
     * unshared attachment objects. Returns 404 when the message does not exist in the authenticated
     * account. The legacy `/v2/emails/{id}` DELETE route is a backward-compatible alias.
     */
    fun delete(id: String) = delete(id, EmailMessageDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: EmailMessageDeleteParams = EmailMessageDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: EmailMessageDeleteParams = EmailMessageDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EmailMessageDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: EmailMessageDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, EmailMessageDeleteParams.none(), requestOptions)

    /** Creates up to 50 email messages in a single request. */
    fun batch(params: EmailMessageBatchParams): EmailMessageBatchResponse =
        batch(params, RequestOptions.none())

    /** @see batch */
    fun batch(
        params: EmailMessageBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailMessageBatchResponse

    /**
     * Permanently deletes every email in the authenticated account sent from or to the supplied
     * address, including retained events whose parent message has expired. Events and durable
     * recipients are deleted immediately with each message. The operation never searches or reports
     * matches in another account. The legacy `/v2/emails` DELETE route is a backward-compatible
     * alias.
     */
    fun deleteAll(params: EmailMessageDeleteAllParams) = deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        params: EmailMessageDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Cancels a scheduled email and returns it with status `cancelled`. The legacy
     * `/v2/emails/{id}/schedule` DELETE route is an alias.
     */
    fun deleteSchedule(emailId: String): EmailMessageResponse =
        deleteSchedule(emailId, EmailMessageDeleteScheduleParams.none())

    /** @see deleteSchedule */
    fun deleteSchedule(
        emailId: String,
        params: EmailMessageDeleteScheduleParams = EmailMessageDeleteScheduleParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailMessageResponse =
        deleteSchedule(params.toBuilder().emailId(emailId).build(), requestOptions)

    /** @see deleteSchedule */
    fun deleteSchedule(
        emailId: String,
        params: EmailMessageDeleteScheduleParams = EmailMessageDeleteScheduleParams.none(),
    ): EmailMessageResponse = deleteSchedule(emailId, params, RequestOptions.none())

    /** @see deleteSchedule */
    fun deleteSchedule(
        params: EmailMessageDeleteScheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailMessageResponse

    /** @see deleteSchedule */
    fun deleteSchedule(params: EmailMessageDeleteScheduleParams): EmailMessageResponse =
        deleteSchedule(params, RequestOptions.none())

    /** @see deleteSchedule */
    fun deleteSchedule(emailId: String, requestOptions: RequestOptions): EmailMessageResponse =
        deleteSchedule(emailId, EmailMessageDeleteScheduleParams.none(), requestOptions)

    /**
     * Lists events for a single message sorted oldest first by `occurred_at asc, id asc`. The
     * legacy `/v2/emails/{id}/events` GET route is a backward-compatible alias.
     */
    fun retrieveEvents(emailId: String): EmailMessageRetrieveEventsResponse =
        retrieveEvents(emailId, EmailMessageRetrieveEventsParams.none())

    /** @see retrieveEvents */
    fun retrieveEvents(
        emailId: String,
        params: EmailMessageRetrieveEventsParams = EmailMessageRetrieveEventsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailMessageRetrieveEventsResponse =
        retrieveEvents(params.toBuilder().emailId(emailId).build(), requestOptions)

    /** @see retrieveEvents */
    fun retrieveEvents(
        emailId: String,
        params: EmailMessageRetrieveEventsParams = EmailMessageRetrieveEventsParams.none(),
    ): EmailMessageRetrieveEventsResponse = retrieveEvents(emailId, params, RequestOptions.none())

    /** @see retrieveEvents */
    fun retrieveEvents(
        params: EmailMessageRetrieveEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailMessageRetrieveEventsResponse

    /** @see retrieveEvents */
    fun retrieveEvents(
        params: EmailMessageRetrieveEventsParams
    ): EmailMessageRetrieveEventsResponse = retrieveEvents(params, RequestOptions.none())

    /** @see retrieveEvents */
    fun retrieveEvents(
        emailId: String,
        requestOptions: RequestOptions,
    ): EmailMessageRetrieveEventsResponse =
        retrieveEvents(emailId, EmailMessageRetrieveEventsParams.none(), requestOptions)

    /**
     * A view of [EmailMessageService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailMessageService.WithRawResponse

        /**
         * Send and manage email messages. Legacy `/v2/emails` routes are aliases for these
         * endpoints.
         */
        fun recipients(): RecipientService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /email_messages`, but is otherwise the same as
         * [EmailMessageService.create].
         */
        @MustBeClosed
        fun create(params: EmailMessageCreateParams): HttpResponseFor<EmailMessageResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: EmailMessageCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailMessageResponse>

        /**
         * Returns a raw HTTP response for `get /email_messages/{id}`, but is otherwise the same as
         * [EmailMessageService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<EmailMessageRetrieveResponse> =
            retrieve(id, EmailMessageRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EmailMessageRetrieveParams = EmailMessageRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailMessageRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EmailMessageRetrieveParams = EmailMessageRetrieveParams.none(),
        ): HttpResponseFor<EmailMessageRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EmailMessageRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailMessageRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EmailMessageRetrieveParams
        ): HttpResponseFor<EmailMessageRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailMessageRetrieveResponse> =
            retrieve(id, EmailMessageRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /email_messages`, but is otherwise the same as
         * [EmailMessageService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<EmailMessageListResponse> = list(EmailMessageListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EmailMessageListParams = EmailMessageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailMessageListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: EmailMessageListParams = EmailMessageListParams.none()
        ): HttpResponseFor<EmailMessageListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EmailMessageListResponse> =
            list(EmailMessageListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /email_messages/{id}`, but is otherwise the same
         * as [EmailMessageService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, EmailMessageDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: EmailMessageDeleteParams = EmailMessageDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: EmailMessageDeleteParams = EmailMessageDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: EmailMessageDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: EmailMessageDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, EmailMessageDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /email_messages/batch`, but is otherwise the same
         * as [EmailMessageService.batch].
         */
        @MustBeClosed
        fun batch(params: EmailMessageBatchParams): HttpResponseFor<EmailMessageBatchResponse> =
            batch(params, RequestOptions.none())

        /** @see batch */
        @MustBeClosed
        fun batch(
            params: EmailMessageBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailMessageBatchResponse>

        /**
         * Returns a raw HTTP response for `delete /email_messages`, but is otherwise the same as
         * [EmailMessageService.deleteAll].
         */
        @MustBeClosed
        fun deleteAll(params: EmailMessageDeleteAllParams): HttpResponse =
            deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            params: EmailMessageDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete /email_messages/{email_id}/schedule`, but is
         * otherwise the same as [EmailMessageService.deleteSchedule].
         */
        @MustBeClosed
        fun deleteSchedule(emailId: String): HttpResponseFor<EmailMessageResponse> =
            deleteSchedule(emailId, EmailMessageDeleteScheduleParams.none())

        /** @see deleteSchedule */
        @MustBeClosed
        fun deleteSchedule(
            emailId: String,
            params: EmailMessageDeleteScheduleParams = EmailMessageDeleteScheduleParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailMessageResponse> =
            deleteSchedule(params.toBuilder().emailId(emailId).build(), requestOptions)

        /** @see deleteSchedule */
        @MustBeClosed
        fun deleteSchedule(
            emailId: String,
            params: EmailMessageDeleteScheduleParams = EmailMessageDeleteScheduleParams.none(),
        ): HttpResponseFor<EmailMessageResponse> =
            deleteSchedule(emailId, params, RequestOptions.none())

        /** @see deleteSchedule */
        @MustBeClosed
        fun deleteSchedule(
            params: EmailMessageDeleteScheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailMessageResponse>

        /** @see deleteSchedule */
        @MustBeClosed
        fun deleteSchedule(
            params: EmailMessageDeleteScheduleParams
        ): HttpResponseFor<EmailMessageResponse> = deleteSchedule(params, RequestOptions.none())

        /** @see deleteSchedule */
        @MustBeClosed
        fun deleteSchedule(
            emailId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailMessageResponse> =
            deleteSchedule(emailId, EmailMessageDeleteScheduleParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /email_messages/{email_id}/events`, but is otherwise
         * the same as [EmailMessageService.retrieveEvents].
         */
        @MustBeClosed
        fun retrieveEvents(emailId: String): HttpResponseFor<EmailMessageRetrieveEventsResponse> =
            retrieveEvents(emailId, EmailMessageRetrieveEventsParams.none())

        /** @see retrieveEvents */
        @MustBeClosed
        fun retrieveEvents(
            emailId: String,
            params: EmailMessageRetrieveEventsParams = EmailMessageRetrieveEventsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailMessageRetrieveEventsResponse> =
            retrieveEvents(params.toBuilder().emailId(emailId).build(), requestOptions)

        /** @see retrieveEvents */
        @MustBeClosed
        fun retrieveEvents(
            emailId: String,
            params: EmailMessageRetrieveEventsParams = EmailMessageRetrieveEventsParams.none(),
        ): HttpResponseFor<EmailMessageRetrieveEventsResponse> =
            retrieveEvents(emailId, params, RequestOptions.none())

        /** @see retrieveEvents */
        @MustBeClosed
        fun retrieveEvents(
            params: EmailMessageRetrieveEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailMessageRetrieveEventsResponse>

        /** @see retrieveEvents */
        @MustBeClosed
        fun retrieveEvents(
            params: EmailMessageRetrieveEventsParams
        ): HttpResponseFor<EmailMessageRetrieveEventsResponse> =
            retrieveEvents(params, RequestOptions.none())

        /** @see retrieveEvents */
        @MustBeClosed
        fun retrieveEvents(
            emailId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailMessageRetrieveEventsResponse> =
            retrieveEvents(emailId, EmailMessageRetrieveEventsParams.none(), requestOptions)
    }
}
