// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.messagingtollfree.verification

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestCreateParams
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestDeleteParams
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestListPageAsync
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestListParams
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestRetrieveParams
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestRetrieveStatusHistoryParams
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestRetrieveStatusHistoryResponse
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestUpdateParams
import com.telnyx.sdk.models.messagingtollfree.verification.requests.TfVerificationRequest
import com.telnyx.sdk.models.messagingtollfree.verification.requests.VerificationRequestEgress
import com.telnyx.sdk.models.messagingtollfree.verification.requests.VerificationRequestStatus
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

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
    fun create(params: RequestCreateParams): CompletableFuture<VerificationRequestEgress> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerificationRequestEgress>

    /** @see create */
    fun create(
        tfVerificationRequest: TfVerificationRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerificationRequestEgress> =
        create(
            RequestCreateParams.builder().tfVerificationRequest(tfVerificationRequest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        tfVerificationRequest: TfVerificationRequest
    ): CompletableFuture<VerificationRequestEgress> =
        create(tfVerificationRequest, RequestOptions.none())

    /** Get a single verification request by its ID. */
    fun retrieve(id: String): CompletableFuture<VerificationRequestStatus> =
        retrieve(id, RequestRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RequestRetrieveParams = RequestRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerificationRequestStatus> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RequestRetrieveParams = RequestRetrieveParams.none(),
    ): CompletableFuture<VerificationRequestStatus> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerificationRequestStatus>

    /** @see retrieve */
    fun retrieve(params: RequestRetrieveParams): CompletableFuture<VerificationRequestStatus> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerificationRequestStatus> =
        retrieve(id, RequestRetrieveParams.none(), requestOptions)

    /**
     * Update an existing tollfree verification request. This is particularly useful when there are
     * pending customer actions to be taken.
     */
    fun update(
        id: String,
        params: RequestUpdateParams,
    ): CompletableFuture<VerificationRequestEgress> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: RequestUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerificationRequestEgress> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: RequestUpdateParams): CompletableFuture<VerificationRequestEgress> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RequestUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerificationRequestEgress>

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
        ): CompletableFuture<HttpResponseFor<VerificationRequestEgress>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RequestCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerificationRequestEgress>>

        /** @see create */
        fun create(
            tfVerificationRequest: TfVerificationRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerificationRequestEgress>> =
            create(
                RequestCreateParams.builder().tfVerificationRequest(tfVerificationRequest).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            tfVerificationRequest: TfVerificationRequest
        ): CompletableFuture<HttpResponseFor<VerificationRequestEgress>> =
            create(tfVerificationRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /messaging_tollfree/verification/requests/{id}`, but
         * is otherwise the same as [RequestServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<VerificationRequestStatus>> =
            retrieve(id, RequestRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: RequestRetrieveParams = RequestRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerificationRequestStatus>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: RequestRetrieveParams = RequestRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<VerificationRequestStatus>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RequestRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerificationRequestStatus>>

        /** @see retrieve */
        fun retrieve(
            params: RequestRetrieveParams
        ): CompletableFuture<HttpResponseFor<VerificationRequestStatus>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerificationRequestStatus>> =
            retrieve(id, RequestRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /messaging_tollfree/verification/requests/{id}`,
         * but is otherwise the same as [RequestServiceAsync.update].
         */
        fun update(
            id: String,
            params: RequestUpdateParams,
        ): CompletableFuture<HttpResponseFor<VerificationRequestEgress>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: RequestUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerificationRequestEgress>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: RequestUpdateParams
        ): CompletableFuture<HttpResponseFor<VerificationRequestEgress>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: RequestUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerificationRequestEgress>>

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
