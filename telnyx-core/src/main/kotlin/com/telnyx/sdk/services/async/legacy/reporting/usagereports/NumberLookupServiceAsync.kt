// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.legacy.reporting.usagereports

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface NumberLookupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumberLookupServiceAsync

    /** Submit a new telco data usage report */
    fun create(): CompletableFuture<NumberLookupCreateResponse> =
        create(NumberLookupCreateParams.none())

    /** @see create */
    fun create(
        params: NumberLookupCreateParams = NumberLookupCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberLookupCreateResponse>

    /** @see create */
    fun create(
        params: NumberLookupCreateParams = NumberLookupCreateParams.none()
    ): CompletableFuture<NumberLookupCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<NumberLookupCreateResponse> =
        create(NumberLookupCreateParams.none(), requestOptions)

    /** Retrieve a specific telco data usage report by its ID */
    fun retrieve(id: String): CompletableFuture<NumberLookupRetrieveResponse> =
        retrieve(id, NumberLookupRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NumberLookupRetrieveParams = NumberLookupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberLookupRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NumberLookupRetrieveParams = NumberLookupRetrieveParams.none(),
    ): CompletableFuture<NumberLookupRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NumberLookupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberLookupRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: NumberLookupRetrieveParams
    ): CompletableFuture<NumberLookupRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NumberLookupRetrieveResponse> =
        retrieve(id, NumberLookupRetrieveParams.none(), requestOptions)

    /** Retrieve a paginated list of telco data usage reports */
    fun list(): CompletableFuture<NumberLookupListResponse> = list(NumberLookupListParams.none())

    /** @see list */
    fun list(
        params: NumberLookupListParams = NumberLookupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberLookupListResponse>

    /** @see list */
    fun list(
        params: NumberLookupListParams = NumberLookupListParams.none()
    ): CompletableFuture<NumberLookupListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<NumberLookupListResponse> =
        list(NumberLookupListParams.none(), requestOptions)

    /** Delete a specific telco data usage report by its ID */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, NumberLookupDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: NumberLookupDeleteParams = NumberLookupDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: NumberLookupDeleteParams = NumberLookupDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: NumberLookupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: NumberLookupDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, NumberLookupDeleteParams.none(), requestOptions)

    /**
     * A view of [NumberLookupServiceAsync] that provides access to raw HTTP responses for each
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
        ): NumberLookupServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /legacy/reporting/usage_reports/number_lookup`, but
         * is otherwise the same as [NumberLookupServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<NumberLookupCreateResponse>> =
            create(NumberLookupCreateParams.none())

        /** @see create */
        fun create(
            params: NumberLookupCreateParams = NumberLookupCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberLookupCreateResponse>>

        /** @see create */
        fun create(
            params: NumberLookupCreateParams = NumberLookupCreateParams.none()
        ): CompletableFuture<HttpResponseFor<NumberLookupCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<NumberLookupCreateResponse>> =
            create(NumberLookupCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /legacy/reporting/usage_reports/number_lookup/{id}`,
         * but is otherwise the same as [NumberLookupServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<NumberLookupRetrieveResponse>> =
            retrieve(id, NumberLookupRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: NumberLookupRetrieveParams = NumberLookupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberLookupRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: NumberLookupRetrieveParams = NumberLookupRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<NumberLookupRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: NumberLookupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberLookupRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: NumberLookupRetrieveParams
        ): CompletableFuture<HttpResponseFor<NumberLookupRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NumberLookupRetrieveResponse>> =
            retrieve(id, NumberLookupRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /legacy/reporting/usage_reports/number_lookup`, but
         * is otherwise the same as [NumberLookupServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<NumberLookupListResponse>> =
            list(NumberLookupListParams.none())

        /** @see list */
        fun list(
            params: NumberLookupListParams = NumberLookupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberLookupListResponse>>

        /** @see list */
        fun list(
            params: NumberLookupListParams = NumberLookupListParams.none()
        ): CompletableFuture<HttpResponseFor<NumberLookupListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<NumberLookupListResponse>> =
            list(NumberLookupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /legacy/reporting/usage_reports/number_lookup/{id}`, but is otherwise the same as
         * [NumberLookupServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, NumberLookupDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: NumberLookupDeleteParams = NumberLookupDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: NumberLookupDeleteParams = NumberLookupDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: NumberLookupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: NumberLookupDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, NumberLookupDeleteParams.none(), requestOptions)
    }
}
