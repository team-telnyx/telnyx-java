// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.texml.accounts

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.texml.accounts.calls.CallCallsParams
import com.telnyx.api.models.texml.accounts.calls.CallCallsResponse
import com.telnyx.api.models.texml.accounts.calls.CallRetrieveCallsParams
import com.telnyx.api.models.texml.accounts.calls.CallRetrieveCallsResponse
import com.telnyx.api.models.texml.accounts.calls.CallRetrieveParams
import com.telnyx.api.models.texml.accounts.calls.CallRetrieveResponse
import com.telnyx.api.models.texml.accounts.calls.CallSiprecJsonParams
import com.telnyx.api.models.texml.accounts.calls.CallSiprecJsonResponse
import com.telnyx.api.models.texml.accounts.calls.CallStreamsJsonParams
import com.telnyx.api.models.texml.accounts.calls.CallStreamsJsonResponse
import com.telnyx.api.models.texml.accounts.calls.CallUpdateParams
import com.telnyx.api.models.texml.accounts.calls.CallUpdateResponse
import com.telnyx.api.services.blocking.texml.accounts.calls.RecordingService
import com.telnyx.api.services.blocking.texml.accounts.calls.RecordingsJsonService
import com.telnyx.api.services.blocking.texml.accounts.calls.SiprecService
import com.telnyx.api.services.blocking.texml.accounts.calls.StreamService
import java.util.function.Consumer

