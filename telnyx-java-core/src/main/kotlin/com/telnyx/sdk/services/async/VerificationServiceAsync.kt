// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.verifications.CreateVerificationResponse
import com.telnyx.sdk.models.verifications.VerificationRetrieveParams
import com.telnyx.sdk.models.verifications.VerificationRetrieveResponse
import com.telnyx.sdk.models.verifications.VerificationTriggerCallParams
import com.telnyx.sdk.models.verifications.VerificationTriggerFlashcallParams
import com.telnyx.sdk.models.verifications.VerificationTriggerSmsParams
import com.telnyx.sdk.services.async.verifications.ActionServiceAsync
import com.telnyx.sdk.services.async.verifications.ByPhoneNumberServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface VerificationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VerificationServiceAsync

    fun byPhoneNumber(): ByPhoneNumberServiceAsync

    fun actions(): ActionServiceAsync

    /** Retrieve verification */
    fun retrieve(verificationId: String): CompletableFuture<VerificationRetrieveResponse> =
        retrieve(verificationId, VerificationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        verificationId: String,
        params: VerificationRetrieveParams = VerificationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerificationRetrieveResponse> =
        retrieve(params.toBuilder().verificationId(verificationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        verificationId: String,
        params: VerificationRetrieveParams = VerificationRetrieveParams.none(),
    ): CompletableFuture<VerificationRetrieveResponse> =
        retrieve(verificationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VerificationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerificationRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: VerificationRetrieveParams
    ): CompletableFuture<VerificationRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        verificationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerificationRetrieveResponse> =
        retrieve(verificationId, VerificationRetrieveParams.none(), requestOptions)

    /** Trigger Call verification */
    fun triggerCall(
        params: VerificationTriggerCallParams
    ): CompletableFuture<CreateVerificationResponse> = triggerCall(params, RequestOptions.none())

    /** @see triggerCall */
    fun triggerCall(
        params: VerificationTriggerCallParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreateVerificationResponse>

    /** Trigger Flash call verification */
    fun triggerFlashcall(
        params: VerificationTriggerFlashcallParams
    ): CompletableFuture<CreateVerificationResponse> =
        triggerFlashcall(params, RequestOptions.none())

    /** @see triggerFlashcall */
    fun triggerFlashcall(
        params: VerificationTriggerFlashcallParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreateVerificationResponse>

    /** Trigger SMS verification */
    fun triggerSms(
        params: VerificationTriggerSmsParams
    ): CompletableFuture<CreateVerificationResponse> = triggerSms(params, RequestOptions.none())

    /** @see triggerSms */
    fun triggerSms(
        params: VerificationTriggerSmsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreateVerificationResponse>

    /**
     * A view of [VerificationServiceAsync] that provides access to raw HTTP responses for each
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
        ): VerificationServiceAsync.WithRawResponse

        fun byPhoneNumber(): ByPhoneNumberServiceAsync.WithRawResponse

        fun actions(): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /verifications/{verification_id}`, but is otherwise
         * the same as [VerificationServiceAsync.retrieve].
         */
        fun retrieve(
            verificationId: String
        ): CompletableFuture<HttpResponseFor<VerificationRetrieveResponse>> =
            retrieve(verificationId, VerificationRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            verificationId: String,
            params: VerificationRetrieveParams = VerificationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerificationRetrieveResponse>> =
            retrieve(params.toBuilder().verificationId(verificationId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            verificationId: String,
            params: VerificationRetrieveParams = VerificationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<VerificationRetrieveResponse>> =
            retrieve(verificationId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: VerificationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerificationRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: VerificationRetrieveParams
        ): CompletableFuture<HttpResponseFor<VerificationRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            verificationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerificationRetrieveResponse>> =
            retrieve(verificationId, VerificationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /verifications/call`, but is otherwise the same as
         * [VerificationServiceAsync.triggerCall].
         */
        fun triggerCall(
            params: VerificationTriggerCallParams
        ): CompletableFuture<HttpResponseFor<CreateVerificationResponse>> =
            triggerCall(params, RequestOptions.none())

        /** @see triggerCall */
        fun triggerCall(
            params: VerificationTriggerCallParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreateVerificationResponse>>

        /**
         * Returns a raw HTTP response for `post /verifications/flashcall`, but is otherwise the
         * same as [VerificationServiceAsync.triggerFlashcall].
         */
        fun triggerFlashcall(
            params: VerificationTriggerFlashcallParams
        ): CompletableFuture<HttpResponseFor<CreateVerificationResponse>> =
            triggerFlashcall(params, RequestOptions.none())

        /** @see triggerFlashcall */
        fun triggerFlashcall(
            params: VerificationTriggerFlashcallParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreateVerificationResponse>>

        /**
         * Returns a raw HTTP response for `post /verifications/sms`, but is otherwise the same as
         * [VerificationServiceAsync.triggerSms].
         */
        fun triggerSms(
            params: VerificationTriggerSmsParams
        ): CompletableFuture<HttpResponseFor<CreateVerificationResponse>> =
            triggerSms(params, RequestOptions.none())

        /** @see triggerSms */
        fun triggerSms(
            params: VerificationTriggerSmsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreateVerificationResponse>>
    }
}
