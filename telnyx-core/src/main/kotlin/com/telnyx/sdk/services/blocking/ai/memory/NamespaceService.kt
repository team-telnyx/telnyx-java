// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.memory

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.memory.namespaces.NamespaceCreateParams
import com.telnyx.sdk.models.ai.memory.namespaces.NamespaceCreateResponse
import com.telnyx.sdk.models.ai.memory.namespaces.NamespaceDeleteParams
import com.telnyx.sdk.models.ai.memory.namespaces.NamespaceListParams
import com.telnyx.sdk.models.ai.memory.namespaces.NamespaceListResponse
import com.telnyx.sdk.models.ai.memory.namespaces.NamespaceRetrieveParams
import com.telnyx.sdk.models.ai.memory.namespaces.NamespaceRetrieveResponse
import com.telnyx.sdk.services.blocking.ai.memory.namespaces.ProfileService
import com.telnyx.sdk.services.blocking.ai.memory.namespaces.SettingService
import java.util.function.Consumer

interface NamespaceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NamespaceService

    fun profiles(): ProfileService

    /** How a namespace's summaries are written. */
    fun settings(): SettingService

    /**
     * Create a namespace. An organization can have at most five, `default` among them — a sixth
     * returns `403`.
     */
    fun create(params: NamespaceCreateParams): NamespaceCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: NamespaceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NamespaceCreateResponse

    /**
     * Whether a write has finished. Both `ingest` and `remember` return an `operation_id`, and a
     * memory is not recallable until its operation completes — extraction, embedding and
     * consolidation all run first.
     */
    fun retrieve(operationId: String, params: NamespaceRetrieveParams): NamespaceRetrieveResponse =
        retrieve(operationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        operationId: String,
        params: NamespaceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NamespaceRetrieveResponse =
        retrieve(params.toBuilder().operationId(operationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: NamespaceRetrieveParams): NamespaceRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NamespaceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NamespaceRetrieveResponse

    /** Every namespace in your organization, `default` among them. */
    fun list(): NamespaceListResponse = list(NamespaceListParams.none())

    /** @see list */
    fun list(
        params: NamespaceListParams = NamespaceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NamespaceListResponse

    /** @see list */
    fun list(params: NamespaceListParams = NamespaceListParams.none()): NamespaceListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): NamespaceListResponse =
        list(NamespaceListParams.none(), requestOptions)

    /**
     * Delete a namespace and every profile and memory in it. `default` cannot be deleted. This
     * cannot be undone.
     */
    fun delete(namespace: String) = delete(namespace, NamespaceDeleteParams.none())

    /** @see delete */
    fun delete(
        namespace: String,
        params: NamespaceDeleteParams = NamespaceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().namespace(namespace).build(), requestOptions)

    /** @see delete */
    fun delete(namespace: String, params: NamespaceDeleteParams = NamespaceDeleteParams.none()) =
        delete(namespace, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: NamespaceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: NamespaceDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(namespace: String, requestOptions: RequestOptions) =
        delete(namespace, NamespaceDeleteParams.none(), requestOptions)

    /** A view of [NamespaceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): NamespaceService.WithRawResponse

        fun profiles(): ProfileService.WithRawResponse

        /** How a namespace's summaries are written. */
        fun settings(): SettingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/memory/namespaces`, but is otherwise the same
         * as [NamespaceService.create].
         */
        @MustBeClosed
        fun create(params: NamespaceCreateParams): HttpResponseFor<NamespaceCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: NamespaceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NamespaceCreateResponse>

        /**
         * Returns a raw HTTP response for `get
         * /ai/memory/namespaces/{namespace}/operations/{operation_id}`, but is otherwise the same
         * as [NamespaceService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            operationId: String,
            params: NamespaceRetrieveParams,
        ): HttpResponseFor<NamespaceRetrieveResponse> =
            retrieve(operationId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            operationId: String,
            params: NamespaceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NamespaceRetrieveResponse> =
            retrieve(params.toBuilder().operationId(operationId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: NamespaceRetrieveParams): HttpResponseFor<NamespaceRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NamespaceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NamespaceRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /ai/memory/namespaces`, but is otherwise the same as
         * [NamespaceService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<NamespaceListResponse> = list(NamespaceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: NamespaceListParams = NamespaceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NamespaceListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: NamespaceListParams = NamespaceListParams.none()
        ): HttpResponseFor<NamespaceListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<NamespaceListResponse> =
            list(NamespaceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/memory/namespaces/{namespace}`, but is
         * otherwise the same as [NamespaceService.delete].
         */
        @MustBeClosed
        fun delete(namespace: String): HttpResponse =
            delete(namespace, NamespaceDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            namespace: String,
            params: NamespaceDeleteParams = NamespaceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().namespace(namespace).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            namespace: String,
            params: NamespaceDeleteParams = NamespaceDeleteParams.none(),
        ): HttpResponse = delete(namespace, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: NamespaceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: NamespaceDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(namespace: String, requestOptions: RequestOptions): HttpResponse =
            delete(namespace, NamespaceDeleteParams.none(), requestOptions)
    }
}
