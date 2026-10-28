// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.models.artifactdownloads.ArtifactDownloadRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Download screenshots and other artifacts. */
interface ArtifactDownloadServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ArtifactDownloadServiceAsync

    /**
     * Downloads the artifact content. The signed URL (with expires and sig query params) is
     * obtained from the artifact metadata endpoint.
     */
    fun retrieve(
        artifactId: String,
        params: ArtifactDownloadRetrieveParams,
    ): CompletableFuture<HttpResponse> = retrieve(artifactId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        artifactId: String,
        params: ArtifactDownloadRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        retrieve(params.toBuilder().artifactId(artifactId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: ArtifactDownloadRetrieveParams): CompletableFuture<HttpResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ArtifactDownloadRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /**
     * A view of [ArtifactDownloadServiceAsync] that provides access to raw HTTP responses for each
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
        ): ArtifactDownloadServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /artifact_downloads/{artifactId}`, but is otherwise
         * the same as [ArtifactDownloadServiceAsync.retrieve].
         */
        fun retrieve(
            artifactId: String,
            params: ArtifactDownloadRetrieveParams,
        ): CompletableFuture<HttpResponse> = retrieve(artifactId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            artifactId: String,
            params: ArtifactDownloadRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieve(params.toBuilder().artifactId(artifactId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(params: ArtifactDownloadRetrieveParams): CompletableFuture<HttpResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ArtifactDownloadRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
