// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.portingorders

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.portingorders.additionaldocuments.AdditionalDocumentCreateParams
import com.telnyx.sdk.models.portingorders.additionaldocuments.AdditionalDocumentCreateResponse
import com.telnyx.sdk.models.portingorders.additionaldocuments.AdditionalDocumentDeleteParams
import com.telnyx.sdk.models.portingorders.additionaldocuments.AdditionalDocumentListPage
import com.telnyx.sdk.models.portingorders.additionaldocuments.AdditionalDocumentListParams
import java.util.function.Consumer

/** Endpoints related to porting orders management. */
interface AdditionalDocumentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AdditionalDocumentService

    /** Creates a list of additional documents for a porting order. */
    fun create(id: String): AdditionalDocumentCreateResponse =
        create(id, AdditionalDocumentCreateParams.none())

    /** @see create */
    fun create(
        id: String,
        params: AdditionalDocumentCreateParams = AdditionalDocumentCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AdditionalDocumentCreateResponse = create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(
        id: String,
        params: AdditionalDocumentCreateParams = AdditionalDocumentCreateParams.none(),
    ): AdditionalDocumentCreateResponse = create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AdditionalDocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AdditionalDocumentCreateResponse

    /** @see create */
    fun create(params: AdditionalDocumentCreateParams): AdditionalDocumentCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(id: String, requestOptions: RequestOptions): AdditionalDocumentCreateResponse =
        create(id, AdditionalDocumentCreateParams.none(), requestOptions)

    /** Returns a list of additional documents for a porting order. */
    fun list(id: String): AdditionalDocumentListPage = list(id, AdditionalDocumentListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: AdditionalDocumentListParams = AdditionalDocumentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AdditionalDocumentListPage = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: AdditionalDocumentListParams = AdditionalDocumentListParams.none(),
    ): AdditionalDocumentListPage = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AdditionalDocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AdditionalDocumentListPage

    /** @see list */
    fun list(params: AdditionalDocumentListParams): AdditionalDocumentListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): AdditionalDocumentListPage =
        list(id, AdditionalDocumentListParams.none(), requestOptions)

    /** Deletes an additional document for a porting order. */
    fun delete(additionalDocumentId: String, params: AdditionalDocumentDeleteParams) =
        delete(additionalDocumentId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        additionalDocumentId: String,
        params: AdditionalDocumentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        delete(
            params.toBuilder().additionalDocumentId(additionalDocumentId).build(),
            requestOptions,
        )

    /** @see delete */
    fun delete(params: AdditionalDocumentDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AdditionalDocumentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [AdditionalDocumentService] that provides access to raw HTTP responses for each
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
        ): AdditionalDocumentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /porting_orders/{id}/additional_documents`, but is
         * otherwise the same as [AdditionalDocumentService.create].
         */
        @MustBeClosed
        fun create(id: String): HttpResponseFor<AdditionalDocumentCreateResponse> =
            create(id, AdditionalDocumentCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            id: String,
            params: AdditionalDocumentCreateParams = AdditionalDocumentCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AdditionalDocumentCreateResponse> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            id: String,
            params: AdditionalDocumentCreateParams = AdditionalDocumentCreateParams.none(),
        ): HttpResponseFor<AdditionalDocumentCreateResponse> =
            create(id, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AdditionalDocumentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AdditionalDocumentCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: AdditionalDocumentCreateParams
        ): HttpResponseFor<AdditionalDocumentCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AdditionalDocumentCreateResponse> =
            create(id, AdditionalDocumentCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /porting_orders/{id}/additional_documents`, but is
         * otherwise the same as [AdditionalDocumentService.list].
         */
        @MustBeClosed
        fun list(id: String): HttpResponseFor<AdditionalDocumentListPage> =
            list(id, AdditionalDocumentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: AdditionalDocumentListParams = AdditionalDocumentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AdditionalDocumentListPage> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: AdditionalDocumentListParams = AdditionalDocumentListParams.none(),
        ): HttpResponseFor<AdditionalDocumentListPage> = list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AdditionalDocumentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AdditionalDocumentListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AdditionalDocumentListParams
        ): HttpResponseFor<AdditionalDocumentListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AdditionalDocumentListPage> =
            list(id, AdditionalDocumentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /porting_orders/{id}/additional_documents/{additional_document_id}`, but is otherwise the
         * same as [AdditionalDocumentService.delete].
         */
        @MustBeClosed
        fun delete(
            additionalDocumentId: String,
            params: AdditionalDocumentDeleteParams,
        ): HttpResponse = delete(additionalDocumentId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            additionalDocumentId: String,
            params: AdditionalDocumentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(
                params.toBuilder().additionalDocumentId(additionalDocumentId).build(),
                requestOptions,
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: AdditionalDocumentDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AdditionalDocumentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
