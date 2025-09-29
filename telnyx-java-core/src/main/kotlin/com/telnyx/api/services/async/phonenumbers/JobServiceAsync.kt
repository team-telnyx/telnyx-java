// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.phonenumbers

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.phonenumbers.jobs.JobDeleteBatchParams
import com.telnyx.api.models.phonenumbers.jobs.JobDeleteBatchResponse
import com.telnyx.api.models.phonenumbers.jobs.JobListParams
import com.telnyx.api.models.phonenumbers.jobs.JobListResponse
import com.telnyx.api.models.phonenumbers.jobs.JobRetrieveParams
import com.telnyx.api.models.phonenumbers.jobs.JobRetrieveResponse
import com.telnyx.api.models.phonenumbers.jobs.JobUpdateBatchParams
import com.telnyx.api.models.phonenumbers.jobs.JobUpdateBatchResponse
import com.telnyx.api.models.phonenumbers.jobs.JobUpdateEmergencySettingsBatchParams
import com.telnyx.api.models.phonenumbers.jobs.JobUpdateEmergencySettingsBatchResponse
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

    /** Retrieve a phone numbers job */
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

    /** Lists the phone numbers jobs */
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
     * Creates a new background job to delete a batch of numbers. At most one thousand numbers can
     * be updated per API call.
     */
    fun deleteBatch(params: JobDeleteBatchParams): CompletableFuture<JobDeleteBatchResponse> =
        deleteBatch(params, RequestOptions.none())

    /** @see deleteBatch */
    fun deleteBatch(
        params: JobDeleteBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JobDeleteBatchResponse>

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
    fun updateBatch(params: JobUpdateBatchParams): CompletableFuture<JobUpdateBatchResponse> =
        updateBatch(params, RequestOptions.none())

    /** @see updateBatch */
    fun updateBatch(
        params: JobUpdateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JobUpdateBatchResponse>

    /**
     * Creates a background job to update the emergency settings of a collection of phone numbers.
     * At most one thousand numbers can be updated per API call.
     */
    fun updateEmergencySettingsBatch(
        params: JobUpdateEmergencySettingsBatchParams
    ): CompletableFuture<JobUpdateEmergencySettingsBatchResponse> =
        updateEmergencySettingsBatch(params, RequestOptions.none())

    /** @see updateEmergencySettingsBatch */
    fun updateEmergencySettingsBatch(
        params: JobUpdateEmergencySettingsBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JobUpdateEmergencySettingsBatchResponse>

    /** A view of [JobServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /phone_numbers/jobs/{id}`, but is otherwise the same
         * as [JobServiceAsync.retrieve].
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
         * Returns a raw HTTP response for `get /phone_numbers/jobs`, but is otherwise the same as
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
         * Returns a raw HTTP response for `post /phone_numbers/jobs/delete_phone_numbers`, but is
         * otherwise the same as [JobServiceAsync.deleteBatch].
         */
        fun deleteBatch(
            params: JobDeleteBatchParams
        ): CompletableFuture<HttpResponseFor<JobDeleteBatchResponse>> =
            deleteBatch(params, RequestOptions.none())

        /** @see deleteBatch */
        fun deleteBatch(
            params: JobDeleteBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JobDeleteBatchResponse>>

        /**
         * Returns a raw HTTP response for `post /phone_numbers/jobs/update_phone_numbers`, but is
         * otherwise the same as [JobServiceAsync.updateBatch].
         */
        fun updateBatch(
            params: JobUpdateBatchParams
        ): CompletableFuture<HttpResponseFor<JobUpdateBatchResponse>> =
            updateBatch(params, RequestOptions.none())

        /** @see updateBatch */
        fun updateBatch(
            params: JobUpdateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JobUpdateBatchResponse>>

        /**
         * Returns a raw HTTP response for `post /phone_numbers/jobs/update_emergency_settings`, but
         * is otherwise the same as [JobServiceAsync.updateEmergencySettingsBatch].
         */
        fun updateEmergencySettingsBatch(
            params: JobUpdateEmergencySettingsBatchParams
        ): CompletableFuture<HttpResponseFor<JobUpdateEmergencySettingsBatchResponse>> =
            updateEmergencySettingsBatch(params, RequestOptions.none())

        /** @see updateEmergencySettingsBatch */
        fun updateEmergencySettingsBatch(
            params: JobUpdateEmergencySettingsBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JobUpdateEmergencySettingsBatchResponse>>
    }
}
