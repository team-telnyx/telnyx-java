// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.voiceclones.VoiceCloneCreateFromUploadParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneCreateParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneDeleteParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneDownloadSampleParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneListPageAsync
import com.telnyx.sdk.models.voiceclones.VoiceCloneListParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneResponse
import com.telnyx.sdk.models.voiceclones.VoiceCloneUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Capture and manage voice identities as clones for use in text-to-speech synthesis. */
interface VoiceCloneServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VoiceCloneServiceAsync

    /**
     * Creates a new voice clone by capturing the voice identity of an existing voice design. The
     * clone can then be used for text-to-speech synthesis.
     */
    fun create(params: VoiceCloneCreateParams): CompletableFuture<VoiceCloneResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: VoiceCloneCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceCloneResponse>

    /** @see create */
    fun create(
        voiceCloneRequest: VoiceCloneCreateParams.VoiceCloneRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceCloneResponse> =
        create(
            VoiceCloneCreateParams.builder().voiceCloneRequest(voiceCloneRequest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        voiceCloneRequest: VoiceCloneCreateParams.VoiceCloneRequest
    ): CompletableFuture<VoiceCloneResponse> = create(voiceCloneRequest, RequestOptions.none())

    /** @see create */
    fun create(
        telnyxDesignClone: VoiceCloneCreateParams.VoiceCloneRequest.TelnyxDesignClone,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceCloneResponse> =
        create(
            VoiceCloneCreateParams.VoiceCloneRequest.ofTelnyxDesignClone(telnyxDesignClone),
            requestOptions,
        )

    /** @see create */
    fun create(
        telnyxDesignClone: VoiceCloneCreateParams.VoiceCloneRequest.TelnyxDesignClone
    ): CompletableFuture<VoiceCloneResponse> = create(telnyxDesignClone, RequestOptions.none())

    /** @see create */
    fun create(
        minimaxDesignClone: VoiceCloneCreateParams.VoiceCloneRequest.MinimaxDesignClone,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceCloneResponse> =
        create(
            VoiceCloneCreateParams.VoiceCloneRequest.ofMinimaxDesignClone(minimaxDesignClone),
            requestOptions,
        )

    /** @see create */
    fun create(
        minimaxDesignClone: VoiceCloneCreateParams.VoiceCloneRequest.MinimaxDesignClone
    ): CompletableFuture<VoiceCloneResponse> = create(minimaxDesignClone, RequestOptions.none())

    /** Updates the name, language, or gender of a voice clone. */
    fun update(id: String, params: VoiceCloneUpdateParams): CompletableFuture<VoiceCloneResponse> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: VoiceCloneUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceCloneResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: VoiceCloneUpdateParams): CompletableFuture<VoiceCloneResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: VoiceCloneUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceCloneResponse>

    /** Returns a paginated list of voice clones belonging to the authenticated account. */
    fun list(): CompletableFuture<VoiceCloneListPageAsync> = list(VoiceCloneListParams.none())

    /** @see list */
    fun list(
        params: VoiceCloneListParams = VoiceCloneListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceCloneListPageAsync>

    /** @see list */
    fun list(
        params: VoiceCloneListParams = VoiceCloneListParams.none()
    ): CompletableFuture<VoiceCloneListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<VoiceCloneListPageAsync> =
        list(VoiceCloneListParams.none(), requestOptions)

    /** Permanently deletes a voice clone. This action cannot be undone. */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, VoiceCloneDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: VoiceCloneDeleteParams = VoiceCloneDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: VoiceCloneDeleteParams = VoiceCloneDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: VoiceCloneDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: VoiceCloneDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, VoiceCloneDeleteParams.none(), requestOptions)

    /**
     * Creates a new voice clone by uploading an audio file directly. Supported formats: WAV, MP3,
     * FLAC, OGG, M4A. For best results, provide 5–10 seconds of clear speech. Maximum file size:
     * 5MB for Telnyx, 20MB for Minimax.
     */
    fun createFromUpload(
        params: VoiceCloneCreateFromUploadParams
    ): CompletableFuture<VoiceCloneResponse> = createFromUpload(params, RequestOptions.none())

    /** @see createFromUpload */
    fun createFromUpload(
        params: VoiceCloneCreateFromUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceCloneResponse>

    /** @see createFromUpload */
    fun createFromUpload(
        voiceCloneUploadRequest: VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceCloneResponse> =
        createFromUpload(
            VoiceCloneCreateFromUploadParams.builder()
                .voiceCloneUploadRequest(voiceCloneUploadRequest)
                .build(),
            requestOptions,
        )

    /** @see createFromUpload */
    fun createFromUpload(
        voiceCloneUploadRequest: VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest
    ): CompletableFuture<VoiceCloneResponse> =
        createFromUpload(voiceCloneUploadRequest, RequestOptions.none())

    /** @see createFromUpload */
    fun createFromUpload(
        telnyxQwen3TtsClone:
            VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest.TelnyxQwen3TtsClone,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceCloneResponse> =
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
    ): CompletableFuture<VoiceCloneResponse> =
        createFromUpload(telnyxQwen3TtsClone, RequestOptions.none())

    /** @see createFromUpload */
    fun createFromUpload(
        telnyxUltraClone: VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest.TelnyxUltraClone,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceCloneResponse> =
        createFromUpload(
            VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest.ofTelnyxUltraClone(
                telnyxUltraClone
            ),
            requestOptions,
        )

    /** @see createFromUpload */
    fun createFromUpload(
        telnyxUltraClone: VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest.TelnyxUltraClone
    ): CompletableFuture<VoiceCloneResponse> =
        createFromUpload(telnyxUltraClone, RequestOptions.none())

    /** @see createFromUpload */
    fun createFromUpload(
        minimaxClone: VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest.MinimaxClone,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceCloneResponse> =
        createFromUpload(
            VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest.ofMinimaxClone(minimaxClone),
            requestOptions,
        )

    /** @see createFromUpload */
    fun createFromUpload(
        minimaxClone: VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest.MinimaxClone
    ): CompletableFuture<VoiceCloneResponse> = createFromUpload(minimaxClone, RequestOptions.none())

    /** Downloads the WAV audio sample that was used to create the voice clone. */
    fun downloadSample(id: String): CompletableFuture<HttpResponse> =
        downloadSample(id, VoiceCloneDownloadSampleParams.none())

    /** @see downloadSample */
    fun downloadSample(
        id: String,
        params: VoiceCloneDownloadSampleParams = VoiceCloneDownloadSampleParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        downloadSample(params.toBuilder().id(id).build(), requestOptions)

    /** @see downloadSample */
    fun downloadSample(
        id: String,
        params: VoiceCloneDownloadSampleParams = VoiceCloneDownloadSampleParams.none(),
    ): CompletableFuture<HttpResponse> = downloadSample(id, params, RequestOptions.none())

    /** @see downloadSample */
    fun downloadSample(
        params: VoiceCloneDownloadSampleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see downloadSample */
    fun downloadSample(params: VoiceCloneDownloadSampleParams): CompletableFuture<HttpResponse> =
        downloadSample(params, RequestOptions.none())

    /** @see downloadSample */
    fun downloadSample(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        downloadSample(id, VoiceCloneDownloadSampleParams.none(), requestOptions)

    /**
     * A view of [VoiceCloneServiceAsync] that provides access to raw HTTP responses for each
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
        ): VoiceCloneServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /voice_clones`, but is otherwise the same as
         * [VoiceCloneServiceAsync.create].
         */
        fun create(
            params: VoiceCloneCreateParams
        ): CompletableFuture<HttpResponseFor<VoiceCloneResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: VoiceCloneCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceCloneResponse>>

        /** @see create */
        fun create(
            voiceCloneRequest: VoiceCloneCreateParams.VoiceCloneRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceCloneResponse>> =
            create(
                VoiceCloneCreateParams.builder().voiceCloneRequest(voiceCloneRequest).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            voiceCloneRequest: VoiceCloneCreateParams.VoiceCloneRequest
        ): CompletableFuture<HttpResponseFor<VoiceCloneResponse>> =
            create(voiceCloneRequest, RequestOptions.none())

        /** @see create */
        fun create(
            telnyxDesignClone: VoiceCloneCreateParams.VoiceCloneRequest.TelnyxDesignClone,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceCloneResponse>> =
            create(
                VoiceCloneCreateParams.VoiceCloneRequest.ofTelnyxDesignClone(telnyxDesignClone),
                requestOptions,
            )

        /** @see create */
        fun create(
            telnyxDesignClone: VoiceCloneCreateParams.VoiceCloneRequest.TelnyxDesignClone
        ): CompletableFuture<HttpResponseFor<VoiceCloneResponse>> =
            create(telnyxDesignClone, RequestOptions.none())

        /** @see create */
        fun create(
            minimaxDesignClone: VoiceCloneCreateParams.VoiceCloneRequest.MinimaxDesignClone,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceCloneResponse>> =
            create(
                VoiceCloneCreateParams.VoiceCloneRequest.ofMinimaxDesignClone(minimaxDesignClone),
                requestOptions,
            )

        /** @see create */
        fun create(
            minimaxDesignClone: VoiceCloneCreateParams.VoiceCloneRequest.MinimaxDesignClone
        ): CompletableFuture<HttpResponseFor<VoiceCloneResponse>> =
            create(minimaxDesignClone, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /voice_clones/{id}`, but is otherwise the same as
         * [VoiceCloneServiceAsync.update].
         */
        fun update(
            id: String,
            params: VoiceCloneUpdateParams,
        ): CompletableFuture<HttpResponseFor<VoiceCloneResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: VoiceCloneUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceCloneResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: VoiceCloneUpdateParams
        ): CompletableFuture<HttpResponseFor<VoiceCloneResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: VoiceCloneUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceCloneResponse>>

        /**
         * Returns a raw HTTP response for `get /voice_clones`, but is otherwise the same as
         * [VoiceCloneServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<VoiceCloneListPageAsync>> =
            list(VoiceCloneListParams.none())

        /** @see list */
        fun list(
            params: VoiceCloneListParams = VoiceCloneListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceCloneListPageAsync>>

        /** @see list */
        fun list(
            params: VoiceCloneListParams = VoiceCloneListParams.none()
        ): CompletableFuture<HttpResponseFor<VoiceCloneListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<VoiceCloneListPageAsync>> =
            list(VoiceCloneListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /voice_clones/{id}`, but is otherwise the same as
         * [VoiceCloneServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, VoiceCloneDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: VoiceCloneDeleteParams = VoiceCloneDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: VoiceCloneDeleteParams = VoiceCloneDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: VoiceCloneDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: VoiceCloneDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, VoiceCloneDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /voice_clones/from_upload`, but is otherwise the
         * same as [VoiceCloneServiceAsync.createFromUpload].
         */
        fun createFromUpload(
            params: VoiceCloneCreateFromUploadParams
        ): CompletableFuture<HttpResponseFor<VoiceCloneResponse>> =
            createFromUpload(params, RequestOptions.none())

        /** @see createFromUpload */
        fun createFromUpload(
            params: VoiceCloneCreateFromUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceCloneResponse>>

        /** @see createFromUpload */
        fun createFromUpload(
            voiceCloneUploadRequest: VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceCloneResponse>> =
            createFromUpload(
                VoiceCloneCreateFromUploadParams.builder()
                    .voiceCloneUploadRequest(voiceCloneUploadRequest)
                    .build(),
                requestOptions,
            )

        /** @see createFromUpload */
        fun createFromUpload(
            voiceCloneUploadRequest: VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest
        ): CompletableFuture<HttpResponseFor<VoiceCloneResponse>> =
            createFromUpload(voiceCloneUploadRequest, RequestOptions.none())

        /** @see createFromUpload */
        fun createFromUpload(
            telnyxQwen3TtsClone:
                VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest.TelnyxQwen3TtsClone,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceCloneResponse>> =
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
        ): CompletableFuture<HttpResponseFor<VoiceCloneResponse>> =
            createFromUpload(telnyxQwen3TtsClone, RequestOptions.none())

        /** @see createFromUpload */
        fun createFromUpload(
            telnyxUltraClone:
                VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest.TelnyxUltraClone,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceCloneResponse>> =
            createFromUpload(
                VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest.ofTelnyxUltraClone(
                    telnyxUltraClone
                ),
                requestOptions,
            )

        /** @see createFromUpload */
        fun createFromUpload(
            telnyxUltraClone:
                VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest.TelnyxUltraClone
        ): CompletableFuture<HttpResponseFor<VoiceCloneResponse>> =
            createFromUpload(telnyxUltraClone, RequestOptions.none())

        /** @see createFromUpload */
        fun createFromUpload(
            minimaxClone: VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest.MinimaxClone,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceCloneResponse>> =
            createFromUpload(
                VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest.ofMinimaxClone(
                    minimaxClone
                ),
                requestOptions,
            )

        /** @see createFromUpload */
        fun createFromUpload(
            minimaxClone: VoiceCloneCreateFromUploadParams.VoiceCloneUploadRequest.MinimaxClone
        ): CompletableFuture<HttpResponseFor<VoiceCloneResponse>> =
            createFromUpload(minimaxClone, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /voice_clones/{id}/sample`, but is otherwise the
         * same as [VoiceCloneServiceAsync.downloadSample].
         */
        fun downloadSample(id: String): CompletableFuture<HttpResponse> =
            downloadSample(id, VoiceCloneDownloadSampleParams.none())

        /** @see downloadSample */
        fun downloadSample(
            id: String,
            params: VoiceCloneDownloadSampleParams = VoiceCloneDownloadSampleParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            downloadSample(params.toBuilder().id(id).build(), requestOptions)

        /** @see downloadSample */
        fun downloadSample(
            id: String,
            params: VoiceCloneDownloadSampleParams = VoiceCloneDownloadSampleParams.none(),
        ): CompletableFuture<HttpResponse> = downloadSample(id, params, RequestOptions.none())

        /** @see downloadSample */
        fun downloadSample(
            params: VoiceCloneDownloadSampleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see downloadSample */
        fun downloadSample(
            params: VoiceCloneDownloadSampleParams
        ): CompletableFuture<HttpResponse> = downloadSample(params, RequestOptions.none())

        /** @see downloadSample */
        fun downloadSample(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            downloadSample(id, VoiceCloneDownloadSampleParams.none(), requestOptions)
    }
}
