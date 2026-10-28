// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.tests.schedules.v1

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.tests.schedules.v1.cronjobs.CronJobCronJobsParams
import com.telnyx.sdk.models.ai.tests.schedules.v1.cronjobs.CronJobDeleteParams
import com.telnyx.sdk.models.ai.tests.schedules.v1.cronjobs.CronJobDeleteResponse
import com.telnyx.sdk.models.ai.tests.schedules.v1.cronjobs.CronJobRetrieveCronJobsParams
import com.telnyx.sdk.models.ai.tests.schedules.v1.cronjobs.CronJobRetrieveParams
import com.telnyx.sdk.models.ai.tests.schedules.v1.cronjobs.CronJobUpdateParams
import com.telnyx.sdk.models.ai.tests.schedules.v1.cronjobs.ScheduledTestJob
import java.util.function.Consumer

/** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
interface CronJobService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CronJobService

    /** Returns the specified scheduled test job. */
    fun retrieve(id: Long): ScheduledTestJob = retrieve(id, CronJobRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: Long,
        params: CronJobRetrieveParams = CronJobRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduledTestJob = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: Long,
        params: CronJobRetrieveParams = CronJobRetrieveParams.none(),
    ): ScheduledTestJob = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CronJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduledTestJob

    /** @see retrieve */
    fun retrieve(params: CronJobRetrieveParams): ScheduledTestJob =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: Long, requestOptions: RequestOptions): ScheduledTestJob =
        retrieve(id, CronJobRetrieveParams.none(), requestOptions)

    /** Updates the specified scheduled test job. */
    fun update(id: Long): ScheduledTestJob = update(id, CronJobUpdateParams.none())

    /** @see update */
    fun update(
        id: Long,
        params: CronJobUpdateParams = CronJobUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduledTestJob = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: Long,
        params: CronJobUpdateParams = CronJobUpdateParams.none(),
    ): ScheduledTestJob = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CronJobUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduledTestJob

    /** @see update */
    fun update(params: CronJobUpdateParams): ScheduledTestJob =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: Long, requestOptions: RequestOptions): ScheduledTestJob =
        update(id, CronJobUpdateParams.none(), requestOptions)

    /** Deletes the specified scheduled test job. */
    fun delete(id: Long): CronJobDeleteResponse = delete(id, CronJobDeleteParams.none())

    /** @see delete */
    fun delete(
        id: Long,
        params: CronJobDeleteParams = CronJobDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CronJobDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: Long,
        params: CronJobDeleteParams = CronJobDeleteParams.none(),
    ): CronJobDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CronJobDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CronJobDeleteResponse

    /** @see delete */
    fun delete(params: CronJobDeleteParams): CronJobDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: Long, requestOptions: RequestOptions): CronJobDeleteResponse =
        delete(id, CronJobDeleteParams.none(), requestOptions)

    /** Creates a scheduled test job that runs the selected scenarios on a cron expression. */
    fun cronJobs(params: CronJobCronJobsParams): ScheduledTestJob =
        cronJobs(params, RequestOptions.none())

    /** @see cronJobs */
    fun cronJobs(
        params: CronJobCronJobsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduledTestJob

    /**
     * Returns the scheduled test jobs in your organization, optionally filtered by test agent. A
     * scheduled job runs selected scenarios on a cron expression.
     */
    fun retrieveCronJobs(): List<ScheduledTestJob> =
        retrieveCronJobs(CronJobRetrieveCronJobsParams.none())

    /** @see retrieveCronJobs */
    fun retrieveCronJobs(
        params: CronJobRetrieveCronJobsParams = CronJobRetrieveCronJobsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ScheduledTestJob>

    /** @see retrieveCronJobs */
    fun retrieveCronJobs(
        params: CronJobRetrieveCronJobsParams = CronJobRetrieveCronJobsParams.none()
    ): List<ScheduledTestJob> = retrieveCronJobs(params, RequestOptions.none())

    /** @see retrieveCronJobs */
    fun retrieveCronJobs(requestOptions: RequestOptions): List<ScheduledTestJob> =
        retrieveCronJobs(CronJobRetrieveCronJobsParams.none(), requestOptions)

    /** A view of [CronJobService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CronJobService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/tests/schedules/v1/cron-jobs/{id}`, but is
         * otherwise the same as [CronJobService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: Long): HttpResponseFor<ScheduledTestJob> =
            retrieve(id, CronJobRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: Long,
            params: CronJobRetrieveParams = CronJobRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduledTestJob> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: Long,
            params: CronJobRetrieveParams = CronJobRetrieveParams.none(),
        ): HttpResponseFor<ScheduledTestJob> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CronJobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduledTestJob>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CronJobRetrieveParams): HttpResponseFor<ScheduledTestJob> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: Long, requestOptions: RequestOptions): HttpResponseFor<ScheduledTestJob> =
            retrieve(id, CronJobRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /ai/tests/schedules/v1/cron-jobs/{id}`, but is
         * otherwise the same as [CronJobService.update].
         */
        @MustBeClosed
        fun update(id: Long): HttpResponseFor<ScheduledTestJob> =
            update(id, CronJobUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: Long,
            params: CronJobUpdateParams = CronJobUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduledTestJob> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: Long,
            params: CronJobUpdateParams = CronJobUpdateParams.none(),
        ): HttpResponseFor<ScheduledTestJob> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CronJobUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduledTestJob>

        /** @see update */
        @MustBeClosed
        fun update(params: CronJobUpdateParams): HttpResponseFor<ScheduledTestJob> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(id: Long, requestOptions: RequestOptions): HttpResponseFor<ScheduledTestJob> =
            update(id, CronJobUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/tests/schedules/v1/cron-jobs/{id}`, but is
         * otherwise the same as [CronJobService.delete].
         */
        @MustBeClosed
        fun delete(id: Long): HttpResponseFor<CronJobDeleteResponse> =
            delete(id, CronJobDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: Long,
            params: CronJobDeleteParams = CronJobDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CronJobDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: Long,
            params: CronJobDeleteParams = CronJobDeleteParams.none(),
        ): HttpResponseFor<CronJobDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CronJobDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CronJobDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: CronJobDeleteParams): HttpResponseFor<CronJobDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CronJobDeleteResponse> =
            delete(id, CronJobDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/tests/schedules/v1/cron-jobs`, but is otherwise
         * the same as [CronJobService.cronJobs].
         */
        @MustBeClosed
        fun cronJobs(params: CronJobCronJobsParams): HttpResponseFor<ScheduledTestJob> =
            cronJobs(params, RequestOptions.none())

        /** @see cronJobs */
        @MustBeClosed
        fun cronJobs(
            params: CronJobCronJobsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduledTestJob>

        /**
         * Returns a raw HTTP response for `get /ai/tests/schedules/v1/cron-jobs`, but is otherwise
         * the same as [CronJobService.retrieveCronJobs].
         */
        @MustBeClosed
        fun retrieveCronJobs(): HttpResponseFor<List<ScheduledTestJob>> =
            retrieveCronJobs(CronJobRetrieveCronJobsParams.none())

        /** @see retrieveCronJobs */
        @MustBeClosed
        fun retrieveCronJobs(
            params: CronJobRetrieveCronJobsParams = CronJobRetrieveCronJobsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ScheduledTestJob>>

        /** @see retrieveCronJobs */
        @MustBeClosed
        fun retrieveCronJobs(
            params: CronJobRetrieveCronJobsParams = CronJobRetrieveCronJobsParams.none()
        ): HttpResponseFor<List<ScheduledTestJob>> = retrieveCronJobs(params, RequestOptions.none())

        /** @see retrieveCronJobs */
        @MustBeClosed
        fun retrieveCronJobs(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<ScheduledTestJob>> =
            retrieveCronJobs(CronJobRetrieveCronJobsParams.none(), requestOptions)
    }
}
