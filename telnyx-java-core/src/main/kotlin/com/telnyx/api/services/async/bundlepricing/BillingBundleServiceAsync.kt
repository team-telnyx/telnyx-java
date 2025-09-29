// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.bundlepricing

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.bundlepricing.billingbundles.BillingBundleListParams
import com.telnyx.api.models.bundlepricing.billingbundles.BillingBundleListResponse
import com.telnyx.api.models.bundlepricing.billingbundles.BillingBundleRetrieveParams
import com.telnyx.api.models.bundlepricing.billingbundles.BillingBundleRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BillingBundleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BillingBundleServiceAsync

    /** Get a single bundle by ID. */
    fun retrieve(bundleId: String): CompletableFuture<BillingBundleRetrieveResponse> =
        retrieve(bundleId, BillingBundleRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        bundleId: String,
        params: BillingBundleRetrieveParams = BillingBundleRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingBundleRetrieveResponse> =
        retrieve(params.toBuilder().bundleId(bundleId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        bundleId: String,
        params: BillingBundleRetrieveParams = BillingBundleRetrieveParams.none(),
    ): CompletableFuture<BillingBundleRetrieveResponse> =
        retrieve(bundleId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BillingBundleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingBundleRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: BillingBundleRetrieveParams
    ): CompletableFuture<BillingBundleRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        bundleId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillingBundleRetrieveResponse> =
        retrieve(bundleId, BillingBundleRetrieveParams.none(), requestOptions)

    /** Get all allowed bundles. */
    fun list(): CompletableFuture<BillingBundleListResponse> = list(BillingBundleListParams.none())

    /** @see list */
    fun list(
        params: BillingBundleListParams = BillingBundleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingBundleListResponse>

    /** @see list */
    fun list(
        params: BillingBundleListParams = BillingBundleListParams.none()
    ): CompletableFuture<BillingBundleListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<BillingBundleListResponse> =
        list(BillingBundleListParams.none(), requestOptions)

    /**
     * A view of [BillingBundleServiceAsync] that provides access to raw HTTP responses for each
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
        ): BillingBundleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /bundle_pricing/billing_bundles/{bundle_id}`, but is
         * otherwise the same as [BillingBundleServiceAsync.retrieve].
         */
        fun retrieve(
            bundleId: String
        ): CompletableFuture<HttpResponseFor<BillingBundleRetrieveResponse>> =
            retrieve(bundleId, BillingBundleRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            bundleId: String,
            params: BillingBundleRetrieveParams = BillingBundleRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingBundleRetrieveResponse>> =
            retrieve(params.toBuilder().bundleId(bundleId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            bundleId: String,
            params: BillingBundleRetrieveParams = BillingBundleRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<BillingBundleRetrieveResponse>> =
            retrieve(bundleId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BillingBundleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingBundleRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: BillingBundleRetrieveParams
        ): CompletableFuture<HttpResponseFor<BillingBundleRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            bundleId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillingBundleRetrieveResponse>> =
            retrieve(bundleId, BillingBundleRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /bundle_pricing/billing_bundles`, but is otherwise
         * the same as [BillingBundleServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BillingBundleListResponse>> =
            list(BillingBundleListParams.none())

        /** @see list */
        fun list(
            params: BillingBundleListParams = BillingBundleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingBundleListResponse>>

        /** @see list */
        fun list(
            params: BillingBundleListParams = BillingBundleListParams.none()
        ): CompletableFuture<HttpResponseFor<BillingBundleListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BillingBundleListResponse>> =
            list(BillingBundleListParams.none(), requestOptions)
    }
}
