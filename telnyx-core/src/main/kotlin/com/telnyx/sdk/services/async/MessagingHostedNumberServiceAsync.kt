// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messaginghostednumbers.MessagingHostedNumberDeleteParams
import com.telnyx.sdk.models.messaginghostednumbers.MessagingHostedNumberDeleteResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MessagingHostedNumberServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessagingHostedNumberServiceAsync

    /** Delete a messaging hosted number */
    fun delete(id: String): CompletableFuture<MessagingHostedNumberDeleteResponse> =
        delete(id, MessagingHostedNumberDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: MessagingHostedNumberDeleteParams = MessagingHostedNumberDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingHostedNumberDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: MessagingHostedNumberDeleteParams = MessagingHostedNumberDeleteParams.none(),
    ): CompletableFuture<MessagingHostedNumberDeleteResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MessagingHostedNumberDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingHostedNumberDeleteResponse>

    /** @see delete */
    fun delete(
        params: MessagingHostedNumberDeleteParams
    ): CompletableFuture<MessagingHostedNumberDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingHostedNumberDeleteResponse> =
        delete(id, MessagingHostedNumberDeleteParams.none(), requestOptions)

    /**
     * A view of [MessagingHostedNumberServiceAsync] that provides access to raw HTTP responses for
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
        ): MessagingHostedNumberServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /messaging_hosted_numbers/{id}`, but is otherwise
         * the same as [MessagingHostedNumberServiceAsync.delete].
         */
        fun delete(
            id: String
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberDeleteResponse>> =
            delete(id, MessagingHostedNumberDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: MessagingHostedNumberDeleteParams = MessagingHostedNumberDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: MessagingHostedNumberDeleteParams = MessagingHostedNumberDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: MessagingHostedNumberDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberDeleteResponse>>

        /** @see delete */
        fun delete(
            params: MessagingHostedNumberDeleteParams
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberDeleteResponse>> =
            delete(id, MessagingHostedNumberDeleteParams.none(), requestOptions)
    }
}
