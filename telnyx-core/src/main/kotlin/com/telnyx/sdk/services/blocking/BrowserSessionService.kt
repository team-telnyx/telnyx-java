// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import com.telnyx.sdk.services.blocking.browsersessions.ActionService
import java.util.function.Consumer

interface BrowserSessionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrowserSessionService

    /**
     * Execute browser actions: navigate, observe, click, fill, select, press, scroll, wait_for,
     * screenshot, batch.
     */
    fun actions(): ActionService

    /**
     * Creates an isolated browser session with network access restricted to the domains you allow.
     */
    fun create(params: BrowserSessionCreateParams): BrowserSessionCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BrowserSessionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrowserSessionCreateResponse

    /** Returns the current status of a browser session. */
    fun retrieve(id: String): BrowserSessionRetrieveResponse =
        retrieve(id, BrowserSessionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BrowserSessionRetrieveParams = BrowserSessionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrowserSessionRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BrowserSessionRetrieveParams = BrowserSessionRetrieveParams.none(),
    ): BrowserSessionRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BrowserSessionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrowserSessionRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: BrowserSessionRetrieveParams): BrowserSessionRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): BrowserSessionRetrieveResponse =
        retrieve(id, BrowserSessionRetrieveParams.none(), requestOptions)

    /** Lists sessions for the authenticated org. Optional status filter. */
    fun list(): BrowserSessionListResponse = list(BrowserSessionListParams.none())

    /** @see list */
    fun list(
        params: BrowserSessionListParams = BrowserSessionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrowserSessionListResponse

    /** @see list */
    fun list(
        params: BrowserSessionListParams = BrowserSessionListParams.none()
    ): BrowserSessionListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): BrowserSessionListResponse =
        list(BrowserSessionListParams.none(), requestOptions)

    /**
     * Closes a ready session and releases its resources. An already closed, failed, or expired
     * session is returned unchanged; a provisioning session returns 409 session_not_ready.
     */
    fun delete(id: String): BrowserSessionDeleteResponse =
        delete(id, BrowserSessionDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: BrowserSessionDeleteParams = BrowserSessionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrowserSessionDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: BrowserSessionDeleteParams = BrowserSessionDeleteParams.none(),
    ): BrowserSessionDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BrowserSessionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrowserSessionDeleteResponse

    /** @see delete */
    fun delete(params: BrowserSessionDeleteParams): BrowserSessionDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): BrowserSessionDeleteResponse =
        delete(id, BrowserSessionDeleteParams.none(), requestOptions)

    /**
     * Returns artifact metadata and a signed download URL. The download URL requires Bearer auth.
     */
    fun retrieveArtifact(
        artifactId: String,
        params: BrowserSessionRetrieveArtifactParams,
    ): BrowserSessionRetrieveArtifactResponse =
        retrieveArtifact(artifactId, params, RequestOptions.none())

    /** @see retrieveArtifact */
    fun retrieveArtifact(
        artifactId: String,
        params: BrowserSessionRetrieveArtifactParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrowserSessionRetrieveArtifactResponse =
        retrieveArtifact(params.toBuilder().artifactId(artifactId).build(), requestOptions)

    /** @see retrieveArtifact */
    fun retrieveArtifact(
        params: BrowserSessionRetrieveArtifactParams
    ): BrowserSessionRetrieveArtifactResponse = retrieveArtifact(params, RequestOptions.none())

    /** @see retrieveArtifact */
    fun retrieveArtifact(
        params: BrowserSessionRetrieveArtifactParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrowserSessionRetrieveArtifactResponse

    /**
     * A view of [BrowserSessionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BrowserSessionService.WithRawResponse

        /**
         * Execute browser actions: navigate, observe, click, fill, select, press, scroll, wait_for,
         * screenshot, batch.
         */
        fun actions(): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /browser_sessions`, but is otherwise the same as
         * [BrowserSessionService.create].
         */
        @MustBeClosed
        fun create(
            params: BrowserSessionCreateParams
        ): HttpResponseFor<BrowserSessionCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BrowserSessionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrowserSessionCreateResponse>

        /**
         * Returns a raw HTTP response for `get /browser_sessions/{id}`, but is otherwise the same
         * as [BrowserSessionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<BrowserSessionRetrieveResponse> =
            retrieve(id, BrowserSessionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BrowserSessionRetrieveParams = BrowserSessionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrowserSessionRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BrowserSessionRetrieveParams = BrowserSessionRetrieveParams.none(),
        ): HttpResponseFor<BrowserSessionRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BrowserSessionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrowserSessionRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BrowserSessionRetrieveParams
        ): HttpResponseFor<BrowserSessionRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrowserSessionRetrieveResponse> =
            retrieve(id, BrowserSessionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /browser_sessions`, but is otherwise the same as
         * [BrowserSessionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<BrowserSessionListResponse> =
            list(BrowserSessionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BrowserSessionListParams = BrowserSessionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrowserSessionListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: BrowserSessionListParams = BrowserSessionListParams.none()
        ): HttpResponseFor<BrowserSessionListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BrowserSessionListResponse> =
            list(BrowserSessionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /browser_sessions/{id}`, but is otherwise the
         * same as [BrowserSessionService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<BrowserSessionDeleteResponse> =
            delete(id, BrowserSessionDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: BrowserSessionDeleteParams = BrowserSessionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrowserSessionDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: BrowserSessionDeleteParams = BrowserSessionDeleteParams.none(),
        ): HttpResponseFor<BrowserSessionDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: BrowserSessionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrowserSessionDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: BrowserSessionDeleteParams
        ): HttpResponseFor<BrowserSessionDeleteResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrowserSessionDeleteResponse> =
            delete(id, BrowserSessionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /browser_sessions/{id}/artifacts/{artifactId}`, but
         * is otherwise the same as [BrowserSessionService.retrieveArtifact].
         */
        @MustBeClosed
        fun retrieveArtifact(
            artifactId: String,
            params: BrowserSessionRetrieveArtifactParams,
        ): HttpResponseFor<BrowserSessionRetrieveArtifactResponse> =
            retrieveArtifact(artifactId, params, RequestOptions.none())

        /** @see retrieveArtifact */
        @MustBeClosed
        fun retrieveArtifact(
            artifactId: String,
            params: BrowserSessionRetrieveArtifactParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrowserSessionRetrieveArtifactResponse> =
            retrieveArtifact(params.toBuilder().artifactId(artifactId).build(), requestOptions)

        /** @see retrieveArtifact */
        @MustBeClosed
        fun retrieveArtifact(
            params: BrowserSessionRetrieveArtifactParams
        ): HttpResponseFor<BrowserSessionRetrieveArtifactResponse> =
            retrieveArtifact(params, RequestOptions.none())

        /** @see retrieveArtifact */
        @MustBeClosed
        fun retrieveArtifact(
            params: BrowserSessionRetrieveArtifactParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrowserSessionRetrieveArtifactResponse>
    }
}
