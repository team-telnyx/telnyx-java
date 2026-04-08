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
import com.telnyx.sdk.models.enterprises.reputation.numbers.NumberRetrieveParams
import com.telnyx.sdk.models.enterprises.reputation.numbers.NumberRetrieveResponse
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
     * Get detailed reputation data for a specific phone number associated with an enterprise.
     *
     * **Query Parameters:**
     * - `fresh` (default: `false`): When `true`, fetches fresh reputation data (incurs API cost).
     *   When `false`, returns cached data. If no cached data exists, fresh data is automatically
     *   fetched.
     *
     * **Returns:**
     * - `spam_risk`: Overall spam risk level (`low`, `medium`, `high`)
     * - `spam_category`: Spam category classification
     * - `maturity_score`: Maturity metric (0–100)
     * - `connection_score`: Connection quality metric (0–100)
     * - `engagement_score`: Engagement metric (0–100)
     * - `sentiment_score`: Sentiment metric (0–100)
     * - `last_refreshed_at`: Timestamp of last data refresh
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
     * List all phone numbers associated with an enterprise for Number Reputation monitoring.
     *
     * Returns phone numbers with their cached reputation data (if available). Supports pagination
     * and filtering by phone number.
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
     * Associate one or more phone numbers with an enterprise for Number Reputation monitoring.
     *
     * **Validations:**
     * - Phone numbers must be in E.164 format (e.g., `+16035551234`)
     * - Phone numbers must be in-service and belong to your account (verified via Warehouse)
     * - Phone numbers must be US local numbers
     * - Phone numbers cannot already be associated with any enterprise
     *
     * **Note:** This operation is atomic — if any number fails validation, the entire request
     * fails.
     *
     * **Maximum:** 100 phone numbers per request.
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
     * Remove a phone number from Number Reputation monitoring for an enterprise.
     *
     * The number will no longer be tracked and reputation data will no longer be refreshed.
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
    }
}
