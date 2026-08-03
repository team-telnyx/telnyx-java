// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.emailvalidations

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emailvalidations.batch.BatchCreateParams
import com.telnyx.sdk.models.emailvalidations.batch.BatchCreateResponse
import com.telnyx.sdk.models.emailvalidations.batch.BatchRetrieveParams
import com.telnyx.sdk.models.emailvalidations.batch.BatchRetrieveResponse
import java.util.function.Consumer

/** Validate email addresses synchronously or in asynchronous batches. */
interface BatchService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService

    /** Creates an asynchronous batch validation job for up to 1,000 email addresses. */
    fun create(params: BatchCreateParams): BatchCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchCreateResponse

    /** Retrieves the current status and, once completed, validation results for a batch job. */
    fun retrieve(id: String): BatchRetrieveResponse = retrieve(id, BatchRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BatchRetrieveParams = BatchRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BatchRetrieveParams = BatchRetrieveParams.none(),
    ): BatchRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BatchRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: BatchRetrieveParams): BatchRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): BatchRetrieveResponse =
        retrieve(id, BatchRetrieveParams.none(), requestOptions)

    /** A view of [BatchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /email_validations/batch`, but is otherwise the
         * same as [BatchService.create].
         */
        @MustBeClosed
        fun create(params: BatchCreateParams): HttpResponseFor<BatchCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchCreateResponse>

        /**
         * Returns a raw HTTP response for `get /email_validations/batch/{id}`, but is otherwise the
         * same as [BatchService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<BatchRetrieveResponse> =
            retrieve(id, BatchRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BatchRetrieveParams = BatchRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BatchRetrieveParams = BatchRetrieveParams.none(),
        ): HttpResponseFor<BatchRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BatchRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: BatchRetrieveParams): HttpResponseFor<BatchRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchRetrieveResponse> =
            retrieve(id, BatchRetrieveParams.none(), requestOptions)
    }
}
