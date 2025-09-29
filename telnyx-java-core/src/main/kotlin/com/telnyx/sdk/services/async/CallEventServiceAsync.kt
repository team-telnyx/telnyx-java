// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.callevents.CallEventListParams
import com.telnyx.sdk.models.callevents.CallEventListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CallEventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallEventServiceAsync

    /**
     * Filters call events by given filter parameters. Events are ordered by `occurred_at`. If
     * filter for `leg_id` or `application_session_id` is not present, it only filters events from
     * the last 24 hours.
     *
     * **Note**: Only one `filter[occurred_at]` can be passed.
     */
    fun list(): CompletableFuture<CallEventListResponse> = list(CallEventListParams.none())

    /** @see list */
    fun list(
        params: CallEventListParams = CallEventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallEventListResponse>

    /** @see list */
    fun list(
        params: CallEventListParams = CallEventListParams.none()
    ): CompletableFuture<CallEventListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CallEventListResponse> =
        list(CallEventListParams.none(), requestOptions)

    /**
     * A view of [CallEventServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CallEventServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /call_events`, but is otherwise the same as
         * [CallEventServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CallEventListResponse>> =
            list(CallEventListParams.none())

        /** @see list */
        fun list(
            params: CallEventListParams = CallEventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallEventListResponse>>

        /** @see list */
        fun list(
            params: CallEventListParams = CallEventListParams.none()
        ): CompletableFuture<HttpResponseFor<CallEventListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CallEventListResponse>> =
            list(CallEventListParams.none(), requestOptions)
    }
}
