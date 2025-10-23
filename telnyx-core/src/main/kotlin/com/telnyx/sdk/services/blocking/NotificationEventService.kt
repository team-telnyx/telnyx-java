// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.notificationevents.NotificationEventListParams
import com.telnyx.sdk.models.notificationevents.NotificationEventListResponse
import java.util.function.Consumer

interface NotificationEventService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationEventService

    /** Returns a list of your notifications events. */
    fun list(): NotificationEventListResponse = list(NotificationEventListParams.none())

    /** @see list */
    fun list(
        params: NotificationEventListParams = NotificationEventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationEventListResponse

    /** @see list */
    fun list(
        params: NotificationEventListParams = NotificationEventListParams.none()
    ): NotificationEventListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): NotificationEventListResponse =
        list(NotificationEventListParams.none(), requestOptions)

    /**
     * A view of [NotificationEventService] that provides access to raw HTTP responses for each
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
        ): NotificationEventService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /notification_events`, but is otherwise the same as
         * [NotificationEventService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<NotificationEventListResponse> =
            list(NotificationEventListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: NotificationEventListParams = NotificationEventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationEventListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: NotificationEventListParams = NotificationEventListParams.none()
        ): HttpResponseFor<NotificationEventListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<NotificationEventListResponse> =
            list(NotificationEventListParams.none(), requestOptions)
    }
}
