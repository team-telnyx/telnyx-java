// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.phonenumbers

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.phonenumbers.messaging.MessagingListParams
import com.telnyx.sdk.models.phonenumbers.messaging.MessagingListResponse
import com.telnyx.sdk.models.phonenumbers.messaging.MessagingRetrieveParams
import com.telnyx.sdk.models.phonenumbers.messaging.MessagingRetrieveResponse
import com.telnyx.sdk.models.phonenumbers.messaging.MessagingUpdateParams
import com.telnyx.sdk.models.phonenumbers.messaging.MessagingUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MessagingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessagingServiceAsync

    /** Retrieve a phone number with messaging settings */
    fun retrieve(id: String): CompletableFuture<MessagingRetrieveResponse> =
        retrieve(id, MessagingRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MessagingRetrieveParams = MessagingRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MessagingRetrieveParams = MessagingRetrieveParams.none(),
    ): CompletableFuture<MessagingRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MessagingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: MessagingRetrieveParams): CompletableFuture<MessagingRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingRetrieveResponse> =
        retrieve(id, MessagingRetrieveParams.none(), requestOptions)

    /** Update the messaging profile and/or messaging product of a phone number */
    fun update(id: String): CompletableFuture<MessagingUpdateResponse> =
        update(id, MessagingUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: MessagingUpdateParams = MessagingUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: MessagingUpdateParams = MessagingUpdateParams.none(),
    ): CompletableFuture<MessagingUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MessagingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingUpdateResponse>

    /** @see update */
    fun update(params: MessagingUpdateParams): CompletableFuture<MessagingUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingUpdateResponse> =
        update(id, MessagingUpdateParams.none(), requestOptions)

    /** List phone numbers with messaging settings */
    fun list(): CompletableFuture<MessagingListResponse> = list(MessagingListParams.none())

    /** @see list */
    fun list(
        params: MessagingListParams = MessagingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingListResponse>

    /** @see list */
    fun list(
        params: MessagingListParams = MessagingListParams.none()
    ): CompletableFuture<MessagingListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MessagingListResponse> =
        list(MessagingListParams.none(), requestOptions)

    /**
     * A view of [MessagingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessagingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /phone_numbers/{id}/messaging`, but is otherwise the
         * same as [MessagingServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<MessagingRetrieveResponse>> =
            retrieve(id, MessagingRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: MessagingRetrieveParams = MessagingRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: MessagingRetrieveParams = MessagingRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<MessagingRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: MessagingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: MessagingRetrieveParams
        ): CompletableFuture<HttpResponseFor<MessagingRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingRetrieveResponse>> =
            retrieve(id, MessagingRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /phone_numbers/{id}/messaging`, but is otherwise
         * the same as [MessagingServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<MessagingUpdateResponse>> =
            update(id, MessagingUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: MessagingUpdateParams = MessagingUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: MessagingUpdateParams = MessagingUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<MessagingUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: MessagingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingUpdateResponse>>

        /** @see update */
        fun update(
            params: MessagingUpdateParams
        ): CompletableFuture<HttpResponseFor<MessagingUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingUpdateResponse>> =
            update(id, MessagingUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /phone_numbers/messaging`, but is otherwise the same
         * as [MessagingServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MessagingListResponse>> =
            list(MessagingListParams.none())

        /** @see list */
        fun list(
            params: MessagingListParams = MessagingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingListResponse>>

        /** @see list */
        fun list(
            params: MessagingListParams = MessagingListParams.none()
        ): CompletableFuture<HttpResponseFor<MessagingListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MessagingListResponse>> =
            list(MessagingListParams.none(), requestOptions)
    }
}
