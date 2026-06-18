// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.queues.QueueCreateParams
import com.telnyx.sdk.models.queues.QueueCreateResponse
import com.telnyx.sdk.models.queues.QueueDeleteParams
import com.telnyx.sdk.models.queues.QueueListPage
import com.telnyx.sdk.models.queues.QueueListParams
import com.telnyx.sdk.models.queues.QueueRetrieveParams
import com.telnyx.sdk.models.queues.QueueRetrieveResponse
import com.telnyx.sdk.models.queues.QueueUpdateParams
import com.telnyx.sdk.models.queues.QueueUpdateResponse
import com.telnyx.sdk.services.blocking.queues.CallService
import java.util.function.Consumer

/** Queue commands operations */
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

    /** Queue commands operations */
    fun calls(): CallService

    /** Create a new call queue. */
    fun create(params: QueueCreateParams): QueueCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: QueueCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QueueCreateResponse

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

    /** Update properties of an existing call queue. */
    fun update(queueName: String, params: QueueUpdateParams): QueueUpdateResponse =
        update(queueName, params, RequestOptions.none())

    /** @see update */
    fun update(
        queueName: String,
        params: QueueUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QueueUpdateResponse = update(params.toBuilder().queueName(queueName).build(), requestOptions)

    /** @see update */
    fun update(params: QueueUpdateParams): QueueUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: QueueUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QueueUpdateResponse

    /** List all queues for the authenticated user. */
    fun list(): QueueListPage = list(QueueListParams.none())

    /** @see list */
    fun list(
        params: QueueListParams = QueueListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QueueListPage

    /** @see list */
    fun list(params: QueueListParams = QueueListParams.none()): QueueListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): QueueListPage =
        list(QueueListParams.none(), requestOptions)

    /** Delete an existing call queue. */
    fun delete(queueName: String) = delete(queueName, QueueDeleteParams.none())

    /** @see delete */
    fun delete(
        queueName: String,
        params: QueueDeleteParams = QueueDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().queueName(queueName).build(), requestOptions)

    /** @see delete */
    fun delete(queueName: String, params: QueueDeleteParams = QueueDeleteParams.none()) =
        delete(queueName, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: QueueDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: QueueDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(queueName: String, requestOptions: RequestOptions) =
        delete(queueName, QueueDeleteParams.none(), requestOptions)

    /** A view of [QueueService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): QueueService.WithRawResponse

        /** Queue commands operations */
        fun calls(): CallService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /queues`, but is otherwise the same as
         * [QueueService.create].
         */
        @MustBeClosed
        fun create(params: QueueCreateParams): HttpResponseFor<QueueCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: QueueCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<QueueCreateResponse>

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

        /**
         * Returns a raw HTTP response for `post /queues/{queue_name}`, but is otherwise the same as
         * [QueueService.update].
         */
        @MustBeClosed
        fun update(
            queueName: String,
            params: QueueUpdateParams,
        ): HttpResponseFor<QueueUpdateResponse> = update(queueName, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            queueName: String,
            params: QueueUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<QueueUpdateResponse> =
            update(params.toBuilder().queueName(queueName).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: QueueUpdateParams): HttpResponseFor<QueueUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: QueueUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<QueueUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /queues`, but is otherwise the same as
         * [QueueService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<QueueListPage> = list(QueueListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: QueueListParams = QueueListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<QueueListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: QueueListParams = QueueListParams.none()): HttpResponseFor<QueueListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<QueueListPage> =
            list(QueueListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /queues/{queue_name}`, but is otherwise the same
         * as [QueueService.delete].
         */
        @MustBeClosed
        fun delete(queueName: String): HttpResponse = delete(queueName, QueueDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            queueName: String,
            params: QueueDeleteParams = QueueDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().queueName(queueName).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            queueName: String,
            params: QueueDeleteParams = QueueDeleteParams.none(),
        ): HttpResponse = delete(queueName, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: QueueDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: QueueDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(queueName: String, requestOptions: RequestOptions): HttpResponse =
            delete(queueName, QueueDeleteParams.none(), requestOptions)
    }
}
