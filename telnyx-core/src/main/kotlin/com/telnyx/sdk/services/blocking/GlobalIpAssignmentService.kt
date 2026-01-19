// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignment
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentCreateParams
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentCreateResponse
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentDeleteParams
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentDeleteResponse
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentListPage
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentListParams
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentRetrieveParams
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentRetrieveResponse
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentUpdateParams
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentUpdateResponse
import java.util.function.Consumer

interface GlobalIpAssignmentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GlobalIpAssignmentService

    /** Create a Global IP assignment. */
    fun create(params: GlobalIpAssignmentCreateParams): GlobalIpAssignmentCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: GlobalIpAssignmentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GlobalIpAssignmentCreateResponse

    /** @see create */
    fun create(
        globalIpAssignment: GlobalIpAssignment,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GlobalIpAssignmentCreateResponse =
        create(
            GlobalIpAssignmentCreateParams.builder().globalIpAssignment(globalIpAssignment).build(),
            requestOptions,
        )

    /** @see create */
    fun create(globalIpAssignment: GlobalIpAssignment): GlobalIpAssignmentCreateResponse =
        create(globalIpAssignment, RequestOptions.none())

    /** Retrieve a Global IP assignment. */
    fun retrieve(id: String): GlobalIpAssignmentRetrieveResponse =
        retrieve(id, GlobalIpAssignmentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: GlobalIpAssignmentRetrieveParams = GlobalIpAssignmentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GlobalIpAssignmentRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: GlobalIpAssignmentRetrieveParams = GlobalIpAssignmentRetrieveParams.none(),
    ): GlobalIpAssignmentRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: GlobalIpAssignmentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GlobalIpAssignmentRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: GlobalIpAssignmentRetrieveParams): GlobalIpAssignmentRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): GlobalIpAssignmentRetrieveResponse =
        retrieve(id, GlobalIpAssignmentRetrieveParams.none(), requestOptions)

    /** Update a Global IP assignment. */
    fun update(globalIpAssignmentId: String): GlobalIpAssignmentUpdateResponse =
        update(globalIpAssignmentId, GlobalIpAssignmentUpdateParams.none())

    /** @see update */
    fun update(
        globalIpAssignmentId: String,
        params: GlobalIpAssignmentUpdateParams = GlobalIpAssignmentUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GlobalIpAssignmentUpdateResponse =
        update(
            params.toBuilder().globalIpAssignmentId(globalIpAssignmentId).build(),
            requestOptions,
        )

    /** @see update */
    fun update(
        globalIpAssignmentId: String,
        params: GlobalIpAssignmentUpdateParams = GlobalIpAssignmentUpdateParams.none(),
    ): GlobalIpAssignmentUpdateResponse =
        update(globalIpAssignmentId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: GlobalIpAssignmentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GlobalIpAssignmentUpdateResponse

    /** @see update */
    fun update(params: GlobalIpAssignmentUpdateParams): GlobalIpAssignmentUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        globalIpAssignmentId: String,
        requestOptions: RequestOptions,
    ): GlobalIpAssignmentUpdateResponse =
        update(globalIpAssignmentId, GlobalIpAssignmentUpdateParams.none(), requestOptions)

    /** List all Global IP assignments. */
    fun list(): GlobalIpAssignmentListPage = list(GlobalIpAssignmentListParams.none())

    /** @see list */
    fun list(
        params: GlobalIpAssignmentListParams = GlobalIpAssignmentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GlobalIpAssignmentListPage

    /** @see list */
    fun list(
        params: GlobalIpAssignmentListParams = GlobalIpAssignmentListParams.none()
    ): GlobalIpAssignmentListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): GlobalIpAssignmentListPage =
        list(GlobalIpAssignmentListParams.none(), requestOptions)

    /** Delete a Global IP assignment. */
    fun delete(id: String): GlobalIpAssignmentDeleteResponse =
        delete(id, GlobalIpAssignmentDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: GlobalIpAssignmentDeleteParams = GlobalIpAssignmentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GlobalIpAssignmentDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: GlobalIpAssignmentDeleteParams = GlobalIpAssignmentDeleteParams.none(),
    ): GlobalIpAssignmentDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: GlobalIpAssignmentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GlobalIpAssignmentDeleteResponse

    /** @see delete */
    fun delete(params: GlobalIpAssignmentDeleteParams): GlobalIpAssignmentDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): GlobalIpAssignmentDeleteResponse =
        delete(id, GlobalIpAssignmentDeleteParams.none(), requestOptions)

    /**
     * A view of [GlobalIpAssignmentService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GlobalIpAssignmentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /global_ip_assignments`, but is otherwise the same
         * as [GlobalIpAssignmentService.create].
         */
        @MustBeClosed
        fun create(
            params: GlobalIpAssignmentCreateParams
        ): HttpResponseFor<GlobalIpAssignmentCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: GlobalIpAssignmentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GlobalIpAssignmentCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            globalIpAssignment: GlobalIpAssignment,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GlobalIpAssignmentCreateResponse> =
            create(
                GlobalIpAssignmentCreateParams.builder()
                    .globalIpAssignment(globalIpAssignment)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            globalIpAssignment: GlobalIpAssignment
        ): HttpResponseFor<GlobalIpAssignmentCreateResponse> =
            create(globalIpAssignment, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /global_ip_assignments/{id}`, but is otherwise the
         * same as [GlobalIpAssignmentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<GlobalIpAssignmentRetrieveResponse> =
            retrieve(id, GlobalIpAssignmentRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: GlobalIpAssignmentRetrieveParams = GlobalIpAssignmentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GlobalIpAssignmentRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: GlobalIpAssignmentRetrieveParams = GlobalIpAssignmentRetrieveParams.none(),
        ): HttpResponseFor<GlobalIpAssignmentRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: GlobalIpAssignmentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GlobalIpAssignmentRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: GlobalIpAssignmentRetrieveParams
        ): HttpResponseFor<GlobalIpAssignmentRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GlobalIpAssignmentRetrieveResponse> =
            retrieve(id, GlobalIpAssignmentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /global_ip_assignments/{id}`, but is otherwise the
         * same as [GlobalIpAssignmentService.update].
         */
        @MustBeClosed
        fun update(
            globalIpAssignmentId: String
        ): HttpResponseFor<GlobalIpAssignmentUpdateResponse> =
            update(globalIpAssignmentId, GlobalIpAssignmentUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            globalIpAssignmentId: String,
            params: GlobalIpAssignmentUpdateParams = GlobalIpAssignmentUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GlobalIpAssignmentUpdateResponse> =
            update(
                params.toBuilder().globalIpAssignmentId(globalIpAssignmentId).build(),
                requestOptions,
            )

        /** @see update */
        @MustBeClosed
        fun update(
            globalIpAssignmentId: String,
            params: GlobalIpAssignmentUpdateParams = GlobalIpAssignmentUpdateParams.none(),
        ): HttpResponseFor<GlobalIpAssignmentUpdateResponse> =
            update(globalIpAssignmentId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: GlobalIpAssignmentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GlobalIpAssignmentUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            params: GlobalIpAssignmentUpdateParams
        ): HttpResponseFor<GlobalIpAssignmentUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            globalIpAssignmentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GlobalIpAssignmentUpdateResponse> =
            update(globalIpAssignmentId, GlobalIpAssignmentUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /global_ip_assignments`, but is otherwise the same
         * as [GlobalIpAssignmentService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<GlobalIpAssignmentListPage> =
            list(GlobalIpAssignmentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: GlobalIpAssignmentListParams = GlobalIpAssignmentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GlobalIpAssignmentListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: GlobalIpAssignmentListParams = GlobalIpAssignmentListParams.none()
        ): HttpResponseFor<GlobalIpAssignmentListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<GlobalIpAssignmentListPage> =
            list(GlobalIpAssignmentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /global_ip_assignments/{id}`, but is otherwise
         * the same as [GlobalIpAssignmentService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<GlobalIpAssignmentDeleteResponse> =
            delete(id, GlobalIpAssignmentDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: GlobalIpAssignmentDeleteParams = GlobalIpAssignmentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GlobalIpAssignmentDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: GlobalIpAssignmentDeleteParams = GlobalIpAssignmentDeleteParams.none(),
        ): HttpResponseFor<GlobalIpAssignmentDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: GlobalIpAssignmentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GlobalIpAssignmentDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: GlobalIpAssignmentDeleteParams
        ): HttpResponseFor<GlobalIpAssignmentDeleteResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GlobalIpAssignmentDeleteResponse> =
            delete(id, GlobalIpAssignmentDeleteParams.none(), requestOptions)
    }
}
