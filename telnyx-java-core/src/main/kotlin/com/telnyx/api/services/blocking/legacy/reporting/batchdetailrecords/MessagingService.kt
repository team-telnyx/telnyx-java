// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.legacy.reporting.batchdetailrecords

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.messaging.MessagingCreateParams
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.messaging.MessagingCreateResponse
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.messaging.MessagingDeleteParams
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.messaging.MessagingDeleteResponse
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.messaging.MessagingListParams
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.messaging.MessagingListResponse
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.messaging.MessagingRetrieveParams
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.messaging.MessagingRetrieveResponse
import java.util.function.Consumer

interface MessagingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessagingService

    /** Creates a new MDR detailed report request with the specified filters */
    fun create(params: MessagingCreateParams): MessagingCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MessagingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingCreateResponse

    /** Retrieves a specific MDR detailed report request by ID */
    fun retrieve(id: String): MessagingRetrieveResponse =
        retrieve(id, MessagingRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MessagingRetrieveParams = MessagingRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MessagingRetrieveParams = MessagingRetrieveParams.none(),
    ): MessagingRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MessagingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: MessagingRetrieveParams): MessagingRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): MessagingRetrieveResponse =
        retrieve(id, MessagingRetrieveParams.none(), requestOptions)

    /** Retrieves all MDR detailed report requests for the authenticated user */
    fun list(): MessagingListResponse = list(MessagingListParams.none())

    /** @see list */
    fun list(
        params: MessagingListParams = MessagingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingListResponse

    /** @see list */
    fun list(params: MessagingListParams = MessagingListParams.none()): MessagingListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MessagingListResponse =
        list(MessagingListParams.none(), requestOptions)

    /** Deletes a specific MDR detailed report request by ID */
    fun delete(id: String): MessagingDeleteResponse = delete(id, MessagingDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: MessagingDeleteParams = MessagingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: MessagingDeleteParams = MessagingDeleteParams.none(),
    ): MessagingDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MessagingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingDeleteResponse

    /** @see delete */
    fun delete(params: MessagingDeleteParams): MessagingDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): MessagingDeleteResponse =
        delete(id, MessagingDeleteParams.none(), requestOptions)

    /** A view of [MessagingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessagingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /legacy/reporting/batch_detail_records/messaging`,
         * but is otherwise the same as [MessagingService.create].
         */
        @MustBeClosed
        fun create(params: MessagingCreateParams): HttpResponseFor<MessagingCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: MessagingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingCreateResponse>

        /**
         * Returns a raw HTTP response for `get
         * /legacy/reporting/batch_detail_records/messaging/{id}`, but is otherwise the same as
         * [MessagingService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<MessagingRetrieveResponse> =
            retrieve(id, MessagingRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: MessagingRetrieveParams = MessagingRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: MessagingRetrieveParams = MessagingRetrieveParams.none(),
        ): HttpResponseFor<MessagingRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MessagingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: MessagingRetrieveParams): HttpResponseFor<MessagingRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingRetrieveResponse> =
            retrieve(id, MessagingRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /legacy/reporting/batch_detail_records/messaging`,
         * but is otherwise the same as [MessagingService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<MessagingListResponse> = list(MessagingListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessagingListParams = MessagingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessagingListParams = MessagingListParams.none()
        ): HttpResponseFor<MessagingListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MessagingListResponse> =
            list(MessagingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /legacy/reporting/batch_detail_records/messaging/{id}`, but is otherwise the same as
         * [MessagingService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<MessagingDeleteResponse> =
            delete(id, MessagingDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: MessagingDeleteParams = MessagingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: MessagingDeleteParams = MessagingDeleteParams.none(),
        ): HttpResponseFor<MessagingDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: MessagingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: MessagingDeleteParams): HttpResponseFor<MessagingDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingDeleteResponse> =
            delete(id, MessagingDeleteParams.none(), requestOptions)
    }
}
