// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.voiceclones.VoiceCloneCreateFromUploadParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneCreateFromUploadResponse
import com.telnyx.sdk.models.voiceclones.VoiceCloneCreateParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneCreateResponse
import com.telnyx.sdk.models.voiceclones.VoiceCloneDeleteParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneDownloadSampleParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneListPageAsync
import com.telnyx.sdk.models.voiceclones.VoiceCloneListParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneUpdateParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneUpdateResponse
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
    fun create(params: VoiceCloneCreateParams): CompletableFuture<VoiceCloneCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: VoiceCloneCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceCloneCreateResponse>

    /** @see create */
    fun create(
        params: VoiceCloneCreateParams.Params,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceCloneCreateResponse> =
        create(VoiceCloneCreateParams.builder().params(params).build(), requestOptions)

    /** @see create */
    fun create(params: VoiceCloneCreateParams.Params): CompletableFuture<VoiceCloneCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        telnyxDesignClone: VoiceCloneCreateParams.Params.TelnyxDesignClone,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceCloneCreateResponse> =
        create(VoiceCloneCreateParams.Params.ofTelnyxDesignClone(telnyxDesignClone), requestOptions)

    /** @see create */
    fun create(
        telnyxDesignClone: VoiceCloneCreateParams.Params.TelnyxDesignClone
    ): CompletableFuture<VoiceCloneCreateResponse> =
        create(telnyxDesignClone, RequestOptions.none())

    /** @see create */
    fun create(
        minimaxDesignClone: VoiceCloneCreateParams.Params.MinimaxDesignClone,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceCloneCreateResponse> =
        create(
            VoiceCloneCreateParams.Params.ofMinimaxDesignClone(minimaxDesignClone),
            requestOptions,
        )

    /** @see create */
    fun create(
        minimaxDesignClone: VoiceCloneCreateParams.Params.MinimaxDesignClone
    ): CompletableFuture<VoiceCloneCreateResponse> =
        create(minimaxDesignClone, RequestOptions.none())

    /** Updates the name, language, or gender of a voice clone. */
    fun update(
        id: String,
        params: VoiceCloneUpdateParams,
    ): CompletableFuture<VoiceCloneUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: VoiceCloneUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceCloneUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: VoiceCloneUpdateParams): CompletableFuture<VoiceCloneUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: VoiceCloneUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceCloneUpdateResponse>

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
    ): CompletableFuture<VoiceCloneCreateFromUploadResponse> =
        createFromUpload(params, RequestOptions.none())

    /** @see createFromUpload */
    fun createFromUpload(
        params: VoiceCloneCreateFromUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceCloneCreateFromUploadResponse>

    /** @see createFromUpload */
    fun createFromUpload(
        params: VoiceCloneCreateFromUploadParams.Params,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceCloneCreateFromUploadResponse> =
        createFromUpload(
            VoiceCloneCreateFromUploadParams.builder().params(params).build(),
            requestOptions,
        )

    /** @see createFromUpload */
    fun createFromUpload(
        params: VoiceCloneCreateFromUploadParams.Params
    ): CompletableFuture<VoiceCloneCreateFromUploadResponse> =
        createFromUpload(params, RequestOptions.none())

    /** @see createFromUpload */
    fun createFromUpload(
        telnyxQwen3TtsClone: VoiceCloneCreateFromUploadParams.Params.TelnyxQwen3TtsClone,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceCloneCreateFromUploadResponse> =
        createFromUpload(
            VoiceCloneCreateFromUploadParams.Params.ofTelnyxQwen3TtsClone(telnyxQwen3TtsClone),
            requestOptions,
        )

    /** @see createFromUpload */
    fun createFromUpload(
        telnyxQwen3TtsClone: VoiceCloneCreateFromUploadParams.Params.TelnyxQwen3TtsClone
    ): CompletableFuture<VoiceCloneCreateFromUploadResponse> =
        createFromUpload(telnyxQwen3TtsClone, RequestOptions.none())

    /** @see createFromUpload */
    fun createFromUpload(
        telnyxUltraClone: VoiceCloneCreateFromUploadParams.Params.TelnyxUltraClone,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceCloneCreateFromUploadResponse> =
        createFromUpload(
            VoiceCloneCreateFromUploadParams.Params.ofTelnyxUltraClone(telnyxUltraClone),
            requestOptions,
        )

    /** @see createFromUpload */
    fun createFromUpload(
        telnyxUltraClone: VoiceCloneCreateFromUploadParams.Params.TelnyxUltraClone
    ): CompletableFuture<VoiceCloneCreateFromUploadResponse> =
        createFromUpload(telnyxUltraClone, RequestOptions.none())

    /** @see createFromUpload */
    fun createFromUpload(
        minimaxClone: VoiceCloneCreateFromUploadParams.Params.MinimaxClone,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceCloneCreateFromUploadResponse> =
        createFromUpload(
            VoiceCloneCreateFromUploadParams.Params.ofMinimaxClone(minimaxClone),
            requestOptions,
        )

    /** @see createFromUpload */
    fun createFromUpload(
        minimaxClone: VoiceCloneCreateFromUploadParams.Params.MinimaxClone
    ): CompletableFuture<VoiceCloneCreateFromUploadResponse> =
        createFromUpload(minimaxClone, RequestOptions.none())

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
        ): CompletableFuture<HttpResponseFor<VoiceCloneCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: VoiceCloneCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceCloneCreateResponse>>

        /** @see create */
        fun create(
            params: VoiceCloneCreateParams.Params,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceCloneCreateResponse>> =
            create(VoiceCloneCreateParams.builder().params(params).build(), requestOptions)

        /** @see create */
        fun create(
            params: VoiceCloneCreateParams.Params
        ): CompletableFuture<HttpResponseFor<VoiceCloneCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            telnyxDesignClone: VoiceCloneCreateParams.Params.TelnyxDesignClone,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceCloneCreateResponse>> =
            create(
                VoiceCloneCreateParams.Params.ofTelnyxDesignClone(telnyxDesignClone),
                requestOptions,
            )

        /** @see create */
        fun create(
            telnyxDesignClone: VoiceCloneCreateParams.Params.TelnyxDesignClone
        ): CompletableFuture<HttpResponseFor<VoiceCloneCreateResponse>> =
            create(telnyxDesignClone, RequestOptions.none())

        /** @see create */
        fun create(
            minimaxDesignClone: VoiceCloneCreateParams.Params.MinimaxDesignClone,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceCloneCreateResponse>> =
            create(
                VoiceCloneCreateParams.Params.ofMinimaxDesignClone(minimaxDesignClone),
                requestOptions,
            )

        /** @see create */
        fun create(
            minimaxDesignClone: VoiceCloneCreateParams.Params.MinimaxDesignClone
        ): CompletableFuture<HttpResponseFor<VoiceCloneCreateResponse>> =
            create(minimaxDesignClone, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /voice_clones/{id}`, but is otherwise the same as
         * [VoiceCloneServiceAsync.update].
         */
        fun update(
            id: String,
            params: VoiceCloneUpdateParams,
        ): CompletableFuture<HttpResponseFor<VoiceCloneUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: VoiceCloneUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceCloneUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: VoiceCloneUpdateParams
        ): CompletableFuture<HttpResponseFor<VoiceCloneUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: VoiceCloneUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceCloneUpdateResponse>>

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
        ): CompletableFuture<HttpResponseFor<VoiceCloneCreateFromUploadResponse>> =
            createFromUpload(params, RequestOptions.none())

        /** @see createFromUpload */
        fun createFromUpload(
            params: VoiceCloneCreateFromUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceCloneCreateFromUploadResponse>>

        /** @see createFromUpload */
        fun createFromUpload(
            params: VoiceCloneCreateFromUploadParams.Params,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceCloneCreateFromUploadResponse>> =
            createFromUpload(
                VoiceCloneCreateFromUploadParams.builder().params(params).build(),
                requestOptions,
            )

        /** @see createFromUpload */
        fun createFromUpload(
            params: VoiceCloneCreateFromUploadParams.Params
        ): CompletableFuture<HttpResponseFor<VoiceCloneCreateFromUploadResponse>> =
            createFromUpload(params, RequestOptions.none())

        /** @see createFromUpload */
        fun createFromUpload(
            telnyxQwen3TtsClone: VoiceCloneCreateFromUploadParams.Params.TelnyxQwen3TtsClone,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceCloneCreateFromUploadResponse>> =
            createFromUpload(
                VoiceCloneCreateFromUploadParams.Params.ofTelnyxQwen3TtsClone(telnyxQwen3TtsClone),
                requestOptions,
            )

        /** @see createFromUpload */
        fun createFromUpload(
            telnyxQwen3TtsClone: VoiceCloneCreateFromUploadParams.Params.TelnyxQwen3TtsClone
        ): CompletableFuture<HttpResponseFor<VoiceCloneCreateFromUploadResponse>> =
            createFromUpload(telnyxQwen3TtsClone, RequestOptions.none())

        /** @see createFromUpload */
        fun createFromUpload(
            telnyxUltraClone: VoiceCloneCreateFromUploadParams.Params.TelnyxUltraClone,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceCloneCreateFromUploadResponse>> =
            createFromUpload(
                VoiceCloneCreateFromUploadParams.Params.ofTelnyxUltraClone(telnyxUltraClone),
                requestOptions,
            )

        /** @see createFromUpload */
        fun createFromUpload(
            telnyxUltraClone: VoiceCloneCreateFromUploadParams.Params.TelnyxUltraClone
        ): CompletableFuture<HttpResponseFor<VoiceCloneCreateFromUploadResponse>> =
            createFromUpload(telnyxUltraClone, RequestOptions.none())

        /** @see createFromUpload */
        fun createFromUpload(
            minimaxClone: VoiceCloneCreateFromUploadParams.Params.MinimaxClone,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceCloneCreateFromUploadResponse>> =
            createFromUpload(
                VoiceCloneCreateFromUploadParams.Params.ofMinimaxClone(minimaxClone),
                requestOptions,
            )

        /** @see createFromUpload */
        fun createFromUpload(
            minimaxClone: VoiceCloneCreateFromUploadParams.Params.MinimaxClone
        ): CompletableFuture<HttpResponseFor<VoiceCloneCreateFromUploadResponse>> =
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
