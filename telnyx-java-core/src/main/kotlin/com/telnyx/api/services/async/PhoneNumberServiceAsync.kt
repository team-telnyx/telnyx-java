// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.phonenumbers.PhoneNumberDeleteParams
import com.telnyx.api.models.phonenumbers.PhoneNumberDeleteResponse
import com.telnyx.api.models.phonenumbers.PhoneNumberListParams
import com.telnyx.api.models.phonenumbers.PhoneNumberListResponse
import com.telnyx.api.models.phonenumbers.PhoneNumberRetrieveParams
import com.telnyx.api.models.phonenumbers.PhoneNumberRetrieveResponse
import com.telnyx.api.models.phonenumbers.PhoneNumberSlimListParams
import com.telnyx.api.models.phonenumbers.PhoneNumberSlimListResponse
import com.telnyx.api.models.phonenumbers.PhoneNumberUpdateParams
import com.telnyx.api.models.phonenumbers.PhoneNumberUpdateResponse
import com.telnyx.api.services.async.phonenumbers.ActionServiceAsync
import com.telnyx.api.services.async.phonenumbers.CsvDownloadServiceAsync
import com.telnyx.api.services.async.phonenumbers.JobServiceAsync
import com.telnyx.api.services.async.phonenumbers.MessagingServiceAsync
import com.telnyx.api.services.async.phonenumbers.VoiceServiceAsync
import com.telnyx.api.services.async.phonenumbers.VoicemailServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PhoneNumberServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberServiceAsync

    fun actions(): ActionServiceAsync

    fun csvDownloads(): CsvDownloadServiceAsync

    fun jobs(): JobServiceAsync

    fun messaging(): MessagingServiceAsync

    fun voice(): VoiceServiceAsync

    fun voicemail(): VoicemailServiceAsync

    /** Retrieve a phone number */
    fun retrieve(id: String): CompletableFuture<PhoneNumberRetrieveResponse> =
        retrieve(id, PhoneNumberRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PhoneNumberRetrieveParams = PhoneNumberRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PhoneNumberRetrieveParams = PhoneNumberRetrieveParams.none(),
    ): CompletableFuture<PhoneNumberRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PhoneNumberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: PhoneNumberRetrieveParams
    ): CompletableFuture<PhoneNumberRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberRetrieveResponse> =
        retrieve(id, PhoneNumberRetrieveParams.none(), requestOptions)

    /** Update a phone number */
    fun update(pathId: String): CompletableFuture<PhoneNumberUpdateResponse> =
        update(pathId, PhoneNumberUpdateParams.none())

    /** @see update */
    fun update(
        pathId: String,
        params: PhoneNumberUpdateParams = PhoneNumberUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberUpdateResponse> =
        update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(
        pathId: String,
        params: PhoneNumberUpdateParams = PhoneNumberUpdateParams.none(),
    ): CompletableFuture<PhoneNumberUpdateResponse> = update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PhoneNumberUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberUpdateResponse>

    /** @see update */
    fun update(params: PhoneNumberUpdateParams): CompletableFuture<PhoneNumberUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberUpdateResponse> =
        update(pathId, PhoneNumberUpdateParams.none(), requestOptions)

    /** List phone numbers */
    fun list(): CompletableFuture<PhoneNumberListResponse> = list(PhoneNumberListParams.none())

    /** @see list */
    fun list(
        params: PhoneNumberListParams = PhoneNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberListResponse>

    /** @see list */
    fun list(
        params: PhoneNumberListParams = PhoneNumberListParams.none()
    ): CompletableFuture<PhoneNumberListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PhoneNumberListResponse> =
        list(PhoneNumberListParams.none(), requestOptions)

    /** Delete a phone number */
    fun delete(id: String): CompletableFuture<PhoneNumberDeleteResponse> =
        delete(id, PhoneNumberDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: PhoneNumberDeleteParams = PhoneNumberDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: PhoneNumberDeleteParams = PhoneNumberDeleteParams.none(),
    ): CompletableFuture<PhoneNumberDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PhoneNumberDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberDeleteResponse>

    /** @see delete */
    fun delete(params: PhoneNumberDeleteParams): CompletableFuture<PhoneNumberDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberDeleteResponse> =
        delete(id, PhoneNumberDeleteParams.none(), requestOptions)

    /**
     * List phone numbers, This endpoint is a lighter version of the /phone_numbers endpoint having
     * higher performance and rate limit.
     */
    fun slimList(): CompletableFuture<PhoneNumberSlimListResponse> =
        slimList(PhoneNumberSlimListParams.none())

    /** @see slimList */
    fun slimList(
        params: PhoneNumberSlimListParams = PhoneNumberSlimListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberSlimListResponse>

    /** @see slimList */
    fun slimList(
        params: PhoneNumberSlimListParams = PhoneNumberSlimListParams.none()
    ): CompletableFuture<PhoneNumberSlimListResponse> = slimList(params, RequestOptions.none())

    /** @see slimList */
    fun slimList(requestOptions: RequestOptions): CompletableFuture<PhoneNumberSlimListResponse> =
        slimList(PhoneNumberSlimListParams.none(), requestOptions)

    /**
     * A view of [PhoneNumberServiceAsync] that provides access to raw HTTP responses for each
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
        ): PhoneNumberServiceAsync.WithRawResponse

        fun actions(): ActionServiceAsync.WithRawResponse

        fun csvDownloads(): CsvDownloadServiceAsync.WithRawResponse

        fun jobs(): JobServiceAsync.WithRawResponse

        fun messaging(): MessagingServiceAsync.WithRawResponse

        fun voice(): VoiceServiceAsync.WithRawResponse

        fun voicemail(): VoicemailServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /phone_numbers/{id}`, but is otherwise the same as
         * [PhoneNumberServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<PhoneNumberRetrieveResponse>> =
            retrieve(id, PhoneNumberRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: PhoneNumberRetrieveParams = PhoneNumberRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: PhoneNumberRetrieveParams = PhoneNumberRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PhoneNumberRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: PhoneNumberRetrieveParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberRetrieveResponse>> =
            retrieve(id, PhoneNumberRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /phone_numbers/{id}`, but is otherwise the same as
         * [PhoneNumberServiceAsync.update].
         */
        fun update(pathId: String): CompletableFuture<HttpResponseFor<PhoneNumberUpdateResponse>> =
            update(pathId, PhoneNumberUpdateParams.none())

        /** @see update */
        fun update(
            pathId: String,
            params: PhoneNumberUpdateParams = PhoneNumberUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberUpdateResponse>> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(
            pathId: String,
            params: PhoneNumberUpdateParams = PhoneNumberUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberUpdateResponse>> =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PhoneNumberUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberUpdateResponse>>

        /** @see update */
        fun update(
            params: PhoneNumberUpdateParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberUpdateResponse>> =
            update(pathId, PhoneNumberUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /phone_numbers`, but is otherwise the same as
         * [PhoneNumberServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PhoneNumberListResponse>> =
            list(PhoneNumberListParams.none())

        /** @see list */
        fun list(
            params: PhoneNumberListParams = PhoneNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberListResponse>>

        /** @see list */
        fun list(
            params: PhoneNumberListParams = PhoneNumberListParams.none()
        ): CompletableFuture<HttpResponseFor<PhoneNumberListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PhoneNumberListResponse>> =
            list(PhoneNumberListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /phone_numbers/{id}`, but is otherwise the same
         * as [PhoneNumberServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<PhoneNumberDeleteResponse>> =
            delete(id, PhoneNumberDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: PhoneNumberDeleteParams = PhoneNumberDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: PhoneNumberDeleteParams = PhoneNumberDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PhoneNumberDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberDeleteResponse>>

        /** @see delete */
        fun delete(
            params: PhoneNumberDeleteParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberDeleteResponse>> =
            delete(id, PhoneNumberDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /phone_numbers/slim`, but is otherwise the same as
         * [PhoneNumberServiceAsync.slimList].
         */
        fun slimList(): CompletableFuture<HttpResponseFor<PhoneNumberSlimListResponse>> =
            slimList(PhoneNumberSlimListParams.none())

        /** @see slimList */
        fun slimList(
            params: PhoneNumberSlimListParams = PhoneNumberSlimListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberSlimListResponse>>

        /** @see slimList */
        fun slimList(
            params: PhoneNumberSlimListParams = PhoneNumberSlimListParams.none()
        ): CompletableFuture<HttpResponseFor<PhoneNumberSlimListResponse>> =
            slimList(params, RequestOptions.none())

        /** @see slimList */
        fun slimList(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PhoneNumberSlimListResponse>> =
            slimList(PhoneNumberSlimListParams.none(), requestOptions)
    }
}
