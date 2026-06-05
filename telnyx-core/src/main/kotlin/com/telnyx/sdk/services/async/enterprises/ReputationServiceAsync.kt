// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.enterprises

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.enterprises.reputation.ReputationDisableParams
import com.telnyx.sdk.models.enterprises.reputation.ReputationEnableParams
import com.telnyx.sdk.models.enterprises.reputation.ReputationEnableResponse
import com.telnyx.sdk.models.enterprises.reputation.ReputationRetrieveParams
import com.telnyx.sdk.models.enterprises.reputation.ReputationRetrieveResponse
import com.telnyx.sdk.models.enterprises.reputation.ReputationUpdateFrequencyParams
import com.telnyx.sdk.models.enterprises.reputation.ReputationUpdateFrequencyResponse
import com.telnyx.sdk.services.async.enterprises.reputation.LoaServiceAsync
import com.telnyx.sdk.services.async.enterprises.reputation.NumberServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Phone-number reputation monitoring (spam-score lookup and tracking). */
interface ReputationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReputationServiceAsync

    /** Phone-number reputation monitoring (spam-score lookup and tracking). */
    fun numbers(): NumberServiceAsync

    /** Phone-number reputation monitoring (spam-score lookup and tracking). */
    fun loa(): LoaServiceAsync

    /**
     * Phone Number Reputation tracks how your outbound caller-IDs are perceived (spam risk,
     * engagement, etc.) across the call-screening ecosystem. This endpoint reads the
     * enterprise-level settings: whether the product is enabled, the refresh cadence, and the
     * stored Letter of Authorization document id.
     *
     * Returns `404` if reputation has never been enabled for this enterprise.
     */
    fun retrieve(enterpriseId: String): CompletableFuture<ReputationRetrieveResponse> =
        retrieve(enterpriseId, ReputationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        enterpriseId: String,
        params: ReputationRetrieveParams = ReputationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReputationRetrieveResponse> =
        retrieve(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        enterpriseId: String,
        params: ReputationRetrieveParams = ReputationRetrieveParams.none(),
    ): CompletableFuture<ReputationRetrieveResponse> =
        retrieve(enterpriseId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ReputationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReputationRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: ReputationRetrieveParams): CompletableFuture<ReputationRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        enterpriseId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReputationRetrieveResponse> =
        retrieve(enterpriseId, ReputationRetrieveParams.none(), requestOptions)

    /**
     * Disable Phone Number Reputation. All registered numbers are de-registered as a cascade. The
     * enterprise itself is unaffected. Returns `204` on success, `404` if reputation is not enabled
     * for this enterprise.
     */
    fun disable(enterpriseId: String): CompletableFuture<Void?> =
        disable(enterpriseId, ReputationDisableParams.none())

    /** @see disable */
    fun disable(
        enterpriseId: String,
        params: ReputationDisableParams = ReputationDisableParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        disable(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see disable */
    fun disable(
        enterpriseId: String,
        params: ReputationDisableParams = ReputationDisableParams.none(),
    ): CompletableFuture<Void?> = disable(enterpriseId, params, RequestOptions.none())

    /** @see disable */
    fun disable(
        params: ReputationDisableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see disable */
    fun disable(params: ReputationDisableParams): CompletableFuture<Void?> =
        disable(params, RequestOptions.none())

    /** @see disable */
    fun disable(enterpriseId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        disable(enterpriseId, ReputationDisableParams.none(), requestOptions)

    /**
     * Activate Phone Number Reputation for the given enterprise. Requires an uploaded Letter of
     * Authorization document (the `loa_document_id` references the Telnyx Documents API) and a
     * refresh-frequency selection. After activation, individual phone numbers can be registered via
     * `POST .../reputation/numbers`.
     *
     * **Prerequisite**: the calling user must have agreed to the Phone Number Reputation Terms of
     * Service (`POST /terms_of_service/number_reputation/agree`).
     *
     * Failure modes:
     * - `403` — Phone Number Reputation Terms of Service not accepted.
     * - `404` — enterprise does not exist or does not belong to your account.
     * - `400` — reputation already enabled for this enterprise.
     * - `422` — `loa_document_id` missing or `check_frequency` invalid.
     *
     * **Pricing:** This is a billable action. See https://telnyx.com/pricing/numbers for current
     * pricing.
     */
    fun enable(
        enterpriseId: String,
        params: ReputationEnableParams,
    ): CompletableFuture<ReputationEnableResponse> =
        enable(enterpriseId, params, RequestOptions.none())

    /** @see enable */
    fun enable(
        enterpriseId: String,
        params: ReputationEnableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReputationEnableResponse> =
        enable(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see enable */
    fun enable(params: ReputationEnableParams): CompletableFuture<ReputationEnableResponse> =
        enable(params, RequestOptions.none())

    /** @see enable */
    fun enable(
        params: ReputationEnableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReputationEnableResponse>

    /**
     * Update how often Telnyx refreshes the reputation data for this enterprise's registered
     * numbers. The new frequency takes effect on the next scheduled refresh.
     *
     * The enterprise's reputation must be in `approved` status. A request made while the status is
     * `pending` is rejected with `400 Bad Request`.
     */
    fun updateFrequency(
        enterpriseId: String,
        params: ReputationUpdateFrequencyParams,
    ): CompletableFuture<ReputationUpdateFrequencyResponse> =
        updateFrequency(enterpriseId, params, RequestOptions.none())

    /** @see updateFrequency */
    fun updateFrequency(
        enterpriseId: String,
        params: ReputationUpdateFrequencyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReputationUpdateFrequencyResponse> =
        updateFrequency(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see updateFrequency */
    fun updateFrequency(
        params: ReputationUpdateFrequencyParams
    ): CompletableFuture<ReputationUpdateFrequencyResponse> =
        updateFrequency(params, RequestOptions.none())

    /** @see updateFrequency */
    fun updateFrequency(
        params: ReputationUpdateFrequencyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReputationUpdateFrequencyResponse>

    /**
     * A view of [ReputationServiceAsync] that provides access to raw HTTP responses for each
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
        ): ReputationServiceAsync.WithRawResponse

        /** Phone-number reputation monitoring (spam-score lookup and tracking). */
        fun numbers(): NumberServiceAsync.WithRawResponse

        /** Phone-number reputation monitoring (spam-score lookup and tracking). */
        fun loa(): LoaServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /enterprises/{enterprise_id}/reputation`, but is
         * otherwise the same as [ReputationServiceAsync.retrieve].
         */
        fun retrieve(
            enterpriseId: String
        ): CompletableFuture<HttpResponseFor<ReputationRetrieveResponse>> =
            retrieve(enterpriseId, ReputationRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            enterpriseId: String,
            params: ReputationRetrieveParams = ReputationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReputationRetrieveResponse>> =
            retrieve(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            enterpriseId: String,
            params: ReputationRetrieveParams = ReputationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ReputationRetrieveResponse>> =
            retrieve(enterpriseId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ReputationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReputationRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ReputationRetrieveParams
        ): CompletableFuture<HttpResponseFor<ReputationRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            enterpriseId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReputationRetrieveResponse>> =
            retrieve(enterpriseId, ReputationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /enterprises/{enterprise_id}/reputation`, but is
         * otherwise the same as [ReputationServiceAsync.disable].
         */
        fun disable(enterpriseId: String): CompletableFuture<HttpResponse> =
            disable(enterpriseId, ReputationDisableParams.none())

        /** @see disable */
        fun disable(
            enterpriseId: String,
            params: ReputationDisableParams = ReputationDisableParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            disable(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see disable */
        fun disable(
            enterpriseId: String,
            params: ReputationDisableParams = ReputationDisableParams.none(),
        ): CompletableFuture<HttpResponse> = disable(enterpriseId, params, RequestOptions.none())

        /** @see disable */
        fun disable(
            params: ReputationDisableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see disable */
        fun disable(params: ReputationDisableParams): CompletableFuture<HttpResponse> =
            disable(params, RequestOptions.none())

        /** @see disable */
        fun disable(
            enterpriseId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            disable(enterpriseId, ReputationDisableParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /enterprises/{enterprise_id}/reputation`, but is
         * otherwise the same as [ReputationServiceAsync.enable].
         */
        fun enable(
            enterpriseId: String,
            params: ReputationEnableParams,
        ): CompletableFuture<HttpResponseFor<ReputationEnableResponse>> =
            enable(enterpriseId, params, RequestOptions.none())

        /** @see enable */
        fun enable(
            enterpriseId: String,
            params: ReputationEnableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReputationEnableResponse>> =
            enable(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see enable */
        fun enable(
            params: ReputationEnableParams
        ): CompletableFuture<HttpResponseFor<ReputationEnableResponse>> =
            enable(params, RequestOptions.none())

        /** @see enable */
        fun enable(
            params: ReputationEnableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReputationEnableResponse>>

        /**
         * Returns a raw HTTP response for `patch
         * /enterprises/{enterprise_id}/reputation/frequency`, but is otherwise the same as
         * [ReputationServiceAsync.updateFrequency].
         */
        fun updateFrequency(
            enterpriseId: String,
            params: ReputationUpdateFrequencyParams,
        ): CompletableFuture<HttpResponseFor<ReputationUpdateFrequencyResponse>> =
            updateFrequency(enterpriseId, params, RequestOptions.none())

        /** @see updateFrequency */
        fun updateFrequency(
            enterpriseId: String,
            params: ReputationUpdateFrequencyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReputationUpdateFrequencyResponse>> =
            updateFrequency(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see updateFrequency */
        fun updateFrequency(
            params: ReputationUpdateFrequencyParams
        ): CompletableFuture<HttpResponseFor<ReputationUpdateFrequencyResponse>> =
            updateFrequency(params, RequestOptions.none())

        /** @see updateFrequency */
        fun updateFrequency(
            params: ReputationUpdateFrequencyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReputationUpdateFrequencyResponse>>
    }
}
