// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.whatsappmessagetemplates.WhatsappMessageTemplateDeleteParams
import com.telnyx.sdk.models.whatsappmessagetemplates.WhatsappMessageTemplateRetrieveParams
import com.telnyx.sdk.models.whatsappmessagetemplates.WhatsappMessageTemplateRetrieveResponse
import com.telnyx.sdk.models.whatsappmessagetemplates.WhatsappMessageTemplateUpdateParams
import com.telnyx.sdk.models.whatsappmessagetemplates.WhatsappMessageTemplateUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage Whatsapp message templates */
interface WhatsappMessageTemplateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WhatsappMessageTemplateServiceAsync

    /** Get a Whatsapp message template by ID */
    fun retrieve(id: String): CompletableFuture<WhatsappMessageTemplateRetrieveResponse> =
        retrieve(id, WhatsappMessageTemplateRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: WhatsappMessageTemplateRetrieveParams =
            WhatsappMessageTemplateRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WhatsappMessageTemplateRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: WhatsappMessageTemplateRetrieveParams = WhatsappMessageTemplateRetrieveParams.none(),
    ): CompletableFuture<WhatsappMessageTemplateRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: WhatsappMessageTemplateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WhatsappMessageTemplateRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: WhatsappMessageTemplateRetrieveParams
    ): CompletableFuture<WhatsappMessageTemplateRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WhatsappMessageTemplateRetrieveResponse> =
        retrieve(id, WhatsappMessageTemplateRetrieveParams.none(), requestOptions)

    /** Update a Whatsapp message template */
    fun update(id: String): CompletableFuture<WhatsappMessageTemplateUpdateResponse> =
        update(id, WhatsappMessageTemplateUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: WhatsappMessageTemplateUpdateParams = WhatsappMessageTemplateUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WhatsappMessageTemplateUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: WhatsappMessageTemplateUpdateParams = WhatsappMessageTemplateUpdateParams.none(),
    ): CompletableFuture<WhatsappMessageTemplateUpdateResponse> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: WhatsappMessageTemplateUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WhatsappMessageTemplateUpdateResponse>

    /** @see update */
    fun update(
        params: WhatsappMessageTemplateUpdateParams
    ): CompletableFuture<WhatsappMessageTemplateUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WhatsappMessageTemplateUpdateResponse> =
        update(id, WhatsappMessageTemplateUpdateParams.none(), requestOptions)

    /** Delete a Whatsapp message template */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(id, WhatsappMessageTemplateDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: WhatsappMessageTemplateDeleteParams = WhatsappMessageTemplateDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: WhatsappMessageTemplateDeleteParams = WhatsappMessageTemplateDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: WhatsappMessageTemplateDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: WhatsappMessageTemplateDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, WhatsappMessageTemplateDeleteParams.none(), requestOptions)

    /**
     * A view of [WhatsappMessageTemplateServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WhatsappMessageTemplateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v2/whatsapp_message_templates/{id}`, but is
         * otherwise the same as [WhatsappMessageTemplateServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<WhatsappMessageTemplateRetrieveResponse>> =
            retrieve(id, WhatsappMessageTemplateRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: WhatsappMessageTemplateRetrieveParams =
                WhatsappMessageTemplateRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WhatsappMessageTemplateRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: WhatsappMessageTemplateRetrieveParams =
                WhatsappMessageTemplateRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<WhatsappMessageTemplateRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: WhatsappMessageTemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WhatsappMessageTemplateRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: WhatsappMessageTemplateRetrieveParams
        ): CompletableFuture<HttpResponseFor<WhatsappMessageTemplateRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WhatsappMessageTemplateRetrieveResponse>> =
            retrieve(id, WhatsappMessageTemplateRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v2/whatsapp_message_templates/{id}`, but is
         * otherwise the same as [WhatsappMessageTemplateServiceAsync.update].
         */
        fun update(
            id: String
        ): CompletableFuture<HttpResponseFor<WhatsappMessageTemplateUpdateResponse>> =
            update(id, WhatsappMessageTemplateUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: WhatsappMessageTemplateUpdateParams =
                WhatsappMessageTemplateUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WhatsappMessageTemplateUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: WhatsappMessageTemplateUpdateParams = WhatsappMessageTemplateUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<WhatsappMessageTemplateUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: WhatsappMessageTemplateUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WhatsappMessageTemplateUpdateResponse>>

        /** @see update */
        fun update(
            params: WhatsappMessageTemplateUpdateParams
        ): CompletableFuture<HttpResponseFor<WhatsappMessageTemplateUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WhatsappMessageTemplateUpdateResponse>> =
            update(id, WhatsappMessageTemplateUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v2/whatsapp_message_templates/{id}`, but is
         * otherwise the same as [WhatsappMessageTemplateServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, WhatsappMessageTemplateDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: WhatsappMessageTemplateDeleteParams =
                WhatsappMessageTemplateDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: WhatsappMessageTemplateDeleteParams = WhatsappMessageTemplateDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: WhatsappMessageTemplateDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: WhatsappMessageTemplateDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, WhatsappMessageTemplateDeleteParams.none(), requestOptions)
    }
}
