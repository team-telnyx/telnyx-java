// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignment
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentCreateParams
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentCreateResponse
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentDeleteParams
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentDeleteResponse
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentListPageAsync
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentListParams
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentRetrieveParams
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentRetrieveResponse
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentUpdateParams
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Global IPs */
interface GlobalIpAssignmentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GlobalIpAssignmentServiceAsync

    /**
     * Assigns a Global IP to a WireGuard peer so traffic destined for the IP is delivered over that
     * peer's tunnel. Assignment is asynchronous, so the request is accepted and completes in the
     * background.
     */
    fun create(
        params: GlobalIpAssignmentCreateParams
    ): CompletableFuture<GlobalIpAssignmentCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: GlobalIpAssignmentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GlobalIpAssignmentCreateResponse>

    /** @see create */
    fun create(
        globalIpAssignment: GlobalIpAssignment,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GlobalIpAssignmentCreateResponse> =
        create(
            GlobalIpAssignmentCreateParams.builder().globalIpAssignment(globalIpAssignment).build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        globalIpAssignment: GlobalIpAssignment
    ): CompletableFuture<GlobalIpAssignmentCreateResponse> =
        create(globalIpAssignment, RequestOptions.none())

    /**
     * Returns the details of a single Global IP assignment, including the Global IP and WireGuard
     * peer it links.
     */
    fun retrieve(id: String): CompletableFuture<GlobalIpAssignmentRetrieveResponse> =
        retrieve(id, GlobalIpAssignmentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: GlobalIpAssignmentRetrieveParams = GlobalIpAssignmentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GlobalIpAssignmentRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: GlobalIpAssignmentRetrieveParams = GlobalIpAssignmentRetrieveParams.none(),
    ): CompletableFuture<GlobalIpAssignmentRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: GlobalIpAssignmentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GlobalIpAssignmentRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: GlobalIpAssignmentRetrieveParams
    ): CompletableFuture<GlobalIpAssignmentRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<GlobalIpAssignmentRetrieveResponse> =
        retrieve(id, GlobalIpAssignmentRetrieveParams.none(), requestOptions)

    /**
     * Updates the specified Global IP assignment with the provided fields and returns the updated
     * assignment.
     */
    fun update(globalIpAssignmentId: String): CompletableFuture<GlobalIpAssignmentUpdateResponse> =
        update(globalIpAssignmentId, GlobalIpAssignmentUpdateParams.none())

    /** @see update */
    fun update(
        globalIpAssignmentId: String,
        params: GlobalIpAssignmentUpdateParams = GlobalIpAssignmentUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GlobalIpAssignmentUpdateResponse> =
        update(
            params.toBuilder().globalIpAssignmentId(globalIpAssignmentId).build(),
            requestOptions,
        )

    /** @see update */
    fun update(
        globalIpAssignmentId: String,
        params: GlobalIpAssignmentUpdateParams = GlobalIpAssignmentUpdateParams.none(),
    ): CompletableFuture<GlobalIpAssignmentUpdateResponse> =
        update(globalIpAssignmentId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: GlobalIpAssignmentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GlobalIpAssignmentUpdateResponse>

    /** @see update */
    fun update(
        params: GlobalIpAssignmentUpdateParams
    ): CompletableFuture<GlobalIpAssignmentUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        globalIpAssignmentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<GlobalIpAssignmentUpdateResponse> =
        update(globalIpAssignmentId, GlobalIpAssignmentUpdateParams.none(), requestOptions)

    /**
     * Returns a paginated list of your Global IP assignments, the links between Global IPs and the
     * WireGuard peers that receive their traffic.
     */
    fun list(): CompletableFuture<GlobalIpAssignmentListPageAsync> =
        list(GlobalIpAssignmentListParams.none())

    /** @see list */
    fun list(
        params: GlobalIpAssignmentListParams = GlobalIpAssignmentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GlobalIpAssignmentListPageAsync>

    /** @see list */
    fun list(
        params: GlobalIpAssignmentListParams = GlobalIpAssignmentListParams.none()
    ): CompletableFuture<GlobalIpAssignmentListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<GlobalIpAssignmentListPageAsync> =
        list(GlobalIpAssignmentListParams.none(), requestOptions)

    /**
     * Deletes the specified Global IP assignment, detaching the Global IP from its WireGuard peer.
     */
    fun delete(id: String): CompletableFuture<GlobalIpAssignmentDeleteResponse> =
        delete(id, GlobalIpAssignmentDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: GlobalIpAssignmentDeleteParams = GlobalIpAssignmentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GlobalIpAssignmentDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: GlobalIpAssignmentDeleteParams = GlobalIpAssignmentDeleteParams.none(),
    ): CompletableFuture<GlobalIpAssignmentDeleteResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: GlobalIpAssignmentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GlobalIpAssignmentDeleteResponse>

    /** @see delete */
    fun delete(
        params: GlobalIpAssignmentDeleteParams
    ): CompletableFuture<GlobalIpAssignmentDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<GlobalIpAssignmentDeleteResponse> =
        delete(id, GlobalIpAssignmentDeleteParams.none(), requestOptions)

    /**
     * A view of [GlobalIpAssignmentServiceAsync] that provides access to raw HTTP responses for
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
        ): GlobalIpAssignmentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /global_ip_assignments`, but is otherwise the same
         * as [GlobalIpAssignmentServiceAsync.create].
         */
        fun create(
            params: GlobalIpAssignmentCreateParams
        ): CompletableFuture<HttpResponseFor<GlobalIpAssignmentCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: GlobalIpAssignmentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpAssignmentCreateResponse>>

        /** @see create */
        fun create(
            globalIpAssignment: GlobalIpAssignment,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpAssignmentCreateResponse>> =
            create(
                GlobalIpAssignmentCreateParams.builder()
                    .globalIpAssignment(globalIpAssignment)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            globalIpAssignment: GlobalIpAssignment
        ): CompletableFuture<HttpResponseFor<GlobalIpAssignmentCreateResponse>> =
            create(globalIpAssignment, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /global_ip_assignments/{id}`, but is otherwise the
         * same as [GlobalIpAssignmentServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<GlobalIpAssignmentRetrieveResponse>> =
            retrieve(id, GlobalIpAssignmentRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: GlobalIpAssignmentRetrieveParams = GlobalIpAssignmentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpAssignmentRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: GlobalIpAssignmentRetrieveParams = GlobalIpAssignmentRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpAssignmentRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: GlobalIpAssignmentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpAssignmentRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: GlobalIpAssignmentRetrieveParams
        ): CompletableFuture<HttpResponseFor<GlobalIpAssignmentRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GlobalIpAssignmentRetrieveResponse>> =
            retrieve(id, GlobalIpAssignmentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /global_ip_assignments/{id}`, but is otherwise the
         * same as [GlobalIpAssignmentServiceAsync.update].
         */
        fun update(
            globalIpAssignmentId: String
        ): CompletableFuture<HttpResponseFor<GlobalIpAssignmentUpdateResponse>> =
            update(globalIpAssignmentId, GlobalIpAssignmentUpdateParams.none())

        /** @see update */
        fun update(
            globalIpAssignmentId: String,
            params: GlobalIpAssignmentUpdateParams = GlobalIpAssignmentUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpAssignmentUpdateResponse>> =
            update(
                params.toBuilder().globalIpAssignmentId(globalIpAssignmentId).build(),
                requestOptions,
            )

        /** @see update */
        fun update(
            globalIpAssignmentId: String,
            params: GlobalIpAssignmentUpdateParams = GlobalIpAssignmentUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpAssignmentUpdateResponse>> =
            update(globalIpAssignmentId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: GlobalIpAssignmentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpAssignmentUpdateResponse>>

        /** @see update */
        fun update(
            params: GlobalIpAssignmentUpdateParams
        ): CompletableFuture<HttpResponseFor<GlobalIpAssignmentUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            globalIpAssignmentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GlobalIpAssignmentUpdateResponse>> =
            update(globalIpAssignmentId, GlobalIpAssignmentUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /global_ip_assignments`, but is otherwise the same
         * as [GlobalIpAssignmentServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<GlobalIpAssignmentListPageAsync>> =
            list(GlobalIpAssignmentListParams.none())

        /** @see list */
        fun list(
            params: GlobalIpAssignmentListParams = GlobalIpAssignmentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpAssignmentListPageAsync>>

        /** @see list */
        fun list(
            params: GlobalIpAssignmentListParams = GlobalIpAssignmentListParams.none()
        ): CompletableFuture<HttpResponseFor<GlobalIpAssignmentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<GlobalIpAssignmentListPageAsync>> =
            list(GlobalIpAssignmentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /global_ip_assignments/{id}`, but is otherwise
         * the same as [GlobalIpAssignmentServiceAsync.delete].
         */
        fun delete(
            id: String
        ): CompletableFuture<HttpResponseFor<GlobalIpAssignmentDeleteResponse>> =
            delete(id, GlobalIpAssignmentDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: GlobalIpAssignmentDeleteParams = GlobalIpAssignmentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpAssignmentDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: GlobalIpAssignmentDeleteParams = GlobalIpAssignmentDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpAssignmentDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: GlobalIpAssignmentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpAssignmentDeleteResponse>>

        /** @see delete */
        fun delete(
            params: GlobalIpAssignmentDeleteParams
        ): CompletableFuture<HttpResponseFor<GlobalIpAssignmentDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GlobalIpAssignmentDeleteResponse>> =
            delete(id, GlobalIpAssignmentDeleteParams.none(), requestOptions)
    }
}
