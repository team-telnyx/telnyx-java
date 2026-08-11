// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messages.MessageCancelScheduledParams
import com.telnyx.sdk.models.messages.MessageCancelScheduledResponse
import com.telnyx.sdk.models.messages.MessageRetrieveGroupMessagesParams
import com.telnyx.sdk.models.messages.MessageRetrieveGroupMessagesResponse
import com.telnyx.sdk.models.messages.MessageRetrieveParams
import com.telnyx.sdk.models.messages.MessageRetrieveResponse
import com.telnyx.sdk.models.messages.MessageScheduleParams
import com.telnyx.sdk.models.messages.MessageScheduleResponse
import com.telnyx.sdk.models.messages.MessageSendGroupMmsParams
import com.telnyx.sdk.models.messages.MessageSendGroupMmsResponse
import com.telnyx.sdk.models.messages.MessageSendLongCodeParams
import com.telnyx.sdk.models.messages.MessageSendLongCodeResponse
import com.telnyx.sdk.models.messages.MessageSendNumberPoolParams
import com.telnyx.sdk.models.messages.MessageSendNumberPoolResponse
import com.telnyx.sdk.models.messages.MessageSendParams
import com.telnyx.sdk.models.messages.MessageSendResponse
import com.telnyx.sdk.models.messages.MessageSendShortCodeParams
import com.telnyx.sdk.models.messages.MessageSendShortCodeResponse
import com.telnyx.sdk.models.messages.MessageSendWithAlphanumericSenderParams
import com.telnyx.sdk.models.messages.MessageSendWithAlphanumericSenderResponse
import com.telnyx.sdk.models.messages.MessageWhatsappParams
import com.telnyx.sdk.models.messages.MessageWhatsappResponse
import com.telnyx.sdk.services.blocking.messages.RcService
import java.util.function.Consumer

