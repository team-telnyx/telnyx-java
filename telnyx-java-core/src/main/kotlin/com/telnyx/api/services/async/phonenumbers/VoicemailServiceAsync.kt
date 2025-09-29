// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.phonenumbers

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.phonenumbers.voicemail.VoicemailCreateParams
import com.telnyx.api.models.phonenumbers.voicemail.VoicemailCreateResponse
import com.telnyx.api.models.phonenumbers.voicemail.VoicemailRetrieveParams
import com.telnyx.api.models.phonenumbers.voicemail.VoicemailRetrieveResponse
import com.telnyx.api.models.phonenumbers.voicemail.VoicemailUpdateParams
import com.telnyx.api.models.phonenumbers.voicemail.VoicemailUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface VoicemailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VoicemailServiceAsync

    /** Create voicemail settings for a phone number */
    fun create(
        phoneNumberId: String,
        params: VoicemailCreateParams,
    ): CompletableFuture<VoicemailCreateResponse> =
        create(phoneNumberId, params, RequestOptions.none())

    /** @see create */
    fun create(
        phoneNumberId: String,
        params: VoicemailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoicemailCreateResponse> =
        create(params.toBuilder().phoneNumberId(phoneNumberId).build(), requestOptions)

    /** @see create */
    fun create(params: VoicemailCreateParams): CompletableFuture<VoicemailCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: VoicemailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoicemailCreateResponse>

    /** Returns the voicemail settings for a phone number */
    fun retrieve(phoneNumberId: String): CompletableFuture<VoicemailRetrieveResponse> =
        retrieve(phoneNumberId, VoicemailRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumberId: String,
        params: VoicemailRetrieveParams = VoicemailRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoicemailRetrieveResponse> =
        retrieve(params.toBuilder().phoneNumberId(phoneNumberId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        phoneNumberId: String,
        params: VoicemailRetrieveParams = VoicemailRetrieveParams.none(),
    ): CompletableFuture<VoicemailRetrieveResponse> =
        retrieve(phoneNumberId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VoicemailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoicemailRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: VoicemailRetrieveParams): CompletableFuture<VoicemailRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumberId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VoicemailRetrieveResponse> =
        retrieve(phoneNumberId, VoicemailRetrieveParams.none(), requestOptions)

    /** Update voicemail settings for a phone number */
    fun update(
        phoneNumberId: String,
        params: VoicemailUpdateParams,
    ): CompletableFuture<VoicemailUpdateResponse> =
        update(phoneNumberId, params, RequestOptions.none())

    /** @see update */
    fun update(
        phoneNumberId: String,
        params: VoicemailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoicemailUpdateResponse> =
        update(params.toBuilder().phoneNumberId(phoneNumberId).build(), requestOptions)

    /** @see update */
    fun update(params: VoicemailUpdateParams): CompletableFuture<VoicemailUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: VoicemailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoicemailUpdateResponse>

    /**
     * A view of [VoicemailServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VoicemailServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /phone_numbers/{phone_number_id}/voicemail`, but is
         * otherwise the same as [VoicemailServiceAsync.create].
         */
        fun create(
            phoneNumberId: String,
            params: VoicemailCreateParams,
        ): CompletableFuture<HttpResponseFor<VoicemailCreateResponse>> =
            create(phoneNumberId, params, RequestOptions.none())

        /** @see create */
        fun create(
            phoneNumberId: String,
            params: VoicemailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoicemailCreateResponse>> =
            create(params.toBuilder().phoneNumberId(phoneNumberId).build(), requestOptions)

        /** @see create */
        fun create(
            params: VoicemailCreateParams
        ): CompletableFuture<HttpResponseFor<VoicemailCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: VoicemailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoicemailCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /phone_numbers/{phone_number_id}/voicemail`, but is
         * otherwise the same as [VoicemailServiceAsync.retrieve].
         */
        fun retrieve(
            phoneNumberId: String
        ): CompletableFuture<HttpResponseFor<VoicemailRetrieveResponse>> =
            retrieve(phoneNumberId, VoicemailRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            phoneNumberId: String,
            params: VoicemailRetrieveParams = VoicemailRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoicemailRetrieveResponse>> =
            retrieve(params.toBuilder().phoneNumberId(phoneNumberId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            phoneNumberId: String,
            params: VoicemailRetrieveParams = VoicemailRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<VoicemailRetrieveResponse>> =
            retrieve(phoneNumberId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: VoicemailRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoicemailRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: VoicemailRetrieveParams
        ): CompletableFuture<HttpResponseFor<VoicemailRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            phoneNumberId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VoicemailRetrieveResponse>> =
            retrieve(phoneNumberId, VoicemailRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /phone_numbers/{phone_number_id}/voicemail`, but
         * is otherwise the same as [VoicemailServiceAsync.update].
         */
        fun update(
            phoneNumberId: String,
            params: VoicemailUpdateParams,
        ): CompletableFuture<HttpResponseFor<VoicemailUpdateResponse>> =
            update(phoneNumberId, params, RequestOptions.none())

        /** @see update */
        fun update(
            phoneNumberId: String,
            params: VoicemailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoicemailUpdateResponse>> =
            update(params.toBuilder().phoneNumberId(phoneNumberId).build(), requestOptions)

        /** @see update */
        fun update(
            params: VoicemailUpdateParams
        ): CompletableFuture<HttpResponseFor<VoicemailUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: VoicemailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoicemailUpdateResponse>>
    }
}
