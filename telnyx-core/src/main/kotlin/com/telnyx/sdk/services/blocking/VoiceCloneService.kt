// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.voiceclones.VoiceCloneCreateFromUploadParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneCreateParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneDeleteParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneDownloadSampleParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneListPage
import com.telnyx.sdk.models.voiceclones.VoiceCloneListParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneResponse
import com.telnyx.sdk.models.voiceclones.VoiceCloneUpdateParams
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
    fun create(params: VoiceCloneCreateParams): VoiceCloneResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: VoiceCloneCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceCloneResponse

    /** @see create */
    fun create(
        voiceCloneRequest: VoiceCloneCreateParams.VoiceCloneRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceCloneResponse =
        create(
            VoiceCloneCreateParams.builder().voiceCloneRequest(voiceCloneRequest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(voiceCloneRequest: VoiceCloneCreateParams.VoiceCloneRequest): VoiceCloneResponse =
        create(voiceCloneRequest, RequestOptions.none())

    /** @see create */
    fun create(
        telnyxDesignClone: VoiceCloneCreateParams.VoiceCloneRequest.TelnyxDesignClone,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceCloneResponse =
        create(
            VoiceCloneCreateParams.VoiceCloneRequest.ofTelnyxDesignClone(telnyxDesignClone),
            requestOptions,
        )

    /** @see create */
    fun create(
        telnyxDesignClone: VoiceCloneCreateParams.VoiceCloneRequest.TelnyxDesignClone
    ): VoiceCloneResponse = create(telnyxDesignClone, RequestOptions.none())

    /** @see create */
    fun create(
        minimaxDesignClone: VoiceCloneCreateParams.VoiceCloneRequest.MinimaxDesignClone,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceCloneResponse =
        create(
            VoiceCloneCreateParams.VoiceCloneRequest.ofMinimaxDesignClone(minimaxDesignClone),
            requestOptions,
        )

    /** @see create */
    fun create(
        minimaxDesignClone: VoiceCloneCreateParams.VoiceCloneRequest.MinimaxDesignClone
    ): VoiceCloneResponse = create(minimaxDesignClone, RequestOptions.none())

    /** Updates the name, language, or gender of a voice clone. */
    fun update(id: String, params: VoiceCloneUpdateParams): VoiceCloneResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: VoiceCloneUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceCloneResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: VoiceCloneUpdateParams): VoiceCloneResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: VoiceCloneUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceCloneResponse

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
    fun createFromUpload(params: VoiceCloneCreateFromUploadParams): VoiceCloneResponse =
        createFromUpload(params, RequestOptions.none())

    /** @see createFromUpload */
    fun createFromUpload(
        params: VoiceCloneCreateFromUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceCloneResponse

    /** @see createFromUpload */
    fun createFromUpload(
        voiceCloneUploadRequest: VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceCloneResponse =
        createFromUpload(
            VoiceCloneCreateFromUploadParams.builder()
                .voiceCloneUploadRequest(voiceCloneUploadRequest)
                .build(),
            requestOptions,
        )

    /** @see createFromUpload */
    fun createFromUpload(
        voiceCloneUploadRequest: VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest
    ): VoiceCloneResponse = createFromUpload(voiceCloneUploadRequest, RequestOptions.none())

    /** @see createFromUpload */
    fun createFromUpload(
        telnyxQwen3TtsClone:
            VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest.TelnyxQwen3TtsClone,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceCloneResponse =
        createFromUpload(
            VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest.ofTelnyxQwen3TtsClone(
                telnyxQwen3TtsClone
            ),
            requestOptions,
        )

    /** @see createFromUpload */
    fun createFromUpload(
        telnyxQwen3TtsClone:
            VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest.TelnyxQwen3TtsClone
    ): VoiceCloneResponse = createFromUpload(telnyxQwen3TtsClone, RequestOptions.none())

    /** @see createFromUpload */
    fun createFromUpload(
        telnyxUltraClone: VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest.TelnyxUltraClone,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceCloneResponse =
        createFromUpload(
            VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest.ofTelnyxUltraClone(
                telnyxUltraClone
            ),
            requestOptions,
        )

    /** @see createFromUpload */
    fun createFromUpload(
        telnyxUltraClone: VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest.TelnyxUltraClone
    ): VoiceCloneResponse = createFromUpload(telnyxUltraClone, RequestOptions.none())

    /** @see createFromUpload */
    fun createFromUpload(
        minimaxClone: VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest.MinimaxClone,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceCloneResponse =
        createFromUpload(
            VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest.ofMinimaxClone(minimaxClone),
            requestOptions,
        )

    /** @see createFromUpload */
    fun createFromUpload(
        minimaxClone: VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest.MinimaxClone
    ): VoiceCloneResponse = createFromUpload(minimaxClone, RequestOptions.none())

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
        fun create(params: VoiceCloneCreateParams): HttpResponseFor<VoiceCloneResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: VoiceCloneCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceCloneResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            voiceCloneRequest: VoiceCloneCreateParams.VoiceCloneRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceCloneResponse> =
            create(
                VoiceCloneCreateParams.builder().voiceCloneRequest(voiceCloneRequest).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            voiceCloneRequest: VoiceCloneCreateParams.VoiceCloneRequest
        ): HttpResponseFor<VoiceCloneResponse> = create(voiceCloneRequest, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            telnyxDesignClone: VoiceCloneCreateParams.VoiceCloneRequest.TelnyxDesignClone,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceCloneResponse> =
            create(
                VoiceCloneCreateParams.VoiceCloneRequest.ofTelnyxDesignClone(telnyxDesignClone),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            telnyxDesignClone: VoiceCloneCreateParams.VoiceCloneRequest.TelnyxDesignClone
        ): HttpResponseFor<VoiceCloneResponse> = create(telnyxDesignClone, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            minimaxDesignClone: VoiceCloneCreateParams.VoiceCloneRequest.MinimaxDesignClone,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceCloneResponse> =
            create(
                VoiceCloneCreateParams.VoiceCloneRequest.ofMinimaxDesignClone(minimaxDesignClone),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            minimaxDesignClone: VoiceCloneCreateParams.VoiceCloneRequest.MinimaxDesignClone
        ): HttpResponseFor<VoiceCloneResponse> = create(minimaxDesignClone, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /voice_clones/{id}`, but is otherwise the same as
         * [VoiceCloneService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: VoiceCloneUpdateParams,
        ): HttpResponseFor<VoiceCloneResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: VoiceCloneUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceCloneResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: VoiceCloneUpdateParams): HttpResponseFor<VoiceCloneResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: VoiceCloneUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceCloneResponse>

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
        ): HttpResponseFor<VoiceCloneResponse> = createFromUpload(params, RequestOptions.none())

        /** @see createFromUpload */
        @MustBeClosed
        fun createFromUpload(
            params: VoiceCloneCreateFromUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceCloneResponse>

        /** @see createFromUpload */
        @MustBeClosed
        fun createFromUpload(
            voiceCloneUploadRequest: VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceCloneResponse> =
            createFromUpload(
                VoiceCloneCreateFromUploadParams.builder()
                    .voiceCloneUploadRequest(voiceCloneUploadRequest)
                    .build(),
                requestOptions,
            )

        /** @see createFromUpload */
        @MustBeClosed
        fun createFromUpload(
            voiceCloneUploadRequest: VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest
        ): HttpResponseFor<VoiceCloneResponse> =
            createFromUpload(voiceCloneUploadRequest, RequestOptions.none())

        /** @see createFromUpload */
        @MustBeClosed
        fun createFromUpload(
            telnyxQwen3TtsClone:
                VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest.TelnyxQwen3TtsClone,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceCloneResponse> =
            createFromUpload(
                VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest.ofTelnyxQwen3TtsClone(
                    telnyxQwen3TtsClone
                ),
                requestOptions,
            )

        /** @see createFromUpload */
        @MustBeClosed
        fun createFromUpload(
            telnyxQwen3TtsClone:
                VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest.TelnyxQwen3TtsClone
        ): HttpResponseFor<VoiceCloneResponse> =
            createFromUpload(telnyxQwen3TtsClone, RequestOptions.none())

        /** @see createFromUpload */
        @MustBeClosed
        fun createFromUpload(
            telnyxUltraClone:
                VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest.TelnyxUltraClone,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceCloneResponse> =
            createFromUpload(
                VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest.ofTelnyxUltraClone(
                    telnyxUltraClone
                ),
                requestOptions,
            )

        /** @see createFromUpload */
        @MustBeClosed
        fun createFromUpload(
            telnyxUltraClone:
                VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest.TelnyxUltraClone
        ): HttpResponseFor<VoiceCloneResponse> =
            createFromUpload(telnyxUltraClone, RequestOptions.none())

        /** @see createFromUpload */
        @MustBeClosed
        fun createFromUpload(
            minimaxClone: VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest.MinimaxClone,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceCloneResponse> =
            createFromUpload(
                VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest.ofMinimaxClone(
                    minimaxClone
                ),
                requestOptions,
            )

        /** @see createFromUpload */
        @MustBeClosed
        fun createFromUpload(
            minimaxClone: VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest.MinimaxClone
        ): HttpResponseFor<VoiceCloneResponse> =
            createFromUpload(minimaxClone, RequestOptions.none())

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
