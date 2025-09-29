// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.messagingurldomains.MessagingUrlDomainListParams
import com.telnyx.api.models.messagingurldomains.MessagingUrlDomainListResponse
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
    fun list(): CompletableFuture<MessagingUrlDomainListResponse> =
        list(MessagingUrlDomainListParams.none())

    /** @see list */
    fun list(
        params: MessagingUrlDomainListParams = MessagingUrlDomainListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingUrlDomainListResponse>

    /** @see list */
    fun list(
        params: MessagingUrlDomainListParams = MessagingUrlDomainListParams.none()
    ): CompletableFuture<MessagingUrlDomainListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MessagingUrlDomainListResponse> =
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
        fun list(): CompletableFuture<HttpResponseFor<MessagingUrlDomainListResponse>> =
            list(MessagingUrlDomainListParams.none())

        /** @see list */
        fun list(
            params: MessagingUrlDomainListParams = MessagingUrlDomainListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingUrlDomainListResponse>>

        /** @see list */
        fun list(
            params: MessagingUrlDomainListParams = MessagingUrlDomainListParams.none()
        ): CompletableFuture<HttpResponseFor<MessagingUrlDomainListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MessagingUrlDomainListResponse>> =
            list(MessagingUrlDomainListParams.none(), requestOptions)
    }
}
