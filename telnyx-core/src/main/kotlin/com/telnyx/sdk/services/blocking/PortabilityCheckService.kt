// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.portabilitychecks.PortabilityCheckRunParams
import com.telnyx.sdk.models.portabilitychecks.PortabilityCheckRunResponse
import java.util.function.Consumer

/** Determining portability of phone numbers */
interface PortabilityCheckService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PortabilityCheckService

    /** Runs a portability check, returning the results immediately. */
    fun run(): PortabilityCheckRunResponse = run(PortabilityCheckRunParams.none())

    /** @see run */
    fun run(
        params: PortabilityCheckRunParams = PortabilityCheckRunParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortabilityCheckRunResponse

    /** @see run */
    fun run(
        params: PortabilityCheckRunParams = PortabilityCheckRunParams.none()
    ): PortabilityCheckRunResponse = run(params, RequestOptions.none())

    /** @see run */
    fun run(requestOptions: RequestOptions): PortabilityCheckRunResponse =
        run(PortabilityCheckRunParams.none(), requestOptions)

    /**
     * A view of [PortabilityCheckService] that provides access to raw HTTP responses for each
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
        ): PortabilityCheckService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /portability_checks`, but is otherwise the same as
         * [PortabilityCheckService.run].
         */
        @MustBeClosed
        fun run(): HttpResponseFor<PortabilityCheckRunResponse> =
            run(PortabilityCheckRunParams.none())

        /** @see run */
        @MustBeClosed
        fun run(
            params: PortabilityCheckRunParams = PortabilityCheckRunParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortabilityCheckRunResponse>

        /** @see run */
        @MustBeClosed
        fun run(
            params: PortabilityCheckRunParams = PortabilityCheckRunParams.none()
        ): HttpResponseFor<PortabilityCheckRunResponse> = run(params, RequestOptions.none())

        /** @see run */
        @MustBeClosed
        fun run(requestOptions: RequestOptions): HttpResponseFor<PortabilityCheckRunResponse> =
            run(PortabilityCheckRunParams.none(), requestOptions)
    }
}
