// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messagingoptouts.MessagingOptoutListPageAsync
import com.telnyx.sdk.models.messagingoptouts.MessagingOptoutListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Opt-Out Management */
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
    fun list(): CompletableFuture<MessagingOptoutListPageAsync> =
        list(MessagingOptoutListParams.none())

    /** @see list */
    fun list(
        params: MessagingOptoutListParams = MessagingOptoutListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingOptoutListPageAsync>

    /** @see list */
    fun list(
        params: MessagingOptoutListParams = MessagingOptoutListParams.none()
    ): CompletableFuture<MessagingOptoutListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MessagingOptoutListPageAsync> =
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
        fun list(): CompletableFuture<HttpResponseFor<MessagingOptoutListPageAsync>> =
            list(MessagingOptoutListParams.none())

        /** @see list */
        fun list(
            params: MessagingOptoutListParams = MessagingOptoutListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingOptoutListPageAsync>>

        /** @see list */
        fun list(
            params: MessagingOptoutListParams = MessagingOptoutListParams.none()
        ): CompletableFuture<HttpResponseFor<MessagingOptoutListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MessagingOptoutListPageAsync>> =
            list(MessagingOptoutListParams.none(), requestOptions)
    }
}
