// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.texml.accounts.calls

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.texml.accounts.calls.recordingsjson.RecordingsJsonRecordingsJsonParams
import com.telnyx.sdk.models.texml.accounts.calls.recordingsjson.RecordingsJsonRecordingsJsonResponse
import com.telnyx.sdk.models.texml.accounts.calls.recordingsjson.RecordingsJsonRetrieveRecordingsJsonParams
import com.telnyx.sdk.models.texml.accounts.calls.recordingsjson.RecordingsJsonRetrieveRecordingsJsonResponse
import java.util.function.Consumer

interface RecordingsJsonService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RecordingsJsonService

    /** Starts recording with specified parameters for call idientified by call_sid. */
    fun recordingsJson(
        callSid: String,
        params: RecordingsJsonRecordingsJsonParams,
    ): RecordingsJsonRecordingsJsonResponse = recordingsJson(callSid, params, RequestOptions.none())

    /** @see recordingsJson */
    fun recordingsJson(
        callSid: String,
        params: RecordingsJsonRecordingsJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordingsJsonRecordingsJsonResponse =
        recordingsJson(params.toBuilder().callSid(callSid).build(), requestOptions)

    /** @see recordingsJson */
    fun recordingsJson(
        params: RecordingsJsonRecordingsJsonParams
    ): RecordingsJsonRecordingsJsonResponse = recordingsJson(params, RequestOptions.none())

    /** @see recordingsJson */
    fun recordingsJson(
        params: RecordingsJsonRecordingsJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordingsJsonRecordingsJsonResponse

    /** Returns recordings for a call identified by call_sid. */
    fun retrieveRecordingsJson(
        callSid: String,
        params: RecordingsJsonRetrieveRecordingsJsonParams,
    ): RecordingsJsonRetrieveRecordingsJsonResponse =
        retrieveRecordingsJson(callSid, params, RequestOptions.none())

    /** @see retrieveRecordingsJson */
    fun retrieveRecordingsJson(
        callSid: String,
        params: RecordingsJsonRetrieveRecordingsJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordingsJsonRetrieveRecordingsJsonResponse =
        retrieveRecordingsJson(params.toBuilder().callSid(callSid).build(), requestOptions)

    /** @see retrieveRecordingsJson */
    fun retrieveRecordingsJson(
        params: RecordingsJsonRetrieveRecordingsJsonParams
    ): RecordingsJsonRetrieveRecordingsJsonResponse =
        retrieveRecordingsJson(params, RequestOptions.none())

    /** @see retrieveRecordingsJson */
    fun retrieveRecordingsJson(
        params: RecordingsJsonRetrieveRecordingsJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordingsJsonRetrieveRecordingsJsonResponse

    /**
     * A view of [RecordingsJsonService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RecordingsJsonService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /texml/Accounts/{account_sid}/Calls/{call_sid}/Recordings.json`, but is otherwise the
         * same as [RecordingsJsonService.recordingsJson].
         */
        @MustBeClosed
        fun recordingsJson(
            callSid: String,
            params: RecordingsJsonRecordingsJsonParams,
        ): HttpResponseFor<RecordingsJsonRecordingsJsonResponse> =
            recordingsJson(callSid, params, RequestOptions.none())

        /** @see recordingsJson */
        @MustBeClosed
        fun recordingsJson(
            callSid: String,
            params: RecordingsJsonRecordingsJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordingsJsonRecordingsJsonResponse> =
            recordingsJson(params.toBuilder().callSid(callSid).build(), requestOptions)

        /** @see recordingsJson */
        @MustBeClosed
        fun recordingsJson(
            params: RecordingsJsonRecordingsJsonParams
        ): HttpResponseFor<RecordingsJsonRecordingsJsonResponse> =
            recordingsJson(params, RequestOptions.none())

        /** @see recordingsJson */
        @MustBeClosed
        fun recordingsJson(
            params: RecordingsJsonRecordingsJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordingsJsonRecordingsJsonResponse>

        /**
         * Returns a raw HTTP response for `get
         * /texml/Accounts/{account_sid}/Calls/{call_sid}/Recordings.json`, but is otherwise the
         * same as [RecordingsJsonService.retrieveRecordingsJson].
         */
        @MustBeClosed
        fun retrieveRecordingsJson(
            callSid: String,
            params: RecordingsJsonRetrieveRecordingsJsonParams,
        ): HttpResponseFor<RecordingsJsonRetrieveRecordingsJsonResponse> =
            retrieveRecordingsJson(callSid, params, RequestOptions.none())

        /** @see retrieveRecordingsJson */
        @MustBeClosed
        fun retrieveRecordingsJson(
            callSid: String,
            params: RecordingsJsonRetrieveRecordingsJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordingsJsonRetrieveRecordingsJsonResponse> =
            retrieveRecordingsJson(params.toBuilder().callSid(callSid).build(), requestOptions)

        /** @see retrieveRecordingsJson */
        @MustBeClosed
        fun retrieveRecordingsJson(
            params: RecordingsJsonRetrieveRecordingsJsonParams
        ): HttpResponseFor<RecordingsJsonRetrieveRecordingsJsonResponse> =
            retrieveRecordingsJson(params, RequestOptions.none())

        /** @see retrieveRecordingsJson */
        @MustBeClosed
        fun retrieveRecordingsJson(
            params: RecordingsJsonRetrieveRecordingsJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordingsJsonRetrieveRecordingsJsonResponse>
    }
}
