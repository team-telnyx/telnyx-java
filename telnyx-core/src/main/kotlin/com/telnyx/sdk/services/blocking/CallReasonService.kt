// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.callreasons.CallReasonListPage
import com.telnyx.sdk.models.callreasons.CallReasonListParams
import com.telnyx.sdk.models.callreasons.CallReasonValidateParams
import com.telnyx.sdk.models.callreasons.CallReasonValidateResponse
import java.util.function.Consumer

/** Static reference values the API accepts: call reasons, document types, rejection types. */
interface CallReasonService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallReasonService

    /**
     * Telnyx maintains a library of pre-vetted call-reason phrases (e.g. "Appointment reminders",
     * "Billing inquiries") that carry through DIR vetting smoothly. You can use any string that
     * fits your use case in `DirCreateRequest.call_reasons`, but matching one of these reduces the
     * chance the vetting team flags the phrasing for clarification.
     */
    fun list(): CallReasonListPage = list(CallReasonListParams.none())

    /** @see list */
    fun list(
        params: CallReasonListParams = CallReasonListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallReasonListPage

    /** @see list */
    fun list(params: CallReasonListParams = CallReasonListParams.none()): CallReasonListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CallReasonListPage =
        list(CallReasonListParams.none(), requestOptions)

    /**
     * Check up to 10 candidate `call_reasons` strings against Telnyx's vetting heuristics before
     * sending them on a DIR create or update. The endpoint flags strings that are likely to be
     * rejected during vetting (too generic, banned phrases, length issues, etc.) so you can fix
     * them up front.
     */
    fun validate(params: CallReasonValidateParams): CallReasonValidateResponse =
        validate(params, RequestOptions.none())

    /** @see validate */
    fun validate(
        params: CallReasonValidateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallReasonValidateResponse

    /** @see validate */
    fun validate(
        body: List<String>,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallReasonValidateResponse =
        validate(CallReasonValidateParams.builder().body(body).build(), requestOptions)

    /** @see validate */
    fun validate(body: List<String>): CallReasonValidateResponse =
        validate(body, RequestOptions.none())

    /** A view of [CallReasonService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CallReasonService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /call_reasons`, but is otherwise the same as
         * [CallReasonService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CallReasonListPage> = list(CallReasonListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CallReasonListParams = CallReasonListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallReasonListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CallReasonListParams = CallReasonListParams.none()
        ): HttpResponseFor<CallReasonListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CallReasonListPage> =
            list(CallReasonListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /call_reasons/validate`, but is otherwise the same
         * as [CallReasonService.validate].
         */
        @MustBeClosed
        fun validate(
            params: CallReasonValidateParams
        ): HttpResponseFor<CallReasonValidateResponse> = validate(params, RequestOptions.none())

        /** @see validate */
        @MustBeClosed
        fun validate(
            params: CallReasonValidateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallReasonValidateResponse>

        /** @see validate */
        @MustBeClosed
        fun validate(
            body: List<String>,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallReasonValidateResponse> =
            validate(CallReasonValidateParams.builder().body(body).build(), requestOptions)

        /** @see validate */
        @MustBeClosed
        fun validate(body: List<String>): HttpResponseFor<CallReasonValidateResponse> =
            validate(body, RequestOptions.none())
    }
}
