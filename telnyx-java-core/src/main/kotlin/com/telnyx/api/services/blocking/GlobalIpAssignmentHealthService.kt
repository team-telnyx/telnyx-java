// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.globalipassignmenthealth.GlobalIpAssignmentHealthRetrieveParams
import com.telnyx.api.models.globalipassignmenthealth.GlobalIpAssignmentHealthRetrieveResponse
import java.util.function.Consumer

interface GlobalIpAssignmentHealthService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GlobalIpAssignmentHealthService

    /** Global IP Assignment Health Check Metrics */
    fun retrieve(): GlobalIpAssignmentHealthRetrieveResponse =
        retrieve(GlobalIpAssignmentHealthRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: GlobalIpAssignmentHealthRetrieveParams =
            GlobalIpAssignmentHealthRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GlobalIpAssignmentHealthRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: GlobalIpAssignmentHealthRetrieveParams =
            GlobalIpAssignmentHealthRetrieveParams.none()
    ): GlobalIpAssignmentHealthRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): GlobalIpAssignmentHealthRetrieveResponse =
        retrieve(GlobalIpAssignmentHealthRetrieveParams.none(), requestOptions)

    /**
     * A view of [GlobalIpAssignmentHealthService] that provides access to raw HTTP responses for
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
        ): GlobalIpAssignmentHealthService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /global_ip_assignment_health`, but is otherwise the
         * same as [GlobalIpAssignmentHealthService.retrieve].
         */
        @MustBeClosed
        fun retrieve(): HttpResponseFor<GlobalIpAssignmentHealthRetrieveResponse> =
            retrieve(GlobalIpAssignmentHealthRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: GlobalIpAssignmentHealthRetrieveParams =
                GlobalIpAssignmentHealthRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GlobalIpAssignmentHealthRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: GlobalIpAssignmentHealthRetrieveParams =
                GlobalIpAssignmentHealthRetrieveParams.none()
        ): HttpResponseFor<GlobalIpAssignmentHealthRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            requestOptions: RequestOptions
        ): HttpResponseFor<GlobalIpAssignmentHealthRetrieveResponse> =
            retrieve(GlobalIpAssignmentHealthRetrieveParams.none(), requestOptions)
    }
}
