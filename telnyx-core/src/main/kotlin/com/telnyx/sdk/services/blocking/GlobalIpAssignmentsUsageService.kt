// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.globalipassignmentsusage.GlobalIpAssignmentsUsageRetrieveParams
import com.telnyx.sdk.models.globalipassignmentsusage.GlobalIpAssignmentsUsageRetrieveResponse
import java.util.function.Consumer

/** Global IPs */
interface GlobalIpAssignmentsUsageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GlobalIpAssignmentsUsageService

    /** Global IP Assignment Usage Metrics */
    fun retrieve(): GlobalIpAssignmentsUsageRetrieveResponse =
        retrieve(GlobalIpAssignmentsUsageRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: GlobalIpAssignmentsUsageRetrieveParams =
            GlobalIpAssignmentsUsageRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GlobalIpAssignmentsUsageRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: GlobalIpAssignmentsUsageRetrieveParams =
            GlobalIpAssignmentsUsageRetrieveParams.none()
    ): GlobalIpAssignmentsUsageRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): GlobalIpAssignmentsUsageRetrieveResponse =
        retrieve(GlobalIpAssignmentsUsageRetrieveParams.none(), requestOptions)

    /**
     * A view of [GlobalIpAssignmentsUsageService] that provides access to raw HTTP responses for
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
        ): GlobalIpAssignmentsUsageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /global_ip_assignments_usage`, but is otherwise the
         * same as [GlobalIpAssignmentsUsageService.retrieve].
         */
        @MustBeClosed
        fun retrieve(): HttpResponseFor<GlobalIpAssignmentsUsageRetrieveResponse> =
            retrieve(GlobalIpAssignmentsUsageRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: GlobalIpAssignmentsUsageRetrieveParams =
                GlobalIpAssignmentsUsageRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GlobalIpAssignmentsUsageRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: GlobalIpAssignmentsUsageRetrieveParams =
                GlobalIpAssignmentsUsageRetrieveParams.none()
        ): HttpResponseFor<GlobalIpAssignmentsUsageRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            requestOptions: RequestOptions
        ): HttpResponseFor<GlobalIpAssignmentsUsageRetrieveResponse> =
            retrieve(GlobalIpAssignmentsUsageRetrieveParams.none(), requestOptions)
    }
}
