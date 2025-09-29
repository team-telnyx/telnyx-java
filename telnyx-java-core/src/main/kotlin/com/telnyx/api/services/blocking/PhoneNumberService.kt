// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import com.telnyx.api.services.blocking.phonenumbers.ActionService
import com.telnyx.api.services.blocking.phonenumbers.CsvDownloadService
import com.telnyx.api.services.blocking.phonenumbers.JobService
import com.telnyx.api.services.blocking.phonenumbers.MessagingService
import com.telnyx.api.services.blocking.phonenumbers.VoiceService
import com.telnyx.api.services.blocking.phonenumbers.VoicemailService
import java.util.function.Consumer

interface PhoneNumberService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberService

    fun actions(): ActionService

    fun csvDownloads(): CsvDownloadService

    fun jobs(): JobService

    fun messaging(): MessagingService

    fun voice(): VoiceService

    fun voicemail(): VoicemailService

    /** Retrieve a phone number */
    fun retrieve(id: String): PhoneNumberRetrieveResponse =
        retrieve(id, PhoneNumberRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PhoneNumberRetrieveParams = PhoneNumberRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PhoneNumberRetrieveParams = PhoneNumberRetrieveParams.none(),
    ): PhoneNumberRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PhoneNumberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: PhoneNumberRetrieveParams): PhoneNumberRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): PhoneNumberRetrieveResponse =
        retrieve(id, PhoneNumberRetrieveParams.none(), requestOptions)

    /** Update a phone number */
    fun update(pathId: String): PhoneNumberUpdateResponse =
        update(pathId, PhoneNumberUpdateParams.none())

    /** @see update */
    fun update(
        pathId: String,
        params: PhoneNumberUpdateParams = PhoneNumberUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberUpdateResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(
        pathId: String,
        params: PhoneNumberUpdateParams = PhoneNumberUpdateParams.none(),
    ): PhoneNumberUpdateResponse = update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PhoneNumberUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberUpdateResponse

    /** @see update */
    fun update(params: PhoneNumberUpdateParams): PhoneNumberUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(pathId: String, requestOptions: RequestOptions): PhoneNumberUpdateResponse =
        update(pathId, PhoneNumberUpdateParams.none(), requestOptions)

    /** List phone numbers */
    fun list(): PhoneNumberListResponse = list(PhoneNumberListParams.none())

    /** @see list */
    fun list(
        params: PhoneNumberListParams = PhoneNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberListResponse

    /** @see list */
    fun list(
        params: PhoneNumberListParams = PhoneNumberListParams.none()
    ): PhoneNumberListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PhoneNumberListResponse =
        list(PhoneNumberListParams.none(), requestOptions)

    /** Delete a phone number */
    fun delete(id: String): PhoneNumberDeleteResponse = delete(id, PhoneNumberDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: PhoneNumberDeleteParams = PhoneNumberDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: PhoneNumberDeleteParams = PhoneNumberDeleteParams.none(),
    ): PhoneNumberDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PhoneNumberDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberDeleteResponse

    /** @see delete */
    fun delete(params: PhoneNumberDeleteParams): PhoneNumberDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): PhoneNumberDeleteResponse =
        delete(id, PhoneNumberDeleteParams.none(), requestOptions)

    /**
     * List phone numbers, This endpoint is a lighter version of the /phone_numbers endpoint having
     * higher performance and rate limit.
     */
    fun slimList(): PhoneNumberSlimListResponse = slimList(PhoneNumberSlimListParams.none())

    /** @see slimList */
    fun slimList(
        params: PhoneNumberSlimListParams = PhoneNumberSlimListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberSlimListResponse

    /** @see slimList */
    fun slimList(
        params: PhoneNumberSlimListParams = PhoneNumberSlimListParams.none()
    ): PhoneNumberSlimListResponse = slimList(params, RequestOptions.none())

    /** @see slimList */
    fun slimList(requestOptions: RequestOptions): PhoneNumberSlimListResponse =
        slimList(PhoneNumberSlimListParams.none(), requestOptions)

    /**
     * A view of [PhoneNumberService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumberService.WithRawResponse

        fun actions(): ActionService.WithRawResponse

        fun csvDownloads(): CsvDownloadService.WithRawResponse

        fun jobs(): JobService.WithRawResponse

        fun messaging(): MessagingService.WithRawResponse

        fun voice(): VoiceService.WithRawResponse

        fun voicemail(): VoicemailService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /phone_numbers/{id}`, but is otherwise the same as
         * [PhoneNumberService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<PhoneNumberRetrieveResponse> =
            retrieve(id, PhoneNumberRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PhoneNumberRetrieveParams = PhoneNumberRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PhoneNumberRetrieveParams = PhoneNumberRetrieveParams.none(),
        ): HttpResponseFor<PhoneNumberRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PhoneNumberRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PhoneNumberRetrieveParams
        ): HttpResponseFor<PhoneNumberRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberRetrieveResponse> =
            retrieve(id, PhoneNumberRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /phone_numbers/{id}`, but is otherwise the same as
         * [PhoneNumberService.update].
         */
        @MustBeClosed
        fun update(pathId: String): HttpResponseFor<PhoneNumberUpdateResponse> =
            update(pathId, PhoneNumberUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: PhoneNumberUpdateParams = PhoneNumberUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberUpdateResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: PhoneNumberUpdateParams = PhoneNumberUpdateParams.none(),
        ): HttpResponseFor<PhoneNumberUpdateResponse> =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: PhoneNumberUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: PhoneNumberUpdateParams): HttpResponseFor<PhoneNumberUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberUpdateResponse> =
            update(pathId, PhoneNumberUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /phone_numbers`, but is otherwise the same as
         * [PhoneNumberService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<PhoneNumberListResponse> = list(PhoneNumberListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PhoneNumberListParams = PhoneNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PhoneNumberListParams = PhoneNumberListParams.none()
        ): HttpResponseFor<PhoneNumberListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PhoneNumberListResponse> =
            list(PhoneNumberListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /phone_numbers/{id}`, but is otherwise the same
         * as [PhoneNumberService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<PhoneNumberDeleteResponse> =
            delete(id, PhoneNumberDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: PhoneNumberDeleteParams = PhoneNumberDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: PhoneNumberDeleteParams = PhoneNumberDeleteParams.none(),
        ): HttpResponseFor<PhoneNumberDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PhoneNumberDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: PhoneNumberDeleteParams): HttpResponseFor<PhoneNumberDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberDeleteResponse> =
            delete(id, PhoneNumberDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /phone_numbers/slim`, but is otherwise the same as
         * [PhoneNumberService.slimList].
         */
        @MustBeClosed
        fun slimList(): HttpResponseFor<PhoneNumberSlimListResponse> =
            slimList(PhoneNumberSlimListParams.none())

        /** @see slimList */
        @MustBeClosed
        fun slimList(
            params: PhoneNumberSlimListParams = PhoneNumberSlimListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberSlimListResponse>

        /** @see slimList */
        @MustBeClosed
        fun slimList(
            params: PhoneNumberSlimListParams = PhoneNumberSlimListParams.none()
        ): HttpResponseFor<PhoneNumberSlimListResponse> = slimList(params, RequestOptions.none())

        /** @see slimList */
        @MustBeClosed
        fun slimList(requestOptions: RequestOptions): HttpResponseFor<PhoneNumberSlimListResponse> =
            slimList(PhoneNumberSlimListParams.none(), requestOptions)
    }
}
