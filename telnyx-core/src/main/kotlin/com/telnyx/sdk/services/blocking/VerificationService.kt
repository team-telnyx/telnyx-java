// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.verifications.CreateVerificationResponse
import com.telnyx.sdk.models.verifications.VerificationRetrieveParams
import com.telnyx.sdk.models.verifications.VerificationRetrieveResponse
import com.telnyx.sdk.models.verifications.VerificationTriggerCallParams
import com.telnyx.sdk.models.verifications.VerificationTriggerFlashcallParams
import com.telnyx.sdk.models.verifications.VerificationTriggerSmsParams
import com.telnyx.sdk.services.blocking.verifications.ActionService
import com.telnyx.sdk.services.blocking.verifications.ByPhoneNumberService
import java.util.function.Consumer

/** Two factor authentication API */
interface VerificationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VerificationService

    /** Two factor authentication API */
    fun byPhoneNumber(): ByPhoneNumberService

    /** Two factor authentication API */
    fun actions(): ActionService

    /** Retrieve verification */
    fun retrieve(verificationId: String): VerificationRetrieveResponse =
        retrieve(verificationId, VerificationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        verificationId: String,
        params: VerificationRetrieveParams = VerificationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationRetrieveResponse =
        retrieve(params.toBuilder().verificationId(verificationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        verificationId: String,
        params: VerificationRetrieveParams = VerificationRetrieveParams.none(),
    ): VerificationRetrieveResponse = retrieve(verificationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VerificationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: VerificationRetrieveParams): VerificationRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        verificationId: String,
        requestOptions: RequestOptions,
    ): VerificationRetrieveResponse =
        retrieve(verificationId, VerificationRetrieveParams.none(), requestOptions)

    /** Trigger Call verification */
    fun triggerCall(params: VerificationTriggerCallParams): CreateVerificationResponse =
        triggerCall(params, RequestOptions.none())

    /** @see triggerCall */
    fun triggerCall(
        params: VerificationTriggerCallParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreateVerificationResponse

    /** Trigger Flash call verification */
    fun triggerFlashcall(params: VerificationTriggerFlashcallParams): CreateVerificationResponse =
        triggerFlashcall(params, RequestOptions.none())

    /** @see triggerFlashcall */
    fun triggerFlashcall(
        params: VerificationTriggerFlashcallParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreateVerificationResponse

    /** Trigger SMS verification */
    fun triggerSms(params: VerificationTriggerSmsParams): CreateVerificationResponse =
        triggerSms(params, RequestOptions.none())

    /** @see triggerSms */
    fun triggerSms(
        params: VerificationTriggerSmsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreateVerificationResponse

    /**
     * A view of [VerificationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VerificationService.WithRawResponse

        /** Two factor authentication API */
        fun byPhoneNumber(): ByPhoneNumberService.WithRawResponse

        /** Two factor authentication API */
        fun actions(): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /verifications/{verification_id}`, but is otherwise
         * the same as [VerificationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(verificationId: String): HttpResponseFor<VerificationRetrieveResponse> =
            retrieve(verificationId, VerificationRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            verificationId: String,
            params: VerificationRetrieveParams = VerificationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationRetrieveResponse> =
            retrieve(params.toBuilder().verificationId(verificationId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            verificationId: String,
            params: VerificationRetrieveParams = VerificationRetrieveParams.none(),
        ): HttpResponseFor<VerificationRetrieveResponse> =
            retrieve(verificationId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: VerificationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: VerificationRetrieveParams
        ): HttpResponseFor<VerificationRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            verificationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerificationRetrieveResponse> =
            retrieve(verificationId, VerificationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /verifications/call`, but is otherwise the same as
         * [VerificationService.triggerCall].
         */
        @MustBeClosed
        fun triggerCall(
            params: VerificationTriggerCallParams
        ): HttpResponseFor<CreateVerificationResponse> = triggerCall(params, RequestOptions.none())

        /** @see triggerCall */
        @MustBeClosed
        fun triggerCall(
            params: VerificationTriggerCallParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreateVerificationResponse>

        /**
         * Returns a raw HTTP response for `post /verifications/flashcall`, but is otherwise the
         * same as [VerificationService.triggerFlashcall].
         */
        @MustBeClosed
        fun triggerFlashcall(
            params: VerificationTriggerFlashcallParams
        ): HttpResponseFor<CreateVerificationResponse> =
            triggerFlashcall(params, RequestOptions.none())

        /** @see triggerFlashcall */
        @MustBeClosed
        fun triggerFlashcall(
            params: VerificationTriggerFlashcallParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreateVerificationResponse>

        /**
         * Returns a raw HTTP response for `post /verifications/sms`, but is otherwise the same as
         * [VerificationService.triggerSms].
         */
        @MustBeClosed
        fun triggerSms(
            params: VerificationTriggerSmsParams
        ): HttpResponseFor<CreateVerificationResponse> = triggerSms(params, RequestOptions.none())

        /** @see triggerSms */
        @MustBeClosed
        fun triggerSms(
            params: VerificationTriggerSmsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreateVerificationResponse>
    }
}
