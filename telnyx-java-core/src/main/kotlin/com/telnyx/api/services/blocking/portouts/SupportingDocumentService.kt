// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.portouts

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.portouts.supportingdocuments.SupportingDocumentCreateParams
import com.telnyx.api.models.portouts.supportingdocuments.SupportingDocumentCreateResponse
import com.telnyx.api.models.portouts.supportingdocuments.SupportingDocumentListParams
import com.telnyx.api.models.portouts.supportingdocuments.SupportingDocumentListResponse
import java.util.function.Consumer

interface SupportingDocumentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SupportingDocumentService

    /** Creates a list of supporting documents on a portout request. */
    fun create(id: String): SupportingDocumentCreateResponse =
        create(id, SupportingDocumentCreateParams.none())

    /** @see create */
    fun create(
        id: String,
        params: SupportingDocumentCreateParams = SupportingDocumentCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SupportingDocumentCreateResponse = create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(
        id: String,
        params: SupportingDocumentCreateParams = SupportingDocumentCreateParams.none(),
    ): SupportingDocumentCreateResponse = create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SupportingDocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SupportingDocumentCreateResponse

    /** @see create */
    fun create(params: SupportingDocumentCreateParams): SupportingDocumentCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(id: String, requestOptions: RequestOptions): SupportingDocumentCreateResponse =
        create(id, SupportingDocumentCreateParams.none(), requestOptions)

    /** List every supporting documents for a portout request. */
    fun list(id: String): SupportingDocumentListResponse =
        list(id, SupportingDocumentListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: SupportingDocumentListParams = SupportingDocumentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SupportingDocumentListResponse = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: SupportingDocumentListParams = SupportingDocumentListParams.none(),
    ): SupportingDocumentListResponse = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SupportingDocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SupportingDocumentListResponse

    /** @see list */
    fun list(params: SupportingDocumentListParams): SupportingDocumentListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): SupportingDocumentListResponse =
        list(id, SupportingDocumentListParams.none(), requestOptions)

    /**
     * A view of [SupportingDocumentService] that provides access to raw HTTP responses for each
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
        ): SupportingDocumentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /portouts/{id}/supporting_documents`, but is
         * otherwise the same as [SupportingDocumentService.create].
         */
        @MustBeClosed
        fun create(id: String): HttpResponseFor<SupportingDocumentCreateResponse> =
            create(id, SupportingDocumentCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            id: String,
            params: SupportingDocumentCreateParams = SupportingDocumentCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SupportingDocumentCreateResponse> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            id: String,
            params: SupportingDocumentCreateParams = SupportingDocumentCreateParams.none(),
        ): HttpResponseFor<SupportingDocumentCreateResponse> =
            create(id, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SupportingDocumentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SupportingDocumentCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: SupportingDocumentCreateParams
        ): HttpResponseFor<SupportingDocumentCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SupportingDocumentCreateResponse> =
            create(id, SupportingDocumentCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /portouts/{id}/supporting_documents`, but is
         * otherwise the same as [SupportingDocumentService.list].
         */
        @MustBeClosed
        fun list(id: String): HttpResponseFor<SupportingDocumentListResponse> =
            list(id, SupportingDocumentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: SupportingDocumentListParams = SupportingDocumentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SupportingDocumentListResponse> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: SupportingDocumentListParams = SupportingDocumentListParams.none(),
        ): HttpResponseFor<SupportingDocumentListResponse> = list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SupportingDocumentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SupportingDocumentListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SupportingDocumentListParams
        ): HttpResponseFor<SupportingDocumentListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SupportingDocumentListResponse> =
            list(id, SupportingDocumentListParams.none(), requestOptions)
    }
}
