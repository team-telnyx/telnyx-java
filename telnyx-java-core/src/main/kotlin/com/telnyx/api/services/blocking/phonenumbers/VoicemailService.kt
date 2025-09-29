// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.phonenumbers

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.phonenumbers.voicemail.VoicemailCreateParams
import com.telnyx.api.models.phonenumbers.voicemail.VoicemailCreateResponse
import com.telnyx.api.models.phonenumbers.voicemail.VoicemailRetrieveParams
import com.telnyx.api.models.phonenumbers.voicemail.VoicemailRetrieveResponse
import com.telnyx.api.models.phonenumbers.voicemail.VoicemailUpdateParams
import com.telnyx.api.models.phonenumbers.voicemail.VoicemailUpdateResponse
import java.util.function.Consumer

interface VoicemailService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VoicemailService

    /** Create voicemail settings for a phone number */
    fun create(phoneNumberId: String, params: VoicemailCreateParams): VoicemailCreateResponse =
        create(phoneNumberId, params, RequestOptions.none())

    /** @see create */
    fun create(
        phoneNumberId: String,
        params: VoicemailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoicemailCreateResponse =
        create(params.toBuilder().phoneNumberId(phoneNumberId).build(), requestOptions)

    /** @see create */
    fun create(params: VoicemailCreateParams): VoicemailCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: VoicemailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoicemailCreateResponse

    /** Returns the voicemail settings for a phone number */
    fun retrieve(phoneNumberId: String): VoicemailRetrieveResponse =
        retrieve(phoneNumberId, VoicemailRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumberId: String,
        params: VoicemailRetrieveParams = VoicemailRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoicemailRetrieveResponse =
        retrieve(params.toBuilder().phoneNumberId(phoneNumberId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        phoneNumberId: String,
        params: VoicemailRetrieveParams = VoicemailRetrieveParams.none(),
    ): VoicemailRetrieveResponse = retrieve(phoneNumberId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VoicemailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoicemailRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: VoicemailRetrieveParams): VoicemailRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(phoneNumberId: String, requestOptions: RequestOptions): VoicemailRetrieveResponse =
        retrieve(phoneNumberId, VoicemailRetrieveParams.none(), requestOptions)

    /** Update voicemail settings for a phone number */
    fun update(phoneNumberId: String, params: VoicemailUpdateParams): VoicemailUpdateResponse =
        update(phoneNumberId, params, RequestOptions.none())

    /** @see update */
    fun update(
        phoneNumberId: String,
        params: VoicemailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoicemailUpdateResponse =
        update(params.toBuilder().phoneNumberId(phoneNumberId).build(), requestOptions)

    /** @see update */
    fun update(params: VoicemailUpdateParams): VoicemailUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: VoicemailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoicemailUpdateResponse

    /** A view of [VoicemailService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): VoicemailService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /phone_numbers/{phone_number_id}/voicemail`, but is
         * otherwise the same as [VoicemailService.create].
         */
        @MustBeClosed
        fun create(
            phoneNumberId: String,
            params: VoicemailCreateParams,
        ): HttpResponseFor<VoicemailCreateResponse> =
            create(phoneNumberId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            phoneNumberId: String,
            params: VoicemailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoicemailCreateResponse> =
            create(params.toBuilder().phoneNumberId(phoneNumberId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: VoicemailCreateParams): HttpResponseFor<VoicemailCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: VoicemailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoicemailCreateResponse>

        /**
         * Returns a raw HTTP response for `get /phone_numbers/{phone_number_id}/voicemail`, but is
         * otherwise the same as [VoicemailService.retrieve].
         */
        @MustBeClosed
        fun retrieve(phoneNumberId: String): HttpResponseFor<VoicemailRetrieveResponse> =
            retrieve(phoneNumberId, VoicemailRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            phoneNumberId: String,
            params: VoicemailRetrieveParams = VoicemailRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoicemailRetrieveResponse> =
            retrieve(params.toBuilder().phoneNumberId(phoneNumberId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            phoneNumberId: String,
            params: VoicemailRetrieveParams = VoicemailRetrieveParams.none(),
        ): HttpResponseFor<VoicemailRetrieveResponse> =
            retrieve(phoneNumberId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: VoicemailRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoicemailRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: VoicemailRetrieveParams): HttpResponseFor<VoicemailRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            phoneNumberId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VoicemailRetrieveResponse> =
            retrieve(phoneNumberId, VoicemailRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /phone_numbers/{phone_number_id}/voicemail`, but
         * is otherwise the same as [VoicemailService.update].
         */
        @MustBeClosed
        fun update(
            phoneNumberId: String,
            params: VoicemailUpdateParams,
        ): HttpResponseFor<VoicemailUpdateResponse> =
            update(phoneNumberId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            phoneNumberId: String,
            params: VoicemailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoicemailUpdateResponse> =
            update(params.toBuilder().phoneNumberId(phoneNumberId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: VoicemailUpdateParams): HttpResponseFor<VoicemailUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: VoicemailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoicemailUpdateResponse>
    }
}
