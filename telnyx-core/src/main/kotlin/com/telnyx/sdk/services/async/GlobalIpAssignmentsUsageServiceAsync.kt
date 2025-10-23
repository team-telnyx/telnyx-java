// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.globalipassignmentsusage.GlobalIpAssignmentsUsageRetrieveParams
import com.telnyx.sdk.models.globalipassignmentsusage.GlobalIpAssignmentsUsageRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GlobalIpAssignmentsUsageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GlobalIpAssignmentsUsageServiceAsync

    /** Global IP Assignment Usage Metrics */
    fun retrieve(): CompletableFuture<GlobalIpAssignmentsUsageRetrieveResponse> =
        retrieve(GlobalIpAssignmentsUsageRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: GlobalIpAssignmentsUsageRetrieveParams =
            GlobalIpAssignmentsUsageRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GlobalIpAssignmentsUsageRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: GlobalIpAssignmentsUsageRetrieveParams =
            GlobalIpAssignmentsUsageRetrieveParams.none()
    ): CompletableFuture<GlobalIpAssignmentsUsageRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        requestOptions: RequestOptions
    ): CompletableFuture<GlobalIpAssignmentsUsageRetrieveResponse> =
        retrieve(GlobalIpAssignmentsUsageRetrieveParams.none(), requestOptions)

    /**
     * A view of [GlobalIpAssignmentsUsageServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GlobalIpAssignmentsUsageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /global_ip_assignments_usage`, but is otherwise the
         * same as [GlobalIpAssignmentsUsageServiceAsync.retrieve].
         */
        fun retrieve():
            CompletableFuture<HttpResponseFor<GlobalIpAssignmentsUsageRetrieveResponse>> =
            retrieve(GlobalIpAssignmentsUsageRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            params: GlobalIpAssignmentsUsageRetrieveParams =
                GlobalIpAssignmentsUsageRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpAssignmentsUsageRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: GlobalIpAssignmentsUsageRetrieveParams =
                GlobalIpAssignmentsUsageRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<GlobalIpAssignmentsUsageRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<GlobalIpAssignmentsUsageRetrieveResponse>> =
            retrieve(GlobalIpAssignmentsUsageRetrieveParams.none(), requestOptions)
    }
}
