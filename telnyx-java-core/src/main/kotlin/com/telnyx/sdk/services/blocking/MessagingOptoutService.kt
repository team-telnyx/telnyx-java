// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messagingoptouts.MessagingOptoutListParams
import com.telnyx.sdk.models.messagingoptouts.MessagingOptoutListResponse
import java.util.function.Consumer

interface MessagingOptoutService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessagingOptoutService

    /** Retrieve a list of opt-out blocks. */
    fun list(): MessagingOptoutListResponse = list(MessagingOptoutListParams.none())

    /** @see list */
    fun list(
        params: MessagingOptoutListParams = MessagingOptoutListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingOptoutListResponse

    /** @see list */
    fun list(
        params: MessagingOptoutListParams = MessagingOptoutListParams.none()
    ): MessagingOptoutListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MessagingOptoutListResponse =
        list(MessagingOptoutListParams.none(), requestOptions)

    /**
     * A view of [MessagingOptoutService] that provides access to raw HTTP responses for each
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
        ): MessagingOptoutService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /messaging_optouts`, but is otherwise the same as
         * [MessagingOptoutService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<MessagingOptoutListResponse> =
            list(MessagingOptoutListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessagingOptoutListParams = MessagingOptoutListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingOptoutListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessagingOptoutListParams = MessagingOptoutListParams.none()
        ): HttpResponseFor<MessagingOptoutListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MessagingOptoutListResponse> =
            list(MessagingOptoutListParams.none(), requestOptions)
    }
}
