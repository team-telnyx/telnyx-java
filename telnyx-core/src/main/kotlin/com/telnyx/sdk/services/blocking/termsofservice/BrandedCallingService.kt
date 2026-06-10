// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.termsofservice

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.termsofservice.brandedcalling.BrandedCallingAgreeParams
import com.telnyx.sdk.models.termsofservice.brandedcalling.BrandedCallingAgreeResponse
import java.util.function.Consumer

/** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
interface BrandedCallingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandedCallingService

    /**
     * Records the authenticated user's agreement to the current Branded Calling ToS. No body
     * required. Idempotent - re-calling after agreement is a no-op and returns the existing
     * agreement.
     *
     * This is a prerequisite for activating Branded Calling on any enterprise (`POST
     * /enterprises/{id}/branded_calling`); without an agreement, activation returns `403`.
     */
    fun agree(): BrandedCallingAgreeResponse = agree(BrandedCallingAgreeParams.none())

    /** @see agree */
    fun agree(
        params: BrandedCallingAgreeParams = BrandedCallingAgreeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandedCallingAgreeResponse

    /** @see agree */
    fun agree(
        params: BrandedCallingAgreeParams = BrandedCallingAgreeParams.none()
    ): BrandedCallingAgreeResponse = agree(params, RequestOptions.none())

    /** @see agree */
    fun agree(requestOptions: RequestOptions): BrandedCallingAgreeResponse =
        agree(BrandedCallingAgreeParams.none(), requestOptions)

    /**
     * A view of [BrandedCallingService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BrandedCallingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /terms_of_service/branded_calling/agree`, but is
         * otherwise the same as [BrandedCallingService.agree].
         */
        @MustBeClosed
        fun agree(): HttpResponseFor<BrandedCallingAgreeResponse> =
            agree(BrandedCallingAgreeParams.none())

        /** @see agree */
        @MustBeClosed
        fun agree(
            params: BrandedCallingAgreeParams = BrandedCallingAgreeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandedCallingAgreeResponse>

        /** @see agree */
        @MustBeClosed
        fun agree(
            params: BrandedCallingAgreeParams = BrandedCallingAgreeParams.none()
        ): HttpResponseFor<BrandedCallingAgreeResponse> = agree(params, RequestOptions.none())

        /** @see agree */
        @MustBeClosed
        fun agree(requestOptions: RequestOptions): HttpResponseFor<BrandedCallingAgreeResponse> =
            agree(BrandedCallingAgreeParams.none(), requestOptions)
    }
}
