// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.phonenumbers

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.phonenumbers.csvdownloads.CsvDownloadCreateParams
import com.telnyx.api.models.phonenumbers.csvdownloads.CsvDownloadCreateResponse
import com.telnyx.api.models.phonenumbers.csvdownloads.CsvDownloadListParams
import com.telnyx.api.models.phonenumbers.csvdownloads.CsvDownloadListResponse
import com.telnyx.api.models.phonenumbers.csvdownloads.CsvDownloadRetrieveParams
import com.telnyx.api.models.phonenumbers.csvdownloads.CsvDownloadRetrieveResponse
import java.util.function.Consumer

interface CsvDownloadService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CsvDownloadService

    /** Create a CSV download */
    fun create(): CsvDownloadCreateResponse = create(CsvDownloadCreateParams.none())

    /** @see create */
    fun create(
        params: CsvDownloadCreateParams = CsvDownloadCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CsvDownloadCreateResponse

    /** @see create */
    fun create(
        params: CsvDownloadCreateParams = CsvDownloadCreateParams.none()
    ): CsvDownloadCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CsvDownloadCreateResponse =
        create(CsvDownloadCreateParams.none(), requestOptions)

    /** Retrieve a CSV download */
    fun retrieve(id: String): CsvDownloadRetrieveResponse =
        retrieve(id, CsvDownloadRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CsvDownloadRetrieveParams = CsvDownloadRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CsvDownloadRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CsvDownloadRetrieveParams = CsvDownloadRetrieveParams.none(),
    ): CsvDownloadRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CsvDownloadRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CsvDownloadRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: CsvDownloadRetrieveParams): CsvDownloadRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CsvDownloadRetrieveResponse =
        retrieve(id, CsvDownloadRetrieveParams.none(), requestOptions)

    /** List CSV downloads */
    fun list(): CsvDownloadListResponse = list(CsvDownloadListParams.none())

    /** @see list */
    fun list(
        params: CsvDownloadListParams = CsvDownloadListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CsvDownloadListResponse

    /** @see list */
    fun list(
        params: CsvDownloadListParams = CsvDownloadListParams.none()
    ): CsvDownloadListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CsvDownloadListResponse =
        list(CsvDownloadListParams.none(), requestOptions)

    /**
     * A view of [CsvDownloadService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CsvDownloadService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /phone_numbers/csv_downloads`, but is otherwise the
         * same as [CsvDownloadService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<CsvDownloadCreateResponse> =
            create(CsvDownloadCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CsvDownloadCreateParams = CsvDownloadCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CsvDownloadCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: CsvDownloadCreateParams = CsvDownloadCreateParams.none()
        ): HttpResponseFor<CsvDownloadCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<CsvDownloadCreateResponse> =
            create(CsvDownloadCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /phone_numbers/csv_downloads/{id}`, but is otherwise
         * the same as [CsvDownloadService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<CsvDownloadRetrieveResponse> =
            retrieve(id, CsvDownloadRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CsvDownloadRetrieveParams = CsvDownloadRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CsvDownloadRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CsvDownloadRetrieveParams = CsvDownloadRetrieveParams.none(),
        ): HttpResponseFor<CsvDownloadRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CsvDownloadRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CsvDownloadRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CsvDownloadRetrieveParams
        ): HttpResponseFor<CsvDownloadRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CsvDownloadRetrieveResponse> =
            retrieve(id, CsvDownloadRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /phone_numbers/csv_downloads`, but is otherwise the
         * same as [CsvDownloadService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CsvDownloadListResponse> = list(CsvDownloadListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CsvDownloadListParams = CsvDownloadListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CsvDownloadListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CsvDownloadListParams = CsvDownloadListParams.none()
        ): HttpResponseFor<CsvDownloadListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CsvDownloadListResponse> =
            list(CsvDownloadListParams.none(), requestOptions)
    }
}
