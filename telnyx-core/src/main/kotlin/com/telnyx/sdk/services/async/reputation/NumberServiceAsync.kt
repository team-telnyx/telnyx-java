// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.reputation

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.reputation.numbers.NumberDeleteParams
import com.telnyx.sdk.models.reputation.numbers.NumberListPageAsync
import com.telnyx.sdk.models.reputation.numbers.NumberListParams
import com.telnyx.sdk.models.reputation.numbers.NumberRetrieveParams
import com.telnyx.sdk.models.reputation.numbers.NumberRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Associate phone numbers with an enterprise for reputation monitoring and retrieve reputation
 * scores
 */
interface NumberServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumberServiceAsync

    /**
     * Get reputation data for a specific phone number without requiring an `enterprise_id`.
     *
     * Same response as the enterprise-scoped endpoint. Uses cached data by default.
     */
    fun retrieve(phoneNumber: String): CompletableFuture<NumberRetrieveResponse> =
        retrieve(phoneNumber, NumberRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        params: NumberRetrieveParams = NumberRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberRetrieveResponse> =
        retrieve(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        params: NumberRetrieveParams = NumberRetrieveParams.none(),
    ): CompletableFuture<NumberRetrieveResponse> =
        retrieve(phoneNumber, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NumberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: NumberRetrieveParams): CompletableFuture<NumberRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NumberRetrieveResponse> =
        retrieve(phoneNumber, NumberRetrieveParams.none(), requestOptions)

    /**
     * List all phone numbers enrolled in Number Reputation monitoring for your account. This is a
     * simplified endpoint that does not require an `enterprise_id` — it returns numbers across all
     * your enterprises.
     *
     * Supports pagination and filtering by phone number.
     */
    fun list(): CompletableFuture<NumberListPageAsync> = list(NumberListParams.none())

    /** @see list */
    fun list(
        params: NumberListParams = NumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberListPageAsync>

    /** @see list */
    fun list(
        params: NumberListParams = NumberListParams.none()
    ): CompletableFuture<NumberListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<NumberListPageAsync> =
        list(NumberListParams.none(), requestOptions)

    /**
     * Remove a phone number from Number Reputation monitoring without requiring an `enterprise_id`.
     */
    fun delete(phoneNumber: String): CompletableFuture<Void?> =
        delete(phoneNumber, NumberDeleteParams.none())

    /** @see delete */
    fun delete(
        phoneNumber: String,
        params: NumberDeleteParams = NumberDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see delete */
    fun delete(
        phoneNumber: String,
        params: NumberDeleteParams = NumberDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(phoneNumber, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: NumberDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: NumberDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(phoneNumber: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(phoneNumber, NumberDeleteParams.none(), requestOptions)

    /**
     * A view of [NumberServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NumberServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /reputation/numbers/{phone_number}`, but is
         * otherwise the same as [NumberServiceAsync.retrieve].
         */
        fun retrieve(
            phoneNumber: String
        ): CompletableFuture<HttpResponseFor<NumberRetrieveResponse>> =
            retrieve(phoneNumber, NumberRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            phoneNumber: String,
            params: NumberRetrieveParams = NumberRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberRetrieveResponse>> =
            retrieve(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            phoneNumber: String,
            params: NumberRetrieveParams = NumberRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<NumberRetrieveResponse>> =
            retrieve(phoneNumber, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: NumberRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: NumberRetrieveParams
        ): CompletableFuture<HttpResponseFor<NumberRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NumberRetrieveResponse>> =
            retrieve(phoneNumber, NumberRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /reputation/numbers`, but is otherwise the same as
         * [NumberServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<NumberListPageAsync>> =
            list(NumberListParams.none())

        /** @see list */
        fun list(
            params: NumberListParams = NumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberListPageAsync>>

        /** @see list */
        fun list(
            params: NumberListParams = NumberListParams.none()
        ): CompletableFuture<HttpResponseFor<NumberListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<NumberListPageAsync>> =
            list(NumberListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /reputation/numbers/{phone_number}`, but is
         * otherwise the same as [NumberServiceAsync.delete].
         */
        fun delete(phoneNumber: String): CompletableFuture<HttpResponse> =
            delete(phoneNumber, NumberDeleteParams.none())

        /** @see delete */
        fun delete(
            phoneNumber: String,
            params: NumberDeleteParams = NumberDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see delete */
        fun delete(
            phoneNumber: String,
            params: NumberDeleteParams = NumberDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(phoneNumber, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: NumberDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: NumberDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(phoneNumber, NumberDeleteParams.none(), requestOptions)
    }
}
