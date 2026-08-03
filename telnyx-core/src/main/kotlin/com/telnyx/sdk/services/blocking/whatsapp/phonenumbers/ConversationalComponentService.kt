// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp.phonenumbers

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.whatsapp.phonenumbers.conversationalcomponents.ConversationalComponentListParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.conversationalcomponents.ConversationalComponentListResponse
import com.telnyx.sdk.models.whatsapp.phonenumbers.conversationalcomponents.ConversationalComponentPatchAllParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.conversationalcomponents.ConversationalComponentPatchAllResponse
import java.util.function.Consumer

/** Manage Whatsapp phone numbers */
interface ConversationalComponentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConversationalComponentService

    /** Get phone number conversational components */
    fun list(phoneNumber: String): ConversationalComponentListResponse =
        list(phoneNumber, ConversationalComponentListParams.none())

    /** @see list */
    fun list(
        phoneNumber: String,
        params: ConversationalComponentListParams = ConversationalComponentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConversationalComponentListResponse =
        list(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see list */
    fun list(
        phoneNumber: String,
        params: ConversationalComponentListParams = ConversationalComponentListParams.none(),
    ): ConversationalComponentListResponse = list(phoneNumber, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ConversationalComponentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConversationalComponentListResponse

    /** @see list */
    fun list(params: ConversationalComponentListParams): ConversationalComponentListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        phoneNumber: String,
        requestOptions: RequestOptions,
    ): ConversationalComponentListResponse =
        list(phoneNumber, ConversationalComponentListParams.none(), requestOptions)

    /** Update phone number conversational components */
    fun patchAll(phoneNumber: String): ConversationalComponentPatchAllResponse =
        patchAll(phoneNumber, ConversationalComponentPatchAllParams.none())

    /** @see patchAll */
    fun patchAll(
        phoneNumber: String,
        params: ConversationalComponentPatchAllParams =
            ConversationalComponentPatchAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConversationalComponentPatchAllResponse =
        patchAll(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see patchAll */
    fun patchAll(
        phoneNumber: String,
        params: ConversationalComponentPatchAllParams = ConversationalComponentPatchAllParams.none(),
    ): ConversationalComponentPatchAllResponse =
        patchAll(phoneNumber, params, RequestOptions.none())

    /** @see patchAll */
    fun patchAll(
        params: ConversationalComponentPatchAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConversationalComponentPatchAllResponse

    /** @see patchAll */
    fun patchAll(
        params: ConversationalComponentPatchAllParams
    ): ConversationalComponentPatchAllResponse = patchAll(params, RequestOptions.none())

    /** @see patchAll */
    fun patchAll(
        phoneNumber: String,
        requestOptions: RequestOptions,
    ): ConversationalComponentPatchAllResponse =
        patchAll(phoneNumber, ConversationalComponentPatchAllParams.none(), requestOptions)

    /**
     * A view of [ConversationalComponentService] that provides access to raw HTTP responses for
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
        ): ConversationalComponentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v2/whatsapp/phone_numbers/{phone_number}/conversational_components`, but is otherwise
         * the same as [ConversationalComponentService.list].
         */
        @MustBeClosed
        fun list(phoneNumber: String): HttpResponseFor<ConversationalComponentListResponse> =
            list(phoneNumber, ConversationalComponentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            phoneNumber: String,
            params: ConversationalComponentListParams = ConversationalComponentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConversationalComponentListResponse> =
            list(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            phoneNumber: String,
            params: ConversationalComponentListParams = ConversationalComponentListParams.none(),
        ): HttpResponseFor<ConversationalComponentListResponse> =
            list(phoneNumber, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ConversationalComponentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConversationalComponentListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ConversationalComponentListParams
        ): HttpResponseFor<ConversationalComponentListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConversationalComponentListResponse> =
            list(phoneNumber, ConversationalComponentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /v2/whatsapp/phone_numbers/{phone_number}/conversational_components`, but is otherwise
         * the same as [ConversationalComponentService.patchAll].
         */
        @MustBeClosed
        fun patchAll(
            phoneNumber: String
        ): HttpResponseFor<ConversationalComponentPatchAllResponse> =
            patchAll(phoneNumber, ConversationalComponentPatchAllParams.none())

        /** @see patchAll */
        @MustBeClosed
        fun patchAll(
            phoneNumber: String,
            params: ConversationalComponentPatchAllParams =
                ConversationalComponentPatchAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConversationalComponentPatchAllResponse> =
            patchAll(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see patchAll */
        @MustBeClosed
        fun patchAll(
            phoneNumber: String,
            params: ConversationalComponentPatchAllParams =
                ConversationalComponentPatchAllParams.none(),
        ): HttpResponseFor<ConversationalComponentPatchAllResponse> =
            patchAll(phoneNumber, params, RequestOptions.none())

        /** @see patchAll */
        @MustBeClosed
        fun patchAll(
            params: ConversationalComponentPatchAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConversationalComponentPatchAllResponse>

        /** @see patchAll */
        @MustBeClosed
        fun patchAll(
            params: ConversationalComponentPatchAllParams
        ): HttpResponseFor<ConversationalComponentPatchAllResponse> =
            patchAll(params, RequestOptions.none())

        /** @see patchAll */
        @MustBeClosed
        fun patchAll(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConversationalComponentPatchAllResponse> =
            patchAll(phoneNumber, ConversationalComponentPatchAllParams.none(), requestOptions)
    }
}
