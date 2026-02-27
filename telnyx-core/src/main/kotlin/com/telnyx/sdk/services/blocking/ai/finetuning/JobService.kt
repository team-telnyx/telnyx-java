// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.finetuning

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.finetuning.jobs.FineTuningJob
import com.telnyx.sdk.models.ai.finetuning.jobs.JobCancelParams
import com.telnyx.sdk.models.ai.finetuning.jobs.JobCreateParams
import com.telnyx.sdk.models.ai.finetuning.jobs.JobListParams
import com.telnyx.sdk.models.ai.finetuning.jobs.JobListResponse
import com.telnyx.sdk.models.ai.finetuning.jobs.JobRetrieveParams
import java.util.function.Consumer

/** Customize LLMs for your unique needs */
interface JobService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobService

    /** Create a new fine tuning job. */
    fun create(params: JobCreateParams): FineTuningJob = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: JobCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FineTuningJob

    /** Retrieve a fine tuning job by `job_id`. */
    fun retrieve(jobId: String): FineTuningJob = retrieve(jobId, JobRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        jobId: String,
        params: JobRetrieveParams = JobRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FineTuningJob = retrieve(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        jobId: String,
        params: JobRetrieveParams = JobRetrieveParams.none(),
    ): FineTuningJob = retrieve(jobId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: JobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FineTuningJob

    /** @see retrieve */
    fun retrieve(params: JobRetrieveParams): FineTuningJob = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(jobId: String, requestOptions: RequestOptions): FineTuningJob =
        retrieve(jobId, JobRetrieveParams.none(), requestOptions)

    /** Retrieve a list of all fine tuning jobs created by the user. */
    fun list(): JobListResponse = list(JobListParams.none())

    /** @see list */
    fun list(
        params: JobListParams = JobListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JobListResponse

    /** @see list */
    fun list(params: JobListParams = JobListParams.none()): JobListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): JobListResponse =
        list(JobListParams.none(), requestOptions)

    /** Cancel a fine tuning job. */
    fun cancel(jobId: String): FineTuningJob = cancel(jobId, JobCancelParams.none())

    /** @see cancel */
    fun cancel(
        jobId: String,
        params: JobCancelParams = JobCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FineTuningJob = cancel(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see cancel */
    fun cancel(jobId: String, params: JobCancelParams = JobCancelParams.none()): FineTuningJob =
        cancel(jobId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: JobCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FineTuningJob

    /** @see cancel */
    fun cancel(params: JobCancelParams): FineTuningJob = cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(jobId: String, requestOptions: RequestOptions): FineTuningJob =
        cancel(jobId, JobCancelParams.none(), requestOptions)

    /** A view of [JobService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/fine_tuning/jobs`, but is otherwise the same as
         * [JobService.create].
         */
        @MustBeClosed
        fun create(params: JobCreateParams): HttpResponseFor<FineTuningJob> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: JobCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FineTuningJob>

        /**
         * Returns a raw HTTP response for `get /ai/fine_tuning/jobs/{job_id}`, but is otherwise the
         * same as [JobService.retrieve].
         */
        @MustBeClosed
        fun retrieve(jobId: String): HttpResponseFor<FineTuningJob> =
            retrieve(jobId, JobRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            jobId: String,
            params: JobRetrieveParams = JobRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FineTuningJob> =
            retrieve(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            jobId: String,
            params: JobRetrieveParams = JobRetrieveParams.none(),
        ): HttpResponseFor<FineTuningJob> = retrieve(jobId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: JobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FineTuningJob>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: JobRetrieveParams): HttpResponseFor<FineTuningJob> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            jobId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FineTuningJob> =
            retrieve(jobId, JobRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/fine_tuning/jobs`, but is otherwise the same as
         * [JobService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<JobListResponse> = list(JobListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: JobListParams = JobListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JobListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: JobListParams = JobListParams.none()): HttpResponseFor<JobListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<JobListResponse> =
            list(JobListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/fine_tuning/jobs/{job_id}/cancel`, but is
         * otherwise the same as [JobService.cancel].
         */
        @MustBeClosed
        fun cancel(jobId: String): HttpResponseFor<FineTuningJob> =
            cancel(jobId, JobCancelParams.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            jobId: String,
            params: JobCancelParams = JobCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FineTuningJob> =
            cancel(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            jobId: String,
            params: JobCancelParams = JobCancelParams.none(),
        ): HttpResponseFor<FineTuningJob> = cancel(jobId, params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: JobCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FineTuningJob>

        /** @see cancel */
        @MustBeClosed
        fun cancel(params: JobCancelParams): HttpResponseFor<FineTuningJob> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(jobId: String, requestOptions: RequestOptions): HttpResponseFor<FineTuningJob> =
            cancel(jobId, JobCancelParams.none(), requestOptions)
    }
}
