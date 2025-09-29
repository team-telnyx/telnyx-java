// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.legacy.reporting.batchdetailrecords

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.speechtotext.SpeechToTextCreateParams
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.speechtotext.SpeechToTextCreateResponse
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.speechtotext.SpeechToTextDeleteParams
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.speechtotext.SpeechToTextDeleteResponse
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.speechtotext.SpeechToTextListParams
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.speechtotext.SpeechToTextListResponse
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.speechtotext.SpeechToTextRetrieveParams
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.speechtotext.SpeechToTextRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SpeechToTextServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpeechToTextServiceAsync

    /** Creates a new Speech to Text batch report request with the specified filters */
    fun create(params: SpeechToTextCreateParams): CompletableFuture<SpeechToTextCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SpeechToTextCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SpeechToTextCreateResponse>

    /** Retrieves a specific Speech to Text batch report request by ID */
    fun retrieve(id: String): CompletableFuture<SpeechToTextRetrieveResponse> =
        retrieve(id, SpeechToTextRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SpeechToTextRetrieveParams = SpeechToTextRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SpeechToTextRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SpeechToTextRetrieveParams = SpeechToTextRetrieveParams.none(),
    ): CompletableFuture<SpeechToTextRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SpeechToTextRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SpeechToTextRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: SpeechToTextRetrieveParams
    ): CompletableFuture<SpeechToTextRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SpeechToTextRetrieveResponse> =
        retrieve(id, SpeechToTextRetrieveParams.none(), requestOptions)

    /** Retrieves all Speech to Text batch report requests for the authenticated user */
    fun list(): CompletableFuture<SpeechToTextListResponse> = list(SpeechToTextListParams.none())

    /** @see list */
    fun list(
        params: SpeechToTextListParams = SpeechToTextListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SpeechToTextListResponse>

    /** @see list */
    fun list(
        params: SpeechToTextListParams = SpeechToTextListParams.none()
    ): CompletableFuture<SpeechToTextListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SpeechToTextListResponse> =
        list(SpeechToTextListParams.none(), requestOptions)

    /** Deletes a specific Speech to Text batch report request by ID */
    fun delete(id: String): CompletableFuture<SpeechToTextDeleteResponse> =
        delete(id, SpeechToTextDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SpeechToTextDeleteParams = SpeechToTextDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SpeechToTextDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: SpeechToTextDeleteParams = SpeechToTextDeleteParams.none(),
    ): CompletableFuture<SpeechToTextDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SpeechToTextDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SpeechToTextDeleteResponse>

    /** @see delete */
    fun delete(params: SpeechToTextDeleteParams): CompletableFuture<SpeechToTextDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SpeechToTextDeleteResponse> =
        delete(id, SpeechToTextDeleteParams.none(), requestOptions)

    /**
     * A view of [SpeechToTextServiceAsync] that provides access to raw HTTP responses for each
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
        ): SpeechToTextServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /legacy/reporting/batch_detail_records/speech_to_text`, but is otherwise the same as
         * [SpeechToTextServiceAsync.create].
         */
        fun create(
            params: SpeechToTextCreateParams
        ): CompletableFuture<HttpResponseFor<SpeechToTextCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SpeechToTextCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SpeechToTextCreateResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /legacy/reporting/batch_detail_records/speech_to_text/{id}`, but is otherwise the same as
         * [SpeechToTextServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<SpeechToTextRetrieveResponse>> =
            retrieve(id, SpeechToTextRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: SpeechToTextRetrieveParams = SpeechToTextRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SpeechToTextRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: SpeechToTextRetrieveParams = SpeechToTextRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<SpeechToTextRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: SpeechToTextRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SpeechToTextRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: SpeechToTextRetrieveParams
        ): CompletableFuture<HttpResponseFor<SpeechToTextRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SpeechToTextRetrieveResponse>> =
            retrieve(id, SpeechToTextRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /legacy/reporting/batch_detail_records/speech_to_text`, but is otherwise the same as
         * [SpeechToTextServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SpeechToTextListResponse>> =
            list(SpeechToTextListParams.none())

        /** @see list */
        fun list(
            params: SpeechToTextListParams = SpeechToTextListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SpeechToTextListResponse>>

        /** @see list */
        fun list(
            params: SpeechToTextListParams = SpeechToTextListParams.none()
        ): CompletableFuture<HttpResponseFor<SpeechToTextListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SpeechToTextListResponse>> =
            list(SpeechToTextListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /legacy/reporting/batch_detail_records/speech_to_text/{id}`, but is otherwise the same as
         * [SpeechToTextServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<SpeechToTextDeleteResponse>> =
            delete(id, SpeechToTextDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: SpeechToTextDeleteParams = SpeechToTextDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SpeechToTextDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: SpeechToTextDeleteParams = SpeechToTextDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<SpeechToTextDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SpeechToTextDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SpeechToTextDeleteResponse>>

        /** @see delete */
        fun delete(
            params: SpeechToTextDeleteParams
        ): CompletableFuture<HttpResponseFor<SpeechToTextDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SpeechToTextDeleteResponse>> =
            delete(id, SpeechToTextDeleteParams.none(), requestOptions)
    }
}
