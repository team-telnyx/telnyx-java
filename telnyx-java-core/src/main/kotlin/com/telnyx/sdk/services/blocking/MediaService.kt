// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface MediaService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MediaService

    /** Returns the information about a stored media file. */
    fun retrieve(mediaName: String): MediaRetrieveResponse =
        retrieve(mediaName, MediaRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        mediaName: String,
        params: MediaRetrieveParams = MediaRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaRetrieveResponse =
        retrieve(params.toBuilder().mediaName(mediaName).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        mediaName: String,
        params: MediaRetrieveParams = MediaRetrieveParams.none(),
    ): MediaRetrieveResponse = retrieve(mediaName, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MediaRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: MediaRetrieveParams): MediaRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(mediaName: String, requestOptions: RequestOptions): MediaRetrieveResponse =
        retrieve(mediaName, MediaRetrieveParams.none(), requestOptions)

    /** Updates a stored media file. */
    fun update(mediaName: String): MediaUpdateResponse = update(mediaName, MediaUpdateParams.none())

    /** @see update */
    fun update(
        mediaName: String,
        params: MediaUpdateParams = MediaUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaUpdateResponse = update(params.toBuilder().mediaName(mediaName).build(), requestOptions)

    /** @see update */
    fun update(
        mediaName: String,
        params: MediaUpdateParams = MediaUpdateParams.none(),
    ): MediaUpdateResponse = update(mediaName, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MediaUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaUpdateResponse

    /** @see update */
    fun update(params: MediaUpdateParams): MediaUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(mediaName: String, requestOptions: RequestOptions): MediaUpdateResponse =
        update(mediaName, MediaUpdateParams.none(), requestOptions)

    /** Returns a list of stored media files. */
    fun list(): MediaListResponse = list(MediaListParams.none())

    /** @see list */
    fun list(
        params: MediaListParams = MediaListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaListResponse

    /** @see list */
    fun list(params: MediaListParams = MediaListParams.none()): MediaListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MediaListResponse =
        list(MediaListParams.none(), requestOptions)

    /** Deletes a stored media file. */
    fun delete(mediaName: String) = delete(mediaName, MediaDeleteParams.none())

    /** @see delete */
    fun delete(
        mediaName: String,
        params: MediaDeleteParams = MediaDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().mediaName(mediaName).build(), requestOptions)

    /** @see delete */
    fun delete(mediaName: String, params: MediaDeleteParams = MediaDeleteParams.none()) =
        delete(mediaName, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: MediaDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: MediaDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(mediaName: String, requestOptions: RequestOptions) =
        delete(mediaName, MediaDeleteParams.none(), requestOptions)

    /** Downloads a stored media file. */
    @MustBeClosed
    fun download(mediaName: String): HttpResponse = download(mediaName, MediaDownloadParams.none())

    /** @see download */
    @MustBeClosed
    fun download(
        mediaName: String,
        params: MediaDownloadParams = MediaDownloadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = download(params.toBuilder().mediaName(mediaName).build(), requestOptions)

    /** @see download */
    @MustBeClosed
    fun download(
        mediaName: String,
        params: MediaDownloadParams = MediaDownloadParams.none(),
    ): HttpResponse = download(mediaName, params, RequestOptions.none())

    /** @see download */
    @MustBeClosed
    fun download(
        params: MediaDownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see download */
    @MustBeClosed
    fun download(params: MediaDownloadParams): HttpResponse =
        download(params, RequestOptions.none())

    /** @see download */
    @MustBeClosed
    fun download(mediaName: String, requestOptions: RequestOptions): HttpResponse =
        download(mediaName, MediaDownloadParams.none(), requestOptions)

    /** Upload media file to Telnyx so it can be used with other Telnyx services */
    fun upload(params: MediaUploadParams): MediaUploadResponse =
        upload(params, RequestOptions.none())

    /** @see upload */
    fun upload(
        params: MediaUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaUploadResponse

    /** A view of [MediaService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MediaService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /media/{media_name}`, but is otherwise the same as
         * [MediaService.retrieve].
         */
        @MustBeClosed
        fun retrieve(mediaName: String): HttpResponseFor<MediaRetrieveResponse> =
            retrieve(mediaName, MediaRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            mediaName: String,
            params: MediaRetrieveParams = MediaRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaRetrieveResponse> =
            retrieve(params.toBuilder().mediaName(mediaName).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            mediaName: String,
            params: MediaRetrieveParams = MediaRetrieveParams.none(),
        ): HttpResponseFor<MediaRetrieveResponse> =
            retrieve(mediaName, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MediaRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: MediaRetrieveParams): HttpResponseFor<MediaRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            mediaName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MediaRetrieveResponse> =
            retrieve(mediaName, MediaRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /media/{media_name}`, but is otherwise the same as
         * [MediaService.update].
         */
        @MustBeClosed
        fun update(mediaName: String): HttpResponseFor<MediaUpdateResponse> =
            update(mediaName, MediaUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            mediaName: String,
            params: MediaUpdateParams = MediaUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaUpdateResponse> =
            update(params.toBuilder().mediaName(mediaName).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            mediaName: String,
            params: MediaUpdateParams = MediaUpdateParams.none(),
        ): HttpResponseFor<MediaUpdateResponse> = update(mediaName, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: MediaUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: MediaUpdateParams): HttpResponseFor<MediaUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            mediaName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MediaUpdateResponse> =
            update(mediaName, MediaUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /media`, but is otherwise the same as
         * [MediaService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<MediaListResponse> = list(MediaListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MediaListParams = MediaListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MediaListParams = MediaListParams.none()
        ): HttpResponseFor<MediaListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MediaListResponse> =
            list(MediaListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /media/{media_name}`, but is otherwise the same
         * as [MediaService.delete].
         */
        @MustBeClosed
        fun delete(mediaName: String): HttpResponse = delete(mediaName, MediaDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            mediaName: String,
            params: MediaDeleteParams = MediaDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().mediaName(mediaName).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            mediaName: String,
            params: MediaDeleteParams = MediaDeleteParams.none(),
        ): HttpResponse = delete(mediaName, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: MediaDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: MediaDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(mediaName: String, requestOptions: RequestOptions): HttpResponse =
            delete(mediaName, MediaDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /media/{media_name}/download`, but is otherwise the
         * same as [MediaService.download].
         */
        @MustBeClosed
        fun download(mediaName: String): HttpResponse =
            download(mediaName, MediaDownloadParams.none())

        /** @see download */
        @MustBeClosed
        fun download(
            mediaName: String,
            params: MediaDownloadParams = MediaDownloadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = download(params.toBuilder().mediaName(mediaName).build(), requestOptions)

        /** @see download */
        @MustBeClosed
        fun download(
            mediaName: String,
            params: MediaDownloadParams = MediaDownloadParams.none(),
        ): HttpResponse = download(mediaName, params, RequestOptions.none())

        /** @see download */
        @MustBeClosed
        fun download(
            params: MediaDownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see download */
        @MustBeClosed
        fun download(params: MediaDownloadParams): HttpResponse =
            download(params, RequestOptions.none())

        /** @see download */
        @MustBeClosed
        fun download(mediaName: String, requestOptions: RequestOptions): HttpResponse =
            download(mediaName, MediaDownloadParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /media`, but is otherwise the same as
         * [MediaService.upload].
         */
        @MustBeClosed
        fun upload(params: MediaUploadParams): HttpResponseFor<MediaUploadResponse> =
            upload(params, RequestOptions.none())

        /** @see upload */
        @MustBeClosed
        fun upload(
            params: MediaUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaUploadResponse>
    }
}
