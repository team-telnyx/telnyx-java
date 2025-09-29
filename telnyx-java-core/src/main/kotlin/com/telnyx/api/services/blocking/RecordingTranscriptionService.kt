// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.recordingtranscriptions.RecordingTranscriptionDeleteParams
import com.telnyx.api.models.recordingtranscriptions.RecordingTranscriptionDeleteResponse
import com.telnyx.api.models.recordingtranscriptions.RecordingTranscriptionListParams
import com.telnyx.api.models.recordingtranscriptions.RecordingTranscriptionListResponse
import com.telnyx.api.models.recordingtranscriptions.RecordingTranscriptionRetrieveParams
import com.telnyx.api.models.recordingtranscriptions.RecordingTranscriptionRetrieveResponse
import java.util.function.Consumer

interface RecordingTranscriptionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RecordingTranscriptionService

    /** Retrieves the details of an existing recording transcription. */
    fun retrieve(recordingTranscriptionId: String): RecordingTranscriptionRetrieveResponse =
        retrieve(recordingTranscriptionId, RecordingTranscriptionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        recordingTranscriptionId: String,
        params: RecordingTranscriptionRetrieveParams = RecordingTranscriptionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordingTranscriptionRetrieveResponse =
        retrieve(
            params.toBuilder().recordingTranscriptionId(recordingTranscriptionId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        recordingTranscriptionId: String,
        params: RecordingTranscriptionRetrieveParams = RecordingTranscriptionRetrieveParams.none(),
    ): RecordingTranscriptionRetrieveResponse =
        retrieve(recordingTranscriptionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RecordingTranscriptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordingTranscriptionRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: RecordingTranscriptionRetrieveParams
    ): RecordingTranscriptionRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        recordingTranscriptionId: String,
        requestOptions: RequestOptions,
    ): RecordingTranscriptionRetrieveResponse =
        retrieve(
            recordingTranscriptionId,
            RecordingTranscriptionRetrieveParams.none(),
            requestOptions,
        )

    /** Returns a list of your recording transcriptions. */
    fun list(): RecordingTranscriptionListResponse = list(RecordingTranscriptionListParams.none())

    /** @see list */
    fun list(
        params: RecordingTranscriptionListParams = RecordingTranscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordingTranscriptionListResponse

    /** @see list */
    fun list(
        params: RecordingTranscriptionListParams = RecordingTranscriptionListParams.none()
    ): RecordingTranscriptionListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): RecordingTranscriptionListResponse =
        list(RecordingTranscriptionListParams.none(), requestOptions)

    /** Permanently deletes a recording transcription. */
    fun delete(recordingTranscriptionId: String): RecordingTranscriptionDeleteResponse =
        delete(recordingTranscriptionId, RecordingTranscriptionDeleteParams.none())

    /** @see delete */
    fun delete(
        recordingTranscriptionId: String,
        params: RecordingTranscriptionDeleteParams = RecordingTranscriptionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordingTranscriptionDeleteResponse =
        delete(
            params.toBuilder().recordingTranscriptionId(recordingTranscriptionId).build(),
            requestOptions,
        )

    /** @see delete */
    fun delete(
        recordingTranscriptionId: String,
        params: RecordingTranscriptionDeleteParams = RecordingTranscriptionDeleteParams.none(),
    ): RecordingTranscriptionDeleteResponse =
        delete(recordingTranscriptionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RecordingTranscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordingTranscriptionDeleteResponse

    /** @see delete */
    fun delete(params: RecordingTranscriptionDeleteParams): RecordingTranscriptionDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        recordingTranscriptionId: String,
        requestOptions: RequestOptions,
    ): RecordingTranscriptionDeleteResponse =
        delete(recordingTranscriptionId, RecordingTranscriptionDeleteParams.none(), requestOptions)

    /**
     * A view of [RecordingTranscriptionService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RecordingTranscriptionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /recording_transcriptions/{recording_transcription_id}`, but is otherwise the same as
         * [RecordingTranscriptionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            recordingTranscriptionId: String
        ): HttpResponseFor<RecordingTranscriptionRetrieveResponse> =
            retrieve(recordingTranscriptionId, RecordingTranscriptionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            recordingTranscriptionId: String,
            params: RecordingTranscriptionRetrieveParams =
                RecordingTranscriptionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordingTranscriptionRetrieveResponse> =
            retrieve(
                params.toBuilder().recordingTranscriptionId(recordingTranscriptionId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            recordingTranscriptionId: String,
            params: RecordingTranscriptionRetrieveParams =
                RecordingTranscriptionRetrieveParams.none(),
        ): HttpResponseFor<RecordingTranscriptionRetrieveResponse> =
            retrieve(recordingTranscriptionId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RecordingTranscriptionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordingTranscriptionRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RecordingTranscriptionRetrieveParams
        ): HttpResponseFor<RecordingTranscriptionRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            recordingTranscriptionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RecordingTranscriptionRetrieveResponse> =
            retrieve(
                recordingTranscriptionId,
                RecordingTranscriptionRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /recording_transcriptions`, but is otherwise the
         * same as [RecordingTranscriptionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<RecordingTranscriptionListResponse> =
            list(RecordingTranscriptionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RecordingTranscriptionListParams = RecordingTranscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordingTranscriptionListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: RecordingTranscriptionListParams = RecordingTranscriptionListParams.none()
        ): HttpResponseFor<RecordingTranscriptionListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<RecordingTranscriptionListResponse> =
            list(RecordingTranscriptionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /recording_transcriptions/{recording_transcription_id}`, but is otherwise the same as
         * [RecordingTranscriptionService.delete].
         */
        @MustBeClosed
        fun delete(
            recordingTranscriptionId: String
        ): HttpResponseFor<RecordingTranscriptionDeleteResponse> =
            delete(recordingTranscriptionId, RecordingTranscriptionDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            recordingTranscriptionId: String,
            params: RecordingTranscriptionDeleteParams = RecordingTranscriptionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordingTranscriptionDeleteResponse> =
            delete(
                params.toBuilder().recordingTranscriptionId(recordingTranscriptionId).build(),
                requestOptions,
            )

        /** @see delete */
        @MustBeClosed
        fun delete(
            recordingTranscriptionId: String,
            params: RecordingTranscriptionDeleteParams = RecordingTranscriptionDeleteParams.none(),
        ): HttpResponseFor<RecordingTranscriptionDeleteResponse> =
            delete(recordingTranscriptionId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: RecordingTranscriptionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordingTranscriptionDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: RecordingTranscriptionDeleteParams
        ): HttpResponseFor<RecordingTranscriptionDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            recordingTranscriptionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RecordingTranscriptionDeleteResponse> =
            delete(
                recordingTranscriptionId,
                RecordingTranscriptionDeleteParams.none(),
                requestOptions,
            )
    }
}
