// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.storage

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.storage.cloudfs.CloudfCreateParams
import com.telnyx.sdk.models.storage.cloudfs.CloudfDeleteParams
import com.telnyx.sdk.models.storage.cloudfs.CloudfListPageAsync
import com.telnyx.sdk.models.storage.cloudfs.CloudfListParams
import com.telnyx.sdk.models.storage.cloudfs.CloudfRetrieveParams
import com.telnyx.sdk.models.storage.cloudfs.CloudfUpdateParams
import com.telnyx.sdk.models.storage.cloudfs.CloudfsFilesystemDetailResponseWrapper
import com.telnyx.sdk.models.storage.cloudfs.CloudfsFilesystemResponseWrapper
import com.telnyx.sdk.services.async.storage.cloudfs.ActionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage CloudFS filesystems — JuiceFS-compatible filesystems backed by Telnyx Cloud Storage */
interface CloudfServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CloudfServiceAsync

    /**
     * Manage CloudFS filesystems — JuiceFS-compatible filesystems backed by Telnyx Cloud Storage
     */
    fun actions(): ActionServiceAsync

    /**
     * Creates a CloudFS filesystem. Provisioning is synchronous — typically a few seconds, up to a
     * few minutes — and the filesystem is returned with status `ready`, together with its S3 bucket
     * and metadata connection details. This response is the only time the filesystem's `meta_token`
     * — and the credential-bearing `meta_url` — are returned; store them securely. If the token is
     * lost, issue a new one with the rotate-meta-token action. Names are unique within your
     * organization: creating with an existing name returns a `422`. Requests are idempotent:
     * retrying with the same `Idempotency-Key` within 24 hours replays the original response
     * instead of creating another filesystem.
     */
    fun create(params: CloudfCreateParams): CompletableFuture<CloudfsFilesystemResponseWrapper> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CloudfCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CloudfsFilesystemResponseWrapper>

    /**
     * Retrieves a CloudFS filesystem by its ID. The returned `meta_url` omits the credential — the
     * metadata token is only ever returned by create and rotate-meta-token. A filesystem whose last
     * lifecycle action failed includes a customer-safe `error` message.
     */
    fun retrieve(id: String): CompletableFuture<CloudfsFilesystemDetailResponseWrapper> =
        retrieve(id, CloudfRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CloudfRetrieveParams = CloudfRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CloudfsFilesystemDetailResponseWrapper> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CloudfRetrieveParams = CloudfRetrieveParams.none(),
    ): CompletableFuture<CloudfsFilesystemDetailResponseWrapper> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CloudfRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CloudfsFilesystemDetailResponseWrapper>

    /** @see retrieve */
    fun retrieve(
        params: CloudfRetrieveParams
    ): CompletableFuture<CloudfsFilesystemDetailResponseWrapper> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CloudfsFilesystemDetailResponseWrapper> =
        retrieve(id, CloudfRetrieveParams.none(), requestOptions)

    /**
     * Updates a CloudFS filesystem. Only `name` can be changed; other fields are immutable and
     * unknown fields are rejected with a `400`. Renaming to a name that already exists in your
     * organization returns a `422`.
     */
    fun update(id: String): CompletableFuture<CloudfsFilesystemDetailResponseWrapper> =
        update(id, CloudfUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: CloudfUpdateParams = CloudfUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CloudfsFilesystemDetailResponseWrapper> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: CloudfUpdateParams = CloudfUpdateParams.none(),
    ): CompletableFuture<CloudfsFilesystemDetailResponseWrapper> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CloudfUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CloudfsFilesystemDetailResponseWrapper>

    /** @see update */
    fun update(
        params: CloudfUpdateParams
    ): CompletableFuture<CloudfsFilesystemDetailResponseWrapper> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CloudfsFilesystemDetailResponseWrapper> =
        update(id, CloudfUpdateParams.none(), requestOptions)

    /**
     * Lists the CloudFS filesystems for the authenticated user's organization. Results use
     * cursor-based pagination: fetch the next page by passing `meta.cursors.after` as
     * `page[after]`, or follow the `meta.next` URL.
     */
    fun list(): CompletableFuture<CloudfListPageAsync> = list(CloudfListParams.none())

    /** @see list */
    fun list(
        params: CloudfListParams = CloudfListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CloudfListPageAsync>

    /** @see list */
    fun list(
        params: CloudfListParams = CloudfListParams.none()
    ): CompletableFuture<CloudfListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CloudfListPageAsync> =
        list(CloudfListParams.none(), requestOptions)

    /**
     * Permanently deletes a CloudFS filesystem, removing its S3 bucket and its metadata database.
     * Deletion is synchronous: the response returns the filesystem's final state with status
     * `deleted`. There is no restore. A filesystem that is still `provisioning` returns a `409`. If
     * the filesystem still contains data, the request may be rejected with a `409` — drain the
     * bucket and retry.
     */
    fun delete(id: String): CompletableFuture<CloudfsFilesystemDetailResponseWrapper> =
        delete(id, CloudfDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: CloudfDeleteParams = CloudfDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CloudfsFilesystemDetailResponseWrapper> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: CloudfDeleteParams = CloudfDeleteParams.none(),
    ): CompletableFuture<CloudfsFilesystemDetailResponseWrapper> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CloudfDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CloudfsFilesystemDetailResponseWrapper>

    /** @see delete */
    fun delete(
        params: CloudfDeleteParams
    ): CompletableFuture<CloudfsFilesystemDetailResponseWrapper> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CloudfsFilesystemDetailResponseWrapper> =
        delete(id, CloudfDeleteParams.none(), requestOptions)

    /**
     * A view of [CloudfServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CloudfServiceAsync.WithRawResponse

        /**
         * Manage CloudFS filesystems — JuiceFS-compatible filesystems backed by Telnyx Cloud
         * Storage
         */
        fun actions(): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /storage/cloudfs`, but is otherwise the same as
         * [CloudfServiceAsync.create].
         */
        fun create(
            params: CloudfCreateParams
        ): CompletableFuture<HttpResponseFor<CloudfsFilesystemResponseWrapper>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CloudfCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CloudfsFilesystemResponseWrapper>>

        /**
         * Returns a raw HTTP response for `get /storage/cloudfs/{id}`, but is otherwise the same as
         * [CloudfServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<CloudfsFilesystemDetailResponseWrapper>> =
            retrieve(id, CloudfRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CloudfRetrieveParams = CloudfRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CloudfsFilesystemDetailResponseWrapper>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CloudfRetrieveParams = CloudfRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CloudfsFilesystemDetailResponseWrapper>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CloudfRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CloudfsFilesystemDetailResponseWrapper>>

        /** @see retrieve */
        fun retrieve(
            params: CloudfRetrieveParams
        ): CompletableFuture<HttpResponseFor<CloudfsFilesystemDetailResponseWrapper>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CloudfsFilesystemDetailResponseWrapper>> =
            retrieve(id, CloudfRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /storage/cloudfs/{id}`, but is otherwise the same
         * as [CloudfServiceAsync.update].
         */
        fun update(
            id: String
        ): CompletableFuture<HttpResponseFor<CloudfsFilesystemDetailResponseWrapper>> =
            update(id, CloudfUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: CloudfUpdateParams = CloudfUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CloudfsFilesystemDetailResponseWrapper>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: CloudfUpdateParams = CloudfUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<CloudfsFilesystemDetailResponseWrapper>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CloudfUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CloudfsFilesystemDetailResponseWrapper>>

        /** @see update */
        fun update(
            params: CloudfUpdateParams
        ): CompletableFuture<HttpResponseFor<CloudfsFilesystemDetailResponseWrapper>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CloudfsFilesystemDetailResponseWrapper>> =
            update(id, CloudfUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /storage/cloudfs`, but is otherwise the same as
         * [CloudfServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CloudfListPageAsync>> =
            list(CloudfListParams.none())

        /** @see list */
        fun list(
            params: CloudfListParams = CloudfListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CloudfListPageAsync>>

        /** @see list */
        fun list(
            params: CloudfListParams = CloudfListParams.none()
        ): CompletableFuture<HttpResponseFor<CloudfListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CloudfListPageAsync>> =
            list(CloudfListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /storage/cloudfs/{id}`, but is otherwise the same
         * as [CloudfServiceAsync.delete].
         */
        fun delete(
            id: String
        ): CompletableFuture<HttpResponseFor<CloudfsFilesystemDetailResponseWrapper>> =
            delete(id, CloudfDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: CloudfDeleteParams = CloudfDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CloudfsFilesystemDetailResponseWrapper>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: CloudfDeleteParams = CloudfDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<CloudfsFilesystemDetailResponseWrapper>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CloudfDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CloudfsFilesystemDetailResponseWrapper>>

        /** @see delete */
        fun delete(
            params: CloudfDeleteParams
        ): CompletableFuture<HttpResponseFor<CloudfsFilesystemDetailResponseWrapper>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CloudfsFilesystemDetailResponseWrapper>> =
            delete(id, CloudfDeleteParams.none(), requestOptions)
    }
}
