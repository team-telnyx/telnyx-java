// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.phonenumberblocks

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.phonenumberblocks.jobs.JobDeletePhoneNumberBlockParams
import com.telnyx.sdk.models.phonenumberblocks.jobs.JobDeletePhoneNumberBlockResponse
import com.telnyx.sdk.models.phonenumberblocks.jobs.JobListParams
import com.telnyx.sdk.models.phonenumberblocks.jobs.JobListResponse
import com.telnyx.sdk.models.phonenumberblocks.jobs.JobRetrieveParams
import com.telnyx.sdk.models.phonenumberblocks.jobs.JobRetrieveResponse
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

    /** Retrieves a phone number blocks job */
    fun retrieve(id: String): CompletableFuture<JobRetrieveResponse> =
        retrieve(id, JobRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: JobRetrieveParams = JobRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JobRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: JobRetrieveParams = JobRetrieveParams.none(),
    ): CompletableFuture<JobRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: JobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JobRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: JobRetrieveParams): CompletableFuture<JobRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<JobRetrieveResponse> =
        retrieve(id, JobRetrieveParams.none(), requestOptions)

    /** Lists the phone number blocks jobs */
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

    /**
     * Creates a new background job to delete all the phone numbers associated with the given block.
     * We will only consider the phone number block as deleted after all phone numbers associated
     * with it are removed, so multiple executions of this job may be necessary in case some of the
     * phone numbers present errors during the deletion process.
     */
    fun deletePhoneNumberBlock(
        params: JobDeletePhoneNumberBlockParams
    ): CompletableFuture<JobDeletePhoneNumberBlockResponse> =
        deletePhoneNumberBlock(params, RequestOptions.none())

    /** @see deletePhoneNumberBlock */
    fun deletePhoneNumberBlock(
        params: JobDeletePhoneNumberBlockParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JobDeletePhoneNumberBlockResponse>

    /** A view of [JobServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /phone_number_blocks/jobs/{id}`, but is otherwise
         * the same as [JobServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<JobRetrieveResponse>> =
            retrieve(id, JobRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: JobRetrieveParams = JobRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JobRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: JobRetrieveParams = JobRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<JobRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: JobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JobRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: JobRetrieveParams
        ): CompletableFuture<HttpResponseFor<JobRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<JobRetrieveResponse>> =
            retrieve(id, JobRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /phone_number_blocks/jobs`, but is otherwise the
         * same as [JobServiceAsync.list].
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
         * Returns a raw HTTP response for `post
         * /phone_number_blocks/jobs/delete_phone_number_block`, but is otherwise the same as
         * [JobServiceAsync.deletePhoneNumberBlock].
         */
        fun deletePhoneNumberBlock(
            params: JobDeletePhoneNumberBlockParams
        ): CompletableFuture<HttpResponseFor<JobDeletePhoneNumberBlockResponse>> =
            deletePhoneNumberBlock(params, RequestOptions.none())

        /** @see deletePhoneNumberBlock */
        fun deletePhoneNumberBlock(
            params: JobDeletePhoneNumberBlockParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JobDeletePhoneNumberBlockResponse>>
    }
}
