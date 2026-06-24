// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.recordings.RecordingDeleteParams
import com.telnyx.sdk.models.recordings.RecordingListPageAsync
import com.telnyx.sdk.models.recordings.RecordingListParams
import com.telnyx.sdk.models.recordings.RecordingResponse
import com.telnyx.sdk.models.recordings.RecordingRetrieveParams
import com.telnyx.sdk.services.async.recordings.ActionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Call Recordings operations. */
interface RecordingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RecordingServiceAsync

    /** Call Recordings operations. */
    fun actions(): ActionServiceAsync

    /** Retrieves the details of an existing call recording. */
    fun retrieve(recordingId: String): CompletableFuture<RecordingResponse> =
        retrieve(recordingId, RecordingRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        recordingId: String,
        params: RecordingRetrieveParams = RecordingRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingResponse> =
        retrieve(params.toBuilder().recordingId(recordingId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        recordingId: String,
        params: RecordingRetrieveParams = RecordingRetrieveParams.none(),
    ): CompletableFuture<RecordingResponse> = retrieve(recordingId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RecordingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingResponse>

    /** @see retrieve */
    fun retrieve(params: RecordingRetrieveParams): CompletableFuture<RecordingResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        recordingId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RecordingResponse> =
        retrieve(recordingId, RecordingRetrieveParams.none(), requestOptions)

    /** Returns a list of your call recordings. */
    fun list(): CompletableFuture<RecordingListPageAsync> = list(RecordingListParams.none())

    /** @see list */
    fun list(
        params: RecordingListParams = RecordingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingListPageAsync>

    /** @see list */
    fun list(
        params: RecordingListParams = RecordingListParams.none()
    ): CompletableFuture<RecordingListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<RecordingListPageAsync> =
        list(RecordingListParams.none(), requestOptions)

    /** Permanently deletes a call recording. */
    fun delete(recordingId: String): CompletableFuture<RecordingResponse> =
        delete(recordingId, RecordingDeleteParams.none())

    /** @see delete */
    fun delete(
        recordingId: String,
        params: RecordingDeleteParams = RecordingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingResponse> =
        delete(params.toBuilder().recordingId(recordingId).build(), requestOptions)

    /** @see delete */
    fun delete(
        recordingId: String,
        params: RecordingDeleteParams = RecordingDeleteParams.none(),
    ): CompletableFuture<RecordingResponse> = delete(recordingId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RecordingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingResponse>

    /** @see delete */
    fun delete(params: RecordingDeleteParams): CompletableFuture<RecordingResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        recordingId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RecordingResponse> =
        delete(recordingId, RecordingDeleteParams.none(), requestOptions)

    /**
     * A view of [RecordingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RecordingServiceAsync.WithRawResponse

        /** Call Recordings operations. */
        fun actions(): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /recordings/{recording_id}`, but is otherwise the
         * same as [RecordingServiceAsync.retrieve].
         */
        fun retrieve(recordingId: String): CompletableFuture<HttpResponseFor<RecordingResponse>> =
            retrieve(recordingId, RecordingRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            recordingId: String,
            params: RecordingRetrieveParams = RecordingRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingResponse>> =
            retrieve(params.toBuilder().recordingId(recordingId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            recordingId: String,
            params: RecordingRetrieveParams = RecordingRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<RecordingResponse>> =
            retrieve(recordingId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RecordingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingResponse>>

        /** @see retrieve */
        fun retrieve(
            params: RecordingRetrieveParams
        ): CompletableFuture<HttpResponseFor<RecordingResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            recordingId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RecordingResponse>> =
            retrieve(recordingId, RecordingRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /recordings`, but is otherwise the same as
         * [RecordingServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<RecordingListPageAsync>> =
            list(RecordingListParams.none())

        /** @see list */
        fun list(
            params: RecordingListParams = RecordingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingListPageAsync>>

        /** @see list */
        fun list(
            params: RecordingListParams = RecordingListParams.none()
        ): CompletableFuture<HttpResponseFor<RecordingListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RecordingListPageAsync>> =
            list(RecordingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /recordings/{recording_id}`, but is otherwise the
         * same as [RecordingServiceAsync.delete].
         */
        fun delete(recordingId: String): CompletableFuture<HttpResponseFor<RecordingResponse>> =
            delete(recordingId, RecordingDeleteParams.none())

        /** @see delete */
        fun delete(
            recordingId: String,
            params: RecordingDeleteParams = RecordingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingResponse>> =
            delete(params.toBuilder().recordingId(recordingId).build(), requestOptions)

        /** @see delete */
        fun delete(
            recordingId: String,
            params: RecordingDeleteParams = RecordingDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<RecordingResponse>> =
            delete(recordingId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: RecordingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingResponse>>

        /** @see delete */
        fun delete(
            params: RecordingDeleteParams
        ): CompletableFuture<HttpResponseFor<RecordingResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            recordingId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RecordingResponse>> =
            delete(recordingId, RecordingDeleteParams.none(), requestOptions)
    }
}
