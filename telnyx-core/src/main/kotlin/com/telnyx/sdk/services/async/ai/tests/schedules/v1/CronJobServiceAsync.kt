// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.tests.schedules.v1

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
interface CronJobServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CronJobServiceAsync

    /** Returns the specified scheduled test job. */
    fun retrieve(id: Long): CompletableFuture<ScheduledTestJob> =
        retrieve(id, CronJobRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: Long,
        params: CronJobRetrieveParams = CronJobRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledTestJob> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: Long,
        params: CronJobRetrieveParams = CronJobRetrieveParams.none(),
    ): CompletableFuture<ScheduledTestJob> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CronJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledTestJob>

    /** @see retrieve */
    fun retrieve(params: CronJobRetrieveParams): CompletableFuture<ScheduledTestJob> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: Long, requestOptions: RequestOptions): CompletableFuture<ScheduledTestJob> =
        retrieve(id, CronJobRetrieveParams.none(), requestOptions)

    /** Updates the specified scheduled test job. */
    fun update(id: Long): CompletableFuture<ScheduledTestJob> =
        update(id, CronJobUpdateParams.none())

    /** @see update */
    fun update(
        id: Long,
        params: CronJobUpdateParams = CronJobUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledTestJob> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: Long,
        params: CronJobUpdateParams = CronJobUpdateParams.none(),
    ): CompletableFuture<ScheduledTestJob> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CronJobUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledTestJob>

    /** @see update */
    fun update(params: CronJobUpdateParams): CompletableFuture<ScheduledTestJob> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: Long, requestOptions: RequestOptions): CompletableFuture<ScheduledTestJob> =
        update(id, CronJobUpdateParams.none(), requestOptions)

    /** Deletes the specified scheduled test job. */
    fun delete(id: Long): CompletableFuture<CronJobDeleteResponse> =
        delete(id, CronJobDeleteParams.none())

    /** @see delete */
    fun delete(
        id: Long,
        params: CronJobDeleteParams = CronJobDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CronJobDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: Long,
        params: CronJobDeleteParams = CronJobDeleteParams.none(),
    ): CompletableFuture<CronJobDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CronJobDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CronJobDeleteResponse>

    /** @see delete */
    fun delete(params: CronJobDeleteParams): CompletableFuture<CronJobDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: Long, requestOptions: RequestOptions): CompletableFuture<CronJobDeleteResponse> =
        delete(id, CronJobDeleteParams.none(), requestOptions)

    /** Creates a scheduled test job that runs the selected scenarios on a cron expression. */
    fun cronJobs(params: CronJobCronJobsParams): CompletableFuture<ScheduledTestJob> =
        cronJobs(params, RequestOptions.none())

    /** @see cronJobs */
    fun cronJobs(
        params: CronJobCronJobsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledTestJob>

    /**
     * Returns the scheduled test jobs in your organization, optionally filtered by test agent. A
     * scheduled job runs selected scenarios on a cron expression.
     */
    fun retrieveCronJobs(): CompletableFuture<List<ScheduledTestJob>> =
        retrieveCronJobs(CronJobRetrieveCronJobsParams.none())

    /** @see retrieveCronJobs */
    fun retrieveCronJobs(
        params: CronJobRetrieveCronJobsParams = CronJobRetrieveCronJobsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ScheduledTestJob>>

    /** @see retrieveCronJobs */
    fun retrieveCronJobs(
        params: CronJobRetrieveCronJobsParams = CronJobRetrieveCronJobsParams.none()
    ): CompletableFuture<List<ScheduledTestJob>> = retrieveCronJobs(params, RequestOptions.none())

    /** @see retrieveCronJobs */
    fun retrieveCronJobs(
        requestOptions: RequestOptions
    ): CompletableFuture<List<ScheduledTestJob>> =
        retrieveCronJobs(CronJobRetrieveCronJobsParams.none(), requestOptions)

    /**
     * A view of [CronJobServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CronJobServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/tests/schedules/v1/cron-jobs/{id}`, but is
         * otherwise the same as [CronJobServiceAsync.retrieve].
         */
        fun retrieve(id: Long): CompletableFuture<HttpResponseFor<ScheduledTestJob>> =
            retrieve(id, CronJobRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: Long,
            params: CronJobRetrieveParams = CronJobRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledTestJob>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: Long,
            params: CronJobRetrieveParams = CronJobRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledTestJob>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CronJobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledTestJob>>

        /** @see retrieve */
        fun retrieve(
            params: CronJobRetrieveParams
        ): CompletableFuture<HttpResponseFor<ScheduledTestJob>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScheduledTestJob>> =
            retrieve(id, CronJobRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /ai/tests/schedules/v1/cron-jobs/{id}`, but is
         * otherwise the same as [CronJobServiceAsync.update].
         */
        fun update(id: Long): CompletableFuture<HttpResponseFor<ScheduledTestJob>> =
            update(id, CronJobUpdateParams.none())

        /** @see update */
        fun update(
            id: Long,
            params: CronJobUpdateParams = CronJobUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledTestJob>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: Long,
            params: CronJobUpdateParams = CronJobUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledTestJob>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CronJobUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledTestJob>>

        /** @see update */
        fun update(
            params: CronJobUpdateParams
        ): CompletableFuture<HttpResponseFor<ScheduledTestJob>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScheduledTestJob>> =
            update(id, CronJobUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/tests/schedules/v1/cron-jobs/{id}`, but is
         * otherwise the same as [CronJobServiceAsync.delete].
         */
        fun delete(id: Long): CompletableFuture<HttpResponseFor<CronJobDeleteResponse>> =
            delete(id, CronJobDeleteParams.none())

        /** @see delete */
        fun delete(
            id: Long,
            params: CronJobDeleteParams = CronJobDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CronJobDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: Long,
            params: CronJobDeleteParams = CronJobDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<CronJobDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CronJobDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CronJobDeleteResponse>>

        /** @see delete */
        fun delete(
            params: CronJobDeleteParams
        ): CompletableFuture<HttpResponseFor<CronJobDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CronJobDeleteResponse>> =
            delete(id, CronJobDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/tests/schedules/v1/cron-jobs`, but is otherwise
         * the same as [CronJobServiceAsync.cronJobs].
         */
        fun cronJobs(
            params: CronJobCronJobsParams
        ): CompletableFuture<HttpResponseFor<ScheduledTestJob>> =
            cronJobs(params, RequestOptions.none())

        /** @see cronJobs */
        fun cronJobs(
            params: CronJobCronJobsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledTestJob>>

        /**
         * Returns a raw HTTP response for `get /ai/tests/schedules/v1/cron-jobs`, but is otherwise
         * the same as [CronJobServiceAsync.retrieveCronJobs].
         */
        fun retrieveCronJobs(): CompletableFuture<HttpResponseFor<List<ScheduledTestJob>>> =
            retrieveCronJobs(CronJobRetrieveCronJobsParams.none())

        /** @see retrieveCronJobs */
        fun retrieveCronJobs(
            params: CronJobRetrieveCronJobsParams = CronJobRetrieveCronJobsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ScheduledTestJob>>>

        /** @see retrieveCronJobs */
        fun retrieveCronJobs(
            params: CronJobRetrieveCronJobsParams = CronJobRetrieveCronJobsParams.none()
        ): CompletableFuture<HttpResponseFor<List<ScheduledTestJob>>> =
            retrieveCronJobs(params, RequestOptions.none())

        /** @see retrieveCronJobs */
        fun retrieveCronJobs(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<ScheduledTestJob>>> =
            retrieveCronJobs(CronJobRetrieveCronJobsParams.none(), requestOptions)
    }
}
