// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.customerservicerecords.CustomerServiceRecordCreateParams
import com.telnyx.sdk.models.customerservicerecords.CustomerServiceRecordCreateResponse
import com.telnyx.sdk.models.customerservicerecords.CustomerServiceRecordListPageAsync
import com.telnyx.sdk.models.customerservicerecords.CustomerServiceRecordListParams
import com.telnyx.sdk.models.customerservicerecords.CustomerServiceRecordRetrieveParams
import com.telnyx.sdk.models.customerservicerecords.CustomerServiceRecordRetrieveResponse
import com.telnyx.sdk.models.customerservicerecords.CustomerServiceRecordVerifyPhoneNumberCoverageParams
import com.telnyx.sdk.models.customerservicerecords.CustomerServiceRecordVerifyPhoneNumberCoverageResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CustomerServiceRecordServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomerServiceRecordServiceAsync

    /** Create a new customer service record for the provided phone number. */
    fun create(
        params: CustomerServiceRecordCreateParams
    ): CompletableFuture<CustomerServiceRecordCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CustomerServiceRecordCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerServiceRecordCreateResponse>

    /** Get a specific customer service record. */
    fun retrieve(
        customerServiceRecordId: String
    ): CompletableFuture<CustomerServiceRecordRetrieveResponse> =
        retrieve(customerServiceRecordId, CustomerServiceRecordRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        customerServiceRecordId: String,
        params: CustomerServiceRecordRetrieveParams = CustomerServiceRecordRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerServiceRecordRetrieveResponse> =
        retrieve(
            params.toBuilder().customerServiceRecordId(customerServiceRecordId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        customerServiceRecordId: String,
        params: CustomerServiceRecordRetrieveParams = CustomerServiceRecordRetrieveParams.none(),
    ): CompletableFuture<CustomerServiceRecordRetrieveResponse> =
        retrieve(customerServiceRecordId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CustomerServiceRecordRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerServiceRecordRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: CustomerServiceRecordRetrieveParams
    ): CompletableFuture<CustomerServiceRecordRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        customerServiceRecordId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerServiceRecordRetrieveResponse> =
        retrieve(
            customerServiceRecordId,
            CustomerServiceRecordRetrieveParams.none(),
            requestOptions,
        )

    /** List customer service records. */
    fun list(): CompletableFuture<CustomerServiceRecordListPageAsync> =
        list(CustomerServiceRecordListParams.none())

    /** @see list */
    fun list(
        params: CustomerServiceRecordListParams = CustomerServiceRecordListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerServiceRecordListPageAsync>

    /** @see list */
    fun list(
        params: CustomerServiceRecordListParams = CustomerServiceRecordListParams.none()
    ): CompletableFuture<CustomerServiceRecordListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<CustomerServiceRecordListPageAsync> =
        list(CustomerServiceRecordListParams.none(), requestOptions)

    /** Verify the coverage for a list of phone numbers. */
    fun verifyPhoneNumberCoverage(
        params: CustomerServiceRecordVerifyPhoneNumberCoverageParams
    ): CompletableFuture<CustomerServiceRecordVerifyPhoneNumberCoverageResponse> =
        verifyPhoneNumberCoverage(params, RequestOptions.none())

    /** @see verifyPhoneNumberCoverage */
    fun verifyPhoneNumberCoverage(
        params: CustomerServiceRecordVerifyPhoneNumberCoverageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerServiceRecordVerifyPhoneNumberCoverageResponse>

    /**
     * A view of [CustomerServiceRecordServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomerServiceRecordServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /customer_service_records`, but is otherwise the
         * same as [CustomerServiceRecordServiceAsync.create].
         */
        fun create(
            params: CustomerServiceRecordCreateParams
        ): CompletableFuture<HttpResponseFor<CustomerServiceRecordCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CustomerServiceRecordCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerServiceRecordCreateResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /customer_service_records/{customer_service_record_id}`, but is otherwise the same as
         * [CustomerServiceRecordServiceAsync.retrieve].
         */
        fun retrieve(
            customerServiceRecordId: String
        ): CompletableFuture<HttpResponseFor<CustomerServiceRecordRetrieveResponse>> =
            retrieve(customerServiceRecordId, CustomerServiceRecordRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            customerServiceRecordId: String,
            params: CustomerServiceRecordRetrieveParams =
                CustomerServiceRecordRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerServiceRecordRetrieveResponse>> =
            retrieve(
                params.toBuilder().customerServiceRecordId(customerServiceRecordId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            customerServiceRecordId: String,
            params: CustomerServiceRecordRetrieveParams = CustomerServiceRecordRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CustomerServiceRecordRetrieveResponse>> =
            retrieve(customerServiceRecordId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CustomerServiceRecordRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerServiceRecordRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: CustomerServiceRecordRetrieveParams
        ): CompletableFuture<HttpResponseFor<CustomerServiceRecordRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            customerServiceRecordId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerServiceRecordRetrieveResponse>> =
            retrieve(
                customerServiceRecordId,
                CustomerServiceRecordRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /customer_service_records`, but is otherwise the
         * same as [CustomerServiceRecordServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CustomerServiceRecordListPageAsync>> =
            list(CustomerServiceRecordListParams.none())

        /** @see list */
        fun list(
            params: CustomerServiceRecordListParams = CustomerServiceRecordListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerServiceRecordListPageAsync>>

        /** @see list */
        fun list(
            params: CustomerServiceRecordListParams = CustomerServiceRecordListParams.none()
        ): CompletableFuture<HttpResponseFor<CustomerServiceRecordListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CustomerServiceRecordListPageAsync>> =
            list(CustomerServiceRecordListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /customer_service_records/phone_number_coverages`,
         * but is otherwise the same as
         * [CustomerServiceRecordServiceAsync.verifyPhoneNumberCoverage].
         */
        fun verifyPhoneNumberCoverage(
            params: CustomerServiceRecordVerifyPhoneNumberCoverageParams
        ): CompletableFuture<
            HttpResponseFor<CustomerServiceRecordVerifyPhoneNumberCoverageResponse>
        > = verifyPhoneNumberCoverage(params, RequestOptions.none())

        /** @see verifyPhoneNumberCoverage */
        fun verifyPhoneNumberCoverage(
            params: CustomerServiceRecordVerifyPhoneNumberCoverageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CustomerServiceRecordVerifyPhoneNumberCoverageResponse>
        >
    }
}
