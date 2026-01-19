// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.legacy.reporting.usagereports

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.legacy.reporting.usagereports.numberlookup.NumberLookupCreateParams
import com.telnyx.sdk.models.legacy.reporting.usagereports.numberlookup.NumberLookupCreateResponse
import com.telnyx.sdk.models.legacy.reporting.usagereports.numberlookup.NumberLookupDeleteParams
import com.telnyx.sdk.models.legacy.reporting.usagereports.numberlookup.NumberLookupListParams
import com.telnyx.sdk.models.legacy.reporting.usagereports.numberlookup.NumberLookupListResponse
import com.telnyx.sdk.models.legacy.reporting.usagereports.numberlookup.NumberLookupRetrieveParams
import com.telnyx.sdk.models.legacy.reporting.usagereports.numberlookup.NumberLookupRetrieveResponse
import java.util.function.Consumer

interface NumberLookupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumberLookupService

    /** Submit a new telco data usage report */
    fun create(): NumberLookupCreateResponse = create(NumberLookupCreateParams.none())

    /** @see create */
    fun create(
        params: NumberLookupCreateParams = NumberLookupCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberLookupCreateResponse

    /** @see create */
    fun create(
        params: NumberLookupCreateParams = NumberLookupCreateParams.none()
    ): NumberLookupCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): NumberLookupCreateResponse =
        create(NumberLookupCreateParams.none(), requestOptions)

    /** Retrieve a specific telco data usage report by its ID */
    fun retrieve(id: String): NumberLookupRetrieveResponse =
        retrieve(id, NumberLookupRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NumberLookupRetrieveParams = NumberLookupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberLookupRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NumberLookupRetrieveParams = NumberLookupRetrieveParams.none(),
    ): NumberLookupRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NumberLookupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberLookupRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: NumberLookupRetrieveParams): NumberLookupRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): NumberLookupRetrieveResponse =
        retrieve(id, NumberLookupRetrieveParams.none(), requestOptions)

    /** Retrieve a paginated list of telco data usage reports */
    fun list(): NumberLookupListResponse = list(NumberLookupListParams.none())

    /** @see list */
    fun list(
        params: NumberLookupListParams = NumberLookupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberLookupListResponse

    /** @see list */
    fun list(
        params: NumberLookupListParams = NumberLookupListParams.none()
    ): NumberLookupListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): NumberLookupListResponse =
        list(NumberLookupListParams.none(), requestOptions)

    /** Delete a specific telco data usage report by its ID */
    fun delete(id: String) = delete(id, NumberLookupDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: NumberLookupDeleteParams = NumberLookupDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: NumberLookupDeleteParams = NumberLookupDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: NumberLookupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: NumberLookupDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, NumberLookupDeleteParams.none(), requestOptions)

    /**
     * A view of [NumberLookupService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NumberLookupService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /legacy/reporting/usage_reports/number_lookup`, but
         * is otherwise the same as [NumberLookupService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<NumberLookupCreateResponse> =
            create(NumberLookupCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: NumberLookupCreateParams = NumberLookupCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberLookupCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: NumberLookupCreateParams = NumberLookupCreateParams.none()
        ): HttpResponseFor<NumberLookupCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<NumberLookupCreateResponse> =
            create(NumberLookupCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /legacy/reporting/usage_reports/number_lookup/{id}`,
         * but is otherwise the same as [NumberLookupService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<NumberLookupRetrieveResponse> =
            retrieve(id, NumberLookupRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: NumberLookupRetrieveParams = NumberLookupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberLookupRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: NumberLookupRetrieveParams = NumberLookupRetrieveParams.none(),
        ): HttpResponseFor<NumberLookupRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NumberLookupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberLookupRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NumberLookupRetrieveParams
        ): HttpResponseFor<NumberLookupRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NumberLookupRetrieveResponse> =
            retrieve(id, NumberLookupRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /legacy/reporting/usage_reports/number_lookup`, but
         * is otherwise the same as [NumberLookupService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<NumberLookupListResponse> = list(NumberLookupListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: NumberLookupListParams = NumberLookupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberLookupListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: NumberLookupListParams = NumberLookupListParams.none()
        ): HttpResponseFor<NumberLookupListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<NumberLookupListResponse> =
            list(NumberLookupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /legacy/reporting/usage_reports/number_lookup/{id}`, but is otherwise the same as
         * [NumberLookupService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, NumberLookupDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: NumberLookupDeleteParams = NumberLookupDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: NumberLookupDeleteParams = NumberLookupDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: NumberLookupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: NumberLookupDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, NumberLookupDeleteParams.none(), requestOptions)
    }
}
