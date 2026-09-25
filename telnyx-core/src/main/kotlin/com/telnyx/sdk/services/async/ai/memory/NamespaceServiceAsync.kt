// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.memory

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.memory.namespaces.NamespaceRetrieveParams
import com.telnyx.sdk.models.ai.memory.namespaces.NamespaceRetrieveResponse
import com.telnyx.sdk.services.async.ai.memory.namespaces.ProfileServiceAsync
import com.telnyx.sdk.services.async.ai.memory.namespaces.SettingServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Whether a write has finished. */
interface NamespaceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NamespaceServiceAsync

    fun profiles(): ProfileServiceAsync

    /** How a namespace's summaries are written. */
    fun settings(): SettingServiceAsync

    /**
     * Whether a write has finished. Both `ingest` and `remember` return an `operation_id`, and a
     * memory is not recallable until its operation completes — extraction, embedding and
     * consolidation all run first.
     */
    fun retrieve(
        operationId: String,
        params: NamespaceRetrieveParams,
    ): CompletableFuture<NamespaceRetrieveResponse> =
        retrieve(operationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        operationId: String,
        params: NamespaceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NamespaceRetrieveResponse> =
        retrieve(params.toBuilder().operationId(operationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: NamespaceRetrieveParams): CompletableFuture<NamespaceRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NamespaceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NamespaceRetrieveResponse>

    /**
     * A view of [NamespaceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NamespaceServiceAsync.WithRawResponse

        fun profiles(): ProfileServiceAsync.WithRawResponse

        /** How a namespace's summaries are written. */
        fun settings(): SettingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /ai/memory/namespaces/{namespace}/operations/{operation_id}`, but is otherwise the same
         * as [NamespaceServiceAsync.retrieve].
         */
        fun retrieve(
            operationId: String,
            params: NamespaceRetrieveParams,
        ): CompletableFuture<HttpResponseFor<NamespaceRetrieveResponse>> =
            retrieve(operationId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            operationId: String,
            params: NamespaceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NamespaceRetrieveResponse>> =
            retrieve(params.toBuilder().operationId(operationId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: NamespaceRetrieveParams
        ): CompletableFuture<HttpResponseFor<NamespaceRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: NamespaceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NamespaceRetrieveResponse>>
    }
}
