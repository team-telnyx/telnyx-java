// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.verifiednumbers

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.verifiednumbers.VerifiedNumberDataWrapper
import com.telnyx.api.models.verifiednumbers.actions.ActionSubmitVerificationCodeParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ActionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionServiceAsync

    /** Submit verification code */
    fun submitVerificationCode(
        phoneNumber: String,
        params: ActionSubmitVerificationCodeParams,
    ): CompletableFuture<VerifiedNumberDataWrapper> =
        submitVerificationCode(phoneNumber, params, RequestOptions.none())

    /** @see submitVerificationCode */
    fun submitVerificationCode(
        phoneNumber: String,
        params: ActionSubmitVerificationCodeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifiedNumberDataWrapper> =
        submitVerificationCode(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see submitVerificationCode */
    fun submitVerificationCode(
        params: ActionSubmitVerificationCodeParams
    ): CompletableFuture<VerifiedNumberDataWrapper> =
        submitVerificationCode(params, RequestOptions.none())

    /** @see submitVerificationCode */
    fun submitVerificationCode(
        params: ActionSubmitVerificationCodeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifiedNumberDataWrapper>

    /**
     * A view of [ActionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /verified_numbers/{phone_number}/actions/verify`,
         * but is otherwise the same as [ActionServiceAsync.submitVerificationCode].
         */
        fun submitVerificationCode(
            phoneNumber: String,
            params: ActionSubmitVerificationCodeParams,
        ): CompletableFuture<HttpResponseFor<VerifiedNumberDataWrapper>> =
            submitVerificationCode(phoneNumber, params, RequestOptions.none())

        /** @see submitVerificationCode */
        fun submitVerificationCode(
            phoneNumber: String,
            params: ActionSubmitVerificationCodeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifiedNumberDataWrapper>> =
            submitVerificationCode(
                params.toBuilder().phoneNumber(phoneNumber).build(),
                requestOptions,
            )

        /** @see submitVerificationCode */
        fun submitVerificationCode(
            params: ActionSubmitVerificationCodeParams
        ): CompletableFuture<HttpResponseFor<VerifiedNumberDataWrapper>> =
            submitVerificationCode(params, RequestOptions.none())

        /** @see submitVerificationCode */
        fun submitVerificationCode(
            params: ActionSubmitVerificationCodeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifiedNumberDataWrapper>>
    }
}
