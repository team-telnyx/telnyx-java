// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.enterprises.reputation

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.enterprises.reputation.numbers.NumberAssociateParams
import com.telnyx.sdk.models.enterprises.reputation.numbers.NumberAssociateResponse
import com.telnyx.sdk.models.enterprises.reputation.numbers.NumberDisassociateParams
import com.telnyx.sdk.models.enterprises.reputation.numbers.NumberListPageAsync
import com.telnyx.sdk.models.enterprises.reputation.numbers.NumberListParams
import com.telnyx.sdk.models.enterprises.reputation.numbers.NumberRefreshParams
import com.telnyx.sdk.models.enterprises.reputation.numbers.NumberRefreshResponse
import com.telnyx.sdk.models.enterprises.reputation.numbers.NumberRetrieveParams
import com.telnyx.sdk.models.enterprises.reputation.numbers.NumberRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Phone-number reputation monitoring (spam-score lookup and tracking). */
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
     * Retrieve one registered number with its latest reputation snapshot. The `phone_number` path
     * parameter is in E.164 format and must be URL-encoded (e.g. `%2B19493253498`).
     */
    fun retrieve(
        phoneNumber: String,
        params: NumberRetrieveParams,
    ): CompletableFuture<NumberRetrieveResponse> =
        retrieve(phoneNumber, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        params: NumberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberRetrieveResponse> =
        retrieve(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: NumberRetrieveParams): CompletableFuture<NumberRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NumberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberRetrieveResponse>

    /**
     * Paginated list of phone numbers registered for reputation monitoring under this enterprise.
     * The response includes the latest reputation snapshot per number where one has been collected.
     */
    fun list(enterpriseId: String): CompletableFuture<NumberListPageAsync> =
        list(enterpriseId, NumberListParams.none())

    /** @see list */
    fun list(
        enterpriseId: String,
        params: NumberListParams = NumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberListPageAsync> =
        list(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see list */
    fun list(
        enterpriseId: String,
        params: NumberListParams = NumberListParams.none(),
    ): CompletableFuture<NumberListPageAsync> = list(enterpriseId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: NumberListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberListPageAsync>

    /** @see list */
    fun list(params: NumberListParams): CompletableFuture<NumberListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        enterpriseId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NumberListPageAsync> =
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
    fun associate(
        enterpriseId: String,
        params: NumberAssociateParams,
    ): CompletableFuture<NumberAssociateResponse> =
        associate(enterpriseId, params, RequestOptions.none())

    /** @see associate */
    fun associate(
        enterpriseId: String,
        params: NumberAssociateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberAssociateResponse> =
        associate(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see associate */
    fun associate(params: NumberAssociateParams): CompletableFuture<NumberAssociateResponse> =
        associate(params, RequestOptions.none())

    /** @see associate */
    fun associate(
        params: NumberAssociateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberAssociateResponse>

    /**
     * Stop tracking the reputation of this phone number. The number itself remains in your
     * inventory; only the reputation registration is removed.
     */
    fun disassociate(
        phoneNumber: String,
        params: NumberDisassociateParams,
    ): CompletableFuture<Void?> = disassociate(phoneNumber, params, RequestOptions.none())

    /** @see disassociate */
    fun disassociate(
        phoneNumber: String,
        params: NumberDisassociateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        disassociate(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see disassociate */
    fun disassociate(params: NumberDisassociateParams): CompletableFuture<Void?> =
        disassociate(params, RequestOptions.none())

    /** @see disassociate */
    fun disassociate(
        params: NumberDisassociateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Immediately refresh the stored reputation data for the listed numbers. This is in addition to
     * the periodic refresh determined by `check_frequency`. Up to 100 numbers per call. The
     * response carries the kicked-off jobs; the actual refresh runs asynchronously.
     *
     * **Pricing:** Forcing a refresh performs live reputation lookups, which are billable. See
     * https://telnyx.com/pricing/numbers for current pricing.
     */
    fun refresh(
        enterpriseId: String,
        params: NumberRefreshParams,
    ): CompletableFuture<NumberRefreshResponse> =
        refresh(enterpriseId, params, RequestOptions.none())

    /** @see refresh */
    fun refresh(
        enterpriseId: String,
        params: NumberRefreshParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberRefreshResponse> =
        refresh(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see refresh */
    fun refresh(params: NumberRefreshParams): CompletableFuture<NumberRefreshResponse> =
        refresh(params, RequestOptions.none())

    /** @see refresh */
    fun refresh(
        params: NumberRefreshParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberRefreshResponse>

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
         * Returns a raw HTTP response for `get
         * /enterprises/{enterprise_id}/reputation/numbers/{phone_number}`, but is otherwise the
         * same as [NumberServiceAsync.retrieve].
         */
        fun retrieve(
            phoneNumber: String,
            params: NumberRetrieveParams,
        ): CompletableFuture<HttpResponseFor<NumberRetrieveResponse>> =
            retrieve(phoneNumber, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            phoneNumber: String,
            params: NumberRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberRetrieveResponse>> =
            retrieve(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: NumberRetrieveParams
        ): CompletableFuture<HttpResponseFor<NumberRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: NumberRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `get /enterprises/{enterprise_id}/reputation/numbers`,
         * but is otherwise the same as [NumberServiceAsync.list].
         */
        fun list(enterpriseId: String): CompletableFuture<HttpResponseFor<NumberListPageAsync>> =
            list(enterpriseId, NumberListParams.none())

        /** @see list */
        fun list(
            enterpriseId: String,
            params: NumberListParams = NumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberListPageAsync>> =
            list(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see list */
        fun list(
            enterpriseId: String,
            params: NumberListParams = NumberListParams.none(),
        ): CompletableFuture<HttpResponseFor<NumberListPageAsync>> =
            list(enterpriseId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: NumberListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberListPageAsync>>

        /** @see list */
        fun list(
            params: NumberListParams
        ): CompletableFuture<HttpResponseFor<NumberListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            enterpriseId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NumberListPageAsync>> =
            list(enterpriseId, NumberListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /enterprises/{enterprise_id}/reputation/numbers`,
         * but is otherwise the same as [NumberServiceAsync.associate].
         */
        fun associate(
            enterpriseId: String,
            params: NumberAssociateParams,
        ): CompletableFuture<HttpResponseFor<NumberAssociateResponse>> =
            associate(enterpriseId, params, RequestOptions.none())

        /** @see associate */
        fun associate(
            enterpriseId: String,
            params: NumberAssociateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberAssociateResponse>> =
            associate(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see associate */
        fun associate(
            params: NumberAssociateParams
        ): CompletableFuture<HttpResponseFor<NumberAssociateResponse>> =
            associate(params, RequestOptions.none())

        /** @see associate */
        fun associate(
            params: NumberAssociateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberAssociateResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /enterprises/{enterprise_id}/reputation/numbers/{phone_number}`, but is otherwise the
         * same as [NumberServiceAsync.disassociate].
         */
        fun disassociate(
            phoneNumber: String,
            params: NumberDisassociateParams,
        ): CompletableFuture<HttpResponse> =
            disassociate(phoneNumber, params, RequestOptions.none())

        /** @see disassociate */
        fun disassociate(
            phoneNumber: String,
            params: NumberDisassociateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            disassociate(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see disassociate */
        fun disassociate(params: NumberDisassociateParams): CompletableFuture<HttpResponse> =
            disassociate(params, RequestOptions.none())

        /** @see disassociate */
        fun disassociate(
            params: NumberDisassociateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post
         * /enterprises/{enterprise_id}/reputation/numbers/refresh`, but is otherwise the same as
         * [NumberServiceAsync.refresh].
         */
        fun refresh(
            enterpriseId: String,
            params: NumberRefreshParams,
        ): CompletableFuture<HttpResponseFor<NumberRefreshResponse>> =
            refresh(enterpriseId, params, RequestOptions.none())

        /** @see refresh */
        fun refresh(
            enterpriseId: String,
            params: NumberRefreshParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberRefreshResponse>> =
            refresh(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see refresh */
        fun refresh(
            params: NumberRefreshParams
        ): CompletableFuture<HttpResponseFor<NumberRefreshResponse>> =
            refresh(params, RequestOptions.none())

        /** @see refresh */
        fun refresh(
            params: NumberRefreshParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberRefreshResponse>>
    }
}
