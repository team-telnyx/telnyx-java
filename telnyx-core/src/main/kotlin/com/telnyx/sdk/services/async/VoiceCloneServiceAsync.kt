// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.voiceclones.VoiceCloneCreateFromDesignParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneCreateFromDesignResponse
import com.telnyx.sdk.models.voiceclones.VoiceCloneCreateFromUploadParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneCreateFromUploadResponse
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
     * Creates a new voice clone by capturing the voice identity of an existing voice design. The
     * clone can then be used for text-to-speech synthesis.
     */
    fun createFromDesign(
        params: VoiceCloneCreateFromDesignParams
    ): CompletableFuture<VoiceCloneCreateFromDesignResponse> =
        createFromDesign(params, RequestOptions.none())

    /** @see createFromDesign */
    fun createFromDesign(
        params: VoiceCloneCreateFromDesignParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceCloneCreateFromDesignResponse>

    /**
     * Creates a new voice clone by uploading an audio file directly. Supported formats: WAV, MP3,
     * FLAC, OGG, M4A. For best results, provide 5–10 seconds of clear speech. Maximum file size:
     * 2MB.
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
         * Returns a raw HTTP response for `post /voice_clones`, but is otherwise the same as
         * [VoiceCloneServiceAsync.createFromDesign].
         */
        fun createFromDesign(
            params: VoiceCloneCreateFromDesignParams
        ): CompletableFuture<HttpResponseFor<VoiceCloneCreateFromDesignResponse>> =
            createFromDesign(params, RequestOptions.none())

        /** @see createFromDesign */
        fun createFromDesign(
            params: VoiceCloneCreateFromDesignParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceCloneCreateFromDesignResponse>>

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
