// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.wellknown.WellKnownRetrieveAuthorizationServerMetadataParams
import com.telnyx.api.models.wellknown.WellKnownRetrieveAuthorizationServerMetadataResponse
import com.telnyx.api.models.wellknown.WellKnownRetrieveProtectedResourceMetadataParams
import com.telnyx.api.models.wellknown.WellKnownRetrieveProtectedResourceMetadataResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface WellKnownServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WellKnownServiceAsync

    /** OAuth 2.0 Authorization Server Metadata (RFC 8414) */
    fun retrieveAuthorizationServerMetadata():
        CompletableFuture<WellKnownRetrieveAuthorizationServerMetadataResponse> =
        retrieveAuthorizationServerMetadata(
            WellKnownRetrieveAuthorizationServerMetadataParams.none()
        )

    /** @see retrieveAuthorizationServerMetadata */
    fun retrieveAuthorizationServerMetadata(
        params: WellKnownRetrieveAuthorizationServerMetadataParams =
            WellKnownRetrieveAuthorizationServerMetadataParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WellKnownRetrieveAuthorizationServerMetadataResponse>

    /** @see retrieveAuthorizationServerMetadata */
    fun retrieveAuthorizationServerMetadata(
        params: WellKnownRetrieveAuthorizationServerMetadataParams =
            WellKnownRetrieveAuthorizationServerMetadataParams.none()
    ): CompletableFuture<WellKnownRetrieveAuthorizationServerMetadataResponse> =
        retrieveAuthorizationServerMetadata(params, RequestOptions.none())

    /** @see retrieveAuthorizationServerMetadata */
    fun retrieveAuthorizationServerMetadata(
        requestOptions: RequestOptions
    ): CompletableFuture<WellKnownRetrieveAuthorizationServerMetadataResponse> =
        retrieveAuthorizationServerMetadata(
            WellKnownRetrieveAuthorizationServerMetadataParams.none(),
            requestOptions,
        )

    /** OAuth 2.0 Protected Resource Metadata for resource discovery */
    fun retrieveProtectedResourceMetadata():
        CompletableFuture<WellKnownRetrieveProtectedResourceMetadataResponse> =
        retrieveProtectedResourceMetadata(WellKnownRetrieveProtectedResourceMetadataParams.none())

    /** @see retrieveProtectedResourceMetadata */
    fun retrieveProtectedResourceMetadata(
        params: WellKnownRetrieveProtectedResourceMetadataParams =
            WellKnownRetrieveProtectedResourceMetadataParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WellKnownRetrieveProtectedResourceMetadataResponse>

    /** @see retrieveProtectedResourceMetadata */
    fun retrieveProtectedResourceMetadata(
        params: WellKnownRetrieveProtectedResourceMetadataParams =
            WellKnownRetrieveProtectedResourceMetadataParams.none()
    ): CompletableFuture<WellKnownRetrieveProtectedResourceMetadataResponse> =
        retrieveProtectedResourceMetadata(params, RequestOptions.none())

    /** @see retrieveProtectedResourceMetadata */
    fun retrieveProtectedResourceMetadata(
        requestOptions: RequestOptions
    ): CompletableFuture<WellKnownRetrieveProtectedResourceMetadataResponse> =
        retrieveProtectedResourceMetadata(
            WellKnownRetrieveProtectedResourceMetadataParams.none(),
            requestOptions,
        )

    /**
     * A view of [WellKnownServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WellKnownServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /.well-known/oauth-authorization-server`, but is
         * otherwise the same as [WellKnownServiceAsync.retrieveAuthorizationServerMetadata].
         */
        fun retrieveAuthorizationServerMetadata():
            CompletableFuture<
                HttpResponseFor<WellKnownRetrieveAuthorizationServerMetadataResponse>
            > =
            retrieveAuthorizationServerMetadata(
                WellKnownRetrieveAuthorizationServerMetadataParams.none()
            )

        /** @see retrieveAuthorizationServerMetadata */
        fun retrieveAuthorizationServerMetadata(
            params: WellKnownRetrieveAuthorizationServerMetadataParams =
                WellKnownRetrieveAuthorizationServerMetadataParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WellKnownRetrieveAuthorizationServerMetadataResponse>>

        /** @see retrieveAuthorizationServerMetadata */
        fun retrieveAuthorizationServerMetadata(
            params: WellKnownRetrieveAuthorizationServerMetadataParams =
                WellKnownRetrieveAuthorizationServerMetadataParams.none()
        ): CompletableFuture<
            HttpResponseFor<WellKnownRetrieveAuthorizationServerMetadataResponse>
        > = retrieveAuthorizationServerMetadata(params, RequestOptions.none())

        /** @see retrieveAuthorizationServerMetadata */
        fun retrieveAuthorizationServerMetadata(
            requestOptions: RequestOptions
        ): CompletableFuture<
            HttpResponseFor<WellKnownRetrieveAuthorizationServerMetadataResponse>
        > =
            retrieveAuthorizationServerMetadata(
                WellKnownRetrieveAuthorizationServerMetadataParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /.well-known/oauth-protected-resource`, but is
         * otherwise the same as [WellKnownServiceAsync.retrieveProtectedResourceMetadata].
         */
        fun retrieveProtectedResourceMetadata():
            CompletableFuture<HttpResponseFor<WellKnownRetrieveProtectedResourceMetadataResponse>> =
            retrieveProtectedResourceMetadata(
                WellKnownRetrieveProtectedResourceMetadataParams.none()
            )

        /** @see retrieveProtectedResourceMetadata */
        fun retrieveProtectedResourceMetadata(
            params: WellKnownRetrieveProtectedResourceMetadataParams =
                WellKnownRetrieveProtectedResourceMetadataParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WellKnownRetrieveProtectedResourceMetadataResponse>>

        /** @see retrieveProtectedResourceMetadata */
        fun retrieveProtectedResourceMetadata(
            params: WellKnownRetrieveProtectedResourceMetadataParams =
                WellKnownRetrieveProtectedResourceMetadataParams.none()
        ): CompletableFuture<HttpResponseFor<WellKnownRetrieveProtectedResourceMetadataResponse>> =
            retrieveProtectedResourceMetadata(params, RequestOptions.none())

        /** @see retrieveProtectedResourceMetadata */
        fun retrieveProtectedResourceMetadata(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<WellKnownRetrieveProtectedResourceMetadataResponse>> =
            retrieveProtectedResourceMetadata(
                WellKnownRetrieveProtectedResourceMetadataParams.none(),
                requestOptions,
            )
    }
}
