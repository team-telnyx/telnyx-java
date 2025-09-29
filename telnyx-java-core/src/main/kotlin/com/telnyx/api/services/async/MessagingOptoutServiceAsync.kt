// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.messagingoptouts.MessagingOptoutListParams
import com.telnyx.api.models.messagingoptouts.MessagingOptoutListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MessagingOptoutServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessagingOptoutServiceAsync

    /** Retrieve a list of opt-out blocks. */
    fun list(): CompletableFuture<MessagingOptoutListResponse> =
        list(MessagingOptoutListParams.none())

    /** @see list */
    fun list(
        params: MessagingOptoutListParams = MessagingOptoutListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingOptoutListResponse>

    /** @see list */
    fun list(
        params: MessagingOptoutListParams = MessagingOptoutListParams.none()
    ): CompletableFuture<MessagingOptoutListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MessagingOptoutListResponse> =
        list(MessagingOptoutListParams.none(), requestOptions)

    /**
     * A view of [MessagingOptoutServiceAsync] that provides access to raw HTTP responses for each
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
        ): MessagingOptoutServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /messaging_optouts`, but is otherwise the same as
         * [MessagingOptoutServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MessagingOptoutListResponse>> =
            list(MessagingOptoutListParams.none())

        /** @see list */
        fun list(
            params: MessagingOptoutListParams = MessagingOptoutListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingOptoutListResponse>>

        /** @see list */
        fun list(
            params: MessagingOptoutListParams = MessagingOptoutListParams.none()
        ): CompletableFuture<HttpResponseFor<MessagingOptoutListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MessagingOptoutListResponse>> =
            list(MessagingOptoutListParams.none(), requestOptions)
    }
}
