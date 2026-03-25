// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.enterprises

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.enterprises.reputation.ReputationCreateParams
import com.telnyx.sdk.models.enterprises.reputation.ReputationCreateResponse
import com.telnyx.sdk.models.enterprises.reputation.ReputationDeleteAllParams
import com.telnyx.sdk.models.enterprises.reputation.ReputationListParams
import com.telnyx.sdk.models.enterprises.reputation.ReputationListResponse
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
    fun create(
        enterpriseId: String,
        params: ReputationCreateParams,
    ): CompletableFuture<ReputationCreateResponse> =
        create(enterpriseId, params, RequestOptions.none())

    /** @see create */
    fun create(
        enterpriseId: String,
        params: ReputationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReputationCreateResponse> =
        create(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see create */
    fun create(params: ReputationCreateParams): CompletableFuture<ReputationCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ReputationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReputationCreateResponse>

    /**
     * Retrieve the current Number Reputation settings for an enterprise.
     *
     * Returns the enrollment status (`pending`, `approved`, `rejected`, `deleted`), check
     * frequency, and any rejection reasons.
     *
     * Returns `404` if reputation has not been enabled for this enterprise.
     */
    fun list(enterpriseId: String): CompletableFuture<ReputationListResponse> =
        list(enterpriseId, ReputationListParams.none())

    /** @see list */
    fun list(
        enterpriseId: String,
        params: ReputationListParams = ReputationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReputationListResponse> =
        list(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see list */
    fun list(
        enterpriseId: String,
        params: ReputationListParams = ReputationListParams.none(),
    ): CompletableFuture<ReputationListResponse> = list(enterpriseId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ReputationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReputationListResponse>

    /** @see list */
    fun list(params: ReputationListParams): CompletableFuture<ReputationListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        enterpriseId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReputationListResponse> =
        list(enterpriseId, ReputationListParams.none(), requestOptions)

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
    fun deleteAll(enterpriseId: String): CompletableFuture<Void?> =
        deleteAll(enterpriseId, ReputationDeleteAllParams.none())

    /** @see deleteAll */
    fun deleteAll(
        enterpriseId: String,
        params: ReputationDeleteAllParams = ReputationDeleteAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteAll(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see deleteAll */
    fun deleteAll(
        enterpriseId: String,
        params: ReputationDeleteAllParams = ReputationDeleteAllParams.none(),
    ): CompletableFuture<Void?> = deleteAll(enterpriseId, params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        params: ReputationDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteAll */
    fun deleteAll(params: ReputationDeleteAllParams): CompletableFuture<Void?> =
        deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(enterpriseId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        deleteAll(enterpriseId, ReputationDeleteAllParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /enterprises/{enterprise_id}/reputation`, but is
         * otherwise the same as [ReputationServiceAsync.create].
         */
        fun create(
            enterpriseId: String,
            params: ReputationCreateParams,
        ): CompletableFuture<HttpResponseFor<ReputationCreateResponse>> =
            create(enterpriseId, params, RequestOptions.none())

        /** @see create */
        fun create(
            enterpriseId: String,
            params: ReputationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReputationCreateResponse>> =
            create(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see create */
        fun create(
            params: ReputationCreateParams
        ): CompletableFuture<HttpResponseFor<ReputationCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ReputationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReputationCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /enterprises/{enterprise_id}/reputation`, but is
         * otherwise the same as [ReputationServiceAsync.list].
         */
        fun list(enterpriseId: String): CompletableFuture<HttpResponseFor<ReputationListResponse>> =
            list(enterpriseId, ReputationListParams.none())

        /** @see list */
        fun list(
            enterpriseId: String,
            params: ReputationListParams = ReputationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReputationListResponse>> =
            list(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see list */
        fun list(
            enterpriseId: String,
            params: ReputationListParams = ReputationListParams.none(),
        ): CompletableFuture<HttpResponseFor<ReputationListResponse>> =
            list(enterpriseId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ReputationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReputationListResponse>>

        /** @see list */
        fun list(
            params: ReputationListParams
        ): CompletableFuture<HttpResponseFor<ReputationListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            enterpriseId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReputationListResponse>> =
            list(enterpriseId, ReputationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /enterprises/{enterprise_id}/reputation`, but is
         * otherwise the same as [ReputationServiceAsync.deleteAll].
         */
        fun deleteAll(enterpriseId: String): CompletableFuture<HttpResponse> =
            deleteAll(enterpriseId, ReputationDeleteAllParams.none())

        /** @see deleteAll */
        fun deleteAll(
            enterpriseId: String,
            params: ReputationDeleteAllParams = ReputationDeleteAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteAll(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see deleteAll */
        fun deleteAll(
            enterpriseId: String,
            params: ReputationDeleteAllParams = ReputationDeleteAllParams.none(),
        ): CompletableFuture<HttpResponse> = deleteAll(enterpriseId, params, RequestOptions.none())

        /** @see deleteAll */
        fun deleteAll(
            params: ReputationDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteAll */
        fun deleteAll(params: ReputationDeleteAllParams): CompletableFuture<HttpResponse> =
            deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        fun deleteAll(
            enterpriseId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deleteAll(enterpriseId, ReputationDeleteAllParams.none(), requestOptions)

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
