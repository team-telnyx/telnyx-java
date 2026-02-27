// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.legacy.reporting.batchdetailrecords

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.speechtotext.SpeechToTextCreateParams
import com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.speechtotext.SpeechToTextCreateResponse
import com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.speechtotext.SpeechToTextDeleteParams
import com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.speechtotext.SpeechToTextDeleteResponse
import com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.speechtotext.SpeechToTextListParams
import com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.speechtotext.SpeechToTextListResponse
import com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.speechtotext.SpeechToTextRetrieveParams
import com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.speechtotext.SpeechToTextRetrieveResponse
import java.util.function.Consumer

/** Speech to text batch detail records */
interface SpeechToTextService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpeechToTextService

    /** Creates a new Speech to Text batch report request with the specified filters */
    fun create(params: SpeechToTextCreateParams): SpeechToTextCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SpeechToTextCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SpeechToTextCreateResponse

    /** Retrieves a specific Speech to Text batch report request by ID */
    fun retrieve(id: String): SpeechToTextRetrieveResponse =
        retrieve(id, SpeechToTextRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SpeechToTextRetrieveParams = SpeechToTextRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SpeechToTextRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SpeechToTextRetrieveParams = SpeechToTextRetrieveParams.none(),
    ): SpeechToTextRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SpeechToTextRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SpeechToTextRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: SpeechToTextRetrieveParams): SpeechToTextRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): SpeechToTextRetrieveResponse =
        retrieve(id, SpeechToTextRetrieveParams.none(), requestOptions)

    /** Retrieves all Speech to Text batch report requests for the authenticated user */
    fun list(): SpeechToTextListResponse = list(SpeechToTextListParams.none())

    /** @see list */
    fun list(
        params: SpeechToTextListParams = SpeechToTextListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SpeechToTextListResponse

    /** @see list */
    fun list(
        params: SpeechToTextListParams = SpeechToTextListParams.none()
    ): SpeechToTextListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SpeechToTextListResponse =
        list(SpeechToTextListParams.none(), requestOptions)

    /** Deletes a specific Speech to Text batch report request by ID */
    fun delete(id: String): SpeechToTextDeleteResponse = delete(id, SpeechToTextDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SpeechToTextDeleteParams = SpeechToTextDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SpeechToTextDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: SpeechToTextDeleteParams = SpeechToTextDeleteParams.none(),
    ): SpeechToTextDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SpeechToTextDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SpeechToTextDeleteResponse

    /** @see delete */
    fun delete(params: SpeechToTextDeleteParams): SpeechToTextDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): SpeechToTextDeleteResponse =
        delete(id, SpeechToTextDeleteParams.none(), requestOptions)

    /**
     * A view of [SpeechToTextService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SpeechToTextService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /legacy/reporting/batch_detail_records/speech_to_text`, but is otherwise the same as
         * [SpeechToTextService.create].
         */
        @MustBeClosed
        fun create(params: SpeechToTextCreateParams): HttpResponseFor<SpeechToTextCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SpeechToTextCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SpeechToTextCreateResponse>

        /**
         * Returns a raw HTTP response for `get
         * /legacy/reporting/batch_detail_records/speech_to_text/{id}`, but is otherwise the same as
         * [SpeechToTextService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<SpeechToTextRetrieveResponse> =
            retrieve(id, SpeechToTextRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: SpeechToTextRetrieveParams = SpeechToTextRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SpeechToTextRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: SpeechToTextRetrieveParams = SpeechToTextRetrieveParams.none(),
        ): HttpResponseFor<SpeechToTextRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SpeechToTextRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SpeechToTextRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SpeechToTextRetrieveParams
        ): HttpResponseFor<SpeechToTextRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SpeechToTextRetrieveResponse> =
            retrieve(id, SpeechToTextRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /legacy/reporting/batch_detail_records/speech_to_text`, but is otherwise the same as
         * [SpeechToTextService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SpeechToTextListResponse> = list(SpeechToTextListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SpeechToTextListParams = SpeechToTextListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SpeechToTextListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SpeechToTextListParams = SpeechToTextListParams.none()
        ): HttpResponseFor<SpeechToTextListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SpeechToTextListResponse> =
            list(SpeechToTextListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /legacy/reporting/batch_detail_records/speech_to_text/{id}`, but is otherwise the same as
         * [SpeechToTextService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<SpeechToTextDeleteResponse> =
            delete(id, SpeechToTextDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SpeechToTextDeleteParams = SpeechToTextDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SpeechToTextDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SpeechToTextDeleteParams = SpeechToTextDeleteParams.none(),
        ): HttpResponseFor<SpeechToTextDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SpeechToTextDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SpeechToTextDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: SpeechToTextDeleteParams): HttpResponseFor<SpeechToTextDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SpeechToTextDeleteResponse> =
            delete(id, SpeechToTextDeleteParams.none(), requestOptions)
    }
}
