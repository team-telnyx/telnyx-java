// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.media.MediaDeleteParams
import com.telnyx.sdk.models.media.MediaDownloadParams
import com.telnyx.sdk.models.media.MediaListParams
import com.telnyx.sdk.models.media.MediaListResponse
import com.telnyx.sdk.models.media.MediaRetrieveParams
import com.telnyx.sdk.models.media.MediaRetrieveResponse
import com.telnyx.sdk.models.media.MediaUpdateParams
import com.telnyx.sdk.models.media.MediaUpdateResponse
import com.telnyx.sdk.models.media.MediaUploadParams
import com.telnyx.sdk.models.media.MediaUploadResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Media Storage operations */
interface MediaServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MediaServiceAsync

    /** Returns the information about a stored media file. */
    fun retrieve(mediaName: String): CompletableFuture<MediaRetrieveResponse> =
        retrieve(mediaName, MediaRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        mediaName: String,
        params: MediaRetrieveParams = MediaRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaRetrieveResponse> =
        retrieve(params.toBuilder().mediaName(mediaName).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        mediaName: String,
        params: MediaRetrieveParams = MediaRetrieveParams.none(),
    ): CompletableFuture<MediaRetrieveResponse> = retrieve(mediaName, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MediaRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: MediaRetrieveParams): CompletableFuture<MediaRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        mediaName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MediaRetrieveResponse> =
        retrieve(mediaName, MediaRetrieveParams.none(), requestOptions)

    /** Updates a stored media file. */
    fun update(mediaName: String): CompletableFuture<MediaUpdateResponse> =
        update(mediaName, MediaUpdateParams.none())

    /** @see update */
    fun update(
        mediaName: String,
        params: MediaUpdateParams = MediaUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaUpdateResponse> =
        update(params.toBuilder().mediaName(mediaName).build(), requestOptions)

    /** @see update */
    fun update(
        mediaName: String,
        params: MediaUpdateParams = MediaUpdateParams.none(),
    ): CompletableFuture<MediaUpdateResponse> = update(mediaName, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MediaUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaUpdateResponse>

    /** @see update */
    fun update(params: MediaUpdateParams): CompletableFuture<MediaUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        mediaName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MediaUpdateResponse> =
        update(mediaName, MediaUpdateParams.none(), requestOptions)

    /** Returns a list of stored media files. */
    fun list(): CompletableFuture<MediaListResponse> = list(MediaListParams.none())

    /** @see list */
    fun list(
        params: MediaListParams = MediaListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaListResponse>

    /** @see list */
    fun list(
        params: MediaListParams = MediaListParams.none()
    ): CompletableFuture<MediaListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MediaListResponse> =
        list(MediaListParams.none(), requestOptions)

    /** Deletes a stored media file. */
    fun delete(mediaName: String): CompletableFuture<Void?> =
        delete(mediaName, MediaDeleteParams.none())

    /** @see delete */
    fun delete(
        mediaName: String,
        params: MediaDeleteParams = MediaDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().mediaName(mediaName).build(), requestOptions)

    /** @see delete */
    fun delete(
        mediaName: String,
        params: MediaDeleteParams = MediaDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(mediaName, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MediaDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: MediaDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(mediaName: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(mediaName, MediaDeleteParams.none(), requestOptions)

    /** Downloads a stored media file. */
    fun download(mediaName: String): CompletableFuture<HttpResponse> =
        download(mediaName, MediaDownloadParams.none())

    /** @see download */
    fun download(
        mediaName: String,
        params: MediaDownloadParams = MediaDownloadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        download(params.toBuilder().mediaName(mediaName).build(), requestOptions)

    /** @see download */
    fun download(
        mediaName: String,
        params: MediaDownloadParams = MediaDownloadParams.none(),
    ): CompletableFuture<HttpResponse> = download(mediaName, params, RequestOptions.none())

    /** @see download */
    fun download(
        params: MediaDownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see download */
    fun download(params: MediaDownloadParams): CompletableFuture<HttpResponse> =
        download(params, RequestOptions.none())

    /** @see download */
    fun download(
        mediaName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        download(mediaName, MediaDownloadParams.none(), requestOptions)

    /** Upload media file to Telnyx so it can be used with other Telnyx services */
    fun upload(params: MediaUploadParams): CompletableFuture<MediaUploadResponse> =
        upload(params, RequestOptions.none())

    /** @see upload */
    fun upload(
        params: MediaUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaUploadResponse>

    /** A view of [MediaServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MediaServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /media/{media_name}`, but is otherwise the same as
         * [MediaServiceAsync.retrieve].
         */
        fun retrieve(mediaName: String): CompletableFuture<HttpResponseFor<MediaRetrieveResponse>> =
            retrieve(mediaName, MediaRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            mediaName: String,
            params: MediaRetrieveParams = MediaRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaRetrieveResponse>> =
            retrieve(params.toBuilder().mediaName(mediaName).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            mediaName: String,
            params: MediaRetrieveParams = MediaRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<MediaRetrieveResponse>> =
            retrieve(mediaName, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: MediaRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: MediaRetrieveParams
        ): CompletableFuture<HttpResponseFor<MediaRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            mediaName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MediaRetrieveResponse>> =
            retrieve(mediaName, MediaRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /media/{media_name}`, but is otherwise the same as
         * [MediaServiceAsync.update].
         */
        fun update(mediaName: String): CompletableFuture<HttpResponseFor<MediaUpdateResponse>> =
            update(mediaName, MediaUpdateParams.none())

        /** @see update */
        fun update(
            mediaName: String,
            params: MediaUpdateParams = MediaUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaUpdateResponse>> =
            update(params.toBuilder().mediaName(mediaName).build(), requestOptions)

        /** @see update */
        fun update(
            mediaName: String,
            params: MediaUpdateParams = MediaUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<MediaUpdateResponse>> =
            update(mediaName, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: MediaUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaUpdateResponse>>

        /** @see update */
        fun update(
            params: MediaUpdateParams
        ): CompletableFuture<HttpResponseFor<MediaUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            mediaName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MediaUpdateResponse>> =
            update(mediaName, MediaUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /media`, but is otherwise the same as
         * [MediaServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MediaListResponse>> =
            list(MediaListParams.none())

        /** @see list */
        fun list(
            params: MediaListParams = MediaListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaListResponse>>

        /** @see list */
        fun list(
            params: MediaListParams = MediaListParams.none()
        ): CompletableFuture<HttpResponseFor<MediaListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MediaListResponse>> =
            list(MediaListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /media/{media_name}`, but is otherwise the same
         * as [MediaServiceAsync.delete].
         */
        fun delete(mediaName: String): CompletableFuture<HttpResponse> =
            delete(mediaName, MediaDeleteParams.none())

        /** @see delete */
        fun delete(
            mediaName: String,
            params: MediaDeleteParams = MediaDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().mediaName(mediaName).build(), requestOptions)

        /** @see delete */
        fun delete(
            mediaName: String,
            params: MediaDeleteParams = MediaDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(mediaName, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: MediaDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: MediaDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            mediaName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(mediaName, MediaDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /media/{media_name}/download`, but is otherwise the
         * same as [MediaServiceAsync.download].
         */
        fun download(mediaName: String): CompletableFuture<HttpResponse> =
            download(mediaName, MediaDownloadParams.none())

        /** @see download */
        fun download(
            mediaName: String,
            params: MediaDownloadParams = MediaDownloadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            download(params.toBuilder().mediaName(mediaName).build(), requestOptions)

        /** @see download */
        fun download(
            mediaName: String,
            params: MediaDownloadParams = MediaDownloadParams.none(),
        ): CompletableFuture<HttpResponse> = download(mediaName, params, RequestOptions.none())

        /** @see download */
        fun download(
            params: MediaDownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see download */
        fun download(params: MediaDownloadParams): CompletableFuture<HttpResponse> =
            download(params, RequestOptions.none())

        /** @see download */
        fun download(
            mediaName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            download(mediaName, MediaDownloadParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /media`, but is otherwise the same as
         * [MediaServiceAsync.upload].
         */
        fun upload(
            params: MediaUploadParams
        ): CompletableFuture<HttpResponseFor<MediaUploadResponse>> =
            upload(params, RequestOptions.none())

        /** @see upload */
        fun upload(
            params: MediaUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaUploadResponse>>
    }
}
