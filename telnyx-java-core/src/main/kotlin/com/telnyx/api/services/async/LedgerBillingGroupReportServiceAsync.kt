// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.ledgerbillinggroupreports.LedgerBillingGroupReportCreateParams
import com.telnyx.api.models.ledgerbillinggroupreports.LedgerBillingGroupReportCreateResponse
import com.telnyx.api.models.ledgerbillinggroupreports.LedgerBillingGroupReportRetrieveParams
import com.telnyx.api.models.ledgerbillinggroupreports.LedgerBillingGroupReportRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LedgerBillingGroupReportServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LedgerBillingGroupReportServiceAsync

    /** Create a ledger billing group report */
    fun create(): CompletableFuture<LedgerBillingGroupReportCreateResponse> =
        create(LedgerBillingGroupReportCreateParams.none())

    /** @see create */
    fun create(
        params: LedgerBillingGroupReportCreateParams = LedgerBillingGroupReportCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerBillingGroupReportCreateResponse>

    /** @see create */
    fun create(
        params: LedgerBillingGroupReportCreateParams = LedgerBillingGroupReportCreateParams.none()
    ): CompletableFuture<LedgerBillingGroupReportCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        requestOptions: RequestOptions
    ): CompletableFuture<LedgerBillingGroupReportCreateResponse> =
        create(LedgerBillingGroupReportCreateParams.none(), requestOptions)

    /** Get a ledger billing group report */
    fun retrieve(id: String): CompletableFuture<LedgerBillingGroupReportRetrieveResponse> =
        retrieve(id, LedgerBillingGroupReportRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LedgerBillingGroupReportRetrieveParams =
            LedgerBillingGroupReportRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerBillingGroupReportRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LedgerBillingGroupReportRetrieveParams =
            LedgerBillingGroupReportRetrieveParams.none(),
    ): CompletableFuture<LedgerBillingGroupReportRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LedgerBillingGroupReportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerBillingGroupReportRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: LedgerBillingGroupReportRetrieveParams
    ): CompletableFuture<LedgerBillingGroupReportRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerBillingGroupReportRetrieveResponse> =
        retrieve(id, LedgerBillingGroupReportRetrieveParams.none(), requestOptions)

    /**
     * A view of [LedgerBillingGroupReportServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LedgerBillingGroupReportServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ledger_billing_group_reports`, but is otherwise
         * the same as [LedgerBillingGroupReportServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<LedgerBillingGroupReportCreateResponse>> =
            create(LedgerBillingGroupReportCreateParams.none())

        /** @see create */
        fun create(
            params: LedgerBillingGroupReportCreateParams =
                LedgerBillingGroupReportCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerBillingGroupReportCreateResponse>>

        /** @see create */
        fun create(
            params: LedgerBillingGroupReportCreateParams =
                LedgerBillingGroupReportCreateParams.none()
        ): CompletableFuture<HttpResponseFor<LedgerBillingGroupReportCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LedgerBillingGroupReportCreateResponse>> =
            create(LedgerBillingGroupReportCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ledger_billing_group_reports/{id}`, but is
         * otherwise the same as [LedgerBillingGroupReportServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<LedgerBillingGroupReportRetrieveResponse>> =
            retrieve(id, LedgerBillingGroupReportRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: LedgerBillingGroupReportRetrieveParams =
                LedgerBillingGroupReportRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerBillingGroupReportRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: LedgerBillingGroupReportRetrieveParams =
                LedgerBillingGroupReportRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<LedgerBillingGroupReportRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: LedgerBillingGroupReportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerBillingGroupReportRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: LedgerBillingGroupReportRetrieveParams
        ): CompletableFuture<HttpResponseFor<LedgerBillingGroupReportRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerBillingGroupReportRetrieveResponse>> =
            retrieve(id, LedgerBillingGroupReportRetrieveParams.none(), requestOptions)
    }
}
