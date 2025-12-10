// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.number10dlc.brand

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.number10dlc.brand.smsotp.SmsOtpGetStatusParams
import com.telnyx.sdk.models.number10dlc.brand.smsotp.SmsOtpGetStatusResponse
import com.telnyx.sdk.models.number10dlc.brand.smsotp.SmsOtpTriggerParams
import com.telnyx.sdk.models.number10dlc.brand.smsotp.SmsOtpTriggerResponse
import com.telnyx.sdk.models.number10dlc.brand.smsotp.SmsOtpVerifyParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SmsOtpServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SmsOtpServiceAsync

    /**
     * Query the status of an SMS OTP (One-Time Password) for Sole Proprietor brand verification.
     *
     * This endpoint allows you to check the delivery and verification status of an OTP sent during
     * the Sole Proprietor brand verification process. You can query by either:
     * * `referenceId` - The reference ID returned when the OTP was initially triggered
     * * `brandId` - Query parameter for portal users to look up OTP status by Brand ID
     *
     * The response includes delivery status, verification dates, and detailed delivery information.
     */
    fun getStatus(referenceId: String): CompletableFuture<SmsOtpGetStatusResponse> =
        getStatus(referenceId, SmsOtpGetStatusParams.none())

    /** @see getStatus */
    fun getStatus(
        referenceId: String,
        params: SmsOtpGetStatusParams = SmsOtpGetStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SmsOtpGetStatusResponse> =
        getStatus(params.toBuilder().referenceId(referenceId).build(), requestOptions)

    /** @see getStatus */
    fun getStatus(
        referenceId: String,
        params: SmsOtpGetStatusParams = SmsOtpGetStatusParams.none(),
    ): CompletableFuture<SmsOtpGetStatusResponse> =
        getStatus(referenceId, params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        params: SmsOtpGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SmsOtpGetStatusResponse>

    /** @see getStatus */
    fun getStatus(params: SmsOtpGetStatusParams): CompletableFuture<SmsOtpGetStatusResponse> =
        getStatus(params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        referenceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SmsOtpGetStatusResponse> =
        getStatus(referenceId, SmsOtpGetStatusParams.none(), requestOptions)

    /**
     * Trigger or re-trigger an SMS OTP (One-Time Password) for Sole Proprietor brand verification.
     *
     * **Important Notes:**
     * * Only allowed for Sole Proprietor (`SOLE_PROPRIETOR`) brands
     * * Triggers generation of a one-time password sent to the `mobilePhone` number in the brand's
     *   profile
     * * Campaigns cannot be created until OTP verification is complete
     * * US/CA numbers only for real OTPs; mock brands can use non-US/CA numbers for testing
     * * Returns a `referenceId` that can be used to check OTP status via the GET
     *   `/10dlc/brand/smsOtp/{referenceId}` endpoint
     *
     * **Use Cases:**
     * * Initial OTP trigger after Sole Proprietor brand creation
     * * Re-triggering OTP if the user didn't receive or needs a new code
     */
    fun trigger(
        brandId: String,
        params: SmsOtpTriggerParams,
    ): CompletableFuture<SmsOtpTriggerResponse> = trigger(brandId, params, RequestOptions.none())

    /** @see trigger */
    fun trigger(
        brandId: String,
        params: SmsOtpTriggerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SmsOtpTriggerResponse> =
        trigger(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see trigger */
    fun trigger(params: SmsOtpTriggerParams): CompletableFuture<SmsOtpTriggerResponse> =
        trigger(params, RequestOptions.none())

    /** @see trigger */
    fun trigger(
        params: SmsOtpTriggerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SmsOtpTriggerResponse>

    /**
     * Verify the SMS OTP (One-Time Password) for Sole Proprietor brand verification.
     *
     * **Verification Flow:**
     * 1. User receives OTP via SMS after triggering
     * 2. User submits the OTP pin through this endpoint
     * 3. Upon successful verification:
     *     - A `BRAND_OTP_VERIFIED` webhook event is sent to the CSP
     *     - The brand's `identityStatus` changes to `VERIFIED`
     *     - Campaigns can now be created for this brand
     *
     * **Error Handling:**
     *
     * Provides proper error responses for:
     * * Invalid OTP pins
     * * Expired OTPs
     * * OTP verification failures
     */
    fun verify(brandId: String, params: SmsOtpVerifyParams): CompletableFuture<Void?> =
        verify(brandId, params, RequestOptions.none())

    /** @see verify */
    fun verify(
        brandId: String,
        params: SmsOtpVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        verify(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see verify */
    fun verify(params: SmsOtpVerifyParams): CompletableFuture<Void?> =
        verify(params, RequestOptions.none())

    /** @see verify */
    fun verify(
        params: SmsOtpVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [SmsOtpServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SmsOtpServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /10dlc/brand/smsOtp/{referenceId}`, but is otherwise
         * the same as [SmsOtpServiceAsync.getStatus].
         */
        fun getStatus(
            referenceId: String
        ): CompletableFuture<HttpResponseFor<SmsOtpGetStatusResponse>> =
            getStatus(referenceId, SmsOtpGetStatusParams.none())

        /** @see getStatus */
        fun getStatus(
            referenceId: String,
            params: SmsOtpGetStatusParams = SmsOtpGetStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SmsOtpGetStatusResponse>> =
            getStatus(params.toBuilder().referenceId(referenceId).build(), requestOptions)

        /** @see getStatus */
        fun getStatus(
            referenceId: String,
            params: SmsOtpGetStatusParams = SmsOtpGetStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<SmsOtpGetStatusResponse>> =
            getStatus(referenceId, params, RequestOptions.none())

        /** @see getStatus */
        fun getStatus(
            params: SmsOtpGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SmsOtpGetStatusResponse>>

        /** @see getStatus */
        fun getStatus(
            params: SmsOtpGetStatusParams
        ): CompletableFuture<HttpResponseFor<SmsOtpGetStatusResponse>> =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        fun getStatus(
            referenceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SmsOtpGetStatusResponse>> =
            getStatus(referenceId, SmsOtpGetStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /10dlc/brand/{brandId}/smsOtp`, but is otherwise
         * the same as [SmsOtpServiceAsync.trigger].
         */
        fun trigger(
            brandId: String,
            params: SmsOtpTriggerParams,
        ): CompletableFuture<HttpResponseFor<SmsOtpTriggerResponse>> =
            trigger(brandId, params, RequestOptions.none())

        /** @see trigger */
        fun trigger(
            brandId: String,
            params: SmsOtpTriggerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SmsOtpTriggerResponse>> =
            trigger(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see trigger */
        fun trigger(
            params: SmsOtpTriggerParams
        ): CompletableFuture<HttpResponseFor<SmsOtpTriggerResponse>> =
            trigger(params, RequestOptions.none())

        /** @see trigger */
        fun trigger(
            params: SmsOtpTriggerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SmsOtpTriggerResponse>>

        /**
         * Returns a raw HTTP response for `put /10dlc/brand/{brandId}/smsOtp`, but is otherwise the
         * same as [SmsOtpServiceAsync.verify].
         */
        fun verify(brandId: String, params: SmsOtpVerifyParams): CompletableFuture<HttpResponse> =
            verify(brandId, params, RequestOptions.none())

        /** @see verify */
        fun verify(
            brandId: String,
            params: SmsOtpVerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            verify(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see verify */
        fun verify(params: SmsOtpVerifyParams): CompletableFuture<HttpResponse> =
            verify(params, RequestOptions.none())

        /** @see verify */
        fun verify(
            params: SmsOtpVerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
