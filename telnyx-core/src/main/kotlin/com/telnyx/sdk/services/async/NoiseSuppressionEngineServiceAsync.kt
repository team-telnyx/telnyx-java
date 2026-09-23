// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.noisesuppressionengines.NoiseSuppressionEngineListParams
import com.telnyx.sdk.models.noisesuppressionengines.NoiseSuppressionEngineListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Noise suppression engines that can be selected when configuring noise suppression on voice
 * connections.
 */
interface NoiseSuppressionEngineServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NoiseSuppressionEngineServiceAsync

    /**
     * Returns all noise suppression engines available to the authenticated user. Engines gated
     * behind a feature flag are included only when the flag is enabled for the user's account.
     * Results are not paginated; the number of engines is expected to remain small.
     */
    fun list(): CompletableFuture<NoiseSuppressionEngineListResponse> =
        list(NoiseSuppressionEngineListParams.none())

    /** @see list */
    fun list(
        params: NoiseSuppressionEngineListParams = NoiseSuppressionEngineListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NoiseSuppressionEngineListResponse>

    /** @see list */
    fun list(
        params: NoiseSuppressionEngineListParams = NoiseSuppressionEngineListParams.none()
    ): CompletableFuture<NoiseSuppressionEngineListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<NoiseSuppressionEngineListResponse> =
        list(NoiseSuppressionEngineListParams.none(), requestOptions)

    /**
     * A view of [NoiseSuppressionEngineServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NoiseSuppressionEngineServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /noise_suppression_engines`, but is otherwise the
         * same as [NoiseSuppressionEngineServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<NoiseSuppressionEngineListResponse>> =
            list(NoiseSuppressionEngineListParams.none())

        /** @see list */
        fun list(
            params: NoiseSuppressionEngineListParams = NoiseSuppressionEngineListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NoiseSuppressionEngineListResponse>>

        /** @see list */
        fun list(
            params: NoiseSuppressionEngineListParams = NoiseSuppressionEngineListParams.none()
        ): CompletableFuture<HttpResponseFor<NoiseSuppressionEngineListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<NoiseSuppressionEngineListResponse>> =
            list(NoiseSuppressionEngineListParams.none(), requestOptions)
    }
}
