// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.wellknown.WellKnownRetrieveAuthorizationServerMetadataParams
import com.telnyx.api.models.wellknown.WellKnownRetrieveAuthorizationServerMetadataResponse
import com.telnyx.api.models.wellknown.WellKnownRetrieveProtectedResourceMetadataParams
import com.telnyx.api.models.wellknown.WellKnownRetrieveProtectedResourceMetadataResponse
import java.util.function.Consumer

interface WellKnownService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WellKnownService

    /** OAuth 2.0 Authorization Server Metadata (RFC 8414) */
    fun retrieveAuthorizationServerMetadata():
        WellKnownRetrieveAuthorizationServerMetadataResponse =
        retrieveAuthorizationServerMetadata(
            WellKnownRetrieveAuthorizationServerMetadataParams.none()
        )

    /** @see retrieveAuthorizationServerMetadata */
    fun retrieveAuthorizationServerMetadata(
        params: WellKnownRetrieveAuthorizationServerMetadataParams =
            WellKnownRetrieveAuthorizationServerMetadataParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WellKnownRetrieveAuthorizationServerMetadataResponse

    /** @see retrieveAuthorizationServerMetadata */
    fun retrieveAuthorizationServerMetadata(
        params: WellKnownRetrieveAuthorizationServerMetadataParams =
            WellKnownRetrieveAuthorizationServerMetadataParams.none()
    ): WellKnownRetrieveAuthorizationServerMetadataResponse =
        retrieveAuthorizationServerMetadata(params, RequestOptions.none())

    /** @see retrieveAuthorizationServerMetadata */
    fun retrieveAuthorizationServerMetadata(
        requestOptions: RequestOptions
    ): WellKnownRetrieveAuthorizationServerMetadataResponse =
        retrieveAuthorizationServerMetadata(
            WellKnownRetrieveAuthorizationServerMetadataParams.none(),
            requestOptions,
        )

    /** OAuth 2.0 Protected Resource Metadata for resource discovery */
    fun retrieveProtectedResourceMetadata(): WellKnownRetrieveProtectedResourceMetadataResponse =
        retrieveProtectedResourceMetadata(WellKnownRetrieveProtectedResourceMetadataParams.none())

    /** @see retrieveProtectedResourceMetadata */
    fun retrieveProtectedResourceMetadata(
        params: WellKnownRetrieveProtectedResourceMetadataParams =
            WellKnownRetrieveProtectedResourceMetadataParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WellKnownRetrieveProtectedResourceMetadataResponse

    /** @see retrieveProtectedResourceMetadata */
    fun retrieveProtectedResourceMetadata(
        params: WellKnownRetrieveProtectedResourceMetadataParams =
            WellKnownRetrieveProtectedResourceMetadataParams.none()
    ): WellKnownRetrieveProtectedResourceMetadataResponse =
        retrieveProtectedResourceMetadata(params, RequestOptions.none())

    /** @see retrieveProtectedResourceMetadata */
    fun retrieveProtectedResourceMetadata(
        requestOptions: RequestOptions
    ): WellKnownRetrieveProtectedResourceMetadataResponse =
        retrieveProtectedResourceMetadata(
            WellKnownRetrieveProtectedResourceMetadataParams.none(),
            requestOptions,
        )

    /** A view of [WellKnownService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): WellKnownService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /.well-known/oauth-authorization-server`, but is
         * otherwise the same as [WellKnownService.retrieveAuthorizationServerMetadata].
         */
        @MustBeClosed
        fun retrieveAuthorizationServerMetadata():
            HttpResponseFor<WellKnownRetrieveAuthorizationServerMetadataResponse> =
            retrieveAuthorizationServerMetadata(
                WellKnownRetrieveAuthorizationServerMetadataParams.none()
            )

        /** @see retrieveAuthorizationServerMetadata */
        @MustBeClosed
        fun retrieveAuthorizationServerMetadata(
            params: WellKnownRetrieveAuthorizationServerMetadataParams =
                WellKnownRetrieveAuthorizationServerMetadataParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WellKnownRetrieveAuthorizationServerMetadataResponse>

        /** @see retrieveAuthorizationServerMetadata */
        @MustBeClosed
        fun retrieveAuthorizationServerMetadata(
            params: WellKnownRetrieveAuthorizationServerMetadataParams =
                WellKnownRetrieveAuthorizationServerMetadataParams.none()
        ): HttpResponseFor<WellKnownRetrieveAuthorizationServerMetadataResponse> =
            retrieveAuthorizationServerMetadata(params, RequestOptions.none())

        /** @see retrieveAuthorizationServerMetadata */
        @MustBeClosed
        fun retrieveAuthorizationServerMetadata(
            requestOptions: RequestOptions
        ): HttpResponseFor<WellKnownRetrieveAuthorizationServerMetadataResponse> =
            retrieveAuthorizationServerMetadata(
                WellKnownRetrieveAuthorizationServerMetadataParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /.well-known/oauth-protected-resource`, but is
         * otherwise the same as [WellKnownService.retrieveProtectedResourceMetadata].
         */
        @MustBeClosed
        fun retrieveProtectedResourceMetadata():
            HttpResponseFor<WellKnownRetrieveProtectedResourceMetadataResponse> =
            retrieveProtectedResourceMetadata(
                WellKnownRetrieveProtectedResourceMetadataParams.none()
            )

        /** @see retrieveProtectedResourceMetadata */
        @MustBeClosed
        fun retrieveProtectedResourceMetadata(
            params: WellKnownRetrieveProtectedResourceMetadataParams =
                WellKnownRetrieveProtectedResourceMetadataParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WellKnownRetrieveProtectedResourceMetadataResponse>

        /** @see retrieveProtectedResourceMetadata */
        @MustBeClosed
        fun retrieveProtectedResourceMetadata(
            params: WellKnownRetrieveProtectedResourceMetadataParams =
                WellKnownRetrieveProtectedResourceMetadataParams.none()
        ): HttpResponseFor<WellKnownRetrieveProtectedResourceMetadataResponse> =
            retrieveProtectedResourceMetadata(params, RequestOptions.none())

        /** @see retrieveProtectedResourceMetadata */
        @MustBeClosed
        fun retrieveProtectedResourceMetadata(
            requestOptions: RequestOptions
        ): HttpResponseFor<WellKnownRetrieveProtectedResourceMetadataResponse> =
            retrieveProtectedResourceMetadata(
                WellKnownRetrieveProtectedResourceMetadataParams.none(),
                requestOptions,
            )
    }
}
