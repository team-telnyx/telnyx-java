// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.termsofservice.TermsOfServiceRetrieveInfoParams
import com.telnyx.sdk.models.termsofservice.TermsOfServiceRetrieveInfoResponse
import com.telnyx.sdk.models.termsofservice.TermsOfServiceRetrieveStatusParams
import com.telnyx.sdk.models.termsofservice.TermsOfServiceRetrieveStatusResponse
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
     * Returns whether the authenticated user has agreed to the current Terms of Service for the
     * product given by `product_type`. Used during onboarding to decide whether to prompt the user
     * with the ToS dialog before continuing.
     *
     * `agreement_required: true` means the user has not yet agreed (or has agreed to an outdated
     * version) and must agree before using that product's endpoints.
     */
    fun retrieveStatus(): CompletableFuture<TermsOfServiceRetrieveStatusResponse> =
        retrieveStatus(TermsOfServiceRetrieveStatusParams.none())

    /** @see retrieveStatus */
    fun retrieveStatus(
        params: TermsOfServiceRetrieveStatusParams = TermsOfServiceRetrieveStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TermsOfServiceRetrieveStatusResponse>

    /** @see retrieveStatus */
    fun retrieveStatus(
        params: TermsOfServiceRetrieveStatusParams = TermsOfServiceRetrieveStatusParams.none()
    ): CompletableFuture<TermsOfServiceRetrieveStatusResponse> =
        retrieveStatus(params, RequestOptions.none())

    /** @see retrieveStatus */
    fun retrieveStatus(
        requestOptions: RequestOptions
    ): CompletableFuture<TermsOfServiceRetrieveStatusResponse> =
        retrieveStatus(TermsOfServiceRetrieveStatusParams.none(), requestOptions)

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
         * as [TermsOfServiceServiceAsync.retrieveStatus].
         */
        fun retrieveStatus():
            CompletableFuture<HttpResponseFor<TermsOfServiceRetrieveStatusResponse>> =
            retrieveStatus(TermsOfServiceRetrieveStatusParams.none())

        /** @see retrieveStatus */
        fun retrieveStatus(
            params: TermsOfServiceRetrieveStatusParams = TermsOfServiceRetrieveStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TermsOfServiceRetrieveStatusResponse>>

        /** @see retrieveStatus */
        fun retrieveStatus(
            params: TermsOfServiceRetrieveStatusParams = TermsOfServiceRetrieveStatusParams.none()
        ): CompletableFuture<HttpResponseFor<TermsOfServiceRetrieveStatusResponse>> =
            retrieveStatus(params, RequestOptions.none())

        /** @see retrieveStatus */
        fun retrieveStatus(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TermsOfServiceRetrieveStatusResponse>> =
            retrieveStatus(TermsOfServiceRetrieveStatusParams.none(), requestOptions)
    }
}
