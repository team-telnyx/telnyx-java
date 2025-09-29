// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.queues

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.queues.calls.CallListParams
import com.telnyx.api.models.queues.calls.CallListResponse
import com.telnyx.api.models.queues.calls.CallRetrieveParams
import com.telnyx.api.models.queues.calls.CallRetrieveResponse
import java.util.function.Consumer

interface CallService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallService

    /** Retrieve an existing call from an existing queue */
    fun retrieve(callControlId: String, params: CallRetrieveParams): CallRetrieveResponse =
        retrieve(callControlId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        callControlId: String,
        params: CallRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallRetrieveResponse =
        retrieve(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: CallRetrieveParams): CallRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CallRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallRetrieveResponse

    /** Retrieve the list of calls in an existing queue */
    fun list(queueName: String): CallListResponse = list(queueName, CallListParams.none())

    /** @see list */
    fun list(
        queueName: String,
        params: CallListParams = CallListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallListResponse = list(params.toBuilder().queueName(queueName).build(), requestOptions)

    /** @see list */
    fun list(queueName: String, params: CallListParams = CallListParams.none()): CallListResponse =
        list(queueName, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CallListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallListResponse

    /** @see list */
    fun list(params: CallListParams): CallListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(queueName: String, requestOptions: RequestOptions): CallListResponse =
        list(queueName, CallListParams.none(), requestOptions)

    /** A view of [CallService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /queues/{queue_name}/calls/{call_control_id}`, but
         * is otherwise the same as [CallService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            callControlId: String,
            params: CallRetrieveParams,
        ): HttpResponseFor<CallRetrieveResponse> =
            retrieve(callControlId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            callControlId: String,
            params: CallRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallRetrieveResponse> =
            retrieve(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CallRetrieveParams): HttpResponseFor<CallRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CallRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /queues/{queue_name}/calls`, but is otherwise the
         * same as [CallService.list].
         */
        @MustBeClosed
        fun list(queueName: String): HttpResponseFor<CallListResponse> =
            list(queueName, CallListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            queueName: String,
            params: CallListParams = CallListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallListResponse> =
            list(params.toBuilder().queueName(queueName).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            queueName: String,
            params: CallListParams = CallListParams.none(),
        ): HttpResponseFor<CallListResponse> = list(queueName, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CallListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: CallListParams): HttpResponseFor<CallListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            queueName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallListResponse> =
            list(queueName, CallListParams.none(), requestOptions)
    }
}
