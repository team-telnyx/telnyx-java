// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.recordingtranscriptions.RecordingTranscriptionDeleteParams
import com.telnyx.api.models.recordingtranscriptions.RecordingTranscriptionDeleteResponse
import com.telnyx.api.models.recordingtranscriptions.RecordingTranscriptionListParams
import com.telnyx.api.models.recordingtranscriptions.RecordingTranscriptionListResponse
import com.telnyx.api.models.recordingtranscriptions.RecordingTranscriptionRetrieveParams
import com.telnyx.api.models.recordingtranscriptions.RecordingTranscriptionRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RecordingTranscriptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RecordingTranscriptionServiceAsync

    /** Retrieves the details of an existing recording transcription. */
    fun retrieve(
        recordingTranscriptionId: String
    ): CompletableFuture<RecordingTranscriptionRetrieveResponse> =
        retrieve(recordingTranscriptionId, RecordingTranscriptionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        recordingTranscriptionId: String,
        params: RecordingTranscriptionRetrieveParams = RecordingTranscriptionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingTranscriptionRetrieveResponse> =
        retrieve(
            params.toBuilder().recordingTranscriptionId(recordingTranscriptionId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        recordingTranscriptionId: String,
        params: RecordingTranscriptionRetrieveParams = RecordingTranscriptionRetrieveParams.none(),
    ): CompletableFuture<RecordingTranscriptionRetrieveResponse> =
        retrieve(recordingTranscriptionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RecordingTranscriptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingTranscriptionRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: RecordingTranscriptionRetrieveParams
    ): CompletableFuture<RecordingTranscriptionRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        recordingTranscriptionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RecordingTranscriptionRetrieveResponse> =
        retrieve(
            recordingTranscriptionId,
            RecordingTranscriptionRetrieveParams.none(),
            requestOptions,
        )

    /** Returns a list of your recording transcriptions. */
    fun list(): CompletableFuture<RecordingTranscriptionListResponse> =
        list(RecordingTranscriptionListParams.none())

    /** @see list */
    fun list(
        params: RecordingTranscriptionListParams = RecordingTranscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingTranscriptionListResponse>

    /** @see list */
    fun list(
        params: RecordingTranscriptionListParams = RecordingTranscriptionListParams.none()
    ): CompletableFuture<RecordingTranscriptionListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<RecordingTranscriptionListResponse> =
        list(RecordingTranscriptionListParams.none(), requestOptions)

    /** Permanently deletes a recording transcription. */
    fun delete(
        recordingTranscriptionId: String
    ): CompletableFuture<RecordingTranscriptionDeleteResponse> =
        delete(recordingTranscriptionId, RecordingTranscriptionDeleteParams.none())

    /** @see delete */
    fun delete(
        recordingTranscriptionId: String,
        params: RecordingTranscriptionDeleteParams = RecordingTranscriptionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingTranscriptionDeleteResponse> =
        delete(
            params.toBuilder().recordingTranscriptionId(recordingTranscriptionId).build(),
            requestOptions,
        )

    /** @see delete */
    fun delete(
        recordingTranscriptionId: String,
        params: RecordingTranscriptionDeleteParams = RecordingTranscriptionDeleteParams.none(),
    ): CompletableFuture<RecordingTranscriptionDeleteResponse> =
        delete(recordingTranscriptionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RecordingTranscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingTranscriptionDeleteResponse>

    /** @see delete */
    fun delete(
        params: RecordingTranscriptionDeleteParams
    ): CompletableFuture<RecordingTranscriptionDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        recordingTranscriptionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RecordingTranscriptionDeleteResponse> =
        delete(recordingTranscriptionId, RecordingTranscriptionDeleteParams.none(), requestOptions)

    /**
     * A view of [RecordingTranscriptionServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RecordingTranscriptionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /recording_transcriptions/{recording_transcription_id}`, but is otherwise the same as
         * [RecordingTranscriptionServiceAsync.retrieve].
         */
        fun retrieve(
            recordingTranscriptionId: String
        ): CompletableFuture<HttpResponseFor<RecordingTranscriptionRetrieveResponse>> =
            retrieve(recordingTranscriptionId, RecordingTranscriptionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            recordingTranscriptionId: String,
            params: RecordingTranscriptionRetrieveParams =
                RecordingTranscriptionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingTranscriptionRetrieveResponse>> =
            retrieve(
                params.toBuilder().recordingTranscriptionId(recordingTranscriptionId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            recordingTranscriptionId: String,
            params: RecordingTranscriptionRetrieveParams =
                RecordingTranscriptionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<RecordingTranscriptionRetrieveResponse>> =
            retrieve(recordingTranscriptionId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RecordingTranscriptionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingTranscriptionRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: RecordingTranscriptionRetrieveParams
        ): CompletableFuture<HttpResponseFor<RecordingTranscriptionRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            recordingTranscriptionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RecordingTranscriptionRetrieveResponse>> =
            retrieve(
                recordingTranscriptionId,
                RecordingTranscriptionRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /recording_transcriptions`, but is otherwise the
         * same as [RecordingTranscriptionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<RecordingTranscriptionListResponse>> =
            list(RecordingTranscriptionListParams.none())

        /** @see list */
        fun list(
            params: RecordingTranscriptionListParams = RecordingTranscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingTranscriptionListResponse>>

        /** @see list */
        fun list(
            params: RecordingTranscriptionListParams = RecordingTranscriptionListParams.none()
        ): CompletableFuture<HttpResponseFor<RecordingTranscriptionListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RecordingTranscriptionListResponse>> =
            list(RecordingTranscriptionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /recording_transcriptions/{recording_transcription_id}`, but is otherwise the same as
         * [RecordingTranscriptionServiceAsync.delete].
         */
        fun delete(
            recordingTranscriptionId: String
        ): CompletableFuture<HttpResponseFor<RecordingTranscriptionDeleteResponse>> =
            delete(recordingTranscriptionId, RecordingTranscriptionDeleteParams.none())

        /** @see delete */
        fun delete(
            recordingTranscriptionId: String,
            params: RecordingTranscriptionDeleteParams = RecordingTranscriptionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingTranscriptionDeleteResponse>> =
            delete(
                params.toBuilder().recordingTranscriptionId(recordingTranscriptionId).build(),
                requestOptions,
            )

        /** @see delete */
        fun delete(
            recordingTranscriptionId: String,
            params: RecordingTranscriptionDeleteParams = RecordingTranscriptionDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<RecordingTranscriptionDeleteResponse>> =
            delete(recordingTranscriptionId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: RecordingTranscriptionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingTranscriptionDeleteResponse>>

        /** @see delete */
        fun delete(
            params: RecordingTranscriptionDeleteParams
        ): CompletableFuture<HttpResponseFor<RecordingTranscriptionDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            recordingTranscriptionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RecordingTranscriptionDeleteResponse>> =
            delete(
                recordingTranscriptionId,
                RecordingTranscriptionDeleteParams.none(),
                requestOptions,
            )
    }
}
