// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.termsofservice

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.termsofservice.agreements.TosAgreementWrapped
import com.telnyx.sdk.models.termsofservice.brandedcalling.BrandedCallingAgreeParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
interface BrandedCallingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandedCallingServiceAsync

    /**
     * Records the authenticated user's agreement to the current Branded Calling ToS. No body
     * required. Idempotent - re-calling after agreement is a no-op and returns the existing
     * agreement.
     *
     * This is a prerequisite for activating Branded Calling on any enterprise (`POST
     * /enterprises/{id}/branded_calling`); without an agreement, activation returns `403`.
     */
    fun agree(): CompletableFuture<TosAgreementWrapped> = agree(BrandedCallingAgreeParams.none())

    /** @see agree */
    fun agree(
        params: BrandedCallingAgreeParams = BrandedCallingAgreeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TosAgreementWrapped>

    /** @see agree */
    fun agree(
        params: BrandedCallingAgreeParams = BrandedCallingAgreeParams.none()
    ): CompletableFuture<TosAgreementWrapped> = agree(params, RequestOptions.none())

    /** @see agree */
    fun agree(requestOptions: RequestOptions): CompletableFuture<TosAgreementWrapped> =
        agree(BrandedCallingAgreeParams.none(), requestOptions)

    /**
     * A view of [BrandedCallingServiceAsync] that provides access to raw HTTP responses for each
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
        ): BrandedCallingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /terms_of_service/branded_calling/agree`, but is
         * otherwise the same as [BrandedCallingServiceAsync.agree].
         */
        fun agree(): CompletableFuture<HttpResponseFor<TosAgreementWrapped>> =
            agree(BrandedCallingAgreeParams.none())

        /** @see agree */
        fun agree(
            params: BrandedCallingAgreeParams = BrandedCallingAgreeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TosAgreementWrapped>>

        /** @see agree */
        fun agree(
            params: BrandedCallingAgreeParams = BrandedCallingAgreeParams.none()
        ): CompletableFuture<HttpResponseFor<TosAgreementWrapped>> =
            agree(params, RequestOptions.none())

        /** @see agree */
        fun agree(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TosAgreementWrapped>> =
            agree(BrandedCallingAgreeParams.none(), requestOptions)
    }
}
