// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.termsofservice.TermsOfServiceRetrieveInfoParams
import com.telnyx.sdk.models.termsofservice.TermsOfServiceRetrieveInfoResponse
import com.telnyx.sdk.models.termsofservice.TermsOfServiceStatusParams
import com.telnyx.sdk.models.termsofservice.TermsOfServiceStatusResponse
import com.telnyx.sdk.services.async.termsofservice.AgreementServiceAsync
import com.telnyx.sdk.services.async.termsofservice.BrandedCallingServiceAsync
import com.telnyx.sdk.services.async.termsofservice.NumberReputationServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
interface TermsOfServiceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TermsOfServiceServiceAsync

    /** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
    fun numberReputation(): NumberReputationServiceAsync

    /** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
    fun agreements(): AgreementServiceAsync

    /** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
    fun brandedCalling(): BrandedCallingServiceAsync

    /**
     * Returns the available Terms of Service agreements (product, current version, terms URL,
     * effective date). Omit `product_type` to return all products; pass it to scope to one.
     */
    fun retrieveInfo(): CompletableFuture<TermsOfServiceRetrieveInfoResponse> =
        retrieveInfo(TermsOfServiceRetrieveInfoParams.none())

    /** @see retrieveInfo */
    fun retrieveInfo(
        params: TermsOfServiceRetrieveInfoParams = TermsOfServiceRetrieveInfoParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TermsOfServiceRetrieveInfoResponse>

    /** @see retrieveInfo */
    fun retrieveInfo(
        params: TermsOfServiceRetrieveInfoParams = TermsOfServiceRetrieveInfoParams.none()
    ): CompletableFuture<TermsOfServiceRetrieveInfoResponse> =
        retrieveInfo(params, RequestOptions.none())

    /** @see retrieveInfo */
    fun retrieveInfo(
        requestOptions: RequestOptions
    ): CompletableFuture<TermsOfServiceRetrieveInfoResponse> =
        retrieveInfo(TermsOfServiceRetrieveInfoParams.none(), requestOptions)

    /**
     * Returns whether the authenticated user has agreed to the current Number Reputation Terms of
     * Service. Used during onboarding to decide whether to prompt the user with the ToS dialog
     * before continuing.
     *
     * The `agreement_required: true` value means the user has not yet agreed (or has agreed to an
     * outdated version) and must call `POST /terms_of_service/number_reputation/agree` before they
     * can use the Number Reputation endpoints on an enterprise.
     */
    fun status(): CompletableFuture<TermsOfServiceStatusResponse> =
        status(TermsOfServiceStatusParams.none())

    /** @see status */
    fun status(
        params: TermsOfServiceStatusParams = TermsOfServiceStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TermsOfServiceStatusResponse>

    /** @see status */
    fun status(
        params: TermsOfServiceStatusParams = TermsOfServiceStatusParams.none()
    ): CompletableFuture<TermsOfServiceStatusResponse> = status(params, RequestOptions.none())

    /** @see status */
    fun status(requestOptions: RequestOptions): CompletableFuture<TermsOfServiceStatusResponse> =
        status(TermsOfServiceStatusParams.none(), requestOptions)

    /**
     * A view of [TermsOfServiceServiceAsync] that provides access to raw HTTP responses for each
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
        ): TermsOfServiceServiceAsync.WithRawResponse

        /** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
        fun numberReputation(): NumberReputationServiceAsync.WithRawResponse

        /** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
        fun agreements(): AgreementServiceAsync.WithRawResponse

        /** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
        fun brandedCalling(): BrandedCallingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /terms_of_service/info`, but is otherwise the same
         * as [TermsOfServiceServiceAsync.retrieveInfo].
         */
        fun retrieveInfo(): CompletableFuture<HttpResponseFor<TermsOfServiceRetrieveInfoResponse>> =
            retrieveInfo(TermsOfServiceRetrieveInfoParams.none())

        /** @see retrieveInfo */
        fun retrieveInfo(
            params: TermsOfServiceRetrieveInfoParams = TermsOfServiceRetrieveInfoParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TermsOfServiceRetrieveInfoResponse>>

        /** @see retrieveInfo */
        fun retrieveInfo(
            params: TermsOfServiceRetrieveInfoParams = TermsOfServiceRetrieveInfoParams.none()
        ): CompletableFuture<HttpResponseFor<TermsOfServiceRetrieveInfoResponse>> =
            retrieveInfo(params, RequestOptions.none())

        /** @see retrieveInfo */
        fun retrieveInfo(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TermsOfServiceRetrieveInfoResponse>> =
            retrieveInfo(TermsOfServiceRetrieveInfoParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /terms_of_service/status`, but is otherwise the same
         * as [TermsOfServiceServiceAsync.status].
         */
        fun status(): CompletableFuture<HttpResponseFor<TermsOfServiceStatusResponse>> =
            status(TermsOfServiceStatusParams.none())

        /** @see status */
        fun status(
            params: TermsOfServiceStatusParams = TermsOfServiceStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TermsOfServiceStatusResponse>>

        /** @see status */
        fun status(
            params: TermsOfServiceStatusParams = TermsOfServiceStatusParams.none()
        ): CompletableFuture<HttpResponseFor<TermsOfServiceStatusResponse>> =
            status(params, RequestOptions.none())

        /** @see status */
        fun status(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TermsOfServiceStatusResponse>> =
            status(TermsOfServiceStatusParams.none(), requestOptions)
    }
}
