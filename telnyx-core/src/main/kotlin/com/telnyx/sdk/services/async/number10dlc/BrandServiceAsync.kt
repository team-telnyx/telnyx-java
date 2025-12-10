// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.number10dlc

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.brand.TelnyxBrand
import com.telnyx.sdk.models.number10dlc.brand.Brand2faEmailParams
import com.telnyx.sdk.models.number10dlc.brand.BrandCreateParams
import com.telnyx.sdk.models.number10dlc.brand.BrandDeleteParams
import com.telnyx.sdk.models.number10dlc.brand.BrandListParams
import com.telnyx.sdk.models.number10dlc.brand.BrandListResponse
import com.telnyx.sdk.models.number10dlc.brand.BrandRetrieveParams
import com.telnyx.sdk.models.number10dlc.brand.BrandRetrieveResponse
import com.telnyx.sdk.models.number10dlc.brand.BrandUpdateParams
import com.telnyx.sdk.models.number10dlc.brand.BrandUpdateRevetParams
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
    fun list(): CompletableFuture<BrandListResponse> = list(BrandListParams.none())

    /** @see list */
    fun list(
        params: BrandListParams = BrandListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandListResponse>

    /** @see list */
    fun list(
        params: BrandListParams = BrandListParams.none()
    ): CompletableFuture<BrandListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<BrandListResponse> =
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

    /** Resend brand 2FA email */
    fun _2faEmail(brandId: String): CompletableFuture<Void?> =
        _2faEmail(brandId, Brand2faEmailParams.none())

    /** @see _2faEmail */
    fun _2faEmail(
        brandId: String,
        params: Brand2faEmailParams = Brand2faEmailParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        _2faEmail(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see _2faEmail */
    fun _2faEmail(
        brandId: String,
        params: Brand2faEmailParams = Brand2faEmailParams.none(),
    ): CompletableFuture<Void?> = _2faEmail(brandId, params, RequestOptions.none())

    /** @see _2faEmail */
    fun _2faEmail(
        params: Brand2faEmailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see _2faEmail */
    fun _2faEmail(params: Brand2faEmailParams): CompletableFuture<Void?> =
        _2faEmail(params, RequestOptions.none())

    /** @see _2faEmail */
    fun _2faEmail(brandId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        _2faEmail(brandId, Brand2faEmailParams.none(), requestOptions)

    /**
     * This operation allows you to revet the brand. However, revetting is allowed once after the
     * successful brand registration and thereafter limited to once every 3 months.
     */
    fun updateRevet(brandId: String): CompletableFuture<TelnyxBrand> =
        updateRevet(brandId, BrandUpdateRevetParams.none())

    /** @see updateRevet */
    fun updateRevet(
        brandId: String,
        params: BrandUpdateRevetParams = BrandUpdateRevetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelnyxBrand> =
        updateRevet(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see updateRevet */
    fun updateRevet(
        brandId: String,
        params: BrandUpdateRevetParams = BrandUpdateRevetParams.none(),
    ): CompletableFuture<TelnyxBrand> = updateRevet(brandId, params, RequestOptions.none())

    /** @see updateRevet */
    fun updateRevet(
        params: BrandUpdateRevetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelnyxBrand>

    /** @see updateRevet */
    fun updateRevet(params: BrandUpdateRevetParams): CompletableFuture<TelnyxBrand> =
        updateRevet(params, RequestOptions.none())

    /** @see updateRevet */
    fun updateRevet(
        brandId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TelnyxBrand> =
        updateRevet(brandId, BrandUpdateRevetParams.none(), requestOptions)

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
        fun list(): CompletableFuture<HttpResponseFor<BrandListResponse>> =
            list(BrandListParams.none())

        /** @see list */
        fun list(
            params: BrandListParams = BrandListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandListResponse>>

        /** @see list */
        fun list(
            params: BrandListParams = BrandListParams.none()
        ): CompletableFuture<HttpResponseFor<BrandListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BrandListResponse>> =
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
         * Returns a raw HTTP response for `post /10dlc/brand/{brandId}/2faEmail`, but is otherwise
         * the same as [BrandServiceAsync._2faEmail].
         */
        fun _2faEmail(brandId: String): CompletableFuture<HttpResponse> =
            _2faEmail(brandId, Brand2faEmailParams.none())

        /** @see _2faEmail */
        fun _2faEmail(
            brandId: String,
            params: Brand2faEmailParams = Brand2faEmailParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            _2faEmail(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see _2faEmail */
        fun _2faEmail(
            brandId: String,
            params: Brand2faEmailParams = Brand2faEmailParams.none(),
        ): CompletableFuture<HttpResponse> = _2faEmail(brandId, params, RequestOptions.none())

        /** @see _2faEmail */
        fun _2faEmail(
            params: Brand2faEmailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see _2faEmail */
        fun _2faEmail(params: Brand2faEmailParams): CompletableFuture<HttpResponse> =
            _2faEmail(params, RequestOptions.none())

        /** @see _2faEmail */
        fun _2faEmail(
            brandId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            _2faEmail(brandId, Brand2faEmailParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /10dlc/brand/{brandId}/revet`, but is otherwise the
         * same as [BrandServiceAsync.updateRevet].
         */
        fun updateRevet(brandId: String): CompletableFuture<HttpResponseFor<TelnyxBrand>> =
            updateRevet(brandId, BrandUpdateRevetParams.none())

        /** @see updateRevet */
        fun updateRevet(
            brandId: String,
            params: BrandUpdateRevetParams = BrandUpdateRevetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelnyxBrand>> =
            updateRevet(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see updateRevet */
        fun updateRevet(
            brandId: String,
            params: BrandUpdateRevetParams = BrandUpdateRevetParams.none(),
        ): CompletableFuture<HttpResponseFor<TelnyxBrand>> =
            updateRevet(brandId, params, RequestOptions.none())

        /** @see updateRevet */
        fun updateRevet(
            params: BrandUpdateRevetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelnyxBrand>>

        /** @see updateRevet */
        fun updateRevet(
            params: BrandUpdateRevetParams
        ): CompletableFuture<HttpResponseFor<TelnyxBrand>> =
            updateRevet(params, RequestOptions.none())

        /** @see updateRevet */
        fun updateRevet(
            brandId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TelnyxBrand>> =
            updateRevet(brandId, BrandUpdateRevetParams.none(), requestOptions)
    }
}
