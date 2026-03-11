// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateCreateParams
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateCreateResponse
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateListPageAsync
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage Whatsapp message templates */
interface MessageTemplateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageTemplateServiceAsync

    /** Create a Whatsapp message template */
    fun create(
        params: MessageTemplateCreateParams
    ): CompletableFuture<MessageTemplateCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MessageTemplateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageTemplateCreateResponse>

    /** List Whatsapp message templates */
    fun list(): CompletableFuture<MessageTemplateListPageAsync> =
        list(MessageTemplateListParams.none())

    /** @see list */
    fun list(
        params: MessageTemplateListParams = MessageTemplateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageTemplateListPageAsync>

    /** @see list */
    fun list(
        params: MessageTemplateListParams = MessageTemplateListParams.none()
    ): CompletableFuture<MessageTemplateListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MessageTemplateListPageAsync> =
        list(MessageTemplateListParams.none(), requestOptions)

    /**
     * A view of [MessageTemplateServiceAsync] that provides access to raw HTTP responses for each
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
        ): MessageTemplateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/whatsapp/message_templates`, but is otherwise
         * the same as [MessageTemplateServiceAsync.create].
         */
        fun create(
            params: MessageTemplateCreateParams
        ): CompletableFuture<HttpResponseFor<MessageTemplateCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: MessageTemplateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageTemplateCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v2/whatsapp/message_templates`, but is otherwise
         * the same as [MessageTemplateServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MessageTemplateListPageAsync>> =
            list(MessageTemplateListParams.none())

        /** @see list */
        fun list(
            params: MessageTemplateListParams = MessageTemplateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageTemplateListPageAsync>>

        /** @see list */
        fun list(
            params: MessageTemplateListParams = MessageTemplateListParams.none()
        ): CompletableFuture<HttpResponseFor<MessageTemplateListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MessageTemplateListPageAsync>> =
            list(MessageTemplateListParams.none(), requestOptions)
    }
}
