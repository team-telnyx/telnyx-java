// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.voicedesigns.VoiceDesignCreateParams
import com.telnyx.sdk.models.voicedesigns.VoiceDesignCreateResponse
import com.telnyx.sdk.models.voicedesigns.VoiceDesignDeleteParams
import com.telnyx.sdk.models.voicedesigns.VoiceDesignDeleteVersionParams
import com.telnyx.sdk.models.voicedesigns.VoiceDesignDownloadSampleParams
import com.telnyx.sdk.models.voicedesigns.VoiceDesignListPageAsync
import com.telnyx.sdk.models.voicedesigns.VoiceDesignListParams
import com.telnyx.sdk.models.voicedesigns.VoiceDesignRenameParams
import com.telnyx.sdk.models.voicedesigns.VoiceDesignRenameResponse
import com.telnyx.sdk.models.voicedesigns.VoiceDesignRetrieveParams
import com.telnyx.sdk.models.voicedesigns.VoiceDesignRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Create and manage AI-generated voice designs using natural language prompts. */
interface VoiceDesignServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VoiceDesignServiceAsync

    /**
     * Creates a new voice design (version 1) when `voice_design_id` is omitted. When
     * `voice_design_id` is provided, adds a new version to the existing design instead. A design
     * can have at most 50 versions.
     */
    fun create(params: VoiceDesignCreateParams): CompletableFuture<VoiceDesignCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: VoiceDesignCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceDesignCreateResponse>

    /**
     * Returns the latest version of a voice design, or a specific version when `?version=N` is
     * provided. The `id` parameter accepts either a UUID or the design name.
     */
    fun retrieve(id: String): CompletableFuture<VoiceDesignRetrieveResponse> =
        retrieve(id, VoiceDesignRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: VoiceDesignRetrieveParams = VoiceDesignRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceDesignRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: VoiceDesignRetrieveParams = VoiceDesignRetrieveParams.none(),
    ): CompletableFuture<VoiceDesignRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VoiceDesignRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceDesignRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: VoiceDesignRetrieveParams
    ): CompletableFuture<VoiceDesignRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VoiceDesignRetrieveResponse> =
        retrieve(id, VoiceDesignRetrieveParams.none(), requestOptions)

    /** Returns a paginated list of voice designs belonging to the authenticated account. */
    fun list(): CompletableFuture<VoiceDesignListPageAsync> = list(VoiceDesignListParams.none())

    /** @see list */
    fun list(
        params: VoiceDesignListParams = VoiceDesignListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceDesignListPageAsync>

    /** @see list */
    fun list(
        params: VoiceDesignListParams = VoiceDesignListParams.none()
    ): CompletableFuture<VoiceDesignListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<VoiceDesignListPageAsync> =
        list(VoiceDesignListParams.none(), requestOptions)

    /** Permanently deletes a voice design and all of its versions. This action cannot be undone. */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, VoiceDesignDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: VoiceDesignDeleteParams = VoiceDesignDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: VoiceDesignDeleteParams = VoiceDesignDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: VoiceDesignDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: VoiceDesignDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, VoiceDesignDeleteParams.none(), requestOptions)

    /**
     * Permanently deletes a specific version of a voice design. The version number must be a
     * positive integer.
     */
    fun deleteVersion(
        version: Long,
        params: VoiceDesignDeleteVersionParams,
    ): CompletableFuture<Void?> = deleteVersion(version, params, RequestOptions.none())

    /** @see deleteVersion */
    fun deleteVersion(
        version: Long,
        params: VoiceDesignDeleteVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteVersion(params.toBuilder().version(version).build(), requestOptions)

    /** @see deleteVersion */
    fun deleteVersion(params: VoiceDesignDeleteVersionParams): CompletableFuture<Void?> =
        deleteVersion(params, RequestOptions.none())

    /** @see deleteVersion */
    fun deleteVersion(
        params: VoiceDesignDeleteVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Downloads the WAV audio sample for the voice design. Returns the latest version's sample by
     * default, or a specific version when `?version=N` is provided. The `id` parameter accepts
     * either a UUID or the design name.
     */
    fun downloadSample(id: String): CompletableFuture<HttpResponse> =
        downloadSample(id, VoiceDesignDownloadSampleParams.none())

    /** @see downloadSample */
    fun downloadSample(
        id: String,
        params: VoiceDesignDownloadSampleParams = VoiceDesignDownloadSampleParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        downloadSample(params.toBuilder().id(id).build(), requestOptions)

    /** @see downloadSample */
    fun downloadSample(
        id: String,
        params: VoiceDesignDownloadSampleParams = VoiceDesignDownloadSampleParams.none(),
    ): CompletableFuture<HttpResponse> = downloadSample(id, params, RequestOptions.none())

    /** @see downloadSample */
    fun downloadSample(
        params: VoiceDesignDownloadSampleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see downloadSample */
    fun downloadSample(params: VoiceDesignDownloadSampleParams): CompletableFuture<HttpResponse> =
        downloadSample(params, RequestOptions.none())

    /** @see downloadSample */
    fun downloadSample(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        downloadSample(id, VoiceDesignDownloadSampleParams.none(), requestOptions)

    /** Updates the name of a voice design. All versions retain their other properties. */
    fun rename(
        id: String,
        params: VoiceDesignRenameParams,
    ): CompletableFuture<VoiceDesignRenameResponse> = rename(id, params, RequestOptions.none())

    /** @see rename */
    fun rename(
        id: String,
        params: VoiceDesignRenameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceDesignRenameResponse> =
        rename(params.toBuilder().id(id).build(), requestOptions)

    /** @see rename */
    fun rename(params: VoiceDesignRenameParams): CompletableFuture<VoiceDesignRenameResponse> =
        rename(params, RequestOptions.none())

    /** @see rename */
    fun rename(
        params: VoiceDesignRenameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceDesignRenameResponse>

    /**
     * A view of [VoiceDesignServiceAsync] that provides access to raw HTTP responses for each
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
        ): VoiceDesignServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /voice_designs`, but is otherwise the same as
         * [VoiceDesignServiceAsync.create].
         */
        fun create(
            params: VoiceDesignCreateParams
        ): CompletableFuture<HttpResponseFor<VoiceDesignCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: VoiceDesignCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceDesignCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /voice_designs/{id}`, but is otherwise the same as
         * [VoiceDesignServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<VoiceDesignRetrieveResponse>> =
            retrieve(id, VoiceDesignRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: VoiceDesignRetrieveParams = VoiceDesignRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceDesignRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: VoiceDesignRetrieveParams = VoiceDesignRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<VoiceDesignRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: VoiceDesignRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceDesignRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: VoiceDesignRetrieveParams
        ): CompletableFuture<HttpResponseFor<VoiceDesignRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VoiceDesignRetrieveResponse>> =
            retrieve(id, VoiceDesignRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /voice_designs`, but is otherwise the same as
         * [VoiceDesignServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<VoiceDesignListPageAsync>> =
            list(VoiceDesignListParams.none())

        /** @see list */
        fun list(
            params: VoiceDesignListParams = VoiceDesignListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceDesignListPageAsync>>

        /** @see list */
        fun list(
            params: VoiceDesignListParams = VoiceDesignListParams.none()
        ): CompletableFuture<HttpResponseFor<VoiceDesignListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<VoiceDesignListPageAsync>> =
            list(VoiceDesignListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /voice_designs/{id}`, but is otherwise the same
         * as [VoiceDesignServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, VoiceDesignDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: VoiceDesignDeleteParams = VoiceDesignDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: VoiceDesignDeleteParams = VoiceDesignDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: VoiceDesignDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: VoiceDesignDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, VoiceDesignDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /voice_designs/{id}/versions/{version}`, but is
         * otherwise the same as [VoiceDesignServiceAsync.deleteVersion].
         */
        fun deleteVersion(
            version: Long,
            params: VoiceDesignDeleteVersionParams,
        ): CompletableFuture<HttpResponse> = deleteVersion(version, params, RequestOptions.none())

        /** @see deleteVersion */
        fun deleteVersion(
            version: Long,
            params: VoiceDesignDeleteVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteVersion(params.toBuilder().version(version).build(), requestOptions)

        /** @see deleteVersion */
        fun deleteVersion(params: VoiceDesignDeleteVersionParams): CompletableFuture<HttpResponse> =
            deleteVersion(params, RequestOptions.none())

        /** @see deleteVersion */
        fun deleteVersion(
            params: VoiceDesignDeleteVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /voice_designs/{id}/sample`, but is otherwise the
         * same as [VoiceDesignServiceAsync.downloadSample].
         */
        fun downloadSample(id: String): CompletableFuture<HttpResponse> =
            downloadSample(id, VoiceDesignDownloadSampleParams.none())

        /** @see downloadSample */
        fun downloadSample(
            id: String,
            params: VoiceDesignDownloadSampleParams = VoiceDesignDownloadSampleParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            downloadSample(params.toBuilder().id(id).build(), requestOptions)

        /** @see downloadSample */
        fun downloadSample(
            id: String,
            params: VoiceDesignDownloadSampleParams = VoiceDesignDownloadSampleParams.none(),
        ): CompletableFuture<HttpResponse> = downloadSample(id, params, RequestOptions.none())

        /** @see downloadSample */
        fun downloadSample(
            params: VoiceDesignDownloadSampleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see downloadSample */
        fun downloadSample(
            params: VoiceDesignDownloadSampleParams
        ): CompletableFuture<HttpResponse> = downloadSample(params, RequestOptions.none())

        /** @see downloadSample */
        fun downloadSample(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            downloadSample(id, VoiceDesignDownloadSampleParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /voice_designs/{id}`, but is otherwise the same as
         * [VoiceDesignServiceAsync.rename].
         */
        fun rename(
            id: String,
            params: VoiceDesignRenameParams,
        ): CompletableFuture<HttpResponseFor<VoiceDesignRenameResponse>> =
            rename(id, params, RequestOptions.none())

        /** @see rename */
        fun rename(
            id: String,
            params: VoiceDesignRenameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceDesignRenameResponse>> =
            rename(params.toBuilder().id(id).build(), requestOptions)

        /** @see rename */
        fun rename(
            params: VoiceDesignRenameParams
        ): CompletableFuture<HttpResponseFor<VoiceDesignRenameResponse>> =
            rename(params, RequestOptions.none())

        /** @see rename */
        fun rename(
            params: VoiceDesignRenameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceDesignRenameResponse>>
    }
}
