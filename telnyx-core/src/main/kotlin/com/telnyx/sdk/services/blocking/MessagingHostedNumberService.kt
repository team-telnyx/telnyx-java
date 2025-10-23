// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messaginghostednumbers.MessagingHostedNumberDeleteParams
import com.telnyx.sdk.models.messaginghostednumbers.MessagingHostedNumberDeleteResponse
import java.util.function.Consumer

interface MessagingHostedNumberService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessagingHostedNumberService

    /** Delete a messaging hosted number */
    fun delete(id: String): MessagingHostedNumberDeleteResponse =
        delete(id, MessagingHostedNumberDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: MessagingHostedNumberDeleteParams = MessagingHostedNumberDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingHostedNumberDeleteResponse =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: MessagingHostedNumberDeleteParams = MessagingHostedNumberDeleteParams.none(),
    ): MessagingHostedNumberDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MessagingHostedNumberDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingHostedNumberDeleteResponse

    /** @see delete */
    fun delete(params: MessagingHostedNumberDeleteParams): MessagingHostedNumberDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): MessagingHostedNumberDeleteResponse =
        delete(id, MessagingHostedNumberDeleteParams.none(), requestOptions)

    /**
     * A view of [MessagingHostedNumberService] that provides access to raw HTTP responses for each
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
        ): MessagingHostedNumberService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /messaging_hosted_numbers/{id}`, but is otherwise
         * the same as [MessagingHostedNumberService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<MessagingHostedNumberDeleteResponse> =
            delete(id, MessagingHostedNumberDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: MessagingHostedNumberDeleteParams = MessagingHostedNumberDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingHostedNumberDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: MessagingHostedNumberDeleteParams = MessagingHostedNumberDeleteParams.none(),
        ): HttpResponseFor<MessagingHostedNumberDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: MessagingHostedNumberDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingHostedNumberDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: MessagingHostedNumberDeleteParams
        ): HttpResponseFor<MessagingHostedNumberDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingHostedNumberDeleteResponse> =
            delete(id, MessagingHostedNumberDeleteParams.none(), requestOptions)
    }
}
