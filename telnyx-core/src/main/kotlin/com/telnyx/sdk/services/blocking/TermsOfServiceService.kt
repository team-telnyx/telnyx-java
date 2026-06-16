// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.termsofservice.TermsOfServiceInfoParams
import com.telnyx.sdk.models.termsofservice.TermsOfServiceInfoResponse
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
     * Returns the available Terms of Service agreements (product, current version, terms URL,
     * effective date). Omit `product_type` to return all products; pass it to scope to one.
     */
    fun info(): TermsOfServiceInfoResponse = info(TermsOfServiceInfoParams.none())

    /** @see info */
    fun info(
        params: TermsOfServiceInfoParams = TermsOfServiceInfoParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TermsOfServiceInfoResponse

    /** @see info */
    fun info(
        params: TermsOfServiceInfoParams = TermsOfServiceInfoParams.none()
    ): TermsOfServiceInfoResponse = info(params, RequestOptions.none())

    /** @see info */
    fun info(requestOptions: RequestOptions): TermsOfServiceInfoResponse =
        info(TermsOfServiceInfoParams.none(), requestOptions)

    /**
     * Returns whether the authenticated user has agreed to the current Terms of Service for the
     * product given by `product_type`. Used during onboarding to decide whether to prompt the user
     * with the ToS dialog before continuing.
     *
     * `agreement_required: true` means the user has not yet agreed (or has agreed to an outdated
     * version) and must agree before using that product's endpoints.
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
         * Returns a raw HTTP response for `get /terms_of_service/info`, but is otherwise the same
         * as [TermsOfServiceService.info].
         */
        @MustBeClosed
        fun info(): HttpResponseFor<TermsOfServiceInfoResponse> =
            info(TermsOfServiceInfoParams.none())

        /** @see info */
        @MustBeClosed
        fun info(
            params: TermsOfServiceInfoParams = TermsOfServiceInfoParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TermsOfServiceInfoResponse>

        /** @see info */
        @MustBeClosed
        fun info(
            params: TermsOfServiceInfoParams = TermsOfServiceInfoParams.none()
        ): HttpResponseFor<TermsOfServiceInfoResponse> = info(params, RequestOptions.none())

        /** @see info */
        @MustBeClosed
        fun info(requestOptions: RequestOptions): HttpResponseFor<TermsOfServiceInfoResponse> =
            info(TermsOfServiceInfoParams.none(), requestOptions)

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
