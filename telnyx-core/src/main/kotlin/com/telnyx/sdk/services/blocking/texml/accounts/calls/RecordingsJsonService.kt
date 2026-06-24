// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.texml.accounts.calls

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.texml.accounts.calls.recordingsjson.RecordingsJsonRecordingsJsonParams
import com.telnyx.sdk.models.texml.accounts.calls.recordingsjson.RecordingsJsonRetrieveRecordingsJsonParams
import com.telnyx.sdk.models.texml.accounts.calls.recordingsjson.TexmlCreateCallRecordingResponseBody
import com.telnyx.sdk.models.texml.accounts.calls.recordingsjson.TexmlGetCallRecordingsResponseBody
import java.util.function.Consumer

/** TeXML REST Commands */
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
    ): TexmlCreateCallRecordingResponseBody = recordingsJson(callSid, params, RequestOptions.none())

    /** @see recordingsJson */
    fun recordingsJson(
        callSid: String,
        params: RecordingsJsonRecordingsJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TexmlCreateCallRecordingResponseBody =
        recordingsJson(params.toBuilder().callSid(callSid).build(), requestOptions)

    /** @see recordingsJson */
    fun recordingsJson(
        params: RecordingsJsonRecordingsJsonParams
    ): TexmlCreateCallRecordingResponseBody = recordingsJson(params, RequestOptions.none())

    /** @see recordingsJson */
    fun recordingsJson(
        params: RecordingsJsonRecordingsJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TexmlCreateCallRecordingResponseBody

    /** Returns recordings for a call identified by call_sid. */
    fun retrieveRecordingsJson(
        callSid: String,
        params: RecordingsJsonRetrieveRecordingsJsonParams,
    ): TexmlGetCallRecordingsResponseBody =
        retrieveRecordingsJson(callSid, params, RequestOptions.none())

    /** @see retrieveRecordingsJson */
    fun retrieveRecordingsJson(
        callSid: String,
        params: RecordingsJsonRetrieveRecordingsJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TexmlGetCallRecordingsResponseBody =
        retrieveRecordingsJson(params.toBuilder().callSid(callSid).build(), requestOptions)

    /** @see retrieveRecordingsJson */
    fun retrieveRecordingsJson(
        params: RecordingsJsonRetrieveRecordingsJsonParams
    ): TexmlGetCallRecordingsResponseBody = retrieveRecordingsJson(params, RequestOptions.none())

    /** @see retrieveRecordingsJson */
    fun retrieveRecordingsJson(
        params: RecordingsJsonRetrieveRecordingsJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TexmlGetCallRecordingsResponseBody

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
        ): HttpResponseFor<TexmlCreateCallRecordingResponseBody> =
            recordingsJson(callSid, params, RequestOptions.none())

        /** @see recordingsJson */
        @MustBeClosed
        fun recordingsJson(
            callSid: String,
            params: RecordingsJsonRecordingsJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TexmlCreateCallRecordingResponseBody> =
            recordingsJson(params.toBuilder().callSid(callSid).build(), requestOptions)

        /** @see recordingsJson */
        @MustBeClosed
        fun recordingsJson(
            params: RecordingsJsonRecordingsJsonParams
        ): HttpResponseFor<TexmlCreateCallRecordingResponseBody> =
            recordingsJson(params, RequestOptions.none())

        /** @see recordingsJson */
        @MustBeClosed
        fun recordingsJson(
            params: RecordingsJsonRecordingsJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TexmlCreateCallRecordingResponseBody>

        /**
         * Returns a raw HTTP response for `get
         * /texml/Accounts/{account_sid}/Calls/{call_sid}/Recordings.json`, but is otherwise the
         * same as [RecordingsJsonService.retrieveRecordingsJson].
         */
        @MustBeClosed
        fun retrieveRecordingsJson(
            callSid: String,
            params: RecordingsJsonRetrieveRecordingsJsonParams,
        ): HttpResponseFor<TexmlGetCallRecordingsResponseBody> =
            retrieveRecordingsJson(callSid, params, RequestOptions.none())

        /** @see retrieveRecordingsJson */
        @MustBeClosed
        fun retrieveRecordingsJson(
            callSid: String,
            params: RecordingsJsonRetrieveRecordingsJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TexmlGetCallRecordingsResponseBody> =
            retrieveRecordingsJson(params.toBuilder().callSid(callSid).build(), requestOptions)

        /** @see retrieveRecordingsJson */
        @MustBeClosed
        fun retrieveRecordingsJson(
            params: RecordingsJsonRetrieveRecordingsJsonParams
        ): HttpResponseFor<TexmlGetCallRecordingsResponseBody> =
            retrieveRecordingsJson(params, RequestOptions.none())

        /** @see retrieveRecordingsJson */
        @MustBeClosed
        fun retrieveRecordingsJson(
            params: RecordingsJsonRetrieveRecordingsJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TexmlGetCallRecordingsResponseBody>
    }
}
