// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.mobilenetworkoperators.MobileNetworkOperatorListPage
import com.telnyx.sdk.models.mobilenetworkoperators.MobileNetworkOperatorListParams
import java.util.function.Consumer

interface MobileNetworkOperatorService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MobileNetworkOperatorService

    /**
     * Telnyx has a set of GSM mobile operators partners that are available through our mobile
     * network roaming. This resource is entirely managed by Telnyx and may change over time. That
     * means that this resource won't allow any write operations for it. Still, it's available so it
     * can be used as a support resource that can be related to other resources or become a
     * configuration option.
     */
    fun list(): MobileNetworkOperatorListPage = list(MobileNetworkOperatorListParams.none())

    /** @see list */
    fun list(
        params: MobileNetworkOperatorListParams = MobileNetworkOperatorListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MobileNetworkOperatorListPage

    /** @see list */
    fun list(
        params: MobileNetworkOperatorListParams = MobileNetworkOperatorListParams.none()
    ): MobileNetworkOperatorListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MobileNetworkOperatorListPage =
        list(MobileNetworkOperatorListParams.none(), requestOptions)

    /**
     * A view of [MobileNetworkOperatorService] that provides access to raw HTTP responses for each
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
        ): MobileNetworkOperatorService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /mobile_network_operators`, but is otherwise the
         * same as [MobileNetworkOperatorService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<MobileNetworkOperatorListPage> =
            list(MobileNetworkOperatorListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MobileNetworkOperatorListParams = MobileNetworkOperatorListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MobileNetworkOperatorListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MobileNetworkOperatorListParams = MobileNetworkOperatorListParams.none()
        ): HttpResponseFor<MobileNetworkOperatorListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MobileNetworkOperatorListPage> =
            list(MobileNetworkOperatorListParams.none(), requestOptions)
    }
}
