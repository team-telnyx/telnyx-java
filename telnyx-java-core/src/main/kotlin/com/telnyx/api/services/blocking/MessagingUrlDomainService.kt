// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.messagingurldomains.MessagingUrlDomainListParams
import com.telnyx.api.models.messagingurldomains.MessagingUrlDomainListResponse
import java.util.function.Consumer

interface MessagingUrlDomainService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessagingUrlDomainService

    /** List messaging URL domains */
    fun list(): MessagingUrlDomainListResponse = list(MessagingUrlDomainListParams.none())

    /** @see list */
    fun list(
        params: MessagingUrlDomainListParams = MessagingUrlDomainListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingUrlDomainListResponse

    /** @see list */
    fun list(
        params: MessagingUrlDomainListParams = MessagingUrlDomainListParams.none()
    ): MessagingUrlDomainListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MessagingUrlDomainListResponse =
        list(MessagingUrlDomainListParams.none(), requestOptions)

    /**
     * A view of [MessagingUrlDomainService] that provides access to raw HTTP responses for each
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
        ): MessagingUrlDomainService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /messaging_url_domains`, but is otherwise the same
         * as [MessagingUrlDomainService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<MessagingUrlDomainListResponse> =
            list(MessagingUrlDomainListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessagingUrlDomainListParams = MessagingUrlDomainListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingUrlDomainListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessagingUrlDomainListParams = MessagingUrlDomainListParams.none()
        ): HttpResponseFor<MessagingUrlDomainListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MessagingUrlDomainListResponse> =
            list(MessagingUrlDomainListParams.none(), requestOptions)
    }
}
