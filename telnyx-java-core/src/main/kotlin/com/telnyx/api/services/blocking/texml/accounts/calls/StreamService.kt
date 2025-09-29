// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.texml.accounts.calls

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.texml.accounts.calls.streams.StreamStreamingSidJsonParams
import com.telnyx.api.models.texml.accounts.calls.streams.StreamStreamingSidJsonResponse
import java.util.function.Consumer

interface StreamService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StreamService

    /** Updates streaming resource for particular call. */
    fun streamingSidJson(
        streamingSid: String,
        params: StreamStreamingSidJsonParams,
    ): StreamStreamingSidJsonResponse =
        streamingSidJson(streamingSid, params, RequestOptions.none())

    /** @see streamingSidJson */
    fun streamingSidJson(
        streamingSid: String,
        params: StreamStreamingSidJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamStreamingSidJsonResponse =
        streamingSidJson(params.toBuilder().streamingSid(streamingSid).build(), requestOptions)

    /** @see streamingSidJson */
    fun streamingSidJson(params: StreamStreamingSidJsonParams): StreamStreamingSidJsonResponse =
        streamingSidJson(params, RequestOptions.none())

    /** @see streamingSidJson */
    fun streamingSidJson(
        params: StreamStreamingSidJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamStreamingSidJsonResponse

    /** A view of [StreamService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): StreamService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /texml/Accounts/{account_sid}/Calls/{call_sid}/Streams/{streaming_sid}.json`, but is
         * otherwise the same as [StreamService.streamingSidJson].
         */
        @MustBeClosed
        fun streamingSidJson(
            streamingSid: String,
            params: StreamStreamingSidJsonParams,
        ): HttpResponseFor<StreamStreamingSidJsonResponse> =
            streamingSidJson(streamingSid, params, RequestOptions.none())

        /** @see streamingSidJson */
        @MustBeClosed
        fun streamingSidJson(
            streamingSid: String,
            params: StreamStreamingSidJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamStreamingSidJsonResponse> =
            streamingSidJson(params.toBuilder().streamingSid(streamingSid).build(), requestOptions)

        /** @see streamingSidJson */
        @MustBeClosed
        fun streamingSidJson(
            params: StreamStreamingSidJsonParams
        ): HttpResponseFor<StreamStreamingSidJsonResponse> =
            streamingSidJson(params, RequestOptions.none())

        /** @see streamingSidJson */
        @MustBeClosed
        fun streamingSidJson(
            params: StreamStreamingSidJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamStreamingSidJsonResponse>
    }
}
