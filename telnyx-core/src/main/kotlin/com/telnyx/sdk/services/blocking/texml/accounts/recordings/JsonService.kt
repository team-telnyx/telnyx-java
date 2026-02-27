// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.texml.accounts.recordings

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.texml.accounts.TexmlGetCallRecordingResponseBody
import com.telnyx.sdk.models.texml.accounts.recordings.json.JsonDeleteRecordingSidJsonParams
import com.telnyx.sdk.models.texml.accounts.recordings.json.JsonRetrieveRecordingSidJsonParams
import java.util.function.Consumer

/** TeXML REST Commands */
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

    /** Deletes recording resource identified by recording id. */
    fun deleteRecordingSidJson(recordingSid: String, params: JsonDeleteRecordingSidJsonParams) =
        deleteRecordingSidJson(recordingSid, params, RequestOptions.none())

    /** @see deleteRecordingSidJson */
    fun deleteRecordingSidJson(
        recordingSid: String,
        params: JsonDeleteRecordingSidJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        deleteRecordingSidJson(
            params.toBuilder().recordingSid(recordingSid).build(),
            requestOptions,
        )

    /** @see deleteRecordingSidJson */
    fun deleteRecordingSidJson(params: JsonDeleteRecordingSidJsonParams) =
        deleteRecordingSidJson(params, RequestOptions.none())

    /** @see deleteRecordingSidJson */
    fun deleteRecordingSidJson(
        params: JsonDeleteRecordingSidJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Returns recording resource identified by recording id. */
    fun retrieveRecordingSidJson(
        recordingSid: String,
        params: JsonRetrieveRecordingSidJsonParams,
    ): TexmlGetCallRecordingResponseBody =
        retrieveRecordingSidJson(recordingSid, params, RequestOptions.none())

    /** @see retrieveRecordingSidJson */
    fun retrieveRecordingSidJson(
        recordingSid: String,
        params: JsonRetrieveRecordingSidJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TexmlGetCallRecordingResponseBody =
        retrieveRecordingSidJson(
            params.toBuilder().recordingSid(recordingSid).build(),
            requestOptions,
        )

    /** @see retrieveRecordingSidJson */
    fun retrieveRecordingSidJson(
        params: JsonRetrieveRecordingSidJsonParams
    ): TexmlGetCallRecordingResponseBody = retrieveRecordingSidJson(params, RequestOptions.none())

    /** @see retrieveRecordingSidJson */
    fun retrieveRecordingSidJson(
        params: JsonRetrieveRecordingSidJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TexmlGetCallRecordingResponseBody

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
         * /texml/Accounts/{account_sid}/Recordings/{recording_sid}.json`, but is otherwise the same
         * as [JsonService.deleteRecordingSidJson].
         */
        @MustBeClosed
        fun deleteRecordingSidJson(
            recordingSid: String,
            params: JsonDeleteRecordingSidJsonParams,
        ): HttpResponse = deleteRecordingSidJson(recordingSid, params, RequestOptions.none())

        /** @see deleteRecordingSidJson */
        @MustBeClosed
        fun deleteRecordingSidJson(
            recordingSid: String,
            params: JsonDeleteRecordingSidJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteRecordingSidJson(
                params.toBuilder().recordingSid(recordingSid).build(),
                requestOptions,
            )

        /** @see deleteRecordingSidJson */
        @MustBeClosed
        fun deleteRecordingSidJson(params: JsonDeleteRecordingSidJsonParams): HttpResponse =
            deleteRecordingSidJson(params, RequestOptions.none())

        /** @see deleteRecordingSidJson */
        @MustBeClosed
        fun deleteRecordingSidJson(
            params: JsonDeleteRecordingSidJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /texml/Accounts/{account_sid}/Recordings/{recording_sid}.json`, but is otherwise the same
         * as [JsonService.retrieveRecordingSidJson].
         */
        @MustBeClosed
        fun retrieveRecordingSidJson(
            recordingSid: String,
            params: JsonRetrieveRecordingSidJsonParams,
        ): HttpResponseFor<TexmlGetCallRecordingResponseBody> =
            retrieveRecordingSidJson(recordingSid, params, RequestOptions.none())

        /** @see retrieveRecordingSidJson */
        @MustBeClosed
        fun retrieveRecordingSidJson(
            recordingSid: String,
            params: JsonRetrieveRecordingSidJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TexmlGetCallRecordingResponseBody> =
            retrieveRecordingSidJson(
                params.toBuilder().recordingSid(recordingSid).build(),
                requestOptions,
            )

        /** @see retrieveRecordingSidJson */
        @MustBeClosed
        fun retrieveRecordingSidJson(
            params: JsonRetrieveRecordingSidJsonParams
        ): HttpResponseFor<TexmlGetCallRecordingResponseBody> =
            retrieveRecordingSidJson(params, RequestOptions.none())

        /** @see retrieveRecordingSidJson */
        @MustBeClosed
        fun retrieveRecordingSidJson(
            params: JsonRetrieveRecordingSidJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TexmlGetCallRecordingResponseBody>
    }
}
