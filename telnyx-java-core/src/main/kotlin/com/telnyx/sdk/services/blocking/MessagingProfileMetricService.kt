// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messagingprofilemetrics.MessagingProfileMetricListParams
import com.telnyx.sdk.models.messagingprofilemetrics.MessagingProfileMetricListResponse
import java.util.function.Consumer

interface MessagingProfileMetricService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessagingProfileMetricService

    /** List high-level metrics for all messaging profiles belonging to the authenticated user. */
    fun list(): MessagingProfileMetricListResponse = list(MessagingProfileMetricListParams.none())

    /** @see list */
    fun list(
        params: MessagingProfileMetricListParams = MessagingProfileMetricListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingProfileMetricListResponse

    /** @see list */
    fun list(
        params: MessagingProfileMetricListParams = MessagingProfileMetricListParams.none()
    ): MessagingProfileMetricListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MessagingProfileMetricListResponse =
        list(MessagingProfileMetricListParams.none(), requestOptions)

    /**
     * A view of [MessagingProfileMetricService] that provides access to raw HTTP responses for each
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
        ): MessagingProfileMetricService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /messaging_profile_metrics`, but is otherwise the
         * same as [MessagingProfileMetricService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<MessagingProfileMetricListResponse> =
            list(MessagingProfileMetricListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessagingProfileMetricListParams = MessagingProfileMetricListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingProfileMetricListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessagingProfileMetricListParams = MessagingProfileMetricListParams.none()
        ): HttpResponseFor<MessagingProfileMetricListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<MessagingProfileMetricListResponse> =
            list(MessagingProfileMetricListParams.none(), requestOptions)
    }
}
