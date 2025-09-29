// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.texml.accounts.transcriptions

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.texml.accounts.transcriptions.json.JsonDeleteRecordingTranscriptionSidJsonParams
import com.telnyx.sdk.models.texml.accounts.transcriptions.json.JsonRetrieveRecordingTranscriptionSidJsonParams
import com.telnyx.sdk.models.texml.accounts.transcriptions.json.JsonRetrieveRecordingTranscriptionSidJsonResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface JsonServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): JsonServiceAsync

    /** Permanently deletes a recording transcription. */
    fun deleteRecordingTranscriptionSidJson(
        recordingTranscriptionSid: String,
        params: JsonDeleteRecordingTranscriptionSidJsonParams,
    ): CompletableFuture<Void?> =
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
    ): CompletableFuture<Void?> =
        deleteRecordingTranscriptionSidJson(
            params.toBuilder().recordingTranscriptionSid(recordingTranscriptionSid).build(),
            requestOptions,
        )

    /** @see deleteRecordingTranscriptionSidJson */
    fun deleteRecordingTranscriptionSidJson(
        params: JsonDeleteRecordingTranscriptionSidJsonParams
    ): CompletableFuture<Void?> = deleteRecordingTranscriptionSidJson(params, RequestOptions.none())

    /** @see deleteRecordingTranscriptionSidJson */
    fun deleteRecordingTranscriptionSidJson(
        params: JsonDeleteRecordingTranscriptionSidJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Returns the recording transcription resource identified by its ID. */
    fun retrieveRecordingTranscriptionSidJson(
        recordingTranscriptionSid: String,
        params: JsonRetrieveRecordingTranscriptionSidJsonParams,
    ): CompletableFuture<JsonRetrieveRecordingTranscriptionSidJsonResponse> =
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
    ): CompletableFuture<JsonRetrieveRecordingTranscriptionSidJsonResponse> =
        retrieveRecordingTranscriptionSidJson(
            params.toBuilder().recordingTranscriptionSid(recordingTranscriptionSid).build(),
            requestOptions,
        )

    /** @see retrieveRecordingTranscriptionSidJson */
    fun retrieveRecordingTranscriptionSidJson(
        params: JsonRetrieveRecordingTranscriptionSidJsonParams
    ): CompletableFuture<JsonRetrieveRecordingTranscriptionSidJsonResponse> =
        retrieveRecordingTranscriptionSidJson(params, RequestOptions.none())

    /** @see retrieveRecordingTranscriptionSidJson */
    fun retrieveRecordingTranscriptionSidJson(
        params: JsonRetrieveRecordingTranscriptionSidJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JsonRetrieveRecordingTranscriptionSidJsonResponse>

    /** A view of [JsonServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): JsonServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete
         * /texml/Accounts/{account_sid}/Transcriptions/{recording_transcription_sid}.json`, but is
         * otherwise the same as [JsonServiceAsync.deleteRecordingTranscriptionSidJson].
         */
        fun deleteRecordingTranscriptionSidJson(
            recordingTranscriptionSid: String,
            params: JsonDeleteRecordingTranscriptionSidJsonParams,
        ): CompletableFuture<HttpResponse> =
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
        ): CompletableFuture<HttpResponse> =
            deleteRecordingTranscriptionSidJson(
                params.toBuilder().recordingTranscriptionSid(recordingTranscriptionSid).build(),
                requestOptions,
            )

        /** @see deleteRecordingTranscriptionSidJson */
        fun deleteRecordingTranscriptionSidJson(
            params: JsonDeleteRecordingTranscriptionSidJsonParams
        ): CompletableFuture<HttpResponse> =
            deleteRecordingTranscriptionSidJson(params, RequestOptions.none())

        /** @see deleteRecordingTranscriptionSidJson */
        fun deleteRecordingTranscriptionSidJson(
            params: JsonDeleteRecordingTranscriptionSidJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /texml/Accounts/{account_sid}/Transcriptions/{recording_transcription_sid}.json`, but is
         * otherwise the same as [JsonServiceAsync.retrieveRecordingTranscriptionSidJson].
         */
        fun retrieveRecordingTranscriptionSidJson(
            recordingTranscriptionSid: String,
            params: JsonRetrieveRecordingTranscriptionSidJsonParams,
        ): CompletableFuture<HttpResponseFor<JsonRetrieveRecordingTranscriptionSidJsonResponse>> =
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
        ): CompletableFuture<HttpResponseFor<JsonRetrieveRecordingTranscriptionSidJsonResponse>> =
            retrieveRecordingTranscriptionSidJson(
                params.toBuilder().recordingTranscriptionSid(recordingTranscriptionSid).build(),
                requestOptions,
            )

        /** @see retrieveRecordingTranscriptionSidJson */
        fun retrieveRecordingTranscriptionSidJson(
            params: JsonRetrieveRecordingTranscriptionSidJsonParams
        ): CompletableFuture<HttpResponseFor<JsonRetrieveRecordingTranscriptionSidJsonResponse>> =
            retrieveRecordingTranscriptionSidJson(params, RequestOptions.none())

        /** @see retrieveRecordingTranscriptionSidJson */
        fun retrieveRecordingTranscriptionSidJson(
            params: JsonRetrieveRecordingTranscriptionSidJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JsonRetrieveRecordingTranscriptionSidJsonResponse>>
    }
}
