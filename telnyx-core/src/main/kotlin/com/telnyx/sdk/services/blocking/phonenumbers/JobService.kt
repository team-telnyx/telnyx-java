// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.phonenumbers

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.phonenumbers.jobs.JobDeleteBatchParams
import com.telnyx.sdk.models.phonenumbers.jobs.JobDeleteBatchResponse
import com.telnyx.sdk.models.phonenumbers.jobs.JobListParams
import com.telnyx.sdk.models.phonenumbers.jobs.JobListResponse
import com.telnyx.sdk.models.phonenumbers.jobs.JobRetrieveParams
import com.telnyx.sdk.models.phonenumbers.jobs.JobRetrieveResponse
import com.telnyx.sdk.models.phonenumbers.jobs.JobUpdateBatchParams
import com.telnyx.sdk.models.phonenumbers.jobs.JobUpdateBatchResponse
import com.telnyx.sdk.models.phonenumbers.jobs.JobUpdateEmergencySettingsBatchParams
import com.telnyx.sdk.models.phonenumbers.jobs.JobUpdateEmergencySettingsBatchResponse
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

    /** Retrieve a phone numbers job */
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

    /** Lists the phone numbers jobs */
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
     * Creates a new background job to delete a batch of numbers. At most one thousand numbers can
     * be updated per API call.
     */
    fun deleteBatch(params: JobDeleteBatchParams): JobDeleteBatchResponse =
        deleteBatch(params, RequestOptions.none())

    /** @see deleteBatch */
    fun deleteBatch(
        params: JobDeleteBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JobDeleteBatchResponse

    /**
     * Creates a new background job to update a batch of numbers. At most one thousand numbers can
     * be updated per API call. At least one of the updateable fields must be submitted. IMPORTANT:
     * You must either specify filters (using the filter parameters) or specific phone numbers
     * (using the phone_numbers parameter in the request body). If you specify filters, ALL phone
     * numbers that match the given filters (up to 1000 at a time) will be updated. If you want to
     * update only specific numbers, you must use the phone_numbers parameter in the request body.
     * When using the phone_numbers parameter, ensure you follow the correct format as shown in the
     * example (either phone number IDs or phone numbers in E164 format).
     */
    fun updateBatch(params: JobUpdateBatchParams): JobUpdateBatchResponse =
        updateBatch(params, RequestOptions.none())

    /** @see updateBatch */
    fun updateBatch(
        params: JobUpdateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JobUpdateBatchResponse

    /**
     * Creates a background job to update the emergency settings of a collection of phone numbers.
     * At most one thousand numbers can be updated per API call.
     */
    fun updateEmergencySettingsBatch(
        params: JobUpdateEmergencySettingsBatchParams
    ): JobUpdateEmergencySettingsBatchResponse =
        updateEmergencySettingsBatch(params, RequestOptions.none())

    /** @see updateEmergencySettingsBatch */
    fun updateEmergencySettingsBatch(
        params: JobUpdateEmergencySettingsBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JobUpdateEmergencySettingsBatchResponse

    /** A view of [JobService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /phone_numbers/jobs/{id}`, but is otherwise the same
         * as [JobService.retrieve].
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
         * Returns a raw HTTP response for `get /phone_numbers/jobs`, but is otherwise the same as
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
         * Returns a raw HTTP response for `post /phone_numbers/jobs/delete_phone_numbers`, but is
         * otherwise the same as [JobService.deleteBatch].
         */
        @MustBeClosed
        fun deleteBatch(params: JobDeleteBatchParams): HttpResponseFor<JobDeleteBatchResponse> =
            deleteBatch(params, RequestOptions.none())

        /** @see deleteBatch */
        @MustBeClosed
        fun deleteBatch(
            params: JobDeleteBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JobDeleteBatchResponse>

        /**
         * Returns a raw HTTP response for `post /phone_numbers/jobs/update_phone_numbers`, but is
         * otherwise the same as [JobService.updateBatch].
         */
        @MustBeClosed
        fun updateBatch(params: JobUpdateBatchParams): HttpResponseFor<JobUpdateBatchResponse> =
            updateBatch(params, RequestOptions.none())

        /** @see updateBatch */
        @MustBeClosed
        fun updateBatch(
            params: JobUpdateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JobUpdateBatchResponse>

        /**
         * Returns a raw HTTP response for `post /phone_numbers/jobs/update_emergency_settings`, but
         * is otherwise the same as [JobService.updateEmergencySettingsBatch].
         */
        @MustBeClosed
        fun updateEmergencySettingsBatch(
            params: JobUpdateEmergencySettingsBatchParams
        ): HttpResponseFor<JobUpdateEmergencySettingsBatchResponse> =
            updateEmergencySettingsBatch(params, RequestOptions.none())

        /** @see updateEmergencySettingsBatch */
        @MustBeClosed
        fun updateEmergencySettingsBatch(
            params: JobUpdateEmergencySettingsBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JobUpdateEmergencySettingsBatchResponse>
    }
}
