// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.phonenumberblocks

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.phonenumberblocks.jobs.JobDeletePhoneNumberBlockParams
import com.telnyx.api.models.phonenumberblocks.jobs.JobDeletePhoneNumberBlockResponse
import com.telnyx.api.models.phonenumberblocks.jobs.JobListParams
import com.telnyx.api.models.phonenumberblocks.jobs.JobListResponse
import com.telnyx.api.models.phonenumberblocks.jobs.JobRetrieveParams
import com.telnyx.api.models.phonenumberblocks.jobs.JobRetrieveResponse
import java.util.function.Consumer

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

    /** Retrieves a phone number blocks job */
    fun retrieve(id: String): JobRetrieveResponse = retrieve(id, JobRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: JobRetrieveParams = JobRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JobRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: JobRetrieveParams = JobRetrieveParams.none(),
    ): JobRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: JobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JobRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: JobRetrieveParams): JobRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): JobRetrieveResponse =
        retrieve(id, JobRetrieveParams.none(), requestOptions)

    /** Lists the phone number blocks jobs */
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

    /**
     * Creates a new background job to delete all the phone numbers associated with the given block.
     * We will only consider the phone number block as deleted after all phone numbers associated
     * with it are removed, so multiple executions of this job may be necessary in case some of the
     * phone numbers present errors during the deletion process.
     */
    fun deletePhoneNumberBlock(
        params: JobDeletePhoneNumberBlockParams
    ): JobDeletePhoneNumberBlockResponse = deletePhoneNumberBlock(params, RequestOptions.none())

    /** @see deletePhoneNumberBlock */
    fun deletePhoneNumberBlock(
        params: JobDeletePhoneNumberBlockParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JobDeletePhoneNumberBlockResponse

    /** A view of [JobService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /phone_number_blocks/jobs/{id}`, but is otherwise
         * the same as [JobService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<JobRetrieveResponse> =
            retrieve(id, JobRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: JobRetrieveParams = JobRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JobRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: JobRetrieveParams = JobRetrieveParams.none(),
        ): HttpResponseFor<JobRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: JobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JobRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: JobRetrieveParams): HttpResponseFor<JobRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JobRetrieveResponse> =
            retrieve(id, JobRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /phone_number_blocks/jobs`, but is otherwise the
         * same as [JobService.list].
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
         * Returns a raw HTTP response for `post
         * /phone_number_blocks/jobs/delete_phone_number_block`, but is otherwise the same as
         * [JobService.deletePhoneNumberBlock].
         */
        @MustBeClosed
        fun deletePhoneNumberBlock(
            params: JobDeletePhoneNumberBlockParams
        ): HttpResponseFor<JobDeletePhoneNumberBlockResponse> =
            deletePhoneNumberBlock(params, RequestOptions.none())

        /** @see deletePhoneNumberBlock */
        @MustBeClosed
        fun deletePhoneNumberBlock(
            params: JobDeletePhoneNumberBlockParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JobDeletePhoneNumberBlockResponse>
    }
}
