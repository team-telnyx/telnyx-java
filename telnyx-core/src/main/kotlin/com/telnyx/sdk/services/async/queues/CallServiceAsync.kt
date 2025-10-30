// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.queues

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.queues.calls.CallListParams
import com.telnyx.sdk.models.queues.calls.CallListResponse
import com.telnyx.sdk.models.queues.calls.CallRetrieveParams
import com.telnyx.sdk.models.queues.calls.CallRetrieveResponse
import com.telnyx.sdk.models.queues.calls.CallUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CallServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallServiceAsync

    /** Retrieve an existing call from an existing queue */
    fun retrieve(
        callControlId: String,
        params: CallRetrieveParams,
    ): CompletableFuture<CallRetrieveResponse> =
        retrieve(callControlId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        callControlId: String,
        params: CallRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallRetrieveResponse> =
        retrieve(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: CallRetrieveParams): CompletableFuture<CallRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CallRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallRetrieveResponse>

    /** Update queued call's keep_after_hangup flag */
    fun update(callControlId: String, params: CallUpdateParams): CompletableFuture<Void?> =
        update(callControlId, params, RequestOptions.none())

    /** @see update */
    fun update(
        callControlId: String,
        params: CallUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        update(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see update */
    fun update(params: CallUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CallUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Retrieve the list of calls in an existing queue */
    fun list(queueName: String): CompletableFuture<CallListResponse> =
        list(queueName, CallListParams.none())

    /** @see list */
    fun list(
        queueName: String,
        params: CallListParams = CallListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallListResponse> =
        list(params.toBuilder().queueName(queueName).build(), requestOptions)

    /** @see list */
    fun list(
        queueName: String,
        params: CallListParams = CallListParams.none(),
    ): CompletableFuture<CallListResponse> = list(queueName, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CallListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallListResponse>

    /** @see list */
    fun list(params: CallListParams): CompletableFuture<CallListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        queueName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CallListResponse> = list(queueName, CallListParams.none(), requestOptions)

    /** A view of [CallServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /queues/{queue_name}/calls/{call_control_id}`, but
         * is otherwise the same as [CallServiceAsync.retrieve].
         */
        fun retrieve(
            callControlId: String,
            params: CallRetrieveParams,
        ): CompletableFuture<HttpResponseFor<CallRetrieveResponse>> =
            retrieve(callControlId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            callControlId: String,
            params: CallRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallRetrieveResponse>> =
            retrieve(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: CallRetrieveParams
        ): CompletableFuture<HttpResponseFor<CallRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CallRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `patch /queues/{queue_name}/calls/{call_control_id}`, but
         * is otherwise the same as [CallServiceAsync.update].
         */
        fun update(
            callControlId: String,
            params: CallUpdateParams,
        ): CompletableFuture<HttpResponse> = update(callControlId, params, RequestOptions.none())

        /** @see update */
        fun update(
            callControlId: String,
            params: CallUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see update */
        fun update(params: CallUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CallUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /queues/{queue_name}/calls`, but is otherwise the
         * same as [CallServiceAsync.list].
         */
        fun list(queueName: String): CompletableFuture<HttpResponseFor<CallListResponse>> =
            list(queueName, CallListParams.none())

        /** @see list */
        fun list(
            queueName: String,
            params: CallListParams = CallListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallListResponse>> =
            list(params.toBuilder().queueName(queueName).build(), requestOptions)

        /** @see list */
        fun list(
            queueName: String,
            params: CallListParams = CallListParams.none(),
        ): CompletableFuture<HttpResponseFor<CallListResponse>> =
            list(queueName, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: CallListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallListResponse>>

        /** @see list */
        fun list(params: CallListParams): CompletableFuture<HttpResponseFor<CallListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            queueName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CallListResponse>> =
            list(queueName, CallListParams.none(), requestOptions)
    }
}