interface CallService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallService

    fun recordingsJson(): RecordingsJsonService

    fun recordings(): RecordingService

    fun siprec(): SiprecService

    fun streams(): StreamService

    /**
     * Returns an individual call identified by its CallSid. This endpoint is eventually consistent.
     */
    fun retrieve(callSid: String, params: CallRetrieveParams): CallRetrieveResponse =
        retrieve(callSid, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        callSid: String,
        params: CallRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallRetrieveResponse = retrieve(params.toBuilder().callSid(callSid).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: CallRetrieveParams): CallRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CallRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallRetrieveResponse

    /**
     * Update TeXML call. Please note that the keys present in the payload MUST BE formatted in
     * CamelCase as specified in the example.
     */
    fun update(callSid: String, params: CallUpdateParams): CallUpdateResponse =
        update(callSid, params, RequestOptions.none())

    /** @see update */
    fun update(
        callSid: String,
        params: CallUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallUpdateResponse = update(params.toBuilder().callSid(callSid).build(), requestOptions)

    /** @see update */
    fun update(params: CallUpdateParams): CallUpdateResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CallUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallUpdateResponse

    /**
     * Initiate an outbound TeXML call. Telnyx will request TeXML from the XML Request URL
     * configured for the connection in the Mission Control Portal.
     */
    fun calls(accountSid: String, params: CallCallsParams): CallCallsResponse =
        calls(accountSid, params, RequestOptions.none())

    /** @see calls */
    fun calls(
        accountSid: String,
        params: CallCallsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallCallsResponse = calls(params.toBuilder().accountSid(accountSid).build(), requestOptions)

    /** @see calls */
    fun calls(params: CallCallsParams): CallCallsResponse = calls(params, RequestOptions.none())

    /** @see calls */
    fun calls(
        params: CallCallsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallCallsResponse

    /** Returns multiple call resouces for an account. This endpoint is eventually consistent. */
    fun retrieveCalls(accountSid: String): CallRetrieveCallsResponse =
        retrieveCalls(accountSid, CallRetrieveCallsParams.none())

    /** @see retrieveCalls */
    fun retrieveCalls(
        accountSid: String,
        params: CallRetrieveCallsParams = CallRetrieveCallsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallRetrieveCallsResponse =
        retrieveCalls(params.toBuilder().accountSid(accountSid).build(), requestOptions)

    /** @see retrieveCalls */
    fun retrieveCalls(
        accountSid: String,
        params: CallRetrieveCallsParams = CallRetrieveCallsParams.none(),
    ): CallRetrieveCallsResponse = retrieveCalls(accountSid, params, RequestOptions.none())

    /** @see retrieveCalls */
    fun retrieveCalls(
        params: CallRetrieveCallsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallRetrieveCallsResponse

    /** @see retrieveCalls */
    fun retrieveCalls(params: CallRetrieveCallsParams): CallRetrieveCallsResponse =
        retrieveCalls(params, RequestOptions.none())

    /** @see retrieveCalls */
    fun retrieveCalls(
        accountSid: String,
        requestOptions: RequestOptions,
    ): CallRetrieveCallsResponse =
        retrieveCalls(accountSid, CallRetrieveCallsParams.none(), requestOptions)

    /** Starts siprec session with specified parameters for call idientified by call_sid. */
    fun siprecJson(callSid: String, params: CallSiprecJsonParams): CallSiprecJsonResponse =
        siprecJson(callSid, params, RequestOptions.none())

    /** @see siprecJson */
    fun siprecJson(
        callSid: String,
        params: CallSiprecJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallSiprecJsonResponse =
        siprecJson(params.toBuilder().callSid(callSid).build(), requestOptions)

    /** @see siprecJson */
    fun siprecJson(params: CallSiprecJsonParams): CallSiprecJsonResponse =
        siprecJson(params, RequestOptions.none())

    /** @see siprecJson */
    fun siprecJson(
        params: CallSiprecJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallSiprecJsonResponse

    /** Starts streaming media from a call to a specific WebSocket address. */
    fun streamsJson(callSid: String, params: CallStreamsJsonParams): CallStreamsJsonResponse =
        streamsJson(callSid, params, RequestOptions.none())

    /** @see streamsJson */
    fun streamsJson(
        callSid: String,
        params: CallStreamsJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallStreamsJsonResponse =
        streamsJson(params.toBuilder().callSid(callSid).build(), requestOptions)

    /** @see streamsJson */
    fun streamsJson(params: CallStreamsJsonParams): CallStreamsJsonResponse =
        streamsJson(params, RequestOptions.none())

    /** @see streamsJson */
    fun streamsJson(
        params: CallStreamsJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallStreamsJsonResponse

    /** A view of [CallService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallService.WithRawResponse

        fun recordingsJson(): RecordingsJsonService.WithRawResponse

        fun recordings(): RecordingService.WithRawResponse

        fun siprec(): SiprecService.WithRawResponse

        fun streams(): StreamService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /texml/Accounts/{account_sid}/Calls/{call_sid}`, but
         * is otherwise the same as [CallService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            callSid: String,
            params: CallRetrieveParams,
        ): HttpResponseFor<CallRetrieveResponse> = retrieve(callSid, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            callSid: String,
            params: CallRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallRetrieveResponse> =
            retrieve(params.toBuilder().callSid(callSid).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CallRetrieveParams): HttpResponseFor<CallRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CallRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallRetrieveResponse>

        /**
         * Returns a raw HTTP response for `post /texml/Accounts/{account_sid}/Calls/{call_sid}`,
         * but is otherwise the same as [CallService.update].
         */
        @MustBeClosed
        fun update(callSid: String, params: CallUpdateParams): HttpResponseFor<CallUpdateResponse> =
            update(callSid, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            callSid: String,
            params: CallUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallUpdateResponse> =
            update(params.toBuilder().callSid(callSid).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: CallUpdateParams): HttpResponseFor<CallUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CallUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallUpdateResponse>

        /**
         * Returns a raw HTTP response for `post /texml/Accounts/{account_sid}/Calls`, but is
         * otherwise the same as [CallService.calls].
         */
        @MustBeClosed
        fun calls(accountSid: String, params: CallCallsParams): HttpResponseFor<CallCallsResponse> =
            calls(accountSid, params, RequestOptions.none())

        /** @see calls */
        @MustBeClosed
        fun calls(
            accountSid: String,
            params: CallCallsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallCallsResponse> =
            calls(params.toBuilder().accountSid(accountSid).build(), requestOptions)

        /** @see calls */
        @MustBeClosed
        fun calls(params: CallCallsParams): HttpResponseFor<CallCallsResponse> =
            calls(params, RequestOptions.none())

        /** @see calls */
        @MustBeClosed
        fun calls(
            params: CallCallsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallCallsResponse>

        /**
         * Returns a raw HTTP response for `get /texml/Accounts/{account_sid}/Calls`, but is
         * otherwise the same as [CallService.retrieveCalls].
         */
        @MustBeClosed
        fun retrieveCalls(accountSid: String): HttpResponseFor<CallRetrieveCallsResponse> =
            retrieveCalls(accountSid, CallRetrieveCallsParams.none())

        /** @see retrieveCalls */
        @MustBeClosed
        fun retrieveCalls(
            accountSid: String,
            params: CallRetrieveCallsParams = CallRetrieveCallsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallRetrieveCallsResponse> =
            retrieveCalls(params.toBuilder().accountSid(accountSid).build(), requestOptions)

        /** @see retrieveCalls */
        @MustBeClosed
        fun retrieveCalls(
            accountSid: String,
            params: CallRetrieveCallsParams = CallRetrieveCallsParams.none(),
        ): HttpResponseFor<CallRetrieveCallsResponse> =
            retrieveCalls(accountSid, params, RequestOptions.none())

        /** @see retrieveCalls */
        @MustBeClosed
        fun retrieveCalls(
            params: CallRetrieveCallsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallRetrieveCallsResponse>

        /** @see retrieveCalls */
        @MustBeClosed
        fun retrieveCalls(
            params: CallRetrieveCallsParams
        ): HttpResponseFor<CallRetrieveCallsResponse> = retrieveCalls(params, RequestOptions.none())

        /** @see retrieveCalls */
        @MustBeClosed
        fun retrieveCalls(
            accountSid: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallRetrieveCallsResponse> =
            retrieveCalls(accountSid, CallRetrieveCallsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /texml/Accounts/{account_sid}/Calls/{call_sid}/Siprec.json`, but is otherwise the same as
         * [CallService.siprecJson].
         */
        @MustBeClosed
        fun siprecJson(
            callSid: String,
            params: CallSiprecJsonParams,
        ): HttpResponseFor<CallSiprecJsonResponse> =
            siprecJson(callSid, params, RequestOptions.none())

        /** @see siprecJson */
        @MustBeClosed
        fun siprecJson(
            callSid: String,
            params: CallSiprecJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallSiprecJsonResponse> =
            siprecJson(params.toBuilder().callSid(callSid).build(), requestOptions)

        /** @see siprecJson */
        @MustBeClosed
        fun siprecJson(params: CallSiprecJsonParams): HttpResponseFor<CallSiprecJsonResponse> =
            siprecJson(params, RequestOptions.none())

        /** @see siprecJson */
        @MustBeClosed
        fun siprecJson(
            params: CallSiprecJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallSiprecJsonResponse>

        /**
         * Returns a raw HTTP response for `post
         * /texml/Accounts/{account_sid}/Calls/{call_sid}/Streams.json`, but is otherwise the same
         * as [CallService.streamsJson].
         */
        @MustBeClosed
        fun streamsJson(
            callSid: String,
            params: CallStreamsJsonParams,
        ): HttpResponseFor<CallStreamsJsonResponse> =
            streamsJson(callSid, params, RequestOptions.none())

        /** @see streamsJson */
        @MustBeClosed
        fun streamsJson(
            callSid: String,
            params: CallStreamsJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallStreamsJsonResponse> =
            streamsJson(params.toBuilder().callSid(callSid).build(), requestOptions)

        /** @see streamsJson */
        @MustBeClosed
        fun streamsJson(params: CallStreamsJsonParams): HttpResponseFor<CallStreamsJsonResponse> =
            streamsJson(params, RequestOptions.none())

        /** @see streamsJson */
        @MustBeClosed
        fun streamsJson(
            params: CallStreamsJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallStreamsJsonResponse>
    }
}
