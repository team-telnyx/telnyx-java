// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.voicedesigns.VoiceDesignCreateParams
import com.telnyx.sdk.models.voicedesigns.VoiceDesignCreateResponse
import com.telnyx.sdk.models.voicedesigns.VoiceDesignDeleteParams
import com.telnyx.sdk.models.voicedesigns.VoiceDesignDeleteVersionParams
import com.telnyx.sdk.models.voicedesigns.VoiceDesignDownloadSampleParams
import com.telnyx.sdk.models.voicedesigns.VoiceDesignListPage
import com.telnyx.sdk.models.voicedesigns.VoiceDesignListParams
import com.telnyx.sdk.models.voicedesigns.VoiceDesignRetrieveParams
import com.telnyx.sdk.models.voicedesigns.VoiceDesignRetrieveResponse
import com.telnyx.sdk.models.voicedesigns.VoiceDesignUpdateParams
import com.telnyx.sdk.models.voicedesigns.VoiceDesignUpdateResponse
import java.util.function.Consumer

/** Create and manage AI-generated voice designs using natural language prompts. */
interface VoiceDesignService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VoiceDesignService

    /**
     * Creates a new voice design (version 1) when `voice_design_id` is omitted. When
     * `voice_design_id` is provided, adds a new version to the existing design instead. A design
     * can have at most 50 versions.
     */
    fun create(params: VoiceDesignCreateParams): VoiceDesignCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: VoiceDesignCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceDesignCreateResponse

    /**
     * Returns the latest version of a voice design, or a specific version when `?version=N` is
     * provided. The `id` parameter accepts either a UUID or the design name.
     */
    fun retrieve(id: String): VoiceDesignRetrieveResponse =
        retrieve(id, VoiceDesignRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: VoiceDesignRetrieveParams = VoiceDesignRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceDesignRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: VoiceDesignRetrieveParams = VoiceDesignRetrieveParams.none(),
    ): VoiceDesignRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VoiceDesignRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceDesignRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: VoiceDesignRetrieveParams): VoiceDesignRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): VoiceDesignRetrieveResponse =
        retrieve(id, VoiceDesignRetrieveParams.none(), requestOptions)

    /** Updates the name of a voice design. All versions retain their other properties. */
    fun update(id: String, params: VoiceDesignUpdateParams): VoiceDesignUpdateResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: VoiceDesignUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceDesignUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: VoiceDesignUpdateParams): VoiceDesignUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: VoiceDesignUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceDesignUpdateResponse

    /** Returns a paginated list of voice designs belonging to the authenticated account. */
    fun list(): VoiceDesignListPage = list(VoiceDesignListParams.none())

    /** @see list */
    fun list(
        params: VoiceDesignListParams = VoiceDesignListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceDesignListPage

    /** @see list */
    fun list(params: VoiceDesignListParams = VoiceDesignListParams.none()): VoiceDesignListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): VoiceDesignListPage =
        list(VoiceDesignListParams.none(), requestOptions)

    /** Permanently deletes a voice design and all of its versions. This action cannot be undone. */
    fun delete(id: String) = delete(id, VoiceDesignDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: VoiceDesignDeleteParams = VoiceDesignDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: VoiceDesignDeleteParams = VoiceDesignDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: VoiceDesignDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: VoiceDesignDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, VoiceDesignDeleteParams.none(), requestOptions)

    /**
     * Permanently deletes a specific version of a voice design. The version number must be a
     * positive integer.
     */
    fun deleteVersion(version: Long, params: VoiceDesignDeleteVersionParams) =
        deleteVersion(version, params, RequestOptions.none())

    /** @see deleteVersion */
    fun deleteVersion(
        version: Long,
        params: VoiceDesignDeleteVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteVersion(params.toBuilder().version(version).build(), requestOptions)

    /** @see deleteVersion */
    fun deleteVersion(params: VoiceDesignDeleteVersionParams) =
        deleteVersion(params, RequestOptions.none())

    /** @see deleteVersion */
    fun deleteVersion(
        params: VoiceDesignDeleteVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Downloads the WAV audio sample for the voice design. Returns the latest version's sample by
     * default, or a specific version when `?version=N` is provided. The `id` parameter accepts
     * either a UUID or the design name.
     */
    @MustBeClosed
    fun downloadSample(id: String): HttpResponse =
        downloadSample(id, VoiceDesignDownloadSampleParams.none())

    /** @see downloadSample */
    @MustBeClosed
    fun downloadSample(
        id: String,
        params: VoiceDesignDownloadSampleParams = VoiceDesignDownloadSampleParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = downloadSample(params.toBuilder().id(id).build(), requestOptions)

    /** @see downloadSample */
    @MustBeClosed
    fun downloadSample(
        id: String,
        params: VoiceDesignDownloadSampleParams = VoiceDesignDownloadSampleParams.none(),
    ): HttpResponse = downloadSample(id, params, RequestOptions.none())

    /** @see downloadSample */
    @MustBeClosed
    fun downloadSample(
        params: VoiceDesignDownloadSampleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see downloadSample */
    @MustBeClosed
    fun downloadSample(params: VoiceDesignDownloadSampleParams): HttpResponse =
        downloadSample(params, RequestOptions.none())

    /** @see downloadSample */
    @MustBeClosed
    fun downloadSample(id: String, requestOptions: RequestOptions): HttpResponse =
        downloadSample(id, VoiceDesignDownloadSampleParams.none(), requestOptions)

    /**
     * A view of [VoiceDesignService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VoiceDesignService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /voice_designs`, but is otherwise the same as
         * [VoiceDesignService.create].
         */
        @MustBeClosed
        fun create(params: VoiceDesignCreateParams): HttpResponseFor<VoiceDesignCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: VoiceDesignCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceDesignCreateResponse>

        /**
         * Returns a raw HTTP response for `get /voice_designs/{id}`, but is otherwise the same as
         * [VoiceDesignService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<VoiceDesignRetrieveResponse> =
            retrieve(id, VoiceDesignRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: VoiceDesignRetrieveParams = VoiceDesignRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceDesignRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: VoiceDesignRetrieveParams = VoiceDesignRetrieveParams.none(),
        ): HttpResponseFor<VoiceDesignRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: VoiceDesignRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceDesignRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: VoiceDesignRetrieveParams
        ): HttpResponseFor<VoiceDesignRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VoiceDesignRetrieveResponse> =
            retrieve(id, VoiceDesignRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /voice_designs/{id}`, but is otherwise the same as
         * [VoiceDesignService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: VoiceDesignUpdateParams,
        ): HttpResponseFor<VoiceDesignUpdateResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: VoiceDesignUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceDesignUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: VoiceDesignUpdateParams): HttpResponseFor<VoiceDesignUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: VoiceDesignUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceDesignUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /voice_designs`, but is otherwise the same as
         * [VoiceDesignService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<VoiceDesignListPage> = list(VoiceDesignListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: VoiceDesignListParams = VoiceDesignListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceDesignListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: VoiceDesignListParams = VoiceDesignListParams.none()
        ): HttpResponseFor<VoiceDesignListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<VoiceDesignListPage> =
            list(VoiceDesignListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /voice_designs/{id}`, but is otherwise the same
         * as [VoiceDesignService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, VoiceDesignDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: VoiceDesignDeleteParams = VoiceDesignDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: VoiceDesignDeleteParams = VoiceDesignDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: VoiceDesignDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: VoiceDesignDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, VoiceDesignDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /voice_designs/{id}/versions/{version}`, but is
         * otherwise the same as [VoiceDesignService.deleteVersion].
         */
        @MustBeClosed
        fun deleteVersion(version: Long, params: VoiceDesignDeleteVersionParams): HttpResponse =
            deleteVersion(version, params, RequestOptions.none())

        /** @see deleteVersion */
        @MustBeClosed
        fun deleteVersion(
            version: Long,
            params: VoiceDesignDeleteVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = deleteVersion(params.toBuilder().version(version).build(), requestOptions)

        /** @see deleteVersion */
        @MustBeClosed
        fun deleteVersion(params: VoiceDesignDeleteVersionParams): HttpResponse =
            deleteVersion(params, RequestOptions.none())

        /** @see deleteVersion */
        @MustBeClosed
        fun deleteVersion(
            params: VoiceDesignDeleteVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /voice_designs/{id}/sample`, but is otherwise the
         * same as [VoiceDesignService.downloadSample].
         */
        @MustBeClosed
        fun downloadSample(id: String): HttpResponse =
            downloadSample(id, VoiceDesignDownloadSampleParams.none())

        /** @see downloadSample */
        @MustBeClosed
        fun downloadSample(
            id: String,
            params: VoiceDesignDownloadSampleParams = VoiceDesignDownloadSampleParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = downloadSample(params.toBuilder().id(id).build(), requestOptions)

        /** @see downloadSample */
        @MustBeClosed
        fun downloadSample(
            id: String,
            params: VoiceDesignDownloadSampleParams = VoiceDesignDownloadSampleParams.none(),
        ): HttpResponse = downloadSample(id, params, RequestOptions.none())

        /** @see downloadSample */
        @MustBeClosed
        fun downloadSample(
            params: VoiceDesignDownloadSampleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see downloadSample */
        @MustBeClosed
        fun downloadSample(params: VoiceDesignDownloadSampleParams): HttpResponse =
            downloadSample(params, RequestOptions.none())

        /** @see downloadSample */
        @MustBeClosed
        fun downloadSample(id: String, requestOptions: RequestOptions): HttpResponse =
            downloadSample(id, VoiceDesignDownloadSampleParams.none(), requestOptions)
    }
}
