// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messagingprofilemetrics.MessagingProfileMetricListParams
import com.telnyx.sdk.models.messagingprofilemetrics.MessagingProfileMetricListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MessagingProfileMetricServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessagingProfileMetricServiceAsync

    /** List high-level metrics for all messaging profiles belonging to the authenticated user. */
    fun list(): CompletableFuture<MessagingProfileMetricListResponse> =
        list(MessagingProfileMetricListParams.none())

    /** @see list */
    fun list(
        params: MessagingProfileMetricListParams = MessagingProfileMetricListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingProfileMetricListResponse>

    /** @see list */
    fun list(
        params: MessagingProfileMetricListParams = MessagingProfileMetricListParams.none()
    ): CompletableFuture<MessagingProfileMetricListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<MessagingProfileMetricListResponse> =
        list(MessagingProfileMetricListParams.none(), requestOptions)

    /**
     * A view of [MessagingProfileMetricServiceAsync] that provides access to raw HTTP responses for
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
        ): MessagingProfileMetricServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /messaging_profile_metrics`, but is otherwise the
         * same as [MessagingProfileMetricServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MessagingProfileMetricListResponse>> =
            list(MessagingProfileMetricListParams.none())

        /** @see list */
        fun list(
            params: MessagingProfileMetricListParams = MessagingProfileMetricListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingProfileMetricListResponse>>

        /** @see list */
        fun list(
            params: MessagingProfileMetricListParams = MessagingProfileMetricListParams.none()
        ): CompletableFuture<HttpResponseFor<MessagingProfileMetricListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MessagingProfileMetricListResponse>> =
            list(MessagingProfileMetricListParams.none(), requestOptions)
    }
}
