// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.mobilenetworkoperators.MobileNetworkOperatorListParams
import com.telnyx.api.models.mobilenetworkoperators.MobileNetworkOperatorListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MobileNetworkOperatorServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MobileNetworkOperatorServiceAsync

    /**
     * Telnyx has a set of GSM mobile operators partners that are available through our mobile
     * network roaming. This resource is entirely managed by Telnyx and may change over time. That
     * means that this resource won't allow any write operations for it. Still, it's available so it
     * can be used as a support resource that can be related to other resources or become a
     * configuration option.
     */
    fun list(): CompletableFuture<MobileNetworkOperatorListResponse> =
        list(MobileNetworkOperatorListParams.none())

    /** @see list */
    fun list(
        params: MobileNetworkOperatorListParams = MobileNetworkOperatorListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MobileNetworkOperatorListResponse>

    /** @see list */
    fun list(
        params: MobileNetworkOperatorListParams = MobileNetworkOperatorListParams.none()
    ): CompletableFuture<MobileNetworkOperatorListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MobileNetworkOperatorListResponse> =
        list(MobileNetworkOperatorListParams.none(), requestOptions)

    /**
     * A view of [MobileNetworkOperatorServiceAsync] that provides access to raw HTTP responses for
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
        ): MobileNetworkOperatorServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /mobile_network_operators`, but is otherwise the
         * same as [MobileNetworkOperatorServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MobileNetworkOperatorListResponse>> =
            list(MobileNetworkOperatorListParams.none())

        /** @see list */
        fun list(
            params: MobileNetworkOperatorListParams = MobileNetworkOperatorListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MobileNetworkOperatorListResponse>>

        /** @see list */
        fun list(
            params: MobileNetworkOperatorListParams = MobileNetworkOperatorListParams.none()
        ): CompletableFuture<HttpResponseFor<MobileNetworkOperatorListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MobileNetworkOperatorListResponse>> =
            list(MobileNetworkOperatorListParams.none(), requestOptions)
    }
}
