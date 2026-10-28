// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.browsersessions.BrowserSessionCreateParams
import com.telnyx.sdk.models.browsersessions.BrowserSessionCreateResponse
import com.telnyx.sdk.models.browsersessions.BrowserSessionDeleteParams
import com.telnyx.sdk.models.browsersessions.BrowserSessionDeleteResponse
import com.telnyx.sdk.models.browsersessions.BrowserSessionListParams
import com.telnyx.sdk.models.browsersessions.BrowserSessionListResponse
import com.telnyx.sdk.models.browsersessions.BrowserSessionRetrieveArtifactParams
import com.telnyx.sdk.models.browsersessions.BrowserSessionRetrieveArtifactResponse
import com.telnyx.sdk.models.browsersessions.BrowserSessionRetrieveParams
import com.telnyx.sdk.models.browsersessions.BrowserSessionRetrieveResponse
import com.telnyx.sdk.services.async.browsersessions.ActionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BrowserSessionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrowserSessionServiceAsync

    /**
     * Execute browser actions: navigate, observe, click, fill, select, press, scroll, wait_for,
     * screenshot, batch.
     */
    fun actions(): ActionServiceAsync

    /**
     * Creates an isolated browser session with network access restricted to the domains you allow.
     */
    fun create(
        params: BrowserSessionCreateParams
    ): CompletableFuture<BrowserSessionCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BrowserSessionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrowserSessionCreateResponse>

    /** Returns the current status of a browser session. */
    fun retrieve(id: String): CompletableFuture<BrowserSessionRetrieveResponse> =
        retrieve(id, BrowserSessionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BrowserSessionRetrieveParams = BrowserSessionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrowserSessionRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BrowserSessionRetrieveParams = BrowserSessionRetrieveParams.none(),
    ): CompletableFuture<BrowserSessionRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BrowserSessionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrowserSessionRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: BrowserSessionRetrieveParams
    ): CompletableFuture<BrowserSessionRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrowserSessionRetrieveResponse> =
        retrieve(id, BrowserSessionRetrieveParams.none(), requestOptions)

    /** Lists sessions for the authenticated org. Optional status filter. */
    fun list(): CompletableFuture<BrowserSessionListResponse> =
        list(BrowserSessionListParams.none())

    /** @see list */
    fun list(
        params: BrowserSessionListParams = BrowserSessionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrowserSessionListResponse>

    /** @see list */
    fun list(
        params: BrowserSessionListParams = BrowserSessionListParams.none()
    ): CompletableFuture<BrowserSessionListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<BrowserSessionListResponse> =
        list(BrowserSessionListParams.none(), requestOptions)

    /**
     * Closes a ready session and releases its resources. An already closed, failed, or expired
     * session is returned unchanged; a provisioning session returns 409 session_not_ready.
     */
    fun delete(id: String): CompletableFuture<BrowserSessionDeleteResponse> =
        delete(id, BrowserSessionDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: BrowserSessionDeleteParams = BrowserSessionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrowserSessionDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: BrowserSessionDeleteParams = BrowserSessionDeleteParams.none(),
    ): CompletableFuture<BrowserSessionDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BrowserSessionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrowserSessionDeleteResponse>

    /** @see delete */
    fun delete(
        params: BrowserSessionDeleteParams
    ): CompletableFuture<BrowserSessionDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrowserSessionDeleteResponse> =
        delete(id, BrowserSessionDeleteParams.none(), requestOptions)

    /**
     * Returns artifact metadata and a signed download URL. The download URL requires Bearer auth.
     */
    fun retrieveArtifact(
        artifactId: String,
        params: BrowserSessionRetrieveArtifactParams,
    ): CompletableFuture<BrowserSessionRetrieveArtifactResponse> =
        retrieveArtifact(artifactId, params, RequestOptions.none())

    /** @see retrieveArtifact */
    fun retrieveArtifact(
        artifactId: String,
        params: BrowserSessionRetrieveArtifactParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrowserSessionRetrieveArtifactResponse> =
        retrieveArtifact(params.toBuilder().artifactId(artifactId).build(), requestOptions)

    /** @see retrieveArtifact */
    fun retrieveArtifact(
        params: BrowserSessionRetrieveArtifactParams
    ): CompletableFuture<BrowserSessionRetrieveArtifactResponse> =
        retrieveArtifact(params, RequestOptions.none())

    /** @see retrieveArtifact */
    fun retrieveArtifact(
        params: BrowserSessionRetrieveArtifactParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrowserSessionRetrieveArtifactResponse>

    /**
     * A view of [BrowserSessionServiceAsync] that provides access to raw HTTP responses for each
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
        ): BrowserSessionServiceAsync.WithRawResponse

        /**
         * Execute browser actions: navigate, observe, click, fill, select, press, scroll, wait_for,
         * screenshot, batch.
         */
        fun actions(): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /browser_sessions`, but is otherwise the same as
         * [BrowserSessionServiceAsync.create].
         */
        fun create(
            params: BrowserSessionCreateParams
        ): CompletableFuture<HttpResponseFor<BrowserSessionCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BrowserSessionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrowserSessionCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /browser_sessions/{id}`, but is otherwise the same
         * as [BrowserSessionServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<BrowserSessionRetrieveResponse>> =
            retrieve(id, BrowserSessionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: BrowserSessionRetrieveParams = BrowserSessionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrowserSessionRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: BrowserSessionRetrieveParams = BrowserSessionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<BrowserSessionRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BrowserSessionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrowserSessionRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: BrowserSessionRetrieveParams
        ): CompletableFuture<HttpResponseFor<BrowserSessionRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrowserSessionRetrieveResponse>> =
            retrieve(id, BrowserSessionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /browser_sessions`, but is otherwise the same as
         * [BrowserSessionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BrowserSessionListResponse>> =
            list(BrowserSessionListParams.none())

        /** @see list */
        fun list(
            params: BrowserSessionListParams = BrowserSessionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrowserSessionListResponse>>

        /** @see list */
        fun list(
            params: BrowserSessionListParams = BrowserSessionListParams.none()
        ): CompletableFuture<HttpResponseFor<BrowserSessionListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BrowserSessionListResponse>> =
            list(BrowserSessionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /browser_sessions/{id}`, but is otherwise the
         * same as [BrowserSessionServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<BrowserSessionDeleteResponse>> =
            delete(id, BrowserSessionDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: BrowserSessionDeleteParams = BrowserSessionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrowserSessionDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: BrowserSessionDeleteParams = BrowserSessionDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<BrowserSessionDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: BrowserSessionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrowserSessionDeleteResponse>>

        /** @see delete */
        fun delete(
            params: BrowserSessionDeleteParams
        ): CompletableFuture<HttpResponseFor<BrowserSessionDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrowserSessionDeleteResponse>> =
            delete(id, BrowserSessionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /browser_sessions/{id}/artifacts/{artifactId}`, but
         * is otherwise the same as [BrowserSessionServiceAsync.retrieveArtifact].
         */
        fun retrieveArtifact(
            artifactId: String,
            params: BrowserSessionRetrieveArtifactParams,
        ): CompletableFuture<HttpResponseFor<BrowserSessionRetrieveArtifactResponse>> =
            retrieveArtifact(artifactId, params, RequestOptions.none())

        /** @see retrieveArtifact */
        fun retrieveArtifact(
            artifactId: String,
            params: BrowserSessionRetrieveArtifactParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrowserSessionRetrieveArtifactResponse>> =
            retrieveArtifact(params.toBuilder().artifactId(artifactId).build(), requestOptions)

        /** @see retrieveArtifact */
        fun retrieveArtifact(
            params: BrowserSessionRetrieveArtifactParams
        ): CompletableFuture<HttpResponseFor<BrowserSessionRetrieveArtifactResponse>> =
            retrieveArtifact(params, RequestOptions.none())

        /** @see retrieveArtifact */
        fun retrieveArtifact(
            params: BrowserSessionRetrieveArtifactParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrowserSessionRetrieveArtifactResponse>>
    }
}
