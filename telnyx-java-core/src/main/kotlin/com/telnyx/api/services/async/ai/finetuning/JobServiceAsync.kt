// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.ai.finetuning

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.ai.finetuning.jobs.FineTuningJob
import com.telnyx.api.models.ai.finetuning.jobs.JobCancelParams
import com.telnyx.api.models.ai.finetuning.jobs.JobCreateParams
import com.telnyx.api.models.ai.finetuning.jobs.JobListParams
import com.telnyx.api.models.ai.finetuning.jobs.JobListResponse
import com.telnyx.api.models.ai.finetuning.jobs.JobRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface JobServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobServiceAsync

    /** Create a new fine tuning job. */
    fun create(params: JobCreateParams): CompletableFuture<FineTuningJob> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: JobCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FineTuningJob>

    /** Retrieve a fine tuning job by `job_id`. */
    fun retrieve(jobId: String): CompletableFuture<FineTuningJob> =
        retrieve(jobId, JobRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        jobId: String,
        params: JobRetrieveParams = JobRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FineTuningJob> =
        retrieve(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        jobId: String,
        params: JobRetrieveParams = JobRetrieveParams.none(),
    ): CompletableFuture<FineTuningJob> = retrieve(jobId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: JobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FineTuningJob>

    /** @see retrieve */
    fun retrieve(params: JobRetrieveParams): CompletableFuture<FineTuningJob> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(jobId: String, requestOptions: RequestOptions): CompletableFuture<FineTuningJob> =
        retrieve(jobId, JobRetrieveParams.none(), requestOptions)

    /** Retrieve a list of all fine tuning jobs created by the user. */
    fun list(): CompletableFuture<JobListResponse> = list(JobListParams.none())

    /** @see list */
    fun list(
        params: JobListParams = JobListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JobListResponse>

    /** @see list */
    fun list(params: JobListParams = JobListParams.none()): CompletableFuture<JobListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<JobListResponse> =
        list(JobListParams.none(), requestOptions)

    /** Cancel a fine tuning job. */
    fun cancel(jobId: String): CompletableFuture<FineTuningJob> =
        cancel(jobId, JobCancelParams.none())

    /** @see cancel */
    fun cancel(
        jobId: String,
        params: JobCancelParams = JobCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FineTuningJob> =
        cancel(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        jobId: String,
        params: JobCancelParams = JobCancelParams.none(),
    ): CompletableFuture<FineTuningJob> = cancel(jobId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: JobCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FineTuningJob>

    /** @see cancel */
    fun cancel(params: JobCancelParams): CompletableFuture<FineTuningJob> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(jobId: String, requestOptions: RequestOptions): CompletableFuture<FineTuningJob> =
        cancel(jobId, JobCancelParams.none(), requestOptions)

    /** A view of [JobServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/fine_tuning/jobs`, but is otherwise the same as
         * [JobServiceAsync.create].
         */
        fun create(params: JobCreateParams): CompletableFuture<HttpResponseFor<FineTuningJob>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: JobCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FineTuningJob>>

        /**
         * Returns a raw HTTP response for `get /ai/fine_tuning/jobs/{job_id}`, but is otherwise the
         * same as [JobServiceAsync.retrieve].
         */
        fun retrieve(jobId: String): CompletableFuture<HttpResponseFor<FineTuningJob>> =
            retrieve(jobId, JobRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            jobId: String,
            params: JobRetrieveParams = JobRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FineTuningJob>> =
            retrieve(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            jobId: String,
            params: JobRetrieveParams = JobRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<FineTuningJob>> =
            retrieve(jobId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: JobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FineTuningJob>>

        /** @see retrieve */
        fun retrieve(params: JobRetrieveParams): CompletableFuture<HttpResponseFor<FineTuningJob>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            jobId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FineTuningJob>> =
            retrieve(jobId, JobRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/fine_tuning/jobs`, but is otherwise the same as
         * [JobServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<JobListResponse>> = list(JobListParams.none())

        /** @see list */
        fun list(
            params: JobListParams = JobListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JobListResponse>>

        /** @see list */
        fun list(
            params: JobListParams = JobListParams.none()
        ): CompletableFuture<HttpResponseFor<JobListResponse>> = list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<JobListResponse>> =
            list(JobListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/fine_tuning/jobs/{job_id}/cancel`, but is
         * otherwise the same as [JobServiceAsync.cancel].
         */
        fun cancel(jobId: String): CompletableFuture<HttpResponseFor<FineTuningJob>> =
            cancel(jobId, JobCancelParams.none())

        /** @see cancel */
        fun cancel(
            jobId: String,
            params: JobCancelParams = JobCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FineTuningJob>> =
            cancel(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see cancel */
        fun cancel(
            jobId: String,
            params: JobCancelParams = JobCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<FineTuningJob>> =
            cancel(jobId, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: JobCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FineTuningJob>>

        /** @see cancel */
        fun cancel(params: JobCancelParams): CompletableFuture<HttpResponseFor<FineTuningJob>> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            jobId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FineTuningJob>> =
            cancel(jobId, JobCancelParams.none(), requestOptions)
    }
}
