// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.legacy.reporting.batchdetailrecords

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.voice.VoiceCreateParams
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.voice.VoiceCreateResponse
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.voice.VoiceDeleteParams
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.voice.VoiceDeleteResponse
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.voice.VoiceListParams
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.voice.VoiceListResponse
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.voice.VoiceRetrieveFieldsParams
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.voice.VoiceRetrieveFieldsResponse
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.voice.VoiceRetrieveParams
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.voice.VoiceRetrieveResponse
import java.util.function.Consumer

interface VoiceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VoiceService

    /** Creates a new CDR report request with the specified filters */
    fun create(params: VoiceCreateParams): VoiceCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: VoiceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceCreateResponse

    /** Retrieves a specific CDR report request by ID */
    fun retrieve(id: String): VoiceRetrieveResponse = retrieve(id, VoiceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: VoiceRetrieveParams = VoiceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: VoiceRetrieveParams = VoiceRetrieveParams.none(),
    ): VoiceRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VoiceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: VoiceRetrieveParams): VoiceRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): VoiceRetrieveResponse =
        retrieve(id, VoiceRetrieveParams.none(), requestOptions)

    /** Retrieves all CDR report requests for the authenticated user */
    fun list(): VoiceListResponse = list(VoiceListParams.none())

    /** @see list */
    fun list(
        params: VoiceListParams = VoiceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceListResponse

    /** @see list */
    fun list(params: VoiceListParams = VoiceListParams.none()): VoiceListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): VoiceListResponse =
        list(VoiceListParams.none(), requestOptions)

    /** Deletes a specific CDR report request by ID */
    fun delete(id: String): VoiceDeleteResponse = delete(id, VoiceDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: VoiceDeleteParams = VoiceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: VoiceDeleteParams = VoiceDeleteParams.none(),
    ): VoiceDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: VoiceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceDeleteResponse

    /** @see delete */
    fun delete(params: VoiceDeleteParams): VoiceDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): VoiceDeleteResponse =
        delete(id, VoiceDeleteParams.none(), requestOptions)

    /** Retrieves all available fields that can be used in CDR reports */
    fun retrieveFields(): VoiceRetrieveFieldsResponse =
        retrieveFields(VoiceRetrieveFieldsParams.none())

    /** @see retrieveFields */
    fun retrieveFields(
        params: VoiceRetrieveFieldsParams = VoiceRetrieveFieldsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceRetrieveFieldsResponse

    /** @see retrieveFields */
    fun retrieveFields(
        params: VoiceRetrieveFieldsParams = VoiceRetrieveFieldsParams.none()
    ): VoiceRetrieveFieldsResponse = retrieveFields(params, RequestOptions.none())

    /** @see retrieveFields */
    fun retrieveFields(requestOptions: RequestOptions): VoiceRetrieveFieldsResponse =
        retrieveFields(VoiceRetrieveFieldsParams.none(), requestOptions)

    /** A view of [VoiceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): VoiceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /legacy/reporting/batch_detail_records/voice`, but
         * is otherwise the same as [VoiceService.create].
         */
        @MustBeClosed
        fun create(params: VoiceCreateParams): HttpResponseFor<VoiceCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: VoiceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceCreateResponse>

        /**
         * Returns a raw HTTP response for `get /legacy/reporting/batch_detail_records/voice/{id}`,
         * but is otherwise the same as [VoiceService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<VoiceRetrieveResponse> =
            retrieve(id, VoiceRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: VoiceRetrieveParams = VoiceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: VoiceRetrieveParams = VoiceRetrieveParams.none(),
        ): HttpResponseFor<VoiceRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: VoiceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: VoiceRetrieveParams): HttpResponseFor<VoiceRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VoiceRetrieveResponse> =
            retrieve(id, VoiceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /legacy/reporting/batch_detail_records/voice`, but
         * is otherwise the same as [VoiceService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<VoiceListResponse> = list(VoiceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: VoiceListParams = VoiceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: VoiceListParams = VoiceListParams.none()
        ): HttpResponseFor<VoiceListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<VoiceListResponse> =
            list(VoiceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /legacy/reporting/batch_detail_records/voice/{id}`, but is otherwise the same as
         * [VoiceService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<VoiceDeleteResponse> =
            delete(id, VoiceDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: VoiceDeleteParams = VoiceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: VoiceDeleteParams = VoiceDeleteParams.none(),
        ): HttpResponseFor<VoiceDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: VoiceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: VoiceDeleteParams): HttpResponseFor<VoiceDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VoiceDeleteResponse> =
            delete(id, VoiceDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /legacy/reporting/batch_detail_records/voice/fields`, but is otherwise the same as
         * [VoiceService.retrieveFields].
         */
        @MustBeClosed
        fun retrieveFields(): HttpResponseFor<VoiceRetrieveFieldsResponse> =
            retrieveFields(VoiceRetrieveFieldsParams.none())

        /** @see retrieveFields */
        @MustBeClosed
        fun retrieveFields(
            params: VoiceRetrieveFieldsParams = VoiceRetrieveFieldsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceRetrieveFieldsResponse>

        /** @see retrieveFields */
        @MustBeClosed
        fun retrieveFields(
            params: VoiceRetrieveFieldsParams = VoiceRetrieveFieldsParams.none()
        ): HttpResponseFor<VoiceRetrieveFieldsResponse> =
            retrieveFields(params, RequestOptions.none())

        /** @see retrieveFields */
        @MustBeClosed
        fun retrieveFields(
            requestOptions: RequestOptions
        ): HttpResponseFor<VoiceRetrieveFieldsResponse> =
            retrieveFields(VoiceRetrieveFieldsParams.none(), requestOptions)
    }
}
