// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.legacy.reporting.usagereports

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.legacy.reporting.usagereports.messaging.MessagingCreateParams
import com.telnyx.sdk.models.legacy.reporting.usagereports.messaging.MessagingCreateResponse
import com.telnyx.sdk.models.legacy.reporting.usagereports.messaging.MessagingDeleteParams
import com.telnyx.sdk.models.legacy.reporting.usagereports.messaging.MessagingDeleteResponse
import com.telnyx.sdk.models.legacy.reporting.usagereports.messaging.MessagingListPageAsync
import com.telnyx.sdk.models.legacy.reporting.usagereports.messaging.MessagingListParams
import com.telnyx.sdk.models.legacy.reporting.usagereports.messaging.MessagingRetrieveParams
import com.telnyx.sdk.models.legacy.reporting.usagereports.messaging.MessagingRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Messaging usage reports */
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

    /** Creates a new legacy usage V2 MDR report request with the specified filters */
    fun create(params: MessagingCreateParams): CompletableFuture<MessagingCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MessagingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingCreateResponse>

    /** Fetch single MDR usage report by id. */
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

    /** Fetch all previous requests for MDR usage reports. */
    fun list(): CompletableFuture<MessagingListPageAsync> = list(MessagingListParams.none())

    /** @see list */
    fun list(
        params: MessagingListParams = MessagingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingListPageAsync>

    /** @see list */
    fun list(
        params: MessagingListParams = MessagingListParams.none()
    ): CompletableFuture<MessagingListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MessagingListPageAsync> =
        list(MessagingListParams.none(), requestOptions)

    /** Deletes a specific V2 legacy usage MDR report request by ID */
    fun delete(id: String): CompletableFuture<MessagingDeleteResponse> =
        delete(id, MessagingDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: MessagingDeleteParams = MessagingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: MessagingDeleteParams = MessagingDeleteParams.none(),
    ): CompletableFuture<MessagingDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MessagingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingDeleteResponse>

    /** @see delete */
    fun delete(params: MessagingDeleteParams): CompletableFuture<MessagingDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingDeleteResponse> =
        delete(id, MessagingDeleteParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /legacy/reporting/usage_reports/messaging`, but is
         * otherwise the same as [MessagingServiceAsync.create].
         */
        fun create(
            params: MessagingCreateParams
        ): CompletableFuture<HttpResponseFor<MessagingCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: MessagingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /legacy/reporting/usage_reports/messaging/{id}`, but
         * is otherwise the same as [MessagingServiceAsync.retrieve].
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
         * Returns a raw HTTP response for `get /legacy/reporting/usage_reports/messaging`, but is
         * otherwise the same as [MessagingServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MessagingListPageAsync>> =
            list(MessagingListParams.none())

        /** @see list */
        fun list(
            params: MessagingListParams = MessagingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingListPageAsync>>

        /** @see list */
        fun list(
            params: MessagingListParams = MessagingListParams.none()
        ): CompletableFuture<HttpResponseFor<MessagingListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MessagingListPageAsync>> =
            list(MessagingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /legacy/reporting/usage_reports/messaging/{id}`,
         * but is otherwise the same as [MessagingServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<MessagingDeleteResponse>> =
            delete(id, MessagingDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: MessagingDeleteParams = MessagingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: MessagingDeleteParams = MessagingDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<MessagingDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: MessagingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingDeleteResponse>>

        /** @see delete */
        fun delete(
            params: MessagingDeleteParams
        ): CompletableFuture<HttpResponseFor<MessagingDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingDeleteResponse>> =
            delete(id, MessagingDeleteParams.none(), requestOptions)
    }
}
