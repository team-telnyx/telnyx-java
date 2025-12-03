// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.queues

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.queues.calls.CallListParams
import com.telnyx.sdk.models.queues.calls.CallListResponse
import com.telnyx.sdk.models.queues.calls.CallRemoveParams
import com.telnyx.sdk.models.queues.calls.CallRetrieveParams
import com.telnyx.sdk.models.queues.calls.CallRetrieveResponse
import com.telnyx.sdk.models.queues.calls.CallUpdateParams
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

    /** Update queued call's keep_after_hangup flag */
    fun update(callControlId: String, params: CallUpdateParams) =
        update(callControlId, params, RequestOptions.none())

    /** @see update */
    fun update(
        callControlId: String,
        params: CallUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see update */
    fun update(params: CallUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(params: CallUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

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

    /**
     * Removes an inactive call from a queue. If the call is no longer active, use this command to
     * remove it from the queue.
     */
    fun remove(callControlId: String, params: CallRemoveParams) =
        remove(callControlId, params, RequestOptions.none())

    /** @see remove */
    fun remove(
        callControlId: String,
        params: CallRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = remove(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see remove */
    fun remove(params: CallRemoveParams) = remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(params: CallRemoveParams, requestOptions: RequestOptions = RequestOptions.none())

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
         * Returns a raw HTTP response for `patch /queues/{queue_name}/calls/{call_control_id}`, but
         * is otherwise the same as [CallService.update].
         */
        @MustBeClosed
        fun update(callControlId: String, params: CallUpdateParams): HttpResponse =
            update(callControlId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            callControlId: String,
            params: CallUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            update(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: CallUpdateParams): HttpResponse = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CallUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

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

        /**
         * Returns a raw HTTP response for `delete /queues/{queue_name}/calls/{call_control_id}`,
         * but is otherwise the same as [CallService.remove].
         */
        @MustBeClosed
        fun remove(callControlId: String, params: CallRemoveParams): HttpResponse =
            remove(callControlId, params, RequestOptions.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            callControlId: String,
            params: CallRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            remove(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see remove */
        @MustBeClosed
        fun remove(params: CallRemoveParams): HttpResponse = remove(params, RequestOptions.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            params: CallRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
