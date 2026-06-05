// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.termsofservice.TermsOfServiceStatusParams
import com.telnyx.sdk.models.termsofservice.TermsOfServiceStatusResponse
import com.telnyx.sdk.services.blocking.termsofservice.AgreementService
import com.telnyx.sdk.services.blocking.termsofservice.BrandedCallingService
import com.telnyx.sdk.services.blocking.termsofservice.NumberReputationService
import java.util.function.Consumer

/** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
interface TermsOfServiceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TermsOfServiceService

    /** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
    fun numberReputation(): NumberReputationService

    /** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
    fun agreements(): AgreementService

    /** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
    fun brandedCalling(): BrandedCallingService

    /**
     * Returns whether the authenticated user has agreed to the current Number Reputation Terms of
     * Service. Used during onboarding to decide whether to prompt the user with the ToS dialog
     * before continuing.
     *
     * The `agreement_required: true` value means the user has not yet agreed (or has agreed to an
     * outdated version) and must call `POST /terms_of_service/number_reputation/agree` before they
     * can use the Number Reputation endpoints on an enterprise.
     */
    fun status(): TermsOfServiceStatusResponse = status(TermsOfServiceStatusParams.none())

    /** @see status */
    fun status(
        params: TermsOfServiceStatusParams = TermsOfServiceStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TermsOfServiceStatusResponse

    /** @see status */
    fun status(
        params: TermsOfServiceStatusParams = TermsOfServiceStatusParams.none()
    ): TermsOfServiceStatusResponse = status(params, RequestOptions.none())

    /** @see status */
    fun status(requestOptions: RequestOptions): TermsOfServiceStatusResponse =
        status(TermsOfServiceStatusParams.none(), requestOptions)

    /**
     * A view of [TermsOfServiceService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TermsOfServiceService.WithRawResponse

        /** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
        fun numberReputation(): NumberReputationService.WithRawResponse

        /** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
        fun agreements(): AgreementService.WithRawResponse

        /** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
        fun brandedCalling(): BrandedCallingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /terms_of_service/status`, but is otherwise the same
         * as [TermsOfServiceService.status].
         */
        @MustBeClosed
        fun status(): HttpResponseFor<TermsOfServiceStatusResponse> =
            status(TermsOfServiceStatusParams.none())

        /** @see status */
        @MustBeClosed
        fun status(
            params: TermsOfServiceStatusParams = TermsOfServiceStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TermsOfServiceStatusResponse>

        /** @see status */
        @MustBeClosed
        fun status(
            params: TermsOfServiceStatusParams = TermsOfServiceStatusParams.none()
        ): HttpResponseFor<TermsOfServiceStatusResponse> = status(params, RequestOptions.none())

        /** @see status */
        @MustBeClosed
        fun status(requestOptions: RequestOptions): HttpResponseFor<TermsOfServiceStatusResponse> =
            status(TermsOfServiceStatusParams.none(), requestOptions)
    }
}
