// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.phonenumbers

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.phonenumbers.voice.VoiceListParams
import com.telnyx.api.models.phonenumbers.voice.VoiceListResponse
import com.telnyx.api.models.phonenumbers.voice.VoiceRetrieveParams
import com.telnyx.api.models.phonenumbers.voice.VoiceRetrieveResponse
import com.telnyx.api.models.phonenumbers.voice.VoiceUpdateParams
import com.telnyx.api.models.phonenumbers.voice.VoiceUpdateResponse
import java.util.function.Consumer

interface VoiceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VoiceService

    /** Retrieve a phone number with voice settings */
    fun retrieve(id: String): VoiceRetrieveResponse = retrieve(id, VoiceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: VoiceRetrieveParams = VoiceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: VoiceRetrieveParams = VoiceRetrieveParams.none(),
    ): VoiceRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VoiceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: VoiceRetrieveParams): VoiceRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): VoiceRetrieveResponse =
        retrieve(id, VoiceRetrieveParams.none(), requestOptions)

    /** Update a phone number with voice settings */
    fun update(id: String, params: VoiceUpdateParams): VoiceUpdateResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: VoiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: VoiceUpdateParams): VoiceUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: VoiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceUpdateResponse

    /** List phone numbers with voice settings */
    fun list(): VoiceListResponse = list(VoiceListParams.none())

    /** @see list */
    fun list(
        params: VoiceListParams = VoiceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceListResponse

    /** @see list */
    fun list(params: VoiceListParams = VoiceListParams.none()): VoiceListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): VoiceListResponse =
        list(VoiceListParams.none(), requestOptions)

    /** A view of [VoiceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): VoiceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /phone_numbers/{id}/voice`, but is otherwise the
         * same as [VoiceService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<VoiceRetrieveResponse> =
            retrieve(id, VoiceRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: VoiceRetrieveParams = VoiceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: VoiceRetrieveParams = VoiceRetrieveParams.none(),
        ): HttpResponseFor<VoiceRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: VoiceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: VoiceRetrieveParams): HttpResponseFor<VoiceRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VoiceRetrieveResponse> =
            retrieve(id, VoiceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /phone_numbers/{id}/voice`, but is otherwise the
         * same as [VoiceService.update].
         */
        @MustBeClosed
        fun update(id: String, params: VoiceUpdateParams): HttpResponseFor<VoiceUpdateResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: VoiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: VoiceUpdateParams): HttpResponseFor<VoiceUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: VoiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /phone_numbers/voice`, but is otherwise the same as
         * [VoiceService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<VoiceListResponse> = list(VoiceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: VoiceListParams = VoiceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: VoiceListParams = VoiceListParams.none()
        ): HttpResponseFor<VoiceListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<VoiceListResponse> =
            list(VoiceListParams.none(), requestOptions)
    }
}
