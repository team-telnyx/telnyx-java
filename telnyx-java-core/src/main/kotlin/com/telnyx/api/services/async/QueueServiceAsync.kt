// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.queues.QueueRetrieveParams
import com.telnyx.api.models.queues.QueueRetrieveResponse
import com.telnyx.api.services.async.queues.CallServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface QueueServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): QueueServiceAsync

    fun calls(): CallServiceAsync

    /** Retrieve an existing call queue */
    fun retrieve(queueName: String): CompletableFuture<QueueRetrieveResponse> =
        retrieve(queueName, QueueRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        queueName: String,
        params: QueueRetrieveParams = QueueRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<QueueRetrieveResponse> =
        retrieve(params.toBuilder().queueName(queueName).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        queueName: String,
        params: QueueRetrieveParams = QueueRetrieveParams.none(),
    ): CompletableFuture<QueueRetrieveResponse> = retrieve(queueName, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: QueueRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<QueueRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: QueueRetrieveParams): CompletableFuture<QueueRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        queueName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<QueueRetrieveResponse> =
        retrieve(queueName, QueueRetrieveParams.none(), requestOptions)

    /** A view of [QueueServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): QueueServiceAsync.WithRawResponse

        fun calls(): CallServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /queues/{queue_name}`, but is otherwise the same as
         * [QueueServiceAsync.retrieve].
         */
        fun retrieve(queueName: String): CompletableFuture<HttpResponseFor<QueueRetrieveResponse>> =
            retrieve(queueName, QueueRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            queueName: String,
            params: QueueRetrieveParams = QueueRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<QueueRetrieveResponse>> =
            retrieve(params.toBuilder().queueName(queueName).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            queueName: String,
            params: QueueRetrieveParams = QueueRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<QueueRetrieveResponse>> =
            retrieve(queueName, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: QueueRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<QueueRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: QueueRetrieveParams
        ): CompletableFuture<HttpResponseFor<QueueRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            queueName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<QueueRetrieveResponse>> =
            retrieve(queueName, QueueRetrieveParams.none(), requestOptions)
    }
}
