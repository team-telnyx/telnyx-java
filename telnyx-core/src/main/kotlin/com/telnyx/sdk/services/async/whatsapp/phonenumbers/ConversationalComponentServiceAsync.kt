// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp.phonenumbers

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.whatsapp.phonenumbers.conversationalcomponents.ConversationalComponentListParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.conversationalcomponents.ConversationalComponentListResponse
import com.telnyx.sdk.models.whatsapp.phonenumbers.conversationalcomponents.ConversationalComponentPatchAllParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.conversationalcomponents.ConversationalComponentPatchAllResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage Whatsapp phone numbers */
interface ConversationalComponentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConversationalComponentServiceAsync

    /** Get phone number conversational components */
    fun list(phoneNumber: String): CompletableFuture<ConversationalComponentListResponse> =
        list(phoneNumber, ConversationalComponentListParams.none())

    /** @see list */
    fun list(
        phoneNumber: String,
        params: ConversationalComponentListParams = ConversationalComponentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConversationalComponentListResponse> =
        list(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see list */
    fun list(
        phoneNumber: String,
        params: ConversationalComponentListParams = ConversationalComponentListParams.none(),
    ): CompletableFuture<ConversationalComponentListResponse> =
        list(phoneNumber, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ConversationalComponentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConversationalComponentListResponse>

    /** @see list */
    fun list(
        params: ConversationalComponentListParams
    ): CompletableFuture<ConversationalComponentListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        phoneNumber: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConversationalComponentListResponse> =
        list(phoneNumber, ConversationalComponentListParams.none(), requestOptions)

    /** Update phone number conversational components */
    fun patchAll(phoneNumber: String): CompletableFuture<ConversationalComponentPatchAllResponse> =
        patchAll(phoneNumber, ConversationalComponentPatchAllParams.none())

    /** @see patchAll */
    fun patchAll(
        phoneNumber: String,
        params: ConversationalComponentPatchAllParams =
            ConversationalComponentPatchAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConversationalComponentPatchAllResponse> =
        patchAll(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see patchAll */
    fun patchAll(
        phoneNumber: String,
        params: ConversationalComponentPatchAllParams = ConversationalComponentPatchAllParams.none(),
    ): CompletableFuture<ConversationalComponentPatchAllResponse> =
        patchAll(phoneNumber, params, RequestOptions.none())

    /** @see patchAll */
    fun patchAll(
        params: ConversationalComponentPatchAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConversationalComponentPatchAllResponse>

    /** @see patchAll */
    fun patchAll(
        params: ConversationalComponentPatchAllParams
    ): CompletableFuture<ConversationalComponentPatchAllResponse> =
        patchAll(params, RequestOptions.none())

    /** @see patchAll */
    fun patchAll(
        phoneNumber: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConversationalComponentPatchAllResponse> =
        patchAll(phoneNumber, ConversationalComponentPatchAllParams.none(), requestOptions)

    /**
     * A view of [ConversationalComponentServiceAsync] that provides access to raw HTTP responses
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
        ): ConversationalComponentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v2/whatsapp/phone_numbers/{phone_number}/conversational_components`, but is otherwise
         * the same as [ConversationalComponentServiceAsync.list].
         */
        fun list(
            phoneNumber: String
        ): CompletableFuture<HttpResponseFor<ConversationalComponentListResponse>> =
            list(phoneNumber, ConversationalComponentListParams.none())

        /** @see list */
        fun list(
            phoneNumber: String,
            params: ConversationalComponentListParams = ConversationalComponentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConversationalComponentListResponse>> =
            list(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see list */
        fun list(
            phoneNumber: String,
            params: ConversationalComponentListParams = ConversationalComponentListParams.none(),
        ): CompletableFuture<HttpResponseFor<ConversationalComponentListResponse>> =
            list(phoneNumber, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ConversationalComponentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConversationalComponentListResponse>>

        /** @see list */
        fun list(
            params: ConversationalComponentListParams
        ): CompletableFuture<HttpResponseFor<ConversationalComponentListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConversationalComponentListResponse>> =
            list(phoneNumber, ConversationalComponentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /v2/whatsapp/phone_numbers/{phone_number}/conversational_components`, but is otherwise
         * the same as [ConversationalComponentServiceAsync.patchAll].
         */
        fun patchAll(
            phoneNumber: String
        ): CompletableFuture<HttpResponseFor<ConversationalComponentPatchAllResponse>> =
            patchAll(phoneNumber, ConversationalComponentPatchAllParams.none())

        /** @see patchAll */
        fun patchAll(
            phoneNumber: String,
            params: ConversationalComponentPatchAllParams =
                ConversationalComponentPatchAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConversationalComponentPatchAllResponse>> =
            patchAll(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see patchAll */
        fun patchAll(
            phoneNumber: String,
            params: ConversationalComponentPatchAllParams =
                ConversationalComponentPatchAllParams.none(),
        ): CompletableFuture<HttpResponseFor<ConversationalComponentPatchAllResponse>> =
            patchAll(phoneNumber, params, RequestOptions.none())

        /** @see patchAll */
        fun patchAll(
            params: ConversationalComponentPatchAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConversationalComponentPatchAllResponse>>

        /** @see patchAll */
        fun patchAll(
            params: ConversationalComponentPatchAllParams
        ): CompletableFuture<HttpResponseFor<ConversationalComponentPatchAllResponse>> =
            patchAll(params, RequestOptions.none())

        /** @see patchAll */
        fun patchAll(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConversationalComponentPatchAllResponse>> =
            patchAll(phoneNumber, ConversationalComponentPatchAllParams.none(), requestOptions)
    }
}
