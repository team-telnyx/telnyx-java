// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.customerservicerecords.CustomerServiceRecordCreateParams
import com.telnyx.sdk.models.customerservicerecords.CustomerServiceRecordCreateResponse
import com.telnyx.sdk.models.customerservicerecords.CustomerServiceRecordListParams
import com.telnyx.sdk.models.customerservicerecords.CustomerServiceRecordListResponse
import com.telnyx.sdk.models.customerservicerecords.CustomerServiceRecordRetrieveParams
import com.telnyx.sdk.models.customerservicerecords.CustomerServiceRecordRetrieveResponse
import com.telnyx.sdk.models.customerservicerecords.CustomerServiceRecordVerifyPhoneNumberCoverageParams
import com.telnyx.sdk.models.customerservicerecords.CustomerServiceRecordVerifyPhoneNumberCoverageResponse
import java.util.function.Consumer

interface CustomerServiceRecordService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomerServiceRecordService

    /** Create a new customer service record for the provided phone number. */
    fun create(params: CustomerServiceRecordCreateParams): CustomerServiceRecordCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CustomerServiceRecordCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerServiceRecordCreateResponse

    /** Get a specific customer service record. */
    fun retrieve(customerServiceRecordId: String): CustomerServiceRecordRetrieveResponse =
        retrieve(customerServiceRecordId, CustomerServiceRecordRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        customerServiceRecordId: String,
        params: CustomerServiceRecordRetrieveParams = CustomerServiceRecordRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerServiceRecordRetrieveResponse =
        retrieve(
            params.toBuilder().customerServiceRecordId(customerServiceRecordId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        customerServiceRecordId: String,
        params: CustomerServiceRecordRetrieveParams = CustomerServiceRecordRetrieveParams.none(),
    ): CustomerServiceRecordRetrieveResponse =
        retrieve(customerServiceRecordId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CustomerServiceRecordRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerServiceRecordRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: CustomerServiceRecordRetrieveParams
    ): CustomerServiceRecordRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        customerServiceRecordId: String,
        requestOptions: RequestOptions,
    ): CustomerServiceRecordRetrieveResponse =
        retrieve(
            customerServiceRecordId,
            CustomerServiceRecordRetrieveParams.none(),
            requestOptions,
        )

    /** List customer service records. */
    fun list(): CustomerServiceRecordListResponse = list(CustomerServiceRecordListParams.none())

    /** @see list */
    fun list(
        params: CustomerServiceRecordListParams = CustomerServiceRecordListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerServiceRecordListResponse

    /** @see list */
    fun list(
        params: CustomerServiceRecordListParams = CustomerServiceRecordListParams.none()
    ): CustomerServiceRecordListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CustomerServiceRecordListResponse =
        list(CustomerServiceRecordListParams.none(), requestOptions)

    /** Verify the coverage for a list of phone numbers. */
    fun verifyPhoneNumberCoverage(
        params: CustomerServiceRecordVerifyPhoneNumberCoverageParams
    ): CustomerServiceRecordVerifyPhoneNumberCoverageResponse =
        verifyPhoneNumberCoverage(params, RequestOptions.none())

    /** @see verifyPhoneNumberCoverage */
    fun verifyPhoneNumberCoverage(
        params: CustomerServiceRecordVerifyPhoneNumberCoverageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerServiceRecordVerifyPhoneNumberCoverageResponse

    /**
     * A view of [CustomerServiceRecordService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomerServiceRecordService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /customer_service_records`, but is otherwise the
         * same as [CustomerServiceRecordService.create].
         */
        @MustBeClosed
        fun create(
            params: CustomerServiceRecordCreateParams
        ): HttpResponseFor<CustomerServiceRecordCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CustomerServiceRecordCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerServiceRecordCreateResponse>

        /**
         * Returns a raw HTTP response for `get
         * /customer_service_records/{customer_service_record_id}`, but is otherwise the same as
         * [CustomerServiceRecordService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            customerServiceRecordId: String
        ): HttpResponseFor<CustomerServiceRecordRetrieveResponse> =
            retrieve(customerServiceRecordId, CustomerServiceRecordRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            customerServiceRecordId: String,
            params: CustomerServiceRecordRetrieveParams =
                CustomerServiceRecordRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerServiceRecordRetrieveResponse> =
            retrieve(
                params.toBuilder().customerServiceRecordId(customerServiceRecordId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            customerServiceRecordId: String,
            params: CustomerServiceRecordRetrieveParams = CustomerServiceRecordRetrieveParams.none(),
        ): HttpResponseFor<CustomerServiceRecordRetrieveResponse> =
            retrieve(customerServiceRecordId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CustomerServiceRecordRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerServiceRecordRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CustomerServiceRecordRetrieveParams
        ): HttpResponseFor<CustomerServiceRecordRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            customerServiceRecordId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerServiceRecordRetrieveResponse> =
            retrieve(
                customerServiceRecordId,
                CustomerServiceRecordRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /customer_service_records`, but is otherwise the
         * same as [CustomerServiceRecordService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CustomerServiceRecordListResponse> =
            list(CustomerServiceRecordListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CustomerServiceRecordListParams = CustomerServiceRecordListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerServiceRecordListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CustomerServiceRecordListParams = CustomerServiceRecordListParams.none()
        ): HttpResponseFor<CustomerServiceRecordListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<CustomerServiceRecordListResponse> =
            list(CustomerServiceRecordListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /customer_service_records/phone_number_coverages`,
         * but is otherwise the same as [CustomerServiceRecordService.verifyPhoneNumberCoverage].
         */
        @MustBeClosed
        fun verifyPhoneNumberCoverage(
            params: CustomerServiceRecordVerifyPhoneNumberCoverageParams
        ): HttpResponseFor<CustomerServiceRecordVerifyPhoneNumberCoverageResponse> =
            verifyPhoneNumberCoverage(params, RequestOptions.none())

        /** @see verifyPhoneNumberCoverage */
        @MustBeClosed
        fun verifyPhoneNumberCoverage(
            params: CustomerServiceRecordVerifyPhoneNumberCoverageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerServiceRecordVerifyPhoneNumberCoverageResponse>
    }
}
