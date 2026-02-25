// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.queues.QueueCreateParams
import com.telnyx.sdk.models.queues.QueueCreateResponse
import com.telnyx.sdk.models.queues.QueueDeleteParams
import com.telnyx.sdk.models.queues.QueueListPageAsync
import com.telnyx.sdk.models.queues.QueueListParams
import com.telnyx.sdk.models.queues.QueueRetrieveParams
import com.telnyx.sdk.models.queues.QueueRetrieveResponse
import com.telnyx.sdk.models.queues.QueueUpdateParams
import com.telnyx.sdk.models.queues.QueueUpdateResponse
import com.telnyx.sdk.services.async.queues.CallServiceAsync
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

    /** Create a new call queue. */
    fun create(params: QueueCreateParams): CompletableFuture<QueueCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: QueueCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<QueueCreateResponse>

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

    /** Update properties of an existing call queue. */
    fun update(
        queueName: String,
        params: QueueUpdateParams,
    ): CompletableFuture<QueueUpdateResponse> = update(queueName, params, RequestOptions.none())

    /** @see update */
    fun update(
        queueName: String,
        params: QueueUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<QueueUpdateResponse> =
        update(params.toBuilder().queueName(queueName).build(), requestOptions)

    /** @see update */
    fun update(params: QueueUpdateParams): CompletableFuture<QueueUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: QueueUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<QueueUpdateResponse>

    /** List all queues for the authenticated user. */
    fun list(): CompletableFuture<QueueListPageAsync> = list(QueueListParams.none())

    /** @see list */
    fun list(
        params: QueueListParams = QueueListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<QueueListPageAsync>

    /** @see list */
    fun list(
        params: QueueListParams = QueueListParams.none()
    ): CompletableFuture<QueueListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<QueueListPageAsync> =
        list(QueueListParams.none(), requestOptions)

    /** Delete an existing call queue. */
    fun delete(queueName: String): CompletableFuture<Void?> =
        delete(queueName, QueueDeleteParams.none())

    /** @see delete */
    fun delete(
        queueName: String,
        params: QueueDeleteParams = QueueDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().queueName(queueName).build(), requestOptions)

    /** @see delete */
    fun delete(
        queueName: String,
        params: QueueDeleteParams = QueueDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(queueName, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: QueueDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: QueueDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(queueName: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(queueName, QueueDeleteParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /queues`, but is otherwise the same as
         * [QueueServiceAsync.create].
         */
        fun create(
            params: QueueCreateParams
        ): CompletableFuture<HttpResponseFor<QueueCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: QueueCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<QueueCreateResponse>>

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

        /**
         * Returns a raw HTTP response for `post /queues/{queue_name}`, but is otherwise the same as
         * [QueueServiceAsync.update].
         */
        fun update(
            queueName: String,
            params: QueueUpdateParams,
        ): CompletableFuture<HttpResponseFor<QueueUpdateResponse>> =
            update(queueName, params, RequestOptions.none())

        /** @see update */
        fun update(
            queueName: String,
            params: QueueUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<QueueUpdateResponse>> =
            update(params.toBuilder().queueName(queueName).build(), requestOptions)

        /** @see update */
        fun update(
            params: QueueUpdateParams
        ): CompletableFuture<HttpResponseFor<QueueUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: QueueUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<QueueUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /queues`, but is otherwise the same as
         * [QueueServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<QueueListPageAsync>> =
            list(QueueListParams.none())

        /** @see list */
        fun list(
            params: QueueListParams = QueueListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<QueueListPageAsync>>

        /** @see list */
        fun list(
            params: QueueListParams = QueueListParams.none()
        ): CompletableFuture<HttpResponseFor<QueueListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<QueueListPageAsync>> =
            list(QueueListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /queues/{queue_name}`, but is otherwise the same
         * as [QueueServiceAsync.delete].
         */
        fun delete(queueName: String): CompletableFuture<HttpResponse> =
            delete(queueName, QueueDeleteParams.none())

        /** @see delete */
        fun delete(
            queueName: String,
            params: QueueDeleteParams = QueueDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().queueName(queueName).build(), requestOptions)

        /** @see delete */
        fun delete(
            queueName: String,
            params: QueueDeleteParams = QueueDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(queueName, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: QueueDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: QueueDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            queueName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(queueName, QueueDeleteParams.none(), requestOptions)
    }
}
