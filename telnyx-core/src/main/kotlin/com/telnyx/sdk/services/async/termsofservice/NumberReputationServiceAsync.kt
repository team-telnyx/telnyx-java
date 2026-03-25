// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.termsofservice

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.models.termsofservice.numberreputation.NumberReputationAgreeParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Terms of Service agreement endpoints */
interface NumberReputationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumberReputationServiceAsync

    /**
     * Accept the Terms of Service for the Number Reputation product. Must be called before using
     * Number Reputation endpoints.
     *
     * Returns `400` with error code `10015` if the user has already agreed to the current ToS
     * version.
     */
    fun agree(): CompletableFuture<Void?> = agree(NumberReputationAgreeParams.none())

    /** @see agree */
    fun agree(
        params: NumberReputationAgreeParams = NumberReputationAgreeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see agree */
    fun agree(
        params: NumberReputationAgreeParams = NumberReputationAgreeParams.none()
    ): CompletableFuture<Void?> = agree(params, RequestOptions.none())

    /** @see agree */
    fun agree(requestOptions: RequestOptions): CompletableFuture<Void?> =
        agree(NumberReputationAgreeParams.none(), requestOptions)

    /**
     * A view of [NumberReputationServiceAsync] that provides access to raw HTTP responses for each
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
        ): NumberReputationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /terms-of-service/number-reputation/agree`, but is
         * otherwise the same as [NumberReputationServiceAsync.agree].
         */
        fun agree(): CompletableFuture<HttpResponse> = agree(NumberReputationAgreeParams.none())

        /** @see agree */
        fun agree(
            params: NumberReputationAgreeParams = NumberReputationAgreeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see agree */
        fun agree(
            params: NumberReputationAgreeParams = NumberReputationAgreeParams.none()
        ): CompletableFuture<HttpResponse> = agree(params, RequestOptions.none())

        /** @see agree */
        fun agree(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            agree(NumberReputationAgreeParams.none(), requestOptions)
    }
}
