// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.noisesuppressionengines.NoiseSuppressionEngineListParams
import com.telnyx.sdk.models.noisesuppressionengines.NoiseSuppressionEngineListResponse
import java.util.function.Consumer

/**
 * Noise suppression engines that can be selected when configuring noise suppression on voice
 * connections.
 */
interface NoiseSuppressionEngineService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NoiseSuppressionEngineService

    /**
     * Returns all noise suppression engines available to the authenticated user. Engines gated
     * behind a feature flag are included only when the flag is enabled for the user's account.
     * Results are not paginated; the number of engines is expected to remain small.
     */
    fun list(): NoiseSuppressionEngineListResponse = list(NoiseSuppressionEngineListParams.none())

    /** @see list */
    fun list(
        params: NoiseSuppressionEngineListParams = NoiseSuppressionEngineListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NoiseSuppressionEngineListResponse

    /** @see list */
    fun list(
        params: NoiseSuppressionEngineListParams = NoiseSuppressionEngineListParams.none()
    ): NoiseSuppressionEngineListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): NoiseSuppressionEngineListResponse =
        list(NoiseSuppressionEngineListParams.none(), requestOptions)

    /**
     * A view of [NoiseSuppressionEngineService] that provides access to raw HTTP responses for each
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
        ): NoiseSuppressionEngineService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /noise_suppression_engines`, but is otherwise the
         * same as [NoiseSuppressionEngineService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<NoiseSuppressionEngineListResponse> =
            list(NoiseSuppressionEngineListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: NoiseSuppressionEngineListParams = NoiseSuppressionEngineListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NoiseSuppressionEngineListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: NoiseSuppressionEngineListParams = NoiseSuppressionEngineListParams.none()
        ): HttpResponseFor<NoiseSuppressionEngineListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<NoiseSuppressionEngineListResponse> =
            list(NoiseSuppressionEngineListParams.none(), requestOptions)
    }
}
