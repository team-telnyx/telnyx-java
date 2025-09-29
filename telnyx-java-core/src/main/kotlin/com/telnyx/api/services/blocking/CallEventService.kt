// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.callevents.CallEventListParams
import com.telnyx.api.models.callevents.CallEventListResponse
import java.util.function.Consumer

interface CallEventService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallEventService

    /**
     * Filters call events by given filter parameters. Events are ordered by `occurred_at`. If
     * filter for `leg_id` or `application_session_id` is not present, it only filters events from
     * the last 24 hours.
     *
     * **Note**: Only one `filter[occurred_at]` can be passed.
     */
    fun list(): CallEventListResponse = list(CallEventListParams.none())

    /** @see list */
    fun list(
        params: CallEventListParams = CallEventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallEventListResponse

    /** @see list */
    fun list(params: CallEventListParams = CallEventListParams.none()): CallEventListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CallEventListResponse =
        list(CallEventListParams.none(), requestOptions)

    /** A view of [CallEventService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallEventService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /call_events`, but is otherwise the same as
         * [CallEventService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CallEventListResponse> = list(CallEventListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CallEventListParams = CallEventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallEventListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CallEventListParams = CallEventListParams.none()
        ): HttpResponseFor<CallEventListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CallEventListResponse> =
            list(CallEventListParams.none(), requestOptions)
    }
}
