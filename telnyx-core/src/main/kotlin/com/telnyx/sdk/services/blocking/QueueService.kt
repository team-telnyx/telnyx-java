// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.queues.QueueRetrieveParams
import com.telnyx.sdk.models.queues.QueueRetrieveResponse
import com.telnyx.sdk.services.blocking.queues.CallService
import java.util.function.Consumer

interface QueueService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): QueueService

    fun calls(): CallService

    /** Retrieve an existing call queue */
    fun retrieve(queueName: String): QueueRetrieveResponse =
        retrieve(queueName, QueueRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        queueName: String,
        params: QueueRetrieveParams = QueueRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QueueRetrieveResponse =
        retrieve(params.toBuilder().queueName(queueName).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        queueName: String,
        params: QueueRetrieveParams = QueueRetrieveParams.none(),
    ): QueueRetrieveResponse = retrieve(queueName, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: QueueRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QueueRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: QueueRetrieveParams): QueueRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(queueName: String, requestOptions: RequestOptions): QueueRetrieveResponse =
        retrieve(queueName, QueueRetrieveParams.none(), requestOptions)

    /** A view of [QueueService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): QueueService.WithRawResponse

        fun calls(): CallService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /queues/{queue_name}`, but is otherwise the same as
         * [QueueService.retrieve].
         */
        @MustBeClosed
        fun retrieve(queueName: String): HttpResponseFor<QueueRetrieveResponse> =
            retrieve(queueName, QueueRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            queueName: String,
            params: QueueRetrieveParams = QueueRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<QueueRetrieveResponse> =
            retrieve(params.toBuilder().queueName(queueName).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            queueName: String,
            params: QueueRetrieveParams = QueueRetrieveParams.none(),
        ): HttpResponseFor<QueueRetrieveResponse> =
            retrieve(queueName, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: QueueRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<QueueRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: QueueRetrieveParams): HttpResponseFor<QueueRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            queueName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<QueueRetrieveResponse> =
            retrieve(queueName, QueueRetrieveParams.none(), requestOptions)
    }
}
