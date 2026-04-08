// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.enterprises

import com.google.errorprone.annotations.MustBeClosed
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
     * Retrieve the current Number Reputation settings for an enterprise.
     *
     * Returns the enrollment status (`pending`, `approved`, `rejected`, `deleted`), check
     * frequency, and any rejection reasons.
     *
     * Returns `404` if reputation has not been enabled for this enterprise.
     */
    fun retrieve(enterpriseId: String): ReputationRetrieveResponse =
        retrieve(enterpriseId, ReputationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        enterpriseId: String,
        params: ReputationRetrieveParams = ReputationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReputationRetrieveResponse =
        retrieve(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        enterpriseId: String,
        params: ReputationRetrieveParams = ReputationRetrieveParams.none(),
    ): ReputationRetrieveResponse = retrieve(enterpriseId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ReputationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReputationRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: ReputationRetrieveParams): ReputationRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(enterpriseId: String, requestOptions: RequestOptions): ReputationRetrieveResponse =
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
    fun disable(enterpriseId: String) = disable(enterpriseId, ReputationDisableParams.none())

    /** @see disable */
    fun disable(
        enterpriseId: String,
        params: ReputationDisableParams = ReputationDisableParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = disable(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see disable */
    fun disable(
        enterpriseId: String,
        params: ReputationDisableParams = ReputationDisableParams.none(),
    ) = disable(enterpriseId, params, RequestOptions.none())

    /** @see disable */
    fun disable(
        params: ReputationDisableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see disable */
    fun disable(params: ReputationDisableParams) = disable(params, RequestOptions.none())

    /** @see disable */
    fun disable(enterpriseId: String, requestOptions: RequestOptions) =
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
    fun enable(enterpriseId: String, params: ReputationEnableParams): ReputationEnableResponse =
        enable(enterpriseId, params, RequestOptions.none())

    /** @see enable */
    fun enable(
        enterpriseId: String,
        params: ReputationEnableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReputationEnableResponse =
        enable(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see enable */
    fun enable(params: ReputationEnableParams): ReputationEnableResponse =
        enable(params, RequestOptions.none())

    /** @see enable */
    fun enable(
        params: ReputationEnableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReputationEnableResponse

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
         * Returns a raw HTTP response for `get /enterprises/{enterprise_id}/reputation`, but is
         * otherwise the same as [ReputationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(enterpriseId: String): HttpResponseFor<ReputationRetrieveResponse> =
            retrieve(enterpriseId, ReputationRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            enterpriseId: String,
            params: ReputationRetrieveParams = ReputationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReputationRetrieveResponse> =
            retrieve(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            enterpriseId: String,
            params: ReputationRetrieveParams = ReputationRetrieveParams.none(),
        ): HttpResponseFor<ReputationRetrieveResponse> =
            retrieve(enterpriseId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ReputationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReputationRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ReputationRetrieveParams
        ): HttpResponseFor<ReputationRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            enterpriseId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReputationRetrieveResponse> =
            retrieve(enterpriseId, ReputationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /enterprises/{enterprise_id}/reputation`, but is
         * otherwise the same as [ReputationService.disable].
         */
        @MustBeClosed
        fun disable(enterpriseId: String): HttpResponse =
            disable(enterpriseId, ReputationDisableParams.none())

        /** @see disable */
        @MustBeClosed
        fun disable(
            enterpriseId: String,
            params: ReputationDisableParams = ReputationDisableParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            disable(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see disable */
        @MustBeClosed
        fun disable(
            enterpriseId: String,
            params: ReputationDisableParams = ReputationDisableParams.none(),
        ): HttpResponse = disable(enterpriseId, params, RequestOptions.none())

        /** @see disable */
        @MustBeClosed
        fun disable(
            params: ReputationDisableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see disable */
        @MustBeClosed
        fun disable(params: ReputationDisableParams): HttpResponse =
            disable(params, RequestOptions.none())

        /** @see disable */
        @MustBeClosed
        fun disable(enterpriseId: String, requestOptions: RequestOptions): HttpResponse =
            disable(enterpriseId, ReputationDisableParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /enterprises/{enterprise_id}/reputation`, but is
         * otherwise the same as [ReputationService.enable].
         */
        @MustBeClosed
        fun enable(
            enterpriseId: String,
            params: ReputationEnableParams,
        ): HttpResponseFor<ReputationEnableResponse> =
            enable(enterpriseId, params, RequestOptions.none())

        /** @see enable */
        @MustBeClosed
        fun enable(
            enterpriseId: String,
            params: ReputationEnableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReputationEnableResponse> =
            enable(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see enable */
        @MustBeClosed
        fun enable(params: ReputationEnableParams): HttpResponseFor<ReputationEnableResponse> =
            enable(params, RequestOptions.none())

        /** @see enable */
        @MustBeClosed
        fun enable(
            params: ReputationEnableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReputationEnableResponse>

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
