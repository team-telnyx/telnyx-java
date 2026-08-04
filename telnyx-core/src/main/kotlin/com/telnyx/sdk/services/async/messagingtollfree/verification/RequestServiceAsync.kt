// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.messagingtollfree.verification

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messagingtollfree.verification.requests.MessagingTollFreeVerificationTfVerificationRequest
import com.telnyx.sdk.models.messagingtollfree.verification.requests.MessagingTollFreeVerificationVerificationRequestEgress
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestCreateParams
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestDeleteParams
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestListPageAsync
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestListParams
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestRetrieveParams
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestRetrieveResponse
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestRetrieveStatusHistoryParams
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestRetrieveStatusHistoryResponse
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage your tollfree verification requests */
interface RequestServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RequestServiceAsync

    /** Submit a new tollfree verification request */
    fun create(
        params: RequestCreateParams
    ): CompletableFuture<MessagingTollFreeVerificationVerificationRequestEgress> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingTollFreeVerificationVerificationRequestEgress>

    /** @see create */
    fun create(
        messagingTollFreeVerificationTfVerificationRequest:
            MessagingTollFreeVerificationTfVerificationRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingTollFreeVerificationVerificationRequestEgress> =
        create(
            RequestCreateParams.builder()
                .messagingTollFreeVerificationTfVerificationRequest(
                    messagingTollFreeVerificationTfVerificationRequest
                )
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        messagingTollFreeVerificationTfVerificationRequest:
            MessagingTollFreeVerificationTfVerificationRequest
    ): CompletableFuture<MessagingTollFreeVerificationVerificationRequestEgress> =
        create(messagingTollFreeVerificationTfVerificationRequest, RequestOptions.none())

    /** Get a single verification request by its ID. */
    fun retrieve(id: String): CompletableFuture<RequestRetrieveResponse> =
        retrieve(id, RequestRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RequestRetrieveParams = RequestRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RequestRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RequestRetrieveParams = RequestRetrieveParams.none(),
    ): CompletableFuture<RequestRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RequestRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: RequestRetrieveParams): CompletableFuture<RequestRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RequestRetrieveResponse> =
        retrieve(id, RequestRetrieveParams.none(), requestOptions)

    /**
     * Update an existing tollfree verification request. This is particularly useful when there are
     * pending customer actions to be taken.
     */
    fun update(
        id: String,
        params: RequestUpdateParams,
    ): CompletableFuture<MessagingTollFreeVerificationVerificationRequestEgress> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: RequestUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingTollFreeVerificationVerificationRequestEgress> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: RequestUpdateParams
    ): CompletableFuture<MessagingTollFreeVerificationVerificationRequestEgress> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RequestUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingTollFreeVerificationVerificationRequestEgress>

    /** Get a list of previously-submitted tollfree verification requests */
    fun list(params: RequestListParams): CompletableFuture<RequestListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RequestListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RequestListPageAsync>

    /**
     * Delete a verification request
     *
     * A request may only be deleted when when the request is in the "rejected" state.
     * * `HTTP 200`: request successfully deleted
     * * `HTTP 400`: request exists but can't be deleted (i.e. not rejected)
     * * `HTTP 404`: request unknown or already deleted
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, RequestDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: RequestDeleteParams = RequestDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: RequestDeleteParams = RequestDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RequestDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: RequestDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, RequestDeleteParams.none(), requestOptions)

    /**
     * Get the history of status changes for a verification request.
     *
     * Returns a paginated list of historical status changes including the reason for each change
     * and when it occurred.
     */
    fun retrieveStatusHistory(
        id: String,
        params: RequestRetrieveStatusHistoryParams,
    ): CompletableFuture<RequestRetrieveStatusHistoryResponse> =
        retrieveStatusHistory(id, params, RequestOptions.none())

    /** @see retrieveStatusHistory */
    fun retrieveStatusHistory(
        id: String,
        params: RequestRetrieveStatusHistoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RequestRetrieveStatusHistoryResponse> =
        retrieveStatusHistory(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveStatusHistory */
    fun retrieveStatusHistory(
        params: RequestRetrieveStatusHistoryParams
    ): CompletableFuture<RequestRetrieveStatusHistoryResponse> =
        retrieveStatusHistory(params, RequestOptions.none())

    /** @see retrieveStatusHistory */
    fun retrieveStatusHistory(
        params: RequestRetrieveStatusHistoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RequestRetrieveStatusHistoryResponse>

    /**
     * A view of [RequestServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RequestServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /messaging_tollfree/verification/requests`, but is
         * otherwise the same as [RequestServiceAsync.create].
         */
        fun create(
            params: RequestCreateParams
        ): CompletableFuture<
            HttpResponseFor<MessagingTollFreeVerificationVerificationRequestEgress>
        > = create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RequestCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<MessagingTollFreeVerificationVerificationRequestEgress>
        >

        /** @see create */
        fun create(
            messagingTollFreeVerificationTfVerificationRequest:
                MessagingTollFreeVerificationTfVerificationRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<MessagingTollFreeVerificationVerificationRequestEgress>
        > =
            create(
                RequestCreateParams.builder()
                    .messagingTollFreeVerificationTfVerificationRequest(
                        messagingTollFreeVerificationTfVerificationRequest
                    )
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            messagingTollFreeVerificationTfVerificationRequest:
                MessagingTollFreeVerificationTfVerificationRequest
        ): CompletableFuture<
            HttpResponseFor<MessagingTollFreeVerificationVerificationRequestEgress>
        > = create(messagingTollFreeVerificationTfVerificationRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /messaging_tollfree/verification/requests/{id}`, but
         * is otherwise the same as [RequestServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<RequestRetrieveResponse>> =
            retrieve(id, RequestRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: RequestRetrieveParams = RequestRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RequestRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: RequestRetrieveParams = RequestRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<RequestRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RequestRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RequestRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: RequestRetrieveParams
        ): CompletableFuture<HttpResponseFor<RequestRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RequestRetrieveResponse>> =
            retrieve(id, RequestRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /messaging_tollfree/verification/requests/{id}`,
         * but is otherwise the same as [RequestServiceAsync.update].
         */
        fun update(
            id: String,
            params: RequestUpdateParams,
        ): CompletableFuture<
            HttpResponseFor<MessagingTollFreeVerificationVerificationRequestEgress>
        > = update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: RequestUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<MessagingTollFreeVerificationVerificationRequestEgress>
        > = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: RequestUpdateParams
        ): CompletableFuture<
            HttpResponseFor<MessagingTollFreeVerificationVerificationRequestEgress>
        > = update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: RequestUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<MessagingTollFreeVerificationVerificationRequestEgress>
        >

        /**
         * Returns a raw HTTP response for `get /messaging_tollfree/verification/requests`, but is
         * otherwise the same as [RequestServiceAsync.list].
         */
        fun list(
            params: RequestListParams
        ): CompletableFuture<HttpResponseFor<RequestListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: RequestListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RequestListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete /messaging_tollfree/verification/requests/{id}`,
         * but is otherwise the same as [RequestServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, RequestDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: RequestDeleteParams = RequestDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: RequestDeleteParams = RequestDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: RequestDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: RequestDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, RequestDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /messaging_tollfree/verification/requests/{id}/status_history`, but is otherwise the same
         * as [RequestServiceAsync.retrieveStatusHistory].
         */
        fun retrieveStatusHistory(
            id: String,
            params: RequestRetrieveStatusHistoryParams,
        ): CompletableFuture<HttpResponseFor<RequestRetrieveStatusHistoryResponse>> =
            retrieveStatusHistory(id, params, RequestOptions.none())

        /** @see retrieveStatusHistory */
        fun retrieveStatusHistory(
            id: String,
            params: RequestRetrieveStatusHistoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RequestRetrieveStatusHistoryResponse>> =
            retrieveStatusHistory(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveStatusHistory */
        fun retrieveStatusHistory(
            params: RequestRetrieveStatusHistoryParams
        ): CompletableFuture<HttpResponseFor<RequestRetrieveStatusHistoryResponse>> =
            retrieveStatusHistory(params, RequestOptions.none())

        /** @see retrieveStatusHistory */
        fun retrieveStatusHistory(
            params: RequestRetrieveStatusHistoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RequestRetrieveStatusHistoryResponse>>
    }
}
