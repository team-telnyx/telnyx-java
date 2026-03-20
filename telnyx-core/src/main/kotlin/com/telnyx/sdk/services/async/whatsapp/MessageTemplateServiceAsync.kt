// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateCreateParams
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateCreateResponse
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateDeleteParams
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateListPageAsync
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateListParams
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateRetrieveParams
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateRetrieveResponse
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateUpdateParams
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateUpdateResponse
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

    /** Get a Whatsapp message template by ID */
    fun retrieve(id: String): CompletableFuture<MessageTemplateRetrieveResponse> =
        retrieve(id, MessageTemplateRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MessageTemplateRetrieveParams = MessageTemplateRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageTemplateRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MessageTemplateRetrieveParams = MessageTemplateRetrieveParams.none(),
    ): CompletableFuture<MessageTemplateRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MessageTemplateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageTemplateRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: MessageTemplateRetrieveParams
    ): CompletableFuture<MessageTemplateRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageTemplateRetrieveResponse> =
        retrieve(id, MessageTemplateRetrieveParams.none(), requestOptions)

    /** Update a Whatsapp message template */
    fun update(id: String): CompletableFuture<MessageTemplateUpdateResponse> =
        update(id, MessageTemplateUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: MessageTemplateUpdateParams = MessageTemplateUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageTemplateUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: MessageTemplateUpdateParams = MessageTemplateUpdateParams.none(),
    ): CompletableFuture<MessageTemplateUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MessageTemplateUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageTemplateUpdateResponse>

    /** @see update */
    fun update(
        params: MessageTemplateUpdateParams
    ): CompletableFuture<MessageTemplateUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageTemplateUpdateResponse> =
        update(id, MessageTemplateUpdateParams.none(), requestOptions)

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

    /** Delete a Whatsapp message template */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(id, MessageTemplateDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: MessageTemplateDeleteParams = MessageTemplateDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: MessageTemplateDeleteParams = MessageTemplateDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MessageTemplateDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: MessageTemplateDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, MessageTemplateDeleteParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /v2/whatsapp_message_templates/{id}`, but is
         * otherwise the same as [MessageTemplateServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<MessageTemplateRetrieveResponse>> =
            retrieve(id, MessageTemplateRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: MessageTemplateRetrieveParams = MessageTemplateRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageTemplateRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: MessageTemplateRetrieveParams = MessageTemplateRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<MessageTemplateRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: MessageTemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageTemplateRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: MessageTemplateRetrieveParams
        ): CompletableFuture<HttpResponseFor<MessageTemplateRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageTemplateRetrieveResponse>> =
            retrieve(id, MessageTemplateRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v2/whatsapp_message_templates/{id}`, but is
         * otherwise the same as [MessageTemplateServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<MessageTemplateUpdateResponse>> =
            update(id, MessageTemplateUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: MessageTemplateUpdateParams = MessageTemplateUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageTemplateUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: MessageTemplateUpdateParams = MessageTemplateUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<MessageTemplateUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: MessageTemplateUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageTemplateUpdateResponse>>

        /** @see update */
        fun update(
            params: MessageTemplateUpdateParams
        ): CompletableFuture<HttpResponseFor<MessageTemplateUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageTemplateUpdateResponse>> =
            update(id, MessageTemplateUpdateParams.none(), requestOptions)

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

        /**
         * Returns a raw HTTP response for `delete /v2/whatsapp_message_templates/{id}`, but is
         * otherwise the same as [MessageTemplateServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, MessageTemplateDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: MessageTemplateDeleteParams = MessageTemplateDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: MessageTemplateDeleteParams = MessageTemplateDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: MessageTemplateDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: MessageTemplateDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, MessageTemplateDeleteParams.none(), requestOptions)
    }
}
