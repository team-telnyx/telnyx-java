// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.notificationevents.NotificationEventListParams
import com.telnyx.sdk.models.notificationevents.NotificationEventListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface NotificationEventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationEventServiceAsync

    /** Returns a list of your notifications events. */
    fun list(): CompletableFuture<NotificationEventListResponse> =
        list(NotificationEventListParams.none())

    /** @see list */
    fun list(
        params: NotificationEventListParams = NotificationEventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationEventListResponse>

    /** @see list */
    fun list(
        params: NotificationEventListParams = NotificationEventListParams.none()
    ): CompletableFuture<NotificationEventListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<NotificationEventListResponse> =
        list(NotificationEventListParams.none(), requestOptions)

    /**
     * A view of [NotificationEventServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NotificationEventServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /notification_events`, but is otherwise the same as
         * [NotificationEventServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<NotificationEventListResponse>> =
            list(NotificationEventListParams.none())

        /** @see list */
        fun list(
            params: NotificationEventListParams = NotificationEventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationEventListResponse>>

        /** @see list */
        fun list(
            params: NotificationEventListParams = NotificationEventListParams.none()
        ): CompletableFuture<HttpResponseFor<NotificationEventListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<NotificationEventListResponse>> =
            list(NotificationEventListParams.none(), requestOptions)
    }
}
