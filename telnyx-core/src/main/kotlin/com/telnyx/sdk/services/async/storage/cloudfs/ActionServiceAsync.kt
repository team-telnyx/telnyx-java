// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.storage.cloudfs

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.storage.cloudfs.CloudfsFilesystemResponseWrapper
import com.telnyx.sdk.models.storage.cloudfs.actions.ActionRotateMetaTokenParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage CloudFS filesystems — JuiceFS-compatible filesystems backed by Telnyx Cloud Storage */
interface ActionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionServiceAsync

    /**
     * Issues a new metadata access token for the filesystem and returns the full filesystem,
     * including the new `meta_token` and credential-bearing `meta_url`. The previous token stops
     * authenticating immediately; the metadata database and S3 bucket are unchanged. The request
     * takes no body. Allowed while the filesystem is `ready` or `needs_format`; otherwise returns a
     * `409`. Retrying with the same `Idempotency-Key` within 24 hours replays the original response
     * — including the same token — instead of rotating again.
     */
    fun rotateMetaToken(
        id: String,
        params: ActionRotateMetaTokenParams,
    ): CompletableFuture<CloudfsFilesystemResponseWrapper> =
        rotateMetaToken(id, params, RequestOptions.none())

    /** @see rotateMetaToken */
    fun rotateMetaToken(
        id: String,
        params: ActionRotateMetaTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CloudfsFilesystemResponseWrapper> =
        rotateMetaToken(params.toBuilder().id(id).build(), requestOptions)

    /** @see rotateMetaToken */
    fun rotateMetaToken(
        params: ActionRotateMetaTokenParams
    ): CompletableFuture<CloudfsFilesystemResponseWrapper> =
        rotateMetaToken(params, RequestOptions.none())

    /** @see rotateMetaToken */
    fun rotateMetaToken(
        params: ActionRotateMetaTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CloudfsFilesystemResponseWrapper>

    /**
     * A view of [ActionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /storage/cloudfs/{id}/actions/rotate-meta-token`,
         * but is otherwise the same as [ActionServiceAsync.rotateMetaToken].
         */
        fun rotateMetaToken(
            id: String,
            params: ActionRotateMetaTokenParams,
        ): CompletableFuture<HttpResponseFor<CloudfsFilesystemResponseWrapper>> =
            rotateMetaToken(id, params, RequestOptions.none())

        /** @see rotateMetaToken */
        fun rotateMetaToken(
            id: String,
            params: ActionRotateMetaTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CloudfsFilesystemResponseWrapper>> =
            rotateMetaToken(params.toBuilder().id(id).build(), requestOptions)

        /** @see rotateMetaToken */
        fun rotateMetaToken(
            params: ActionRotateMetaTokenParams
        ): CompletableFuture<HttpResponseFor<CloudfsFilesystemResponseWrapper>> =
            rotateMetaToken(params, RequestOptions.none())

        /** @see rotateMetaToken */
        fun rotateMetaToken(
            params: ActionRotateMetaTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CloudfsFilesystemResponseWrapper>>
    }
}
