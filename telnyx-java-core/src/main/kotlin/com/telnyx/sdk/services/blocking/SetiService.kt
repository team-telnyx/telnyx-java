// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.seti.SetiRetrieveBlackBoxTestResultsParams
import com.telnyx.sdk.models.seti.SetiRetrieveBlackBoxTestResultsResponse
import java.util.function.Consumer

interface SetiService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SetiService

    /** Returns the results of the various black box tests */
    fun retrieveBlackBoxTestResults(): SetiRetrieveBlackBoxTestResultsResponse =
        retrieveBlackBoxTestResults(SetiRetrieveBlackBoxTestResultsParams.none())

    /** @see retrieveBlackBoxTestResults */
    fun retrieveBlackBoxTestResults(
        params: SetiRetrieveBlackBoxTestResultsParams =
            SetiRetrieveBlackBoxTestResultsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SetiRetrieveBlackBoxTestResultsResponse

    /** @see retrieveBlackBoxTestResults */
    fun retrieveBlackBoxTestResults(
        params: SetiRetrieveBlackBoxTestResultsParams = SetiRetrieveBlackBoxTestResultsParams.none()
    ): SetiRetrieveBlackBoxTestResultsResponse =
        retrieveBlackBoxTestResults(params, RequestOptions.none())

    /** @see retrieveBlackBoxTestResults */
    fun retrieveBlackBoxTestResults(
        requestOptions: RequestOptions
    ): SetiRetrieveBlackBoxTestResultsResponse =
        retrieveBlackBoxTestResults(SetiRetrieveBlackBoxTestResultsParams.none(), requestOptions)

    /** A view of [SetiService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SetiService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /seti/black_box_test_results`, but is otherwise the
         * same as [SetiService.retrieveBlackBoxTestResults].
         */
        @MustBeClosed
        fun retrieveBlackBoxTestResults():
            HttpResponseFor<SetiRetrieveBlackBoxTestResultsResponse> =
            retrieveBlackBoxTestResults(SetiRetrieveBlackBoxTestResultsParams.none())

        /** @see retrieveBlackBoxTestResults */
        @MustBeClosed
        fun retrieveBlackBoxTestResults(
            params: SetiRetrieveBlackBoxTestResultsParams =
                SetiRetrieveBlackBoxTestResultsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SetiRetrieveBlackBoxTestResultsResponse>

        /** @see retrieveBlackBoxTestResults */
        @MustBeClosed
        fun retrieveBlackBoxTestResults(
            params: SetiRetrieveBlackBoxTestResultsParams =
                SetiRetrieveBlackBoxTestResultsParams.none()
        ): HttpResponseFor<SetiRetrieveBlackBoxTestResultsResponse> =
            retrieveBlackBoxTestResults(params, RequestOptions.none())

        /** @see retrieveBlackBoxTestResults */
        @MustBeClosed
        fun retrieveBlackBoxTestResults(
            requestOptions: RequestOptions
        ): HttpResponseFor<SetiRetrieveBlackBoxTestResultsResponse> =
            retrieveBlackBoxTestResults(
                SetiRetrieveBlackBoxTestResultsParams.none(),
                requestOptions,
            )
    }
}
