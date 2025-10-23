// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messages.MessageCancelScheduledParams
import com.telnyx.sdk.models.messages.MessageCancelScheduledResponse
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

    fun rcs(): RcService

    /**
     * Note: This API endpoint can only retrieve messages that are no older than 10 days since their
     * creation. If you require messages older than this, please generate an
     * [MDR report.](https://developers.telnyx.com/api/v1/mission-control/add-mdr-request)
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

    /** Send a group MMS message */
    fun sendGroupMms(params: MessageSendGroupMmsParams): MessageSendGroupMmsResponse =
        sendGroupMms(params, RequestOptions.none())

    /** @see sendGroupMms */
    fun sendGroupMms(
        params: MessageSendGroupMmsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageSendGroupMmsResponse

    /** Send a long code message */
    fun sendLongCode(params: MessageSendLongCodeParams): MessageSendLongCodeResponse =
        sendLongCode(params, RequestOptions.none())

    /** @see sendLongCode */
    fun sendLongCode(
        params: MessageSendLongCodeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageSendLongCodeResponse

    /** Send a message using number pool */
    fun sendNumberPool(params: MessageSendNumberPoolParams): MessageSendNumberPoolResponse =
        sendNumberPool(params, RequestOptions.none())

    /** @see sendNumberPool */
    fun sendNumberPool(
        params: MessageSendNumberPoolParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageSendNumberPoolResponse

    /** Send a short code message */
    fun sendShortCode(params: MessageSendShortCodeParams): MessageSendShortCodeResponse =
        sendShortCode(params, RequestOptions.none())

    /** @see sendShortCode */
    fun sendShortCode(
        params: MessageSendShortCodeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageSendShortCodeResponse

    /** A view of [MessageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageService.WithRawResponse

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
    }
}
