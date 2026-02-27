// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.globaliphealthchecktypes.GlobalIpHealthCheckTypeListParams
import com.telnyx.sdk.models.globaliphealthchecktypes.GlobalIpHealthCheckTypeListResponse
import java.util.function.Consumer

/** Global IPs */
interface GlobalIpHealthCheckTypeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GlobalIpHealthCheckTypeService

    /** List all Global IP Health check types. */
    fun list(): GlobalIpHealthCheckTypeListResponse = list(GlobalIpHealthCheckTypeListParams.none())

    /** @see list */
    fun list(
        params: GlobalIpHealthCheckTypeListParams = GlobalIpHealthCheckTypeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GlobalIpHealthCheckTypeListResponse

    /** @see list */
    fun list(
        params: GlobalIpHealthCheckTypeListParams = GlobalIpHealthCheckTypeListParams.none()
    ): GlobalIpHealthCheckTypeListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): GlobalIpHealthCheckTypeListResponse =
        list(GlobalIpHealthCheckTypeListParams.none(), requestOptions)

    /**
     * A view of [GlobalIpHealthCheckTypeService] that provides access to raw HTTP responses for
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
        ): GlobalIpHealthCheckTypeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /global_ip_health_check_types`, but is otherwise the
         * same as [GlobalIpHealthCheckTypeService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<GlobalIpHealthCheckTypeListResponse> =
            list(GlobalIpHealthCheckTypeListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: GlobalIpHealthCheckTypeListParams = GlobalIpHealthCheckTypeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GlobalIpHealthCheckTypeListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: GlobalIpHealthCheckTypeListParams = GlobalIpHealthCheckTypeListParams.none()
        ): HttpResponseFor<GlobalIpHealthCheckTypeListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<GlobalIpHealthCheckTypeListResponse> =
            list(GlobalIpHealthCheckTypeListParams.none(), requestOptions)
    }
}
