// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.reputation

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.enterprises.reputation.numbers.ReputationPhoneNumberWithReputation
import com.telnyx.sdk.models.reputation.numbers.NumberDeleteParams
import com.telnyx.sdk.models.reputation.numbers.NumberListPage
import com.telnyx.sdk.models.reputation.numbers.NumberListParams
import com.telnyx.sdk.models.reputation.numbers.NumberRetrieveParams
import java.util.function.Consumer

/** Phone-number reputation monitoring (spam-score lookup and tracking). */
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
     * Convenience alias for `GET
     * /v2/enterprises/{enterprise_id}/reputation/numbers/{phone_number}`.
     */
    fun retrieve(phoneNumber: String): ReputationPhoneNumberWithReputation =
        retrieve(phoneNumber, NumberRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        params: NumberRetrieveParams = NumberRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReputationPhoneNumberWithReputation =
        retrieve(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        params: NumberRetrieveParams = NumberRetrieveParams.none(),
    ): ReputationPhoneNumberWithReputation = retrieve(phoneNumber, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NumberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReputationPhoneNumberWithReputation

    /** @see retrieve */
    fun retrieve(params: NumberRetrieveParams): ReputationPhoneNumberWithReputation =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        requestOptions: RequestOptions,
    ): ReputationPhoneNumberWithReputation =
        retrieve(phoneNumber, NumberRetrieveParams.none(), requestOptions)

    /**
     * Convenience alias for `GET /v2/enterprises/{enterprise_id}/reputation/numbers` that returns
     * numbers across every enterprise you own. Useful when you don't want to look up the enterprise
     * id first.
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
     * Convenience alias for `DELETE
     * /v2/enterprises/{enterprise_id}/reputation/numbers/{phone_number}`.
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
        fun retrieve(phoneNumber: String): HttpResponseFor<ReputationPhoneNumberWithReputation> =
            retrieve(phoneNumber, NumberRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            phoneNumber: String,
            params: NumberRetrieveParams = NumberRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReputationPhoneNumberWithReputation> =
            retrieve(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            phoneNumber: String,
            params: NumberRetrieveParams = NumberRetrieveParams.none(),
        ): HttpResponseFor<ReputationPhoneNumberWithReputation> =
            retrieve(phoneNumber, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NumberRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReputationPhoneNumberWithReputation>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NumberRetrieveParams
        ): HttpResponseFor<ReputationPhoneNumberWithReputation> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReputationPhoneNumberWithReputation> =
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
