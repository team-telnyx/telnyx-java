// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.portingorders

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.portingorders.additionaldocuments.AdditionalDocumentCreateParams
import com.telnyx.sdk.models.portingorders.additionaldocuments.AdditionalDocumentCreateResponse
import com.telnyx.sdk.models.portingorders.additionaldocuments.AdditionalDocumentDeleteParams
import com.telnyx.sdk.models.portingorders.additionaldocuments.AdditionalDocumentListParams
import com.telnyx.sdk.models.portingorders.additionaldocuments.AdditionalDocumentListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AdditionalDocumentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AdditionalDocumentServiceAsync

    /** Creates a list of additional documents for a porting order. */
    fun create(id: String): CompletableFuture<AdditionalDocumentCreateResponse> =
        create(id, AdditionalDocumentCreateParams.none())

    /** @see create */
    fun create(
        id: String,
        params: AdditionalDocumentCreateParams = AdditionalDocumentCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AdditionalDocumentCreateResponse> =
        create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(
        id: String,
        params: AdditionalDocumentCreateParams = AdditionalDocumentCreateParams.none(),
    ): CompletableFuture<AdditionalDocumentCreateResponse> =
        create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AdditionalDocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AdditionalDocumentCreateResponse>

    /** @see create */
    fun create(
        params: AdditionalDocumentCreateParams
    ): CompletableFuture<AdditionalDocumentCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AdditionalDocumentCreateResponse> =
        create(id, AdditionalDocumentCreateParams.none(), requestOptions)

    /** Returns a list of additional documents for a porting order. */
    fun list(id: String): CompletableFuture<AdditionalDocumentListResponse> =
        list(id, AdditionalDocumentListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: AdditionalDocumentListParams = AdditionalDocumentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AdditionalDocumentListResponse> =
        list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: AdditionalDocumentListParams = AdditionalDocumentListParams.none(),
    ): CompletableFuture<AdditionalDocumentListResponse> = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AdditionalDocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AdditionalDocumentListResponse>

    /** @see list */
    fun list(
        params: AdditionalDocumentListParams
    ): CompletableFuture<AdditionalDocumentListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AdditionalDocumentListResponse> =
        list(id, AdditionalDocumentListParams.none(), requestOptions)

    /** Deletes an additional document for a porting order. */
    fun delete(
        additionalDocumentId: String,
        params: AdditionalDocumentDeleteParams,
    ): CompletableFuture<Void?> = delete(additionalDocumentId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        additionalDocumentId: String,
        params: AdditionalDocumentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(
            params.toBuilder().additionalDocumentId(additionalDocumentId).build(),
            requestOptions,
        )

    /** @see delete */
    fun delete(params: AdditionalDocumentDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AdditionalDocumentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [AdditionalDocumentServiceAsync] that provides access to raw HTTP responses for
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
        ): AdditionalDocumentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /porting_orders/{id}/additional_documents`, but is
         * otherwise the same as [AdditionalDocumentServiceAsync.create].
         */
        fun create(
            id: String
        ): CompletableFuture<HttpResponseFor<AdditionalDocumentCreateResponse>> =
            create(id, AdditionalDocumentCreateParams.none())

        /** @see create */
        fun create(
            id: String,
            params: AdditionalDocumentCreateParams = AdditionalDocumentCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AdditionalDocumentCreateResponse>> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        fun create(
            id: String,
            params: AdditionalDocumentCreateParams = AdditionalDocumentCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<AdditionalDocumentCreateResponse>> =
            create(id, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AdditionalDocumentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AdditionalDocumentCreateResponse>>

        /** @see create */
        fun create(
            params: AdditionalDocumentCreateParams
        ): CompletableFuture<HttpResponseFor<AdditionalDocumentCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AdditionalDocumentCreateResponse>> =
            create(id, AdditionalDocumentCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /porting_orders/{id}/additional_documents`, but is
         * otherwise the same as [AdditionalDocumentServiceAsync.list].
         */
        fun list(id: String): CompletableFuture<HttpResponseFor<AdditionalDocumentListResponse>> =
            list(id, AdditionalDocumentListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: AdditionalDocumentListParams = AdditionalDocumentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AdditionalDocumentListResponse>> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: AdditionalDocumentListParams = AdditionalDocumentListParams.none(),
        ): CompletableFuture<HttpResponseFor<AdditionalDocumentListResponse>> =
            list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: AdditionalDocumentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AdditionalDocumentListResponse>>

        /** @see list */
        fun list(
            params: AdditionalDocumentListParams
        ): CompletableFuture<HttpResponseFor<AdditionalDocumentListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AdditionalDocumentListResponse>> =
            list(id, AdditionalDocumentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /porting_orders/{id}/additional_documents/{additional_document_id}`, but is otherwise the
         * same as [AdditionalDocumentServiceAsync.delete].
         */
        fun delete(
            additionalDocumentId: String,
            params: AdditionalDocumentDeleteParams,
        ): CompletableFuture<HttpResponse> =
            delete(additionalDocumentId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            additionalDocumentId: String,
            params: AdditionalDocumentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(
                params.toBuilder().additionalDocumentId(additionalDocumentId).build(),
                requestOptions,
            )

        /** @see delete */
        fun delete(params: AdditionalDocumentDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AdditionalDocumentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
