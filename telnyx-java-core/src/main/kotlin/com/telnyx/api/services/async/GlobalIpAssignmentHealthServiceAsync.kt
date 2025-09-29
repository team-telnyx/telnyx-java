// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.globalipassignmenthealth.GlobalIpAssignmentHealthRetrieveParams
import com.telnyx.api.models.globalipassignmenthealth.GlobalIpAssignmentHealthRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GlobalIpAssignmentHealthServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GlobalIpAssignmentHealthServiceAsync

    /** Global IP Assignment Health Check Metrics */
    fun retrieve(): CompletableFuture<GlobalIpAssignmentHealthRetrieveResponse> =
        retrieve(GlobalIpAssignmentHealthRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: GlobalIpAssignmentHealthRetrieveParams =
            GlobalIpAssignmentHealthRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GlobalIpAssignmentHealthRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: GlobalIpAssignmentHealthRetrieveParams =
            GlobalIpAssignmentHealthRetrieveParams.none()
    ): CompletableFuture<GlobalIpAssignmentHealthRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        requestOptions: RequestOptions
    ): CompletableFuture<GlobalIpAssignmentHealthRetrieveResponse> =
        retrieve(GlobalIpAssignmentHealthRetrieveParams.none(), requestOptions)

    /**
     * A view of [GlobalIpAssignmentHealthServiceAsync] that provides access to raw HTTP responses
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
        ): GlobalIpAssignmentHealthServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /global_ip_assignment_health`, but is otherwise the
         * same as [GlobalIpAssignmentHealthServiceAsync.retrieve].
         */
        fun retrieve():
            CompletableFuture<HttpResponseFor<GlobalIpAssignmentHealthRetrieveResponse>> =
            retrieve(GlobalIpAssignmentHealthRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            params: GlobalIpAssignmentHealthRetrieveParams =
                GlobalIpAssignmentHealthRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpAssignmentHealthRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: GlobalIpAssignmentHealthRetrieveParams =
                GlobalIpAssignmentHealthRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<GlobalIpAssignmentHealthRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<GlobalIpAssignmentHealthRetrieveResponse>> =
            retrieve(GlobalIpAssignmentHealthRetrieveParams.none(), requestOptions)
    }
}
