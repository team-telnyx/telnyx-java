// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.ledgerbillinggroupreports.LedgerBillingGroupReportCreateParams
import com.telnyx.api.models.ledgerbillinggroupreports.LedgerBillingGroupReportCreateResponse
import com.telnyx.api.models.ledgerbillinggroupreports.LedgerBillingGroupReportRetrieveParams
import com.telnyx.api.models.ledgerbillinggroupreports.LedgerBillingGroupReportRetrieveResponse
import java.util.function.Consumer

interface LedgerBillingGroupReportService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LedgerBillingGroupReportService

    /** Create a ledger billing group report */
    fun create(): LedgerBillingGroupReportCreateResponse =
        create(LedgerBillingGroupReportCreateParams.none())

    /** @see create */
    fun create(
        params: LedgerBillingGroupReportCreateParams = LedgerBillingGroupReportCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerBillingGroupReportCreateResponse

    /** @see create */
    fun create(
        params: LedgerBillingGroupReportCreateParams = LedgerBillingGroupReportCreateParams.none()
    ): LedgerBillingGroupReportCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): LedgerBillingGroupReportCreateResponse =
        create(LedgerBillingGroupReportCreateParams.none(), requestOptions)

    /** Get a ledger billing group report */
    fun retrieve(id: String): LedgerBillingGroupReportRetrieveResponse =
        retrieve(id, LedgerBillingGroupReportRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LedgerBillingGroupReportRetrieveParams =
            LedgerBillingGroupReportRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerBillingGroupReportRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LedgerBillingGroupReportRetrieveParams =
            LedgerBillingGroupReportRetrieveParams.none(),
    ): LedgerBillingGroupReportRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LedgerBillingGroupReportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerBillingGroupReportRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: LedgerBillingGroupReportRetrieveParams
    ): LedgerBillingGroupReportRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): LedgerBillingGroupReportRetrieveResponse =
        retrieve(id, LedgerBillingGroupReportRetrieveParams.none(), requestOptions)

    /**
     * A view of [LedgerBillingGroupReportService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LedgerBillingGroupReportService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ledger_billing_group_reports`, but is otherwise
         * the same as [LedgerBillingGroupReportService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<LedgerBillingGroupReportCreateResponse> =
            create(LedgerBillingGroupReportCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: LedgerBillingGroupReportCreateParams =
                LedgerBillingGroupReportCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerBillingGroupReportCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: LedgerBillingGroupReportCreateParams =
                LedgerBillingGroupReportCreateParams.none()
        ): HttpResponseFor<LedgerBillingGroupReportCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): HttpResponseFor<LedgerBillingGroupReportCreateResponse> =
            create(LedgerBillingGroupReportCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ledger_billing_group_reports/{id}`, but is
         * otherwise the same as [LedgerBillingGroupReportService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<LedgerBillingGroupReportRetrieveResponse> =
            retrieve(id, LedgerBillingGroupReportRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LedgerBillingGroupReportRetrieveParams =
                LedgerBillingGroupReportRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerBillingGroupReportRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LedgerBillingGroupReportRetrieveParams =
                LedgerBillingGroupReportRetrieveParams.none(),
        ): HttpResponseFor<LedgerBillingGroupReportRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: LedgerBillingGroupReportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerBillingGroupReportRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: LedgerBillingGroupReportRetrieveParams
        ): HttpResponseFor<LedgerBillingGroupReportRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerBillingGroupReportRetrieveResponse> =
            retrieve(id, LedgerBillingGroupReportRetrieveParams.none(), requestOptions)
    }
}
