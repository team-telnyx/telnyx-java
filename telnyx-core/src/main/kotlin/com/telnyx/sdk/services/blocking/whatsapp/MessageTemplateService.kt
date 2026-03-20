// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateCreateParams
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateCreateResponse
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateDeleteParams
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateListPage
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateListParams
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateRetrieveParams
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateRetrieveResponse
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateUpdateParams
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateUpdateResponse
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

    /** Get a Whatsapp message template by ID */
    fun retrieve(id: String): MessageTemplateRetrieveResponse =
        retrieve(id, MessageTemplateRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MessageTemplateRetrieveParams = MessageTemplateRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageTemplateRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MessageTemplateRetrieveParams = MessageTemplateRetrieveParams.none(),
    ): MessageTemplateRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MessageTemplateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageTemplateRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: MessageTemplateRetrieveParams): MessageTemplateRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): MessageTemplateRetrieveResponse =
        retrieve(id, MessageTemplateRetrieveParams.none(), requestOptions)

    /** Update a Whatsapp message template */
    fun update(id: String): MessageTemplateUpdateResponse =
        update(id, MessageTemplateUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: MessageTemplateUpdateParams = MessageTemplateUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageTemplateUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: MessageTemplateUpdateParams = MessageTemplateUpdateParams.none(),
    ): MessageTemplateUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MessageTemplateUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageTemplateUpdateResponse

    /** @see update */
    fun update(params: MessageTemplateUpdateParams): MessageTemplateUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): MessageTemplateUpdateResponse =
        update(id, MessageTemplateUpdateParams.none(), requestOptions)

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

    /** Delete a Whatsapp message template */
    fun delete(id: String) = delete(id, MessageTemplateDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: MessageTemplateDeleteParams = MessageTemplateDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: MessageTemplateDeleteParams = MessageTemplateDeleteParams.none(),
    ) = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MessageTemplateDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: MessageTemplateDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, MessageTemplateDeleteParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /v2/whatsapp_message_templates/{id}`, but is
         * otherwise the same as [MessageTemplateService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<MessageTemplateRetrieveResponse> =
            retrieve(id, MessageTemplateRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: MessageTemplateRetrieveParams = MessageTemplateRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageTemplateRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: MessageTemplateRetrieveParams = MessageTemplateRetrieveParams.none(),
        ): HttpResponseFor<MessageTemplateRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MessageTemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageTemplateRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MessageTemplateRetrieveParams
        ): HttpResponseFor<MessageTemplateRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageTemplateRetrieveResponse> =
            retrieve(id, MessageTemplateRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v2/whatsapp_message_templates/{id}`, but is
         * otherwise the same as [MessageTemplateService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<MessageTemplateUpdateResponse> =
            update(id, MessageTemplateUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: MessageTemplateUpdateParams = MessageTemplateUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageTemplateUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: MessageTemplateUpdateParams = MessageTemplateUpdateParams.none(),
        ): HttpResponseFor<MessageTemplateUpdateResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: MessageTemplateUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageTemplateUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            params: MessageTemplateUpdateParams
        ): HttpResponseFor<MessageTemplateUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageTemplateUpdateResponse> =
            update(id, MessageTemplateUpdateParams.none(), requestOptions)

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

        /**
         * Returns a raw HTTP response for `delete /v2/whatsapp_message_templates/{id}`, but is
         * otherwise the same as [MessageTemplateService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, MessageTemplateDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: MessageTemplateDeleteParams = MessageTemplateDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: MessageTemplateDeleteParams = MessageTemplateDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: MessageTemplateDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: MessageTemplateDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, MessageTemplateDeleteParams.none(), requestOptions)
    }
}
