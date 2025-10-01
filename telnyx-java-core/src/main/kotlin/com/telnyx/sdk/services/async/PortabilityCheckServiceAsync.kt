// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.portabilitychecks.PortabilityCheckRunParams
import com.telnyx.sdk.models.portabilitychecks.PortabilityCheckRunResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PortabilityCheckServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PortabilityCheckServiceAsync

    /** Runs a portability check, returning the results immediately. */
    fun run(): CompletableFuture<PortabilityCheckRunResponse> =
        run(PortabilityCheckRunParams.none())

    /** @see run */
    fun run(
        params: PortabilityCheckRunParams = PortabilityCheckRunParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortabilityCheckRunResponse>

    /** @see run */
    fun run(
        params: PortabilityCheckRunParams = PortabilityCheckRunParams.none()
    ): CompletableFuture<PortabilityCheckRunResponse> = run(params, RequestOptions.none())

    /** @see run */
    fun run(requestOptions: RequestOptions): CompletableFuture<PortabilityCheckRunResponse> =
        run(PortabilityCheckRunParams.none(), requestOptions)

    /**
     * A view of [PortabilityCheckServiceAsync] that provides access to raw HTTP responses for each
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
        ): PortabilityCheckServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /portability_checks`, but is otherwise the same as
         * [PortabilityCheckServiceAsync.run].
         */
        fun run(): CompletableFuture<HttpResponseFor<PortabilityCheckRunResponse>> =
            run(PortabilityCheckRunParams.none())

        /** @see run */
        fun run(
            params: PortabilityCheckRunParams = PortabilityCheckRunParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortabilityCheckRunResponse>>

        /** @see run */
        fun run(
            params: PortabilityCheckRunParams = PortabilityCheckRunParams.none()
        ): CompletableFuture<HttpResponseFor<PortabilityCheckRunResponse>> =
            run(params, RequestOptions.none())

        /** @see run */
        fun run(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PortabilityCheckRunResponse>> =
            run(PortabilityCheckRunParams.none(), requestOptions)
    }
}
