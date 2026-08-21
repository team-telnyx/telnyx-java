// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.storage

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.storage.cloudfs.CloudfCreateParams
import com.telnyx.sdk.models.storage.cloudfs.CloudfDeleteParams
import com.telnyx.sdk.models.storage.cloudfs.CloudfListPage
import com.telnyx.sdk.models.storage.cloudfs.CloudfListParams
import com.telnyx.sdk.models.storage.cloudfs.CloudfRetrieveParams
import com.telnyx.sdk.models.storage.cloudfs.CloudfUpdateParams
import com.telnyx.sdk.models.storage.cloudfs.CloudfsFilesystemDetailResponseWrapper
import com.telnyx.sdk.models.storage.cloudfs.CloudfsFilesystemResponseWrapper
import com.telnyx.sdk.services.blocking.storage.cloudfs.ActionService
import java.util.function.Consumer

/** Manage CloudFS filesystems — JuiceFS-compatible filesystems backed by Telnyx Cloud Storage */
interface CloudfService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CloudfService

    /**
     * Manage CloudFS filesystems — JuiceFS-compatible filesystems backed by Telnyx Cloud Storage
     */
    fun actions(): ActionService

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
    fun create(params: CloudfCreateParams): CloudfsFilesystemResponseWrapper =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CloudfCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CloudfsFilesystemResponseWrapper

    /**
     * Retrieves a CloudFS filesystem by its ID. The returned `meta_url` omits the credential — the
     * metadata token is only ever returned by create and rotate-meta-token. A filesystem whose last
     * lifecycle action failed includes a customer-safe `error` message.
     */
    fun retrieve(id: String): CloudfsFilesystemDetailResponseWrapper =
        retrieve(id, CloudfRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CloudfRetrieveParams = CloudfRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CloudfsFilesystemDetailResponseWrapper =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CloudfRetrieveParams = CloudfRetrieveParams.none(),
    ): CloudfsFilesystemDetailResponseWrapper = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CloudfRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CloudfsFilesystemDetailResponseWrapper

    /** @see retrieve */
    fun retrieve(params: CloudfRetrieveParams): CloudfsFilesystemDetailResponseWrapper =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CloudfsFilesystemDetailResponseWrapper =
        retrieve(id, CloudfRetrieveParams.none(), requestOptions)

    /**
     * Updates a CloudFS filesystem. Only `name` can be changed; other fields are immutable and
     * unknown fields are rejected with a `400`. Renaming to a name that already exists in your
     * organization returns a `422`.
     */
    fun update(id: String): CloudfsFilesystemDetailResponseWrapper =
        update(id, CloudfUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: CloudfUpdateParams = CloudfUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CloudfsFilesystemDetailResponseWrapper =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: CloudfUpdateParams = CloudfUpdateParams.none(),
    ): CloudfsFilesystemDetailResponseWrapper = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CloudfUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CloudfsFilesystemDetailResponseWrapper

    /** @see update */
    fun update(params: CloudfUpdateParams): CloudfsFilesystemDetailResponseWrapper =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CloudfsFilesystemDetailResponseWrapper =
        update(id, CloudfUpdateParams.none(), requestOptions)

    /**
     * Lists the CloudFS filesystems for the authenticated user's organization. Results use
     * cursor-based pagination: fetch the next page by passing `meta.cursors.after` as
     * `page[after]`, or follow the `meta.next` URL.
     */
    fun list(): CloudfListPage = list(CloudfListParams.none())

    /** @see list */
    fun list(
        params: CloudfListParams = CloudfListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CloudfListPage

    /** @see list */
    fun list(params: CloudfListParams = CloudfListParams.none()): CloudfListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CloudfListPage =
        list(CloudfListParams.none(), requestOptions)

    /**
     * Permanently deletes a CloudFS filesystem, removing its S3 bucket and its metadata database.
     * Deletion is synchronous: the response returns the filesystem's final state with status
     * `deleted`. There is no restore. A filesystem that is still `provisioning` returns a `409`. If
     * the filesystem still contains data, the request may be rejected with a `409` — drain the
     * bucket and retry.
     */
    fun delete(id: String): CloudfsFilesystemDetailResponseWrapper =
        delete(id, CloudfDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: CloudfDeleteParams = CloudfDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CloudfsFilesystemDetailResponseWrapper =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: CloudfDeleteParams = CloudfDeleteParams.none(),
    ): CloudfsFilesystemDetailResponseWrapper = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CloudfDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CloudfsFilesystemDetailResponseWrapper

    /** @see delete */
    fun delete(params: CloudfDeleteParams): CloudfsFilesystemDetailResponseWrapper =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CloudfsFilesystemDetailResponseWrapper =
        delete(id, CloudfDeleteParams.none(), requestOptions)

    /** A view of [CloudfService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CloudfService.WithRawResponse

        /**
         * Manage CloudFS filesystems — JuiceFS-compatible filesystems backed by Telnyx Cloud
         * Storage
         */
        fun actions(): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /storage/cloudfs`, but is otherwise the same as
         * [CloudfService.create].
         */
        @MustBeClosed
        fun create(params: CloudfCreateParams): HttpResponseFor<CloudfsFilesystemResponseWrapper> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CloudfCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CloudfsFilesystemResponseWrapper>

        /**
         * Returns a raw HTTP response for `get /storage/cloudfs/{id}`, but is otherwise the same as
         * [CloudfService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<CloudfsFilesystemDetailResponseWrapper> =
            retrieve(id, CloudfRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CloudfRetrieveParams = CloudfRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CloudfsFilesystemDetailResponseWrapper> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CloudfRetrieveParams = CloudfRetrieveParams.none(),
        ): HttpResponseFor<CloudfsFilesystemDetailResponseWrapper> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CloudfRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CloudfsFilesystemDetailResponseWrapper>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CloudfRetrieveParams
        ): HttpResponseFor<CloudfsFilesystemDetailResponseWrapper> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CloudfsFilesystemDetailResponseWrapper> =
            retrieve(id, CloudfRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /storage/cloudfs/{id}`, but is otherwise the same
         * as [CloudfService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<CloudfsFilesystemDetailResponseWrapper> =
            update(id, CloudfUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: CloudfUpdateParams = CloudfUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CloudfsFilesystemDetailResponseWrapper> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: CloudfUpdateParams = CloudfUpdateParams.none(),
        ): HttpResponseFor<CloudfsFilesystemDetailResponseWrapper> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CloudfUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CloudfsFilesystemDetailResponseWrapper>

        /** @see update */
        @MustBeClosed
        fun update(
            params: CloudfUpdateParams
        ): HttpResponseFor<CloudfsFilesystemDetailResponseWrapper> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CloudfsFilesystemDetailResponseWrapper> =
            update(id, CloudfUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /storage/cloudfs`, but is otherwise the same as
         * [CloudfService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<CloudfListPage> = list(CloudfListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CloudfListParams = CloudfListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CloudfListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CloudfListParams = CloudfListParams.none()
        ): HttpResponseFor<CloudfListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CloudfListPage> =
            list(CloudfListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /storage/cloudfs/{id}`, but is otherwise the same
         * as [CloudfService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<CloudfsFilesystemDetailResponseWrapper> =
            delete(id, CloudfDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: CloudfDeleteParams = CloudfDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CloudfsFilesystemDetailResponseWrapper> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: CloudfDeleteParams = CloudfDeleteParams.none(),
        ): HttpResponseFor<CloudfsFilesystemDetailResponseWrapper> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CloudfDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CloudfsFilesystemDetailResponseWrapper>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CloudfDeleteParams
        ): HttpResponseFor<CloudfsFilesystemDetailResponseWrapper> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CloudfsFilesystemDetailResponseWrapper> =
            delete(id, CloudfDeleteParams.none(), requestOptions)
    }
}
