// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.phonenumbers

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.phonenumbers.csvdownloads.CsvDownloadCreateParams
import com.telnyx.sdk.models.phonenumbers.csvdownloads.CsvDownloadCreateResponse
import com.telnyx.sdk.models.phonenumbers.csvdownloads.CsvDownloadListParams
import com.telnyx.sdk.models.phonenumbers.csvdownloads.CsvDownloadListResponse
import com.telnyx.sdk.models.phonenumbers.csvdownloads.CsvDownloadRetrieveParams
import com.telnyx.sdk.models.phonenumbers.csvdownloads.CsvDownloadRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CsvDownloadServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CsvDownloadServiceAsync

    /** Create a CSV download */
    fun create(): CompletableFuture<CsvDownloadCreateResponse> =
        create(CsvDownloadCreateParams.none())

    /** @see create */
    fun create(
        params: CsvDownloadCreateParams = CsvDownloadCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CsvDownloadCreateResponse>

    /** @see create */
    fun create(
        params: CsvDownloadCreateParams = CsvDownloadCreateParams.none()
    ): CompletableFuture<CsvDownloadCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<CsvDownloadCreateResponse> =
        create(CsvDownloadCreateParams.none(), requestOptions)

    /** Retrieve a CSV download */
    fun retrieve(id: String): CompletableFuture<CsvDownloadRetrieveResponse> =
        retrieve(id, CsvDownloadRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CsvDownloadRetrieveParams = CsvDownloadRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CsvDownloadRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CsvDownloadRetrieveParams = CsvDownloadRetrieveParams.none(),
    ): CompletableFuture<CsvDownloadRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CsvDownloadRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CsvDownloadRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: CsvDownloadRetrieveParams
    ): CompletableFuture<CsvDownloadRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CsvDownloadRetrieveResponse> =
        retrieve(id, CsvDownloadRetrieveParams.none(), requestOptions)

    /** List CSV downloads */
    fun list(): CompletableFuture<CsvDownloadListResponse> = list(CsvDownloadListParams.none())

    /** @see list */
    fun list(
        params: CsvDownloadListParams = CsvDownloadListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CsvDownloadListResponse>

    /** @see list */
    fun list(
        params: CsvDownloadListParams = CsvDownloadListParams.none()
    ): CompletableFuture<CsvDownloadListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CsvDownloadListResponse> =
        list(CsvDownloadListParams.none(), requestOptions)

    /**
     * A view of [CsvDownloadServiceAsync] that provides access to raw HTTP responses for each
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
        ): CsvDownloadServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /phone_numbers/csv_downloads`, but is otherwise the
         * same as [CsvDownloadServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<CsvDownloadCreateResponse>> =
            create(CsvDownloadCreateParams.none())

        /** @see create */
        fun create(
            params: CsvDownloadCreateParams = CsvDownloadCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CsvDownloadCreateResponse>>

        /** @see create */
        fun create(
            params: CsvDownloadCreateParams = CsvDownloadCreateParams.none()
        ): CompletableFuture<HttpResponseFor<CsvDownloadCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CsvDownloadCreateResponse>> =
            create(CsvDownloadCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /phone_numbers/csv_downloads/{id}`, but is otherwise
         * the same as [CsvDownloadServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<CsvDownloadRetrieveResponse>> =
            retrieve(id, CsvDownloadRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CsvDownloadRetrieveParams = CsvDownloadRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CsvDownloadRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CsvDownloadRetrieveParams = CsvDownloadRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CsvDownloadRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CsvDownloadRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CsvDownloadRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: CsvDownloadRetrieveParams
        ): CompletableFuture<HttpResponseFor<CsvDownloadRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CsvDownloadRetrieveResponse>> =
            retrieve(id, CsvDownloadRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /phone_numbers/csv_downloads`, but is otherwise the
         * same as [CsvDownloadServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CsvDownloadListResponse>> =
            list(CsvDownloadListParams.none())

        /** @see list */
        fun list(
            params: CsvDownloadListParams = CsvDownloadListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CsvDownloadListResponse>>

        /** @see list */
        fun list(
            params: CsvDownloadListParams = CsvDownloadListParams.none()
        ): CompletableFuture<HttpResponseFor<CsvDownloadListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CsvDownloadListResponse>> =
            list(CsvDownloadListParams.none(), requestOptions)
    }
}
