// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messagingnumbersbulkupdates.MessagingNumbersBulkUpdateCreateParams
import com.telnyx.sdk.models.messagingnumbersbulkupdates.MessagingNumbersBulkUpdateCreateResponse
import com.telnyx.sdk.models.messagingnumbersbulkupdates.MessagingNumbersBulkUpdateRetrieveParams
import com.telnyx.sdk.models.messagingnumbersbulkupdates.MessagingNumbersBulkUpdateRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Configure your phone numbers */
interface MessagingNumbersBulkUpdateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): MessagingNumbersBulkUpdateServiceAsync

    /** Bulk update phone number profiles */
    fun create(
        params: MessagingNumbersBulkUpdateCreateParams
    ): CompletableFuture<MessagingNumbersBulkUpdateCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MessagingNumbersBulkUpdateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingNumbersBulkUpdateCreateResponse>

    /** Retrieve bulk update status */
    fun retrieve(orderId: String): CompletableFuture<MessagingNumbersBulkUpdateRetrieveResponse> =
        retrieve(orderId, MessagingNumbersBulkUpdateRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        orderId: String,
        params: MessagingNumbersBulkUpdateRetrieveParams =
            MessagingNumbersBulkUpdateRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingNumbersBulkUpdateRetrieveResponse> =
        retrieve(params.toBuilder().orderId(orderId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        orderId: String,
        params: MessagingNumbersBulkUpdateRetrieveParams =
            MessagingNumbersBulkUpdateRetrieveParams.none(),
    ): CompletableFuture<MessagingNumbersBulkUpdateRetrieveResponse> =
        retrieve(orderId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MessagingNumbersBulkUpdateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingNumbersBulkUpdateRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: MessagingNumbersBulkUpdateRetrieveParams
    ): CompletableFuture<MessagingNumbersBulkUpdateRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        orderId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingNumbersBulkUpdateRetrieveResponse> =
        retrieve(orderId, MessagingNumbersBulkUpdateRetrieveParams.none(), requestOptions)

    /**
     * A view of [MessagingNumbersBulkUpdateServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessagingNumbersBulkUpdateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /messaging_numbers_bulk_updates`, but is otherwise
         * the same as [MessagingNumbersBulkUpdateServiceAsync.create].
         */
        fun create(
            params: MessagingNumbersBulkUpdateCreateParams
        ): CompletableFuture<HttpResponseFor<MessagingNumbersBulkUpdateCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: MessagingNumbersBulkUpdateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingNumbersBulkUpdateCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /messaging_numbers_bulk_updates/{order_id}`, but is
         * otherwise the same as [MessagingNumbersBulkUpdateServiceAsync.retrieve].
         */
        fun retrieve(
            orderId: String
        ): CompletableFuture<HttpResponseFor<MessagingNumbersBulkUpdateRetrieveResponse>> =
            retrieve(orderId, MessagingNumbersBulkUpdateRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            orderId: String,
            params: MessagingNumbersBulkUpdateRetrieveParams =
                MessagingNumbersBulkUpdateRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingNumbersBulkUpdateRetrieveResponse>> =
            retrieve(params.toBuilder().orderId(orderId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            orderId: String,
            params: MessagingNumbersBulkUpdateRetrieveParams =
                MessagingNumbersBulkUpdateRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<MessagingNumbersBulkUpdateRetrieveResponse>> =
            retrieve(orderId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: MessagingNumbersBulkUpdateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingNumbersBulkUpdateRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: MessagingNumbersBulkUpdateRetrieveParams
        ): CompletableFuture<HttpResponseFor<MessagingNumbersBulkUpdateRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            orderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingNumbersBulkUpdateRetrieveResponse>> =
            retrieve(orderId, MessagingNumbersBulkUpdateRetrieveParams.none(), requestOptions)
    }
}
