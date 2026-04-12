// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.voiceclones.VoiceCloneCreateFromUploadParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneCreateFromUploadResponse
import com.telnyx.sdk.models.voiceclones.VoiceCloneCreateParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneCreateResponse
import com.telnyx.sdk.models.voiceclones.VoiceCloneDeleteParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneDownloadSampleParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneListPage
import com.telnyx.sdk.models.voiceclones.VoiceCloneListParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneUpdateParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneUpdateResponse
import java.util.function.Consumer

/** Capture and manage voice identities as clones for use in text-to-speech synthesis. */
interface VoiceCloneService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VoiceCloneService

    /**
     * Creates a new voice clone by capturing the voice identity of an existing voice design. The
     * clone can then be used for text-to-speech synthesis.
     */
    fun create(params: VoiceCloneCreateParams): VoiceCloneCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: VoiceCloneCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceCloneCreateResponse

    /** @see create */
    fun create(
        params: VoiceCloneCreateParams.Params,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceCloneCreateResponse =
        create(VoiceCloneCreateParams.builder().params(params).build(), requestOptions)

    /** @see create */
    fun create(params: VoiceCloneCreateParams.Params): VoiceCloneCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        telnyxDesignClone: VoiceCloneCreateParams.Params.TelnyxDesignClone,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceCloneCreateResponse =
        create(VoiceCloneCreateParams.Params.ofTelnyxDesignClone(telnyxDesignClone), requestOptions)

    /** @see create */
    fun create(
        telnyxDesignClone: VoiceCloneCreateParams.Params.TelnyxDesignClone
    ): VoiceCloneCreateResponse = create(telnyxDesignClone, RequestOptions.none())

    /** @see create */
    fun create(
        minimaxDesignClone: VoiceCloneCreateParams.Params.MinimaxDesignClone,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceCloneCreateResponse =
        create(
            VoiceCloneCreateParams.Params.ofMinimaxDesignClone(minimaxDesignClone),
            requestOptions,
        )

    /** @see create */
    fun create(
        minimaxDesignClone: VoiceCloneCreateParams.Params.MinimaxDesignClone
    ): VoiceCloneCreateResponse = create(minimaxDesignClone, RequestOptions.none())

    /** Updates the name, language, or gender of a voice clone. */
    fun update(id: String, params: VoiceCloneUpdateParams): VoiceCloneUpdateResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: VoiceCloneUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceCloneUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: VoiceCloneUpdateParams): VoiceCloneUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: VoiceCloneUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceCloneUpdateResponse

    /** Returns a paginated list of voice clones belonging to the authenticated account. */
    fun list(): VoiceCloneListPage = list(VoiceCloneListParams.none())

    /** @see list */
    fun list(
        params: VoiceCloneListParams = VoiceCloneListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceCloneListPage

    /** @see list */
    fun list(params: VoiceCloneListParams = VoiceCloneListParams.none()): VoiceCloneListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): VoiceCloneListPage =
        list(VoiceCloneListParams.none(), requestOptions)

    /** Permanently deletes a voice clone. This action cannot be undone. */
    fun delete(id: String) = delete(id, VoiceCloneDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: VoiceCloneDeleteParams = VoiceCloneDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: VoiceCloneDeleteParams = VoiceCloneDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: VoiceCloneDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: VoiceCloneDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, VoiceCloneDeleteParams.none(), requestOptions)

    /**
     * Creates a new voice clone by uploading an audio file directly. Supported formats: WAV, MP3,
     * FLAC, OGG, M4A. For best results, provide 5–10 seconds of clear speech. Maximum file size:
     * 5MB for Telnyx, 20MB for Minimax.
     */
    fun createFromUpload(
        params: VoiceCloneCreateFromUploadParams
    ): VoiceCloneCreateFromUploadResponse = createFromUpload(params, RequestOptions.none())

    /** @see createFromUpload */
    fun createFromUpload(
        params: VoiceCloneCreateFromUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceCloneCreateFromUploadResponse

    /** @see createFromUpload */
    fun createFromUpload(
        uploadParams: JsonValue,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceCloneCreateFromUploadResponse =
        createFromUpload(
            VoiceCloneCreateFromUploadParams.builder().uploadParams(uploadParams).build(),
            requestOptions,
        )

    /** @see createFromUpload */
    fun createFromUpload(uploadParams: JsonValue): VoiceCloneCreateFromUploadResponse =
        createFromUpload(uploadParams, RequestOptions.none())

    /** Downloads the WAV audio sample that was used to create the voice clone. */
    @MustBeClosed
    fun downloadSample(id: String): HttpResponse =
        downloadSample(id, VoiceCloneDownloadSampleParams.none())

    /** @see downloadSample */
    @MustBeClosed
    fun downloadSample(
        id: String,
        params: VoiceCloneDownloadSampleParams = VoiceCloneDownloadSampleParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = downloadSample(params.toBuilder().id(id).build(), requestOptions)

    /** @see downloadSample */
    @MustBeClosed
    fun downloadSample(
        id: String,
        params: VoiceCloneDownloadSampleParams = VoiceCloneDownloadSampleParams.none(),
    ): HttpResponse = downloadSample(id, params, RequestOptions.none())

    /** @see downloadSample */
    @MustBeClosed
    fun downloadSample(
        params: VoiceCloneDownloadSampleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see downloadSample */
    @MustBeClosed
    fun downloadSample(params: VoiceCloneDownloadSampleParams): HttpResponse =
        downloadSample(params, RequestOptions.none())

    /** @see downloadSample */
    @MustBeClosed
    fun downloadSample(id: String, requestOptions: RequestOptions): HttpResponse =
        downloadSample(id, VoiceCloneDownloadSampleParams.none(), requestOptions)

    /** A view of [VoiceCloneService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VoiceCloneService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /voice_clones`, but is otherwise the same as
         * [VoiceCloneService.create].
         */
        @MustBeClosed
        fun create(params: VoiceCloneCreateParams): HttpResponseFor<VoiceCloneCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: VoiceCloneCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceCloneCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: VoiceCloneCreateParams.Params,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceCloneCreateResponse> =
            create(VoiceCloneCreateParams.builder().params(params).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: VoiceCloneCreateParams.Params
        ): HttpResponseFor<VoiceCloneCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            telnyxDesignClone: VoiceCloneCreateParams.Params.TelnyxDesignClone,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceCloneCreateResponse> =
            create(
                VoiceCloneCreateParams.Params.ofTelnyxDesignClone(telnyxDesignClone),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            telnyxDesignClone: VoiceCloneCreateParams.Params.TelnyxDesignClone
        ): HttpResponseFor<VoiceCloneCreateResponse> =
            create(telnyxDesignClone, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            minimaxDesignClone: VoiceCloneCreateParams.Params.MinimaxDesignClone,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceCloneCreateResponse> =
            create(
                VoiceCloneCreateParams.Params.ofMinimaxDesignClone(minimaxDesignClone),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            minimaxDesignClone: VoiceCloneCreateParams.Params.MinimaxDesignClone
        ): HttpResponseFor<VoiceCloneCreateResponse> =
            create(minimaxDesignClone, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /voice_clones/{id}`, but is otherwise the same as
         * [VoiceCloneService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: VoiceCloneUpdateParams,
        ): HttpResponseFor<VoiceCloneUpdateResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: VoiceCloneUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceCloneUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: VoiceCloneUpdateParams): HttpResponseFor<VoiceCloneUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: VoiceCloneUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceCloneUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /voice_clones`, but is otherwise the same as
         * [VoiceCloneService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<VoiceCloneListPage> = list(VoiceCloneListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: VoiceCloneListParams = VoiceCloneListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceCloneListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: VoiceCloneListParams = VoiceCloneListParams.none()
        ): HttpResponseFor<VoiceCloneListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<VoiceCloneListPage> =
            list(VoiceCloneListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /voice_clones/{id}`, but is otherwise the same as
         * [VoiceCloneService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, VoiceCloneDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: VoiceCloneDeleteParams = VoiceCloneDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: VoiceCloneDeleteParams = VoiceCloneDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: VoiceCloneDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: VoiceCloneDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, VoiceCloneDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /voice_clones/from_upload`, but is otherwise the
         * same as [VoiceCloneService.createFromUpload].
         */
        @MustBeClosed
        fun createFromUpload(
            params: VoiceCloneCreateFromUploadParams
        ): HttpResponseFor<VoiceCloneCreateFromUploadResponse> =
            createFromUpload(params, RequestOptions.none())

        /** @see createFromUpload */
        @MustBeClosed
        fun createFromUpload(
            params: VoiceCloneCreateFromUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceCloneCreateFromUploadResponse>

        /** @see createFromUpload */
        @MustBeClosed
        fun createFromUpload(
            uploadParams: JsonValue,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceCloneCreateFromUploadResponse> =
            createFromUpload(
                VoiceCloneCreateFromUploadParams.builder().uploadParams(uploadParams).build(),
                requestOptions,
            )

        /** @see createFromUpload */
        @MustBeClosed
        fun createFromUpload(
            uploadParams: JsonValue
        ): HttpResponseFor<VoiceCloneCreateFromUploadResponse> =
            createFromUpload(uploadParams, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /voice_clones/{id}/sample`, but is otherwise the
         * same as [VoiceCloneService.downloadSample].
         */
        @MustBeClosed
        fun downloadSample(id: String): HttpResponse =
            downloadSample(id, VoiceCloneDownloadSampleParams.none())

        /** @see downloadSample */
        @MustBeClosed
        fun downloadSample(
            id: String,
            params: VoiceCloneDownloadSampleParams = VoiceCloneDownloadSampleParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = downloadSample(params.toBuilder().id(id).build(), requestOptions)

        /** @see downloadSample */
        @MustBeClosed
        fun downloadSample(
            id: String,
            params: VoiceCloneDownloadSampleParams = VoiceCloneDownloadSampleParams.none(),
        ): HttpResponse = downloadSample(id, params, RequestOptions.none())

        /** @see downloadSample */
        @MustBeClosed
        fun downloadSample(
            params: VoiceCloneDownloadSampleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see downloadSample */
        @MustBeClosed
        fun downloadSample(params: VoiceCloneDownloadSampleParams): HttpResponse =
            downloadSample(params, RequestOptions.none())

        /** @see downloadSample */
        @MustBeClosed
        fun downloadSample(id: String, requestOptions: RequestOptions): HttpResponse =
            downloadSample(id, VoiceCloneDownloadSampleParams.none(), requestOptions)
    }
}
