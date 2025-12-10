// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.number10dlc

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.number10dlc.brand.BrandCreateParams
import com.telnyx.sdk.models.number10dlc.brand.BrandDeleteParams
import com.telnyx.sdk.models.number10dlc.brand.BrandGetFeedbackParams
import com.telnyx.sdk.models.number10dlc.brand.BrandGetFeedbackResponse
import com.telnyx.sdk.models.number10dlc.brand.BrandListPageAsync
import com.telnyx.sdk.models.number10dlc.brand.BrandListParams
import com.telnyx.sdk.models.number10dlc.brand.BrandResend2faEmailParams
import com.telnyx.sdk.models.number10dlc.brand.BrandRetrieveParams
import com.telnyx.sdk.models.number10dlc.brand.BrandRetrieveResponse
import com.telnyx.sdk.models.number10dlc.brand.BrandRetrieveSmsOtpStatusParams
import com.telnyx.sdk.models.number10dlc.brand.BrandRetrieveSmsOtpStatusResponse
import com.telnyx.sdk.models.number10dlc.brand.BrandRevetParams
import com.telnyx.sdk.models.number10dlc.brand.BrandUpdateParams
import com.telnyx.sdk.models.number10dlc.brand.TelnyxBrand
import com.telnyx.sdk.services.async.number10dlc.brand.ExternalVettingServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BrandServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandServiceAsync

    fun externalVetting(): ExternalVettingServiceAsync

    /**
     * This endpoint is used to create a new brand. A brand is an entity created by The Campaign
     * Registry (TCR) that represents an organization or a company. It is this entity that TCR
     * created campaigns will be associated with. Each brand creation will entail an upfront,
     * non-refundable $4 expense.
     */
    fun create(params: BrandCreateParams): CompletableFuture<TelnyxBrand> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BrandCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelnyxBrand>

    /** Retrieve a brand by `brandId`. */
    fun retrieve(brandId: String): CompletableFuture<BrandRetrieveResponse> =
        retrieve(brandId, BrandRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        brandId: String,
        params: BrandRetrieveParams = BrandRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandRetrieveResponse> =
        retrieve(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        brandId: String,
        params: BrandRetrieveParams = BrandRetrieveParams.none(),
    ): CompletableFuture<BrandRetrieveResponse> = retrieve(brandId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BrandRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: BrandRetrieveParams): CompletableFuture<BrandRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        brandId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrandRetrieveResponse> =
        retrieve(brandId, BrandRetrieveParams.none(), requestOptions)

    /** Update a brand's attributes by `brandId`. */
    fun update(brandId: String, params: BrandUpdateParams): CompletableFuture<TelnyxBrand> =
        update(brandId, params, RequestOptions.none())

    /** @see update */
    fun update(
        brandId: String,
        params: BrandUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelnyxBrand> =
        update(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see update */
    fun update(params: BrandUpdateParams): CompletableFuture<TelnyxBrand> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BrandUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelnyxBrand>

    /** This endpoint is used to list all brands associated with your organization. */
    fun list(): CompletableFuture<BrandListPageAsync> = list(BrandListParams.none())

    /** @see list */
    fun list(
        params: BrandListParams = BrandListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandListPageAsync>

    /** @see list */
    fun list(
        params: BrandListParams = BrandListParams.none()
    ): CompletableFuture<BrandListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<BrandListPageAsync> =
        list(BrandListParams.none(), requestOptions)

    /**
     * Delete Brand. This endpoint is used to delete a brand. Note the brand cannot be deleted if it
     * contains one or more active campaigns, the campaigns need to be inactive and at least 3
     * months old due to billing purposes.
     */
    fun delete(brandId: String): CompletableFuture<Void?> =
        delete(brandId, BrandDeleteParams.none())

    /** @see delete */
    fun delete(
        brandId: String,
        params: BrandDeleteParams = BrandDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see delete */
    fun delete(
        brandId: String,
        params: BrandDeleteParams = BrandDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(brandId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BrandDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: BrandDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(brandId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
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
    fun getFeedback(brandId: String): CompletableFuture<BrandGetFeedbackResponse> =
        getFeedback(brandId, BrandGetFeedbackParams.none())

    /** @see getFeedback */
    fun getFeedback(
        brandId: String,
        params: BrandGetFeedbackParams = BrandGetFeedbackParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandGetFeedbackResponse> =
        getFeedback(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see getFeedback */
    fun getFeedback(
        brandId: String,
        params: BrandGetFeedbackParams = BrandGetFeedbackParams.none(),
    ): CompletableFuture<BrandGetFeedbackResponse> =
        getFeedback(brandId, params, RequestOptions.none())

    /** @see getFeedback */
    fun getFeedback(
        params: BrandGetFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandGetFeedbackResponse>

    /** @see getFeedback */
    fun getFeedback(params: BrandGetFeedbackParams): CompletableFuture<BrandGetFeedbackResponse> =
        getFeedback(params, RequestOptions.none())

    /** @see getFeedback */
    fun getFeedback(
        brandId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrandGetFeedbackResponse> =
        getFeedback(brandId, BrandGetFeedbackParams.none(), requestOptions)

    /** Resend brand 2FA email */
    fun resend2faEmail(brandId: String): CompletableFuture<Void?> =
        resend2faEmail(brandId, BrandResend2faEmailParams.none())

    /** @see resend2faEmail */
    fun resend2faEmail(
        brandId: String,
        params: BrandResend2faEmailParams = BrandResend2faEmailParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        resend2faEmail(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see resend2faEmail */
    fun resend2faEmail(
        brandId: String,
        params: BrandResend2faEmailParams = BrandResend2faEmailParams.none(),
    ): CompletableFuture<Void?> = resend2faEmail(brandId, params, RequestOptions.none())

    /** @see resend2faEmail */
    fun resend2faEmail(
        params: BrandResend2faEmailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see resend2faEmail */
    fun resend2faEmail(params: BrandResend2faEmailParams): CompletableFuture<Void?> =
        resend2faEmail(params, RequestOptions.none())

    /** @see resend2faEmail */
    fun resend2faEmail(brandId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        resend2faEmail(brandId, BrandResend2faEmailParams.none(), requestOptions)

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
    fun retrieveSmsOtpStatus(
        referenceId: String
    ): CompletableFuture<BrandRetrieveSmsOtpStatusResponse> =
        retrieveSmsOtpStatus(referenceId, BrandRetrieveSmsOtpStatusParams.none())

    /** @see retrieveSmsOtpStatus */
    fun retrieveSmsOtpStatus(
        referenceId: String,
        params: BrandRetrieveSmsOtpStatusParams = BrandRetrieveSmsOtpStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandRetrieveSmsOtpStatusResponse> =
        retrieveSmsOtpStatus(params.toBuilder().referenceId(referenceId).build(), requestOptions)

    /** @see retrieveSmsOtpStatus */
    fun retrieveSmsOtpStatus(
        referenceId: String,
        params: BrandRetrieveSmsOtpStatusParams = BrandRetrieveSmsOtpStatusParams.none(),
    ): CompletableFuture<BrandRetrieveSmsOtpStatusResponse> =
        retrieveSmsOtpStatus(referenceId, params, RequestOptions.none())

    /** @see retrieveSmsOtpStatus */
    fun retrieveSmsOtpStatus(
        params: BrandRetrieveSmsOtpStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandRetrieveSmsOtpStatusResponse>

    /** @see retrieveSmsOtpStatus */
    fun retrieveSmsOtpStatus(
        params: BrandRetrieveSmsOtpStatusParams
    ): CompletableFuture<BrandRetrieveSmsOtpStatusResponse> =
        retrieveSmsOtpStatus(params, RequestOptions.none())

    /** @see retrieveSmsOtpStatus */
    fun retrieveSmsOtpStatus(
        referenceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrandRetrieveSmsOtpStatusResponse> =
        retrieveSmsOtpStatus(referenceId, BrandRetrieveSmsOtpStatusParams.none(), requestOptions)

    /**
     * This operation allows you to revet the brand. However, revetting is allowed once after the
     * successful brand registration and thereafter limited to once every 3 months.
     */
    fun revet(brandId: String): CompletableFuture<TelnyxBrand> =
        revet(brandId, BrandRevetParams.none())

    /** @see revet */
    fun revet(
        brandId: String,
        params: BrandRevetParams = BrandRevetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelnyxBrand> =
        revet(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see revet */
    fun revet(
        brandId: String,
        params: BrandRevetParams = BrandRevetParams.none(),
    ): CompletableFuture<TelnyxBrand> = revet(brandId, params, RequestOptions.none())

    /** @see revet */
    fun revet(
        params: BrandRevetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelnyxBrand>

    /** @see revet */
    fun revet(params: BrandRevetParams): CompletableFuture<TelnyxBrand> =
        revet(params, RequestOptions.none())

    /** @see revet */
    fun revet(brandId: String, requestOptions: RequestOptions): CompletableFuture<TelnyxBrand> =
        revet(brandId, BrandRevetParams.none(), requestOptions)

    /** A view of [BrandServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BrandServiceAsync.WithRawResponse

        fun externalVetting(): ExternalVettingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /10dlc/brand`, but is otherwise the same as
         * [BrandServiceAsync.create].
         */
        fun create(params: BrandCreateParams): CompletableFuture<HttpResponseFor<TelnyxBrand>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BrandCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelnyxBrand>>

        /**
         * Returns a raw HTTP response for `get /10dlc/brand/{brandId}`, but is otherwise the same
         * as [BrandServiceAsync.retrieve].
         */
        fun retrieve(brandId: String): CompletableFuture<HttpResponseFor<BrandRetrieveResponse>> =
            retrieve(brandId, BrandRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            brandId: String,
            params: BrandRetrieveParams = BrandRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandRetrieveResponse>> =
            retrieve(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            brandId: String,
            params: BrandRetrieveParams = BrandRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<BrandRetrieveResponse>> =
            retrieve(brandId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BrandRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: BrandRetrieveParams
        ): CompletableFuture<HttpResponseFor<BrandRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            brandId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandRetrieveResponse>> =
            retrieve(brandId, BrandRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /10dlc/brand/{brandId}`, but is otherwise the same
         * as [BrandServiceAsync.update].
         */
        fun update(
            brandId: String,
            params: BrandUpdateParams,
        ): CompletableFuture<HttpResponseFor<TelnyxBrand>> =
            update(brandId, params, RequestOptions.none())

        /** @see update */
        fun update(
            brandId: String,
            params: BrandUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelnyxBrand>> =
            update(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see update */
        fun update(params: BrandUpdateParams): CompletableFuture<HttpResponseFor<TelnyxBrand>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: BrandUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelnyxBrand>>

        /**
         * Returns a raw HTTP response for `get /10dlc/brand`, but is otherwise the same as
         * [BrandServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BrandListPageAsync>> =
            list(BrandListParams.none())

        /** @see list */
        fun list(
            params: BrandListParams = BrandListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandListPageAsync>>

        /** @see list */
        fun list(
            params: BrandListParams = BrandListParams.none()
        ): CompletableFuture<HttpResponseFor<BrandListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BrandListPageAsync>> =
            list(BrandListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /10dlc/brand/{brandId}`, but is otherwise the
         * same as [BrandServiceAsync.delete].
         */
        fun delete(brandId: String): CompletableFuture<HttpResponse> =
            delete(brandId, BrandDeleteParams.none())

        /** @see delete */
        fun delete(
            brandId: String,
            params: BrandDeleteParams = BrandDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see delete */
        fun delete(
            brandId: String,
            params: BrandDeleteParams = BrandDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(brandId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: BrandDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: BrandDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            brandId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(brandId, BrandDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /10dlc/brand/feedback/{brandId}`, but is otherwise
         * the same as [BrandServiceAsync.getFeedback].
         */
        fun getFeedback(
            brandId: String
        ): CompletableFuture<HttpResponseFor<BrandGetFeedbackResponse>> =
            getFeedback(brandId, BrandGetFeedbackParams.none())

        /** @see getFeedback */
        fun getFeedback(
            brandId: String,
            params: BrandGetFeedbackParams = BrandGetFeedbackParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandGetFeedbackResponse>> =
            getFeedback(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see getFeedback */
        fun getFeedback(
            brandId: String,
            params: BrandGetFeedbackParams = BrandGetFeedbackParams.none(),
        ): CompletableFuture<HttpResponseFor<BrandGetFeedbackResponse>> =
            getFeedback(brandId, params, RequestOptions.none())

        /** @see getFeedback */
        fun getFeedback(
            params: BrandGetFeedbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandGetFeedbackResponse>>

        /** @see getFeedback */
        fun getFeedback(
            params: BrandGetFeedbackParams
        ): CompletableFuture<HttpResponseFor<BrandGetFeedbackResponse>> =
            getFeedback(params, RequestOptions.none())

        /** @see getFeedback */
        fun getFeedback(
            brandId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandGetFeedbackResponse>> =
            getFeedback(brandId, BrandGetFeedbackParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /10dlc/brand/{brandId}/2faEmail`, but is otherwise
         * the same as [BrandServiceAsync.resend2faEmail].
         */
        fun resend2faEmail(brandId: String): CompletableFuture<HttpResponse> =
            resend2faEmail(brandId, BrandResend2faEmailParams.none())

        /** @see resend2faEmail */
        fun resend2faEmail(
            brandId: String,
            params: BrandResend2faEmailParams = BrandResend2faEmailParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            resend2faEmail(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see resend2faEmail */
        fun resend2faEmail(
            brandId: String,
            params: BrandResend2faEmailParams = BrandResend2faEmailParams.none(),
        ): CompletableFuture<HttpResponse> = resend2faEmail(brandId, params, RequestOptions.none())

        /** @see resend2faEmail */
        fun resend2faEmail(
            params: BrandResend2faEmailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see resend2faEmail */
        fun resend2faEmail(params: BrandResend2faEmailParams): CompletableFuture<HttpResponse> =
            resend2faEmail(params, RequestOptions.none())

        /** @see resend2faEmail */
        fun resend2faEmail(
            brandId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            resend2faEmail(brandId, BrandResend2faEmailParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /10dlc/brand/smsOtp/{referenceId}`, but is otherwise
         * the same as [BrandServiceAsync.retrieveSmsOtpStatus].
         */
        fun retrieveSmsOtpStatus(
            referenceId: String
        ): CompletableFuture<HttpResponseFor<BrandRetrieveSmsOtpStatusResponse>> =
            retrieveSmsOtpStatus(referenceId, BrandRetrieveSmsOtpStatusParams.none())

        /** @see retrieveSmsOtpStatus */
        fun retrieveSmsOtpStatus(
            referenceId: String,
            params: BrandRetrieveSmsOtpStatusParams = BrandRetrieveSmsOtpStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandRetrieveSmsOtpStatusResponse>> =
            retrieveSmsOtpStatus(
                params.toBuilder().referenceId(referenceId).build(),
                requestOptions,
            )

        /** @see retrieveSmsOtpStatus */
        fun retrieveSmsOtpStatus(
            referenceId: String,
            params: BrandRetrieveSmsOtpStatusParams = BrandRetrieveSmsOtpStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<BrandRetrieveSmsOtpStatusResponse>> =
            retrieveSmsOtpStatus(referenceId, params, RequestOptions.none())

        /** @see retrieveSmsOtpStatus */
        fun retrieveSmsOtpStatus(
            params: BrandRetrieveSmsOtpStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandRetrieveSmsOtpStatusResponse>>

        /** @see retrieveSmsOtpStatus */
        fun retrieveSmsOtpStatus(
            params: BrandRetrieveSmsOtpStatusParams
        ): CompletableFuture<HttpResponseFor<BrandRetrieveSmsOtpStatusResponse>> =
            retrieveSmsOtpStatus(params, RequestOptions.none())

        /** @see retrieveSmsOtpStatus */
        fun retrieveSmsOtpStatus(
            referenceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandRetrieveSmsOtpStatusResponse>> =
            retrieveSmsOtpStatus(
                referenceId,
                BrandRetrieveSmsOtpStatusParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `put /10dlc/brand/{brandId}/revet`, but is otherwise the
         * same as [BrandServiceAsync.revet].
         */
        fun revet(brandId: String): CompletableFuture<HttpResponseFor<TelnyxBrand>> =
            revet(brandId, BrandRevetParams.none())

        /** @see revet */
        fun revet(
            brandId: String,
            params: BrandRevetParams = BrandRevetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelnyxBrand>> =
            revet(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see revet */
        fun revet(
            brandId: String,
            params: BrandRevetParams = BrandRevetParams.none(),
        ): CompletableFuture<HttpResponseFor<TelnyxBrand>> =
            revet(brandId, params, RequestOptions.none())

        /** @see revet */
        fun revet(
            params: BrandRevetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelnyxBrand>>

        /** @see revet */
        fun revet(params: BrandRevetParams): CompletableFuture<HttpResponseFor<TelnyxBrand>> =
            revet(params, RequestOptions.none())

        /** @see revet */
        fun revet(
            brandId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TelnyxBrand>> =
            revet(brandId, BrandRevetParams.none(), requestOptions)
    }
}
