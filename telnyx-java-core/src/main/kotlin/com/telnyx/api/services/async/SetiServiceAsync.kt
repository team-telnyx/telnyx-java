// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.seti.SetiRetrieveBlackBoxTestResultsParams
import com.telnyx.api.models.seti.SetiRetrieveBlackBoxTestResultsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SetiServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SetiServiceAsync

    /** Returns the results of the various black box tests */
    fun retrieveBlackBoxTestResults(): CompletableFuture<SetiRetrieveBlackBoxTestResultsResponse> =
        retrieveBlackBoxTestResults(SetiRetrieveBlackBoxTestResultsParams.none())

    /** @see retrieveBlackBoxTestResults */
    fun retrieveBlackBoxTestResults(
        params: SetiRetrieveBlackBoxTestResultsParams =
            SetiRetrieveBlackBoxTestResultsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SetiRetrieveBlackBoxTestResultsResponse>

    /** @see retrieveBlackBoxTestResults */
    fun retrieveBlackBoxTestResults(
        params: SetiRetrieveBlackBoxTestResultsParams = SetiRetrieveBlackBoxTestResultsParams.none()
    ): CompletableFuture<SetiRetrieveBlackBoxTestResultsResponse> =
        retrieveBlackBoxTestResults(params, RequestOptions.none())

    /** @see retrieveBlackBoxTestResults */
    fun retrieveBlackBoxTestResults(
        requestOptions: RequestOptions
    ): CompletableFuture<SetiRetrieveBlackBoxTestResultsResponse> =
        retrieveBlackBoxTestResults(SetiRetrieveBlackBoxTestResultsParams.none(), requestOptions)

    /** A view of [SetiServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SetiServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /seti/black_box_test_results`, but is otherwise the
         * same as [SetiServiceAsync.retrieveBlackBoxTestResults].
         */
        fun retrieveBlackBoxTestResults():
            CompletableFuture<HttpResponseFor<SetiRetrieveBlackBoxTestResultsResponse>> =
            retrieveBlackBoxTestResults(SetiRetrieveBlackBoxTestResultsParams.none())

        /** @see retrieveBlackBoxTestResults */
        fun retrieveBlackBoxTestResults(
            params: SetiRetrieveBlackBoxTestResultsParams =
                SetiRetrieveBlackBoxTestResultsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SetiRetrieveBlackBoxTestResultsResponse>>

        /** @see retrieveBlackBoxTestResults */
        fun retrieveBlackBoxTestResults(
            params: SetiRetrieveBlackBoxTestResultsParams =
                SetiRetrieveBlackBoxTestResultsParams.none()
        ): CompletableFuture<HttpResponseFor<SetiRetrieveBlackBoxTestResultsResponse>> =
            retrieveBlackBoxTestResults(params, RequestOptions.none())

        /** @see retrieveBlackBoxTestResults */
        fun retrieveBlackBoxTestResults(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SetiRetrieveBlackBoxTestResultsResponse>> =
            retrieveBlackBoxTestResults(
                SetiRetrieveBlackBoxTestResultsParams.none(),
                requestOptions,
            )
    }
}
