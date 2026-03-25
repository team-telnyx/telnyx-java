// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.reputation

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.reputation.numbers.NumberDeleteParams
import com.telnyx.sdk.models.reputation.numbers.NumberListPage
import com.telnyx.sdk.models.reputation.numbers.NumberListParams
import com.telnyx.sdk.models.reputation.numbers.NumberRetrieveParams
import com.telnyx.sdk.models.reputation.numbers.NumberRetrieveResponse
import java.util.function.Consumer

/**
 * Associate phone numbers with an enterprise for reputation monitoring and retrieve reputation
 * scores
 */
interface NumberService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumberService

    /**
     * Get reputation data for a specific phone number without requiring an `enterprise_id`.
     *
     * Same response as the enterprise-scoped endpoint. Uses cached data by default.
     */
    fun retrieve(phoneNumber: String): NumberRetrieveResponse =
        retrieve(phoneNumber, NumberRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        params: NumberRetrieveParams = NumberRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberRetrieveResponse =
        retrieve(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        params: NumberRetrieveParams = NumberRetrieveParams.none(),
    ): NumberRetrieveResponse = retrieve(phoneNumber, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NumberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: NumberRetrieveParams): NumberRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(phoneNumber: String, requestOptions: RequestOptions): NumberRetrieveResponse =
        retrieve(phoneNumber, NumberRetrieveParams.none(), requestOptions)

    /**
     * List all phone numbers enrolled in Number Reputation monitoring for your account. This is a
     * simplified endpoint that does not require an `enterprise_id` — it returns numbers across all
     * your enterprises.
     *
     * Supports pagination and filtering by phone number.
     */
    fun list(): NumberListPage = list(NumberListParams.none())

    /** @see list */
    fun list(
        params: NumberListParams = NumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberListPage

    /** @see list */
    fun list(params: NumberListParams = NumberListParams.none()): NumberListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): NumberListPage =
        list(NumberListParams.none(), requestOptions)

    /**
     * Remove a phone number from Number Reputation monitoring without requiring an `enterprise_id`.
     */
    fun delete(phoneNumber: String) = delete(phoneNumber, NumberDeleteParams.none())

    /** @see delete */
    fun delete(
        phoneNumber: String,
        params: NumberDeleteParams = NumberDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see delete */
    fun delete(phoneNumber: String, params: NumberDeleteParams = NumberDeleteParams.none()) =
        delete(phoneNumber, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: NumberDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: NumberDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(phoneNumber: String, requestOptions: RequestOptions) =
        delete(phoneNumber, NumberDeleteParams.none(), requestOptions)

    /** A view of [NumberService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumberService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /reputation/numbers/{phone_number}`, but is
         * otherwise the same as [NumberService.retrieve].
         */
        @MustBeClosed
        fun retrieve(phoneNumber: String): HttpResponseFor<NumberRetrieveResponse> =
            retrieve(phoneNumber, NumberRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            phoneNumber: String,
            params: NumberRetrieveParams = NumberRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberRetrieveResponse> =
            retrieve(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            phoneNumber: String,
            params: NumberRetrieveParams = NumberRetrieveParams.none(),
        ): HttpResponseFor<NumberRetrieveResponse> =
            retrieve(phoneNumber, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NumberRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: NumberRetrieveParams): HttpResponseFor<NumberRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NumberRetrieveResponse> =
            retrieve(phoneNumber, NumberRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /reputation/numbers`, but is otherwise the same as
         * [NumberService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<NumberListPage> = list(NumberListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: NumberListParams = NumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: NumberListParams = NumberListParams.none()
        ): HttpResponseFor<NumberListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<NumberListPage> =
            list(NumberListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /reputation/numbers/{phone_number}`, but is
         * otherwise the same as [NumberService.delete].
         */
        @MustBeClosed
        fun delete(phoneNumber: String): HttpResponse =
            delete(phoneNumber, NumberDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            phoneNumber: String,
            params: NumberDeleteParams = NumberDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            phoneNumber: String,
            params: NumberDeleteParams = NumberDeleteParams.none(),
        ): HttpResponse = delete(phoneNumber, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: NumberDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: NumberDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(phoneNumber: String, requestOptions: RequestOptions): HttpResponse =
            delete(phoneNumber, NumberDeleteParams.none(), requestOptions)
    }
}
