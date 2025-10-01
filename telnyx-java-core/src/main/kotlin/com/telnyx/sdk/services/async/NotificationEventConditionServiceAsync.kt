// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.notificationeventconditions.NotificationEventConditionListParams
import com.telnyx.sdk.models.notificationeventconditions.NotificationEventConditionListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface NotificationEventConditionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): NotificationEventConditionServiceAsync

    /** Returns a list of your notifications events conditions. */
    fun list(): CompletableFuture<NotificationEventConditionListResponse> =
        list(NotificationEventConditionListParams.none())

    /** @see list */
    fun list(
        params: NotificationEventConditionListParams = NotificationEventConditionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationEventConditionListResponse>

    /** @see list */
    fun list(
        params: NotificationEventConditionListParams = NotificationEventConditionListParams.none()
    ): CompletableFuture<NotificationEventConditionListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<NotificationEventConditionListResponse> =
        list(NotificationEventConditionListParams.none(), requestOptions)

    /**
     * A view of [NotificationEventConditionServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NotificationEventConditionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /notification_event_conditions`, but is otherwise
         * the same as [NotificationEventConditionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<NotificationEventConditionListResponse>> =
            list(NotificationEventConditionListParams.none())

        /** @see list */
        fun list(
            params: NotificationEventConditionListParams =
                NotificationEventConditionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationEventConditionListResponse>>

        /** @see list */
        fun list(
            params: NotificationEventConditionListParams =
                NotificationEventConditionListParams.none()
        ): CompletableFuture<HttpResponseFor<NotificationEventConditionListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<NotificationEventConditionListResponse>> =
            list(NotificationEventConditionListParams.none(), requestOptions)
    }
}
