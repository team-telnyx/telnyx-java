// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messagingtollfree.verification

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestCreateParams
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestDeleteParams
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestListParams
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestListResponse
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestRetrieveParams
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestUpdateParams
import com.telnyx.sdk.models.messagingtollfree.verification.requests.TfVerificationRequest
import com.telnyx.sdk.models.messagingtollfree.verification.requests.VerificationRequestEgress
import com.telnyx.sdk.models.messagingtollfree.verification.requests.VerificationRequestStatus
import java.util.function.Consumer

interface RequestService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RequestService

    /** Submit a new tollfree verification request */
    fun create(params: RequestCreateParams): VerificationRequestEgress =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationRequestEgress

    /** @see create */
    fun create(
        tfVerificationRequest: TfVerificationRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationRequestEgress =
        create(
            RequestCreateParams.builder().tfVerificationRequest(tfVerificationRequest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(tfVerificationRequest: TfVerificationRequest): VerificationRequestEgress =
        create(tfVerificationRequest, RequestOptions.none())

    /** Get a single verification request by its ID. */
    fun retrieve(id: String): VerificationRequestStatus = retrieve(id, RequestRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RequestRetrieveParams = RequestRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationRequestStatus = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RequestRetrieveParams = RequestRetrieveParams.none(),
    ): VerificationRequestStatus = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationRequestStatus

    /** @see retrieve */
    fun retrieve(params: RequestRetrieveParams): VerificationRequestStatus =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): VerificationRequestStatus =
        retrieve(id, RequestRetrieveParams.none(), requestOptions)

    /**
     * Update an existing tollfree verification request. This is particularly useful when there are
     * pending customer actions to be taken.
     */
    fun update(id: String, params: RequestUpdateParams): VerificationRequestEgress =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: RequestUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationRequestEgress = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: RequestUpdateParams): VerificationRequestEgress =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RequestUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationRequestEgress

    /** Get a list of previously-submitted tollfree verification requests */
    fun list(params: RequestListParams): RequestListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RequestListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RequestListResponse

    /**
     * Delete a verification request
     *
     * A request may only be deleted when when the request is in the "rejected" state.
     * * `HTTP 200`: request successfully deleted
     * * `HTTP 400`: request exists but can't be deleted (i.e. not rejected)
     * * `HTTP 404`: request unknown or already deleted
     */
    fun delete(id: String) = delete(id, RequestDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: RequestDeleteParams = RequestDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: RequestDeleteParams = RequestDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: RequestDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: RequestDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, RequestDeleteParams.none(), requestOptions)

    /** A view of [RequestService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RequestService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /messaging_tollfree/verification/requests`, but is
         * otherwise the same as [RequestService.create].
         */
        @MustBeClosed
        fun create(params: RequestCreateParams): HttpResponseFor<VerificationRequestEgress> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RequestCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationRequestEgress>

        /** @see create */
        @MustBeClosed
        fun create(
            tfVerificationRequest: TfVerificationRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationRequestEgress> =
            create(
                RequestCreateParams.builder().tfVerificationRequest(tfVerificationRequest).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            tfVerificationRequest: TfVerificationRequest
        ): HttpResponseFor<VerificationRequestEgress> =
            create(tfVerificationRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /messaging_tollfree/verification/requests/{id}`, but
         * is otherwise the same as [RequestService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<VerificationRequestStatus> =
            retrieve(id, RequestRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: RequestRetrieveParams = RequestRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationRequestStatus> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: RequestRetrieveParams = RequestRetrieveParams.none(),
        ): HttpResponseFor<VerificationRequestStatus> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RequestRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationRequestStatus>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: RequestRetrieveParams): HttpResponseFor<VerificationRequestStatus> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerificationRequestStatus> =
            retrieve(id, RequestRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /messaging_tollfree/verification/requests/{id}`,
         * but is otherwise the same as [RequestService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: RequestUpdateParams,
        ): HttpResponseFor<VerificationRequestEgress> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: RequestUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationRequestEgress> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: RequestUpdateParams): HttpResponseFor<VerificationRequestEgress> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: RequestUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationRequestEgress>

        /**
         * Returns a raw HTTP response for `get /messaging_tollfree/verification/requests`, but is
         * otherwise the same as [RequestService.list].
         */
        @MustBeClosed
        fun list(params: RequestListParams): HttpResponseFor<RequestListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RequestListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RequestListResponse>

        /**
         * Returns a raw HTTP response for `delete /messaging_tollfree/verification/requests/{id}`,
         * but is otherwise the same as [RequestService.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, RequestDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: RequestDeleteParams = RequestDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: RequestDeleteParams = RequestDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: RequestDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: RequestDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, RequestDeleteParams.none(), requestOptions)
    }
}
