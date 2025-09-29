// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.legacy.reporting.batchdetailrecords

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface VoiceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VoiceServiceAsync

    /** Creates a new CDR report request with the specified filters */
    fun create(params: VoiceCreateParams): CompletableFuture<VoiceCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: VoiceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceCreateResponse>

    /** Retrieves a specific CDR report request by ID */
    fun retrieve(id: String): CompletableFuture<VoiceRetrieveResponse> =
        retrieve(id, VoiceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: VoiceRetrieveParams = VoiceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: VoiceRetrieveParams = VoiceRetrieveParams.none(),
    ): CompletableFuture<VoiceRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VoiceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: VoiceRetrieveParams): CompletableFuture<VoiceRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VoiceRetrieveResponse> =
        retrieve(id, VoiceRetrieveParams.none(), requestOptions)

    /** Retrieves all CDR report requests for the authenticated user */
    fun list(): CompletableFuture<VoiceListResponse> = list(VoiceListParams.none())

    /** @see list */
    fun list(
        params: VoiceListParams = VoiceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceListResponse>

    /** @see list */
    fun list(
        params: VoiceListParams = VoiceListParams.none()
    ): CompletableFuture<VoiceListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<VoiceListResponse> =
        list(VoiceListParams.none(), requestOptions)

    /** Deletes a specific CDR report request by ID */
    fun delete(id: String): CompletableFuture<VoiceDeleteResponse> =
        delete(id, VoiceDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: VoiceDeleteParams = VoiceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: VoiceDeleteParams = VoiceDeleteParams.none(),
    ): CompletableFuture<VoiceDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: VoiceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceDeleteResponse>

    /** @see delete */
    fun delete(params: VoiceDeleteParams): CompletableFuture<VoiceDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<VoiceDeleteResponse> =
        delete(id, VoiceDeleteParams.none(), requestOptions)

    /** Retrieves all available fields that can be used in CDR reports */
    fun retrieveFields(): CompletableFuture<VoiceRetrieveFieldsResponse> =
        retrieveFields(VoiceRetrieveFieldsParams.none())

    /** @see retrieveFields */
    fun retrieveFields(
        params: VoiceRetrieveFieldsParams = VoiceRetrieveFieldsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceRetrieveFieldsResponse>

    /** @see retrieveFields */
    fun retrieveFields(
        params: VoiceRetrieveFieldsParams = VoiceRetrieveFieldsParams.none()
    ): CompletableFuture<VoiceRetrieveFieldsResponse> =
        retrieveFields(params, RequestOptions.none())

    /** @see retrieveFields */
    fun retrieveFields(
        requestOptions: RequestOptions
    ): CompletableFuture<VoiceRetrieveFieldsResponse> =
        retrieveFields(VoiceRetrieveFieldsParams.none(), requestOptions)

    /** A view of [VoiceServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VoiceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /legacy/reporting/batch_detail_records/voice`, but
         * is otherwise the same as [VoiceServiceAsync.create].
         */
        fun create(
            params: VoiceCreateParams
        ): CompletableFuture<HttpResponseFor<VoiceCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: VoiceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /legacy/reporting/batch_detail_records/voice/{id}`,
         * but is otherwise the same as [VoiceServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<VoiceRetrieveResponse>> =
            retrieve(id, VoiceRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: VoiceRetrieveParams = VoiceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: VoiceRetrieveParams = VoiceRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<VoiceRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: VoiceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: VoiceRetrieveParams
        ): CompletableFuture<HttpResponseFor<VoiceRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VoiceRetrieveResponse>> =
            retrieve(id, VoiceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /legacy/reporting/batch_detail_records/voice`, but
         * is otherwise the same as [VoiceServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<VoiceListResponse>> =
            list(VoiceListParams.none())

        /** @see list */
        fun list(
            params: VoiceListParams = VoiceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceListResponse>>

        /** @see list */
        fun list(
            params: VoiceListParams = VoiceListParams.none()
        ): CompletableFuture<HttpResponseFor<VoiceListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<VoiceListResponse>> =
            list(VoiceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /legacy/reporting/batch_detail_records/voice/{id}`, but is otherwise the same as
         * [VoiceServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<VoiceDeleteResponse>> =
            delete(id, VoiceDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: VoiceDeleteParams = VoiceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: VoiceDeleteParams = VoiceDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<VoiceDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: VoiceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceDeleteResponse>>

        /** @see delete */
        fun delete(
            params: VoiceDeleteParams
        ): CompletableFuture<HttpResponseFor<VoiceDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VoiceDeleteResponse>> =
            delete(id, VoiceDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /legacy/reporting/batch_detail_records/voice/fields`, but is otherwise the same as
         * [VoiceServiceAsync.retrieveFields].
         */
        fun retrieveFields(): CompletableFuture<HttpResponseFor<VoiceRetrieveFieldsResponse>> =
            retrieveFields(VoiceRetrieveFieldsParams.none())

        /** @see retrieveFields */
        fun retrieveFields(
            params: VoiceRetrieveFieldsParams = VoiceRetrieveFieldsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceRetrieveFieldsResponse>>

        /** @see retrieveFields */
        fun retrieveFields(
            params: VoiceRetrieveFieldsParams = VoiceRetrieveFieldsParams.none()
        ): CompletableFuture<HttpResponseFor<VoiceRetrieveFieldsResponse>> =
            retrieveFields(params, RequestOptions.none())

        /** @see retrieveFields */
        fun retrieveFields(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<VoiceRetrieveFieldsResponse>> =
            retrieveFields(VoiceRetrieveFieldsParams.none(), requestOptions)
    }
}
