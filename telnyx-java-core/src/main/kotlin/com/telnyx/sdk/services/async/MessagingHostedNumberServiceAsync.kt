// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messaginghostednumbers.MessagingHostedNumberDeleteParams
import com.telnyx.sdk.models.messaginghostednumbers.MessagingHostedNumberDeleteResponse
import com.telnyx.sdk.models.messaginghostednumbers.MessagingHostedNumberListPageAsync
import com.telnyx.sdk.models.messaginghostednumbers.MessagingHostedNumberListParams
import com.telnyx.sdk.models.messaginghostednumbers.MessagingHostedNumberRetrieveParams
import com.telnyx.sdk.models.messaginghostednumbers.MessagingHostedNumberRetrieveResponse
import com.telnyx.sdk.models.messaginghostednumbers.MessagingHostedNumberUpdateParams
import com.telnyx.sdk.models.messaginghostednumbers.MessagingHostedNumberUpdateResponse
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

    /** Retrieve a specific messaging hosted number by its ID or phone number. */
    fun retrieve(id: String): CompletableFuture<MessagingHostedNumberRetrieveResponse> =
        retrieve(id, MessagingHostedNumberRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MessagingHostedNumberRetrieveParams = MessagingHostedNumberRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingHostedNumberRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MessagingHostedNumberRetrieveParams = MessagingHostedNumberRetrieveParams.none(),
    ): CompletableFuture<MessagingHostedNumberRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MessagingHostedNumberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingHostedNumberRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: MessagingHostedNumberRetrieveParams
    ): CompletableFuture<MessagingHostedNumberRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingHostedNumberRetrieveResponse> =
        retrieve(id, MessagingHostedNumberRetrieveParams.none(), requestOptions)

    /** Update the messaging settings for a hosted number. */
    fun update(id: String): CompletableFuture<MessagingHostedNumberUpdateResponse> =
        update(id, MessagingHostedNumberUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: MessagingHostedNumberUpdateParams = MessagingHostedNumberUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingHostedNumberUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: MessagingHostedNumberUpdateParams = MessagingHostedNumberUpdateParams.none(),
    ): CompletableFuture<MessagingHostedNumberUpdateResponse> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MessagingHostedNumberUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingHostedNumberUpdateResponse>

    /** @see update */
    fun update(
        params: MessagingHostedNumberUpdateParams
    ): CompletableFuture<MessagingHostedNumberUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingHostedNumberUpdateResponse> =
        update(id, MessagingHostedNumberUpdateParams.none(), requestOptions)

    /** List all hosted numbers associated with the authenticated user. */
    fun list(): CompletableFuture<MessagingHostedNumberListPageAsync> =
        list(MessagingHostedNumberListParams.none())

    /** @see list */
    fun list(
        params: MessagingHostedNumberListParams = MessagingHostedNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingHostedNumberListPageAsync>

    /** @see list */
    fun list(
        params: MessagingHostedNumberListParams = MessagingHostedNumberListParams.none()
    ): CompletableFuture<MessagingHostedNumberListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<MessagingHostedNumberListPageAsync> =
        list(MessagingHostedNumberListParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /messaging_hosted_numbers/{id}`, but is otherwise
         * the same as [MessagingHostedNumberServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberRetrieveResponse>> =
            retrieve(id, MessagingHostedNumberRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: MessagingHostedNumberRetrieveParams =
                MessagingHostedNumberRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: MessagingHostedNumberRetrieveParams = MessagingHostedNumberRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: MessagingHostedNumberRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: MessagingHostedNumberRetrieveParams
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberRetrieveResponse>> =
            retrieve(id, MessagingHostedNumberRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /messaging_hosted_numbers/{id}`, but is otherwise
         * the same as [MessagingHostedNumberServiceAsync.update].
         */
        fun update(
            id: String
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberUpdateResponse>> =
            update(id, MessagingHostedNumberUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: MessagingHostedNumberUpdateParams = MessagingHostedNumberUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: MessagingHostedNumberUpdateParams = MessagingHostedNumberUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: MessagingHostedNumberUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberUpdateResponse>>

        /** @see update */
        fun update(
            params: MessagingHostedNumberUpdateParams
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberUpdateResponse>> =
            update(id, MessagingHostedNumberUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /messaging_hosted_numbers`, but is otherwise the
         * same as [MessagingHostedNumberServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MessagingHostedNumberListPageAsync>> =
            list(MessagingHostedNumberListParams.none())

        /** @see list */
        fun list(
            params: MessagingHostedNumberListParams = MessagingHostedNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberListPageAsync>>

        /** @see list */
        fun list(
            params: MessagingHostedNumberListParams = MessagingHostedNumberListParams.none()
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberListPageAsync>> =
            list(MessagingHostedNumberListParams.none(), requestOptions)

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
