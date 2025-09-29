// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.legacy.reporting.usagereports

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.models.legacy.reporting.usagereports.numberlookup.NumberLookupCreateParams
import com.telnyx.api.models.legacy.reporting.usagereports.numberlookup.NumberLookupDeleteParams
import com.telnyx.api.models.legacy.reporting.usagereports.numberlookup.NumberLookupListParams
import com.telnyx.api.models.legacy.reporting.usagereports.numberlookup.NumberLookupRetrieveParams
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
    fun create(): CompletableFuture<Void?> = create(NumberLookupCreateParams.none())

    /** @see create */
    fun create(
        params: NumberLookupCreateParams = NumberLookupCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see create */
    fun create(
        params: NumberLookupCreateParams = NumberLookupCreateParams.none()
    ): CompletableFuture<Void?> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<Void?> =
        create(NumberLookupCreateParams.none(), requestOptions)

    /** Retrieve a specific telco data usage report by its ID */
    fun retrieve(id: String): CompletableFuture<Void?> =
        retrieve(id, NumberLookupRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NumberLookupRetrieveParams = NumberLookupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NumberLookupRetrieveParams = NumberLookupRetrieveParams.none(),
    ): CompletableFuture<Void?> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NumberLookupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see retrieve */
    fun retrieve(params: NumberLookupRetrieveParams): CompletableFuture<Void?> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        retrieve(id, NumberLookupRetrieveParams.none(), requestOptions)

    /** Retrieve a paginated list of telco data usage reports */
    fun list(): CompletableFuture<Void?> = list(NumberLookupListParams.none())

    /** @see list */
    fun list(
        params: NumberLookupListParams = NumberLookupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see list */
    fun list(
        params: NumberLookupListParams = NumberLookupListParams.none()
    ): CompletableFuture<Void?> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<Void?> =
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
        fun create(): CompletableFuture<HttpResponse> = create(NumberLookupCreateParams.none())

        /** @see create */
        fun create(
            params: NumberLookupCreateParams = NumberLookupCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see create */
        fun create(
            params: NumberLookupCreateParams = NumberLookupCreateParams.none()
        ): CompletableFuture<HttpResponse> = create(params, RequestOptions.none())

        /** @see create */
        fun create(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            create(NumberLookupCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /legacy/reporting/usage_reports/number_lookup/{id}`,
         * but is otherwise the same as [NumberLookupServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponse> =
            retrieve(id, NumberLookupRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: NumberLookupRetrieveParams = NumberLookupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: NumberLookupRetrieveParams = NumberLookupRetrieveParams.none(),
        ): CompletableFuture<HttpResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: NumberLookupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see retrieve */
        fun retrieve(params: NumberLookupRetrieveParams): CompletableFuture<HttpResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            retrieve(id, NumberLookupRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /legacy/reporting/usage_reports/number_lookup`, but
         * is otherwise the same as [NumberLookupServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponse> = list(NumberLookupListParams.none())

        /** @see list */
        fun list(
            params: NumberLookupListParams = NumberLookupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see list */
        fun list(
            params: NumberLookupListParams = NumberLookupListParams.none()
        ): CompletableFuture<HttpResponse> = list(params, RequestOptions.none())

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
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
