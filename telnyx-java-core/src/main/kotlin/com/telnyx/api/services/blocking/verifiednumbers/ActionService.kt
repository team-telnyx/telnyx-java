// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.verifiednumbers

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.verifiednumbers.VerifiedNumberDataWrapper
import com.telnyx.api.models.verifiednumbers.actions.ActionSubmitVerificationCodeParams
import java.util.function.Consumer

interface ActionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService

    /** Submit verification code */
    fun submitVerificationCode(
        phoneNumber: String,
        params: ActionSubmitVerificationCodeParams,
    ): VerifiedNumberDataWrapper =
        submitVerificationCode(phoneNumber, params, RequestOptions.none())

    /** @see submitVerificationCode */
    fun submitVerificationCode(
        phoneNumber: String,
        params: ActionSubmitVerificationCodeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifiedNumberDataWrapper =
        submitVerificationCode(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see submitVerificationCode */
    fun submitVerificationCode(
        params: ActionSubmitVerificationCodeParams
    ): VerifiedNumberDataWrapper = submitVerificationCode(params, RequestOptions.none())

    /** @see submitVerificationCode */
    fun submitVerificationCode(
        params: ActionSubmitVerificationCodeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifiedNumberDataWrapper

    /** A view of [ActionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /verified_numbers/{phone_number}/actions/verify`,
         * but is otherwise the same as [ActionService.submitVerificationCode].
         */
        @MustBeClosed
        fun submitVerificationCode(
            phoneNumber: String,
            params: ActionSubmitVerificationCodeParams,
        ): HttpResponseFor<VerifiedNumberDataWrapper> =
            submitVerificationCode(phoneNumber, params, RequestOptions.none())

        /** @see submitVerificationCode */
        @MustBeClosed
        fun submitVerificationCode(
            phoneNumber: String,
            params: ActionSubmitVerificationCodeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifiedNumberDataWrapper> =
            submitVerificationCode(
                params.toBuilder().phoneNumber(phoneNumber).build(),
                requestOptions,
            )

        /** @see submitVerificationCode */
        @MustBeClosed
        fun submitVerificationCode(
            params: ActionSubmitVerificationCodeParams
        ): HttpResponseFor<VerifiedNumberDataWrapper> =
            submitVerificationCode(params, RequestOptions.none())

        /** @see submitVerificationCode */
        @MustBeClosed
        fun submitVerificationCode(
            params: ActionSubmitVerificationCodeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifiedNumberDataWrapper>
    }
}
