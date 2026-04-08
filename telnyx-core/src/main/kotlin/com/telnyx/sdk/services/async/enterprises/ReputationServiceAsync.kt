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
import com.telnyx.sdk.services.async.enterprises.reputation.NumberServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage Number Reputation enrollment and check frequency settings for an enterprise */
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

    /**
     * Associate phone numbers with an enterprise for reputation monitoring and retrieve reputation
     * scores
     */
    fun numbers(): NumberServiceAsync

    /**
     * Retrieve the current Number Reputation settings for an enterprise.
     *
     * Returns the enrollment status (`pending`, `approved`, `rejected`, `deleted`), check
     * frequency, and any rejection reasons.
     *
     * Returns `404` if reputation has not been enabled for this enterprise.
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
     * Disable Number Reputation for an enterprise.
     *
     * This will:
     * - Delete the reputation settings record
     * - Log the deletion for audit purposes
     * - Stop all future automated reputation checks
     *
     * **Note:** Can only be performed on `approved` reputation settings.
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
     * Enable Number Reputation service for an enterprise.
     *
     * **Requirements:**
     * - Signed LOA (Letter of Authorization) document ID
     * - Reputation check frequency (defaults to `business_daily`)
     * - Number Reputation Terms of Service must be accepted
     *
     * **Flow:**
     * 1. Registers the enterprise for reputation monitoring
     * 2. Creates reputation settings with `pending` status
     * 3. Awaits admin approval before monitoring begins
     *
     * **Resubmission After Rejection:** If a previously rejected record exists, this endpoint will
     * delete it and create a new `pending` record.
     *
     * **Available Frequencies:**
     * - `business_daily` — Monday–Friday
     * - `daily` — Every day
     * - `weekly` — Once per week
     * - `biweekly` — Once every two weeks
     * - `monthly` — Once per month
     * - `never` — Manual refresh only
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
     * Update how often reputation data is automatically refreshed.
     *
     * **Note:** The enterprise must have `approved` reputation settings. Updating frequency on
     * `pending` or `rejected` settings will return an error.
     *
     * **Available Frequencies:**
     * - `business_daily` — Monday–Friday
     * - `daily` — Every day including weekends
     * - `weekly` — Once per week
     * - `biweekly` — Once every two weeks
     * - `monthly` — Once per month
     * - `never` — Manual refresh only (no automatic checks)
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

        /**
         * Associate phone numbers with an enterprise for reputation monitoring and retrieve
         * reputation scores
         */
        fun numbers(): NumberServiceAsync.WithRawResponse

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
