// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.otaupdates.OtaUpdateListPageAsync
import com.telnyx.sdk.models.otaupdates.OtaUpdateListParams
import com.telnyx.sdk.models.otaupdates.OtaUpdateRetrieveParams
import com.telnyx.sdk.models.otaupdates.OtaUpdateRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OtaUpdateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OtaUpdateServiceAsync

    /** This API returns the details of an Over the Air (OTA) update. */
    fun retrieve(id: String): CompletableFuture<OtaUpdateRetrieveResponse> =
        retrieve(id, OtaUpdateRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: OtaUpdateRetrieveParams = OtaUpdateRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OtaUpdateRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: OtaUpdateRetrieveParams = OtaUpdateRetrieveParams.none(),
    ): CompletableFuture<OtaUpdateRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: OtaUpdateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OtaUpdateRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: OtaUpdateRetrieveParams): CompletableFuture<OtaUpdateRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<OtaUpdateRetrieveResponse> =
        retrieve(id, OtaUpdateRetrieveParams.none(), requestOptions)

    /** List OTA updates */
    fun list(): CompletableFuture<OtaUpdateListPageAsync> = list(OtaUpdateListParams.none())

    /** @see list */
    fun list(
        params: OtaUpdateListParams = OtaUpdateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OtaUpdateListPageAsync>

    /** @see list */
    fun list(
        params: OtaUpdateListParams = OtaUpdateListParams.none()
    ): CompletableFuture<OtaUpdateListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<OtaUpdateListPageAsync> =
        list(OtaUpdateListParams.none(), requestOptions)

    /**
     * A view of [OtaUpdateServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OtaUpdateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ota_updates/{id}`, but is otherwise the same as
         * [OtaUpdateServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<OtaUpdateRetrieveResponse>> =
            retrieve(id, OtaUpdateRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: OtaUpdateRetrieveParams = OtaUpdateRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OtaUpdateRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: OtaUpdateRetrieveParams = OtaUpdateRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<OtaUpdateRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: OtaUpdateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OtaUpdateRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: OtaUpdateRetrieveParams
        ): CompletableFuture<HttpResponseFor<OtaUpdateRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OtaUpdateRetrieveResponse>> =
            retrieve(id, OtaUpdateRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ota_updates`, but is otherwise the same as
         * [OtaUpdateServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<OtaUpdateListPageAsync>> =
            list(OtaUpdateListParams.none())

        /** @see list */
        fun list(
            params: OtaUpdateListParams = OtaUpdateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OtaUpdateListPageAsync>>

        /** @see list */
        fun list(
            params: OtaUpdateListParams = OtaUpdateListParams.none()
        ): CompletableFuture<HttpResponseFor<OtaUpdateListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OtaUpdateListPageAsync>> =
            list(OtaUpdateListParams.none(), requestOptions)
    }
}
