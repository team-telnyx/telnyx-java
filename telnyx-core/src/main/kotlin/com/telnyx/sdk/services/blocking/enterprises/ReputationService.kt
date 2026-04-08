// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.enterprises

import com.google.errorprone.annotations.MustBeClosed
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
import com.telnyx.sdk.services.blocking.enterprises.reputation.NumberService
import java.util.function.Consumer

/** Manage Number Reputation enrollment and check frequency settings for an enterprise */
interface ReputationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReputationService

    /**
     * Associate phone numbers with an enterprise for reputation monitoring and retrieve reputation
     * scores
     */
    fun numbers(): NumberService

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
    fun create(enterpriseId: String, params: ReputationCreateParams): ReputationCreateResponse =
        create(enterpriseId, params, RequestOptions.none())

    /** @see create */
    fun create(
        enterpriseId: String,
        params: ReputationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReputationCreateResponse =
        create(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see create */
    fun create(params: ReputationCreateParams): ReputationCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ReputationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReputationCreateResponse

    /**
     * Retrieve the current Number Reputation settings for an enterprise.
     *
     * Returns the enrollment status (`pending`, `approved`, `rejected`, `deleted`), check
     * frequency, and any rejection reasons.
     *
     * Returns `404` if reputation has not been enabled for this enterprise.
     */
    fun list(enterpriseId: String): ReputationListResponse =
        list(enterpriseId, ReputationListParams.none())

    /** @see list */
    fun list(
        enterpriseId: String,
        params: ReputationListParams = ReputationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReputationListResponse =
        list(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see list */
    fun list(
        enterpriseId: String,
        params: ReputationListParams = ReputationListParams.none(),
    ): ReputationListResponse = list(enterpriseId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ReputationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReputationListResponse

    /** @see list */
    fun list(params: ReputationListParams): ReputationListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(enterpriseId: String, requestOptions: RequestOptions): ReputationListResponse =
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
    fun deleteAll(enterpriseId: String) = deleteAll(enterpriseId, ReputationDeleteAllParams.none())

    /** @see deleteAll */
    fun deleteAll(
        enterpriseId: String,
        params: ReputationDeleteAllParams = ReputationDeleteAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteAll(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see deleteAll */
    fun deleteAll(
        enterpriseId: String,
        params: ReputationDeleteAllParams = ReputationDeleteAllParams.none(),
    ) = deleteAll(enterpriseId, params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        params: ReputationDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteAll */
    fun deleteAll(params: ReputationDeleteAllParams) = deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(enterpriseId: String, requestOptions: RequestOptions) =
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
    ): ReputationUpdateFrequencyResponse =
        updateFrequency(enterpriseId, params, RequestOptions.none())

    /** @see updateFrequency */
    fun updateFrequency(
        enterpriseId: String,
        params: ReputationUpdateFrequencyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReputationUpdateFrequencyResponse =
        updateFrequency(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see updateFrequency */
    fun updateFrequency(
        params: ReputationUpdateFrequencyParams
    ): ReputationUpdateFrequencyResponse = updateFrequency(params, RequestOptions.none())

    /** @see updateFrequency */
    fun updateFrequency(
        params: ReputationUpdateFrequencyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReputationUpdateFrequencyResponse

    /** A view of [ReputationService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReputationService.WithRawResponse

        /**
         * Associate phone numbers with an enterprise for reputation monitoring and retrieve
         * reputation scores
         */
        fun numbers(): NumberService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /enterprises/{enterprise_id}/reputation`, but is
         * otherwise the same as [ReputationService.create].
         */
        @MustBeClosed
        fun create(
            enterpriseId: String,
            params: ReputationCreateParams,
        ): HttpResponseFor<ReputationCreateResponse> =
            create(enterpriseId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            enterpriseId: String,
            params: ReputationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReputationCreateResponse> =
            create(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: ReputationCreateParams): HttpResponseFor<ReputationCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ReputationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReputationCreateResponse>

        /**
         * Returns a raw HTTP response for `get /enterprises/{enterprise_id}/reputation`, but is
         * otherwise the same as [ReputationService.list].
         */
        @MustBeClosed
        fun list(enterpriseId: String): HttpResponseFor<ReputationListResponse> =
            list(enterpriseId, ReputationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            enterpriseId: String,
            params: ReputationListParams = ReputationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReputationListResponse> =
            list(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            enterpriseId: String,
            params: ReputationListParams = ReputationListParams.none(),
        ): HttpResponseFor<ReputationListResponse> =
            list(enterpriseId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ReputationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReputationListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: ReputationListParams): HttpResponseFor<ReputationListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            enterpriseId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReputationListResponse> =
            list(enterpriseId, ReputationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /enterprises/{enterprise_id}/reputation`, but is
         * otherwise the same as [ReputationService.deleteAll].
         */
        @MustBeClosed
        fun deleteAll(enterpriseId: String): HttpResponse =
            deleteAll(enterpriseId, ReputationDeleteAllParams.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            enterpriseId: String,
            params: ReputationDeleteAllParams = ReputationDeleteAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteAll(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            enterpriseId: String,
            params: ReputationDeleteAllParams = ReputationDeleteAllParams.none(),
        ): HttpResponse = deleteAll(enterpriseId, params, RequestOptions.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            params: ReputationDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(params: ReputationDeleteAllParams): HttpResponse =
            deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(enterpriseId: String, requestOptions: RequestOptions): HttpResponse =
            deleteAll(enterpriseId, ReputationDeleteAllParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /enterprises/{enterprise_id}/reputation/frequency`, but is otherwise the same as
         * [ReputationService.updateFrequency].
         */
        @MustBeClosed
        fun updateFrequency(
            enterpriseId: String,
            params: ReputationUpdateFrequencyParams,
        ): HttpResponseFor<ReputationUpdateFrequencyResponse> =
            updateFrequency(enterpriseId, params, RequestOptions.none())

        /** @see updateFrequency */
        @MustBeClosed
        fun updateFrequency(
            enterpriseId: String,
            params: ReputationUpdateFrequencyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReputationUpdateFrequencyResponse> =
            updateFrequency(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see updateFrequency */
        @MustBeClosed
        fun updateFrequency(
            params: ReputationUpdateFrequencyParams
        ): HttpResponseFor<ReputationUpdateFrequencyResponse> =
            updateFrequency(params, RequestOptions.none())

        /** @see updateFrequency */
        @MustBeClosed
        fun updateFrequency(
            params: ReputationUpdateFrequencyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReputationUpdateFrequencyResponse>
    }
}