interface MessageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageService

    /** Send RCS messages */
    fun rcs(): RcService

    /**
     * Note: This API endpoint can only retrieve messages that are no older than 10 days since their
     * creation. If you require messages older than this, please generate an
     * [MDR report.](https://developers.telnyx.com/api-reference/mdr-usage-reports/create-mdr-usage-report)
     */
    fun retrieve(id: String): MessageRetrieveResponse = retrieve(id, MessageRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MessageRetrieveParams = MessageRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MessageRetrieveParams = MessageRetrieveParams.none(),
    ): MessageRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MessageRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: MessageRetrieveParams): MessageRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): MessageRetrieveResponse =
        retrieve(id, MessageRetrieveParams.none(), requestOptions)

    /**
     * Cancel a scheduled message that has not yet been sent. Only messages with `status=scheduled`
     * and `send_at` more than a minute from now can be cancelled.
     */
    fun cancelScheduled(id: String): MessageCancelScheduledResponse =
        cancelScheduled(id, MessageCancelScheduledParams.none())

    /** @see cancelScheduled */
    fun cancelScheduled(
        id: String,
        params: MessageCancelScheduledParams = MessageCancelScheduledParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageCancelScheduledResponse =
        cancelScheduled(params.toBuilder().id(id).build(), requestOptions)

    /** @see cancelScheduled */
    fun cancelScheduled(
        id: String,
        params: MessageCancelScheduledParams = MessageCancelScheduledParams.none(),
    ): MessageCancelScheduledResponse = cancelScheduled(id, params, RequestOptions.none())

    /** @see cancelScheduled */
    fun cancelScheduled(
        params: MessageCancelScheduledParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageCancelScheduledResponse

    /** @see cancelScheduled */
    fun cancelScheduled(params: MessageCancelScheduledParams): MessageCancelScheduledResponse =
        cancelScheduled(params, RequestOptions.none())

    /** @see cancelScheduled */
    fun cancelScheduled(
        id: String,
        requestOptions: RequestOptions,
    ): MessageCancelScheduledResponse =
        cancelScheduled(id, MessageCancelScheduledParams.none(), requestOptions)

    /** Retrieve all messages in a group MMS conversation by the group message ID. */
    fun retrieveGroupMessages(messageId: String): MessageRetrieveGroupMessagesResponse =
        retrieveGroupMessages(messageId, MessageRetrieveGroupMessagesParams.none())

    /** @see retrieveGroupMessages */
    fun retrieveGroupMessages(
        messageId: String,
        params: MessageRetrieveGroupMessagesParams = MessageRetrieveGroupMessagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageRetrieveGroupMessagesResponse =
        retrieveGroupMessages(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see retrieveGroupMessages */
    fun retrieveGroupMessages(
        messageId: String,
        params: MessageRetrieveGroupMessagesParams = MessageRetrieveGroupMessagesParams.none(),
    ): MessageRetrieveGroupMessagesResponse =
        retrieveGroupMessages(messageId, params, RequestOptions.none())

    /** @see retrieveGroupMessages */
    fun retrieveGroupMessages(
        params: MessageRetrieveGroupMessagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageRetrieveGroupMessagesResponse

    /** @see retrieveGroupMessages */
    fun retrieveGroupMessages(
        params: MessageRetrieveGroupMessagesParams
    ): MessageRetrieveGroupMessagesResponse = retrieveGroupMessages(params, RequestOptions.none())

    /** @see retrieveGroupMessages */
    fun retrieveGroupMessages(
        messageId: String,
        requestOptions: RequestOptions,
    ): MessageRetrieveGroupMessagesResponse =
        retrieveGroupMessages(messageId, MessageRetrieveGroupMessagesParams.none(), requestOptions)

    /**
     * Schedule a message with a Phone Number, Alphanumeric Sender ID, Short Code or Number Pool.
     *
     * This endpoint allows you to schedule a message with any messaging resource. Current messaging
     * resources include: long-code, short-code, number-pool, and alphanumeric-sender-id.
     */
    fun schedule(params: MessageScheduleParams): MessageScheduleResponse =
        schedule(params, RequestOptions.none())

    /** @see schedule */
    fun schedule(
        params: MessageScheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageScheduleResponse

    /**
     * Send a message with a Phone Number, Alphanumeric Sender ID, Short Code or Number Pool.
     *
     * This endpoint allows you to send a message with any messaging resource. Current messaging
     * resources include: long-code, short-code, number-pool, and alphanumeric-sender-id.
     */
    fun send(params: MessageSendParams): MessageSendResponse = send(params, RequestOptions.none())

    /** @see send */
    fun send(
        params: MessageSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageSendResponse

    /**
     * Queues an MMS addressed to multiple recipients as a group conversation. Delivery events are
     * reported asynchronously through messaging webhooks.
     */
    fun sendGroupMms(params: MessageSendGroupMmsParams): MessageSendGroupMmsResponse =
        sendGroupMms(params, RequestOptions.none())

    /** @see sendGroupMms */
    fun sendGroupMms(
        params: MessageSendGroupMmsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageSendGroupMmsResponse

    /**
     * Queues an outbound SMS or MMS using a long-code sender. Delivery progress and final
     * disposition are reported asynchronously through messaging webhooks.
     */
    fun sendLongCode(params: MessageSendLongCodeParams): MessageSendLongCodeResponse =
        sendLongCode(params, RequestOptions.none())

    /** @see sendLongCode */
    fun sendLongCode(
        params: MessageSendLongCodeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageSendLongCodeResponse

    /**
     * Queues an outbound message using a number pool. Telnyx selects an eligible sender from the
     * pool according to its messaging profile configuration.
     */
    fun sendNumberPool(params: MessageSendNumberPoolParams): MessageSendNumberPoolResponse =
        sendNumberPool(params, RequestOptions.none())

    /** @see sendNumberPool */
    fun sendNumberPool(
        params: MessageSendNumberPoolParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageSendNumberPoolResponse

    /**
     * Queues an outbound SMS or MMS using a short-code sender. Delivery progress and final
     * disposition are reported asynchronously through messaging webhooks.
     */
    fun sendShortCode(params: MessageSendShortCodeParams): MessageSendShortCodeResponse =
        sendShortCode(params, RequestOptions.none())

    /** @see sendShortCode */
    fun sendShortCode(
        params: MessageSendShortCodeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageSendShortCodeResponse

    /** Send an SMS message using an alphanumeric sender ID. This is SMS only. */
    fun sendWithAlphanumericSender(
        params: MessageSendWithAlphanumericSenderParams
    ): MessageSendWithAlphanumericSenderResponse =
        sendWithAlphanumericSender(params, RequestOptions.none())

    /** @see sendWithAlphanumericSender */
    fun sendWithAlphanumericSender(
        params: MessageSendWithAlphanumericSenderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageSendWithAlphanumericSenderResponse

    /**
     * Sends a WhatsApp message using a Telnyx WhatsApp-enabled number. The message body,
     * interactive elements, media, location, and reaction content are specified in the
     * `whatsapp_message` field. Delivery progress and final disposition are reported asynchronously
     * through messaging webhooks.
     */
    fun whatsapp(params: MessageWhatsappParams): MessageWhatsappResponse =
        whatsapp(params, RequestOptions.none())

    /** @see whatsapp */
    fun whatsapp(
        params: MessageWhatsappParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageWhatsappResponse

    /** A view of [MessageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageService.WithRawResponse

        /** Send RCS messages */
        fun rcs(): RcService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /messages/{id}`, but is otherwise the same as
         * [MessageService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<MessageRetrieveResponse> =
            retrieve(id, MessageRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: MessageRetrieveParams = MessageRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: MessageRetrieveParams = MessageRetrieveParams.none(),
        ): HttpResponseFor<MessageRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MessageRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: MessageRetrieveParams): HttpResponseFor<MessageRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageRetrieveResponse> =
            retrieve(id, MessageRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /messages/{id}`, but is otherwise the same as
         * [MessageService.cancelScheduled].
         */
        @MustBeClosed
        fun cancelScheduled(id: String): HttpResponseFor<MessageCancelScheduledResponse> =
            cancelScheduled(id, MessageCancelScheduledParams.none())

        /** @see cancelScheduled */
        @MustBeClosed
        fun cancelScheduled(
            id: String,
            params: MessageCancelScheduledParams = MessageCancelScheduledParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageCancelScheduledResponse> =
            cancelScheduled(params.toBuilder().id(id).build(), requestOptions)

        /** @see cancelScheduled */
        @MustBeClosed
        fun cancelScheduled(
            id: String,
            params: MessageCancelScheduledParams = MessageCancelScheduledParams.none(),
        ): HttpResponseFor<MessageCancelScheduledResponse> =
            cancelScheduled(id, params, RequestOptions.none())

        /** @see cancelScheduled */
        @MustBeClosed
        fun cancelScheduled(
            params: MessageCancelScheduledParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageCancelScheduledResponse>

        /** @see cancelScheduled */
        @MustBeClosed
        fun cancelScheduled(
            params: MessageCancelScheduledParams
        ): HttpResponseFor<MessageCancelScheduledResponse> =
            cancelScheduled(params, RequestOptions.none())

        /** @see cancelScheduled */
        @MustBeClosed
        fun cancelScheduled(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageCancelScheduledResponse> =
            cancelScheduled(id, MessageCancelScheduledParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /messages/group/{message_id}`, but is otherwise the
         * same as [MessageService.retrieveGroupMessages].
         */
        @MustBeClosed
        fun retrieveGroupMessages(
            messageId: String
        ): HttpResponseFor<MessageRetrieveGroupMessagesResponse> =
            retrieveGroupMessages(messageId, MessageRetrieveGroupMessagesParams.none())

        /** @see retrieveGroupMessages */
        @MustBeClosed
        fun retrieveGroupMessages(
            messageId: String,
            params: MessageRetrieveGroupMessagesParams = MessageRetrieveGroupMessagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageRetrieveGroupMessagesResponse> =
            retrieveGroupMessages(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see retrieveGroupMessages */
        @MustBeClosed
        fun retrieveGroupMessages(
            messageId: String,
            params: MessageRetrieveGroupMessagesParams = MessageRetrieveGroupMessagesParams.none(),
        ): HttpResponseFor<MessageRetrieveGroupMessagesResponse> =
            retrieveGroupMessages(messageId, params, RequestOptions.none())

        /** @see retrieveGroupMessages */
        @MustBeClosed
        fun retrieveGroupMessages(
            params: MessageRetrieveGroupMessagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageRetrieveGroupMessagesResponse>

        /** @see retrieveGroupMessages */
        @MustBeClosed
        fun retrieveGroupMessages(
            params: MessageRetrieveGroupMessagesParams
        ): HttpResponseFor<MessageRetrieveGroupMessagesResponse> =
            retrieveGroupMessages(params, RequestOptions.none())

        /** @see retrieveGroupMessages */
        @MustBeClosed
        fun retrieveGroupMessages(
            messageId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageRetrieveGroupMessagesResponse> =
            retrieveGroupMessages(
                messageId,
                MessageRetrieveGroupMessagesParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /messages/schedule`, but is otherwise the same as
         * [MessageService.schedule].
         */
        @MustBeClosed
        fun schedule(params: MessageScheduleParams): HttpResponseFor<MessageScheduleResponse> =
            schedule(params, RequestOptions.none())

        /** @see schedule */
        @MustBeClosed
        fun schedule(
            params: MessageScheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageScheduleResponse>

        /**
         * Returns a raw HTTP response for `post /messages`, but is otherwise the same as
         * [MessageService.send].
         */
        @MustBeClosed
        fun send(params: MessageSendParams): HttpResponseFor<MessageSendResponse> =
            send(params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(
            params: MessageSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageSendResponse>

        /**
         * Returns a raw HTTP response for `post /messages/group_mms`, but is otherwise the same as
         * [MessageService.sendGroupMms].
         */
        @MustBeClosed
        fun sendGroupMms(
            params: MessageSendGroupMmsParams
        ): HttpResponseFor<MessageSendGroupMmsResponse> =
            sendGroupMms(params, RequestOptions.none())

        /** @see sendGroupMms */
        @MustBeClosed
        fun sendGroupMms(
            params: MessageSendGroupMmsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageSendGroupMmsResponse>

        /**
         * Returns a raw HTTP response for `post /messages/long_code`, but is otherwise the same as
         * [MessageService.sendLongCode].
         */
        @MustBeClosed
        fun sendLongCode(
            params: MessageSendLongCodeParams
        ): HttpResponseFor<MessageSendLongCodeResponse> =
            sendLongCode(params, RequestOptions.none())

        /** @see sendLongCode */
        @MustBeClosed
        fun sendLongCode(
            params: MessageSendLongCodeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageSendLongCodeResponse>

        /**
         * Returns a raw HTTP response for `post /messages/number_pool`, but is otherwise the same
         * as [MessageService.sendNumberPool].
         */
        @MustBeClosed
        fun sendNumberPool(
            params: MessageSendNumberPoolParams
        ): HttpResponseFor<MessageSendNumberPoolResponse> =
            sendNumberPool(params, RequestOptions.none())

        /** @see sendNumberPool */
        @MustBeClosed
        fun sendNumberPool(
            params: MessageSendNumberPoolParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageSendNumberPoolResponse>

        /**
         * Returns a raw HTTP response for `post /messages/short_code`, but is otherwise the same as
         * [MessageService.sendShortCode].
         */
        @MustBeClosed
        fun sendShortCode(
            params: MessageSendShortCodeParams
        ): HttpResponseFor<MessageSendShortCodeResponse> =
            sendShortCode(params, RequestOptions.none())

        /** @see sendShortCode */
        @MustBeClosed
        fun sendShortCode(
            params: MessageSendShortCodeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageSendShortCodeResponse>

        /**
         * Returns a raw HTTP response for `post /messages/alphanumeric_sender_id`, but is otherwise
         * the same as [MessageService.sendWithAlphanumericSender].
         */
        @MustBeClosed
        fun sendWithAlphanumericSender(
            params: MessageSendWithAlphanumericSenderParams
        ): HttpResponseFor<MessageSendWithAlphanumericSenderResponse> =
            sendWithAlphanumericSender(params, RequestOptions.none())

        /** @see sendWithAlphanumericSender */
        @MustBeClosed
        fun sendWithAlphanumericSender(
            params: MessageSendWithAlphanumericSenderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageSendWithAlphanumericSenderResponse>

        /**
         * Returns a raw HTTP response for `post /messages/whatsapp`, but is otherwise the same as
         * [MessageService.whatsapp].
         */
        @MustBeClosed
        fun whatsapp(params: MessageWhatsappParams): HttpResponseFor<MessageWhatsappResponse> =
            whatsapp(params, RequestOptions.none())

        /** @see whatsapp */
        @MustBeClosed
        fun whatsapp(
            params: MessageWhatsappParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageWhatsappResponse>
    }
}
