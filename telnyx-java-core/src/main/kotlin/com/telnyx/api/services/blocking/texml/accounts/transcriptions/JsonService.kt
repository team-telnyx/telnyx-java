// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.texml.accounts.transcriptions

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.texml.accounts.transcriptions.json.JsonDeleteRecordingTranscriptionSidJsonParams
import com.telnyx.api.models.texml.accounts.transcriptions.json.JsonRetrieveRecordingTranscriptionSidJsonParams
import com.telnyx.api.models.texml.accounts.transcriptions.json.JsonRetrieveRecordingTranscriptionSidJsonResponse
import java.util.function.Consumer

interface JsonService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): JsonService

    /** Permanently deletes a recording transcription. */
    fun deleteRecordingTranscriptionSidJson(
        recordingTranscriptionSid: String,
        params: JsonDeleteRecordingTranscriptionSidJsonParams,
    ) =
        deleteRecordingTranscriptionSidJson(
            recordingTranscriptionSid,
            params,
            RequestOptions.none(),
        )

    /** @see deleteRecordingTranscriptionSidJson */
    fun deleteRecordingTranscriptionSidJson(
        recordingTranscriptionSid: String,
        params: JsonDeleteRecordingTranscriptionSidJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        deleteRecordingTranscriptionSidJson(
            params.toBuilder().recordingTranscriptionSid(recordingTranscriptionSid).build(),
            requestOptions,
        )

    /** @see deleteRecordingTranscriptionSidJson */
    fun deleteRecordingTranscriptionSidJson(params: JsonDeleteRecordingTranscriptionSidJsonParams) =
        deleteRecordingTranscriptionSidJson(params, RequestOptions.none())

    /** @see deleteRecordingTranscriptionSidJson */
    fun deleteRecordingTranscriptionSidJson(
        params: JsonDeleteRecordingTranscriptionSidJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Returns the recording transcription resource identified by its ID. */
    fun retrieveRecordingTranscriptionSidJson(
        recordingTranscriptionSid: String,
        params: JsonRetrieveRecordingTranscriptionSidJsonParams,
    ): JsonRetrieveRecordingTranscriptionSidJsonResponse =
        retrieveRecordingTranscriptionSidJson(
            recordingTranscriptionSid,
            params,
            RequestOptions.none(),
        )

    /** @see retrieveRecordingTranscriptionSidJson */
    fun retrieveRecordingTranscriptionSidJson(
        recordingTranscriptionSid: String,
        params: JsonRetrieveRecordingTranscriptionSidJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JsonRetrieveRecordingTranscriptionSidJsonResponse =
        retrieveRecordingTranscriptionSidJson(
            params.toBuilder().recordingTranscriptionSid(recordingTranscriptionSid).build(),
            requestOptions,
        )

    /** @see retrieveRecordingTranscriptionSidJson */
    fun retrieveRecordingTranscriptionSidJson(
        params: JsonRetrieveRecordingTranscriptionSidJsonParams
    ): JsonRetrieveRecordingTranscriptionSidJsonResponse =
        retrieveRecordingTranscriptionSidJson(params, RequestOptions.none())

    /** @see retrieveRecordingTranscriptionSidJson */
    fun retrieveRecordingTranscriptionSidJson(
        params: JsonRetrieveRecordingTranscriptionSidJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JsonRetrieveRecordingTranscriptionSidJsonResponse

    /** A view of [JsonService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): JsonService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete
         * /texml/Accounts/{account_sid}/Transcriptions/{recording_transcription_sid}.json`, but is
         * otherwise the same as [JsonService.deleteRecordingTranscriptionSidJson].
         */
        @MustBeClosed
        fun deleteRecordingTranscriptionSidJson(
            recordingTranscriptionSid: String,
            params: JsonDeleteRecordingTranscriptionSidJsonParams,
        ): HttpResponse =
            deleteRecordingTranscriptionSidJson(
                recordingTranscriptionSid,
                params,
                RequestOptions.none(),
            )

        /** @see deleteRecordingTranscriptionSidJson */
        @MustBeClosed
        fun deleteRecordingTranscriptionSidJson(
            recordingTranscriptionSid: String,
            params: JsonDeleteRecordingTranscriptionSidJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteRecordingTranscriptionSidJson(
                params.toBuilder().recordingTranscriptionSid(recordingTranscriptionSid).build(),
                requestOptions,
            )

        /** @see deleteRecordingTranscriptionSidJson */
        @MustBeClosed
        fun deleteRecordingTranscriptionSidJson(
            params: JsonDeleteRecordingTranscriptionSidJsonParams
        ): HttpResponse = deleteRecordingTranscriptionSidJson(params, RequestOptions.none())

        /** @see deleteRecordingTranscriptionSidJson */
        @MustBeClosed
        fun deleteRecordingTranscriptionSidJson(
            params: JsonDeleteRecordingTranscriptionSidJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /texml/Accounts/{account_sid}/Transcriptions/{recording_transcription_sid}.json`, but is
         * otherwise the same as [JsonService.retrieveRecordingTranscriptionSidJson].
         */
        @MustBeClosed
        fun retrieveRecordingTranscriptionSidJson(
            recordingTranscriptionSid: String,
            params: JsonRetrieveRecordingTranscriptionSidJsonParams,
        ): HttpResponseFor<JsonRetrieveRecordingTranscriptionSidJsonResponse> =
            retrieveRecordingTranscriptionSidJson(
                recordingTranscriptionSid,
                params,
                RequestOptions.none(),
            )

        /** @see retrieveRecordingTranscriptionSidJson */
        @MustBeClosed
        fun retrieveRecordingTranscriptionSidJson(
            recordingTranscriptionSid: String,
            params: JsonRetrieveRecordingTranscriptionSidJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JsonRetrieveRecordingTranscriptionSidJsonResponse> =
            retrieveRecordingTranscriptionSidJson(
                params.toBuilder().recordingTranscriptionSid(recordingTranscriptionSid).build(),
                requestOptions,
            )

        /** @see retrieveRecordingTranscriptionSidJson */
        @MustBeClosed
        fun retrieveRecordingTranscriptionSidJson(
            params: JsonRetrieveRecordingTranscriptionSidJsonParams
        ): HttpResponseFor<JsonRetrieveRecordingTranscriptionSidJsonResponse> =
            retrieveRecordingTranscriptionSidJson(params, RequestOptions.none())

        /** @see retrieveRecordingTranscriptionSidJson */
        @MustBeClosed
        fun retrieveRecordingTranscriptionSidJson(
            params: JsonRetrieveRecordingTranscriptionSidJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JsonRetrieveRecordingTranscriptionSidJsonResponse>
    }
}
