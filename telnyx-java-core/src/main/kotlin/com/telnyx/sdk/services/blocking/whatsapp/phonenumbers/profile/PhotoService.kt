// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp.phonenumbers.profile

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.whatsapp.phonenumbers.profile.photo.PhotoDeleteParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.profile.photo.PhotoRetrieveParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.profile.photo.PhotoRetrieveResponse
import com.telnyx.sdk.models.whatsapp.phonenumbers.profile.photo.PhotoUploadParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.profile.photo.PhotoUploadResponse
import java.util.function.Consumer

/** Manage Whatsapp phone numbers */
interface PhotoService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhotoService

    /** Get Whatsapp profile photo */
    fun retrieve(phoneNumber: String): PhotoRetrieveResponse =
        retrieve(phoneNumber, PhotoRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        params: PhotoRetrieveParams = PhotoRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhotoRetrieveResponse =
        retrieve(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        params: PhotoRetrieveParams = PhotoRetrieveParams.none(),
    ): PhotoRetrieveResponse = retrieve(phoneNumber, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PhotoRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhotoRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: PhotoRetrieveParams): PhotoRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(phoneNumber: String, requestOptions: RequestOptions): PhotoRetrieveResponse =
        retrieve(phoneNumber, PhotoRetrieveParams.none(), requestOptions)

    /** Delete Whatsapp profile photo */
    fun delete(phoneNumber: String) = delete(phoneNumber, PhotoDeleteParams.none())

    /** @see delete */
    fun delete(
        phoneNumber: String,
        params: PhotoDeleteParams = PhotoDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see delete */
    fun delete(phoneNumber: String, params: PhotoDeleteParams = PhotoDeleteParams.none()) =
        delete(phoneNumber, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: PhotoDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: PhotoDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(phoneNumber: String, requestOptions: RequestOptions) =
        delete(phoneNumber, PhotoDeleteParams.none(), requestOptions)

    /** Upload Whatsapp profile photo */
    fun upload(phoneNumber: String, params: PhotoUploadParams): PhotoUploadResponse =
        upload(phoneNumber, params, RequestOptions.none())

    /** @see upload */
    fun upload(
        phoneNumber: String,
        params: PhotoUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhotoUploadResponse =
        upload(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see upload */
    fun upload(params: PhotoUploadParams): PhotoUploadResponse =
        upload(params, RequestOptions.none())

    /** @see upload */
    fun upload(
        params: PhotoUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhotoUploadResponse

    /** A view of [PhotoService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhotoService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v2/whatsapp/phone_numbers/{phone_number}/profile/photo`, but is otherwise the same as
         * [PhotoService.retrieve].
         */
        @MustBeClosed
        fun retrieve(phoneNumber: String): HttpResponseFor<PhotoRetrieveResponse> =
            retrieve(phoneNumber, PhotoRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            phoneNumber: String,
            params: PhotoRetrieveParams = PhotoRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhotoRetrieveResponse> =
            retrieve(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            phoneNumber: String,
            params: PhotoRetrieveParams = PhotoRetrieveParams.none(),
        ): HttpResponseFor<PhotoRetrieveResponse> =
            retrieve(phoneNumber, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PhotoRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhotoRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: PhotoRetrieveParams): HttpResponseFor<PhotoRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhotoRetrieveResponse> =
            retrieve(phoneNumber, PhotoRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /v2/whatsapp/phone_numbers/{phone_number}/profile/photo`, but is otherwise the same as
         * [PhotoService.delete].
         */
        @MustBeClosed
        fun delete(phoneNumber: String): HttpResponse =
            delete(phoneNumber, PhotoDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            phoneNumber: String,
            params: PhotoDeleteParams = PhotoDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            phoneNumber: String,
            params: PhotoDeleteParams = PhotoDeleteParams.none(),
        ): HttpResponse = delete(phoneNumber, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PhotoDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: PhotoDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(phoneNumber: String, requestOptions: RequestOptions): HttpResponse =
            delete(phoneNumber, PhotoDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v2/whatsapp/phone_numbers/{phone_number}/profile/photo`, but is otherwise the same as
         * [PhotoService.upload].
         */
        @MustBeClosed
        fun upload(
            phoneNumber: String,
            params: PhotoUploadParams,
        ): HttpResponseFor<PhotoUploadResponse> = upload(phoneNumber, params, RequestOptions.none())

        /** @see upload */
        @MustBeClosed
        fun upload(
            phoneNumber: String,
            params: PhotoUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhotoUploadResponse> =
            upload(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see upload */
        @MustBeClosed
        fun upload(params: PhotoUploadParams): HttpResponseFor<PhotoUploadResponse> =
            upload(params, RequestOptions.none())

        /** @see upload */
        @MustBeClosed
        fun upload(
            params: PhotoUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhotoUploadResponse>
    }
}
