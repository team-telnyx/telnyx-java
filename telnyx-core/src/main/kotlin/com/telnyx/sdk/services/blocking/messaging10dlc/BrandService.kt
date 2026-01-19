// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messaging10dlc

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messaging10dlc.brand.BrandCreateParams
import com.telnyx.sdk.models.messaging10dlc.brand.BrandDeleteParams
import com.telnyx.sdk.models.messaging10dlc.brand.BrandGetFeedbackParams
import com.telnyx.sdk.models.messaging10dlc.brand.BrandGetFeedbackResponse
import com.telnyx.sdk.models.messaging10dlc.brand.BrandListPage
import com.telnyx.sdk.models.messaging10dlc.brand.BrandListParams
import com.telnyx.sdk.models.messaging10dlc.brand.BrandResend2faEmailParams
import com.telnyx.sdk.models.messaging10dlc.brand.BrandRetrieveParams
import com.telnyx.sdk.models.messaging10dlc.brand.BrandRetrieveResponse
import com.telnyx.sdk.models.messaging10dlc.brand.BrandRetrieveSmsOtpStatusParams
import com.telnyx.sdk.models.messaging10dlc.brand.BrandRetrieveSmsOtpStatusResponse
import com.telnyx.sdk.models.messaging10dlc.brand.BrandRevetParams
import com.telnyx.sdk.models.messaging10dlc.brand.BrandTriggerSmsOtpParams
import com.telnyx.sdk.models.messaging10dlc.brand.BrandTriggerSmsOtpResponse
import com.telnyx.sdk.models.messaging10dlc.brand.BrandUpdateParams
import com.telnyx.sdk.models.messaging10dlc.brand.BrandVerifySmsOtpParams
import com.telnyx.sdk.models.messaging10dlc.brand.TelnyxBrand
import com.telnyx.sdk.services.blocking.messaging10dlc.brand.ExternalVettingService
import java.util.function.Consumer

