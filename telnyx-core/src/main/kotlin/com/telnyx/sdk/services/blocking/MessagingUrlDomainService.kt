// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messagingurldomains.MessagingUrlDomainListPage
import com.telnyx.sdk.models.messagingurldomains.MessagingUrlDomainListParams
import java.util.function.Consumer

/** Messaging URL Domains */
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
    fun list(): MessagingUrlDomainListPage = list(MessagingUrlDomainListParams.none())

    /** @see list */
    fun list(
        params: MessagingUrlDomainListParams = MessagingUrlDomainListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingUrlDomainListPage

    /** @see list */
    fun list(
        params: MessagingUrlDomainListParams = MessagingUrlDomainListParams.none()
    ): MessagingUrlDomainListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MessagingUrlDomainListPage =
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
        fun list(): HttpResponseFor<MessagingUrlDomainListPage> =
            list(MessagingUrlDomainListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessagingUrlDomainListParams = MessagingUrlDomainListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingUrlDomainListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessagingUrlDomainListParams = MessagingUrlDomainListParams.none()
        ): HttpResponseFor<MessagingUrlDomainListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MessagingUrlDomainListPage> =
            list(MessagingUrlDomainListParams.none(), requestOptions)
    }
}
