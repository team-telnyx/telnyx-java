// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.texml.accounts.recordings

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.texml.accounts.TexmlGetCallRecordingResponseBody
import com.telnyx.sdk.models.texml.accounts.recordings.json.JsonDeleteRecordingSidJsonParams
import com.telnyx.sdk.models.texml.accounts.recordings.json.JsonRetrieveRecordingSidJsonParams
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

    /** Deletes recording resource identified by recording id. */
    fun deleteRecordingSidJson(
        recordingSid: String,
        params: JsonDeleteRecordingSidJsonParams,
    ): CompletableFuture<Void?> =
        deleteRecordingSidJson(recordingSid, params, RequestOptions.none())

    /** @see deleteRecordingSidJson */
    fun deleteRecordingSidJson(
        recordingSid: String,
        params: JsonDeleteRecordingSidJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteRecordingSidJson(
            params.toBuilder().recordingSid(recordingSid).build(),
            requestOptions,
        )

    /** @see deleteRecordingSidJson */
    fun deleteRecordingSidJson(params: JsonDeleteRecordingSidJsonParams): CompletableFuture<Void?> =
        deleteRecordingSidJson(params, RequestOptions.none())

    /** @see deleteRecordingSidJson */
    fun deleteRecordingSidJson(
        params: JsonDeleteRecordingSidJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Returns recording resource identified by recording id. */
    fun retrieveRecordingSidJson(
        recordingSid: String,
        params: JsonRetrieveRecordingSidJsonParams,
    ): CompletableFuture<TexmlGetCallRecordingResponseBody> =
        retrieveRecordingSidJson(recordingSid, params, RequestOptions.none())

    /** @see retrieveRecordingSidJson */
    fun retrieveRecordingSidJson(
        recordingSid: String,
        params: JsonRetrieveRecordingSidJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TexmlGetCallRecordingResponseBody> =
        retrieveRecordingSidJson(
            params.toBuilder().recordingSid(recordingSid).build(),
            requestOptions,
        )

    /** @see retrieveRecordingSidJson */
    fun retrieveRecordingSidJson(
        params: JsonRetrieveRecordingSidJsonParams
    ): CompletableFuture<TexmlGetCallRecordingResponseBody> =
        retrieveRecordingSidJson(params, RequestOptions.none())

    /** @see retrieveRecordingSidJson */
    fun retrieveRecordingSidJson(
        params: JsonRetrieveRecordingSidJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TexmlGetCallRecordingResponseBody>

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
         * /texml/Accounts/{account_sid}/Recordings/{recording_sid}.json`, but is otherwise the same
         * as [JsonServiceAsync.deleteRecordingSidJson].
         */
        fun deleteRecordingSidJson(
            recordingSid: String,
            params: JsonDeleteRecordingSidJsonParams,
        ): CompletableFuture<HttpResponse> =
            deleteRecordingSidJson(recordingSid, params, RequestOptions.none())

        /** @see deleteRecordingSidJson */
        fun deleteRecordingSidJson(
            recordingSid: String,
            params: JsonDeleteRecordingSidJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteRecordingSidJson(
                params.toBuilder().recordingSid(recordingSid).build(),
                requestOptions,
            )

        /** @see deleteRecordingSidJson */
        fun deleteRecordingSidJson(
            params: JsonDeleteRecordingSidJsonParams
        ): CompletableFuture<HttpResponse> = deleteRecordingSidJson(params, RequestOptions.none())

        /** @see deleteRecordingSidJson */
        fun deleteRecordingSidJson(
            params: JsonDeleteRecordingSidJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /texml/Accounts/{account_sid}/Recordings/{recording_sid}.json`, but is otherwise the same
         * as [JsonServiceAsync.retrieveRecordingSidJson].
         */
        fun retrieveRecordingSidJson(
            recordingSid: String,
            params: JsonRetrieveRecordingSidJsonParams,
        ): CompletableFuture<HttpResponseFor<TexmlGetCallRecordingResponseBody>> =
            retrieveRecordingSidJson(recordingSid, params, RequestOptions.none())

        /** @see retrieveRecordingSidJson */
        fun retrieveRecordingSidJson(
            recordingSid: String,
            params: JsonRetrieveRecordingSidJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TexmlGetCallRecordingResponseBody>> =
            retrieveRecordingSidJson(
                params.toBuilder().recordingSid(recordingSid).build(),
                requestOptions,
            )

        /** @see retrieveRecordingSidJson */
        fun retrieveRecordingSidJson(
            params: JsonRetrieveRecordingSidJsonParams
        ): CompletableFuture<HttpResponseFor<TexmlGetCallRecordingResponseBody>> =
            retrieveRecordingSidJson(params, RequestOptions.none())

        /** @see retrieveRecordingSidJson */
        fun retrieveRecordingSidJson(
            params: JsonRetrieveRecordingSidJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TexmlGetCallRecordingResponseBody>>
    }
}
