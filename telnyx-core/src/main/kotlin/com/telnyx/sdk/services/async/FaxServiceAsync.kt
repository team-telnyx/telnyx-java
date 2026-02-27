// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.faxes.FaxCreateParams
import com.telnyx.sdk.models.faxes.FaxCreateResponse
import com.telnyx.sdk.models.faxes.FaxDeleteParams
import com.telnyx.sdk.models.faxes.FaxListPageAsync
import com.telnyx.sdk.models.faxes.FaxListParams
import com.telnyx.sdk.models.faxes.FaxRetrieveParams
import com.telnyx.sdk.models.faxes.FaxRetrieveResponse
import com.telnyx.sdk.services.async.faxes.ActionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Programmable fax command operations */
interface FaxServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FaxServiceAsync

    /** Programmable fax command operations */
    fun actions(): ActionServiceAsync

    /**
     * Send a fax. Files have size limits and page count limit validations. If a file is bigger than
     * 50MB or has more than 350 pages it will fail with `file_size_limit_exceeded` and
     * `page_count_limit_exceeded` respectively.
     *
     * **Expected Webhooks:**
     * - `fax.queued`
     * - `fax.media.processed`
     * - `fax.sending.started`
     * - `fax.delivered`
     * - `fax.failed`
     */
    fun create(params: FaxCreateParams): CompletableFuture<FaxCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FaxCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FaxCreateResponse>

    /** View a fax */
    fun retrieve(id: String): CompletableFuture<FaxRetrieveResponse> =
        retrieve(id, FaxRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: FaxRetrieveParams = FaxRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FaxRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: FaxRetrieveParams = FaxRetrieveParams.none(),
    ): CompletableFuture<FaxRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FaxRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FaxRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: FaxRetrieveParams): CompletableFuture<FaxRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FaxRetrieveResponse> =
        retrieve(id, FaxRetrieveParams.none(), requestOptions)

    /** View a list of faxes */
    fun list(): CompletableFuture<FaxListPageAsync> = list(FaxListParams.none())

    /** @see list */
    fun list(
        params: FaxListParams = FaxListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FaxListPageAsync>

    /** @see list */
    fun list(params: FaxListParams = FaxListParams.none()): CompletableFuture<FaxListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<FaxListPageAsync> =
        list(FaxListParams.none(), requestOptions)

    /** Delete a fax */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, FaxDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: FaxDeleteParams = FaxDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: FaxDeleteParams = FaxDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FaxDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: FaxDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, FaxDeleteParams.none(), requestOptions)

    /** A view of [FaxServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FaxServiceAsync.WithRawResponse

        /** Programmable fax command operations */
        fun actions(): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /faxes`, but is otherwise the same as
         * [FaxServiceAsync.create].
         */
        fun create(params: FaxCreateParams): CompletableFuture<HttpResponseFor<FaxCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: FaxCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FaxCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /faxes/{id}`, but is otherwise the same as
         * [FaxServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<FaxRetrieveResponse>> =
            retrieve(id, FaxRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: FaxRetrieveParams = FaxRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FaxRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: FaxRetrieveParams = FaxRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<FaxRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: FaxRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FaxRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: FaxRetrieveParams
        ): CompletableFuture<HttpResponseFor<FaxRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FaxRetrieveResponse>> =
            retrieve(id, FaxRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /faxes`, but is otherwise the same as
         * [FaxServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<FaxListPageAsync>> =
            list(FaxListParams.none())

        /** @see list */
        fun list(
            params: FaxListParams = FaxListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FaxListPageAsync>>

        /** @see list */
        fun list(
            params: FaxListParams = FaxListParams.none()
        ): CompletableFuture<HttpResponseFor<FaxListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<FaxListPageAsync>> =
            list(FaxListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /faxes/{id}`, but is otherwise the same as
         * [FaxServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> = delete(id, FaxDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: FaxDeleteParams = FaxDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: FaxDeleteParams = FaxDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: FaxDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: FaxDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, FaxDeleteParams.none(), requestOptions)
    }
}
