// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.phonenumbers

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.phonenumbers.voice.VoiceListParams
import com.telnyx.sdk.models.phonenumbers.voice.VoiceListResponse
import com.telnyx.sdk.models.phonenumbers.voice.VoiceRetrieveParams
import com.telnyx.sdk.models.phonenumbers.voice.VoiceRetrieveResponse
import com.telnyx.sdk.models.phonenumbers.voice.VoiceUpdateParams
import com.telnyx.sdk.models.phonenumbers.voice.VoiceUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface VoiceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VoiceServiceAsync

    /** Retrieve a phone number with voice settings */
    fun retrieve(id: String): CompletableFuture<VoiceRetrieveResponse> =
        retrieve(id, VoiceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: VoiceRetrieveParams = VoiceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: VoiceRetrieveParams = VoiceRetrieveParams.none(),
    ): CompletableFuture<VoiceRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VoiceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: VoiceRetrieveParams): CompletableFuture<VoiceRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VoiceRetrieveResponse> =
        retrieve(id, VoiceRetrieveParams.none(), requestOptions)

    /** Update a phone number with voice settings */
    fun update(id: String, params: VoiceUpdateParams): CompletableFuture<VoiceUpdateResponse> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: VoiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: VoiceUpdateParams): CompletableFuture<VoiceUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: VoiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceUpdateResponse>

    /** List phone numbers with voice settings */
    fun list(): CompletableFuture<VoiceListResponse> = list(VoiceListParams.none())

    /** @see list */
    fun list(
        params: VoiceListParams = VoiceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceListResponse>

    /** @see list */
    fun list(
        params: VoiceListParams = VoiceListParams.none()
    ): CompletableFuture<VoiceListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<VoiceListResponse> =
        list(VoiceListParams.none(), requestOptions)

    /** A view of [VoiceServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VoiceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /phone_numbers/{id}/voice`, but is otherwise the
         * same as [VoiceServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<VoiceRetrieveResponse>> =
            retrieve(id, VoiceRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: VoiceRetrieveParams = VoiceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: VoiceRetrieveParams = VoiceRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<VoiceRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: VoiceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: VoiceRetrieveParams
        ): CompletableFuture<HttpResponseFor<VoiceRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VoiceRetrieveResponse>> =
            retrieve(id, VoiceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /phone_numbers/{id}/voice`, but is otherwise the
         * same as [VoiceServiceAsync.update].
         */
        fun update(
            id: String,
            params: VoiceUpdateParams,
        ): CompletableFuture<HttpResponseFor<VoiceUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: VoiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: VoiceUpdateParams
        ): CompletableFuture<HttpResponseFor<VoiceUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: VoiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /phone_numbers/voice`, but is otherwise the same as
         * [VoiceServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<VoiceListResponse>> =
            list(VoiceListParams.none())

        /** @see list */
        fun list(
            params: VoiceListParams = VoiceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceListResponse>>

        /** @see list */
        fun list(
            params: VoiceListParams = VoiceListParams.none()
        ): CompletableFuture<HttpResponseFor<VoiceListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<VoiceListResponse>> =
            list(VoiceListParams.none(), requestOptions)
    }
}