interface BrandService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandService

    fun externalVetting(): ExternalVettingService

    /**
     * This endpoint is used to create a new brand. A brand is an entity created by The Campaign
     * Registry (TCR) that represents an organization or a company. It is this entity that TCR
     * created campaigns will be associated with. Each brand creation will entail an upfront,
     * non-refundable $4 expense.
     */
    fun create(params: BrandCreateParams): TelnyxBrand = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BrandCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelnyxBrand

    /** Retrieve a brand by `brandId`. */
    fun retrieve(brandId: String): BrandRetrieveResponse =
        retrieve(brandId, BrandRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        brandId: String,
        params: BrandRetrieveParams = BrandRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandRetrieveResponse = retrieve(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        brandId: String,
        params: BrandRetrieveParams = BrandRetrieveParams.none(),
    ): BrandRetrieveResponse = retrieve(brandId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BrandRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: BrandRetrieveParams): BrandRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(brandId: String, requestOptions: RequestOptions): BrandRetrieveResponse =
        retrieve(brandId, BrandRetrieveParams.none(), requestOptions)

    /** Update a brand's attributes by `brandId`. */
    fun update(brandId: String, params: BrandUpdateParams): TelnyxBrand =
        update(brandId, params, RequestOptions.none())

    /** @see update */
    fun update(
        brandId: String,
        params: BrandUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelnyxBrand = update(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see update */
    fun update(params: BrandUpdateParams): TelnyxBrand = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BrandUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelnyxBrand

    /** This endpoint is used to list all brands associated with your organization. */
    fun list(): BrandListPage = list(BrandListParams.none())

    /** @see list */
    fun list(
        params: BrandListParams = BrandListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandListPage

    /** @see list */
    fun list(params: BrandListParams = BrandListParams.none()): BrandListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): BrandListPage =
        list(BrandListParams.none(), requestOptions)

    /**
     * Delete Brand. This endpoint is used to delete a brand. Note the brand cannot be deleted if it
     * contains one or more active campaigns, the campaigns need to be inactive and at least 3
     * months old due to billing purposes.
     */
    fun delete(brandId: String) = delete(brandId, BrandDeleteParams.none())

    /** @see delete */
    fun delete(
        brandId: String,
        params: BrandDeleteParams = BrandDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see delete */
    fun delete(brandId: String, params: BrandDeleteParams = BrandDeleteParams.none()) =
        delete(brandId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: BrandDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: BrandDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(brandId: String, requestOptions: RequestOptions) =
        delete(brandId, BrandDeleteParams.none(), requestOptions)

    /**
     * Get feedback about a brand by ID. This endpoint can be used after creating or revetting a
     * brand.
     *
     * Possible values for `.category[].id`:
     * * `TAX_ID` - Data mismatch related to tax id and its associated properties.
     * * `STOCK_SYMBOL` - Non public entity registered as a public for profit entity or the stock
     *   information mismatch.
     * * `GOVERNMENT_ENTITY` - Non government entity registered as a government entity. Must be a
     *   U.S. government entity.
     * * `NONPROFIT` - Not a recognized non-profit entity. No IRS tax-exempt status found.
     * * `OTHERS` - Details of the data misrepresentation if any.
     */
    fun getFeedback(brandId: String): BrandGetFeedbackResponse =
        getFeedback(brandId, BrandGetFeedbackParams.none())

    /** @see getFeedback */
    fun getFeedback(
        brandId: String,
        params: BrandGetFeedbackParams = BrandGetFeedbackParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandGetFeedbackResponse =
        getFeedback(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see getFeedback */
    fun getFeedback(
        brandId: String,
        params: BrandGetFeedbackParams = BrandGetFeedbackParams.none(),
    ): BrandGetFeedbackResponse = getFeedback(brandId, params, RequestOptions.none())

    /** @see getFeedback */
    fun getFeedback(
        params: BrandGetFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandGetFeedbackResponse

    /** @see getFeedback */
    fun getFeedback(params: BrandGetFeedbackParams): BrandGetFeedbackResponse =
        getFeedback(params, RequestOptions.none())

    /** @see getFeedback */
    fun getFeedback(brandId: String, requestOptions: RequestOptions): BrandGetFeedbackResponse =
        getFeedback(brandId, BrandGetFeedbackParams.none(), requestOptions)

    /** Resend brand 2FA email */
    fun resend2faEmail(brandId: String) = resend2faEmail(brandId, BrandResend2faEmailParams.none())

    /** @see resend2faEmail */
    fun resend2faEmail(
        brandId: String,
        params: BrandResend2faEmailParams = BrandResend2faEmailParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = resend2faEmail(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see resend2faEmail */
    fun resend2faEmail(
        brandId: String,
        params: BrandResend2faEmailParams = BrandResend2faEmailParams.none(),
    ) = resend2faEmail(brandId, params, RequestOptions.none())

    /** @see resend2faEmail */
    fun resend2faEmail(
        params: BrandResend2faEmailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see resend2faEmail */
    fun resend2faEmail(params: BrandResend2faEmailParams) =
        resend2faEmail(params, RequestOptions.none())

    /** @see resend2faEmail */
    fun resend2faEmail(brandId: String, requestOptions: RequestOptions) =
        resend2faEmail(brandId, BrandResend2faEmailParams.none(), requestOptions)

    /**
     * Query the status of an SMS OTP (One-Time Password) for Sole Proprietor brand verification
     * using the Brand ID.
     *
     * This endpoint allows you to check the delivery and verification status of an OTP sent during
     * the Sole Proprietor brand verification process by looking it up with the brand ID.
     *
     * The response includes delivery status, verification dates, and detailed delivery information.
     *
     * **Note:** This is an alternative to the `/10dlc/brand/smsOtp/{referenceId}` endpoint when you
     * have the Brand ID but not the reference ID.
     */
    fun retrieveSmsOtpStatus(brandId: String): BrandRetrieveSmsOtpStatusResponse =
        retrieveSmsOtpStatus(brandId, BrandRetrieveSmsOtpStatusParams.none())

    /** @see retrieveSmsOtpStatus */
    fun retrieveSmsOtpStatus(
        brandId: String,
        params: BrandRetrieveSmsOtpStatusParams = BrandRetrieveSmsOtpStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandRetrieveSmsOtpStatusResponse =
        retrieveSmsOtpStatus(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see retrieveSmsOtpStatus */
    fun retrieveSmsOtpStatus(
        brandId: String,
        params: BrandRetrieveSmsOtpStatusParams = BrandRetrieveSmsOtpStatusParams.none(),
    ): BrandRetrieveSmsOtpStatusResponse =
        retrieveSmsOtpStatus(brandId, params, RequestOptions.none())

    /** @see retrieveSmsOtpStatus */
    fun retrieveSmsOtpStatus(
        params: BrandRetrieveSmsOtpStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandRetrieveSmsOtpStatusResponse

    /** @see retrieveSmsOtpStatus */
    fun retrieveSmsOtpStatus(
        params: BrandRetrieveSmsOtpStatusParams
    ): BrandRetrieveSmsOtpStatusResponse = retrieveSmsOtpStatus(params, RequestOptions.none())

    /** @see retrieveSmsOtpStatus */
    fun retrieveSmsOtpStatus(
        brandId: String,
        requestOptions: RequestOptions,
    ): BrandRetrieveSmsOtpStatusResponse =
        retrieveSmsOtpStatus(brandId, BrandRetrieveSmsOtpStatusParams.none(), requestOptions)

    /**
     * This operation allows you to revet the brand. However, revetting is allowed once after the
     * successful brand registration and thereafter limited to once every 3 months.
     */
    fun revet(brandId: String): TelnyxBrand = revet(brandId, BrandRevetParams.none())

    /** @see revet */
    fun revet(
        brandId: String,
        params: BrandRevetParams = BrandRevetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelnyxBrand = revet(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see revet */
    fun revet(brandId: String, params: BrandRevetParams = BrandRevetParams.none()): TelnyxBrand =
        revet(brandId, params, RequestOptions.none())

    /** @see revet */
    fun revet(
        params: BrandRevetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelnyxBrand

    /** @see revet */
    fun revet(params: BrandRevetParams): TelnyxBrand = revet(params, RequestOptions.none())

    /** @see revet */
    fun revet(brandId: String, requestOptions: RequestOptions): TelnyxBrand =
        revet(brandId, BrandRevetParams.none(), requestOptions)

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
    fun triggerSmsOtp(
        brandId: String,
        params: BrandTriggerSmsOtpParams,
    ): BrandTriggerSmsOtpResponse = triggerSmsOtp(brandId, params, RequestOptions.none())

    /** @see triggerSmsOtp */
    fun triggerSmsOtp(
        brandId: String,
        params: BrandTriggerSmsOtpParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandTriggerSmsOtpResponse =
        triggerSmsOtp(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see triggerSmsOtp */
    fun triggerSmsOtp(params: BrandTriggerSmsOtpParams): BrandTriggerSmsOtpResponse =
        triggerSmsOtp(params, RequestOptions.none())

    /** @see triggerSmsOtp */
    fun triggerSmsOtp(
        params: BrandTriggerSmsOtpParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandTriggerSmsOtpResponse

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
    fun verifySmsOtp(brandId: String, params: BrandVerifySmsOtpParams) =
        verifySmsOtp(brandId, params, RequestOptions.none())

    /** @see verifySmsOtp */
    fun verifySmsOtp(
        brandId: String,
        params: BrandVerifySmsOtpParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = verifySmsOtp(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see verifySmsOtp */
    fun verifySmsOtp(params: BrandVerifySmsOtpParams) = verifySmsOtp(params, RequestOptions.none())

    /** @see verifySmsOtp */
    fun verifySmsOtp(
        params: BrandVerifySmsOtpParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [BrandService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandService.WithRawResponse

        fun externalVetting(): ExternalVettingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /10dlc/brand`, but is otherwise the same as
         * [BrandService.create].
         */
        @MustBeClosed
        fun create(params: BrandCreateParams): HttpResponseFor<TelnyxBrand> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BrandCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelnyxBrand>

        /**
         * Returns a raw HTTP response for `get /10dlc/brand/{brandId}`, but is otherwise the same
         * as [BrandService.retrieve].
         */
        @MustBeClosed
        fun retrieve(brandId: String): HttpResponseFor<BrandRetrieveResponse> =
            retrieve(brandId, BrandRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            brandId: String,
            params: BrandRetrieveParams = BrandRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandRetrieveResponse> =
            retrieve(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            brandId: String,
            params: BrandRetrieveParams = BrandRetrieveParams.none(),
        ): HttpResponseFor<BrandRetrieveResponse> = retrieve(brandId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BrandRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: BrandRetrieveParams): HttpResponseFor<BrandRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            brandId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrandRetrieveResponse> =
            retrieve(brandId, BrandRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /10dlc/brand/{brandId}`, but is otherwise the same
         * as [BrandService.update].
         */
        @MustBeClosed
        fun update(brandId: String, params: BrandUpdateParams): HttpResponseFor<TelnyxBrand> =
            update(brandId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            brandId: String,
            params: BrandUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelnyxBrand> =
            update(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: BrandUpdateParams): HttpResponseFor<TelnyxBrand> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: BrandUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelnyxBrand>

        /**
         * Returns a raw HTTP response for `get /10dlc/brand`, but is otherwise the same as
         * [BrandService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<BrandListPage> = list(BrandListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BrandListParams = BrandListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: BrandListParams = BrandListParams.none()): HttpResponseFor<BrandListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BrandListPage> =
            list(BrandListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /10dlc/brand/{brandId}`, but is otherwise the
         * same as [BrandService.delete].
         */
        @MustBeClosed
        fun delete(brandId: String): HttpResponse = delete(brandId, BrandDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            brandId: String,
            params: BrandDeleteParams = BrandDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            brandId: String,
            params: BrandDeleteParams = BrandDeleteParams.none(),
        ): HttpResponse = delete(brandId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: BrandDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: BrandDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(brandId: String, requestOptions: RequestOptions): HttpResponse =
            delete(brandId, BrandDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /10dlc/brand/feedback/{brandId}`, but is otherwise
         * the same as [BrandService.getFeedback].
         */
        @MustBeClosed
        fun getFeedback(brandId: String): HttpResponseFor<BrandGetFeedbackResponse> =
            getFeedback(brandId, BrandGetFeedbackParams.none())

        /** @see getFeedback */
        @MustBeClosed
        fun getFeedback(
            brandId: String,
            params: BrandGetFeedbackParams = BrandGetFeedbackParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandGetFeedbackResponse> =
            getFeedback(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see getFeedback */
        @MustBeClosed
        fun getFeedback(
            brandId: String,
            params: BrandGetFeedbackParams = BrandGetFeedbackParams.none(),
        ): HttpResponseFor<BrandGetFeedbackResponse> =
            getFeedback(brandId, params, RequestOptions.none())

        /** @see getFeedback */
        @MustBeClosed
        fun getFeedback(
            params: BrandGetFeedbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandGetFeedbackResponse>

        /** @see getFeedback */
        @MustBeClosed
        fun getFeedback(params: BrandGetFeedbackParams): HttpResponseFor<BrandGetFeedbackResponse> =
            getFeedback(params, RequestOptions.none())

        /** @see getFeedback */
        @MustBeClosed
        fun getFeedback(
            brandId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrandGetFeedbackResponse> =
            getFeedback(brandId, BrandGetFeedbackParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /10dlc/brand/{brandId}/2faEmail`, but is otherwise
         * the same as [BrandService.resend2faEmail].
         */
        @MustBeClosed
        fun resend2faEmail(brandId: String): HttpResponse =
            resend2faEmail(brandId, BrandResend2faEmailParams.none())

        /** @see resend2faEmail */
        @MustBeClosed
        fun resend2faEmail(
            brandId: String,
            params: BrandResend2faEmailParams = BrandResend2faEmailParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            resend2faEmail(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see resend2faEmail */
        @MustBeClosed
        fun resend2faEmail(
            brandId: String,
            params: BrandResend2faEmailParams = BrandResend2faEmailParams.none(),
        ): HttpResponse = resend2faEmail(brandId, params, RequestOptions.none())

        /** @see resend2faEmail */
        @MustBeClosed
        fun resend2faEmail(
            params: BrandResend2faEmailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see resend2faEmail */
        @MustBeClosed
        fun resend2faEmail(params: BrandResend2faEmailParams): HttpResponse =
            resend2faEmail(params, RequestOptions.none())

        /** @see resend2faEmail */
        @MustBeClosed
        fun resend2faEmail(brandId: String, requestOptions: RequestOptions): HttpResponse =
            resend2faEmail(brandId, BrandResend2faEmailParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /10dlc/brand/{brandId}/smsOtp`, but is otherwise the
         * same as [BrandService.retrieveSmsOtpStatus].
         */
        @MustBeClosed
        fun retrieveSmsOtpStatus(
            brandId: String
        ): HttpResponseFor<BrandRetrieveSmsOtpStatusResponse> =
            retrieveSmsOtpStatus(brandId, BrandRetrieveSmsOtpStatusParams.none())

        /** @see retrieveSmsOtpStatus */
        @MustBeClosed
        fun retrieveSmsOtpStatus(
            brandId: String,
            params: BrandRetrieveSmsOtpStatusParams = BrandRetrieveSmsOtpStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandRetrieveSmsOtpStatusResponse> =
            retrieveSmsOtpStatus(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see retrieveSmsOtpStatus */
        @MustBeClosed
        fun retrieveSmsOtpStatus(
            brandId: String,
            params: BrandRetrieveSmsOtpStatusParams = BrandRetrieveSmsOtpStatusParams.none(),
        ): HttpResponseFor<BrandRetrieveSmsOtpStatusResponse> =
            retrieveSmsOtpStatus(brandId, params, RequestOptions.none())

        /** @see retrieveSmsOtpStatus */
        @MustBeClosed
        fun retrieveSmsOtpStatus(
            params: BrandRetrieveSmsOtpStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandRetrieveSmsOtpStatusResponse>

        /** @see retrieveSmsOtpStatus */
        @MustBeClosed
        fun retrieveSmsOtpStatus(
            params: BrandRetrieveSmsOtpStatusParams
        ): HttpResponseFor<BrandRetrieveSmsOtpStatusResponse> =
            retrieveSmsOtpStatus(params, RequestOptions.none())

        /** @see retrieveSmsOtpStatus */
        @MustBeClosed
        fun retrieveSmsOtpStatus(
            brandId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrandRetrieveSmsOtpStatusResponse> =
            retrieveSmsOtpStatus(brandId, BrandRetrieveSmsOtpStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /10dlc/brand/{brandId}/revet`, but is otherwise the
         * same as [BrandService.revet].
         */
        @MustBeClosed
        fun revet(brandId: String): HttpResponseFor<TelnyxBrand> =
            revet(brandId, BrandRevetParams.none())

        /** @see revet */
        @MustBeClosed
        fun revet(
            brandId: String,
            params: BrandRevetParams = BrandRevetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelnyxBrand> =
            revet(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see revet */
        @MustBeClosed
        fun revet(
            brandId: String,
            params: BrandRevetParams = BrandRevetParams.none(),
        ): HttpResponseFor<TelnyxBrand> = revet(brandId, params, RequestOptions.none())

        /** @see revet */
        @MustBeClosed
        fun revet(
            params: BrandRevetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelnyxBrand>

        /** @see revet */
        @MustBeClosed
        fun revet(params: BrandRevetParams): HttpResponseFor<TelnyxBrand> =
            revet(params, RequestOptions.none())

        /** @see revet */
        @MustBeClosed
        fun revet(brandId: String, requestOptions: RequestOptions): HttpResponseFor<TelnyxBrand> =
            revet(brandId, BrandRevetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /10dlc/brand/{brandId}/smsOtp`, but is otherwise
         * the same as [BrandService.triggerSmsOtp].
         */
        @MustBeClosed
        fun triggerSmsOtp(
            brandId: String,
            params: BrandTriggerSmsOtpParams,
        ): HttpResponseFor<BrandTriggerSmsOtpResponse> =
            triggerSmsOtp(brandId, params, RequestOptions.none())

        /** @see triggerSmsOtp */
        @MustBeClosed
        fun triggerSmsOtp(
            brandId: String,
            params: BrandTriggerSmsOtpParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandTriggerSmsOtpResponse> =
            triggerSmsOtp(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see triggerSmsOtp */
        @MustBeClosed
        fun triggerSmsOtp(
            params: BrandTriggerSmsOtpParams
        ): HttpResponseFor<BrandTriggerSmsOtpResponse> =
            triggerSmsOtp(params, RequestOptions.none())

        /** @see triggerSmsOtp */
        @MustBeClosed
        fun triggerSmsOtp(
            params: BrandTriggerSmsOtpParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandTriggerSmsOtpResponse>

        /**
         * Returns a raw HTTP response for `put /10dlc/brand/{brandId}/smsOtp`, but is otherwise the
         * same as [BrandService.verifySmsOtp].
         */
        @MustBeClosed
        fun verifySmsOtp(brandId: String, params: BrandVerifySmsOtpParams): HttpResponse =
            verifySmsOtp(brandId, params, RequestOptions.none())

        /** @see verifySmsOtp */
        @MustBeClosed
        fun verifySmsOtp(
            brandId: String,
            params: BrandVerifySmsOtpParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = verifySmsOtp(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see verifySmsOtp */
        @MustBeClosed
        fun verifySmsOtp(params: BrandVerifySmsOtpParams): HttpResponse =
            verifySmsOtp(params, RequestOptions.none())

        /** @see verifySmsOtp */
        @MustBeClosed
        fun verifySmsOtp(
            params: BrandVerifySmsOtpParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
