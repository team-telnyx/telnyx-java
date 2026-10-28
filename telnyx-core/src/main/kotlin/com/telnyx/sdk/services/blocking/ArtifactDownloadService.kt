// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.models.artifactdownloads.ArtifactDownloadRetrieveParams
import java.util.function.Consumer

/** Download screenshots and other artifacts. */
interface ArtifactDownloadService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ArtifactDownloadService

    /**
     * Downloads the artifact content. The signed URL (with expires and sig query params) is
     * obtained from the artifact metadata endpoint.
     */
    @MustBeClosed
    fun retrieve(artifactId: String, params: ArtifactDownloadRetrieveParams): HttpResponse =
        retrieve(artifactId, params, RequestOptions.none())

    /** @see retrieve */
    @MustBeClosed
    fun retrieve(
        artifactId: String,
        params: ArtifactDownloadRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = retrieve(params.toBuilder().artifactId(artifactId).build(), requestOptions)

    /** @see retrieve */
    @MustBeClosed
    fun retrieve(params: ArtifactDownloadRetrieveParams): HttpResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    @MustBeClosed
    fun retrieve(
        params: ArtifactDownloadRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /**
     * A view of [ArtifactDownloadService] that provides access to raw HTTP responses for each
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
        ): ArtifactDownloadService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /artifact_downloads/{artifactId}`, but is otherwise
         * the same as [ArtifactDownloadService.retrieve].
         */
        @MustBeClosed
        fun retrieve(artifactId: String, params: ArtifactDownloadRetrieveParams): HttpResponse =
            retrieve(artifactId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            artifactId: String,
            params: ArtifactDownloadRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            retrieve(params.toBuilder().artifactId(artifactId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ArtifactDownloadRetrieveParams): HttpResponse =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ArtifactDownloadRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
