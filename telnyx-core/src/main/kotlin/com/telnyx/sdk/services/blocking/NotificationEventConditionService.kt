// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.notificationeventconditions.NotificationEventConditionListPage
import com.telnyx.sdk.models.notificationeventconditions.NotificationEventConditionListParams
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
    fun list(): NotificationEventConditionListPage =
        list(NotificationEventConditionListParams.none())

    /** @see list */
    fun list(
        params: NotificationEventConditionListParams = NotificationEventConditionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationEventConditionListPage

    /** @see list */
    fun list(
        params: NotificationEventConditionListParams = NotificationEventConditionListParams.none()
    ): NotificationEventConditionListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): NotificationEventConditionListPage =
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
        fun list(): HttpResponseFor<NotificationEventConditionListPage> =
            list(NotificationEventConditionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: NotificationEventConditionListParams =
                NotificationEventConditionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationEventConditionListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: NotificationEventConditionListParams =
                NotificationEventConditionListParams.none()
        ): HttpResponseFor<NotificationEventConditionListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<NotificationEventConditionListPage> =
            list(NotificationEventConditionListParams.none(), requestOptions)
    }
}
