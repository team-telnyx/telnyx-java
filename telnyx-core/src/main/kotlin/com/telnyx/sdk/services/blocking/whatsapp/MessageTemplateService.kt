// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateCreateParams
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateCreateResponse
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateListPage
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateListParams
import java.util.function.Consumer

/** Manage Whatsapp message templates */
interface MessageTemplateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageTemplateService

    /** Create a Whatsapp message template */
    fun create(params: MessageTemplateCreateParams): MessageTemplateCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MessageTemplateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageTemplateCreateResponse

    /** List Whatsapp message templates */
    fun list(): MessageTemplateListPage = list(MessageTemplateListParams.none())

    /** @see list */
    fun list(
        params: MessageTemplateListParams = MessageTemplateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageTemplateListPage

    /** @see list */
    fun list(
        params: MessageTemplateListParams = MessageTemplateListParams.none()
    ): MessageTemplateListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MessageTemplateListPage =
        list(MessageTemplateListParams.none(), requestOptions)

    /**
     * A view of [MessageTemplateService] that provides access to raw HTTP responses for each
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
        ): MessageTemplateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/whatsapp/message_templates`, but is otherwise
         * the same as [MessageTemplateService.create].
         */
        @MustBeClosed
        fun create(
            params: MessageTemplateCreateParams
        ): HttpResponseFor<MessageTemplateCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: MessageTemplateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageTemplateCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v2/whatsapp/message_templates`, but is otherwise
         * the same as [MessageTemplateService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<MessageTemplateListPage> =
            list(MessageTemplateListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessageTemplateListParams = MessageTemplateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageTemplateListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessageTemplateListParams = MessageTemplateListParams.none()
        ): HttpResponseFor<MessageTemplateListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MessageTemplateListPage> =
            list(MessageTemplateListParams.none(), requestOptions)
    }
}
