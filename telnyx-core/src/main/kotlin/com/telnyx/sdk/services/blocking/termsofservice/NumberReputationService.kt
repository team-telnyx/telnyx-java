// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.termsofservice

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.models.termsofservice.numberreputation.NumberReputationAgreeParams
import java.util.function.Consumer

/** Terms of Service agreement endpoints */
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
     * Accept the Terms of Service for the Number Reputation product. Must be called before using
     * Number Reputation endpoints.
     *
     * Returns `400` with error code `10015` if the user has already agreed to the current ToS
     * version.
     */
    fun agree() = agree(NumberReputationAgreeParams.none())

    /** @see agree */
    fun agree(
        params: NumberReputationAgreeParams = NumberReputationAgreeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see agree */
    fun agree(params: NumberReputationAgreeParams = NumberReputationAgreeParams.none()) =
        agree(params, RequestOptions.none())

    /** @see agree */
    fun agree(requestOptions: RequestOptions) =
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
         * Returns a raw HTTP response for `post /terms-of-service/number-reputation/agree`, but is
         * otherwise the same as [NumberReputationService.agree].
         */
        @MustBeClosed fun agree(): HttpResponse = agree(NumberReputationAgreeParams.none())

        /** @see agree */
        @MustBeClosed
        fun agree(
            params: NumberReputationAgreeParams = NumberReputationAgreeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see agree */
        @MustBeClosed
        fun agree(
            params: NumberReputationAgreeParams = NumberReputationAgreeParams.none()
        ): HttpResponse = agree(params, RequestOptions.none())

        /** @see agree */
        @MustBeClosed
        fun agree(requestOptions: RequestOptions): HttpResponse =
            agree(NumberReputationAgreeParams.none(), requestOptions)
    }
}
