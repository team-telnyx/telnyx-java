// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.bundlepricing

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.bundlepricing.billingbundles.BillingBundleListPage
import com.telnyx.sdk.models.bundlepricing.billingbundles.BillingBundleListParams
import com.telnyx.sdk.models.bundlepricing.billingbundles.BillingBundleRetrieveParams
import com.telnyx.sdk.models.bundlepricing.billingbundles.BillingBundleRetrieveResponse
import java.util.function.Consumer

interface BillingBundleService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BillingBundleService

    /** Get a single bundle by ID. */
    fun retrieve(bundleId: String): BillingBundleRetrieveResponse =
        retrieve(bundleId, BillingBundleRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        bundleId: String,
        params: BillingBundleRetrieveParams = BillingBundleRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillingBundleRetrieveResponse =
        retrieve(params.toBuilder().bundleId(bundleId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        bundleId: String,
        params: BillingBundleRetrieveParams = BillingBundleRetrieveParams.none(),
    ): BillingBundleRetrieveResponse = retrieve(bundleId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BillingBundleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillingBundleRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: BillingBundleRetrieveParams): BillingBundleRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(bundleId: String, requestOptions: RequestOptions): BillingBundleRetrieveResponse =
        retrieve(bundleId, BillingBundleRetrieveParams.none(), requestOptions)

    /** Get all allowed bundles. */
    fun list(): BillingBundleListPage = list(BillingBundleListParams.none())

    /** @see list */
    fun list(
        params: BillingBundleListParams = BillingBundleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillingBundleListPage

    /** @see list */
    fun list(
        params: BillingBundleListParams = BillingBundleListParams.none()
    ): BillingBundleListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): BillingBundleListPage =
        list(BillingBundleListParams.none(), requestOptions)

    /**
     * A view of [BillingBundleService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BillingBundleService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /bundle_pricing/billing_bundles/{bundle_id}`, but is
         * otherwise the same as [BillingBundleService.retrieve].
         */
        @MustBeClosed
        fun retrieve(bundleId: String): HttpResponseFor<BillingBundleRetrieveResponse> =
            retrieve(bundleId, BillingBundleRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            bundleId: String,
            params: BillingBundleRetrieveParams = BillingBundleRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillingBundleRetrieveResponse> =
            retrieve(params.toBuilder().bundleId(bundleId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            bundleId: String,
            params: BillingBundleRetrieveParams = BillingBundleRetrieveParams.none(),
        ): HttpResponseFor<BillingBundleRetrieveResponse> =
            retrieve(bundleId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BillingBundleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillingBundleRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BillingBundleRetrieveParams
        ): HttpResponseFor<BillingBundleRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            bundleId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillingBundleRetrieveResponse> =
            retrieve(bundleId, BillingBundleRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /bundle_pricing/billing_bundles`, but is otherwise
         * the same as [BillingBundleService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<BillingBundleListPage> = list(BillingBundleListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BillingBundleListParams = BillingBundleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillingBundleListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: BillingBundleListParams = BillingBundleListParams.none()
        ): HttpResponseFor<BillingBundleListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BillingBundleListPage> =
            list(BillingBundleListParams.none(), requestOptions)
    }
}
