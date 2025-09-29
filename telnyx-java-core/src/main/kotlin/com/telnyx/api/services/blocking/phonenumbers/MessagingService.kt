// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.phonenumbers

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.phonenumbers.messaging.MessagingListParams
import com.telnyx.api.models.phonenumbers.messaging.MessagingListResponse
import com.telnyx.api.models.phonenumbers.messaging.MessagingRetrieveParams
import com.telnyx.api.models.phonenumbers.messaging.MessagingRetrieveResponse
import com.telnyx.api.models.phonenumbers.messaging.MessagingUpdateParams
import com.telnyx.api.models.phonenumbers.messaging.MessagingUpdateResponse
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

    /** Retrieve a phone number with messaging settings */
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

    /** Update the messaging profile and/or messaging product of a phone number */
    fun update(id: String): MessagingUpdateResponse = update(id, MessagingUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: MessagingUpdateParams = MessagingUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: MessagingUpdateParams = MessagingUpdateParams.none(),
    ): MessagingUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MessagingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingUpdateResponse

    /** @see update */
    fun update(params: MessagingUpdateParams): MessagingUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): MessagingUpdateResponse =
        update(id, MessagingUpdateParams.none(), requestOptions)

    /** List phone numbers with messaging settings */
    fun list(): MessagingListResponse = list(MessagingListParams.none())

    /** @see list */
    fun list(
        params: MessagingListParams = MessagingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingListResponse

    /** @see list */
    fun list(params: MessagingListParams = MessagingListParams.none()): MessagingListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MessagingListResponse =
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
         * Returns a raw HTTP response for `get /phone_numbers/{id}/messaging`, but is otherwise the
         * same as [MessagingService.retrieve].
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
         * Returns a raw HTTP response for `patch /phone_numbers/{id}/messaging`, but is otherwise
         * the same as [MessagingService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<MessagingUpdateResponse> =
            update(id, MessagingUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: MessagingUpdateParams = MessagingUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: MessagingUpdateParams = MessagingUpdateParams.none(),
        ): HttpResponseFor<MessagingUpdateResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: MessagingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: MessagingUpdateParams): HttpResponseFor<MessagingUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingUpdateResponse> =
            update(id, MessagingUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /phone_numbers/messaging`, but is otherwise the same
         * as [MessagingService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<MessagingListResponse> = list(MessagingListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessagingListParams = MessagingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessagingListParams = MessagingListParams.none()
        ): HttpResponseFor<MessagingListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MessagingListResponse> =
            list(MessagingListParams.none(), requestOptions)
    }
}
