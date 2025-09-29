// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.messages.MessageCancelScheduledParams
import com.telnyx.api.models.messages.MessageCancelScheduledResponse
import com.telnyx.api.models.messages.MessageRetrieveParams
import com.telnyx.api.models.messages.MessageRetrieveResponse
import com.telnyx.api.models.messages.MessageScheduleParams
import com.telnyx.api.models.messages.MessageScheduleResponse
import com.telnyx.api.models.messages.MessageSendGroupMmsParams
import com.telnyx.api.models.messages.MessageSendGroupMmsResponse
import com.telnyx.api.models.messages.MessageSendLongCodeParams
import com.telnyx.api.models.messages.MessageSendLongCodeResponse
import com.telnyx.api.models.messages.MessageSendNumberPoolParams
import com.telnyx.api.models.messages.MessageSendNumberPoolResponse
import com.telnyx.api.models.messages.MessageSendParams
import com.telnyx.api.models.messages.MessageSendResponse
import com.telnyx.api.models.messages.MessageSendShortCodeParams
import com.telnyx.api.models.messages.MessageSendShortCodeResponse
import com.telnyx.api.services.async.messages.RcServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MessageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageServiceAsync

    fun rcs(): RcServiceAsync

    /**
     * Note: This API endpoint can only retrieve messages that are no older than 10 days since their
     * creation. If you require messages older than this, please generate an
     * [MDR report.](https://developers.telnyx.com/api/v1/mission-control/add-mdr-request)
     */
    fun retrieve(id: String): CompletableFuture<MessageRetrieveResponse> =
        retrieve(id, MessageRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MessageRetrieveParams = MessageRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MessageRetrieveParams = MessageRetrieveParams.none(),
    ): CompletableFuture<MessageRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MessageRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: MessageRetrieveParams): CompletableFuture<MessageRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageRetrieveResponse> =
        retrieve(id, MessageRetrieveParams.none(), requestOptions)

    /**
     * Cancel a scheduled message that has not yet been sent. Only messages with `status=scheduled`
     * and `send_at` more than a minute from now can be cancelled.
     */
    fun cancelScheduled(id: String): CompletableFuture<MessageCancelScheduledResponse> =
        cancelScheduled(id, MessageCancelScheduledParams.none())

    /** @see cancelScheduled */
    fun cancelScheduled(
        id: String,
        params: MessageCancelScheduledParams = MessageCancelScheduledParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageCancelScheduledResponse> =
        cancelScheduled(params.toBuilder().id(id).build(), requestOptions)

    /** @see cancelScheduled */
    fun cancelScheduled(
        id: String,
        params: MessageCancelScheduledParams = MessageCancelScheduledParams.none(),
    ): CompletableFuture<MessageCancelScheduledResponse> =
        cancelScheduled(id, params, RequestOptions.none())

    /** @see cancelScheduled */
    fun cancelScheduled(
        params: MessageCancelScheduledParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageCancelScheduledResponse>

    /** @see cancelScheduled */
    fun cancelScheduled(
        params: MessageCancelScheduledParams
    ): CompletableFuture<MessageCancelScheduledResponse> =
        cancelScheduled(params, RequestOptions.none())

    /** @see cancelScheduled */
    fun cancelScheduled(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageCancelScheduledResponse> =
        cancelScheduled(id, MessageCancelScheduledParams.none(), requestOptions)

    /**
     * Schedule a message with a Phone Number, Alphanumeric Sender ID, Short Code or Number Pool.
     *
     * This endpoint allows you to schedule a message with any messaging resource. Current messaging
     * resources include: long-code, short-code, number-pool, and alphanumeric-sender-id.
     */
    fun schedule(params: MessageScheduleParams): CompletableFuture<MessageScheduleResponse> =
        schedule(params, RequestOptions.none())

    /** @see schedule */
    fun schedule(
        params: MessageScheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageScheduleResponse>

    /**
     * Send a message with a Phone Number, Alphanumeric Sender ID, Short Code or Number Pool.
     *
     * This endpoint allows you to send a message with any messaging resource. Current messaging
     * resources include: long-code, short-code, number-pool, and alphanumeric-sender-id.
     */
    fun send(params: MessageSendParams): CompletableFuture<MessageSendResponse> =
        send(params, RequestOptions.none())

    /** @see send */
    fun send(
        params: MessageSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageSendResponse>

    /** Send a group MMS message */
    fun sendGroupMms(
        params: MessageSendGroupMmsParams
    ): CompletableFuture<MessageSendGroupMmsResponse> = sendGroupMms(params, RequestOptions.none())

    /** @see sendGroupMms */
    fun sendGroupMms(
        params: MessageSendGroupMmsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageSendGroupMmsResponse>

    /** Send a long code message */
    fun sendLongCode(
        params: MessageSendLongCodeParams
    ): CompletableFuture<MessageSendLongCodeResponse> = sendLongCode(params, RequestOptions.none())

    /** @see sendLongCode */
    fun sendLongCode(
        params: MessageSendLongCodeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageSendLongCodeResponse>

    /** Send a message using number pool */
    fun sendNumberPool(
        params: MessageSendNumberPoolParams
    ): CompletableFuture<MessageSendNumberPoolResponse> =
        sendNumberPool(params, RequestOptions.none())

    /** @see sendNumberPool */
    fun sendNumberPool(
        params: MessageSendNumberPoolParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageSendNumberPoolResponse>

    /** Send a short code message */
    fun sendShortCode(
        params: MessageSendShortCodeParams
    ): CompletableFuture<MessageSendShortCodeResponse> =
        sendShortCode(params, RequestOptions.none())

    /** @see sendShortCode */
    fun sendShortCode(
        params: MessageSendShortCodeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageSendShortCodeResponse>

    /**
     * A view of [MessageServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessageServiceAsync.WithRawResponse

        fun rcs(): RcServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /messages/{id}`, but is otherwise the same as
         * [MessageServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<MessageRetrieveResponse>> =
            retrieve(id, MessageRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: MessageRetrieveParams = MessageRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: MessageRetrieveParams = MessageRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<MessageRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: MessageRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: MessageRetrieveParams
        ): CompletableFuture<HttpResponseFor<MessageRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageRetrieveResponse>> =
            retrieve(id, MessageRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /messages/{id}`, but is otherwise the same as
         * [MessageServiceAsync.cancelScheduled].
         */
        fun cancelScheduled(
            id: String
        ): CompletableFuture<HttpResponseFor<MessageCancelScheduledResponse>> =
            cancelScheduled(id, MessageCancelScheduledParams.none())

        /** @see cancelScheduled */
        fun cancelScheduled(
            id: String,
            params: MessageCancelScheduledParams = MessageCancelScheduledParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageCancelScheduledResponse>> =
            cancelScheduled(params.toBuilder().id(id).build(), requestOptions)

        /** @see cancelScheduled */
        fun cancelScheduled(
            id: String,
            params: MessageCancelScheduledParams = MessageCancelScheduledParams.none(),
        ): CompletableFuture<HttpResponseFor<MessageCancelScheduledResponse>> =
            cancelScheduled(id, params, RequestOptions.none())

        /** @see cancelScheduled */
        fun cancelScheduled(
            params: MessageCancelScheduledParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageCancelScheduledResponse>>

        /** @see cancelScheduled */
        fun cancelScheduled(
            params: MessageCancelScheduledParams
        ): CompletableFuture<HttpResponseFor<MessageCancelScheduledResponse>> =
            cancelScheduled(params, RequestOptions.none())

        /** @see cancelScheduled */
        fun cancelScheduled(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageCancelScheduledResponse>> =
            cancelScheduled(id, MessageCancelScheduledParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /messages/schedule`, but is otherwise the same as
         * [MessageServiceAsync.schedule].
         */
        fun schedule(
            params: MessageScheduleParams
        ): CompletableFuture<HttpResponseFor<MessageScheduleResponse>> =
            schedule(params, RequestOptions.none())

        /** @see schedule */
        fun schedule(
            params: MessageScheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageScheduleResponse>>

        /**
         * Returns a raw HTTP response for `post /messages`, but is otherwise the same as
         * [MessageServiceAsync.send].
         */
        fun send(
            params: MessageSendParams
        ): CompletableFuture<HttpResponseFor<MessageSendResponse>> =
            send(params, RequestOptions.none())

        /** @see send */
        fun send(
            params: MessageSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageSendResponse>>

        /**
         * Returns a raw HTTP response for `post /messages/group_mms`, but is otherwise the same as
         * [MessageServiceAsync.sendGroupMms].
         */
        fun sendGroupMms(
            params: MessageSendGroupMmsParams
        ): CompletableFuture<HttpResponseFor<MessageSendGroupMmsResponse>> =
            sendGroupMms(params, RequestOptions.none())

        /** @see sendGroupMms */
        fun sendGroupMms(
            params: MessageSendGroupMmsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageSendGroupMmsResponse>>

        /**
         * Returns a raw HTTP response for `post /messages/long_code`, but is otherwise the same as
         * [MessageServiceAsync.sendLongCode].
         */
        fun sendLongCode(
            params: MessageSendLongCodeParams
        ): CompletableFuture<HttpResponseFor<MessageSendLongCodeResponse>> =
            sendLongCode(params, RequestOptions.none())

        /** @see sendLongCode */
        fun sendLongCode(
            params: MessageSendLongCodeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageSendLongCodeResponse>>

        /**
         * Returns a raw HTTP response for `post /messages/number_pool`, but is otherwise the same
         * as [MessageServiceAsync.sendNumberPool].
         */
        fun sendNumberPool(
            params: MessageSendNumberPoolParams
        ): CompletableFuture<HttpResponseFor<MessageSendNumberPoolResponse>> =
            sendNumberPool(params, RequestOptions.none())

        /** @see sendNumberPool */
        fun sendNumberPool(
            params: MessageSendNumberPoolParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageSendNumberPoolResponse>>

        /**
         * Returns a raw HTTP response for `post /messages/short_code`, but is otherwise the same as
         * [MessageServiceAsync.sendShortCode].
         */
        fun sendShortCode(
            params: MessageSendShortCodeParams
        ): CompletableFuture<HttpResponseFor<MessageSendShortCodeResponse>> =
            sendShortCode(params, RequestOptions.none())

        /** @see sendShortCode */
        fun sendShortCode(
            params: MessageSendShortCodeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageSendShortCodeResponse>>
    }
}
