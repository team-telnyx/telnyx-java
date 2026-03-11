// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp.phonenumbers.profile

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.whatsapp.phonenumbers.profile.photo.PhotoDeleteParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.profile.photo.PhotoUploadParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.profile.photo.PhotoUploadResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage Whatsapp phone numbers */
interface PhotoServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhotoServiceAsync

    /** Delete Whatsapp profile photo */
    fun delete(phoneNumber: String): CompletableFuture<Void?> =
        delete(phoneNumber, PhotoDeleteParams.none())

    /** @see delete */
    fun delete(
        phoneNumber: String,
        params: PhotoDeleteParams = PhotoDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see delete */
    fun delete(
        phoneNumber: String,
        params: PhotoDeleteParams = PhotoDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(phoneNumber, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PhotoDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: PhotoDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(phoneNumber: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(phoneNumber, PhotoDeleteParams.none(), requestOptions)

    /** Upload Whatsapp profile photo */
    fun upload(
        phoneNumber: String,
        params: PhotoUploadParams,
    ): CompletableFuture<PhotoUploadResponse> = upload(phoneNumber, params, RequestOptions.none())

    /** @see upload */
    fun upload(
        phoneNumber: String,
        params: PhotoUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhotoUploadResponse> =
        upload(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see upload */
    fun upload(params: PhotoUploadParams): CompletableFuture<PhotoUploadResponse> =
        upload(params, RequestOptions.none())

    /** @see upload */
    fun upload(
        params: PhotoUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhotoUploadResponse>

    /** A view of [PhotoServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhotoServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete
         * /v2/whatsapp/phone_numbers/{phone_number}/profile/photo`, but is otherwise the same as
         * [PhotoServiceAsync.delete].
         */
        fun delete(phoneNumber: String): CompletableFuture<HttpResponse> =
            delete(phoneNumber, PhotoDeleteParams.none())

        /** @see delete */
        fun delete(
            phoneNumber: String,
            params: PhotoDeleteParams = PhotoDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see delete */
        fun delete(
            phoneNumber: String,
            params: PhotoDeleteParams = PhotoDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(phoneNumber, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PhotoDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: PhotoDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(phoneNumber, PhotoDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v2/whatsapp/phone_numbers/{phone_number}/profile/photo`, but is otherwise the same as
         * [PhotoServiceAsync.upload].
         */
        fun upload(
            phoneNumber: String,
            params: PhotoUploadParams,
        ): CompletableFuture<HttpResponseFor<PhotoUploadResponse>> =
            upload(phoneNumber, params, RequestOptions.none())

        /** @see upload */
        fun upload(
            phoneNumber: String,
            params: PhotoUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhotoUploadResponse>> =
            upload(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see upload */
        fun upload(
            params: PhotoUploadParams
        ): CompletableFuture<HttpResponseFor<PhotoUploadResponse>> =
            upload(params, RequestOptions.none())

        /** @see upload */
        fun upload(
            params: PhotoUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhotoUploadResponse>>
    }
}
