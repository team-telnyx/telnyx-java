// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.portouts

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.portouts.supportingdocuments.SupportingDocumentCreateParams
import com.telnyx.sdk.models.portouts.supportingdocuments.SupportingDocumentCreateResponse
import com.telnyx.sdk.models.portouts.supportingdocuments.SupportingDocumentListParams
import com.telnyx.sdk.models.portouts.supportingdocuments.SupportingDocumentListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SupportingDocumentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SupportingDocumentServiceAsync

    /** Creates a list of supporting documents on a portout request. */
    fun create(id: String): CompletableFuture<SupportingDocumentCreateResponse> =
        create(id, SupportingDocumentCreateParams.none())

    /** @see create */
    fun create(
        id: String,
        params: SupportingDocumentCreateParams = SupportingDocumentCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SupportingDocumentCreateResponse> =
        create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(
        id: String,
        params: SupportingDocumentCreateParams = SupportingDocumentCreateParams.none(),
    ): CompletableFuture<SupportingDocumentCreateResponse> =
        create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SupportingDocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SupportingDocumentCreateResponse>

    /** @see create */
    fun create(
        params: SupportingDocumentCreateParams
    ): CompletableFuture<SupportingDocumentCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SupportingDocumentCreateResponse> =
        create(id, SupportingDocumentCreateParams.none(), requestOptions)

    /** List every supporting documents for a portout request. */
    fun list(id: String): CompletableFuture<SupportingDocumentListResponse> =
        list(id, SupportingDocumentListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: SupportingDocumentListParams = SupportingDocumentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SupportingDocumentListResponse> =
        list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: SupportingDocumentListParams = SupportingDocumentListParams.none(),
    ): CompletableFuture<SupportingDocumentListResponse> = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SupportingDocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SupportingDocumentListResponse>

    /** @see list */
    fun list(
        params: SupportingDocumentListParams
    ): CompletableFuture<SupportingDocumentListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SupportingDocumentListResponse> =
        list(id, SupportingDocumentListParams.none(), requestOptions)

    /**
     * A view of [SupportingDocumentServiceAsync] that provides access to raw HTTP responses for
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
        ): SupportingDocumentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /portouts/{id}/supporting_documents`, but is
         * otherwise the same as [SupportingDocumentServiceAsync.create].
         */
        fun create(
            id: String
        ): CompletableFuture<HttpResponseFor<SupportingDocumentCreateResponse>> =
            create(id, SupportingDocumentCreateParams.none())

        /** @see create */
        fun create(
            id: String,
            params: SupportingDocumentCreateParams = SupportingDocumentCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SupportingDocumentCreateResponse>> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        fun create(
            id: String,
            params: SupportingDocumentCreateParams = SupportingDocumentCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<SupportingDocumentCreateResponse>> =
            create(id, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SupportingDocumentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SupportingDocumentCreateResponse>>

        /** @see create */
        fun create(
            params: SupportingDocumentCreateParams
        ): CompletableFuture<HttpResponseFor<SupportingDocumentCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SupportingDocumentCreateResponse>> =
            create(id, SupportingDocumentCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /portouts/{id}/supporting_documents`, but is
         * otherwise the same as [SupportingDocumentServiceAsync.list].
         */
        fun list(id: String): CompletableFuture<HttpResponseFor<SupportingDocumentListResponse>> =
            list(id, SupportingDocumentListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: SupportingDocumentListParams = SupportingDocumentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SupportingDocumentListResponse>> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: SupportingDocumentListParams = SupportingDocumentListParams.none(),
        ): CompletableFuture<HttpResponseFor<SupportingDocumentListResponse>> =
            list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: SupportingDocumentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SupportingDocumentListResponse>>

        /** @see list */
        fun list(
            params: SupportingDocumentListParams
        ): CompletableFuture<HttpResponseFor<SupportingDocumentListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SupportingDocumentListResponse>> =
            list(id, SupportingDocumentListParams.none(), requestOptions)
    }
}
