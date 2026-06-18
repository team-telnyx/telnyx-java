// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.whatsappmessagetemplates.WhatsappMessageTemplateDeleteParams
import com.telnyx.sdk.models.whatsappmessagetemplates.WhatsappMessageTemplateRetrieveParams
import com.telnyx.sdk.models.whatsappmessagetemplates.WhatsappMessageTemplateRetrieveResponse
import com.telnyx.sdk.models.whatsappmessagetemplates.WhatsappMessageTemplateUpdateParams
import com.telnyx.sdk.models.whatsappmessagetemplates.WhatsappMessageTemplateUpdateResponse
import java.util.function.Consumer

/** Manage Whatsapp message templates */
interface WhatsappMessageTemplateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WhatsappMessageTemplateService

    /** Get a Whatsapp message template by ID */
    fun retrieve(id: String): WhatsappMessageTemplateRetrieveResponse =
        retrieve(id, WhatsappMessageTemplateRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: WhatsappMessageTemplateRetrieveParams =
            WhatsappMessageTemplateRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WhatsappMessageTemplateRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: WhatsappMessageTemplateRetrieveParams = WhatsappMessageTemplateRetrieveParams.none(),
    ): WhatsappMessageTemplateRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: WhatsappMessageTemplateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WhatsappMessageTemplateRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: WhatsappMessageTemplateRetrieveParams
    ): WhatsappMessageTemplateRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): WhatsappMessageTemplateRetrieveResponse =
        retrieve(id, WhatsappMessageTemplateRetrieveParams.none(), requestOptions)

    /** Update a Whatsapp message template */
    fun update(id: String): WhatsappMessageTemplateUpdateResponse =
        update(id, WhatsappMessageTemplateUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: WhatsappMessageTemplateUpdateParams = WhatsappMessageTemplateUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WhatsappMessageTemplateUpdateResponse =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: WhatsappMessageTemplateUpdateParams = WhatsappMessageTemplateUpdateParams.none(),
    ): WhatsappMessageTemplateUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: WhatsappMessageTemplateUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WhatsappMessageTemplateUpdateResponse

    /** @see update */
    fun update(params: WhatsappMessageTemplateUpdateParams): WhatsappMessageTemplateUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): WhatsappMessageTemplateUpdateResponse =
        update(id, WhatsappMessageTemplateUpdateParams.none(), requestOptions)

    /** Delete a Whatsapp message template */
    fun delete(id: String) = delete(id, WhatsappMessageTemplateDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: WhatsappMessageTemplateDeleteParams = WhatsappMessageTemplateDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: WhatsappMessageTemplateDeleteParams = WhatsappMessageTemplateDeleteParams.none(),
    ) = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: WhatsappMessageTemplateDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: WhatsappMessageTemplateDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, WhatsappMessageTemplateDeleteParams.none(), requestOptions)

    /**
     * A view of [WhatsappMessageTemplateService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WhatsappMessageTemplateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v2/whatsapp_message_templates/{id}`, but is
         * otherwise the same as [WhatsappMessageTemplateService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<WhatsappMessageTemplateRetrieveResponse> =
            retrieve(id, WhatsappMessageTemplateRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: WhatsappMessageTemplateRetrieveParams =
                WhatsappMessageTemplateRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WhatsappMessageTemplateRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: WhatsappMessageTemplateRetrieveParams =
                WhatsappMessageTemplateRetrieveParams.none(),
        ): HttpResponseFor<WhatsappMessageTemplateRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: WhatsappMessageTemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WhatsappMessageTemplateRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: WhatsappMessageTemplateRetrieveParams
        ): HttpResponseFor<WhatsappMessageTemplateRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WhatsappMessageTemplateRetrieveResponse> =
            retrieve(id, WhatsappMessageTemplateRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v2/whatsapp_message_templates/{id}`, but is
         * otherwise the same as [WhatsappMessageTemplateService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<WhatsappMessageTemplateUpdateResponse> =
            update(id, WhatsappMessageTemplateUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: WhatsappMessageTemplateUpdateParams =
                WhatsappMessageTemplateUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WhatsappMessageTemplateUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: WhatsappMessageTemplateUpdateParams = WhatsappMessageTemplateUpdateParams.none(),
        ): HttpResponseFor<WhatsappMessageTemplateUpdateResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: WhatsappMessageTemplateUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WhatsappMessageTemplateUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            params: WhatsappMessageTemplateUpdateParams
        ): HttpResponseFor<WhatsappMessageTemplateUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WhatsappMessageTemplateUpdateResponse> =
            update(id, WhatsappMessageTemplateUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v2/whatsapp_message_templates/{id}`, but is
         * otherwise the same as [WhatsappMessageTemplateService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(id, WhatsappMessageTemplateDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: WhatsappMessageTemplateDeleteParams =
                WhatsappMessageTemplateDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: WhatsappMessageTemplateDeleteParams = WhatsappMessageTemplateDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: WhatsappMessageTemplateDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: WhatsappMessageTemplateDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, WhatsappMessageTemplateDeleteParams.none(), requestOptions)
    }
}
