// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.texml.accounts.calls

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.texml.accounts.calls.recordingsjson.RecordingsJsonRecordingsJsonParams
import com.telnyx.sdk.models.texml.accounts.calls.recordingsjson.RecordingsJsonRecordingsJsonResponse
import com.telnyx.sdk.models.texml.accounts.calls.recordingsjson.RecordingsJsonRetrieveRecordingsJsonParams
import com.telnyx.sdk.models.texml.accounts.calls.recordingsjson.RecordingsJsonRetrieveRecordingsJsonResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** TeXML REST Commands */
interface RecordingsJsonServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RecordingsJsonServiceAsync

    /** Starts recording with specified parameters for call idientified by call_sid. */
    fun recordingsJson(
        callSid: String,
        params: RecordingsJsonRecordingsJsonParams,
    ): CompletableFuture<RecordingsJsonRecordingsJsonResponse> =
        recordingsJson(callSid, params, RequestOptions.none())

    /** @see recordingsJson */
    fun recordingsJson(
        callSid: String,
        params: RecordingsJsonRecordingsJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingsJsonRecordingsJsonResponse> =
        recordingsJson(params.toBuilder().callSid(callSid).build(), requestOptions)

    /** @see recordingsJson */
    fun recordingsJson(
        params: RecordingsJsonRecordingsJsonParams
    ): CompletableFuture<RecordingsJsonRecordingsJsonResponse> =
        recordingsJson(params, RequestOptions.none())

    /** @see recordingsJson */
    fun recordingsJson(
        params: RecordingsJsonRecordingsJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingsJsonRecordingsJsonResponse>

    /** Returns recordings for a call identified by call_sid. */
    fun retrieveRecordingsJson(
        callSid: String,
        params: RecordingsJsonRetrieveRecordingsJsonParams,
    ): CompletableFuture<RecordingsJsonRetrieveRecordingsJsonResponse> =
        retrieveRecordingsJson(callSid, params, RequestOptions.none())

    /** @see retrieveRecordingsJson */
    fun retrieveRecordingsJson(
        callSid: String,
        params: RecordingsJsonRetrieveRecordingsJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingsJsonRetrieveRecordingsJsonResponse> =
        retrieveRecordingsJson(params.toBuilder().callSid(callSid).build(), requestOptions)

    /** @see retrieveRecordingsJson */
    fun retrieveRecordingsJson(
        params: RecordingsJsonRetrieveRecordingsJsonParams
    ): CompletableFuture<RecordingsJsonRetrieveRecordingsJsonResponse> =
        retrieveRecordingsJson(params, RequestOptions.none())

    /** @see retrieveRecordingsJson */
    fun retrieveRecordingsJson(
        params: RecordingsJsonRetrieveRecordingsJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingsJsonRetrieveRecordingsJsonResponse>

    /**
     * A view of [RecordingsJsonServiceAsync] that provides access to raw HTTP responses for each
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
        ): RecordingsJsonServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /texml/Accounts/{account_sid}/Calls/{call_sid}/Recordings.json`, but is otherwise the
         * same as [RecordingsJsonServiceAsync.recordingsJson].
         */
        fun recordingsJson(
            callSid: String,
            params: RecordingsJsonRecordingsJsonParams,
        ): CompletableFuture<HttpResponseFor<RecordingsJsonRecordingsJsonResponse>> =
            recordingsJson(callSid, params, RequestOptions.none())

        /** @see recordingsJson */
        fun recordingsJson(
            callSid: String,
            params: RecordingsJsonRecordingsJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingsJsonRecordingsJsonResponse>> =
            recordingsJson(params.toBuilder().callSid(callSid).build(), requestOptions)

        /** @see recordingsJson */
        fun recordingsJson(
            params: RecordingsJsonRecordingsJsonParams
        ): CompletableFuture<HttpResponseFor<RecordingsJsonRecordingsJsonResponse>> =
            recordingsJson(params, RequestOptions.none())

        /** @see recordingsJson */
        fun recordingsJson(
            params: RecordingsJsonRecordingsJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingsJsonRecordingsJsonResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /texml/Accounts/{account_sid}/Calls/{call_sid}/Recordings.json`, but is otherwise the
         * same as [RecordingsJsonServiceAsync.retrieveRecordingsJson].
         */
        fun retrieveRecordingsJson(
            callSid: String,
            params: RecordingsJsonRetrieveRecordingsJsonParams,
        ): CompletableFuture<HttpResponseFor<RecordingsJsonRetrieveRecordingsJsonResponse>> =
            retrieveRecordingsJson(callSid, params, RequestOptions.none())

        /** @see retrieveRecordingsJson */
        fun retrieveRecordingsJson(
            callSid: String,
            params: RecordingsJsonRetrieveRecordingsJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingsJsonRetrieveRecordingsJsonResponse>> =
            retrieveRecordingsJson(params.toBuilder().callSid(callSid).build(), requestOptions)

        /** @see retrieveRecordingsJson */
        fun retrieveRecordingsJson(
            params: RecordingsJsonRetrieveRecordingsJsonParams
        ): CompletableFuture<HttpResponseFor<RecordingsJsonRetrieveRecordingsJsonResponse>> =
            retrieveRecordingsJson(params, RequestOptions.none())

        /** @see retrieveRecordingsJson */
        fun retrieveRecordingsJson(
            params: RecordingsJsonRetrieveRecordingsJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingsJsonRetrieveRecordingsJsonResponse>>
    }
}
