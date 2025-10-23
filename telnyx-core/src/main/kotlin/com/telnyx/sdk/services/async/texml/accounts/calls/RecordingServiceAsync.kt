// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.texml.accounts.calls

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.texml.accounts.calls.recordings.RecordingRecordingSidJsonParams
import com.telnyx.sdk.models.texml.accounts.calls.recordings.RecordingRecordingSidJsonResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

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

    /** Updates recording resource for particular call. */
    fun recordingSidJson(
        recordingSid: String,
        params: RecordingRecordingSidJsonParams,
    ): CompletableFuture<RecordingRecordingSidJsonResponse> =
        recordingSidJson(recordingSid, params, RequestOptions.none())

    /** @see recordingSidJson */
    fun recordingSidJson(
        recordingSid: String,
        params: RecordingRecordingSidJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingRecordingSidJsonResponse> =
        recordingSidJson(params.toBuilder().recordingSid(recordingSid).build(), requestOptions)

    /** @see recordingSidJson */
    fun recordingSidJson(
        params: RecordingRecordingSidJsonParams
    ): CompletableFuture<RecordingRecordingSidJsonResponse> =
        recordingSidJson(params, RequestOptions.none())

    /** @see recordingSidJson */
    fun recordingSidJson(
        params: RecordingRecordingSidJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingRecordingSidJsonResponse>

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

        /**
         * Returns a raw HTTP response for `post
         * /texml/Accounts/{account_sid}/Calls/{call_sid}/Recordings/{recording_sid}.json`, but is
         * otherwise the same as [RecordingServiceAsync.recordingSidJson].
         */
        fun recordingSidJson(
            recordingSid: String,
            params: RecordingRecordingSidJsonParams,
        ): CompletableFuture<HttpResponseFor<RecordingRecordingSidJsonResponse>> =
            recordingSidJson(recordingSid, params, RequestOptions.none())

        /** @see recordingSidJson */
        fun recordingSidJson(
            recordingSid: String,
            params: RecordingRecordingSidJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingRecordingSidJsonResponse>> =
            recordingSidJson(params.toBuilder().recordingSid(recordingSid).build(), requestOptions)

        /** @see recordingSidJson */
        fun recordingSidJson(
            params: RecordingRecordingSidJsonParams
        ): CompletableFuture<HttpResponseFor<RecordingRecordingSidJsonResponse>> =
            recordingSidJson(params, RequestOptions.none())

        /** @see recordingSidJson */
        fun recordingSidJson(
            params: RecordingRecordingSidJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingRecordingSidJsonResponse>>
    }
}
