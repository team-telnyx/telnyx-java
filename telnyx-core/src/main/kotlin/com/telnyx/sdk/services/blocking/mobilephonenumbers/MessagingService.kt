// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.mobilephonenumbers

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.mobilephonenumbers.messaging.MessagingListPage
import com.telnyx.sdk.models.mobilephonenumbers.messaging.MessagingListParams
import com.telnyx.sdk.models.mobilephonenumbers.messaging.MessagingRetrieveParams
import com.telnyx.sdk.models.mobilephonenumbers.messaging.MessagingRetrieveResponse
import java.util.function.Consumer

interface MessagingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessagingService

    /** Retrieve a mobile phone number with messaging settings */
    fun retrieve(id: String): MessagingRetrieveResponse =
        retrieve(id, MessagingRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MessagingRetrieveParams = MessagingRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MessagingRetrieveParams = MessagingRetrieveParams.none(),
    ): MessagingRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MessagingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: MessagingRetrieveParams): MessagingRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): MessagingRetrieveResponse =
        retrieve(id, MessagingRetrieveParams.none(), requestOptions)

    /** List mobile phone numbers with messaging settings */
    fun list(): MessagingListPage = list(MessagingListParams.none())

    /** @see list */
    fun list(
        params: MessagingListParams = MessagingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingListPage

    /** @see list */
    fun list(params: MessagingListParams = MessagingListParams.none()): MessagingListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MessagingListPage =
        list(MessagingListParams.none(), requestOptions)

    /** A view of [MessagingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessagingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /mobile_phone_numbers/{id}/messaging`, but is
         * otherwise the same as [MessagingService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<MessagingRetrieveResponse> =
            retrieve(id, MessagingRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: MessagingRetrieveParams = MessagingRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: MessagingRetrieveParams = MessagingRetrieveParams.none(),
        ): HttpResponseFor<MessagingRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MessagingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: MessagingRetrieveParams): HttpResponseFor<MessagingRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingRetrieveResponse> =
            retrieve(id, MessagingRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /mobile_phone_numbers/messaging`, but is otherwise
         * the same as [MessagingService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<MessagingListPage> = list(MessagingListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessagingListParams = MessagingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessagingListParams = MessagingListParams.none()
        ): HttpResponseFor<MessagingListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MessagingListPage> =
            list(MessagingListParams.none(), requestOptions)
    }
}
