// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messagingurldomains.MessagingUrlDomainListPageAsync
import com.telnyx.sdk.models.messagingurldomains.MessagingUrlDomainListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MessagingUrlDomainServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessagingUrlDomainServiceAsync

    /** List messaging URL domains */
    fun list(): CompletableFuture<MessagingUrlDomainListPageAsync> =
        list(MessagingUrlDomainListParams.none())

    /** @see list */
    fun list(
        params: MessagingUrlDomainListParams = MessagingUrlDomainListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingUrlDomainListPageAsync>

    /** @see list */
    fun list(
        params: MessagingUrlDomainListParams = MessagingUrlDomainListParams.none()
    ): CompletableFuture<MessagingUrlDomainListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MessagingUrlDomainListPageAsync> =
        list(MessagingUrlDomainListParams.none(), requestOptions)

    /**
     * A view of [MessagingUrlDomainServiceAsync] that provides access to raw HTTP responses for
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
        ): MessagingUrlDomainServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /messaging_url_domains`, but is otherwise the same
         * as [MessagingUrlDomainServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MessagingUrlDomainListPageAsync>> =
            list(MessagingUrlDomainListParams.none())

        /** @see list */
        fun list(
            params: MessagingUrlDomainListParams = MessagingUrlDomainListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingUrlDomainListPageAsync>>

        /** @see list */
        fun list(
            params: MessagingUrlDomainListParams = MessagingUrlDomainListParams.none()
        ): CompletableFuture<HttpResponseFor<MessagingUrlDomainListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MessagingUrlDomainListPageAsync>> =
            list(MessagingUrlDomainListParams.none(), requestOptions)
    }
}
