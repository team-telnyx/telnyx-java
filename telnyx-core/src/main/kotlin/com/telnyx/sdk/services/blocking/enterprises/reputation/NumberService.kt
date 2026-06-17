// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.enterprises.reputation

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.enterprises.reputation.numbers.NumberAssociateParams
import com.telnyx.sdk.models.enterprises.reputation.numbers.NumberDisassociateParams
import com.telnyx.sdk.models.enterprises.reputation.numbers.NumberListPage
import com.telnyx.sdk.models.enterprises.reputation.numbers.NumberListParams
import com.telnyx.sdk.models.enterprises.reputation.numbers.NumberRefreshParams
import com.telnyx.sdk.models.enterprises.reputation.numbers.NumberRefreshResponse
import com.telnyx.sdk.models.enterprises.reputation.numbers.NumberRetrieveParams
import com.telnyx.sdk.models.enterprises.reputation.numbers.ReputationPhoneNumberList
import com.telnyx.sdk.models.enterprises.reputation.numbers.ReputationPhoneNumberWithReputation
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
     * Retrieve one registered number with its latest reputation snapshot. The `phone_number` path
     * parameter is in E.164 format and must be URL-encoded (e.g. `%2B19493253498`).
     */
    fun retrieve(
        phoneNumber: String,
        params: NumberRetrieveParams,
    ): ReputationPhoneNumberWithReputation = retrieve(phoneNumber, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        params: NumberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReputationPhoneNumberWithReputation =
        retrieve(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: NumberRetrieveParams): ReputationPhoneNumberWithReputation =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NumberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReputationPhoneNumberWithReputation

    /**
     * Paginated list of phone numbers registered for reputation monitoring under this enterprise.
     * The response includes the latest reputation snapshot per number where one has been collected.
     */
    fun list(enterpriseId: String): NumberListPage = list(enterpriseId, NumberListParams.none())

    /** @see list */
    fun list(
        enterpriseId: String,
        params: NumberListParams = NumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberListPage = list(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see list */
    fun list(
        enterpriseId: String,
        params: NumberListParams = NumberListParams.none(),
    ): NumberListPage = list(enterpriseId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: NumberListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberListPage

    /** @see list */
    fun list(params: NumberListParams): NumberListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(enterpriseId: String, requestOptions: RequestOptions): NumberListPage =
        list(enterpriseId, NumberListParams.none(), requestOptions)

    /**
     * Add up to 100 phone numbers to reputation monitoring on this enterprise. Each must be in
     * E.164 format (`+1NPANXXXXXX` for US/CA) and belong to your Telnyx phone-number inventory.
     *
     * **Prerequisite**: reputation must already be enabled on this enterprise (see `POST
     * .../reputation`).
     *
     * **Pricing:** This is a billable action. See https://telnyx.com/pricing/numbers for current
     * pricing.
     */
    fun associate(enterpriseId: String, params: NumberAssociateParams): ReputationPhoneNumberList =
        associate(enterpriseId, params, RequestOptions.none())

    /** @see associate */
    fun associate(
        enterpriseId: String,
        params: NumberAssociateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReputationPhoneNumberList =
        associate(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see associate */
    fun associate(params: NumberAssociateParams): ReputationPhoneNumberList =
        associate(params, RequestOptions.none())

    /** @see associate */
    fun associate(
        params: NumberAssociateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReputationPhoneNumberList

    /**
     * Stop tracking the reputation of this phone number. The number itself remains in your
     * inventory; only the reputation registration is removed.
     */
    fun disassociate(phoneNumber: String, params: NumberDisassociateParams) =
        disassociate(phoneNumber, params, RequestOptions.none())

    /** @see disassociate */
    fun disassociate(
        phoneNumber: String,
        params: NumberDisassociateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = disassociate(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see disassociate */
    fun disassociate(params: NumberDisassociateParams) = disassociate(params, RequestOptions.none())

    /** @see disassociate */
    fun disassociate(
        params: NumberDisassociateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Immediately refresh the stored reputation data for the listed numbers. This is in addition to
     * the periodic refresh determined by `check_frequency`. Up to 100 numbers per call. The
     * response carries the kicked-off jobs; the actual refresh runs asynchronously.
     *
     * **Pricing:** Forcing a refresh performs live reputation lookups, which are billable. See
     * https://telnyx.com/pricing/numbers for current pricing.
     */
    fun refresh(enterpriseId: String, params: NumberRefreshParams): NumberRefreshResponse =
        refresh(enterpriseId, params, RequestOptions.none())

    /** @see refresh */
    fun refresh(
        enterpriseId: String,
        params: NumberRefreshParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberRefreshResponse =
        refresh(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see refresh */
    fun refresh(params: NumberRefreshParams): NumberRefreshResponse =
        refresh(params, RequestOptions.none())

    /** @see refresh */
    fun refresh(
        params: NumberRefreshParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberRefreshResponse

    /** A view of [NumberService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumberService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /enterprises/{enterprise_id}/reputation/numbers/{phone_number}`, but is otherwise the
         * same as [NumberService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            phoneNumber: String,
            params: NumberRetrieveParams,
        ): HttpResponseFor<ReputationPhoneNumberWithReputation> =
            retrieve(phoneNumber, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            phoneNumber: String,
            params: NumberRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReputationPhoneNumberWithReputation> =
            retrieve(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NumberRetrieveParams
        ): HttpResponseFor<ReputationPhoneNumberWithReputation> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NumberRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReputationPhoneNumberWithReputation>

        /**
         * Returns a raw HTTP response for `get /enterprises/{enterprise_id}/reputation/numbers`,
         * but is otherwise the same as [NumberService.list].
         */
        @MustBeClosed
        fun list(enterpriseId: String): HttpResponseFor<NumberListPage> =
            list(enterpriseId, NumberListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            enterpriseId: String,
            params: NumberListParams = NumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberListPage> =
            list(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            enterpriseId: String,
            params: NumberListParams = NumberListParams.none(),
        ): HttpResponseFor<NumberListPage> = list(enterpriseId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: NumberListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: NumberListParams): HttpResponseFor<NumberListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            enterpriseId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NumberListPage> =
            list(enterpriseId, NumberListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /enterprises/{enterprise_id}/reputation/numbers`,
         * but is otherwise the same as [NumberService.associate].
         */
        @MustBeClosed
        fun associate(
            enterpriseId: String,
            params: NumberAssociateParams,
        ): HttpResponseFor<ReputationPhoneNumberList> =
            associate(enterpriseId, params, RequestOptions.none())

        /** @see associate */
        @MustBeClosed
        fun associate(
            enterpriseId: String,
            params: NumberAssociateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReputationPhoneNumberList> =
            associate(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see associate */
        @MustBeClosed
        fun associate(params: NumberAssociateParams): HttpResponseFor<ReputationPhoneNumberList> =
            associate(params, RequestOptions.none())

        /** @see associate */
        @MustBeClosed
        fun associate(
            params: NumberAssociateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReputationPhoneNumberList>

        /**
         * Returns a raw HTTP response for `delete
         * /enterprises/{enterprise_id}/reputation/numbers/{phone_number}`, but is otherwise the
         * same as [NumberService.disassociate].
         */
        @MustBeClosed
        fun disassociate(phoneNumber: String, params: NumberDisassociateParams): HttpResponse =
            disassociate(phoneNumber, params, RequestOptions.none())

        /** @see disassociate */
        @MustBeClosed
        fun disassociate(
            phoneNumber: String,
            params: NumberDisassociateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            disassociate(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see disassociate */
        @MustBeClosed
        fun disassociate(params: NumberDisassociateParams): HttpResponse =
            disassociate(params, RequestOptions.none())

        /** @see disassociate */
        @MustBeClosed
        fun disassociate(
            params: NumberDisassociateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /enterprises/{enterprise_id}/reputation/numbers/refresh`, but is otherwise the same as
         * [NumberService.refresh].
         */
        @MustBeClosed
        fun refresh(
            enterpriseId: String,
            params: NumberRefreshParams,
        ): HttpResponseFor<NumberRefreshResponse> =
            refresh(enterpriseId, params, RequestOptions.none())

        /** @see refresh */
        @MustBeClosed
        fun refresh(
            enterpriseId: String,
            params: NumberRefreshParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberRefreshResponse> =
            refresh(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see refresh */
        @MustBeClosed
        fun refresh(params: NumberRefreshParams): HttpResponseFor<NumberRefreshResponse> =
            refresh(params, RequestOptions.none())

        /** @see refresh */
        @MustBeClosed
        fun refresh(
            params: NumberRefreshParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberRefreshResponse>
    }
}
