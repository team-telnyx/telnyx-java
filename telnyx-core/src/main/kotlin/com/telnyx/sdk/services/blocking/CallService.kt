// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.calls.CallDialParams
import com.telnyx.sdk.models.calls.CallDialResponse
import com.telnyx.sdk.models.calls.CallRetrieveStatusParams
import com.telnyx.sdk.models.calls.CallRetrieveStatusResponse
import com.telnyx.sdk.services.blocking.calls.ActionService
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

    /** Call Control command operations */
    fun actions(): ActionService

    /**
     * Dial a number or SIP URI from a given connection. A successful response will include a
     * `call_leg_id` which can be used to correlate the command with subsequent webhooks.
     *
     * **Expected Webhooks:**
     * - `call.initiated`
     * - `call.answered` or `call.hangup`
     * - `call.machine.detection.ended` if `answering_machine_detection` was requested
     * - `call.machine.greeting.ended` if `answering_machine_detection` was requested to detect the
     *   end of machine greeting
     * - `call.machine.premium.detection.ended` if `answering_machine_detection=premium` was
     *   requested
     * - `call.machine.premium.greeting.ended` if `answering_machine_detection=premium` was
     *   requested and a beep was detected
     * - `streaming.started`, `streaming.stopped` or `streaming.failed` if `stream_url` was set
     *
     * When the `record` parameter is set to `record-from-answer`, the response will include a
     * `recording_id` field.
     */
    fun dial(params: CallDialParams): CallDialResponse = dial(params, RequestOptions.none())

    /** @see dial */
    fun dial(
        params: CallDialParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallDialResponse

    /** Returns the status of a call (data is available 10 minutes after call ended). */
    fun retrieveStatus(callControlId: String): CallRetrieveStatusResponse =
        retrieveStatus(callControlId, CallRetrieveStatusParams.none())

    /** @see retrieveStatus */
    fun retrieveStatus(
        callControlId: String,
        params: CallRetrieveStatusParams = CallRetrieveStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallRetrieveStatusResponse =
        retrieveStatus(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see retrieveStatus */
    fun retrieveStatus(
        callControlId: String,
        params: CallRetrieveStatusParams = CallRetrieveStatusParams.none(),
    ): CallRetrieveStatusResponse = retrieveStatus(callControlId, params, RequestOptions.none())

    /** @see retrieveStatus */
    fun retrieveStatus(
        params: CallRetrieveStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallRetrieveStatusResponse

    /** @see retrieveStatus */
    fun retrieveStatus(params: CallRetrieveStatusParams): CallRetrieveStatusResponse =
        retrieveStatus(params, RequestOptions.none())

    /** @see retrieveStatus */
    fun retrieveStatus(
        callControlId: String,
        requestOptions: RequestOptions,
    ): CallRetrieveStatusResponse =
        retrieveStatus(callControlId, CallRetrieveStatusParams.none(), requestOptions)

    /** A view of [CallService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallService.WithRawResponse

        /** Call Control command operations */
        fun actions(): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /calls`, but is otherwise the same as
         * [CallService.dial].
         */
        @MustBeClosed
        fun dial(params: CallDialParams): HttpResponseFor<CallDialResponse> =
            dial(params, RequestOptions.none())

        /** @see dial */
        @MustBeClosed
        fun dial(
            params: CallDialParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallDialResponse>

        /**
         * Returns a raw HTTP response for `get /calls/{call_control_id}`, but is otherwise the same
         * as [CallService.retrieveStatus].
         */
        @MustBeClosed
        fun retrieveStatus(callControlId: String): HttpResponseFor<CallRetrieveStatusResponse> =
            retrieveStatus(callControlId, CallRetrieveStatusParams.none())

        /** @see retrieveStatus */
        @MustBeClosed
        fun retrieveStatus(
            callControlId: String,
            params: CallRetrieveStatusParams = CallRetrieveStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallRetrieveStatusResponse> =
            retrieveStatus(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see retrieveStatus */
        @MustBeClosed
        fun retrieveStatus(
            callControlId: String,
            params: CallRetrieveStatusParams = CallRetrieveStatusParams.none(),
        ): HttpResponseFor<CallRetrieveStatusResponse> =
            retrieveStatus(callControlId, params, RequestOptions.none())

        /** @see retrieveStatus */
        @MustBeClosed
        fun retrieveStatus(
            params: CallRetrieveStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallRetrieveStatusResponse>

        /** @see retrieveStatus */
        @MustBeClosed
        fun retrieveStatus(
            params: CallRetrieveStatusParams
        ): HttpResponseFor<CallRetrieveStatusResponse> =
            retrieveStatus(params, RequestOptions.none())

        /** @see retrieveStatus */
        @MustBeClosed
        fun retrieveStatus(
            callControlId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallRetrieveStatusResponse> =
            retrieveStatus(callControlId, CallRetrieveStatusParams.none(), requestOptions)
    }
}
