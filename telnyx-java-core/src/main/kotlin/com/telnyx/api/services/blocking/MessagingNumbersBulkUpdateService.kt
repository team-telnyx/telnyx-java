// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.messagingnumbersbulkupdates.MessagingNumbersBulkUpdateCreateParams
import com.telnyx.api.models.messagingnumbersbulkupdates.MessagingNumbersBulkUpdateCreateResponse
import com.telnyx.api.models.messagingnumbersbulkupdates.MessagingNumbersBulkUpdateRetrieveParams
import com.telnyx.api.models.messagingnumbersbulkupdates.MessagingNumbersBulkUpdateRetrieveResponse
import java.util.function.Consumer

interface MessagingNumbersBulkUpdateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessagingNumbersBulkUpdateService

    /** Update the messaging profile of multiple phone numbers */
    fun create(
        params: MessagingNumbersBulkUpdateCreateParams
    ): MessagingNumbersBulkUpdateCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MessagingNumbersBulkUpdateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingNumbersBulkUpdateCreateResponse

    /** Retrieve bulk update status */
    fun retrieve(orderId: String): MessagingNumbersBulkUpdateRetrieveResponse =
        retrieve(orderId, MessagingNumbersBulkUpdateRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        orderId: String,
        params: MessagingNumbersBulkUpdateRetrieveParams =
            MessagingNumbersBulkUpdateRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingNumbersBulkUpdateRetrieveResponse =
        retrieve(params.toBuilder().orderId(orderId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        orderId: String,
        params: MessagingNumbersBulkUpdateRetrieveParams =
            MessagingNumbersBulkUpdateRetrieveParams.none(),
    ): MessagingNumbersBulkUpdateRetrieveResponse = retrieve(orderId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MessagingNumbersBulkUpdateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingNumbersBulkUpdateRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: MessagingNumbersBulkUpdateRetrieveParams
    ): MessagingNumbersBulkUpdateRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        orderId: String,
        requestOptions: RequestOptions,
    ): MessagingNumbersBulkUpdateRetrieveResponse =
        retrieve(orderId, MessagingNumbersBulkUpdateRetrieveParams.none(), requestOptions)

    /**
     * A view of [MessagingNumbersBulkUpdateService] that provides access to raw HTTP responses for
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
        ): MessagingNumbersBulkUpdateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /messaging_numbers_bulk_updates`, but is otherwise
         * the same as [MessagingNumbersBulkUpdateService.create].
         */
        @MustBeClosed
        fun create(
            params: MessagingNumbersBulkUpdateCreateParams
        ): HttpResponseFor<MessagingNumbersBulkUpdateCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: MessagingNumbersBulkUpdateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingNumbersBulkUpdateCreateResponse>

        /**
         * Returns a raw HTTP response for `get /messaging_numbers_bulk_updates/{order_id}`, but is
         * otherwise the same as [MessagingNumbersBulkUpdateService.retrieve].
         */
        @MustBeClosed
        fun retrieve(orderId: String): HttpResponseFor<MessagingNumbersBulkUpdateRetrieveResponse> =
            retrieve(orderId, MessagingNumbersBulkUpdateRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            orderId: String,
            params: MessagingNumbersBulkUpdateRetrieveParams =
                MessagingNumbersBulkUpdateRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingNumbersBulkUpdateRetrieveResponse> =
            retrieve(params.toBuilder().orderId(orderId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            orderId: String,
            params: MessagingNumbersBulkUpdateRetrieveParams =
                MessagingNumbersBulkUpdateRetrieveParams.none(),
        ): HttpResponseFor<MessagingNumbersBulkUpdateRetrieveResponse> =
            retrieve(orderId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MessagingNumbersBulkUpdateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingNumbersBulkUpdateRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MessagingNumbersBulkUpdateRetrieveParams
        ): HttpResponseFor<MessagingNumbersBulkUpdateRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            orderId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingNumbersBulkUpdateRetrieveResponse> =
            retrieve(orderId, MessagingNumbersBulkUpdateRetrieveParams.none(), requestOptions)
    }
}
