// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.notificationeventconditions.NotificationEventConditionListParams
import com.telnyx.api.models.notificationeventconditions.NotificationEventConditionListResponse
import java.util.function.Consumer

interface NotificationEventConditionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationEventConditionService

    /** Returns a list of your notifications events conditions. */
    fun list(): NotificationEventConditionListResponse =
        list(NotificationEventConditionListParams.none())

    /** @see list */
    fun list(
        params: NotificationEventConditionListParams = NotificationEventConditionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationEventConditionListResponse

    /** @see list */
    fun list(
        params: NotificationEventConditionListParams = NotificationEventConditionListParams.none()
    ): NotificationEventConditionListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): NotificationEventConditionListResponse =
        list(NotificationEventConditionListParams.none(), requestOptions)

    /**
     * A view of [NotificationEventConditionService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NotificationEventConditionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /notification_event_conditions`, but is otherwise
         * the same as [NotificationEventConditionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<NotificationEventConditionListResponse> =
            list(NotificationEventConditionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: NotificationEventConditionListParams =
                NotificationEventConditionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationEventConditionListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: NotificationEventConditionListParams =
                NotificationEventConditionListParams.none()
        ): HttpResponseFor<NotificationEventConditionListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<NotificationEventConditionListResponse> =
            list(NotificationEventConditionListParams.none(), requestOptions)
    }
}
