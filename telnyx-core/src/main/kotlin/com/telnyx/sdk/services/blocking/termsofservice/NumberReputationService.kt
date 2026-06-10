// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.termsofservice

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.termsofservice.numberreputation.NumberReputationAgreeParams
import com.telnyx.sdk.models.termsofservice.numberreputation.NumberReputationAgreeResponse
import java.util.function.Consumer

/** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
interface NumberReputationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumberReputationService

    /**
     * Records the authenticated user's agreement to the current Phone Number Reputation ToS. No
     * body required. Idempotent.
     *
     * Prerequisite for using any of the `/v2/.../reputation&#47;*` endpoints.
     */
    fun agree(): NumberReputationAgreeResponse = agree(NumberReputationAgreeParams.none())

    /** @see agree */
    fun agree(
        params: NumberReputationAgreeParams = NumberReputationAgreeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberReputationAgreeResponse

    /** @see agree */
    fun agree(
        params: NumberReputationAgreeParams = NumberReputationAgreeParams.none()
    ): NumberReputationAgreeResponse = agree(params, RequestOptions.none())

    /** @see agree */
    fun agree(requestOptions: RequestOptions): NumberReputationAgreeResponse =
        agree(NumberReputationAgreeParams.none(), requestOptions)

    /**
     * A view of [NumberReputationService] that provides access to raw HTTP responses for each
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
        ): NumberReputationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /terms_of_service/number_reputation/agree`, but is
         * otherwise the same as [NumberReputationService.agree].
         */
        @MustBeClosed
        fun agree(): HttpResponseFor<NumberReputationAgreeResponse> =
            agree(NumberReputationAgreeParams.none())

        /** @see agree */
        @MustBeClosed
        fun agree(
            params: NumberReputationAgreeParams = NumberReputationAgreeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberReputationAgreeResponse>

        /** @see agree */
        @MustBeClosed
        fun agree(
            params: NumberReputationAgreeParams = NumberReputationAgreeParams.none()
        ): HttpResponseFor<NumberReputationAgreeResponse> = agree(params, RequestOptions.none())

        /** @see agree */
        @MustBeClosed
        fun agree(requestOptions: RequestOptions): HttpResponseFor<NumberReputationAgreeResponse> =
            agree(NumberReputationAgreeParams.none(), requestOptions)
    }
}
