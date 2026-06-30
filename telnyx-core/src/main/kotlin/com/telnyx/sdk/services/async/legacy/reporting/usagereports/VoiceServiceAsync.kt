// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.legacy.reporting.usagereports

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.legacy.reporting.usagereports.voice.VoiceCreateParams
import com.telnyx.sdk.models.legacy.reporting.usagereports.voice.VoiceCreateResponse
import com.telnyx.sdk.models.legacy.reporting.usagereports.voice.VoiceDeleteParams
import com.telnyx.sdk.models.legacy.reporting.usagereports.voice.VoiceDeleteResponse
import com.telnyx.sdk.models.legacy.reporting.usagereports.voice.VoiceListPageAsync
import com.telnyx.sdk.models.legacy.reporting.usagereports.voice.VoiceListParams
import com.telnyx.sdk.models.legacy.reporting.usagereports.voice.VoiceRetrieveParams
import com.telnyx.sdk.models.legacy.reporting.usagereports.voice.VoiceRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Voice usage reports */
interface VoiceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VoiceServiceAsync

    /** Creates a new legacy usage V2 CDR report request with the specified filters */
    fun create(params: VoiceCreateParams): CompletableFuture<VoiceCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: VoiceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceCreateResponse>

    /** Fetch single cdr usage report by id. */
    fun retrieve(id: String): CompletableFuture<VoiceRetrieveResponse> =
        retrieve(id, VoiceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: VoiceRetrieveParams = VoiceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: VoiceRetrieveParams = VoiceRetrieveParams.none(),
    ): CompletableFuture<VoiceRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VoiceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: VoiceRetrieveParams): CompletableFuture<VoiceRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VoiceRetrieveResponse> =
        retrieve(id, VoiceRetrieveParams.none(), requestOptions)

    /** Fetch all previous requests for cdr usage reports. */
    fun list(): CompletableFuture<VoiceListPageAsync> = list(VoiceListParams.none())

    /** @see list */
    fun list(
        params: VoiceListParams = VoiceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceListPageAsync>

    /** @see list */
    fun list(
        params: VoiceListParams = VoiceListParams.none()
    ): CompletableFuture<VoiceListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<VoiceListPageAsync> =
        list(VoiceListParams.none(), requestOptions)

    /** Deletes a specific V2 legacy usage CDR report request by ID */
    fun delete(id: String): CompletableFuture<VoiceDeleteResponse> =
        delete(id, VoiceDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: VoiceDeleteParams = VoiceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: VoiceDeleteParams = VoiceDeleteParams.none(),
    ): CompletableFuture<VoiceDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: VoiceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceDeleteResponse>

    /** @see delete */
    fun delete(params: VoiceDeleteParams): CompletableFuture<VoiceDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<VoiceDeleteResponse> =
        delete(id, VoiceDeleteParams.none(), requestOptions)

    /** A view of [VoiceServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VoiceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /legacy/reporting/usage_reports/voice`, but is
         * otherwise the same as [VoiceServiceAsync.create].
         */
        fun create(
            params: VoiceCreateParams
        ): CompletableFuture<HttpResponseFor<VoiceCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: VoiceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /legacy/reporting/usage_reports/voice/{id}`, but is
         * otherwise the same as [VoiceServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<VoiceRetrieveResponse>> =
            retrieve(id, VoiceRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: VoiceRetrieveParams = VoiceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: VoiceRetrieveParams = VoiceRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<VoiceRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: VoiceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: VoiceRetrieveParams
        ): CompletableFuture<HttpResponseFor<VoiceRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VoiceRetrieveResponse>> =
            retrieve(id, VoiceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /legacy/reporting/usage_reports/voice`, but is
         * otherwise the same as [VoiceServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<VoiceListPageAsync>> =
            list(VoiceListParams.none())

        /** @see list */
        fun list(
            params: VoiceListParams = VoiceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceListPageAsync>>

        /** @see list */
        fun list(
            params: VoiceListParams = VoiceListParams.none()
        ): CompletableFuture<HttpResponseFor<VoiceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<VoiceListPageAsync>> =
            list(VoiceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /legacy/reporting/usage_reports/voice/{id}`, but
         * is otherwise the same as [VoiceServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<VoiceDeleteResponse>> =
            delete(id, VoiceDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: VoiceDeleteParams = VoiceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: VoiceDeleteParams = VoiceDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<VoiceDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: VoiceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceDeleteResponse>>

        /** @see delete */
        fun delete(
            params: VoiceDeleteParams
        ): CompletableFuture<HttpResponseFor<VoiceDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VoiceDeleteResponse>> =
            delete(id, VoiceDeleteParams.none(), requestOptions)
    }
}
