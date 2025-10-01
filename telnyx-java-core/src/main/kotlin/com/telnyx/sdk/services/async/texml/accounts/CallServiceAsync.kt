// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.texml.accounts

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.texml.accounts.calls.CallCallsParams
import com.telnyx.sdk.models.texml.accounts.calls.CallCallsResponse
import com.telnyx.sdk.models.texml.accounts.calls.CallRetrieveCallsParams
import com.telnyx.sdk.models.texml.accounts.calls.CallRetrieveCallsResponse
import com.telnyx.sdk.models.texml.accounts.calls.CallRetrieveParams
import com.telnyx.sdk.models.texml.accounts.calls.CallRetrieveResponse
import com.telnyx.sdk.models.texml.accounts.calls.CallSiprecJsonParams
import com.telnyx.sdk.models.texml.accounts.calls.CallSiprecJsonResponse
import com.telnyx.sdk.models.texml.accounts.calls.CallStreamsJsonParams
import com.telnyx.sdk.models.texml.accounts.calls.CallStreamsJsonResponse
import com.telnyx.sdk.models.texml.accounts.calls.CallUpdateParams
import com.telnyx.sdk.models.texml.accounts.calls.CallUpdateResponse
import com.telnyx.sdk.services.async.texml.accounts.calls.RecordingServiceAsync
import com.telnyx.sdk.services.async.texml.accounts.calls.RecordingsJsonServiceAsync
import com.telnyx.sdk.services.async.texml.accounts.calls.SiprecServiceAsync
import com.telnyx.sdk.services.async.texml.accounts.calls.StreamServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CallServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallServiceAsync

    fun recordingsJson(): RecordingsJsonServiceAsync

    fun recordings(): RecordingServiceAsync

    fun siprec(): SiprecServiceAsync

    fun streams(): StreamServiceAsync

    /**
     * Returns an individual call identified by its CallSid. This endpoint is eventually consistent.
     */
    fun retrieve(
        callSid: String,
        params: CallRetrieveParams,
    ): CompletableFuture<CallRetrieveResponse> = retrieve(callSid, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        callSid: String,
        params: CallRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallRetrieveResponse> =
        retrieve(params.toBuilder().callSid(callSid).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: CallRetrieveParams): CompletableFuture<CallRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CallRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallRetrieveResponse>

    /**
     * Update TeXML call. Please note that the keys present in the payload MUST BE formatted in
     * CamelCase as specified in the example.
     */
    fun update(callSid: String, params: CallUpdateParams): CompletableFuture<CallUpdateResponse> =
        update(callSid, params, RequestOptions.none())

    /** @see update */
    fun update(
        callSid: String,
        params: CallUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallUpdateResponse> =
        update(params.toBuilder().callSid(callSid).build(), requestOptions)

    /** @see update */
    fun update(params: CallUpdateParams): CompletableFuture<CallUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CallUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallUpdateResponse>

    /**
     * Initiate an outbound TeXML call. Telnyx will request TeXML from the XML Request URL
     * configured for the connection in the Mission Control Portal.
     */
    fun calls(accountSid: String, params: CallCallsParams): CompletableFuture<CallCallsResponse> =
        calls(accountSid, params, RequestOptions.none())

    /** @see calls */
    fun calls(
        accountSid: String,
        params: CallCallsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallCallsResponse> =
        calls(params.toBuilder().accountSid(accountSid).build(), requestOptions)

    /** @see calls */
    fun calls(params: CallCallsParams): CompletableFuture<CallCallsResponse> =
        calls(params, RequestOptions.none())

    /** @see calls */
    fun calls(
        params: CallCallsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallCallsResponse>

    /** Returns multiple call resouces for an account. This endpoint is eventually consistent. */
    fun retrieveCalls(accountSid: String): CompletableFuture<CallRetrieveCallsResponse> =
        retrieveCalls(accountSid, CallRetrieveCallsParams.none())

    /** @see retrieveCalls */
    fun retrieveCalls(
        accountSid: String,
        params: CallRetrieveCallsParams = CallRetrieveCallsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallRetrieveCallsResponse> =
        retrieveCalls(params.toBuilder().accountSid(accountSid).build(), requestOptions)

    /** @see retrieveCalls */
    fun retrieveCalls(
        accountSid: String,
        params: CallRetrieveCallsParams = CallRetrieveCallsParams.none(),
    ): CompletableFuture<CallRetrieveCallsResponse> =
        retrieveCalls(accountSid, params, RequestOptions.none())

    /** @see retrieveCalls */
    fun retrieveCalls(
        params: CallRetrieveCallsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallRetrieveCallsResponse>

    /** @see retrieveCalls */
    fun retrieveCalls(
        params: CallRetrieveCallsParams
    ): CompletableFuture<CallRetrieveCallsResponse> = retrieveCalls(params, RequestOptions.none())

    /** @see retrieveCalls */
    fun retrieveCalls(
        accountSid: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CallRetrieveCallsResponse> =
        retrieveCalls(accountSid, CallRetrieveCallsParams.none(), requestOptions)

    /** Starts siprec session with specified parameters for call idientified by call_sid. */
    fun siprecJson(
        callSid: String,
        params: CallSiprecJsonParams,
    ): CompletableFuture<CallSiprecJsonResponse> =
        siprecJson(callSid, params, RequestOptions.none())

    /** @see siprecJson */
    fun siprecJson(
        callSid: String,
        params: CallSiprecJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallSiprecJsonResponse> =
        siprecJson(params.toBuilder().callSid(callSid).build(), requestOptions)

    /** @see siprecJson */
    fun siprecJson(params: CallSiprecJsonParams): CompletableFuture<CallSiprecJsonResponse> =
        siprecJson(params, RequestOptions.none())

    /** @see siprecJson */
    fun siprecJson(
        params: CallSiprecJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallSiprecJsonResponse>

    /** Starts streaming media from a call to a specific WebSocket address. */
    fun streamsJson(
        callSid: String,
        params: CallStreamsJsonParams,
    ): CompletableFuture<CallStreamsJsonResponse> =
        streamsJson(callSid, params, RequestOptions.none())

    /** @see streamsJson */
    fun streamsJson(
        callSid: String,
        params: CallStreamsJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallStreamsJsonResponse> =
        streamsJson(params.toBuilder().callSid(callSid).build(), requestOptions)

    /** @see streamsJson */
    fun streamsJson(params: CallStreamsJsonParams): CompletableFuture<CallStreamsJsonResponse> =
        streamsJson(params, RequestOptions.none())

    /** @see streamsJson */
    fun streamsJson(
        params: CallStreamsJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallStreamsJsonResponse>

    /** A view of [CallServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallServiceAsync.WithRawResponse

        fun recordingsJson(): RecordingsJsonServiceAsync.WithRawResponse

        fun recordings(): RecordingServiceAsync.WithRawResponse

        fun siprec(): SiprecServiceAsync.WithRawResponse

        fun streams(): StreamServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /texml/Accounts/{account_sid}/Calls/{call_sid}`, but
         * is otherwise the same as [CallServiceAsync.retrieve].
         */
        fun retrieve(
            callSid: String,
            params: CallRetrieveParams,
        ): CompletableFuture<HttpResponseFor<CallRetrieveResponse>> =
            retrieve(callSid, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            callSid: String,
            params: CallRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallRetrieveResponse>> =
            retrieve(params.toBuilder().callSid(callSid).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: CallRetrieveParams
        ): CompletableFuture<HttpResponseFor<CallRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CallRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `post /texml/Accounts/{account_sid}/Calls/{call_sid}`,
         * but is otherwise the same as [CallServiceAsync.update].
         */
        fun update(
            callSid: String,
            params: CallUpdateParams,
        ): CompletableFuture<HttpResponseFor<CallUpdateResponse>> =
            update(callSid, params, RequestOptions.none())

        /** @see update */
        fun update(
            callSid: String,
            params: CallUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallUpdateResponse>> =
            update(params.toBuilder().callSid(callSid).build(), requestOptions)

        /** @see update */
        fun update(
            params: CallUpdateParams
        ): CompletableFuture<HttpResponseFor<CallUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CallUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallUpdateResponse>>

        /**
         * Returns a raw HTTP response for `post /texml/Accounts/{account_sid}/Calls`, but is
         * otherwise the same as [CallServiceAsync.calls].
         */
        fun calls(
            accountSid: String,
            params: CallCallsParams,
        ): CompletableFuture<HttpResponseFor<CallCallsResponse>> =
            calls(accountSid, params, RequestOptions.none())

        /** @see calls */
        fun calls(
            accountSid: String,
            params: CallCallsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallCallsResponse>> =
            calls(params.toBuilder().accountSid(accountSid).build(), requestOptions)

        /** @see calls */
        fun calls(params: CallCallsParams): CompletableFuture<HttpResponseFor<CallCallsResponse>> =
            calls(params, RequestOptions.none())

        /** @see calls */
        fun calls(
            params: CallCallsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallCallsResponse>>

        /**
         * Returns a raw HTTP response for `get /texml/Accounts/{account_sid}/Calls`, but is
         * otherwise the same as [CallServiceAsync.retrieveCalls].
         */
        fun retrieveCalls(
            accountSid: String
        ): CompletableFuture<HttpResponseFor<CallRetrieveCallsResponse>> =
            retrieveCalls(accountSid, CallRetrieveCallsParams.none())

        /** @see retrieveCalls */
        fun retrieveCalls(
            accountSid: String,
            params: CallRetrieveCallsParams = CallRetrieveCallsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallRetrieveCallsResponse>> =
            retrieveCalls(params.toBuilder().accountSid(accountSid).build(), requestOptions)

        /** @see retrieveCalls */
        fun retrieveCalls(
            accountSid: String,
            params: CallRetrieveCallsParams = CallRetrieveCallsParams.none(),
        ): CompletableFuture<HttpResponseFor<CallRetrieveCallsResponse>> =
            retrieveCalls(accountSid, params, RequestOptions.none())

        /** @see retrieveCalls */
        fun retrieveCalls(
            params: CallRetrieveCallsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallRetrieveCallsResponse>>

        /** @see retrieveCalls */
        fun retrieveCalls(
            params: CallRetrieveCallsParams
        ): CompletableFuture<HttpResponseFor<CallRetrieveCallsResponse>> =
            retrieveCalls(params, RequestOptions.none())

        /** @see retrieveCalls */
        fun retrieveCalls(
            accountSid: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CallRetrieveCallsResponse>> =
            retrieveCalls(accountSid, CallRetrieveCallsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /texml/Accounts/{account_sid}/Calls/{call_sid}/Siprec.json`, but is otherwise the same as
         * [CallServiceAsync.siprecJson].
         */
        fun siprecJson(
            callSid: String,
            params: CallSiprecJsonParams,
        ): CompletableFuture<HttpResponseFor<CallSiprecJsonResponse>> =
            siprecJson(callSid, params, RequestOptions.none())

        /** @see siprecJson */
        fun siprecJson(
            callSid: String,
            params: CallSiprecJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallSiprecJsonResponse>> =
            siprecJson(params.toBuilder().callSid(callSid).build(), requestOptions)

        /** @see siprecJson */
        fun siprecJson(
            params: CallSiprecJsonParams
        ): CompletableFuture<HttpResponseFor<CallSiprecJsonResponse>> =
            siprecJson(params, RequestOptions.none())

        /** @see siprecJson */
        fun siprecJson(
            params: CallSiprecJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallSiprecJsonResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /texml/Accounts/{account_sid}/Calls/{call_sid}/Streams.json`, but is otherwise the same
         * as [CallServiceAsync.streamsJson].
         */
        fun streamsJson(
            callSid: String,
            params: CallStreamsJsonParams,
        ): CompletableFuture<HttpResponseFor<CallStreamsJsonResponse>> =
            streamsJson(callSid, params, RequestOptions.none())

        /** @see streamsJson */
        fun streamsJson(
            callSid: String,
            params: CallStreamsJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallStreamsJsonResponse>> =
            streamsJson(params.toBuilder().callSid(callSid).build(), requestOptions)

        /** @see streamsJson */
        fun streamsJson(
            params: CallStreamsJsonParams
        ): CompletableFuture<HttpResponseFor<CallStreamsJsonResponse>> =
            streamsJson(params, RequestOptions.none())

        /** @see streamsJson */
        fun streamsJson(
            params: CallStreamsJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallStreamsJsonResponse>>
    }
}
